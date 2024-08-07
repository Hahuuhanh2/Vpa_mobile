package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.b0;
import s8.v;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class ag extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Bundle f7196a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Activity f7197b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f7198c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f7199d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ aj f7200e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(taskCompletionSource);
        this.f7200e = ajVar;
        this.f7196a = bundle;
        this.f7197b = activity;
        this.f7198c = taskCompletionSource2;
        this.f7199d = i10;
    }

    public final void b() {
        try {
            aj ajVar = this.f7200e;
            ((v) ajVar.f7205a.f14682n).a(this.f7196a, ajVar.f7208d.a(this.f7197b, this.f7198c, ajVar.f7205a));
        } catch (RemoteException e10) {
            aj ajVar2 = this.f7200e;
            int i10 = this.f7199d;
            ajVar2.f7206b.a("requestAndShowDialog(%s)", e10, Integer.valueOf(i10));
            this.f7198c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
