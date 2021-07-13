package tr.com.tandempartner.tandem.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.com.tandempartner.tandem.auth.AuthService;
import tr.com.tandempartner.tandem.chat.ChatChannelForUsers;
import tr.com.tandempartner.tandem.chat.ChatChannelService;
import tr.com.tandempartner.tandem.constant.GeneralResponse;
import tr.com.tandempartner.tandem.entity.user.User;
import tr.com.tandempartner.tandem.entity.user.UserInfo;
import tr.com.tandempartner.tandem.service.ExistUserEmailException;
import tr.com.tandempartner.tandem.service.UserService;

@RestController
@RequestMapping(value="/api/v1")
public class ChatController {

	
	@Autowired
	UserService userService;
	
	@Autowired
	AuthService authService;
	
	@PostMapping("/channels/{id}")
	public GeneralResponse addChannelNew(@RequestHeader(name="Authorization") String token, @PathVariable(name="id") Long id) {
		
		
		try {
		User user1 = authService.getUserDetails(token);

		User user2 = userService.getUserById(id);
		
		ChatChannelService chs = new ChatChannelService();
		
		long channelId = chs.add(user1.getId(), user2.getId()).getId();
		
		return new GeneralResponse(true,"işlem başarılı",channelId);
		}catch(Exception e ) {
			return handleException(e);
		}
	}
	
	@GetMapping("/channels/{id}")
	public GeneralResponse getChannelRequest(@RequestHeader(name="Authorization") String token, @PathVariable(name="id") Long channelId) {
		
		
		try {
		User user1 = authService.getUserDetails(token);

		ChatChannelService chs = new ChatChannelService();
		
		ChatChannelForUsers channel = chs.getChannelById(channelId);
		
		
		return new GeneralResponse(channel!=null ?channel.isAvailableForChat():false,"işlem başarılı",channel);
		}catch(Exception e ) {
			return handleException(e);
		}
	}
	
	@DeleteMapping("/channels/{id}")
	public GeneralResponse deleteChannelWithToken(@RequestHeader(name="Authorization") String token, @PathVariable(name="id") Long channelId) {
		
		
		try {
		User user1 = authService.getUserDetails(token);

		ChatChannelService chs = new ChatChannelService();
		
		ChatChannelForUsers channel = chs.getChannelById(channelId);
		channel.cleanUserInfo(user1);
		
		return new GeneralResponse(channel!=null ?channel.isAvailableForChat():false,"işlem başarılı",channel);
		}catch(Exception e ) {
			return handleException(e);
		}
	}
	
	@GetMapping("/channel")
	public GeneralResponse getChannelRequest(@RequestHeader(name="Authorization") String token) {
		
		
		try {
		User user1 = authService.getUserDetails(token);

		ChatChannelService chs = new ChatChannelService();
		
		List<ChatChannelForUsers> channelList = chs.getChatRequestByUserID(user1.getId());
		
		
		return new GeneralResponse(true,"işlem başarılı",channelList);
		}catch(Exception e ) {
			return handleException(e);
		}
	}

private GeneralResponse handleException(Exception e) {
	e.printStackTrace();
	GeneralResponse rs = new GeneralResponse(false, null);
	if(e instanceof ExistUserEmailException) {
		rs.setMessage(e.getMessage());
	}
	return rs;
}
	
}
