package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class aa implements IntegrityManager {

    /* renamed from: a  reason: collision with root package name */
    private final aj f7187a;

    public aa(aj ajVar) {
        this.f7187a = ajVar;
    }

    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f7187a.c(integrityTokenRequest);
    }
}
