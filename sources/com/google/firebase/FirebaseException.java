package com.google.firebase;

import y6.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public class FirebaseException extends Exception {
    @Deprecated
    public FirebaseException() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        j.d("Detail message must not be empty", str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str, Throwable th2) {
        super(str, th2);
        j.d("Detail message must not be empty", str);
    }
}
