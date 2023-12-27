package ru.ks.lunchvoter.error;

public class NotFoundException extends AppException{
    public NotFoundException(String message) {
        super(message);
    }
}
