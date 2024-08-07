package q;

import r2.p;
import r2.q;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14188a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j f14189b;

    public /* synthetic */ h(j jVar, int i10) {
        this.f14188a = i10;
        this.f14189b = jVar;
    }

    public final void b(Object obj) {
        switch (this.f14188a) {
            case 0:
                j jVar = this.f14189b;
                CharSequence charSequence = (CharSequence) obj;
                int i10 = j.f14193g0;
                if (charSequence != null) {
                    if (jVar.m0()) {
                        jVar.r0(charSequence);
                    }
                    jVar.f14194e0.f((d) null);
                    return;
                }
                jVar.getClass();
                return;
            default:
                j jVar2 = this.f14189b;
                int i11 = j.f14193g0;
                jVar2.getClass();
                if (((Boolean) obj).booleanValue()) {
                    jVar2.i0(1);
                    jVar2.j0();
                    n nVar = jVar2.f14194e0;
                    if (nVar.f14245y == null) {
                        nVar.f14245y = new p<>();
                    }
                    n.j(nVar.f14245y, Boolean.FALSE);
                    return;
                }
                return;
        }
    }
}
