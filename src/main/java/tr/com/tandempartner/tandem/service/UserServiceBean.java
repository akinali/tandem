package tr.com.tandempartner.tandem.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import tr.com.tandempartner.tandem.dao.UserDAO;
import tr.com.tandempartner.tandem.entity.user.User;
import tr.com.tandempartner.tandem.entity.user.UserInfo;

@Service
public class UserServiceBean implements UserService{

	UserDAO userDAO;
	
	
	public UserServiceBean(UserDAO userDAO) {
		super();
		this.userDAO = userDAO;
	}


	private static List<User> list;
	
	
	
	@Override
	public void add(User user) throws ExistUserEmailException {
		
	
		//user maili başka kullanılmış mı kontrol edecem 
		isUsedBeforeMailAddress(user.getEmail());
		this.userDAO.save(user);
	}


	private void isUsedBeforeMailAddress(String email) throws ExistUserEmailException {
		
		if(this.userDAO.findByEmail(email).isPresent())
			throw new ExistUserEmailException();
		
	}


	@Override
	public User getUserById(long id) {

	Optional<User> temp = this.userDAO.findById(id);
		
		return temp.get();
	}


	@Override
	public List<UserInfo> getSuggestionUsers(User user) {
		List<User> users  =  userDAO.getSuggestForUser(user.getId());
		
		List<UserInfo> userInfos = new ArrayList<UserInfo>();

		users.forEach(a ->{
			userInfos.add(a.getUserInfoWithoutFriends());
		});
		
		return userInfos;
		
		
		
	}


	@Override
	public void addFriend(User user, Long id) {
		User friend = this.userDAO.getOne(id);
		User me = this.userDAO.getOne(user.getId());
		if(me.getFriends()!=null) {
			me.getFriends().add(friend);
		}else
		{
			me.setFriends(new ArrayList<User>());
			me.getFriends().add(friend);
		}
		
		this.userDAO.save(me);
	
	}

}
