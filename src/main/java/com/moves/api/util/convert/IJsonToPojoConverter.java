package com.moves.api.util.convert;

public interface IJsonToPojoConverter {

    public <T> T convertSourceToPojo(String json, Class<T> c) throws ConversionException;

    public <T> T[] convertSourceToPojos(String json, Class<T[]> arrayClass) throws ConversionException;
}