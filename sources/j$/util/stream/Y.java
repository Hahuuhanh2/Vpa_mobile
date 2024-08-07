package j$.util.stream;

final class Y extends C0450i0 {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f18742t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(C0423c cVar, int i10, int i11) {
        super(cVar, i10);
        this.f18742t = i11;
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        switch (this.f18742t) {
            case 0:
                return new X(this, f2Var, 0);
            default:
                return f2Var;
        }
    }
}
