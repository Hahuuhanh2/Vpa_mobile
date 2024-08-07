package j4;

import e4.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements a.C0097a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f11635a;

    public /* synthetic */ a(b bVar) {
        this.f11635a = bVar;
    }

    public final void a() {
        boolean z10;
        b bVar = this.f11635a;
        if (bVar.f11653r.l() == 1.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 != bVar.f11659x) {
            bVar.f11659x = z10;
            bVar.f11650o.invalidateSelf();
        }
    }
}
