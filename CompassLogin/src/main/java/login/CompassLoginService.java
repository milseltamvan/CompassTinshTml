package login;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Service
public class CompassLoginService {

	@Autowired
	ILoginRepo login;
	
	public Login findByUsernameAndPassword(String username, String password) {

        return login.findByUsernameAndPassword(username, password);
    }
}