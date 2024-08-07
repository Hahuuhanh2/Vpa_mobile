package l8;

import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import l8.h;
import l8.n;

/* compiled from: ShapeableDelegate */
public abstract class r {

    /* renamed from: a  reason: collision with root package name */
    public boolean f12888a = false;

    /* renamed from: b  reason: collision with root package name */
    public boolean f12889b = false;

    /* renamed from: c  reason: collision with root package name */
    public m f12890c;

    /* renamed from: d  reason: collision with root package name */
    public RectF f12891d = new RectF();

    /* renamed from: e  reason: collision with root package name */
    public final Path f12892e = new Path();

    public abstract void a(View view);

    public abstract boolean b();

    public final void c() {
        boolean z10;
        m mVar;
        RectF rectF = this.f12891d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && (mVar = this.f12890c) != null) {
            n.a.f12861a.a(mVar, 1.0f, rectF, (h.a) null, this.f12892e);
        }
    }
}
