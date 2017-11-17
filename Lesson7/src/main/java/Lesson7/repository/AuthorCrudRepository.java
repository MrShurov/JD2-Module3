package Lesson7.repository;

import Lesson7.entities.Author;
import Lesson7.entities.Book;
import org.springframework.data.repository.CrudRepository;

public interface AuthorCrudRepository extends CrudRepository<Author, Long>{
    Author findBySurname(String surname);
}
