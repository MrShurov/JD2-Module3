import Lesson7.entities.Author;
import Lesson7.entities.Book;
import Lesson7.repository.AuthorRepository;
import Lesson7.repository.BookRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context.xml")
public class BookJpaTest {
    @Autowired
    BookRepository bookJpaRepository;
    @Autowired
    AuthorRepository authorRepository;

    @SuppressWarnings("Duplicates")
    @Before
    public void init() {
        authorRepository.save(new Author("Александр", "Пушкин"));
        bookJpaRepository.save(new Book(null,"Egor",1333,authorRepository.findBySurname("Пушкин")));
        bookJpaRepository.save(new Book(null,"Ego",1133,authorRepository.findBySurname("Пушкин")));
        bookJpaRepository.save(new Book(null,"Eor",333,authorRepository.findBySurname("Пушкин")));
        bookJpaRepository.save(new Book(null,"E2r",3433,authorRepository.findBySurname("Пушкин")));
        bookJpaRepository.save(new Book(null,"Egor",3433,authorRepository.findBySurname("Пушкин")));
    }

    @SuppressWarnings("Duplicates")
    @Test
	public void jpaRepositoryTest() {
        System.out.println(bookJpaRepository.existsById(1L));
        Book book = bookJpaRepository.findById(1L).orElseGet(null);
        System.out.println(book);
        book.setYear(1212);
        bookJpaRepository.save(book);
        System.out.println(book);
        Book newBook = bookJpaRepository.save(new Book(null, "Bos", 3,authorRepository.findBySurname("Пушкин")));
        bookJpaRepository.delete(newBook);
    }

    @Test
    public void queryMethodTest() {
        bookJpaRepository.findByName("Egor").forEach(System.out::println);
        bookJpaRepository.findBookByYearAfter(1233).forEach(System.out::println);

    }
}
