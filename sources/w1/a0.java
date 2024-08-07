package w1;

import android.text.TextUtils;
import android.view.View;
import w1.d0;

/* compiled from: ViewCompat */
public final class a0 extends d0.b<CharSequence> {
    public a0(int i10, Class cls) {
        super(i10, cls, 8, 28);
    }

    public final Object b(View view) {
        return d0.m.b(view);
    }

    public final void c(View view, Object obj) {
        d0.m.h(view, (CharSequence) obj);
    }

    public final boolean f(Object obj, Object obj2) {
        return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
    }
}
