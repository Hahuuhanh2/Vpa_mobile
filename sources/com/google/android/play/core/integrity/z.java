package com.google.android.play.core.integrity;

import android.content.Context;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
final class z {

    /* renamed from: a  reason: collision with root package name */
    private static s f7317a;

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            if (f7317a == null) {
                q qVar = new q((p) null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                qVar.a(context);
                f7317a = qVar.b();
            }
            sVar = f7317a;
        }
        return sVar;
    }
}
