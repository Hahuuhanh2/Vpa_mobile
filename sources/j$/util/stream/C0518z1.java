package j$.util.stream;

import j$.util.function.C0367c0;
import j$.util.function.C0372f;
import j$.util.function.C0380j;
import j$.util.function.H;

/* renamed from: j$.util.stream.z1  reason: case insensitive filesystem */
final class C0518z1 extends C0501v0 {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ int f18943h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ Object f18944i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0518z1(int i10, Object obj, int i11) {
        super(i10);
        this.f18943h = i11;
        this.f18944i = obj;
    }

    public final O1 s1() {
        switch (this.f18943h) {
            case 0:
                return new A1((C0380j) this.f18944i);
            case 1:
                return new D1((C0372f) this.f18944i);
            case 2:
                return new J1((H) this.f18944i);
            default:
                return new N1((C0367c0) this.f18944i);
        }
    }
}
