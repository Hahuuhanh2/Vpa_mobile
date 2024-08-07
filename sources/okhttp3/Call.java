package okhttp3;

import okhttp3.internal.connection.RealCall;

/* compiled from: Call.kt */
public interface Call extends Cloneable {

    /* compiled from: Call.kt */
    public interface Factory {
        RealCall a(Request request);
    }

    void cancel();

    Response d();

    boolean h();

    Request i();

    void v(Callback callback);
}
