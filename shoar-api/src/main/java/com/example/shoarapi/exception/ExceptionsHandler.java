package com.example.shoarapi.exception;


import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import javax.validation.ConstraintViolationException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@ControllerAdvice
public class ExceptionsHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Object> handleException(Exception ex) {
        log.error("Exception Internal:: ", ex);
        return new ResponseEntity<>("Something went wrong!", HttpStatus.INTERNAL_SERVER_ERROR);
    }


    @ExceptionHandler
    protected ResponseEntity<Object> handleConstraintViolation(ConstraintViolationException ex) {
        List<String> responseMessages = new ArrayList<>();
        ex.getConstraintViolations().forEach( violation -> {
                    responseMessages.add(violation.getMessage());
        });

        return new ResponseEntity<>(responseMessages, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
