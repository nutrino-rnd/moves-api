## Moves Java SDK ##


This is the first version of ProtoGeo's Moves app Java SDK (www.moves-app.com).


** Disclaimer **

This API uses data from Moves but is not endorsed or certified by Moves. 
Moves is a trademark of ProtoGeo Oy.


** Using the SDK **


In this initial version, you need to load the API clients using Spring. 
Additionally, you must have the following properties set in your properties file:

com.moves.api.key
com.moves.api.secret
com.moves.api.scope

These are the API Key, API Secret and Scope parameters you've received from the Moves Website.


** Running the Integration Tests **

For the integration test to run, set the following parameters for your test user:
com.moves.api.test.token
com.moves.api.test.secret

And then you can run the MovesUserClientIT integration test.