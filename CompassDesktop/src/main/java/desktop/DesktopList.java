package desktop;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Desktoplist")
public class DesktopList {
	@Id
    private Long id;
	
	@Column(name = "ActionPanal")
	private String ActionPanal;

	@Column(name = "NavigationPanal")
	private String NavigationPanal;
	
	@Column(name = "NavigationPanalSubData")
	private String NavigationPanalSubData;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getActionPanal() {
		return ActionPanal;
	}

	public void setActionPanal(String actionPanal) {
		ActionPanal = actionPanal;
	}

	public String getNavigationPanal() {
		return NavigationPanal;
	}

	public void setNavigationPanal(String navigationPanal) {
		NavigationPanal = navigationPanal;
	}

	public String getNavigationPanalSubData() {
		return NavigationPanalSubData;
	}

	public void setNavigationPanalSubData(String navigationPanalSubData) {
		NavigationPanalSubData = navigationPanalSubData;
	}
	
}
