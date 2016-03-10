package com.scrumPoker.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Global error handler controller
 * @author Maxim Korkuts
 */
@ControllerAdvice
public class GlobalExceptionHandlerController {

    @ExceptionHandler(value = {Exception.class})
    @ResponseBody
    public Object handleException(Exception ex) throws Exception {
        throw ex;
    }
}
