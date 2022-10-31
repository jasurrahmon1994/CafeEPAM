package uz.jasur.cafe.dao.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jasur.cafe.models.Meal;
import uz.jasur.cafe.models.User;

import java.util.UUID;

public interface MealRepo extends JpaRepository<Meal, UUID> {
}
