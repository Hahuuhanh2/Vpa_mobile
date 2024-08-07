package h0;

import h0.b;

/* compiled from: HandlerScheduledExecutorService */
public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.c.a f10513a;

    public c(b.c.a aVar) {
        this.f10513a = aVar;
    }

    public final void run() {
        if (b.c.this.f10506a.getAndSet((Object) null) != null) {
            b.c.a aVar = this.f10513a;
            aVar.f10510a.removeCallbacks(b.c.this);
        }
    }
}
