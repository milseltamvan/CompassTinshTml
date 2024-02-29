package login;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import addParty.AddParty;

@RestController
public class LoginController {
	@Autowired
	CompassLoginService LoginService;
	@Autowired
	ServiceConfiguration ServiceConfig;

    private final RestTemplate restTemplate;

    @Autowired
    public LoginController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
	
	@CrossOrigin(origins = "http://localhost:3000")
	@PostMapping("/login")
    public Login getUserById(@RequestParam("username") String username, @RequestParam("password") String password) {
		System.out.println(username+" = "+password);

	    Login log = LoginService.findByUsernameAndPassword(username,password);
//	    String byUsername = LoginService.findByUsername(username);
	    if(log==null) {
	    	return null; 
	    }
        return log ;
    }

	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/desktop")
	public List Desktop() {
		List Desktop = ServiceConfig.getRestTemplate().getForObject("http://localhost:8081/desktoplist",List.class);
		return Desktop;
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/ActionPanal")
	public List findActionPanalByDesktopListName() {
		
		List findActionPanalByDesktopListName = ServiceConfig.getRestTemplate().getForObject("http://localhost:8081/ActionPanal",List.class);
		return findActionPanalByDesktopListName;
		
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/NavigationPanal")
	public List findNavigationPanalByDesktopListName() {
		
		List findNavigationPanalByDesktopListName = ServiceConfig.getRestTemplate().getForObject("http://localhost:8081/NavigationPanal",List.class);
		return findNavigationPanalByDesktopListName;
		
	}
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping("/NavigationPanalList")
	public List findNavigationPanalListByDesktopListName() {
		
		List findNavigationPanalListByDesktopListName = ServiceConfig.getRestTemplate().getForObject("http://localhost:8081/NavigationPanalList",List.class);		
		return findNavigationPanalListByDesktopListName;
		
	}
	@CrossOrigin(origins = {"http://localhost:3000"})
	@PostMapping("/addparty")
	public String addPartyDetails(@RequestBody AddParty addparty) throws URISyntaxException {
        final String PartyURL="http://localhost:8082/addparty"; 
		HttpHeaders headers = new HttpHeaders();
        RequestEntity<AddParty> requestEntity = RequestEntity.post(new URI(PartyURL)).headers(headers).body(addparty);
        restTemplate.exchange(requestEntity, Void.class);
        return "Party Created";
	}}
 