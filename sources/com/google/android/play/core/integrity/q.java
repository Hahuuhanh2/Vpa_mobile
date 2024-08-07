package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class q implements x {

    /* renamed from: a  reason: collision with root package name */
    private Context f7297a;

    private q() {
    }

    public /* synthetic */ q(p pVar) {
    }

    public final q a(Context context) {
        context.getClass();
        this.f7297a = context;
        return this;
    }

    public final s b() {
        Context context = this.f7297a;
        Class<Context> cls = Context.class;
        if (context != null) {
            return new s(context, (r) null);
        }
        throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
