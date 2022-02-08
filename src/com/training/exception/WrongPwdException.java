package com.training.exception;

public class WrongPwdException extends Exception{
    public WrongPwdException() {
        super("Wrong password");
    }
}
