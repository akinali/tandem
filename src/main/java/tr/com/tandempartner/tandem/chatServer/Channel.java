package tr.com.tandempartner.tandem.chatServer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

import org.java_websocket.WebSocket;

public class Channel {

	private int channelId=-1;
	
	private List<UserSocket> users =  new ArrayList<UserSocket>();

	public List<UserSocket> getUsers() {
		return users;
	}

	public void addUser(String username, WebSocket socket) {
		this.users.add(new UserSocket(username,socket));
	}

	public int getChannelId() {
		return channelId;
	}

	@Override
	public int hashCode() {
		return Objects.hash(channelId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Channel other = (Channel) obj;
		return channelId == other.channelId;
	}

	public Channel(int channelId) {
		super();
		this.channelId = channelId;
	}
	
	public void sendAll(String message,WebSocket conn) {
		users.forEach(e ->{
			if(e.getSocket().hashCode()!=conn.hashCode())
				e.getSocket().send(message);

		});
	}

	public boolean hasConnection(WebSocket conn) {
		for(UserSocket user : users) {
			if(user.getSocket().hashCode() == conn.hashCode())
				return true;
		}
		return false;
		
	}
	
	public UserSocket getUser(WebSocket conn) {
		for(UserSocket user : users) {
			if(user.getSocket().hashCode() == conn.hashCode())
				return user;
		}
		return null;
		
	}

	public void remove(WebSocket conn) {
		UserSocket user = getUser(conn);
		if(user!=null) {
			users.remove(user);
		}
		
	}

	public boolean hasUser(String username) {
		for(UserSocket user : users) {
			if(user.getUsername().equals(username))
				return true;
		}
		return false;
	}
	
	
	

}
