package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.q;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class bf extends bm {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f7246a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f7247b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ bn f7248c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j10, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f7248c = bnVar;
        this.f7246a = j10;
        this.f7247b = taskCompletionSource2;
    }

    public final void b() {
        if (!bn.k(this.f7248c)) {
            try {
                bn bnVar = this.f7248c;
                ((q) bnVar.f7268a.f14682n).u(bn.b(bnVar, this.f7246a, 0), new bl(this.f7248c, this.f7247b));
            } catch (RemoteException e10) {
                bn bnVar2 = this.f7248c;
                long j10 = this.f7246a;
                bnVar2.f7269b.a("warmUpIntegrityToken(%s)", e10, Long.valueOf(j10));
                this.f7247b.trySetException(new StandardIntegrityException(-100, e10));
            }
        } else {
            super.a(new StandardIntegrityException(-2, (Throwable) null));
        }
    }
}
