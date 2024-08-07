package okhttp3.internal.connection;

import java.io.IOException;

/* compiled from: RouteException.kt */
public final class RouteException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    public final IOException f22299a;

    /* renamed from: b  reason: collision with root package name */
    public IOException f22300b;

    public RouteException(IOException iOException) {
        super(iOException);
        this.f22299a = iOException;
        this.f22300b = iOException;
    }
}
