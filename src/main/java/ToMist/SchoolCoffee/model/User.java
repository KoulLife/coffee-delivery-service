package ToMist.SchoolCoffee.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "user_id")
  private long id;

  @Column(name = "username", unique = true)
  @NotEmpty(message = "username을 적어주세요.")
  @Length(min = 3, message = "3글자 이상 적어주세요.")
  private String username;

  @Column(name = "password")
  @NotEmpty(message = "비밀번호를 적어주세요.")
  @Length(min = 3, message = "3글자 이상 적어주세요.")
  private String password;

  @Column(name = "phone", unique = true)
  @NotEmpty(message = "전화번호를 적어주세요")
  private String phone;

  @ManyToMany(cascade = CascadeType.MERGE)
  @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
  private List<Role> roles;
}
