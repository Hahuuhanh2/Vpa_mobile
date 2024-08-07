package com.google.android.play.core.integrity;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import m9.b;
import s8.a0;
import s8.e;
import s8.m;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class bn {

    /* renamed from: a  reason: collision with root package name */
    public final e f7268a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final a0 f7269b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f7270c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final TaskCompletionSource f7271d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final at f7272e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final k f7273f;

    public bn(Context context, a0 a0Var, at atVar, k kVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f7271d = taskCompletionSource;
        this.f7270c = context.getPackageName();
        this.f7269b = a0Var;
        this.f7272e = atVar;
        this.f7273f = kVar;
        e eVar = new e(context, a0Var, "ExpressIntegrityService", bo.f7274a, bd.f7243a);
        this.f7268a = eVar;
        eVar.a().post(new be(this, taskCompletionSource, context));
    }

    public static Bundle a(bn bnVar, String str, long j10, long j11, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f7270c);
        bundle.putLong("cloud.prj", j10);
        bundle.putString("nonce", str);
        bundle.putLong("warm.up.sid", j11);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new m(5, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(b.a(arrayList)));
        return bundle;
    }

    public static Bundle b(bn bnVar, long j10, int i10) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", bnVar.f7270c);
        bundle.putLong("cloud.prj", j10);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        bundle.putInt("webview.request.mode", 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new m(4, System.currentTimeMillis()));
        bundle.putParcelableArrayList("event_timestamps", new ArrayList(b.a(arrayList)));
        return bundle;
    }

    public static /* bridge */ /* synthetic */ boolean k(bn bnVar) {
        if (!bnVar.f7271d.getTask().isSuccessful() || ((Integer) bnVar.f7271d.getTask().getResult()).intValue() != 0) {
            return false;
        }
        return true;
    }

    public final Task c(Activity activity, Bundle bundle) {
        int i10 = bundle.getInt("dialog.intent.type");
        this.f7269b.b("requestAndShowDialog(%s)", Integer.valueOf(i10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f7268a.c(new bh(this, taskCompletionSource, bundle, activity, taskCompletionSource, i10), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task d(String str, long j10, long j11, int i10) {
        this.f7269b.b("requestExpressIntegrityToken(%s)", Long.valueOf(j11));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f7268a.c(new bg(this, taskCompletionSource, 0, str, j10, j11, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }

    public final Task e(long j10, int i10) {
        this.f7269b.b("warmUpIntegrityToken(%s)", Long.valueOf(j10));
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f7268a.c(new bf(this, taskCompletionSource, 0, j10, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
