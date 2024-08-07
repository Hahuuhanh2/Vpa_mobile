package j$.util.stream;

/* renamed from: j$.util.stream.w  reason: case insensitive filesystem */
final class C0504w extends C0424c0 {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f18923t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ Object f18924u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0504w(C0423c cVar, int i10, Object obj, int i11) {
        super(cVar, i10);
        this.f18923t = i11;
        this.f18924u = obj;
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        switch (this.f18923t) {
            case 0:
                return new C0492t(this, f2Var, 2);
            case 1:
                return new X(this, f2Var, 1);
            case 2:
                return new X(this, f2Var, 3);
            case 3:
                return new X(this, f2Var, 7);
            case 4:
                return new X(this, f2Var, 8);
            case 5:
                return new C0438f0(this, f2Var, 3);
            case 6:
                return new R1(this, f2Var, 3);
            default:
                return new C0477p(this, f2Var);
        }
    }
}
