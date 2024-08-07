package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class bt {

    /* renamed from: a  reason: collision with root package name */
    private final bn f7284a;

    public bt(bn bnVar) {
        this.f7284a = bnVar;
    }

    public final /* synthetic */ Task a(long j10, long j11, int i10, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f7284a.d(standardIntegrityTokenRequest.a(), j10, j11, 0);
    }
}
