package sj;

/* compiled from: CompositeDisposable */
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f22913a;

    public final void b() {
        if (!this.f22913a) {
            synchronized (this) {
                if (!this.f22913a) {
                    this.f22913a = true;
                }
            }
        }
    }
}
