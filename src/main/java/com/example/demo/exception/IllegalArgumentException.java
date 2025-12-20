package com.example.demo.exception;

public class IllegalArgument extends RuntimeException{
    public IllegalArgument(String message){
        super(message);
    }
}