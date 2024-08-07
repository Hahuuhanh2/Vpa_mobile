package j$.util.stream;

/* renamed from: j$.util.stream.b0  reason: case insensitive filesystem */
abstract class C0419b0 extends C0429d0 {
    static {
        Class<C0429d0> cls = C0429d0.class;
    }

    C0419b0(C0423c cVar, int i10) {
        super(cVar, i10);
    }

    /* access modifiers changed from: package-private */
    public final boolean H1() {
        return true;
    }

    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
