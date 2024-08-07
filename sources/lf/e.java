package lf;

import al.a0;
import al.g0;
import al.r0;
import androidx.lifecycle.i;
import com.ots.core.base.BaseActivity;
import ef.c;
import ek.i;
import ik.d;
import jk.a;
import okhttp3.OkHttpClient;
import p3.l0;
import r2.g;
import r2.h;
import rk.l;

/* compiled from: ConnectionChecker.kt */
public final class e {
    public static final Object a(String str, l lVar, d dVar) {
        Object V0 = l0.V0(dVar, r0.f19085b, new d(str, new OkHttpClient(new OkHttpClient().b()), lVar, (d<? super d>) null));
        if (V0 == a.COROUTINE_SUSPENDED) {
            return V0;
        }
        return i.f20112a;
    }

    public static void b(BaseActivity baseActivity, c cVar) {
        i.b bVar = i.b.RESUMED;
        androidx.lifecycle.l W = g0.W(baseActivity);
        int ordinal = bVar.ordinal();
        if (ordinal == 2) {
            l0.j0(W, (a0) null, new g(W, new c("https://vpa.com.vn", cVar, (d<? super c>) null), (d<? super g>) null), 3);
        } else if (ordinal == 3) {
            l0.j0(W, (a0) null, new r2.i(W, new b("https://vpa.com.vn", cVar, (d<? super b>) null), (d<? super r2.i>) null), 3);
        } else if (ordinal == 4) {
            l0.j0(W, (a0) null, new h(W, new a("https://vpa.com.vn", cVar, (d<? super a>) null), (d<? super h>) null), 3);
        } else {
            throw new IllegalArgumentException("leastLifecycleState should be one of CREATED, STARTED, RESUMED");
        }
    }
}
