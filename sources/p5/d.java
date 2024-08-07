package p5;

/* compiled from: StateVerifier */
public abstract class d {

    /* compiled from: StateVerifier */
    public static class a extends d {

        /* renamed from: a  reason: collision with root package name */
        public volatile boolean f14078a;

        public final void a() {
            if (this.f14078a) {
                throw new IllegalStateException("Already released");
            }
        }
    }
}
