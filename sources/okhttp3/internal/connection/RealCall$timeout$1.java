package okhttp3.internal.connection;

import ll.c;

/* compiled from: RealCall.kt */
public final class RealCall$timeout$1 extends c {

    /* renamed from: m  reason: collision with root package name */
    public final /* synthetic */ RealCall f22270m;

    public RealCall$timeout$1(RealCall realCall) {
        this.f22270m = realCall;
    }

    public final void k() {
        this.f22270m.cancel();
    }
}
