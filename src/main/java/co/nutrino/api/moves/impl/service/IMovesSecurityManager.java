package co.nutrino.api.moves.impl.service;


public interface IMovesSecurityManager {

    public String getKey();

    public String getSecret();

    public String getScope();
}