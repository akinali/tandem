package tr.com.tandempartner.tandem.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.com.tandempartner.tandem.constant.GeneralResponse;

@RestController
@RequestMapping(value="/api/v1")
public class AuthController {
	
	@Autowired
	AuthService authService;
	
	@PostMapping("/login")
	GeneralResponse handleLogin(@RequestBody Credentials credentials) {
		
		return authService.authenticate(credentials);
		
	}
	
	@PostMapping("/logout")
	GeneralResponse handleLogin(@RequestHeader(name = "Authorization") String authorization) {
		
		authService.clearToken(authorization);

		return new GeneralResponse(true,"Uygulamadan çıkış yaptınız.");
	}

}
