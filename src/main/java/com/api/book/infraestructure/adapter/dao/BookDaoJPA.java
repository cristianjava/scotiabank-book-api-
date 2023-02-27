package com.api.book.infraestructure.adapter.dao;

import com.api.book.infraestructure.adapter.dto.BookDTO;
import org.springframework.data.repository.CrudRepository;

public interface BookDaoJPA extends CrudRepository<BookDTO, Long> {

}
