package com.workintech.fruits.fswebs18d2.exception;


import lombok.Getter;
import org.springframework.http.HttpStatus;
@Getter
public class ErrorException extends RuntimeException{
    private HttpStatus httpStatus;

    public ErrorException(String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
    }
}
