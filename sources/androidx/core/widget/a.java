package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: AutoScrollHelper */
public abstract class a implements View.OnTouchListener {

    /* renamed from: x  reason: collision with root package name */
    public static final int f2153x = ViewConfiguration.getTapTimeout();

    /* renamed from: a  reason: collision with root package name */
    public final C0018a f2154a;

    /* renamed from: b  reason: collision with root package name */
    public final AccelerateInterpolator f2155b = new AccelerateInterpolator();

    /* renamed from: c  reason: collision with root package name */
    public final View f2156c;

    /* renamed from: d  reason: collision with root package name */
    public b f2157d;

    /* renamed from: e  reason: collision with root package name */
    public float[] f2158e = {0.0f, 0.0f};

    /* renamed from: f  reason: collision with root package name */
    public float[] f2159f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: n  reason: collision with root package name */
    public int f2160n;

    /* renamed from: o  reason: collision with root package name */
    public int f2161o;

    /* renamed from: p  reason: collision with root package name */
    public float[] f2162p = {0.0f, 0.0f};

    /* renamed from: q  reason: collision with root package name */
    public float[] f2163q = {0.0f, 0.0f};

    /* renamed from: r  reason: collision with root package name */
    public float[] f2164r = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: s  reason: collision with root package name */
    public boolean f2165s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2166t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2167u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2168v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2169w;

    /* renamed from: androidx.core.widget.a$a  reason: collision with other inner class name */
    /* compiled from: AutoScrollHelper */
    public static class C0018a {

        /* renamed from: a  reason: collision with root package name */
        public int f2170a;

        /* renamed from: b  reason: collision with root package name */
        public int f2171b;

        /* renamed from: c  reason: collision with root package name */
        public float f2172c;

        /* renamed from: d  reason: collision with root package name */
        public float f2173d;

        /* renamed from: e  reason: collision with root package name */
        public long f2174e = Long.MIN_VALUE;

        /* renamed from: f  reason: collision with root package name */
        public long f2175f = 0;

        /* renamed from: g  reason: collision with root package name */
        public long f2176g = -1;

        /* renamed from: h  reason: collision with root package name */
        public float f2177h;

        /* renamed from: i  reason: collision with root package name */
        public int f2178i;

        public final float a(long j10) {
            long j11 = this.f2174e;
            if (j10 < j11) {
                return 0.0f;
            }
            long j12 = this.f2176g;
            if (j12 < 0 || j10 < j12) {
                return a.b(((float) (j10 - j11)) / ((float) this.f2170a), 0.0f, 1.0f) * 0.5f;
            }
            float f10 = this.f2177h;
            return (a.b(((float) (j10 - j12)) / ((float) this.f2178i), 0.0f, 1.0f) * f10) + (1.0f - f10);
        }
    }

