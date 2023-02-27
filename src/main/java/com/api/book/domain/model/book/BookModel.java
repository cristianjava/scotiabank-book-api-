package com.api.book.domain.model.book;

import static com.api.book.application.handler.exception.CommonState.RECIPIENT_MUST_BE_REQUIRED;
import static com.api.book.domain.model.ArgumentValidator.validateRequired;

public class BookModel {

    private final Long bookId;

    public BookModel(Long bookId) {
        validateRequired(
                bookId,
                RECIPIENT_MUST_BE_REQUIRED.getMessage(),
                RECIPIENT_MUST_BE_REQUIRED.getCode());
        this.bookId = bookId;
    }

    public Long getBookId() {
        return bookId;
    }
}
