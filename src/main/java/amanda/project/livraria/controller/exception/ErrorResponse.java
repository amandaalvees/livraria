package amanda.project.livraria.controller.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class ErrorResponse {
    private Instant timestamp;
    private Intenger status;
    private String error;
    private String message;
    private String path;
}
