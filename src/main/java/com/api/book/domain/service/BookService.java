package com.api.book.domain.service;

import com.api.book.infraestructure.adapter.dao.BookDaoJPA;
import com.api.book.infraestructure.adapter.dto.BookDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookDaoJPA bookDaoJPA;

    private BookDaoJPA getBookDaoJPA() {
        return bookDaoJPA;
    }

    @Transactional(readOnly = true)
    public BookDTO findById(Long id) {
        return getBookDaoJPA().findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public List<BookDTO> findAll() {
        return (List<BookDTO>) getBookDaoJPA().findAll();
    }

}
