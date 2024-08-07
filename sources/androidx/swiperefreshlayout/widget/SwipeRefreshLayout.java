package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.ots.core.base.BaseRecyclerView;
import g3.d;
import g3.g;
import g3.h;
import java.util.WeakHashMap;
import sk.j;
import w1.d0;
import w1.l;
import w1.m;
import w1.p;
import w1.q0;

public class SwipeRefreshLayout extends ViewGroup implements l {
    public static final int[] T = {16842766};
    public g3.a A;
    public int B;
    public int C;
    public float D;
    public int E;
    public int F;
    public int G;
    public g3.d H;
    public g3.e I;
    public g3.f J;
    public g K;
    public g L;
    public h M;
    public boolean N;
    public int O;
    public boolean P;
    public a Q;
    public final c R;
    public final d S;

    /* renamed from: a  reason: collision with root package name */
    public View f3366a;

    /* renamed from: b  reason: collision with root package name */
    public f f3367b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3368c;

    /* renamed from: d  reason: collision with root package name */
    public int f3369d;

    /* renamed from: e  reason: collision with root package name */
    public float f3370e;

    /* renamed from: f  reason: collision with root package name */
    public float f3371f;

    /* renamed from: n  reason: collision with root package name */
    public final p f3372n;

    /* renamed from: o  reason: collision with root package name */
    public final m f3373o;

    /* renamed from: p  reason: collision with root package name */
    public final int[] f3374p;

    /* renamed from: q  reason: collision with root package name */
    public final int[] f3375q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3376r;

    /* renamed from: s  reason: collision with root package name */
    public int f3377s;

    /* renamed from: t  reason: collision with root package name */
    public int f3378t;

    /* renamed from: u  reason: collision with root package name */
    public float f3379u;

    /* renamed from: v  reason: collision with root package name */
    public float f3380v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f3381w;

    /* renamed from: x  reason: collision with root package name */
    public int f3382x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f3383y;

    /* renamed from: z  reason: collision with root package name */
    public final DecelerateInterpolator f3384z;

    public class a implements Animation.AnimationListener {
        public a() {
        }

        public final void onAnimationEnd(Animation animation) {
            f fVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f3368c) {
                swipeRefreshLayout.H.setAlpha(255);
                SwipeRefreshLayout.this.H.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.N && (fVar = swipeRefreshLayout2.f3367b) != null) {
                    BaseRecyclerView baseRecyclerView = (BaseRecyclerView) ((ea.c) fVar).f9330b;
                    int i10 = BaseRecyclerView.f8338p;
                    j.f(baseRecyclerView, "this$0");
                    baseRecyclerView.c();
                    baseRecyclerView.f8344f.invoke();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f3378t = swipeRefreshLayout3.A.getTop();
                return;
            }
            swipeRefreshLayout.f();
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    public class b implements Animation.AnimationListener {
        public b() {
        }

        public final void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f3383y) {
                g3.f fVar = new g3.f(swipeRefreshLayout);
                swipeRefreshLayout.J = fVar;
                fVar.setDuration(150);
                g3.a aVar = swipeRefreshLayout.A;
                aVar.f10297a = null;
                aVar.clearAnimation();
                swipeRefreshLayout.A.startAnimation(swipeRefreshLayout.J);
            }
        }

        public final void onAnimationRepeat(Animation animation) {
        }

