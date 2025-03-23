package com.example.hungry.exception;

public class HungryException extends RuntimeException {
    private final int code;

    public HungryException(int code, String message) {
        super(message);
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
