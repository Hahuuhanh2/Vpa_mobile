package j$.util.stream;

/* renamed from: j$.util.stream.u  reason: case insensitive filesystem */
final class C0496u extends B {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f18902t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ Object f18903u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0496u(C0423c cVar, int i10, Object obj, int i11) {
        super(cVar, i10);
        this.f18902t = i11;
        this.f18903u = obj;
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        switch (this.f18902t) {
            case 0:
                return new C0492t(this, f2Var, 0);
            case 1:
                return new C0492t(this, f2Var, 4);
            case 2:
                return new C0492t(this, f2Var, 5);
            case 3:
                return new C0492t(this, f2Var, 6);
            case 4:
                return new X(this, f2Var, 6);
            case 5:
                return new C0438f0(this, f2Var, 4);
            case 6:
                return new R1(this, f2Var, 5);
            default:
                return new C0477p(this, f2Var);
        }
    }
}
