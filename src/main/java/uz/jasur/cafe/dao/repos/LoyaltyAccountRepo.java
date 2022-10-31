package uz.jasur.cafe.dao.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jasur.cafe.models.LoyaltyAccount;
import uz.jasur.cafe.models.User;

import java.util.UUID;

public interface LoyaltyAccountRepo extends JpaRepository<LoyaltyAccount, UUID> {
}
