package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntFunction;

final class K0 extends L0 {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f18644l = 0;

    /* renamed from: k  reason: collision with root package name */
    public final /* synthetic */ int f18645k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K0(int i10, Spliterator spliterator, C0501v0 v0Var) {
        super(v0Var, spliterator, new C0418b(29), new J0(0));
        this.f18645k = i10;
        if (i10 == 1) {
            super(v0Var, spliterator, new J0(1), new J0(2));
        } else if (i10 != 2) {
        } else {
            super(v0Var, spliterator, new J0(3), new J0(4));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public K0(Spliterator spliterator, IntFunction intFunction, C0501v0 v0Var) {
        super(v0Var, spliterator, new C0413a(2, intFunction), new J0(5));
        this.f18645k = 3;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.f18645k) {
            case 0:
                return a();
            case 1:
                return a();
            case 2:
                return a();
            default:
                return a();
        }
    }

    /* access modifiers changed from: protected */
    public final C0437f d(Spliterator spliterator) {
        switch (this.f18645k) {
            case 0:
                return new L0(this, spliterator);
            case 1:
                return new L0(this, spliterator);
            case 2:
                return new L0(this, spliterator);
            default:
                return new L0(this, spliterator);
        }
    }
}
