package com.google.android.play.core.integrity;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.google.android.gms.tasks.TaskCompletionSource;
import s8.a0;
import s8.b0;
import s8.f;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class be extends b0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f7244a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ bn f7245b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f7245b = bnVar;
        this.f7244a = context;
    }

    public final void b() {
        int i10;
        Context context = this.f7244a;
        TaskCompletionSource f10 = this.f7245b.f7271d;
        a0 a0Var = f.f14686a;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 64);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo != null && applicationInfo.enabled && f.a(packageInfo.signatures)) {
                i10 = packageInfo.versionCode;
                f10.trySetResult(Integer.valueOf(i10));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        i10 = 0;
        f10.trySetResult(Integer.valueOf(i10));
    }
}
