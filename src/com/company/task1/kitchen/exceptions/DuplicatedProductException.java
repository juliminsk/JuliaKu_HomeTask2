package com.company.task1.kitchen.exceptions;

public class DuplicatedProductException extends Exception {
    public DuplicatedProductException() {
    }

    public DuplicatedProductException(String message) {
        super(message);
    }

    public DuplicatedProductException(String message, Throwable cause) {
        super(message, cause);
    }

    public DuplicatedProductException(Throwable cause) {
        super(cause);
    }

    public DuplicatedProductException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
