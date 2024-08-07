package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

public class FirebaseInstallationsException extends FirebaseException {
    public FirebaseInstallationsException() {
    }

    public FirebaseInstallationsException(String str) {
        super(str);
    }
}
