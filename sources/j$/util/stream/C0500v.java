package j$.util.stream;

/* renamed from: j$.util.stream.v  reason: case insensitive filesystem */
final class C0500v extends W1 {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f18908t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ Object f18909u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0500v(C0423c cVar, int i10, Object obj, int i11) {
        super(cVar, i10);
        this.f18908t = i11;
        this.f18909u = obj;
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        switch (this.f18908t) {
            case 0:
                return new C0492t(this, f2Var, 1);
            case 1:
                return new X(this, f2Var, 4);
            case 2:
                return new C0438f0(this, f2Var, 2);
            case 3:
                return new R1(this, f2Var, 0);
            default:
                return new R1(this, f2Var, 1);
        }
    }
}
