package desktop;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Desktop {
	@Id
    private Long id;

    @Column(name = "DesktopList")
    private String desktopList;


    public Desktop() {
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesktopList() {
        return desktopList;
    }

    public void setDesktopList(String desktopList) {
        this.desktopList = desktopList;
    }
 
    public Desktop(Long id, String desktopList) {
        this.id = id;
        this.desktopList = desktopList;
    }

	
}
