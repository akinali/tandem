package tr.com.tandempartner.tandem.auth;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.UNAUTHORIZED)
public class LoginAuthException extends RuntimeException {

}
