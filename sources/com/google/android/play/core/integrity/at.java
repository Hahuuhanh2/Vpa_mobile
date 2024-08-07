package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.e;
import s8.j;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class at {

    /* renamed from: a  reason: collision with root package name */
    private final j f7229a;

    /* renamed from: b  reason: collision with root package name */
    private final j f7230b;

    public at(j jVar, j jVar2) {
        this.f7229a = jVar;
        this.f7230b = jVar2;
    }

    public final as a(Activity activity, TaskCompletionSource taskCompletionSource, e eVar) {
        Object a10 = this.f7229a.a();
        a10.getClass();
        k kVar = (k) this.f7230b.a();
        kVar.getClass();
        activity.getClass();
        eVar.getClass();
        return new as((Context) a10, kVar, activity, taskCompletionSource, eVar);
    }
}
