# moves-api - Moves Java SDK


This is the first version of ProtoGeo's [Moves app](http://www.moves-app.com)'s Java SDK.


## General

In this initial version, you need to load the API clients using Spring.
Additionally, the API is dependent upon [scribe's API package](https://github.com/fernandezpablo85/scribe-java, "Scribe on Github").


## Using the SDK

### Prequisites
 You must have the following properties set in your properties file:

    com.moves.api.key
    com.moves.api.secret
    com.moves.api.scope

These are the API Key, API Secret and Scope parameters you've received from the Moves Website.


### Usage

The interface to the API is through Move's client interfaces:

###### Authentication Resources

    co.nutrino.api.moves.impl.client.activity.IMovesAuthenticationClient


###### User Resources

    co.nutrino.api.moves.impl.client.user.IMovesUserClient


###### Activity Resources

    co.nutrino.api.moves.impl.client.activity.IMovesUserActivityClient
    co.nutrino.api.moves.impl.client.activity.IMovesUserPlacesClient
    co.nutrino.api.moves.impl.client.activity.IMovesUserStorylineClient
    co.nutrino.api.moves.impl.client.activity.IMovesUserSummaryClient


### Running the Integration Tests

For the integration test to run, set the following parameters for your test user:

    com.moves.api.test.token
    com.moves.api.test.secret

Then, run the MovesUserClientIT integration test.


## Disclaimer

With accordance to the [Moves guidelines](https://dev.moves-app.com/docs/brand_guidelines, "Disclaimer"), this API uses data from Moves but is not endorsed or certified by Moves. 
Moves is a trademark of ProtoGeo Oy.


## Contact

Again, this is only an initial version, and it was built 
Please feel free to contact us at [rnd@nutrino.co](mailto:rnd@nutrino.co).