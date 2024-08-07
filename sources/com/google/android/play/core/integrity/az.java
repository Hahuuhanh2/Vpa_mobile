package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class az implements StandardIntegrityManager {

    /* renamed from: a  reason: collision with root package name */
    private final bn f7236a;

    /* renamed from: b  reason: collision with root package name */
    private final bt f7237b;

    public az(bn bnVar, bt btVar) {
        this.f7236a = bnVar;
        this.f7237b = btVar;
    }

    public final /* synthetic */ Task a(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest, Long l10) {
        long b10 = prepareIntegrityTokenRequest.b();
        long longValue = l10.longValue();
        prepareIntegrityTokenRequest.a();
        return Tasks.forResult(new bs(this.f7237b, b10, longValue, 0));
    }

    public final Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        long b10 = prepareIntegrityTokenRequest.b();
        prepareIntegrityTokenRequest.a();
        return this.f7236a.e(b10, 0).onSuccessTask(new ay(this, prepareIntegrityTokenRequest));
    }
}
