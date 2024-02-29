package signin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SigninController {
	@Autowired
	SigninService signinService;
	
	@PostMapping("/signin")
	public void setNewUser(MDUUser mduUser) {
		signinService.setNewUser(mduUser);
		
	}

}
