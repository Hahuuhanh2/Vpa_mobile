package com.google.zxing;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

public abstract class ReaderException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f7968a;

    /* renamed from: b  reason: collision with root package name */
    public static final StackTraceElement[] f7969b = new StackTraceElement[0];

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f7968a = z10;
    }

    public ReaderException() {
    }

    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    public ReaderException(ReedSolomonException reedSolomonException) {
        super(reedSolomonException);
    }
}
