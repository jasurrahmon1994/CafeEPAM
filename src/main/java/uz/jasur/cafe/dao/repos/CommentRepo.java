package uz.jasur.cafe.dao.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jasur.cafe.models.Comment;

import java.util.UUID;

public interface CommentRepo extends JpaRepository<Comment, UUID> {
}
