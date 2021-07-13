package tr.com.tandempartner.tandem.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatChannelService {

	private final static List<ChatChannelForUsers> channels = new ArrayList<ChatChannelForUsers>();
	
	public ChatChannelForUsers add(long userid1,long userid2) {
		boolean existChatForChannel = isExistChannel(userid1,userid2);
		
		if(!existChatForChannel) {
		
		ChatChannelForUsers chat = new ChatChannelForUsers((long)(channels.size()+1), userid1, userid2, true, false);
		channels.add(chat);
		return chat;
		}
		else {
			ChatChannelForUsers chatChannelExist = getChatByUserID(userid1,userid2);
			chatChannelExist.setAcceptForUser(userid1);
			return chatChannelExist;
		}
	}
	
	public ChatChannelForUsers getChatByUserID(long id1,long id2) {
		for (ChatChannelForUsers chatChannelForUsers : channels) {
			if(chatChannelForUsers.isExist(id1, id2)) {
				return chatChannelForUsers;
			}
		}
		return null;
	}
	
	
	public List<ChatChannelForUsers> getChatRequestByUserID(long id) {
		List<ChatChannelForUsers> tempList = new ArrayList<ChatChannelForUsers>();
		for (ChatChannelForUsers chatChannelForUsers : channels) {
			if(chatChannelForUsers.isExistForUser2NotAccepted(id)) {
				tempList.add(chatChannelForUsers);
			}
		}
		return tempList;
	}
	public boolean isExistChannel(long id1,long id2) {
		for (ChatChannelForUsers chatChannelForUsers : channels) {
			if(chatChannelForUsers.isExist(id1, id2)) {
				return true;
			}
		}
		return false;
	}
	
	public void removeInList(ChatChannelForUsers obj) {
		this.channels.remove(obj);
	}

	public ChatChannelForUsers getChannelById(Long channelId) {
		for (ChatChannelForUsers chatChannelForUsers : channels) {
			if(chatChannelForUsers.getId()==channelId) {
				return chatChannelForUsers;
			}
		}		return null;
	}
}
