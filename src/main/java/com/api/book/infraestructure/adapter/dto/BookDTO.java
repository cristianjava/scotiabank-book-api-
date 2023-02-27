package com.api.book.infraestructure.adapter.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class BookDTO {

    @Id
    private Long id;
    private String tittle;
    private String author;

    @Transient
    private Integer port;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
