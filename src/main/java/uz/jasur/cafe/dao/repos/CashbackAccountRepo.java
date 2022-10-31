package uz.jasur.cafe.dao.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jasur.cafe.models.CashbackAccount;
import uz.jasur.cafe.models.LoyaltyAccount;

import java.util.UUID;

public interface CashbackAccountRepo extends JpaRepository<CashbackAccount, UUID> {
}
