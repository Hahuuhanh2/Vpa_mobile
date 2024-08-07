package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class ax {

    /* renamed from: a  reason: collision with root package name */
    private static aw f7233a;

    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            if (f7233a == null) {
                u uVar = new u((t) null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                f7233a = uVar.b();
            }
            awVar = f7233a;
        }
        return awVar;
    }
}
