package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.a0;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class bk extends bi {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ bn f7262c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f7263d = new a0("OnRequestIntegrityTokenCallback");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final long f7264e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bk(bn bnVar, TaskCompletionSource taskCompletionSource, long j10) {
        super(bnVar, taskCompletionSource);
        this.f7262c = bnVar;
        this.f7264e = j10;
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        this.f7263d.b("onRequestExpressIntegrityToken", new Object[0]);
        ApiException a10 = this.f7262c.f7273f.a(bundle);
        if (a10 != null) {
            this.f7259a.trySetException(a10);
            return;
        }
        bj bjVar = new bj(this, this.f7262c.f7270c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f7259a;
        b bVar = new b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
