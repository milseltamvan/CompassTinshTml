package desktop;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesktopController {
	@Autowired
	DesktopService desktopService;
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(path="/desktoplist")
	public List<Desktop> DesktopList() {
		return desktopService.findAll();
	} 

	
	@GetMapping(path="/ActionPanal")
	public List<String> findActionPanalByDesktopListName() {
		List<String> ActionPanal =desktopService.findActionPanalByDesktopListName().stream().distinct().toList();
		return ActionPanal;
	}
	
	@GetMapping(path="/NavigationPanal")
    public List<String> findNavigationPanalByDesktopListName() {
		List<String> NavigationPanal = desktopService.findNavigationPanalByDesktopListName().stream().distinct().toList();
		return NavigationPanal;
    }
	
	@GetMapping(path="/NavigationPanalList")
    public List<String> findNavigationPanalListByDesktopListName() {
		List<String> NavigationPanalList = desktopService.findNavigationPanalListByDesktopListName().stream().distinct().toList();
		return NavigationPanalList;
    }
//    @CrossOrigin(origins = "http://localhost:3000")
//    @GetMapping(path = "/{desktopListId}")
//    public Desktop getDesktopByDesktopListId(@PathVariable Long desktopListId) {
//        return desktopService.findByDesktopListId(desktopListId);
//    }
}