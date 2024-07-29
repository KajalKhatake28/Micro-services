package com.kajal.user.service.payload;

import org.springframework.http.HttpStatus;

public class ApiResponse {
    private String message;
    private boolean success;
    private HttpStatus status;

    // Getters and Setters

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String message;
        private boolean success;
        private HttpStatus status;

        public Builder message(String message) {
            this.message = message;
            return this;
        }

        public Builder success(boolean success) {
            this.success = success;
            return this;
        }

        public Builder status(HttpStatus status) {
            this.status = status;
            return this;
        }

        public ApiResponse build() {
            ApiResponse response = new ApiResponse();
            response.setMessage(this.message);
            response.setSuccess(this.success);
            response.setStatus(this.status);
            return response;
        }
    }

    private void setStatus(HttpStatus status) {
    }

    private void setSuccess(boolean success) {
    }

    private void setMessage(String message) {
    }
}

  
