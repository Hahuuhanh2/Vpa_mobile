package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.b0;
import s8.v;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class af extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ byte[] f7191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Long f7192b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f7193c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ IntegrityTokenRequest f7194d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ aj f7195e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f7195e = ajVar;
        this.f7191a = bArr;
        this.f7192b = l10;
        this.f7193c = taskCompletionSource2;
        this.f7194d = integrityTokenRequest;
    }

    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    public final void b() {
        try {
            aj ajVar = this.f7195e;
            ((v) ajVar.f7205a.f14682n).h(aj.a(ajVar, this.f7191a, this.f7192b, (Parcelable) null), new ai(this.f7195e, this.f7193c));
        } catch (RemoteException e10) {
            aj ajVar2 = this.f7195e;
            IntegrityTokenRequest integrityTokenRequest = this.f7194d;
            ajVar2.f7206b.a("requestIntegrityToken(%s)", e10, integrityTokenRequest);
            this.f7193c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
