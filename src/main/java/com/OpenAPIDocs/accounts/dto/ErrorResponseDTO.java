package com.OpenAPIDocs.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
public class ErrorResponseDTO {

    private String description;
    private HttpStatus status;
    private String message;
    private LocalDateTime timestamp;

    // Constructor with arguments
    public ErrorResponseDTO(String description, HttpStatus status, String message, LocalDateTime timestamp) {
        this.description = description;
        this.status = status;
        this.message = message;
        this.timestamp = timestamp;
    }

    // Getters and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public void setStatus(HttpStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }


    
}
