package androidx.work;

/* compiled from: Worker */
public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Worker f3762a;

    public e(Worker worker) {
        this.f3762a = worker;
    }

    public final void run() {
        try {
            this.f3762a.f3730e.i(this.f3762a.f());
        } catch (Throwable th2) {
            this.f3762a.f3730e.j(th2);
        }
    }
}
