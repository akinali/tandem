package tr.com.tandempartner.tandem.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tr.com.tandempartner.tandem.constant.GeneralResponse;
import tr.com.tandempartner.tandem.entity.user.User;

@RestController
public class UserContoller {

	
	@PostMapping("/users")
	public GeneralResponse addUser(@RequestBody User user) {
		//
		return new GeneralResponse(true,"işlem başarılı", null);
	}
	
	@GetMapping("/user")
	public GeneralResponse getUser(@RequestParam(name="id") Long id) {
		
		//id ile servisten kişi alınacak ve general response a setlenecek....
		return new GeneralResponse(true,"işlem başarılı", null);
	}
}
