package tr.com.tandempartner.tandem.service;



import java.util.List;

import tr.com.tandempartner.tandem.entity.user.User;
import tr.com.tandempartner.tandem.entity.user.UserInfo;


public interface UserService {

	void add(User user) throws ExistUserEmailException;
	
	User getUserById(long id);

	List<UserInfo> getSuggestionUsers(User user);

	void addFriend(User user, Long id);

}
