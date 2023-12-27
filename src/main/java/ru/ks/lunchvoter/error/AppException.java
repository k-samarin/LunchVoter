package ru.ks.lunchvoter.error;

import jakarta.validation.constraints.NotNull;

public class AppException extends RuntimeException{

    public AppException (@NotNull String message) {
        super(message);
    }
}
