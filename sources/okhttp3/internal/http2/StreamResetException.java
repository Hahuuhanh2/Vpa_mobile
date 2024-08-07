package okhttp3.internal.http2;

import java.io.IOException;

/* compiled from: StreamResetException.kt */
public final class StreamResetException extends IOException {

    /* renamed from: a  reason: collision with root package name */
    public final ErrorCode f22531a;

    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        this.f22531a = errorCode;
    }
}
