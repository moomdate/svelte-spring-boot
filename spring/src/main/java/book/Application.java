package book;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import book.Repositorys.BookRepository;
import book.Entity.Book;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    ApplicationRunner init(BookRepository bookRepository){
		return  args ->{ 
            Book books = new Book();
            books.setName("โคตรมหาเทพเกรียนหัวเขียว");
            bookRepository.save(books);
		};
    }
}