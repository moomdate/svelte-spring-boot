package book.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity 
@Data
public class Book {
    @Id 
    @GeneratedValue 
    private Long id;
    private String name;
    /*void setBookName(String name){
        this.bookName = name;
    }
    private long getId(){
        return this.id;
    }
    private String getBookName(){
        return this.bookName;
    }*/
	
}