package tr.com.tandempartner.tandem.chat;


import lombok.AllArgsConstructor;
import lombok.Data;
import tr.com.tandempartner.tandem.entity.user.User;

@Data
@AllArgsConstructor
public class ChatChannelForUsers {

		
	private Long id;
	
	private Long user1_id;
	
	private Long user2_id;
	
	private boolean user1_accept;
	
	private boolean user2_accept;

	
	
	public boolean isExist(long id1,long id2) {
		return (user1_id!=null &&(id1==user1_id || id2==user1_id)) || (user2_id!=null && (id2==user2_id || id1==user2_id));
	}
	
	public void setAcceptForUser(long id) {
		if(user1_id!=null && id==user1_id) {
			user1_accept=true;
		}
		else if( user2_id!=null && id==user2_id) {
			user2_accept=true;
		}
	}
	
	
	public boolean isExistForUser2NotAccepted(long id) {
		return (user2_id!=null && id==user2_id  && !user2_accept);
		
		
	}
	
	public boolean isAvailableForChat() {
		return user1_accept && user2_accept;
		
		
	}

	public void cleanUserInfo(User user) {
		if(user1_id!=null && user.getId()==user1_id) {
			user1_id=null;
		}
		else if(user2_id!=null && user.getId()==user2_id) {
			user2_id=null;
		}		
	}
}
