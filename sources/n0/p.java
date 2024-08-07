package n0;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f13373a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f13374b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f13375c;

    public /* synthetic */ p(u uVar, int i10, int i11) {
        this.f13373a = uVar;
        this.f13374b = i10;
        this.f13375c = i11;
    }

    public final void run() {
        boolean z10;
        u uVar = this.f13373a;
        int i10 = this.f13374b;
        int i11 = this.f13375c;
        boolean z11 = true;
        if (uVar.f13397h != i10) {
            uVar.f13397h = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (uVar.f13396g != i11) {
            uVar.f13396g = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            uVar.e();
        }
    }
}
