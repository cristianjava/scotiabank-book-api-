/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.api.book.application.handler.exception;

import com.api.book.domain.exception.ValueLengthException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ValueLengthExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ValueLengthException.class)
    public ResponseEntity<ErrorDetails> exception(ValueLengthException ex) {
        ErrorDetails errorModel = new ErrorDetails(ex.getState(), ex.getMessage());
        return new ResponseEntity(errorModel, HttpStatus.PRECONDITION_FAILED);
    }
}
