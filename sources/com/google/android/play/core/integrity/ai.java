package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.a0;
import s8.w;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class ai extends w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ aj f7202a;

    /* renamed from: b  reason: collision with root package name */
    private final a0 f7203b = new a0("OnRequestIntegrityTokenCallback");

    /* renamed from: c  reason: collision with root package name */
    private final TaskCompletionSource f7204c;

    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        this.f7202a = ajVar;
        this.f7204c = taskCompletionSource;
    }

    public final void b(Bundle bundle) {
        this.f7202a.f7205a.d(this.f7204c);
        this.f7203b.b("onRequestIntegrityToken", new Object[0]);
        ApiException a10 = this.f7202a.f7209e.a(bundle);
        if (a10 != null) {
            this.f7204c.trySetException(a10);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f7204c.trySetException(new IntegrityServiceException(-100, (Throwable) null));
            return;
        }
        ah ahVar = new ah(this, this.f7202a.f7207c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.f7204c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
