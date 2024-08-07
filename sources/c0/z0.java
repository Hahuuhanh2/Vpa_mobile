package c0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class z0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4380a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d1 f4381b;

    public /* synthetic */ z0(d1 d1Var, int i10) {
        this.f4380a = i10;
        this.f4381b = d1Var;
    }

    public final void run() {
        switch (this.f4380a) {
            case 0:
                this.f4381b.f4216d.cancel(true);
                return;
            default:
                this.f4381b.b();
                return;
        }
    }
}
