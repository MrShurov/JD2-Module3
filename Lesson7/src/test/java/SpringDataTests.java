import Lesson7.entities.Author;
import Lesson7.entities.Book;
import Lesson7.repository.AuthorRepository;
import Lesson7.repository.BookPagingRepository;
import Lesson7.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context.xml")
public class SpringDataTests {
    @Autowired
    AuthorRepository authorRepository;
    @Autowired
    BookRepository bookRepository;
    @Autowired
    BookPagingRepository bookPagingRepository;

    @Before
    public void init() {
        authorRepository.save(new Author("Александр", "Пушкин"));
        authorRepository.save(new Author("Николай", "Гоголь"));
        bookRepository.save(new Book(null, "Мёртвые души", 1842, authorRepository.findBySurname("Гоголь")));
        bookRepository.save(new Book(null, "Тарас Бульба", 1835, authorRepository.findBySurname("Гоголь")));
        bookRepository.save(new Book(null, "Шинель", 1842, authorRepository.findBySurname("Гоголь")));
        bookRepository.save(new Book(null, "Капитанская дочка", 1836, authorRepository.findBySurname("Пушкин")));
        bookRepository.save(new Book(null, "Пиковая дама", 1834, authorRepository.findBySurname("Пушкин")));
        bookRepository.save(new Book(null, "Руслан и Людмила", null, authorRepository.findBySurname("Пушкин")));
    }

    @Test
    public void queryTest() {
        bookRepository.getByJoinCondition().forEach(System.out::println);
    }

    @Test
    public void queryParamTest() {
        bookRepository.getByAuthorSurname("Гоголь").forEach(System.out::println);
    }

    @Test
    public void nativeQueryTest() {
        bookRepository.getByJoinConditionNative("Александр").forEach(System.out::println);
    }

    @Test
    public void pageableTest() {
        List<Long> ids = Stream.of(2L, 3L, 4L).collect(Collectors.toList());
        Page<Book> bookPage = bookPagingRepository
                .findByAuthorIdIn(ids, PageRequest.of(1, 3, Sort.Direction.DESC, "year"));
        bookPage.getContent().forEach(System.out::println);
        bookPage = bookPagingRepository
                .findAll(PageRequest.of(0, 2, Sort.Direction.DESC, "year"));
        bookPage.getContent().forEach(System.out::println);
        bookPage = bookPagingRepository
                .findById(2L, PageRequest.of(0, 2, Sort.Direction.DESC, "year"));
        bookPage.getContent().forEach(System.out::println);

        bookPagingRepository.findAll(new Sort(Sort.Direction.DESC, "author.name")).forEach(System.out::println);
    }

    @Test
    public void findByExampleTest() {
        System.out.println(bookRepository.findOne(Example.of(new Book(null, "Тарас Бульба", null, null))));
        List<Book> books = bookRepository.findAll(
                Example.of(new Book(null, null, 1842, null), ExampleMatcher.matching()
                        .withIgnoreCase()
                        .withStringMatcher(ExampleMatcher.StringMatcher.ENDING)));
        books.forEach(System.out::print);
    }
}
