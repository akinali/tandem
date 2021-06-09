package tr.com.tandempartner.tandem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tr.com.tandempartner.tandem.entity.user.User;

public interface UserDAO  extends JpaRepository<User, Long>{

	List<User> findByEmail(String email);
	
	
}
