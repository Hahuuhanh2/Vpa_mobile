package com.google.firebase.remoteconfig;

import com.google.firebase.FirebaseException;

public class FirebaseRemoteConfigException extends FirebaseException {
    public FirebaseRemoteConfigException(String str) {
        super(str);
    }

    public FirebaseRemoteConfigException(String str, Exception exc) {
        super(str, exc);
    }

    public FirebaseRemoteConfigException(String str, int i10) {
        super(str);
    }

    public FirebaseRemoteConfigException(Throwable th2) {
        super("Unable to parse config update message.", th2);
    }
}
