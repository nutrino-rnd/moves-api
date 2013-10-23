package co.nutrino.api.moves.exception;

import java.io.IOException;

public class ResourceException extends IOException {
    public ResourceException(String message) {
	super(message);
    }
}
