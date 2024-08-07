package com.google.mlkit.common;

import y6.j;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public class MlKitException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public final int f7856a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, int i10) {
        super(str);
        j.d("Provided message must not be empty.", str);
        this.f7856a = i10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MlKitException(String str, Exception exc) {
        super(str, exc);
        j.d("Provided message must not be empty.", str);
        this.f7856a = 13;
    }
}
