package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.e;
import s8.q;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class bh extends bm {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f7254a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f7255b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f7256c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7257d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ bn f7258e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.f7258e = bnVar;
        this.f7254a = bundle;
        this.f7255b = activity;
        this.f7256c = taskCompletionSource2;
        this.f7257d = i10;
    }

    public final void b() {
        if (bn.k(this.f7258e)) {
            super.a(new StandardIntegrityException(-2, (Throwable) null));
            return;
        }
        try {
            bn bnVar = this.f7258e;
            e eVar = bnVar.f7268a;
            ((q) eVar.f14682n).a(this.f7254a, bnVar.f7272e.a(this.f7255b, this.f7256c, eVar));
        } catch (RemoteException e10) {
            bn bnVar2 = this.f7258e;
            int i10 = this.f7257d;
            bnVar2.f7269b.a("requestAndShowDialog(%s)", e10, Integer.valueOf(i10));
            this.f7256c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
