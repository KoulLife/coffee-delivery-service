package ToMist.SchoolCoffee.repository;

import ToMist.SchoolCoffee.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByUsername();
  User findByPhone();
}
