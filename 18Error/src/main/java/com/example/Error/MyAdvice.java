package com.example.Error;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CustomExp.class)
    public String cust(){
        return "custError";
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        //return super.handleMethodArgumentNotValid(ex, headers, status, request);
        ResponseEntity entity =  new ResponseEntity(""+ex.getBindingResult().getFieldError().getDefaultMessage()+""+request.getDescription(false),HttpStatus.BAD_REQUEST);
        return entity ;
    }
}
