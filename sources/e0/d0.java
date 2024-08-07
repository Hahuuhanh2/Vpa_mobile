package e0;

import g0.m;
import i0.c;

/* compiled from: SingleBundlingNode */
public final class d0 implements c<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w f8993a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e0 f8994b;

    public d0(e0 e0Var, w wVar) {
        this.f8994b = e0Var;
        this.f8993a = wVar;
    }

    public final void a(Throwable th2) {
        m.a();
        w wVar = this.f8993a;
        e0 e0Var = this.f8994b;
        if (wVar == e0Var.f8996a) {
            e0Var.f8996a = null;
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Void voidR = (Void) obj;
    }
}
