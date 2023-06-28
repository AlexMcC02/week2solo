package org.kainos.ea.client;

public class ProductDoesNotExistException extends Throwable {
    @Override
    public String getMessage() {
        return "The product referenced doesn't exist in the database.";
    }
}
