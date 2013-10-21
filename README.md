moves-api
=========

Moves Java SDK
**************

This is the Java SDK for ProtoGeo's Moves app (www.moves-app.com).

In the initial version, you need to load the API clients using Spring. 
Additionally, you must have the following properties set in your properties file:

com.moves.api.key
com.moves.api.secret
com.moves.api.scope

These are the API Key, API Secret and Scope parameters you've received from the Moves Website.


For the integration test to run, set the following parameters for your test user:
com.moves.api.test.token
com.moves.api.test.secret

And then you can run the MovesUserClientIT integration test.
=======
In the initial version, you need to load the API clients using Spring.
Additionally, you must have the following properties set in your properties file:
