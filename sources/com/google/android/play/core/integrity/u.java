package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class u implements av {

    /* renamed from: a  reason: collision with root package name */
    private Context f7304a;

    private u() {
    }

    public /* synthetic */ u(t tVar) {
    }

    public final u a(Context context) {
        context.getClass();
        this.f7304a = context;
        return this;
    }

    public final aw b() {
        Context context = this.f7304a;
        Class<Context> cls = Context.class;
        if (context != null) {
            return new w(context, (v) null);
        }
        throw new IllegalStateException(String.valueOf(cls.getCanonicalName()).concat(" must be set"));
    }
}
