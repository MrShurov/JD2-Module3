package Lesson7.repository;

import Lesson7.entities.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BookPagingRepository extends PagingAndSortingRepository<Book, Long> {
    Page<Book> findByAuthorIdIn(List<Long> ids, Pageable pageable);
    Page<Book> findById(Long id, Pageable pageable);
}
