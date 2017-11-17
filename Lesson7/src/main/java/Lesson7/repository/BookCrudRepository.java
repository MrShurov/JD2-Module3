package Lesson7.repository;

import Lesson7.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookCrudRepository extends CrudRepository<Book, Long> {
    List<Book> findByName(String name);
    List<Book> findBookByYearAfter(Integer integer);
}