        public final void onAnimationStart(Animation animation) {
        }
    }

    public class c extends Animation {
        public c() {
        }

        public final void applyTransformation(float f10, Transformation transformation) {
            int i10;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.P) {
                i10 = swipeRefreshLayout.F - Math.abs(swipeRefreshLayout.E);
            } else {
                i10 = swipeRefreshLayout.F;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i11 = swipeRefreshLayout2.C;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i11 + ((int) (((float) (i10 - i11)) * f10))) - swipeRefreshLayout2.A.getTop());
            g3.d dVar = SwipeRefreshLayout.this.H;
            float f11 = 1.0f - f10;
            d.a aVar = dVar.f10305a;
            if (f11 != aVar.f10326p) {
                aVar.f10326p = f11;
            }
            dVar.invalidateSelf();
        }
    }

    public class d extends Animation {
        public d() {
        }

        public final void applyTransformation(float f10, Transformation transformation) {
            SwipeRefreshLayout.this.e(f10);
        }
    }

    public interface e {
        boolean a();
    }

    public interface f {
    }

    static {
        Class<SwipeRefreshLayout> cls = SwipeRefreshLayout.class;
    }

    public SwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setColorViewAlpha(int i10) {
        this.A.getBackground().setAlpha(i10);
        this.H.setAlpha(i10);
    }

    public final boolean a() {
        View view = this.f3366a;
        if (view instanceof ListView) {
            return androidx.core.widget.h.a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f3366a == null) {
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (!childAt.equals(this.A)) {
                    this.f3366a = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f10) {
        if (f10 > this.f3370e) {
            g(true, true);
            return;
        }
        this.f3368c = false;
        g3.d dVar = this.H;
        d.a aVar = dVar.f10305a;
        aVar.f10315e = 0.0f;
        aVar.f10316f = 0.0f;
        dVar.invalidateSelf();
        b bVar = null;
        boolean z10 = this.f3383y;
        if (!z10) {
            bVar = new b();
        }
        int i10 = this.f3378t;
        if (z10) {
            this.C = i10;
            this.D = this.A.getScaleX();
            h hVar = new h(this);
            this.M = hVar;
            hVar.setDuration(150);
            if (bVar != null) {
                this.A.f10297a = bVar;
            }
            this.A.clearAnimation();
            this.A.startAnimation(this.M);
        } else {
            this.C = i10;
            this.S.reset();
            this.S.setDuration(200);
            this.S.setInterpolator(this.f3384z);
            if (bVar != null) {
                this.A.f10297a = bVar;
            }
            this.A.clearAnimation();
            this.A.startAnimation(this.S);
        }
        g3.d dVar2 = this.H;
        d.a aVar2 = dVar2.f10305a;
        if (aVar2.f10324n) {
            aVar2.f10324n = false;
        }
        dVar2.invalidateSelf();
    }

    public final void d(float f10) {
        g3.d dVar = this.H;
        d.a aVar = dVar.f10305a;
        boolean z10 = true;
        if (!aVar.f10324n) {
            aVar.f10324n = true;
        }
        dVar.invalidateSelf();
        float min = Math.min(1.0f, Math.abs(f10 / this.f3370e));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f10) - this.f3370e;
        int i10 = this.G;
        if (i10 <= 0) {
            if (this.P) {
                i10 = this.F - this.E;
            } else {
                i10 = this.F;
            }
        }
        float f11 = (float) i10;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f11 * 2.0f) / f11) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i11 = this.E + ((int) ((f11 * min) + (f11 * pow * 2.0f)));
        if (this.A.getVisibility() != 0) {
            this.A.setVisibility(0);
        }
        if (!this.f3383y) {
            this.A.setScaleX(1.0f);
            this.A.setScaleY(1.0f);
        }
        if (this.f3383y) {
            setAnimationProgress(Math.min(1.0f, f10 / this.f3370e));
        }
        if (f10 < this.f3370e) {
            if (this.H.f10305a.f10330t > 76) {
                g gVar = this.K;
                if (gVar == null || !gVar.hasStarted() || gVar.hasEnded()) {
                    z10 = false;
                }
                if (!z10) {
                    g gVar2 = new g(this, this.H.f10305a.f10330t, 76);
                    gVar2.setDuration(300);
                    g3.a aVar2 = this.A;
                    aVar2.f10297a = null;
                    aVar2.clearAnimation();
                    this.A.startAnimation(gVar2);
                    this.K = gVar2;
                }
            }
        } else if (this.H.f10305a.f10330t < 255) {
            g gVar3 = this.L;
            if (gVar3 == null || !gVar3.hasStarted() || gVar3.hasEnded()) {
                z10 = false;
            }
            if (!z10) {
                g gVar4 = new g(this, this.H.f10305a.f10330t, 255);
                gVar4.setDuration(300);
                g3.a aVar3 = this.A;
                aVar3.f10297a = null;
                aVar3.clearAnimation();
                this.A.startAnimation(gVar4);
                this.L = gVar4;
            }
        }
        g3.d dVar2 = this.H;
        float min2 = Math.min(0.8f, max * 0.8f);
        d.a aVar4 = dVar2.f10305a;
        aVar4.f10315e = 0.0f;
        aVar4.f10316f = min2;
        dVar2.invalidateSelf();
        g3.d dVar3 = this.H;
        float min3 = Math.min(1.0f, max);
        d.a aVar5 = dVar3.f10305a;
        if (min3 != aVar5.f10326p) {
            aVar5.f10326p = min3;
        }
        dVar3.invalidateSelf();
        g3.d dVar4 = this.H;
        dVar4.f10305a.f10317g = ((pow * 2.0f) + ((max * 0.4f) - 16.0f)) * 0.5f;
        dVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i11 - this.f3378t);
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f3373o.a(f10, f11, z10);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f3373o.b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return this.f3373o.c(i10, i11, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return this.f3373o.e(i10, i11, i12, i13, iArr, 0, (int[]) null);
    }

    public final void e(float f10) {
        int i10 = this.C;
        setTargetOffsetTopAndBottom((i10 + ((int) (((float) (this.E - i10)) * f10))) - this.A.getTop());
    }

    public final void f() {
        this.A.clearAnimation();
        this.H.stop();
        this.A.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f3383y) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.E - this.f3378t);
        }
        this.f3378t = this.A.getTop();
    }

    public final void g(boolean z10, boolean z11) {
        if (this.f3368c != z10) {
            this.N = z11;
            b();
            this.f3368c = z10;
            if (z10) {
                int i10 = this.f3378t;
                a aVar = this.Q;
                this.C = i10;
                this.R.reset();
                this.R.setDuration(200);
                this.R.setInterpolator(this.f3384z);
                if (aVar != null) {
                    this.A.f10297a = aVar;
                }
                this.A.clearAnimation();
                this.A.startAnimation(this.R);
                return;
            }
            a aVar2 = this.Q;
            g3.f fVar = new g3.f(this);
            this.J = fVar;
            fVar.setDuration(150);
            g3.a aVar3 = this.A;
            aVar3.f10297a = aVar2;
            aVar3.clearAnimation();
            this.A.startAnimation(this.J);
        }
    }

    public final int getChildDrawingOrder(int i10, int i11) {
        int i12 = this.B;
        if (i12 < 0) {
            return i11;
        }
        if (i11 == i10 - 1) {
            return i12;
        }
        if (i11 >= i12) {
            return i11 + 1;
        }
        return i11;
    }

    public int getNestedScrollAxes() {
        p pVar = this.f3372n;
        return pVar.f16346b | pVar.f16345a;
    }

    public int getProgressCircleDiameter() {
        return this.O;
    }

    public int getProgressViewEndOffset() {
        return this.F;
    }

    public int getProgressViewStartOffset() {
        return this.E;
    }

    public final void h(float f10) {
        float f11 = this.f3380v;
        int i10 = this.f3369d;
        if (f10 - f11 > ((float) i10) && !this.f3381w) {
            this.f3379u = f11 + ((float) i10);
            this.f3381w = true;
            this.H.setAlpha(76);
        }
    }

    public final boolean hasNestedScrollingParent() {
        if (this.f3373o.f(0) != null) {
            return true;
        }
        return false;
    }

    public final boolean isNestedScrollingEnabled() {
        return this.f3373o.f16339d;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int findPointerIndex;
        b();
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (!isEnabled() || a() || this.f3368c || this.f3376r) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i11 = this.f3382x;
                    if (i11 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i11)) < 0) {
                        return false;
                    }
                    h(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f3382x) {
                            if (actionIndex == 0) {
                                i10 = 1;
                            }
                            this.f3382x = motionEvent.getPointerId(i10);
                        }
                    }
                }
            }
            this.f3381w = false;
            this.f3382x = -1;
        } else {
            setTargetOffsetTopAndBottom(this.E - this.A.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f3382x = pointerId;
            this.f3381w = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f3380v = motionEvent.getY(findPointerIndex2);
        }
        return this.f3381w;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f3366a == null) {
                b();
            }
            View view = this.f3366a;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.A.getMeasuredWidth();
                int measuredHeight2 = this.A.getMeasuredHeight();
                int i14 = measuredWidth / 2;
                int i15 = measuredWidth2 / 2;
                int i16 = this.f3378t;
                this.A.layout(i14 - i15, i16, i14 + i15, measuredHeight2 + i16);
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f3366a == null) {
            b();
        }
        View view = this.f3366a;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.A.measure(View.MeasureSpec.makeMeasureSpec(this.O, 1073741824), View.MeasureSpec.makeMeasureSpec(this.O, 1073741824));
            this.B = -1;
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                if (getChildAt(i12) == this.A) {
                    this.B = i12;
                    return;
                }
            }
        }
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return dispatchNestedFling(f10, f11, z10);
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    public final void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        if (i11 > 0) {
            float f10 = this.f3371f;
            if (f10 > 0.0f) {
                float f11 = (float) i11;
                if (f11 > f10) {
                    iArr[1] = i11 - ((int) f10);
                    this.f3371f = 0.0f;
                } else {
                    this.f3371f = f10 - f11;
                    iArr[1] = i11;
                }
                d(this.f3371f);
            }
        }
        if (this.P && i11 > 0 && this.f3371f == 0.0f && Math.abs(i11 - iArr[1]) > 0) {
            this.A.setVisibility(8);
        }
        int[] iArr2 = this.f3374p;
        if (dispatchNestedPreScroll(i10 - iArr[0], i11 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public final void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        dispatchNestedScroll(i10, i11, i12, i13, this.f3375q);
        int i14 = i13 + this.f3375q[1];
        if (i14 < 0 && !a()) {
            float abs = this.f3371f + ((float) Math.abs(i14));
            this.f3371f = abs;
            d(abs);
        }
    }

    public final void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f3372n.f16345a = i10;
        startNestedScroll(i10 & 2);
        this.f3371f = 0.0f;
        this.f3376r = true;
    }

    public final boolean onStartNestedScroll(View view, View view2, int i10) {
        if (!isEnabled() || this.f3368c || (i10 & 2) == 0) {
            return false;
        }
        return true;
    }

    public final void onStopNestedScroll(View view) {
        this.f3372n.f16345a = 0;
        this.f3376r = false;
        float f10 = this.f3371f;
        if (f10 > 0.0f) {
            c(f10);
            this.f3371f = 0.0f;
        }
        stopNestedScroll();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 0;
        if (!isEnabled() || a() || this.f3368c || this.f3376r) {
            return false;
        }
        if (actionMasked == 0) {
            this.f3382x = motionEvent.getPointerId(0);
            this.f3381w = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f3382x);
            if (findPointerIndex < 0) {
                return false;
            }
            if (this.f3381w) {
                this.f3381w = false;
                c((motionEvent.getY(findPointerIndex) - this.f3379u) * 0.5f);
            }
            this.f3382x = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f3382x);
            if (findPointerIndex2 < 0) {
                return false;
            }
            float y10 = motionEvent.getY(findPointerIndex2);
            h(y10);
            if (this.f3381w) {
                float f10 = (y10 - this.f3379u) * 0.5f;
                if (f10 <= 0.0f) {
                    return false;
                }
                d(f10);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    return false;
                }
                this.f3382x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                int actionIndex2 = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex2) == this.f3382x) {
                    if (actionIndex2 == 0) {
                        i10 = 1;
                    }
                    this.f3382x = motionEvent.getPointerId(i10);
                }
            }
        }
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        View view = this.f3366a;
        if (view != null) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            if (!d0.i.p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public void setAnimationProgress(float f10) {
        this.A.setScaleX(f10);
        this.A.setScaleY(f10);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        g3.d dVar = this.H;
        d.a aVar = dVar.f10305a;
        aVar.f10319i = iArr;
        aVar.a(0);
        dVar.f10305a.a(0);
        dVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i10 = 0; i10 < iArr.length; i10++) {
            iArr2[i10] = k1.a.getColor(context, iArr[i10]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i10) {
        this.f3370e = (float) i10;
    }

    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        if (!z10) {
            f();
        }
    }

    public void setNestedScrollingEnabled(boolean z10) {
        m mVar = this.f3373o;
        if (mVar.f16339d) {
            View view = mVar.f16338c;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.i.z(view);
        }
        mVar.f16339d = z10;
    }

    public void setOnChildScrollUpCallback(e eVar) {
    }

    public void setOnRefreshListener(f fVar) {
        this.f3367b = fVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i10) {
        setProgressBackgroundColorSchemeResource(i10);
    }

    public void setProgressBackgroundColorSchemeColor(int i10) {
        this.A.setBackgroundColor(i10);
    }

    public void setProgressBackgroundColorSchemeResource(int i10) {
        setProgressBackgroundColorSchemeColor(k1.a.getColor(getContext(), i10));
    }

    public void setProgressViewEndTarget(boolean z10, int i10) {
        this.F = i10;
        this.f3383y = z10;
        this.A.invalidate();
    }

    public void setProgressViewOffset(boolean z10, int i10, int i11) {
        this.f3383y = z10;
        this.E = i10;
        this.F = i11;
        this.P = true;
        f();
        this.f3368c = false;
    }

    public void setRefreshing(boolean z10) {
        int i10;
        if (!z10 || this.f3368c == z10) {
            g(z10, false);
            return;
        }
        this.f3368c = z10;
        if (!this.P) {
            i10 = this.F + this.E;
        } else {
            i10 = this.F;
        }
        setTargetOffsetTopAndBottom(i10 - this.f3378t);
        this.N = false;
        a aVar = this.Q;
        this.A.setVisibility(0);
        this.H.setAlpha(255);
        g3.e eVar = new g3.e(this);
        this.I = eVar;
        eVar.setDuration((long) this.f3377s);
        if (aVar != null) {
            this.A.f10297a = aVar;
        }
        this.A.clearAnimation();
        this.A.startAnimation(this.I);
    }

    public void setSize(int i10) {
        if (i10 == 0 || i10 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i10 == 0) {
                this.O = (int) (displayMetrics.density * 56.0f);
            } else {
                this.O = (int) (displayMetrics.density * 40.0f);
            }
            this.A.setImageDrawable((Drawable) null);
            this.H.c(i10);
            this.A.setImageDrawable(this.H);
        }
    }

    public void setSlingshotDistance(int i10) {
        this.G = i10;
    }

    public void setTargetOffsetTopAndBottom(int i10) {
        this.A.bringToFront();
        g3.a aVar = this.A;
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        aVar.offsetTopAndBottom(i10);
        this.f3378t = this.A.getTop();
    }

    public final boolean startNestedScroll(int i10) {
        return this.f3373o.g(i10, 0);
    }

    public final void stopNestedScroll() {
        this.f3373o.h(0);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3368c = false;
        this.f3370e = -1.0f;
        this.f3374p = new int[2];
        this.f3375q = new int[2];
        this.f3382x = -1;
        this.B = -1;
        this.Q = new a();
        this.R = new c();
        this.S = new d();
        this.f3369d = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f3377s = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f3384z = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.O = (int) (displayMetrics.density * 40.0f);
        this.A = new g3.a(getContext());
        g3.d dVar = new g3.d(getContext());
        this.H = dVar;
        dVar.c(1);
        this.A.setImageDrawable(this.H);
        this.A.setVisibility(8);
        addView(this.A);
        setChildrenDrawingOrderEnabled(true);
        int i10 = (int) (displayMetrics.density * 64.0f);
        this.F = i10;
        this.f3370e = (float) i10;
        this.f3372n = new p();
        this.f3373o = new m(this);
        setNestedScrollingEnabled(true);
        int i11 = -this.O;
        this.f3378t = i11;
        this.E = i11;
        e(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, T);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
