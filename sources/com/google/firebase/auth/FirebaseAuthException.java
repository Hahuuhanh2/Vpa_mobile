package com.google.firebase.auth;

import com.google.firebase.FirebaseException;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth-interop@@20.0.0 */
public class FirebaseAuthException extends FirebaseException {

    /* renamed from: a  reason: collision with root package name */
    public final String f7490a;

    public FirebaseAuthException(String str, String str2) {
        super(str2);
        j.c(str);
        this.f7490a = str;
    }
}
