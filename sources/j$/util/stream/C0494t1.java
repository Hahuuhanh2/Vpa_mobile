package j$.util.stream;

/* renamed from: j$.util.stream.t1  reason: case insensitive filesystem */
class C0494t1 extends C0498u1 {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f18897c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f18898d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0494t1(D0 d02, Object obj) {
        this((E0) d02, obj, 0);
        this.f18897c = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0494t1(E0 e02, Object obj, int i10) {
        super(e02);
        this.f18897c = i10;
        this.f18898d = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0494t1(E0 e02, Object[] objArr) {
        this(e02, (Object) objArr, 1);
        this.f18897c = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0494t1(C0494t1 t1Var, D0 d02, int i10) {
        super(t1Var, d02, i10);
        this.f18897c = 0;
        this.f18898d = t1Var.f18898d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0494t1(C0494t1 t1Var, E0 e02, int i10) {
        super(t1Var, e02, i10);
        this.f18897c = 1;
        this.f18898d = (Object[]) t1Var.f18898d;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        switch (this.f18897c) {
            case 0:
                ((D0) this.f18905a).c(this.f18906b, this.f18898d);
                return;
            default:
                this.f18905a.e((Object[]) this.f18898d, this.f18906b);
                return;
        }
    }

    /* access modifiers changed from: package-private */
    public final C0494t1 b(int i10, int i11) {
        switch (this.f18897c) {
            case 0:
                return new C0494t1(this, ((D0) this.f18905a).a(i10), i11);
            default:
                return new C0494t1(this, this.f18905a.a(i10), i11);
        }
    }
}
