package w1;

import android.view.View;
import w1.d0;

/* compiled from: ViewCompat */
public final class c0 extends d0.b<Boolean> {
    public c0(int i10) {
        super(i10, Boolean.class, 0, 28);
    }

    public final Object b(View view) {
        return Boolean.valueOf(d0.m.c(view));
    }

    public final void c(View view, Object obj) {
        d0.m.g(view, ((Boolean) obj).booleanValue());
    }

    public final boolean f(Object obj, Object obj2) {
        return !d0.b.a((Boolean) obj, (Boolean) obj2);
    }
}
