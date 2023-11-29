package org.example.exception;

public class InsecureDeserializationException extends RuntimeException {

    public InsecureDeserializationException() {
    }

    public InsecureDeserializationException(String message) {
        super(message);
    }

    public InsecureDeserializationException(String message, Throwable cause) {
        super(message, cause);
    }

    public InsecureDeserializationException(Throwable cause) {
        super(cause);
    }

    public InsecureDeserializationException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}
