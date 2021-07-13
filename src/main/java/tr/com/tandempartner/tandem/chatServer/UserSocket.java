package tr.com.tandempartner.tandem.chatServer;

import org.java_websocket.WebSocket;

public class UserSocket {

	
	private String username;
	
	private WebSocket socket;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public WebSocket getSocket() {
		return socket;
	}

	public void setSocket(WebSocket socket) {
		this.socket = socket;
	}

	public UserSocket(String username, WebSocket socket) {
		super();
		this.username = username;
		this.socket = socket;
	}
	
	
	
}
