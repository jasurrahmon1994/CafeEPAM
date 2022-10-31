package uz.jasur.cafe.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.jasur.cafe.models.templates.AbsName;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
public class User extends AbsName {
    @Column(nullable = false, unique = true)
    private String phoneNumber;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private boolean enabled=true;
    private boolean accountNonLocked=true;
    private boolean accountNonExpired=true;
    private boolean credentialsNonExpired=true;

    @ManyToOne(optional = false)
    private Role role;

}
