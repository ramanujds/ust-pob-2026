package com.ust.ecomapp.exception;

import java.time.LocalDateTime;

public record ErrorResponseDTO(LocalDateTime timestamp,
                               int status,
                               String error,
                               String message,
                               String path) {


}
