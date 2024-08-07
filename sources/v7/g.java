package v7;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import t7.b;
import w1.v0;
import w1.w0;

/* compiled from: InsetsAnimationCallback */
public final class g extends v0.b {

    /* renamed from: c  reason: collision with root package name */
    public final View f16081c;

    /* renamed from: d  reason: collision with root package name */
    public int f16082d;

    /* renamed from: e  reason: collision with root package name */
    public int f16083e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f16084f = new int[2];

    public g(View view) {
        this.f16081c = view;
    }

    public final w0 a(w0 w0Var, List<v0> list) {
        Iterator<v0> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            v0 next = it.next();
            if ((next.f16356a.c() & 8) != 0) {
                int i10 = this.f16083e;
                this.f16081c.setTranslationY((float) b.b(next.f16356a.b(), i10, 0));
                break;
            }
        }
        return w0Var;
    }
}