    /* compiled from: AutoScrollHelper */
    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            boolean z10;
            a aVar = a.this;
            if (aVar.f2168v) {
                if (aVar.f2166t) {
                    aVar.f2166t = false;
                    C0018a aVar2 = aVar.f2154a;
                    aVar2.getClass();
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    aVar2.f2174e = currentAnimationTimeMillis;
                    aVar2.f2176g = -1;
                    aVar2.f2175f = currentAnimationTimeMillis;
                    aVar2.f2177h = 0.5f;
                }
                C0018a aVar3 = a.this.f2154a;
                if (aVar3.f2176g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= aVar3.f2176g + ((long) aVar3.f2178i)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10 || !a.this.e()) {
                    a.this.f2168v = false;
                    return;
                }
                a aVar4 = a.this;
                if (aVar4.f2167u) {
                    aVar4.f2167u = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    aVar4.f2156c.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (aVar3.f2175f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar3.a(currentAnimationTimeMillis2);
                    aVar3.f2175f = currentAnimationTimeMillis2;
                    h.b(((g) a.this).f2180y, (int) (((float) (currentAnimationTimeMillis2 - aVar3.f2175f)) * ((a10 * 4.0f) + (-4.0f * a10 * a10)) * aVar3.f2173d));
                    View view = a.this.f2156c;
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.m(view, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
        }
    }

    public a(View view) {
        C0018a aVar = new C0018a();
        this.f2154a = aVar;
        this.f2156c = view;
        float f10 = Resources.getSystem().getDisplayMetrics().density;
        float[] fArr = this.f2164r;
        float f11 = ((float) ((int) ((1575.0f * f10) + 0.5f))) / 1000.0f;
        fArr[0] = f11;
        fArr[1] = f11;
        float[] fArr2 = this.f2163q;
        float f12 = ((float) ((int) ((f10 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f12;
        fArr2[1] = f12;
        this.f2160n = 1;
        float[] fArr3 = this.f2159f;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.f2158e;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.f2162p;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.f2161o = f2153x;
        aVar.f2170a = 500;
        aVar.f2171b = 500;
    }

    public static float b(float f10, float f11, float f12) {
        return f10 > f12 ? f12 : f10 < f11 ? f11 : f10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.f2158e
            r0 = r0[r7]
            float[] r1 = r3.f2159f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 >= 0) goto L_0x0025
            android.view.animation.AccelerateInterpolator r5 = r3.f2155b
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L_0x002f
        L_0x0025:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x0038
            android.view.animation.AccelerateInterpolator r5 = r3.f2155b
            float r4 = r5.getInterpolation(r4)
        L_0x002f:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L_0x0039
        L_0x0038:
            r4 = r2
        L_0x0039:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x003e
            return r2
        L_0x003e:
            float[] r0 = r3.f2162p
            r0 = r0[r7]
            float[] r1 = r3.f2163q
            r1 = r1[r7]
            float[] r2 = r3.f2164r
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L_0x0053
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            return r4
        L_0x0053:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r4 = -r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.a(float, float, float, int):float");
    }

    public final float c(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        int i10 = this.f2160n;
        if (i10 == 0 || i10 == 1) {
            if (f10 < f11) {
                if (f10 >= 0.0f) {
                    return 1.0f - (f10 / f11);
                }
                if (!this.f2168v || i10 != 1) {
                    return 0.0f;
                }
                return 1.0f;
            }
        } else if (i10 == 2 && f10 < 0.0f) {
            return f10 / (-f11);
        }
        return 0.0f;
    }

    public final void d() {
        int i10 = 0;
        if (this.f2166t) {
            this.f2168v = false;
            return;
        }
        C0018a aVar = this.f2154a;
        aVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i11 = (int) (currentAnimationTimeMillis - aVar.f2174e);
        int i12 = aVar.f2171b;
        if (i11 > i12) {
            i10 = i12;
        } else if (i11 >= 0) {
            i10 = i11;
        }
        aVar.f2178i = i10;
        aVar.f2177h = aVar.a(currentAnimationTimeMillis);
        aVar.f2176g = currentAnimationTimeMillis;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e() {
        /*
            r9 = this;
            androidx.core.widget.a$a r0 = r9.f2154a
            float r1 = r0.f2173d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.f2172c
            float r2 = java.lang.Math.abs(r0)
            float r0 = r0 / r2
            int r0 = (int) r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0053
            r4 = r9
            androidx.core.widget.g r4 = (androidx.core.widget.g) r4
            android.widget.ListView r4 = r4.f2180y
            int r5 = r4.getCount()
            if (r5 != 0) goto L_0x0023
        L_0x0021:
            r1 = r3
            goto L_0x0051
        L_0x0023:
            int r6 = r4.getChildCount()
            int r7 = r4.getFirstVisiblePosition()
            int r8 = r7 + r6
            if (r1 <= 0) goto L_0x0041
            if (r8 < r5) goto L_0x0050
            int r6 = r6 - r2
            android.view.View r1 = r4.getChildAt(r6)
            int r1 = r1.getBottom()
            int r4 = r4.getHeight()
            if (r1 > r4) goto L_0x0050
            goto L_0x0021
        L_0x0041:
            if (r1 >= 0) goto L_0x0021
            if (r7 > 0) goto L_0x0050
            android.view.View r1 = r4.getChildAt(r3)
            int r1 = r1.getTop()
            if (r1 < 0) goto L_0x0050
            goto L_0x0021
        L_0x0050:
            r1 = r2
        L_0x0051:
            if (r1 != 0) goto L_0x0054
        L_0x0053:
            r2 = r3
        L_0x0054:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.e():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r0 != 3) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2169w
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 == r2) goto L_0x0016
            r3 = 2
            if (r0 == r3) goto L_0x001e
            r6 = 3
            if (r0 == r6) goto L_0x0016
            goto L_0x007f
        L_0x0016:
            r5.d()
            goto L_0x007f
        L_0x001a:
            r5.f2167u = r2
            r5.f2165s = r1
        L_0x001e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2156c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.a(r0, r3, r4, r1)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2156c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.a(r7, r6, r3, r2)
            androidx.core.widget.a$a r7 = r5.f2154a
            r7.f2172c = r0
            r7.f2173d = r6
            boolean r6 = r5.f2168v
            if (r6 != 0) goto L_0x007f
            boolean r6 = r5.e()
            if (r6 == 0) goto L_0x007f
            androidx.core.widget.a$b r6 = r5.f2157d
            if (r6 != 0) goto L_0x0061
            androidx.core.widget.a$b r6 = new androidx.core.widget.a$b
            r6.<init>()
            r5.f2157d = r6
        L_0x0061:
            r5.f2168v = r2
            r5.f2166t = r2
            boolean r6 = r5.f2165s
            if (r6 != 0) goto L_0x0078
            int r6 = r5.f2161o
            if (r6 <= 0) goto L_0x0078
            android.view.View r7 = r5.f2156c
            androidx.core.widget.a$b r0 = r5.f2157d
            long r3 = (long) r6
            java.util.WeakHashMap<android.view.View, w1.q0> r6 = w1.d0.f16298a
            w1.d0.d.n(r7, r0, r3)
            goto L_0x007d
        L_0x0078:
            androidx.core.widget.a$b r6 = r5.f2157d
            r6.run()
        L_0x007d:
            r5.f2165s = r2
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
