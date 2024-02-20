package addParty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddPartyService {

	@Autowired
	IAddPartyRepo iAddPartyRepo;
	
	public void Adduserservice(long id,
		    long faxnumber,
		    String forename,
		    String homeemail,
		    String lastname,
		    long mobilenumber,
		    String officemail,
		    long officephone,
		    long phonenumber,
		    String title
			) {
		
		iAddPartyRepo.savePartyWithCustomQuery(id,faxnumber, forename,homeemail, lastname,  mobilenumber,officemail, officephone   ,phonenumber,title);
		 
	}

}
