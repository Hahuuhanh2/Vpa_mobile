package com.google.zxing;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

public final class FormatException extends ReaderException {

    /* renamed from: c  reason: collision with root package name */
    public static final FormatException f7966c;

    static {
        FormatException formatException = new FormatException();
        f7966c = formatException;
        formatException.setStackTrace(ReaderException.f7969b);
    }

    private FormatException() {
    }

    public static FormatException a() {
        if (ReaderException.f7968a) {
            return new FormatException();
        }
        return f7966c;
    }

    public FormatException(ReedSolomonException reedSolomonException) {
        super(reedSolomonException);
    }
}
