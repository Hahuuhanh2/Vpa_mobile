package j7;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class c {

    /* renamed from: b  reason: collision with root package name */
    public static final c f11720b = new c();

    /* renamed from: a  reason: collision with root package name */
    public b f11721a = null;

    public static b a(Context context) {
        b bVar;
        c cVar = f11720b;
        synchronized (cVar) {
            if (cVar.f11721a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                cVar.f11721a = new b(context);
            }
            bVar = cVar.f11721a;
        }
        return bVar;
    }
}
