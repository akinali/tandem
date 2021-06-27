package tr.com.tandempartner.tandem.chatServer;

import java.io.*;
import java.net.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

import tr.com.tandempartner.tandem.entity.user.UserInfo;
import tr.com.tandempartner.tandem.service.UserService;

/**
 * This thread handles connection for each connected client, so the server
 * can handle multiple clients at the same time.
 *
 * @author www.codejava.net
 */
public class UserThread extends Thread {
	private Socket socket;
	private ChatServer server;
	private PrintWriter writer;
	@Autowired
	private UserService service;
	
	private ChannelSocketInfo channelSocketInfoForUser; 

	public UserThread(Socket socket, ChatServer server) {
		this.socket = socket;
		this.server = server;
	}

	public void run() {
		try {
			InputStream input = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			OutputStream output = socket.getOutputStream();
			writer = new PrintWriter(output, true);

			printUsers();
			String info = reader.readLine();

			//channelID_id1_id2_token;
			String channelId = info.split("_")[0];
			String userId1 = info.split("_")[1];
			String userId2 = info.split("_")[2];
			String token = info.split("_")[3];

			
			UserInfo user1 = service.getUserById(Long.valueOf(userId1)).getUserInfoWithoutFriends();
			
			UserInfo user2 = service.getUserById(Long.valueOf(userId2)).getUserInfoWithoutFriends();

			ChannelSocketInfo channelSocketInfo = new ChannelSocketInfo(user1, channelId, user2);
			channelSocketInfoForUser= channelSocketInfo;
			
			String userName= user1.getEmail();
			server.addChannelSocketInfo(channelSocketInfo);

			String serverMessage = "New user connected: " + user1.getEmail();
			server.broadcast(serverMessage, this);

			String clientMessage;

			do {
				clientMessage = reader.readLine();
				serverMessage = "[" + userName + "]: " + clientMessage;
				server.broadcast(serverMessage, this);

			} while (!clientMessage.equals("bye"));

			server.removeChannelSocketInfo(channelSocketInfo, this);
			socket.close();

			serverMessage = userName + " has quitted.";
			server.broadcast(serverMessage, this);

		} catch (IOException ex) {
			System.out.println("Error in UserThread: " + ex.getMessage());
			ex.printStackTrace();
		}
	}

	/**
	 * Sends a list of online users to the newly connected user.
	 */
	void printUsers() {
		if (server.hasChannelInfos()) {
			writer.println("Connected users: " + server.getChannelList());
		} else {
			writer.println("No other users connected");
		}
	}

	/**
	 * Sends a message to the client.
	 */
	void sendMessage(String message) {
		writer.println(message);
	}

	public ChannelSocketInfo getChannelSocketInfoForUser() {
		return channelSocketInfoForUser;
	}

	public void setChannelSocketInfoForUser(ChannelSocketInfo channelSocketInfoForUser) {
		this.channelSocketInfoForUser = channelSocketInfoForUser;
	}
	
	
}