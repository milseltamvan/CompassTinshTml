package addParty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;
@Entity
@Table(name = "add_party")  // Specify the table name explicitly
public class AddParty {

    @Id
    @Column(name = "id", columnDefinition = "BIGINT NOT NULL")
    private long id;

    @Column(name = "title", columnDefinition = "VARCHAR(255)")
    @OrderColumn
    private String title;

    @Column(name = "Forename", columnDefinition = "VARCHAR(255)")
    private String forename;

    @Column(name = "Lastname", columnDefinition = "VARCHAR(255)")
    private String lastname;

    @Column(name = "Phonenumber", columnDefinition = "BIGINT")
    private long phonenumber;

    @Column(name = "Mobilenumber", columnDefinition = "BIGINT")
    private long mobilenumber;

    @Column(name = "Officephone", columnDefinition = "BIGINT")
    private long officephone;

    @Column(name = "Faxnumber", columnDefinition = "BIGINT")
    private long faxnumber;

    @Column(name = "Homeemail", columnDefinition = "VARCHAR(255)")
    private String homeemail;

    @Column(name = "Officemail", columnDefinition = "VARCHAR(255)")
    private String officemail;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public long getOfficephone() {
		return officephone;
	}

	public void setOfficephone(long officephone) {
		this.officephone = officephone;
	}

	public long getFaxnumber() {
		return faxnumber;
	}

	public void setFaxnumber(long faxnumber) {
		this.faxnumber = faxnumber;
	}

	public String getHomeemail() {
		return homeemail;
	}

	public void setHomeemail(String homeemail) {
		this.homeemail = homeemail;
	}

	public String getOfficemail() {
		return officemail;
	}

	public void setOfficemail(String officemail) {
		this.officemail = officemail;
	}
   
}