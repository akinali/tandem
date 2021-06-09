package tr.com.tandempartner.tandem.contoller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tr.com.tandempartner.tandem.constant.GeneralResponse;
import tr.com.tandempartner.tandem.entity.user.User;
import tr.com.tandempartner.tandem.service.ExistUserEmailException;
import tr.com.tandempartner.tandem.service.UserService;

 
public class UserContoller {

	
	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public GeneralResponse addUser(@RequestBody User user) {
	
		try {	
			userService.add(user);
			return new GeneralResponse(true,"işlem başarılı");
		}catch(Exception e ) {
			return handleException(e);
		}
	}
	
	private GeneralResponse handleException(Exception e) {
		GeneralResponse rs = new GeneralResponse(false, null);
		if(e instanceof ExistUserEmailException) {
			rs.setMessage(e.getMessage());
		}
		return rs;
	}

	@GetMapping("/user")
	public GeneralResponse getUser(@RequestParam(name="id") Long id) {
		
		
		System.out.println(id);
		
		User user = userService.getUserById(id);
		GeneralResponse rs =new GeneralResponse(true,"işlem başarılı", user);
		//id ile servisten kişi alınacak ve general response a setlenecek....
		return rs;
	}
}
