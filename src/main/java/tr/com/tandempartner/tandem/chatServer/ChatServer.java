package tr.com.tandempartner.tandem.chatServer;

import java.io.*;
import java.net.*;
import java.util.*;

/**
 * This is the chat server program.
 * Press Ctrl + C to terminate the program.
 *
 * @author www.codejava.net
 */
public class ChatServer {
	private int port;
	private Set<ChannelSocketInfo> channelSocketInfos = new HashSet<ChannelSocketInfo>();
	private Set<UserThread> userThreads = new HashSet<>();

	public ChatServer(int port) {
		this.port = port;
		
	}

	public void execute() {
		try (ServerSocket serverSocket = new ServerSocket(port)) {

			System.out.println("Chat Server is listening on port " + port);

			while (true) {
				Socket socket = serverSocket.accept();
				System.out.println("New user connected");

				UserThread newUser = new UserThread(socket, this);
				userThreads.add(newUser);
				newUser.start();

			}

		} catch (IOException ex) {
			System.out.println("Error in the server: " + ex.getMessage());
			ex.printStackTrace();
		}
	}



	/**
	 * Delivers a message from one user to others (broadcasting)
	 */
	void broadcast(String message, UserThread excludeUser) {
		for (UserThread userThread : userThreads) {
			if (excludeUser.getChannelSocketInfoForUser().isEqualsChannelSocketChannelId(userThread.getChannelSocketInfoForUser())) {
				userThread.sendMessage(message);
			}
		}
	}

	/**
	 * Stores username of the newly connected client.
	 */
	void addChannelSocketInfo(ChannelSocketInfo info) {
		channelSocketInfos.add(info);
	}

	/**
	 * When a client is disconneted, removes the associated username and UserThread
	 */
	void removeChannelSocketInfo(ChannelSocketInfo info, UserThread aUser) {
		boolean removed = channelSocketInfos.remove(info);
		if (removed) {
			userThreads.remove(aUser);
			System.out.println("The user " + info.getUserInfo1().getEmail() + " quitted");
		}
	}

	public Set<ChannelSocketInfo> getChannelList(){
		return channelSocketInfos;
	}

	/**
	 * Returns true if there are other users connected (not count the currently connected user)
	 */
	boolean hasChannelInfos() {
		return !this.channelSocketInfos.isEmpty();
	}
}