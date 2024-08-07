package j$.util.stream;

/* renamed from: j$.util.stream.y  reason: case insensitive filesystem */
final class C0512y extends B {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f18939t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0512y(C0423c cVar, int i10, int i11) {
        super(cVar, i10);
        this.f18939t = i11;
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        switch (this.f18939t) {
            case 0:
                return f2Var;
            case 1:
                return new X(this, f2Var, 2);
            default:
                return new C0438f0(this, f2Var, 0);
        }
    }
}
