package org.kainos.ea.client;

public class OrderDoesNotExistException extends Throwable {
    @Override
    public String getMessage() {
        return "The order referenced doesn't exist in the database.";
    }
}
