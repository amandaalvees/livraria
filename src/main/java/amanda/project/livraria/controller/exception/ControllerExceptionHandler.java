package amanda.project.livraria.controller.exception;

import amanda.project.livraria.service.exception.EntityNotFound;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class ControllerExceptionHandler {

    @ExceptionHandler(EntityNotFound.class)
    public ResponseEntity<ErrorResponse> notFound(EntityNotFound e, HttpServletRequest request);{
        String error = "Not Found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorResponse err = new ErrorResponse(Instant.now(), status.value(), error, e.getMenssage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}
