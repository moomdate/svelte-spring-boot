package book.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.*;

@Entity // บอกว่าเป็น class entity class ที่เก็บขอมูล
@Data
public class Book {
    @Id // Annotations @Id บอกว่าเป็น Primary key
    @GeneratedValue // Annotations Generate id เอง ตอน insert
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