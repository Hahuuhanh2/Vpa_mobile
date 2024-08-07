package al;

import fl.m;
import fl.u;
import gl.c;

/* compiled from: DefaultExecutor.kt */
public final class i0 {

    /* renamed from: a  reason: collision with root package name */
    public static final l0 f19043a;

    static {
        String str;
        boolean z10;
        l0 l0Var;
        int i10 = u.f20263a;
        try {
            str = System.getProperty("kotlinx.coroutines.main.delay");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            z10 = Boolean.parseBoolean(str);
        } else {
            z10 = false;
        }
        if (!z10) {
            l0Var = h0.f19040q;
        } else {
            c cVar = r0.f19084a;
            q1 q1Var = m.f20254a;
            q1Var.a0();
            if (!(q1Var instanceof l0)) {
                l0Var = h0.f19040q;
            } else {
                l0Var = (l0) q1Var;
            }
        }
        f19043a = l0Var;
    }
}
