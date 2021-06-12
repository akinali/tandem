package tr.com.tandempartner.tandem.auth;

import lombok.Data;
import tr.com.tandempartner.tandem.constant.GeneralResponse;

@Data
public class LoginResponse extends GeneralResponse {

	private String token;
	
	
	
	public LoginResponse(boolean isSuccessfull, String message,String token,Object data) {
		super(isSuccessfull, message,data);
		this.token=token;
	}

}
