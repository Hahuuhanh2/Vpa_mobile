package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigClientException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigClientException(String str) {
        super(str);
    }

    public FirebaseRemoteConfigClientException(String str, Exception exc) {
        super(str, exc);
    }

    public FirebaseRemoteConfigClientException() {
        super("Unable to connect to the server. Check your connection and try again.", 0);
    }

    public FirebaseRemoteConfigClientException(Throwable th2) {
        super(th2);
    }
}
