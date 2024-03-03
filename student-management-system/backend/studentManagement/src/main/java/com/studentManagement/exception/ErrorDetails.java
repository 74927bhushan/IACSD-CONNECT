package com.studentManagement.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {
    public ErrorDetails(LocalDateTime now, String message2, String description) {
		// TODO Auto-generated constructor stub
	}
	private LocalDateTime timestamp;
    private String message;
    private String details;
}
