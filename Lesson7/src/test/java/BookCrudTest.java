import Lesson7.entities.Author;
import Lesson7.entities.Book;
import Lesson7.repository.AuthorCrudRepository;
import Lesson7.repository.BookCrudRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/context.xml")
public class BookCrudTest {
    @Autowired
    BookCrudRepository bookCrudRepository;
    @Autowired
    AuthorCrudRepository authorCrudRepository;

    @SuppressWarnings("Duplicates")
    @Before
    public void init(){
        authorCrudRepository.save(new Author("Александр", "Пушкин"));
        bookCrudRepository.save(new Book(null,"Egor",1333,authorCrudRepository.findBySurname("Пушкин")));
        bookCrudRepository.save(new Book(null,"Ego",1133,authorCrudRepository.findBySurname("Пушкин")));
        bookCrudRepository.save(new Book(null,"Eor",333,authorCrudRepository.findBySurname("Пушкин")));
        bookCrudRepository.save(new Book(null,"E2r",3433,authorCrudRepository.findBySurname("Пушкин")));
        bookCrudRepository.save(new Book(null,"Egor",3433,authorCrudRepository.findBySurname("Пушкин")));
    }

    @Test
    public void queryMethodTest() {
        bookCrudRepository.findByName("Egor").forEach(System.out::println);
        bookCrudRepository.findBookByYearAfter(1233).forEach(System.out::println);

    }

    @SuppressWarnings("Duplicates")
    @Test
	public void crudRepositoryTest() {
        System.out.println(bookCrudRepository.existsById(1L));
        Book book = bookCrudRepository.findById(1L).orElseGet(null);
        System.out.println(book);
        book.setYear(1212);
        bookCrudRepository.save(book);
        System.out.println(book);
        Book newBook = bookCrudRepository.save(new Book(null, "Bos", 3,authorCrudRepository.findBySurname("Пушкин")));
        bookCrudRepository.delete(newBook);
    }
}
