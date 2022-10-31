package uz.jasur.cafe.dao.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jasur.cafe.models.User;

import java.util.UUID;

public interface UserRepo extends JpaRepository<User, UUID> {
}
