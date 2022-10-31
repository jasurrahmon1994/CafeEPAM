package uz.jasur.cafe.dao.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jasur.cafe.models.Transaction;

import java.util.UUID;

public interface TransactionRepo extends JpaRepository<Transaction, UUID> {
}
