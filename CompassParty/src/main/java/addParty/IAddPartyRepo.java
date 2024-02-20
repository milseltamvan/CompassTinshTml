package addParty;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;



public interface IAddPartyRepo extends JpaRepository<AddParty, Integer> {

    @Transactional
    @Modifying
    @Query("INSERT INTO AddParty (id, faxnumber, forename, homeemail, lastname, mobilenumber, officemail, officephone, phonenumber, title) " +
            "VALUES (:id, :faxnumber, :forename, :homeemail, :lastname, :mobilenumber, :officemail, :officephone, :phonenumber, :title)")
    
    void savePartyWithCustomQuery(
            @Param("id") long id,
            @Param("faxnumber") long faxnumber,
            @Param("forename") String forename,
            @Param("homeemail") String homeemail,
            @Param("lastname") String lastname,
            @Param("mobilenumber") long mobilenumber,
            @Param("officemail") String officemail,
            @Param("officephone") long officephone,
            @Param("phonenumber") long phonenumber,
            @Param("title") String title
    );

}
