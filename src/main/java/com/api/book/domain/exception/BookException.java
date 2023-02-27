/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.api.book.domain.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

/** The type Book exception. */
@ResponseStatus(value = HttpStatus.PRECONDITION_FAILED)
public class BookException extends RuntimeException {

  @Serial
  private static final long serialVersionUID = 1L;

  private final transient String state;

  public BookException(final String message, final String state) {
    super(message);
    this.state = state;
  }

  public String getState() {
    return state;
  }
}
