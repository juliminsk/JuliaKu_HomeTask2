package com.company.task1.kitchen.exceptions;

public class NotEnoughProductsInFridgeException extends Exception {
    public NotEnoughProductsInFridgeException() {
    }

    public NotEnoughProductsInFridgeException(String message) {
        super(message);
    }

    public NotEnoughProductsInFridgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotEnoughProductsInFridgeException(Throwable cause) {
        super(cause);
    }

    public NotEnoughProductsInFridgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
