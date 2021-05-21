package tr.com.tandempartner.tandem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tr.com.tandempartner.tandem.dao.UserDAO;
import tr.com.tandempartner.tandem.entity.user.User;


@Component
public class UserServiceBean implements UserService{

	
	@Autowired 
	UserDAO userDAO;
	
	
	private static List<User> list;
	
	static {
		list = new ArrayList<User>();
	}
	
	@Override
	public void add(User user) {
		list.add(user);
		
	}


	@Override
	public User getUserById(long id) {

		for (User user : list) {
			if(user.getId()==id) {
				return user;
			}
		}
		
		return null;
	}

}
