package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class br extends StandardIntegrityManager.StandardIntegrityToken {

    /* renamed from: a  reason: collision with root package name */
    private final String f7279a;

    /* renamed from: b  reason: collision with root package name */
    private final y f7280b;

    public br(String str, y yVar) {
        this.f7279a = str;
        this.f7280b = yVar;
    }

    public final Task<Integer> showDialog(Activity activity, int i10) {
        return this.f7280b.a(activity, i10);
    }

    public final String token() {
        return this.f7279a;
    }
}
