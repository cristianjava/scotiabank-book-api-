package com.api.book.application.handler;

import com.api.book.application.data.BookData;
import com.api.book.application.factory.BookFactory;
import com.api.book.domain.model.book.BookModel;
import com.api.book.domain.service.BookService;
import com.api.book.infraestructure.adapter.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookHandler {

    @Autowired
    private BookFactory bookFactory;
    @Autowired
    private BookService bookService;

    @Transactional(readOnly = true)
    public BookDTO findById (BookData bookData) {
        BookModel bookModel = getBookFactory().create(bookData);
        return getBookService().findById(bookModel.getBookId());
    }

    @Transactional(readOnly = true)
    public List<BookDTO> findAll () {
        return getBookService().findAll();
    }

    private BookFactory getBookFactory() {
        return bookFactory;
    }

    private BookService getBookService() {
        return bookService;
    }
}
