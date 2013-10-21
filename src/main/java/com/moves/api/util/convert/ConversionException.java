package com.moves.api.util.convert;


public class ConversionException extends Exception {
    public ConversionException(String message, Exception internalException) {
	super(message + " - " + internalException);
    }
}
