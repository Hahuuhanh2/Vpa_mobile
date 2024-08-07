package w6;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.internal.b;
import java.util.Set;
import y6.a;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class e0 implements a.c, t0 {

    /* renamed from: a  reason: collision with root package name */
    public final a.f f16587a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16588b;

    /* renamed from: c  reason: collision with root package name */
    public b f16589c = null;

    /* renamed from: d  reason: collision with root package name */
    public Set f16590d = null;

    /* renamed from: e  reason: collision with root package name */
    public boolean f16591e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f16592f;

    public e0(d dVar, a.f fVar, a aVar) {
        this.f16592f = dVar;
        this.f16587a = fVar;
        this.f16588b = aVar;
    }

    public final void a(ConnectionResult connectionResult) {
        this.f16592f.f16582n.post(new d0(this, connectionResult));
    }

    public final void b(ConnectionResult connectionResult) {
        b0 b0Var = (b0) this.f16592f.f16578j.get(this.f16588b);
        if (b0Var != null) {
            j.b(b0Var.f16558p.f16582n);
            a.f fVar = b0Var.f16547b;
            String name = fVar.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            fVar.disconnect("onSignInFailed for " + name + " with " + valueOf);
            b0Var.q(connectionResult, (RuntimeException) null);
        }
    }
}
