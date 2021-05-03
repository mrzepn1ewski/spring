package pl.turnip.spring.model.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "policy not found")
public class PolicyNotFoundException extends RuntimeException{
}
