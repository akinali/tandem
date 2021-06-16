package tr.com.tandempartner.tandem.auth;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class LoginAuthException extends RuntimeException {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Kullanıcı Adı veya şifresi hatalıdır..";
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Kullanıcı Adı veya şifresi hatalıdır";
	}


	
	

}
