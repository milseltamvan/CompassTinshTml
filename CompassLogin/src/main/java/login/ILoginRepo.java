package login;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ILoginRepo  extends JpaRepository<Login,Long> {
	Login findByUsernameAndPassword(String username, String password);
}
