package com.moves.api.impl.integrationTest;

import java.util.TimeZone;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.moves.api.exception.OAuthException;
import com.moves.api.exception.ResourceException;
import com.moves.api.impl.client.IMoveUserCredentials;
import com.moves.api.impl.client.user.IMovesUserClient;
import com.moves.api.impl.dto.user.MovesUser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:testMovesApplicationContext.xml" })
public class MovesUserClientIT {

    @Inject
    private IMovesUserClient client;

    @Inject
    private IMovesUserCredentialsFactory factory;

    @Test
    public void test_getUser() throws ResourceException, OAuthException {

	IMoveUserCredentials credentials = factory.getMovesCredentials();
	MovesUser user = client.getUser(credentials);

	Assert.assertEquals(TimeZone.getTimeZone("Asia/Jerusalem"), user.getProfile().getCurrentTimeZone());
	Assert.assertTrue(user.getProfile().isCaloriesAvailable());
    }
}
