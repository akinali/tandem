package tr.com.tandempartner.tandem.chat;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatChannelForUsers {

		
	private Long id;
	
	private Long user1_id;
	
	private Long user2_id;
	
	private boolean user1_accept;
	
	private boolean user2_accept;

	
	
	public boolean isExist(long id1,long id2) {
		return (id1==user1_id && id2==user2_id) || (id2==user1_id && id1==user2_id);
	}
	
	public void setAcceptForUser(long id) {
		if(id==user1_id) {
			user1_accept=true;
		}
		else if(id==user2_id) {
			user2_accept=true;
		}
	}
	
	
	public boolean isExistForUser2NotAccepted(long id) {
		return (id==user2_id  && !user2_accept);
		
		
	}
}
