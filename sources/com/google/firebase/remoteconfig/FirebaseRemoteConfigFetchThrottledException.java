package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigFetchThrottledException extends FirebaseRemoteConfigException {
    public FirebaseRemoteConfigFetchThrottledException() {
        super("Fetch was throttled.");
    }

    public FirebaseRemoteConfigFetchThrottledException(String str) {
        super(str);
    }
}
