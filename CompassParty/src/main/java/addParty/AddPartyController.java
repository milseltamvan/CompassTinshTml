package addParty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddPartyController {

    @Autowired
	
    AddPartyService addPartyService;
    

    @PostMapping("/addparty")  
    public String Adduser(@RequestBody AddParty addparty) {
    	
    	addPartyService.Adduserservice(addparty.getId(),addparty.getFaxnumber(),addparty.getForename(),addparty.getHomeemail(),addparty.getLastname(),addparty.getMobilenumber(),
        		addparty.getOfficemail(),addparty.getOfficephone(),addparty.getPhonenumber(),addparty.getTitle()
        		
    			);
    	return "sucess";
    }
    
}


