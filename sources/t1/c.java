package t1;

import android.graphics.Typeface;
import android.os.Handler;
import n1.h;
import p3.l0;
import t1.k;

/* compiled from: CallbackWithHandler */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final l0 f14759a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f14760b;

    public c(h.a aVar, Handler handler) {
        this.f14759a = aVar;
        this.f14760b = handler;
    }

    public final void a(k.a aVar) {
        boolean z10;
        int i10 = aVar.f14783b;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            Typeface typeface = aVar.f14782a;
            this.f14760b.post(new a(this.f14759a, typeface));
            return;
        }
        this.f14760b.post(new b(this.f14759a, i10));
    }
}
