package book.Repositorys;

import book.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin(origins = {"http://localhost:5000", "http://localhost:5555"})
public interface BookRepository extends JpaRepository<Book, Long> {

	Book findByName(String Name);
    
}