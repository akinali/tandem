package tr.com.tandempartner.tandem.chatServer;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.Set;

public class WebSocketImpl extends WebSocketServer {

	private static int TCP_PORT = 4444;
	private static String CLOSED_CON = "CLOSED_ME_BYE";

	private Set<Channel> channels;

	public WebSocketImpl() {
		super(new InetSocketAddress(TCP_PORT));
		channels = new HashSet<>();
	}

	@Override
	public void onOpen(WebSocket conn, ClientHandshake handshake) {

		System.out.println("New connection from " + conn.getRemoteSocketAddress().getAddress().getHostAddress());
	}

	@Override
	public void onClose(WebSocket conn, int code, String reason, boolean remote) {
		Channel channel = findConnectionChannel(conn);
		if (channel != null)
			channel.remove(conn);
		System.out.println("Closed connection to " + conn.getRemoteSocketAddress().getAddress().getHostAddress());
	}

	@Override
	public void onMessage(WebSocket conn, String message) {
		System.out.println("Message from client: " + message);
		String[] parts = message.split("__-__");
		for (int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}
		if (parts.length > 3) {
			Channel oldChannel = findChannelById(Integer.valueOf(parts[0]));
			if (oldChannel == null) {
				Channel newChannel = new Channel(Integer.valueOf(parts[0]));
				newChannel.addUser(parts[1], conn);
				channels.add(newChannel);
			} else {
				oldChannel.addUser(parts[1], conn);
			}

		} else {
			if (message.equals(CLOSED_CON)) {
				Channel channel = findConnectionChannel(conn);
				message = "Kullanıcı çıkış yaptıı..";

				channel.sendAll(message, conn);

				channel.remove(conn);

			} else {
				Channel channel = findConnectionChannel(conn);
				if (channel != null)
					channel.sendAll(message, conn);
			}

		}

	}

	private Channel findConnectionChannel(WebSocket conn) {
		for (Channel channel : channels) {
			if (channel.hasConnection(conn))
				return channel;
		}
		return null;
	}

	private Channel findChannelById(int Id) {
		for (Channel channel : channels) {
			if (channel.getChannelId() == Id)
				return channel;
		}
		return null;
	}

	@Override
	public void onError(WebSocket conn, Exception ex) {
		// ex.printStackTrace();
		Channel channel = findConnectionChannel(conn);
		if (channel != null)
			channel.remove(conn);
		// do some thing if required

		System.out.println("ERROR from " + conn.getRemoteSocketAddress().getAddress().getHostAddress());
	}
}
