package com.api.raccoltoemoraes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ExceptionDadoNaoEncontrado extends RuntimeException {

    public ExceptionDadoNaoEncontrado(String message) {
        super(message);
    }
}
