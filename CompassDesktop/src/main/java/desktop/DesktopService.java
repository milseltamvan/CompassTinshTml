package desktop;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DesktopService {
	@Autowired
	IDesktopRepo desktop;
	
	public List<Desktop> findAll() {
        return  desktop.findAll();
    }
    
    public List<String> findActionPanalByDesktopListName() {
        return desktop.findActionPanalByDesktopListName();
    }
    
    public List<String> findNavigationPanalByDesktopListName() {
        return desktop.findNavigationPanalByDesktopListName();
    }
    public List<String> findNavigationPanalListByDesktopListName() {
        return desktop.findNavigationPanalListByDesktopListName();
    }
}
