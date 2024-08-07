package okhttp3;

import java.io.IOException;
import okhttp3.internal.connection.RealCall;

/* compiled from: Callback.kt */
public interface Callback {
    void c(RealCall realCall, Response response);

    void f(RealCall realCall, IOException iOException);
}
