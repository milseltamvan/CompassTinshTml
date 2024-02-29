package signin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SigninService {
	@Autowired
	ISigninRepo iSigninRepo;

	public void setNewUser(MDUUser mduUser) {
		iSigninRepo.saveMDUUser(mduUser);
		
	}

}
