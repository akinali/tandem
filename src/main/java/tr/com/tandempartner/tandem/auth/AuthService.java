package tr.com.tandempartner.tandem.auth;

import java.util.UUID;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import tr.com.tandempartner.tandem.dao.UserDAO;
import tr.com.tandempartner.tandem.entity.user.User;

@Service
public class AuthService {

	private UserDAO userRepository;
	
	
	private TokenRepository tokenRepository;
	
	public AuthService(UserDAO userRepository,  TokenRepository tokenRepository) {
		super();
		this.userRepository = userRepository;
		this.tokenRepository = tokenRepository;
	}

	public LoginResponse authenticate(Credentials credentials) {
		User user = this.userRepository.findByEmail(credentials.getEmail()).get();
		boolean userNotFoundinDB=user==null;
		if(userNotFoundinDB) {
			throw new LoginAuthException();
		}
		//password check
		boolean passwordNotMatch = !credentials.getPassword().equals(user.getPassword());
		if(passwordNotMatch) {
			throw new LoginAuthException();
		}
		
		String token = generateRandomToken();
		Token tokenObj = new Token();
		tokenObj.setToken(token);
		tokenObj.setUser(user);
		tokenRepository.save(tokenObj);
		LoginResponse loginResponse = 
				new LoginResponse(true, 
						"Uygulamaya Giriş Başarılı bir şekilde tamamlandı",
						token, user);
		

		
		
		return loginResponse;
	}

	public void clearToken(String authorization) {
		this.tokenRepository.deleteById(authorization);
		
	}

	public User getUserDetails(String token) {
		Optional<Token> optionalToken = tokenRepository.findById(token);
		if(!optionalToken.isPresent()) {
			return null;
		}
		return optionalToken.get().getUser();

	}
	
	public String generateRandomToken() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	
}
