package io.github.andersev7en.ClientesApplication.model.rest.exceptions;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class ApiErrors {

    @Getter
    public List<String> errors;

    public ApiErrors(List<String> errors){

        this.errors = errors;
    }

    public ApiErrors(String message){

        this.errors = Arrays.asList(message);
    }

}
