package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final /* synthetic */ class bs implements StandardIntegrityManager.StandardIntegrityTokenProvider {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ bt f7281a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f7282b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f7283c;

    public /* synthetic */ bs(bt btVar, long j10, long j11, int i10) {
        this.f7281a = btVar;
        this.f7282b = j10;
        this.f7283c = j11;
    }

    public final Task request(StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest) {
        return this.f7281a.a(this.f7282b, this.f7283c, 0, standardIntegrityTokenRequest);
    }
}
