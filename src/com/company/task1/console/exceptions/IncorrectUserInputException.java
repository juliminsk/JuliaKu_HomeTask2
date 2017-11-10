package com.company.task1.console.exceptions;

public class IncorrectUserInputException extends Exception {

    public IncorrectUserInputException() {
    }

    public IncorrectUserInputException(String message) {
        super(message);
    }

    public IncorrectUserInputException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectUserInputException(Throwable cause) {
        super(cause);
    }

    public IncorrectUserInputException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
