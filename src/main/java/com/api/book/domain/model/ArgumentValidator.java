/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.api.book.domain.model;

import com.api.book.application.handler.exception.CommonState;
import com.api.book.domain.exception.ValueLengthException;
import com.api.book.domain.exception.ValueRequiredException;

public class ArgumentValidator {

  private ArgumentValidator() {}

  public static void validateLength(final String valor, final int length, final String message) {
    if (valor.length() < length) {
      throw new ValueLengthException(message, CommonState.RECIPIENT_MUST_BE_REQUIRED.getCode());
    }
  }

  public static Boolean isNullOrEmpty(final String value) {
    return null == value || value.isBlank();
  }

  public static void validateRequired(final Object value, final String message) {
    if (value == null || value.toString().isEmpty()) {
      throw new ValueRequiredException(message, CommonState.VALUE_MUST_BE_REQUIRED.getCode());
    }
  }

  public static void validateRequired(final Object value, final String message, final String code) {
    if (value == null || value.toString().isEmpty()) {
      throw new ValueRequiredException(message, code);
    }
  }
}
