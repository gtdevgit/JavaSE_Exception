package com.training.exception;

public class WrongLoginException extends Exception{

    public WrongLoginException() {
        super("Wrong login");
    }
}
