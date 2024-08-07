package com.google.android.gms.common.api;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.WeakHashMap;
import v6.e;
import w6.j;

@Deprecated
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class c {

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface a extends w6.c {
    }

    @Deprecated
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface b extends j {
    }

    static {
        Collections.newSetFromMap(new WeakHashMap());
    }

    public <A extends a.b, R extends e, T extends com.google.android.gms.common.api.internal.a<R, A>> T a(T t10) {
        throw new UnsupportedOperationException();
    }

    public Looper b() {
        throw new UnsupportedOperationException();
    }

    public void c() {
        throw new UnsupportedOperationException();
    }

    public void d() {
        throw new UnsupportedOperationException();
    }
}
