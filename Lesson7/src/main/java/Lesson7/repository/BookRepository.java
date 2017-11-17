package Lesson7.repository;

import Lesson7.entities.Author;
import Lesson7.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("select distinct(b) from Book b join b.author a where a.id = 1")
    List<Book> getByJoinCondition();
    @Query("select b from Book b join b.author a where a.surname = :surname")
    List<Book> getByAuthorSurname(@Param("surname") String surname);

    @Query(value = " select b.* from Book b" +
            " left join Author a on b.author_id = a.id" +
            " where a.name = ?1", nativeQuery = true)
    List<Book> getByJoinConditionNative(String name);

    List<Book> findByName(String name);
    List<Book> findBookByYearAfter(Integer integer);
}
