package u4;

import u4.c;

/* compiled from: ActiveResources */
public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f15093a;

    public b(c cVar) {
        this.f15093a = cVar;
    }

    public final void run() {
        c cVar = this.f15093a;
        cVar.getClass();
        while (true) {
            try {
                cVar.b((c.a) cVar.f15096c.remove());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
