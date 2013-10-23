package co.nutrino.api.moves.util.convert;

public interface IJsonToPojoConverter {

    public <T> T convertSourceToPojo(String json, Class<T> c) throws ConversionException;

    public <T> T[] convertSourceToPojos(String json, Class<T[]> arrayClass) throws ConversionException;
}