package com.OpenAPIDocs.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Schema(name = "Response",
        description = "Schema to hold successful response information"
)
public class ResponseDto {

        private String status;
        private String message;
    
        // Constructor with two arguments
        public ResponseDto(String status, String message) {
            this.status = status;
            this.message = message;
        }
    
        // Getters and setters
        public String getStatus() {
            return status;
        }
    
        public void setStatus(String status) {
            this.status = status;
        }
    
        public String getMessage() {
            return message;
        }
    
        public void setMessage(String message) {
            this.message = message;
        }
    
// Removed duplicate constructor

    @Schema(
            description = "Status code in the response", example = "200"
    )
    private String statusCode;

    @Schema(
            description = "Status message in the response", example = "Request processed successfully"
    )
    private String statusMsg;

    
    
}
