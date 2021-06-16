package tr.com.tandempartner.tandem.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import tr.com.tandempartner.tandem.entity.user.User;
import tr.com.tandempartner.tandem.entity.user.UserInfo;

public interface UserDAO  extends JpaRepository<User, Long>{

	Optional<User> findByEmail(String email);
	
	 
	@Query(value = "SELECT * FROM public.user WHERE ID NOT IN (select friends_id from public.user_friends where user_id= ?1 ) ", nativeQuery = true)
	List<User> getSuggestForUser(Long id);
	
	
}
