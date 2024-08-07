package com.google.zxing;

public final class ChecksumException extends ReaderException {

    /* renamed from: c  reason: collision with root package name */
    public static final ChecksumException f7965c;

    static {
        ChecksumException checksumException = new ChecksumException();
        f7965c = checksumException;
        checksumException.setStackTrace(ReaderException.f7969b);
    }

    private ChecksumException() {
    }

    public static ChecksumException a() {
        if (ReaderException.f7968a) {
            return new ChecksumException();
        }
        return f7965c;
    }
}
