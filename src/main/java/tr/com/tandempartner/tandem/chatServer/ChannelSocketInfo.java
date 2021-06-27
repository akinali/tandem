package tr.com.tandempartner.tandem.chatServer;

import lombok.AllArgsConstructor;
import lombok.Data;
import tr.com.tandempartner.tandem.entity.user.UserInfo;

@Data
@AllArgsConstructor
public class ChannelSocketInfo {

	UserInfo userInfo1;
	
	String channelId;
	
	UserInfo userInfo2;

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChannelSocketInfo other = (ChannelSocketInfo) obj;
		if (channelId == null) {
			if (other.channelId != null)
				return false;
		} else if (!channelId.equals(other.channelId))
			return false;
		if (userInfo1 == null) {
			if (other.userInfo1 != null)
				return false;
		} else if (!userInfo1.equals(other.userInfo1))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((channelId == null) ? 0 : channelId.hashCode());
		result = prime * result + ((userInfo1 == null) ? 0 : userInfo1.hashCode());
		return result;
	}
	
	public boolean isEqualsChannelSocketChannelId(ChannelSocketInfo channel) {
		return !this.equals(channel) && (this.channelId.equals(channel.getChannelId()));
		
	}
	
	@Override
	public String toString() {
		return this.channelId + ":" + this.getUserInfo1().getEmail() +" want to talk with "+ this.getUserInfo2().getEmail();
	}
	
	
	
	
}
