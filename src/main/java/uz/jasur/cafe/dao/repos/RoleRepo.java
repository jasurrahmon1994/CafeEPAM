package uz.jasur.cafe.dao.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jasur.cafe.models.Role;

import java.util.UUID;

public interface RoleRepo extends JpaRepository<Role, UUID> {
}
