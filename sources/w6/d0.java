package w6;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ConnectionResult f16584a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e0 f16585b;

    public d0(e0 e0Var, ConnectionResult connectionResult) {
        this.f16585b = e0Var;
        this.f16584a = connectionResult;
    }

    public final void run() {
        boolean z10;
        b bVar;
        e0 e0Var = this.f16585b;
        b0 b0Var = (b0) e0Var.f16592f.f16578j.get(e0Var.f16588b);
        if (b0Var != null) {
            ConnectionResult connectionResult = this.f16584a;
            if (connectionResult.f5321b == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                e0 e0Var2 = this.f16585b;
                e0Var2.f16591e = true;
                if (e0Var2.f16587a.requiresSignIn()) {
                    e0 e0Var3 = this.f16585b;
                    if (e0Var3.f16591e && (bVar = e0Var3.f16589c) != null) {
                        e0Var3.f16587a.getRemoteService(bVar, e0Var3.f16590d);
                        return;
                    }
                    return;
                }
                try {
                    a.f fVar = this.f16585b.f16587a;
                    fVar.getRemoteService((b) null, fVar.getScopesForConnectionlessNonSignIn());
                } catch (SecurityException unused) {
                    this.f16585b.f16587a.disconnect("Failed to get service from broker.");
                    b0Var.q(new ConnectionResult(10), (RuntimeException) null);
                }
            } else {
                b0Var.q(connectionResult, (RuntimeException) null);
            }
        }
    }
}
