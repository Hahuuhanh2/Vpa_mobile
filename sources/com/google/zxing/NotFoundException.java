package com.google.zxing;

public final class NotFoundException extends ReaderException {

    /* renamed from: c  reason: collision with root package name */
    public static final NotFoundException f7967c;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f7967c = notFoundException;
        notFoundException.setStackTrace(ReaderException.f7969b);
    }

    private NotFoundException() {
    }

    public static NotFoundException a() {
        return f7967c;
    }
}
