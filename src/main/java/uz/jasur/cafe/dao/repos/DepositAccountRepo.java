package uz.jasur.cafe.dao.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jasur.cafe.models.DepositAccount;
import uz.jasur.cafe.models.LoyaltyAccount;

import java.util.UUID;

public interface DepositAccountRepo extends JpaRepository<DepositAccount, UUID> {
}
