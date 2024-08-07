package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class bj extends y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ bk f7261a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bj(bk bkVar, String str, long j10) {
        super(str, j10);
        this.f7261a = bkVar;
    }

    public final Task b(Activity activity, Bundle bundle) {
        bundle.putLong("cloud.prj", this.f7261a.f7264e);
        return this.f7261a.f7262c.c(activity, bundle);
    }
}
