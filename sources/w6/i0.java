package w6;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import b7.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import w6.h;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class i0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f16604a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f16605b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f16606c;

    public i0(u0 u0Var, zak zak) {
        this.f16606c = u0Var;
        this.f16605b = zak;
    }

    public final void run() {
        boolean z10;
        b bVar;
        b bVar2;
        switch (this.f16604a) {
            case 0:
                h.b bVar3 = (h.b) this.f16606c;
                Object obj = ((h) this.f16605b).f16598a;
                if (obj == null) {
                    bVar3.getClass();
                    return;
                }
                try {
                    ((c7.b) bVar3).getClass();
                    ((a) obj).a();
                    return;
                } catch (RuntimeException e10) {
                    bVar3.getClass();
                    throw e10;
                }
            default:
                u0 u0Var = (u0) this.f16606c;
                zak zak = (zak) this.f16605b;
                q7.b bVar4 = u0.f16660k;
                ConnectionResult connectionResult = zak.f5567b;
                boolean z11 = true;
                if (connectionResult.f5321b == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    zav zav = zak.f5568c;
                    j.f(zav);
                    ConnectionResult connectionResult2 = zav.f5429c;
                    if (connectionResult2.f5321b != 0) {
                        z11 = false;
                    }
                    if (!z11) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                        ((e0) u0Var.f16667j).b(connectionResult2);
                        ((y6.a) u0Var.f16666f).disconnect();
                        return;
                    }
                    t0 t0Var = u0Var.f16667j;
                    IBinder iBinder = zav.f5428b;
                    if (iBinder == null) {
                        bVar = null;
                    } else {
                        int i10 = b.a.f5422a;
                        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        if (queryLocalInterface instanceof b) {
                            bVar2 = (b) queryLocalInterface;
                        } else {
                            bVar2 = new c(iBinder);
                        }
                        bVar = bVar2;
                    }
                    Set set = u0Var.f16664d;
                    e0 e0Var = (e0) t0Var;
                    e0Var.getClass();
                    if (bVar == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        e0Var.b(new ConnectionResult(4));
                    } else {
                        e0Var.f16589c = bVar;
                        e0Var.f16590d = set;
                        if (e0Var.f16591e) {
                            e0Var.f16587a.getRemoteService(bVar, set);
                        }
                    }
                } else {
                    ((e0) u0Var.f16667j).b(connectionResult);
                }
                ((y6.a) u0Var.f16666f).disconnect();
                return;
        }
    }
}
