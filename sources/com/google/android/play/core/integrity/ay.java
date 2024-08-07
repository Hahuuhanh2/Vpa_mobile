package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final /* synthetic */ class ay implements SuccessContinuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ az f7234a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StandardIntegrityManager.PrepareIntegrityTokenRequest f7235b;

    public /* synthetic */ ay(az azVar, StandardIntegrityManager.PrepareIntegrityTokenRequest prepareIntegrityTokenRequest) {
        this.f7234a = azVar;
        this.f7235b = prepareIntegrityTokenRequest;
    }

    public final Task then(Object obj) {
        return this.f7234a.a(this.f7235b, (Long) obj);
    }
}
