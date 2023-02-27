/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.api.book.application.factory;

import com.api.book.application.data.BookData;
import com.api.book.domain.model.book.BookModel;
import org.springframework.stereotype.Service;

@Service
public class BookFactory {

  public BookModel create(final BookData data) {
    return new BookModel(data.getBookId());
  }
}
