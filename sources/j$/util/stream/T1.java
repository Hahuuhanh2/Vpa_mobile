package j$.util.stream;

import j$.util.function.Function;

final class T1 extends W1 {

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f18689t;

    /* renamed from: u  reason: collision with root package name */
    final /* synthetic */ Function f18690u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T1(C0423c cVar, int i10, Function function, int i11) {
        super(cVar, i10);
        this.f18689t = i11;
        this.f18690u = function;
    }

    /* access modifiers changed from: package-private */
    public final C0440f2 I1(int i10, C0440f2 f2Var) {
        switch (this.f18689t) {
            case 0:
                return new R1(this, f2Var, 2);
            default:
                return new R1(this, f2Var, 6);
        }
    }
}
