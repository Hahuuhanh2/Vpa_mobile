package com.google.firebase.remoteconfig;

public class FirebaseRemoteConfigServerException extends FirebaseRemoteConfigException {

    /* renamed from: a  reason: collision with root package name */
    public final int f7666a;

    public FirebaseRemoteConfigServerException(int i10, String str) {
        super(str);
        this.f7666a = i10;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) {
        super(str, (Exception) firebaseRemoteConfigServerException);
        this.f7666a = i10;
    }

    public FirebaseRemoteConfigServerException(String str) {
        super(str, 0);
        this.f7666a = -1;
    }

    public FirebaseRemoteConfigServerException(int i10, String str, int i11) {
        super(str, 0);
        this.f7666a = i10;
    }
}
