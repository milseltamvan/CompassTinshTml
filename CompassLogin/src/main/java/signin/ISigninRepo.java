package signin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISigninRepo extends JpaRepository<MDUUser, Long> {

	void saveMDUUser(MDUUser mduUser);

}
