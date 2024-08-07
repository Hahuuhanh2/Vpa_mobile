package i0;

import v8.a;

/* compiled from: Futures */
public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f10910a;

    public h(a aVar) {
        this.f10910a = aVar;
    }

    public final void run() {
        this.f10910a.cancel(true);
    }
}
