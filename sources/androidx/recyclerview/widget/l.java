package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSmoothScroller */
public class l extends RecyclerView.v {

    /* renamed from: h  reason: collision with root package name */
    public final LinearInterpolator f3279h = new LinearInterpolator();

    /* renamed from: i  reason: collision with root package name */
    public final DecelerateInterpolator f3280i = new DecelerateInterpolator();
    @SuppressLint({"UnknownNullness"})

    /* renamed from: j  reason: collision with root package name */
    public PointF f3281j;

    /* renamed from: k  reason: collision with root package name */
    public final DisplayMetrics f3282k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f3283l = false;

    /* renamed from: m  reason: collision with root package name */
    public float f3284m;

    /* renamed from: n  reason: collision with root package name */
    public int f3285n = 0;

    /* renamed from: o  reason: collision with root package name */
    public int f3286o = 0;

    @SuppressLint({"UnknownNullness"})
    public l(Context context) {
        this.f3282k = context.getResources().getDisplayMetrics();
    }

    @SuppressLint({"UnknownNullness"})
    public final void c(int i10, int i11, RecyclerView.v.a aVar) {
        if (this.f3085b.f2994u.H() == 0) {
            g();
            return;
        }
        int i12 = this.f3285n;
        int i13 = i12 - i10;
        int i14 = 0;
        if (i12 * i13 <= 0) {
            i13 = 0;
        }
        this.f3285n = i13;
        int i15 = this.f3286o;
        int i16 = i15 - i11;
        if (i15 * i16 > 0) {
            i14 = i16;
        }
        this.f3286o = i14;
        if (i13 == 0 && i14 == 0) {
            PointF a10 = a(this.f3084a);
            if (a10 != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    float f11 = a10.y;
                    float sqrt = (float) Math.sqrt((double) ((f11 * f11) + (f10 * f10)));
                    float f12 = a10.x / sqrt;
                    a10.x = f12;
                    float f13 = a10.y / sqrt;
                    a10.y = f13;
                    this.f3281j = a10;
                    this.f3285n = (int) (f12 * 10000.0f);
                    this.f3286o = (int) (f13 * 10000.0f);
                    int m10 = m(10000);
                    LinearInterpolator linearInterpolator = this.f3279h;
                    aVar.f3091a = (int) (((float) this.f3285n) * 1.2f);
                    aVar.f3092b = (int) (((float) this.f3286o) * 1.2f);
                    aVar.f3093c = (int) (((float) m10) * 1.2f);
                    aVar.f3095e = linearInterpolator;
                    aVar.f3096f = true;
                    return;
                }
            }
            aVar.f3094d = this.f3084a;
            g();
        }
    }

    public final void d() {
    }

    public final void e() {
        this.f3286o = 0;
        this.f3285n = 0;
        this.f3281j = null;
    }

    @SuppressLint({"UnknownNullness"})
    public void f(View view, RecyclerView.v.a aVar) {
        int i10;
        int i11;
        int i12;
        PointF pointF = this.f3281j;
        int i13 = -1;
        if (pointF == null || pointF.x == 0.0f) {
            i10 = 0;
        } else if (i12 > 0) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i14 = i(i10, view);
        PointF pointF2 = this.f3281j;
        if (pointF2 == null || pointF2.y == 0.0f) {
            i13 = 0;
        } else if (i11 > 0) {
            i13 = 1;
        }
        int j10 = j(i13, view);
        int l10 = l((int) Math.sqrt((double) ((j10 * j10) + (i14 * i14))));
        if (l10 > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f3280i;
            aVar.f3091a = -i14;
            aVar.f3092b = -j10;
            aVar.f3093c = l10;
            aVar.f3095e = decelerateInterpolator;
            aVar.f3096f = true;
        }
    }

    public int h(int i10, int i11, int i12, int i13, int i14) {
        if (i14 == -1) {
            return i12 - i10;
        }
        if (i14 == 0) {
            int i15 = i12 - i10;
            if (i15 > 0) {
                return i15;
            }
            int i16 = i13 - i11;
            if (i16 < 0) {
                return i16;
            }
            return 0;
        } else if (i14 == 1) {
            return i13 - i11;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    @SuppressLint({"UnknownNullness"})
    public int i(int i10, View view) {
        RecyclerView.m mVar = this.f3086c;
        if (mVar == null || !mVar.o()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return h((view.getLeft() - RecyclerView.m.N(view)) - layoutParams.leftMargin, RecyclerView.m.Q(view) + view.getRight() + layoutParams.rightMargin, mVar.getPaddingLeft(), mVar.f3060v - mVar.getPaddingRight(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    public int j(int i10, View view) {
        RecyclerView.m mVar = this.f3086c;
        if (mVar == null || !mVar.p()) {
            return 0;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return h((view.getTop() - RecyclerView.m.S(view)) - layoutParams.topMargin, RecyclerView.m.F(view) + view.getBottom() + layoutParams.bottomMargin, mVar.getPaddingTop(), mVar.f3061w - mVar.getPaddingBottom(), i10);
    }

    @SuppressLint({"UnknownNullness"})
    public float k(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    public final int l(int i10) {
        return (int) Math.ceil(((double) m(i10)) / 0.3356d);
    }

    public int m(int i10) {
        float abs = (float) Math.abs(i10);
        if (!this.f3283l) {
            this.f3284m = k(this.f3282k);
            this.f3283l = true;
        }
        return (int) Math.ceil((double) (abs * this.f3284m));
    }
}
