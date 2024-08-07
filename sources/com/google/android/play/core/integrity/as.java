package com.google.android.play.core.integrity;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import s8.a0;
import s8.e;
import s8.y;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class as extends y {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource f7223a;

    /* renamed from: b  reason: collision with root package name */
    public final e f7224b;

    /* renamed from: c  reason: collision with root package name */
    private final a0 f7225c = new a0("RequestDialogCallbackImpl");

    /* renamed from: d  reason: collision with root package name */
    private final String f7226d;

    /* renamed from: e  reason: collision with root package name */
    private final k f7227e;

    /* renamed from: f  reason: collision with root package name */
    private final Activity f7228f;

    public as(Context context, k kVar, Activity activity, TaskCompletionSource taskCompletionSource, e eVar) {
        this.f7226d = context.getPackageName();
        this.f7227e = kVar;
        this.f7223a = taskCompletionSource;
        this.f7228f = activity;
        this.f7224b = eVar;
    }

    public final void b(Bundle bundle) {
        this.f7224b.d(this.f7223a);
        this.f7225c.b("onRequestDialog(%s)", this.f7226d);
        ApiException a10 = this.f7227e.a(bundle);
        if (a10 != null) {
            this.f7223a.trySetException(a10);
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("dialog.intent");
        if (pendingIntent == null) {
            a0 a0Var = this.f7225c;
            Object[] objArr = {this.f7226d};
            a0Var.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                a0.c(a0Var.f14658a, "onRequestDialog(%s): got null dialog intent", objArr);
            }
            this.f7223a.trySetResult(0);
            return;
        }
        Intent intent = new Intent(this.f7228f, PlayCoreDialogWrapperActivity.class);
        intent.putExtra("confirmation_intent", pendingIntent);
        intent.setFlags(536870912);
        intent.putExtra("result_receiver", new ar(this, this.f7224b.a()));
        a0 a0Var2 = this.f7225c;
        Object[] objArr2 = new Object[0];
        a0Var2.getClass();
        if (Log.isLoggable("PlayCore", 3)) {
            a0.c(a0Var2.f14658a, "Starting dialog intent...", objArr2);
        }
        this.f7228f.startActivityForResult(intent, 0);
    }
}
