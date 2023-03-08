package com.example.onetoonepk;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "book_detail")
@Data
public class BookDetail implements Serializable {

    @Id
    @OneToOne
    @JoinColumn(name = "book_id")
    private Book book;

    @Column(name = "number_of_pages")
    private Integer numberOfPages;

    public BookDetail() {
    }

    public BookDetail(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}