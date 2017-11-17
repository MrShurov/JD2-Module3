package Lesson7.repository;

import Lesson7.entities.Author;
import Lesson7.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    Author findBySurname(String surname);
}
