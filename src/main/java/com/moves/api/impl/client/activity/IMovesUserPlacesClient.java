package com.moves.api.impl.client.activity;

import java.util.Date;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.dto.storyline.MovesStoryline;

public interface IMovesUserPlacesClient {

    public MovesStoryline[] getUserPlacesForDay(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException;

    public MovesStoryline[] getUserPlacesForWeek(IMoveUserCredentials credentials, Date date) throws ResourceException, OAuthException;

    public MovesStoryline[] getUserPlacesForDates(IMoveUserCredentials credentials, Date from, Date to) throws ResourceException, OAuthException;

    public MovesStoryline[] getUserPlacesForPastDays(IMoveUserCredentials credentials, int numberOfDays) throws ResourceException, OAuthException;
}