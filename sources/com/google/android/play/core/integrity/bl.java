package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.a0;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class bl extends bi {

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ bn f7265c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f7266d = new a0("OnWarmUpIntegrityTokenCallback");

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.f7265c = bnVar;
    }

    public final void e(Bundle bundle) {
        super.e(bundle);
        this.f7266d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException a10 = this.f7265c.f7273f.a(bundle);
        if (a10 != null) {
            this.f7259a.trySetException(a10);
        } else {
            this.f7259a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
