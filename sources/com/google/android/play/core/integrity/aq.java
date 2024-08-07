package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class aq extends IntegrityTokenResponse {

    /* renamed from: a  reason: collision with root package name */
    private final String f7220a;

    /* renamed from: b  reason: collision with root package name */
    private final y f7221b;

    public aq(String str, y yVar) {
        this.f7220a = str;
        this.f7221b = yVar;
    }

    public final Task<Integer> showDialog(Activity activity, int i10) {
        return this.f7221b.a(activity, i10);
    }

    public final String token() {
        return this.f7220a;
    }
}
