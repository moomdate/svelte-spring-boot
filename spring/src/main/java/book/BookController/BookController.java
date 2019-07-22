package book.BookController;

import book.Entity.Book;
import book.Repositorys.BookRepository;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:5000", "http://localhost:5555"})
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;
  
    @GetMapping(value = "all")
    public List<Book> getBooks() {
        return this.bookRepository.findAll(); //.findAll().stream().collect(Collectors.toList());
    }
    @PostMapping(value = "/addbook")
    public Book load(@RequestBody final Book book){
        bookRepository.save(book);
        return  this.bookRepository.findByName(book.getName());
    }
    @GetMapping(value="/del/{id}")
    public String deleteBook(@PathVariable long id){
         this.bookRepository.deleteById(id);
         return "redirect:/product";
    }
} 