package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.q;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class bg extends bm {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f7249a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f7250b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7251c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f7252d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ bn f7253e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, String str, long j10, long j11, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f7253e = bnVar;
        this.f7249a = str;
        this.f7250b = j10;
        this.f7251c = j11;
        this.f7252d = taskCompletionSource2;
    }

    public final void b() {
        if (!bn.k(this.f7253e)) {
            try {
                bn bnVar = this.f7253e;
                ((q) bnVar.f7268a.f14682n).b(bn.a(bnVar, this.f7249a, this.f7250b, this.f7251c, 0), new bk(this.f7253e, this.f7252d, this.f7250b));
            } catch (RemoteException e10) {
                bn bnVar2 = this.f7253e;
                String str = this.f7249a;
                bnVar2.f7269b.a("requestExpressIntegrityToken(%s, %s)", e10, str, Long.valueOf(this.f7250b));
                this.f7252d.trySetException(new StandardIntegrityException(-100, e10));
            }
        } else {
            super.a(new StandardIntegrityException(-2, (Throwable) null));
        }
    }
}
