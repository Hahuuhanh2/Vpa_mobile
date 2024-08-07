package t1;

import android.graphics.Typeface;
import m1.e;
import n1.h;
import p3.l0;

/* compiled from: CallbackWithHandler */
public final class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l0 f14755a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Typeface f14756b;

    public a(l0 l0Var, Typeface typeface) {
        this.f14755a = l0Var;
        this.f14756b = typeface;
    }

    public final void run() {
        l0 l0Var = this.f14755a;
        Typeface typeface = this.f14756b;
        e.C0160e eVar = ((h.a) l0Var).E;
        if (eVar != null) {
            eVar.d(typeface);
        }
    }
}
