package br.com.correa.problem;

import org.springframework.http.HttpStatus;
import org.springframework.web.ErrorResponseException;

public class ProblemTestException extends ErrorResponseException{

    public ProblemTestException() {
        super(HttpStatus.BAD_GATEWAY);
    }

}
