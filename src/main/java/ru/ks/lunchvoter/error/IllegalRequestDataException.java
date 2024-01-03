package ru.ks.lunchvoter.error;

public class IllegalRequestDataException extends AppException {
    public IllegalRequestDataException(String message) {
        super(message);
    }
}
