package com.api.book.infraestructure.adapter.entry.points.controller;

import com.api.book.infraestructure.adapter.dto.BookDTO;
import com.api.book.application.data.BookData;
import com.api.book.application.handler.BookHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class BookController {

    @Autowired
    private Environment environment;

    @Autowired
    private BookHandler bookHandler;

    @GetMapping("/book/{bookId}")
    public BookDTO findById(@PathVariable Long bookId) {
        BookDTO bookDTO = getBookHandler().findById(new BookData(bookId));
        bookDTO.setPort(Integer.parseInt(Objects.requireNonNull(environment
                .getProperty("local.server.port"))));
        return bookDTO;
    }

    @CrossOrigin
    @GetMapping("/books")
    public List<BookDTO> findAll() {
        return getBookHandler().findAll().stream().map(book -> {
            book.setPort(Integer.parseInt(Objects.requireNonNull(environment
                    .getProperty("local.server.port"))));
            return book;
        }).collect(Collectors.toList());
    }

    public BookHandler getBookHandler() {
        return bookHandler;
    }
}
