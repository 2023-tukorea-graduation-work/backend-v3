package server.stutino.domain.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.stutino.domain.question.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long>, QuestionQueryRepository {
}