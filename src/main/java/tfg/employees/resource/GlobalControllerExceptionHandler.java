package tfg.employees.resource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//This class represents a handler responsible for handling exceptions that may occur during the processing of web requests
@RestControllerAdvice
public class GlobalControllerExceptionHandler {

    //404 Not Found: The server could not find the requested resource
    @ResponseStatus(value= HttpStatus.NOT_FOUND)
    @ExceptionHandler(EmptyResultDataAccessException.class)
    public ResponseEntity<String> notFound(){
        return new ResponseEntity<>("The server could not find the requested resource", HttpStatus.NOT_FOUND);
    }

    //400 Bad Request: The server could not interpret the request due to invalid syntax
    @ResponseStatus(value=HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> badRequest(){
        return new ResponseEntity<>("The server could not interpret the request due to invalid syntax",HttpStatus.BAD_REQUEST);
    }
}
