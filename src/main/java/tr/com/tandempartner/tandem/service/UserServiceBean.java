package tr.com.tandempartner.tandem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import tr.com.tandempartner.tandem.dao.UserDAO;
import tr.com.tandempartner.tandem.entity.user.User;

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
		
		if(this.userDAO.findByEmail(email)!=null  &&  this.userDAO.findByEmail(email).size()!=0)
			throw new ExistUserEmailException();
		
	}


	@Override
	public User getUserById(long id) {

	Optional<User> temp = this.userDAO.findById(id);
		
		return temp.get();
	}

}
