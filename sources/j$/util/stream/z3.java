package j$.util.stream;

final class z3 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Runnable f18945a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Runnable f18946b;

    z3(Runnable runnable, Runnable runnable2) {
        this.f18945a = runnable;
        this.f18946b = runnable2;
    }

    public final void run() {
        try {
            this.f18945a.run();
            this.f18946b.run();
            return;
        } catch (Throwable th2) {
            try {
                th.addSuppressed(th2);
            } catch (Throwable unused) {
            }
        }
        throw th;
    }
}
