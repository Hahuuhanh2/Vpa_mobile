package n0;

import j7.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13376a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f13377b;

    public /* synthetic */ q(u uVar, int i10) {
        this.f13376a = i10;
        this.f13377b = uVar;
    }

    public final void run() {
        switch (this.f13376a) {
            case 0:
                u uVar = this.f13377b;
                uVar.getClass();
                a.f0().execute(new q(uVar, 1));
                return;
            default:
                u uVar2 = this.f13377b;
                if (!uVar2.f13403n) {
                    uVar2.d();
                    return;
                }
                return;
        }
    }
}
