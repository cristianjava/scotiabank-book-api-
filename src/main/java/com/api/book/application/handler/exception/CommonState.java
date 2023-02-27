/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.api.book.application.handler.exception;

public enum CommonState {
  RECIPIENT_MUST_BE_REQUIRED("01", "RECIPIENT MUST BE ENTERED"),
  VALUE_MUST_BE_REQUIRED("02", "VALUE MUST BE REQUIRED");

  private final String code;
  private final String message;

  CommonState(final String code, final String message) {
    this.code = code;
    this.message = message;
  }

  public String getCode() {
    return code;
  }

  public String getMessage() {
    return message;
  }
}
