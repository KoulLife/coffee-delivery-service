package ToMist.SchoolCoffee.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class UserTest {
  public static List<Role> roles = new ArrayList<>();
  public static Role role1 = new Role(1,RoleType.USER);
  public static Role role2 = new Role(2,RoleType.OWNER);

  @Test
  @DisplayName("User에 Role이 잘 들어오는지 확인")
  void user_with_role(){
    roles.add(role1);
    roles.add(role2);
    User user = new User(1, "dongik", "1234", "010", roles);
    System.out.println("user: " + user);
  }
}