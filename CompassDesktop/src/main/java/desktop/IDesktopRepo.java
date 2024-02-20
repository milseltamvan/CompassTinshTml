package desktop;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IDesktopRepo  extends JpaRepository<Desktop,Long>{
	
    @Query("SELECT ActionPanal FROM DesktopList where ActionPanal is not null")
    List<String> findActionPanalByDesktopListName();
    @Query("SELECT NavigationPanal FROM DesktopList where NavigationPanal is not null")
    List<String> findNavigationPanalByDesktopListName();
    @Query("SELECT NavigationPanalSubData FROM DesktopList where NavigationPanalSubData is not null")
    List<String> findNavigationPanalListByDesktopListName();
}