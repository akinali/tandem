package tr.com.tandempartner.tandem.service;



import tr.com.tandempartner.tandem.entity.user.User;


public interface UserService {

	void add(User user) throws ExistUserEmailException;
	
	User getUserById(long id);

}
