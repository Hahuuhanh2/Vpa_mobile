package v;

import ab.b;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15801a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f15802b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15803c;

    public /* synthetic */ q(int i10, Object obj, boolean z10) {
        this.f15801a = i10;
        this.f15803c = obj;
        this.f15802b = z10;
    }

    public final void run() {
        switch (this.f15801a) {
            case 0:
                u uVar = (u) this.f15803c;
                boolean z10 = this.f15802b;
                uVar.G = z10;
                if (z10 && uVar.f15867e == 2) {
                    uVar.I(false);
                    return;
                }
                return;
            default:
                boolean z11 = this.f15802b;
                Object obj = b.f143m;
                ((b) this.f15803c).b(z11);
                return;
        }
    }
}
