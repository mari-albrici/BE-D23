package be.coworking.exceptions;

public class NotFound extends RuntimeException {

    public NotFound(int id) {
        super("Item with id " + id + " not found!");
    }

}
