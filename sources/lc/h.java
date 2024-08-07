package lc;

import android.content.Context;
import ca.k;
import y6.j;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final Object f12913b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static h f12914c;

    /* renamed from: a  reason: collision with root package name */
    public k f12915a;

    public static h c() {
        boolean z10;
        h hVar;
        synchronized (f12913b) {
            if (f12914c != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            j.h("MlKitContext has not been initialized", z10);
            hVar = f12914c;
            j.f(hVar);
        }
        return hVar;
    }

    public final <T> T a(Class<T> cls) {
        boolean z10;
        if (f12914c == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.h("MlKitContext has been deleted", z10);
        j.f(this.f12915a);
        return this.f12915a.a(cls);
    }

    public final Context b() {
        return (Context) a(Context.class);
    }
}
