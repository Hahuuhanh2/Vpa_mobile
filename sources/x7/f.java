package x7;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: CarouselOrientationHelper */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public final int f17084a;

    public f(int i10) {
        this.f17084a = i10;
    }

    public abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract float b(RecyclerView.LayoutParams layoutParams);

    public abstract RectF c(float f10, float f11, float f12, float f13);

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract void j(View view, int i10, int i11);

    public abstract void k(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void l(float f10, float f11, Rect rect, View view);
}
