package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.helper.widget.MotionEffect;
import androidx.constraintlayout.motion.widget.a;
import androidx.constraintlayout.motion.widget.c;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.a;
import androidx.core.widget.NestedScrollView;
import c1.e;
import c1.j;
import c1.l;
import d1.b;
import f1.k;
import f1.m;
import f1.n;
import f1.p;
import f1.q;
import f1.r;
import g1.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import w1.o;

public class MotionLayout extends ConstraintLayout implements o {
    public static boolean M0;
    public float A = 0.0f;
    public boolean A0 = false;
    public int B = -1;
    public g B0;
    public int C = -1;
    public Runnable C0 = null;
    public int D = -1;
    public Rect D0;
    public int E = 0;
    public boolean E0;
    public int F = 0;
    public i F0;
    public boolean G = true;
    public e G0;
    public HashMap<View, n> H = new HashMap<>();
    public boolean H0;
    public long I = 0;
    public RectF I0;
    public float J = 1.0f;
    public View J0;
    public float K = 0.0f;
    public Matrix K0;
    public float L = 0.0f;
    public ArrayList<Integer> L0;
    public long M;
    public float N = 0.0f;
    public boolean O;
    public boolean P = false;
    public h Q;
    public int R = 0;
    public d S;
    public boolean T = false;
    public e1.a U = new e1.a();
    public c V = new c();
    public f1.b W;

    /* renamed from: a0  reason: collision with root package name */
    public int f1572a0;

    /* renamed from: b0  reason: collision with root package name */
    public int f1573b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f1574c0 = false;

    /* renamed from: d0  reason: collision with root package name */
    public float f1575d0;

    /* renamed from: e0  reason: collision with root package name */
    public float f1576e0;

    /* renamed from: f0  reason: collision with root package name */
    public long f1577f0;

    /* renamed from: g0  reason: collision with root package name */
    public float f1578g0;

    /* renamed from: h0  reason: collision with root package name */
    public boolean f1579h0 = false;

    /* renamed from: i0  reason: collision with root package name */
    public ArrayList<MotionHelper> f1580i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public ArrayList<MotionHelper> f1581j0 = null;

    /* renamed from: k0  reason: collision with root package name */
    public ArrayList<MotionHelper> f1582k0 = null;

    /* renamed from: l0  reason: collision with root package name */
    public CopyOnWriteArrayList<h> f1583l0 = null;

    /* renamed from: m0  reason: collision with root package name */
    public int f1584m0 = 0;

    /* renamed from: n0  reason: collision with root package name */
    public long f1585n0 = -1;

    /* renamed from: o0  reason: collision with root package name */
    public float f1586o0 = 0.0f;

    /* renamed from: p0  reason: collision with root package name */
    public int f1587p0 = 0;

    /* renamed from: q0  reason: collision with root package name */
    public float f1588q0 = 0.0f;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f1589r0 = false;

    /* renamed from: s0  reason: collision with root package name */
    public int f1590s0;

    /* renamed from: t0  reason: collision with root package name */
    public int f1591t0;

    /* renamed from: u0  reason: collision with root package name */
    public int f1592u0;

    /* renamed from: v0  reason: collision with root package name */
    public int f1593v0;

    /* renamed from: w0  reason: collision with root package name */
    public int f1594w0;

    /* renamed from: x  reason: collision with root package name */
    public a f1595x;

    /* renamed from: x0  reason: collision with root package name */
    public int f1596x0;

    /* renamed from: y  reason: collision with root package name */
    public f1.o f1597y;

    /* renamed from: y0  reason: collision with root package name */
    public float f1598y0;

    /* renamed from: z  reason: collision with root package name */
    public Interpolator f1599z = null;

    /* renamed from: z0  reason: collision with root package name */
    public lc.b f1600z0 = new lc.b(2);

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f1601a;

        public a(View view) {
            this.f1601a = view;
        }

        public final void run() {
            this.f1601a.setNestedScrollingEnabled(true);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            MotionLayout.this.B0.a();
        }
    }

    public class c extends f1.o {

        /* renamed from: a  reason: collision with root package name */
        public float f1603a = 0.0f;

        /* renamed from: b  reason: collision with root package name */
        public float f1604b = 0.0f;

        /* renamed from: c  reason: collision with root package name */
        public float f1605c;

        public c() {
        }

        public final float a() {
            return MotionLayout.this.A;
        }

        public final float getInterpolation(float f10) {
            float f11 = this.f1603a;
            if (f11 > 0.0f) {
                float f12 = this.f1605c;
                if (f11 / f12 < f10) {
                    f10 = f11 / f12;
                }
                MotionLayout.this.A = f11 - (f12 * f10);
                return ((f11 * f10) - (((f12 * f10) * f10) / 2.0f)) + this.f1604b;
            }
            float f13 = this.f1605c;
            if ((-f11) / f13 < f10) {
                f10 = (-f11) / f13;
            }
            MotionLayout.this.A = (f13 * f10) + f11;
            return (((f13 * f10) * f10) / 2.0f) + (f11 * f10) + this.f1604b;
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        public float[] f1607a;

        /* renamed from: b  reason: collision with root package name */
        public int[] f1608b;

        /* renamed from: c  reason: collision with root package name */
        public float[] f1609c;

        /* renamed from: d  reason: collision with root package name */
        public Path f1610d;

        /* renamed from: e  reason: collision with root package name */
        public Paint f1611e;

        /* renamed from: f  reason: collision with root package name */
        public Paint f1612f;

        /* renamed from: g  reason: collision with root package name */
        public Paint f1613g;

        /* renamed from: h  reason: collision with root package name */
        public Paint f1614h;

        /* renamed from: i  reason: collision with root package name */
        public Paint f1615i;

        /* renamed from: j  reason: collision with root package name */
        public float[] f1616j;

        /* renamed from: k  reason: collision with root package name */
        public int f1617k;

        /* renamed from: l  reason: collision with root package name */
        public Rect f1618l = new Rect();

        /* renamed from: m  reason: collision with root package name */
        public int f1619m = 1;

        public d() {
            Paint paint = new Paint();
            this.f1611e = paint;
            paint.setAntiAlias(true);
            this.f1611e.setColor(-21965);
            this.f1611e.setStrokeWidth(2.0f);
            this.f1611e.setStyle(Paint.Style.STROKE);
            Paint paint2 = new Paint();
            this.f1612f = paint2;
            paint2.setAntiAlias(true);
            this.f1612f.setColor(-2067046);
            this.f1612f.setStrokeWidth(2.0f);
            this.f1612f.setStyle(Paint.Style.STROKE);
            Paint paint3 = new Paint();
            this.f1613g = paint3;
            paint3.setAntiAlias(true);
            this.f1613g.setColor(-13391360);
            this.f1613g.setStrokeWidth(2.0f);
            this.f1613g.setStyle(Paint.Style.STROKE);
            Paint paint4 = new Paint();
            this.f1614h = paint4;
            paint4.setAntiAlias(true);
            this.f1614h.setColor(-13391360);
            this.f1614h.setTextSize(MotionLayout.this.getContext().getResources().getDisplayMetrics().density * 12.0f);
            this.f1616j = new float[8];
            Paint paint5 = new Paint();
            this.f1615i = paint5;
            paint5.setAntiAlias(true);
            this.f1613g.setPathEffect(new DashPathEffect(new float[]{4.0f, 8.0f}, 0.0f));
            this.f1609c = new float[100];
            this.f1608b = new int[50];
        }

        public final void a(Canvas canvas, int i10, int i11, n nVar) {
            int i12;
            int i13;
            int i14;
            float f10;
            float f11;
            Canvas canvas2 = canvas;
            int i15 = i10;
            n nVar2 = nVar;
            if (i15 == 4) {
                boolean z10 = false;
                boolean z11 = false;
                for (int i16 = 0; i16 < this.f1617k; i16++) {
                    int i17 = this.f1608b[i16];
                    if (i17 == 1) {
                        z10 = true;
                    }
                    if (i17 == 0) {
                        z11 = true;
                    }
                }
                if (z10) {
                    float[] fArr = this.f1607a;
                    canvas.drawLine(fArr[0], fArr[1], fArr[fArr.length - 2], fArr[fArr.length - 1], this.f1613g);
                }
                if (z11) {
                    b(canvas);
                }
            }
            if (i15 == 2) {
                float[] fArr2 = this.f1607a;
                canvas.drawLine(fArr2[0], fArr2[1], fArr2[fArr2.length - 2], fArr2[fArr2.length - 1], this.f1613g);
            }
            if (i15 == 3) {
                b(canvas);
            }
            canvas2.drawLines(this.f1607a, this.f1611e);
            View view = nVar2.f9730b;
            if (view != null) {
                i13 = view.getWidth();
                i12 = nVar2.f9730b.getHeight();
            } else {
                i13 = 0;
                i12 = 0;
            }
            int i18 = 1;
            while (i18 < i11 - 1) {
                if (i15 == 4 && this.f1608b[i18 - 1] == 0) {
                    i14 = i18;
                } else {
                    float[] fArr3 = this.f1609c;
                    int i19 = i18 * 2;
                    float f12 = fArr3[i19];
                    float f13 = fArr3[i19 + 1];
                    this.f1610d.reset();
                    this.f1610d.moveTo(f12, f13 + 10.0f);
                    this.f1610d.lineTo(f12 + 10.0f, f13);
                    this.f1610d.lineTo(f12, f13 - 10.0f);
                    this.f1610d.lineTo(f12 - 10.0f, f13);
                    this.f1610d.close();
                    int i20 = i18 - 1;
                    p pVar = nVar2.f9749u.get(i20);
                    if (i15 == 4) {
                        int i21 = this.f1608b[i20];
                        if (i21 == 1) {
                            d(canvas2, f12 - 0.0f, f13 - 0.0f);
                        } else if (i21 == 0) {
                            c(canvas2, f12 - 0.0f, f13 - 0.0f);
                        } else if (i21 == 2) {
                            f10 = f13;
                            f11 = f12;
                            i14 = i18;
                            e(canvas, f12 - 0.0f, f13 - 0.0f, i13, i12);
                            canvas2.drawPath(this.f1610d, this.f1615i);
                        }
                        f10 = f13;
                        f11 = f12;
                        i14 = i18;
                        canvas2.drawPath(this.f1610d, this.f1615i);
                    } else {
                        f10 = f13;
                        f11 = f12;
                        i14 = i18;
                    }
                    if (i15 == 2) {
                        d(canvas2, f11 - 0.0f, f10 - 0.0f);
                    }
                    if (i15 == 3) {
                        c(canvas2, f11 - 0.0f, f10 - 0.0f);
                    }
                    if (i15 == 6) {
                        e(canvas, f11 - 0.0f, f10 - 0.0f, i13, i12);
                    }
                    canvas2.drawPath(this.f1610d, this.f1615i);
                }
                i18 = i14 + 1;
            }
            float[] fArr4 = this.f1607a;
            if (fArr4.length > 1) {
                canvas2.drawCircle(fArr4[0], fArr4[1], 8.0f, this.f1612f);
                float[] fArr5 = this.f1607a;
                canvas2.drawCircle(fArr5[fArr5.length - 2], fArr5[fArr5.length - 1], 8.0f, this.f1612f);
            }
        }

        public final void b(Canvas canvas) {
            float[] fArr = this.f1607a;
            float f10 = fArr[0];
            float f11 = fArr[1];
            float f12 = fArr[fArr.length - 2];
            float f13 = fArr[fArr.length - 1];
            canvas.drawLine(Math.min(f10, f12), Math.max(f11, f13), Math.max(f10, f12), Math.max(f11, f13), this.f1613g);
            canvas.drawLine(Math.min(f10, f12), Math.min(f11, f13), Math.min(f10, f12), Math.max(f11, f13), this.f1613g);
        }

        public final void c(Canvas canvas, float f10, float f11) {
            Canvas canvas2 = canvas;
            float[] fArr = this.f1607a;
            float f12 = fArr[0];
            float f13 = fArr[1];
            float f14 = fArr[fArr.length - 2];
            float f15 = fArr[fArr.length - 1];
            float min = Math.min(f12, f14);
            float max = Math.max(f13, f15);
            float min2 = f10 - Math.min(f12, f14);
            float max2 = Math.max(f13, f15) - f11;
            StringBuilder q10 = android.support.v4.media.a.q("");
            q10.append(((float) ((int) (((double) ((min2 * 100.0f) / Math.abs(f14 - f12))) + 0.5d))) / 100.0f);
            String sb2 = q10.toString();
            f(this.f1614h, sb2);
            canvas2.drawText(sb2, ((min2 / 2.0f) - ((float) (this.f1618l.width() / 2))) + min, f11 - 20.0f, this.f1614h);
            canvas.drawLine(f10, f11, Math.min(f12, f14), f11, this.f1613g);
            StringBuilder q11 = android.support.v4.media.a.q("");
            q11.append(((float) ((int) (((double) ((max2 * 100.0f) / Math.abs(f15 - f13))) + 0.5d))) / 100.0f);
            String sb3 = q11.toString();
            f(this.f1614h, sb3);
            canvas2.drawText(sb3, f10 + 5.0f, max - ((max2 / 2.0f) - ((float) (this.f1618l.height() / 2))), this.f1614h);
            canvas.drawLine(f10, f11, f10, Math.max(f13, f15), this.f1613g);
        }

        public final void d(Canvas canvas, float f10, float f11) {
            float f12 = f10;
            float f13 = f11;
            float[] fArr = this.f1607a;
            float f14 = fArr[0];
            float f15 = fArr[1];
            float f16 = fArr[fArr.length - 2];
            float f17 = fArr[fArr.length - 1];
            float hypot = (float) Math.hypot((double) (f14 - f16), (double) (f15 - f17));
            float f18 = f16 - f14;
            float f19 = f17 - f15;
            float f20 = (((f13 - f15) * f19) + ((f12 - f14) * f18)) / (hypot * hypot);
            float f21 = f14 + (f18 * f20);
            float f22 = f15 + (f20 * f19);
            Path path = new Path();
            path.moveTo(f10, f13);
            path.lineTo(f21, f22);
            float hypot2 = (float) Math.hypot((double) (f21 - f12), (double) (f22 - f13));
            StringBuilder q10 = android.support.v4.media.a.q("");
            q10.append(((float) ((int) ((hypot2 * 100.0f) / hypot))) / 100.0f);
            String sb2 = q10.toString();
            f(this.f1614h, sb2);
            canvas.drawTextOnPath(sb2, path, (hypot2 / 2.0f) - ((float) (this.f1618l.width() / 2)), -20.0f, this.f1614h);
            canvas.drawLine(f12, f13, f21, f22, this.f1613g);
        }

        public final void e(Canvas canvas, float f10, float f11, int i10, int i11) {
            Canvas canvas2 = canvas;
            StringBuilder q10 = android.support.v4.media.a.q("");
            q10.append(((float) ((int) (((double) (((f10 - ((float) (i10 / 2))) * 100.0f) / ((float) (MotionLayout.this.getWidth() - i10)))) + 0.5d))) / 100.0f);
            String sb2 = q10.toString();
            f(this.f1614h, sb2);
            canvas2.drawText(sb2, ((f10 / 2.0f) - ((float) (this.f1618l.width() / 2))) + 0.0f, f11 - 20.0f, this.f1614h);
            canvas.drawLine(f10, f11, Math.min(0.0f, 1.0f), f11, this.f1613g);
            StringBuilder q11 = android.support.v4.media.a.q("");
            q11.append(((float) ((int) (((double) (((f11 - ((float) (i11 / 2))) * 100.0f) / ((float) (MotionLayout.this.getHeight() - i11)))) + 0.5d))) / 100.0f);
            String sb3 = q11.toString();
            f(this.f1614h, sb3);
            canvas2.drawText(sb3, f10 + 5.0f, 0.0f - ((f11 / 2.0f) - ((float) (this.f1618l.height() / 2))), this.f1614h);
            canvas.drawLine(f10, f11, f10, Math.max(0.0f, 1.0f), this.f1613g);
        }

        public final void f(Paint paint, String str) {
            paint.getTextBounds(str, 0, str.length(), this.f1618l);
        }
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        public c1.f f1621a = new c1.f();

        /* renamed from: b  reason: collision with root package name */
        public c1.f f1622b = new c1.f();

        /* renamed from: c  reason: collision with root package name */
        public androidx.constraintlayout.widget.a f1623c = null;

        /* renamed from: d  reason: collision with root package name */
        public androidx.constraintlayout.widget.a f1624d = null;

        /* renamed from: e  reason: collision with root package name */
        public int f1625e;

        /* renamed from: f  reason: collision with root package name */
        public int f1626f;

        public e() {
        }

        public static void c(c1.f fVar, c1.f fVar2) {
            c1.e eVar;
            ArrayList<c1.e> arrayList = fVar.f4510w0;
            HashMap hashMap = new HashMap();
            hashMap.put(fVar, fVar2);
            fVar2.f4510w0.clear();
            fVar2.j(fVar, hashMap);
            Iterator<c1.e> it = arrayList.iterator();
            while (it.hasNext()) {
                c1.e next = it.next();
                if (next instanceof c1.a) {
                    eVar = new c1.a();
                } else if (next instanceof c1.h) {
                    eVar = new c1.h();
                } else if (next instanceof c1.g) {
                    eVar = new c1.g();
                } else if (next instanceof l) {
                    eVar = new l();
                } else if (next instanceof c1.i) {
                    eVar = new j();
                } else {
                    eVar = new c1.e();
                }
                fVar2.f4510w0.add(eVar);
                c1.e eVar2 = eVar.W;
                if (eVar2 != null) {
                    ((c1.n) eVar2).f4510w0.remove(eVar);
                    eVar.G();
                }
                eVar.W = fVar2;
                hashMap.put(next, eVar);
            }
            Iterator<c1.e> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                c1.e next2 = it2.next();
                ((c1.e) hashMap.get(next2)).j(next2, hashMap);
            }
        }

        public static c1.e d(c1.f fVar, View view) {
            if (fVar.f4436i0 == view) {
                return fVar;
            }
            ArrayList<c1.e> arrayList = fVar.f4510w0;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                c1.e eVar = arrayList.get(i10);
                if (eVar.f4436i0 == view) {
                    return eVar;
                }
            }
            return null;
        }

        public final void a() {
            Interpolator interpolator;
            int childCount = MotionLayout.this.getChildCount();
            MotionLayout.this.H.clear();
            SparseArray sparseArray = new SparseArray();
            int[] iArr = new int[childCount];
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = MotionLayout.this.getChildAt(i10);
                n nVar = new n(childAt);
                int id2 = childAt.getId();
                iArr[i10] = id2;
                sparseArray.put(id2, nVar);
                MotionLayout.this.H.put(childAt, nVar);
            }
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt2 = MotionLayout.this.getChildAt(i11);
                n nVar2 = MotionLayout.this.H.get(childAt2);
                if (nVar2 != null) {
                    if (this.f1623c != null) {
                        c1.e d10 = d(this.f1621a, childAt2);
                        if (d10 != null) {
                            Rect q10 = MotionLayout.q(MotionLayout.this, d10);
                            androidx.constraintlayout.widget.a aVar = this.f1623c;
                            int width = MotionLayout.this.getWidth();
                            int height = MotionLayout.this.getHeight();
                            int i12 = aVar.f1943c;
                            if (i12 != 0) {
                                n.g(q10, nVar2.f9729a, i12, width, height);
                            }
                            p pVar = nVar2.f9734f;
                            pVar.f9758c = 0.0f;
                            pVar.f9759d = 0.0f;
                            nVar2.f(pVar);
                            nVar2.f9734f.j((float) q10.left, (float) q10.top, (float) q10.width(), (float) q10.height());
                            a.C0016a h10 = aVar.h(nVar2.f9731c);
                            nVar2.f9734f.b(h10);
                            nVar2.f9740l = h10.f1950d.f2017g;
                            nVar2.f9736h.j(q10, aVar, i12, nVar2.f9731c);
                            nVar2.C = h10.f1952f.f2038i;
                            a.c cVar = h10.f1950d;
                            nVar2.E = cVar.f2020j;
                            nVar2.F = cVar.f2019i;
                            Context context = nVar2.f9730b.getContext();
                            a.c cVar2 = h10.f1950d;
                            int i13 = cVar2.f2022l;
                            String str = cVar2.f2021k;
                            int i14 = cVar2.f2023m;
                            if (i13 == -2) {
                                interpolator = AnimationUtils.loadInterpolator(context, i14);
                            } else if (i13 == -1) {
                                interpolator = new m(b1.c.c(str));
                            } else if (i13 == 0) {
                                interpolator = new AccelerateDecelerateInterpolator();
                            } else if (i13 == 1) {
                                interpolator = new AccelerateInterpolator();
                            } else if (i13 == 2) {
                                interpolator = new DecelerateInterpolator();
                            } else if (i13 == 4) {
                                interpolator = new BounceInterpolator();
                            } else if (i13 != 5) {
                                interpolator = null;
                            } else {
                                interpolator = new OvershootInterpolator();
                            }
                            nVar2.G = interpolator;
                        } else if (MotionLayout.this.R != 0) {
                            f1.a.b();
                            f1.a.d(childAt2);
                            childAt2.getClass();
                        }
                    } else {
                        MotionLayout.this.getClass();
                    }
                    if (this.f1624d != null) {
                        c1.e d11 = d(this.f1622b, childAt2);
                        if (d11 != null) {
                            Rect q11 = MotionLayout.q(MotionLayout.this, d11);
                            androidx.constraintlayout.widget.a aVar2 = this.f1624d;
                            int width2 = MotionLayout.this.getWidth();
                            int height2 = MotionLayout.this.getHeight();
                            int i15 = aVar2.f1943c;
                            if (i15 != 0) {
                                n.g(q11, nVar2.f9729a, i15, width2, height2);
                                q11 = nVar2.f9729a;
                            }
                            p pVar2 = nVar2.f9735g;
                            pVar2.f9758c = 1.0f;
                            pVar2.f9759d = 1.0f;
                            nVar2.f(pVar2);
                            nVar2.f9735g.j((float) q11.left, (float) q11.top, (float) q11.width(), (float) q11.height());
                            nVar2.f9735g.b(aVar2.h(nVar2.f9731c));
                            nVar2.f9737i.j(q11, aVar2, i15, nVar2.f9731c);
                        } else if (MotionLayout.this.R != 0) {
                            f1.a.b();
                            f1.a.d(childAt2);
                            childAt2.getClass();
                        }
                    }
                }
            }
            for (int i16 = 0; i16 < childCount; i16++) {
                n nVar3 = (n) sparseArray.get(iArr[i16]);
                int i17 = nVar3.f9734f.f9766r;
                if (i17 != -1) {
                    n nVar4 = (n) sparseArray.get(i17);
                    nVar3.f9734f.m(nVar4, nVar4.f9734f);
                    nVar3.f9735g.m(nVar4, nVar4.f9735g);
                }
            }
        }

        public final void b(int i10, int i11) {
            int i12;
            int i13;
            int i14;
            int i15;
            int i16;
            int i17;
            int optimizationLevel = MotionLayout.this.getOptimizationLevel();
            MotionLayout motionLayout = MotionLayout.this;
            if (motionLayout.C == motionLayout.getStartState()) {
                MotionLayout motionLayout2 = MotionLayout.this;
                c1.f fVar = this.f1622b;
                androidx.constraintlayout.widget.a aVar = this.f1624d;
                if (aVar == null || aVar.f1943c == 0) {
                    i15 = i10;
                } else {
                    i15 = i11;
                }
                if (aVar == null || aVar.f1943c == 0) {
                    i16 = i11;
                } else {
                    i16 = i10;
                }
                motionLayout2.o(fVar, optimizationLevel, i15, i16);
                androidx.constraintlayout.widget.a aVar2 = this.f1623c;
                if (aVar2 != null) {
                    MotionLayout motionLayout3 = MotionLayout.this;
                    c1.f fVar2 = this.f1621a;
                    int i18 = aVar2.f1943c;
                    if (i18 == 0) {
                        i17 = i10;
                    } else {
                        i17 = i11;
                    }
                    if (i18 == 0) {
                        i10 = i11;
                    }
                    motionLayout3.o(fVar2, optimizationLevel, i17, i10);
                    return;
                }
                return;
            }
            androidx.constraintlayout.widget.a aVar3 = this.f1623c;
            if (aVar3 != null) {
                MotionLayout motionLayout4 = MotionLayout.this;
                c1.f fVar3 = this.f1621a;
                int i19 = aVar3.f1943c;
                if (i19 == 0) {
                    i13 = i10;
                } else {
                    i13 = i11;
                }
                if (i19 == 0) {
                    i14 = i11;
                } else {
                    i14 = i10;
                }
                motionLayout4.o(fVar3, optimizationLevel, i13, i14);
            }
            MotionLayout motionLayout5 = MotionLayout.this;
            c1.f fVar4 = this.f1622b;
            androidx.constraintlayout.widget.a aVar4 = this.f1624d;
            if (aVar4 == null || aVar4.f1943c == 0) {
                i12 = i10;
            } else {
                i12 = i11;
            }
            if (aVar4 == null || aVar4.f1943c == 0) {
                i10 = i11;
            }
            motionLayout5.o(fVar4, optimizationLevel, i12, i10);
        }

        public final void e(androidx.constraintlayout.widget.a aVar, androidx.constraintlayout.widget.a aVar2) {
            e.a aVar3 = e.a.WRAP_CONTENT;
            this.f1623c = aVar;
            this.f1624d = aVar2;
            this.f1621a = new c1.f();
            c1.f fVar = new c1.f();
            this.f1622b = fVar;
            c1.f fVar2 = this.f1621a;
            MotionLayout motionLayout = MotionLayout.this;
            boolean z10 = MotionLayout.M0;
            c1.f fVar3 = motionLayout.f1853c;
            b.C0085b bVar = fVar3.A0;
            fVar2.A0 = bVar;
            fVar2.f4473y0.f8500f = bVar;
            b.C0085b bVar2 = fVar3.A0;
            fVar.A0 = bVar2;
            fVar.f4473y0.f8500f = bVar2;
            fVar2.f4510w0.clear();
            this.f1622b.f4510w0.clear();
            c(MotionLayout.this.f1853c, this.f1621a);
            c(MotionLayout.this.f1853c, this.f1622b);
            if (((double) MotionLayout.this.L) > 0.5d) {
                if (aVar != null) {
                    g(this.f1621a, aVar);
                }
                g(this.f1622b, aVar2);
            } else {
                g(this.f1622b, aVar2);
                if (aVar != null) {
                    g(this.f1621a, aVar);
                }
            }
            this.f1621a.B0 = MotionLayout.this.f();
            c1.f fVar4 = this.f1621a;
            fVar4.f4472x0.c(fVar4);
            this.f1622b.B0 = MotionLayout.this.f();
            c1.f fVar5 = this.f1622b;
            fVar5.f4472x0.c(fVar5);
            ViewGroup.LayoutParams layoutParams = MotionLayout.this.getLayoutParams();
            if (layoutParams != null) {
                if (layoutParams.width == -2) {
                    this.f1621a.P(aVar3);
                    this.f1622b.P(aVar3);
                }
                if (layoutParams.height == -2) {
                    this.f1621a.Q(aVar3);
                    this.f1622b.Q(aVar3);
                }
            }
        }

        public final void f() {
            boolean z10;
            boolean z11;
            boolean z12;
            int i10;
            float f10;
            boolean z13;
            float f11;
            float f12;
            boolean z14;
            MotionLayout motionLayout = MotionLayout.this;
            int i11 = motionLayout.E;
            int i12 = motionLayout.F;
            int mode = View.MeasureSpec.getMode(i11);
            int mode2 = View.MeasureSpec.getMode(i12);
            MotionLayout motionLayout2 = MotionLayout.this;
            motionLayout2.f1594w0 = mode;
            motionLayout2.f1596x0 = mode2;
            motionLayout2.getOptimizationLevel();
            b(i11, i12);
            boolean z15 = true;
            int i13 = 0;
            if ((MotionLayout.this.getParent() instanceof MotionLayout) && mode == 1073741824 && mode2 == 1073741824) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                b(i11, i12);
                MotionLayout.this.f1590s0 = this.f1621a.u();
                MotionLayout.this.f1591t0 = this.f1621a.o();
                MotionLayout.this.f1592u0 = this.f1622b.u();
                MotionLayout.this.f1593v0 = this.f1622b.o();
                MotionLayout motionLayout3 = MotionLayout.this;
                if (motionLayout3.f1590s0 == motionLayout3.f1592u0 && motionLayout3.f1591t0 == motionLayout3.f1593v0) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                motionLayout3.f1589r0 = z14;
            }
            MotionLayout motionLayout4 = MotionLayout.this;
            int i14 = motionLayout4.f1590s0;
            int i15 = motionLayout4.f1591t0;
            int i16 = motionLayout4.f1594w0;
            if (i16 == Integer.MIN_VALUE || i16 == 0) {
                i14 = (int) ((motionLayout4.f1598y0 * ((float) (motionLayout4.f1592u0 - i14))) + ((float) i14));
            }
            int i17 = motionLayout4.f1596x0;
            if (i17 == Integer.MIN_VALUE || i17 == 0) {
                i15 = (int) ((motionLayout4.f1598y0 * ((float) (motionLayout4.f1593v0 - i15))) + ((float) i15));
            }
            int i18 = i15;
            c1.f fVar = this.f1621a;
            if (fVar.K0 || this.f1622b.K0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (fVar.L0 || this.f1622b.L0) {
                z12 = true;
            } else {
                z12 = false;
            }
            motionLayout4.n(i11, i12, i14, i18, z11, z12);
            MotionLayout motionLayout5 = MotionLayout.this;
            int childCount = motionLayout5.getChildCount();
            motionLayout5.G0.a();
            motionLayout5.P = true;
            SparseArray sparseArray = new SparseArray();
            for (int i19 = 0; i19 < childCount; i19++) {
                View childAt = motionLayout5.getChildAt(i19);
                sparseArray.put(childAt.getId(), motionLayout5.H.get(childAt));
            }
            int width = motionLayout5.getWidth();
            int height = motionLayout5.getHeight();
            a.b bVar = motionLayout5.f1595x.f1642c;
            if (bVar != null) {
                i10 = bVar.f1675p;
            } else {
                i10 = -1;
            }
            if (i10 != -1) {
                for (int i20 = 0; i20 < childCount; i20++) {
                    n nVar = motionLayout5.H.get(motionLayout5.getChildAt(i20));
                    if (nVar != null) {
                        nVar.B = i10;
                    }
                }
            }
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = new int[motionLayout5.H.size()];
            int i21 = 0;
            for (int i22 = 0; i22 < childCount; i22++) {
                n nVar2 = motionLayout5.H.get(motionLayout5.getChildAt(i22));
                int i23 = nVar2.f9734f.f9766r;
                if (i23 != -1) {
                    sparseBooleanArray.put(i23, true);
                    iArr[i21] = nVar2.f9734f.f9766r;
                    i21++;
                }
            }
            if (motionLayout5.f1582k0 != null) {
                for (int i24 = 0; i24 < i21; i24++) {
                    n nVar3 = motionLayout5.H.get(motionLayout5.findViewById(iArr[i24]));
                    if (nVar3 != null) {
                        motionLayout5.f1595x.f(nVar3);
                    }
                }
                Iterator<MotionHelper> it = motionLayout5.f1582k0.iterator();
                while (it.hasNext()) {
                    it.next().u(motionLayout5, motionLayout5.H);
                }
                for (int i25 = 0; i25 < i21; i25++) {
                    n nVar4 = motionLayout5.H.get(motionLayout5.findViewById(iArr[i25]));
                    if (nVar4 != null) {
                        nVar4.h(width, height, motionLayout5.getNanoTime());
                    }
                }
            } else {
                for (int i26 = 0; i26 < i21; i26++) {
                    n nVar5 = motionLayout5.H.get(motionLayout5.findViewById(iArr[i26]));
                    if (nVar5 != null) {
                        motionLayout5.f1595x.f(nVar5);
                        nVar5.h(width, height, motionLayout5.getNanoTime());
                    }
                }
            }
            for (int i27 = 0; i27 < childCount; i27++) {
                View childAt2 = motionLayout5.getChildAt(i27);
                n nVar6 = motionLayout5.H.get(childAt2);
                if (!sparseBooleanArray.get(childAt2.getId()) && nVar6 != null) {
                    motionLayout5.f1595x.f(nVar6);
                    nVar6.h(width, height, motionLayout5.getNanoTime());
                }
            }
            a.b bVar2 = motionLayout5.f1595x.f1642c;
            if (bVar2 != null) {
                f10 = bVar2.f1668i;
            } else {
                f10 = 0.0f;
            }
            if (f10 != 0.0f) {
                if (((double) f10) < 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                float abs = Math.abs(f10);
                float f13 = -3.4028235E38f;
                float f14 = Float.MAX_VALUE;
                float f15 = -3.4028235E38f;
                float f16 = Float.MAX_VALUE;
                int i28 = 0;
                while (true) {
                    if (i28 >= childCount) {
                        z15 = false;
                        break;
                    }
                    n nVar7 = motionLayout5.H.get(motionLayout5.getChildAt(i28));
                    if (!Float.isNaN(nVar7.f9740l)) {
                        break;
                    }
                    p pVar = nVar7.f9735g;
                    float f17 = pVar.f9760e;
                    float f18 = pVar.f9761f;
                    if (z13) {
                        f12 = f18 - f17;
                    } else {
                        f12 = f18 + f17;
                    }
                    f16 = Math.min(f16, f12);
                    f15 = Math.max(f15, f12);
                    i28++;
                }
                if (z15) {
                    for (int i29 = 0; i29 < childCount; i29++) {
                        n nVar8 = motionLayout5.H.get(motionLayout5.getChildAt(i29));
                        if (!Float.isNaN(nVar8.f9740l)) {
                            f14 = Math.min(f14, nVar8.f9740l);
                            f13 = Math.max(f13, nVar8.f9740l);
                        }
                    }
                    while (i13 < childCount) {
                        n nVar9 = motionLayout5.H.get(motionLayout5.getChildAt(i13));
                        if (!Float.isNaN(nVar9.f9740l)) {
                            nVar9.f9742n = 1.0f / (1.0f - abs);
                            if (z13) {
                                nVar9.f9741m = abs - (((f13 - nVar9.f9740l) / (f13 - f14)) * abs);
                            } else {
                                nVar9.f9741m = abs - (((nVar9.f9740l - f14) * abs) / (f13 - f14));
                            }
                        }
                        i13++;
                    }
                    return;
                }
                while (i13 < childCount) {
                    n nVar10 = motionLayout5.H.get(motionLayout5.getChildAt(i13));
                    p pVar2 = nVar10.f9735g;
                    float f19 = pVar2.f9760e;
                    float f20 = pVar2.f9761f;
                    if (z13) {
                        f11 = f20 - f19;
                    } else {
                        f11 = f20 + f19;
                    }
                    nVar10.f9742n = 1.0f / (1.0f - abs);
                    nVar10.f9741m = abs - (((f11 - f16) * abs) / (f15 - f16));
                    i13++;
                }
            }
        }

        public final void g(c1.f fVar, androidx.constraintlayout.widget.a aVar) {
            a.C0016a aVar2;
            a.C0016a aVar3;
            SparseArray sparseArray = new SparseArray();
            Constraints.LayoutParams layoutParams = new Constraints.LayoutParams();
            sparseArray.clear();
            sparseArray.put(0, fVar);
            sparseArray.put(MotionLayout.this.getId(), fVar);
            if (!(aVar == null || aVar.f1943c == 0)) {
                MotionLayout motionLayout = MotionLayout.this;
                c1.f fVar2 = this.f1622b;
                int optimizationLevel = motionLayout.getOptimizationLevel();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getHeight(), 1073741824);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(MotionLayout.this.getWidth(), 1073741824);
                boolean z10 = MotionLayout.M0;
                motionLayout.o(fVar2, optimizationLevel, makeMeasureSpec, makeMeasureSpec2);
            }
            Iterator<c1.e> it = fVar.f4510w0.iterator();
            while (it.hasNext()) {
                c1.e next = it.next();
                next.f4440k0 = true;
                sparseArray.put(((View) next.f4436i0).getId(), next);
            }
            Iterator<c1.e> it2 = fVar.f4510w0.iterator();
            while (it2.hasNext()) {
                c1.e next2 = it2.next();
                View view = (View) next2.f4436i0;
                int id2 = view.getId();
                if (aVar.f1946f.containsKey(Integer.valueOf(id2)) && (aVar3 = aVar.f1946f.get(Integer.valueOf(id2))) != null) {
                    aVar3.a(layoutParams);
                }
                next2.R(aVar.h(view.getId()).f1951e.f1972c);
                next2.O(aVar.h(view.getId()).f1951e.f1974d);
                if (view instanceof ConstraintHelper) {
                    ConstraintHelper constraintHelper = (ConstraintHelper) view;
                    int id3 = constraintHelper.getId();
                    if (aVar.f1946f.containsKey(Integer.valueOf(id3)) && (aVar2 = aVar.f1946f.get(Integer.valueOf(id3))) != null && (next2 instanceof j)) {
                        constraintHelper.o(aVar2, (j) next2, layoutParams, sparseArray);
                    }
                    if (view instanceof Barrier) {
                        ((Barrier) view).t();
                    }
                }
                layoutParams.resolveLayoutDirection(MotionLayout.this.getLayoutDirection());
                MotionLayout motionLayout2 = MotionLayout.this;
                boolean z11 = MotionLayout.M0;
                motionLayout2.b(false, view, next2, layoutParams, sparseArray);
                if (aVar.h(view.getId()).f1949c.f2026c == 1) {
                    next2.f4438j0 = view.getVisibility();
                } else {
                    next2.f4438j0 = aVar.h(view.getId()).f1949c.f2025b;
                }
            }
            Iterator<c1.e> it3 = fVar.f4510w0.iterator();
            while (it3.hasNext()) {
                c1.e next3 = it3.next();
                if (next3 instanceof c1.m) {
                    c1.i iVar = (c1.i) next3;
                    ((ConstraintHelper) next3.f4436i0).s(iVar, sparseArray);
                    c1.m mVar = (c1.m) iVar;
                    for (int i10 = 0; i10 < mVar.f4506x0; i10++) {
                        c1.e eVar = mVar.f4505w0[i10];
                        if (eVar != null) {
                            eVar.H = true;
                        }
                    }
                }
            }
        }
    }

    public static class f {

        /* renamed from: b  reason: collision with root package name */
        public static f f1628b = new f();

        /* renamed from: a  reason: collision with root package name */
        public VelocityTracker f1629a;
    }

    public class g {

        /* renamed from: a  reason: collision with root package name */
        public float f1630a = Float.NaN;

        /* renamed from: b  reason: collision with root package name */
        public float f1631b = Float.NaN;

        /* renamed from: c  reason: collision with root package name */
        public int f1632c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f1633d = -1;

        public g() {
        }

        public final void a() {
            int i10 = this.f1632c;
            if (!(i10 == -1 && this.f1633d == -1)) {
                if (i10 == -1) {
                    MotionLayout motionLayout = MotionLayout.this;
                    int i11 = this.f1633d;
                    if (!motionLayout.isAttachedToWindow()) {
                        if (motionLayout.B0 == null) {
                            motionLayout.B0 = new g();
                        }
                        motionLayout.B0.f1633d = i11;
                    } else {
                        motionLayout.E(i11, -1);
                    }
                } else {
                    int i12 = this.f1633d;
                    if (i12 == -1) {
                        MotionLayout.this.setState(i10, -1, -1);
                    } else {
                        MotionLayout.this.setTransition(i10, i12);
                    }
                }
                MotionLayout.this.setState(i.SETUP);
            }
            if (!Float.isNaN(this.f1631b)) {
                MotionLayout.this.setProgress(this.f1630a, this.f1631b);
                this.f1630a = Float.NaN;
                this.f1631b = Float.NaN;
                this.f1632c = -1;
                this.f1633d = -1;
            } else if (!Float.isNaN(this.f1630a)) {
                MotionLayout.this.setProgress(this.f1630a);
            }
        }
    }

    public interface h {
        void a(int i10);

        void b();

        void c();

        void d();
    }

    public enum i {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    public MotionLayout(Context context) {
        super(context);
        new HashMap();
        this.D0 = new Rect();
        this.E0 = false;
        this.F0 = i.UNDEFINED;
        this.G0 = new e();
        this.H0 = false;
        this.I0 = new RectF();
        this.J0 = null;
        this.K0 = null;
        this.L0 = new ArrayList<>();
        z((AttributeSet) null);
    }

    public static Rect q(MotionLayout motionLayout, c1.e eVar) {
        motionLayout.D0.top = eVar.w();
        motionLayout.D0.left = eVar.v();
        Rect rect = motionLayout.D0;
        int u10 = eVar.u();
        Rect rect2 = motionLayout.D0;
        rect.right = u10 + rect2.left;
        int o10 = eVar.o();
        Rect rect3 = motionLayout.D0;
        rect2.bottom = o10 + rect3.top;
        return rect3;
    }

    public final void A() {
        a.b bVar;
        b bVar2;
        View findViewById;
        View findViewById2;
        a aVar = this.f1595x;
        if (aVar != null) {
            if (aVar.a(this.C, this)) {
                requestLayout();
                return;
            }
            int i10 = this.C;
            View view = null;
            if (i10 != -1) {
                a aVar2 = this.f1595x;
                Iterator<a.b> it = aVar2.f1643d.iterator();
                while (it.hasNext()) {
                    a.b next = it.next();
                    if (next.f1672m.size() > 0) {
                        Iterator<a.b.C0015a> it2 = next.f1672m.iterator();
                        while (it2.hasNext()) {
                            int i11 = it2.next().f1679b;
                            if (!(i11 == -1 || (findViewById2 = findViewById(i11)) == null)) {
                                findViewById2.setOnClickListener((View.OnClickListener) null);
                            }
                        }
                    }
                }
                Iterator<a.b> it3 = aVar2.f1645f.iterator();
                while (it3.hasNext()) {
                    a.b next2 = it3.next();
                    if (next2.f1672m.size() > 0) {
                        Iterator<a.b.C0015a> it4 = next2.f1672m.iterator();
                        while (it4.hasNext()) {
                            int i12 = it4.next().f1679b;
                            if (!(i12 == -1 || (findViewById = findViewById(i12)) == null)) {
                                findViewById.setOnClickListener((View.OnClickListener) null);
                            }
                        }
                    }
                }
                Iterator<a.b> it5 = aVar2.f1643d.iterator();
                while (it5.hasNext()) {
                    a.b next3 = it5.next();
                    if (next3.f1672m.size() > 0) {
                        Iterator<a.b.C0015a> it6 = next3.f1672m.iterator();
                        while (it6.hasNext()) {
                            it6.next().a(this, i10, next3);
                        }
                    }
                }
                Iterator<a.b> it7 = aVar2.f1645f.iterator();
                while (it7.hasNext()) {
                    a.b next4 = it7.next();
                    if (next4.f1672m.size() > 0) {
                        Iterator<a.b.C0015a> it8 = next4.f1672m.iterator();
                        while (it8.hasNext()) {
                            it8.next().a(this, i10, next4);
                        }
                    }
                }
            }
            if (this.f1595x.o() && (bVar = this.f1595x.f1642c) != null && (bVar2 = bVar.f1671l) != null) {
                int i13 = bVar2.f1684d;
                if (i13 != -1 && (view = bVar2.f1698r.findViewById(i13)) == null) {
                    f1.a.c(bVar2.f1698r.getContext(), bVar2.f1684d);
                }
                if (view instanceof NestedScrollView) {
                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                    nestedScrollView.setOnTouchListener(new q());
                    nestedScrollView.setOnScrollChangeListener(new r());
                }
            }
        }
    }

    public final void B() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if (this.Q != null || ((copyOnWriteArrayList = this.f1583l0) != null && !copyOnWriteArrayList.isEmpty())) {
            Iterator<Integer> it = this.L0.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                h hVar = this.Q;
                if (hVar != null) {
                    hVar.a(next.intValue());
                }
                CopyOnWriteArrayList<h> copyOnWriteArrayList2 = this.f1583l0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<h> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().a(next.intValue());
                    }
                }
            }
            this.L0.clear();
        }
    }

    public final void C() {
        this.G0.f();
        invalidate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (r1 != 7) goto L_0x016b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if ((((r4 * r6) - (((r5 * r6) * r6) / 2.0f)) + r1) > 1.0f) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        if ((((((r5 * r3) * r3) / 2.0f) + (r4 * r3)) + r1) < 0.0f) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(float r15, float r16, int r17) {
        /*
            r14 = this;
            r0 = r14
            r8 = r15
            r4 = r16
            r1 = r17
            androidx.constraintlayout.motion.widget.a r2 = r0.f1595x
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            float r2 = r0.L
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x0012
            return
        L_0x0012:
            r2 = 1
            r0.T = r2
            long r5 = r14.getNanoTime()
            r0.I = r5
            androidx.constraintlayout.motion.widget.a r3 = r0.f1595x
            int r3 = r3.c()
            float r3 = (float) r3
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r5 = r3 / r5
            r0.J = r5
            r0.N = r8
            r0.P = r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 7
            r7 = 6
            r9 = 2
            r10 = 0
            r11 = 0
            if (r1 == 0) goto L_0x00cd
            if (r1 == r2) goto L_0x00cd
            if (r1 == r9) goto L_0x00cd
            r12 = 4
            if (r1 == r12) goto L_0x00b7
            r12 = 5
            if (r1 == r12) goto L_0x0045
            if (r1 == r7) goto L_0x00cd
            if (r1 == r6) goto L_0x00cd
            goto L_0x016b
        L_0x0045:
            float r1 = r0.L
            androidx.constraintlayout.motion.widget.a r5 = r0.f1595x
            float r5 = r5.g()
            int r6 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            r7 = 1073741824(0x40000000, float:2.0)
            if (r6 <= 0) goto L_0x0061
            float r6 = r4 / r5
            float r9 = r4 * r6
            float r5 = r5 * r6
            float r5 = r5 * r6
            float r5 = r5 / r7
            float r9 = r9 - r5
            float r9 = r9 + r1
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x006f
            goto L_0x0070
        L_0x0061:
            float r3 = -r4
            float r3 = r3 / r5
            float r6 = r4 * r3
            float r5 = r5 * r3
            float r5 = r5 * r3
            float r5 = r5 / r7
            float r5 = r5 + r6
            float r5 = r5 + r1
            int r1 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r1 >= 0) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = r10
        L_0x0070:
            if (r2 == 0) goto L_0x0088
            androidx.constraintlayout.motion.widget.MotionLayout$c r1 = r0.V
            float r2 = r0.L
            androidx.constraintlayout.motion.widget.a r3 = r0.f1595x
            float r3 = r3.g()
            r1.f1603a = r4
            r1.f1604b = r2
            r1.f1605c = r3
            androidx.constraintlayout.motion.widget.MotionLayout$c r1 = r0.V
            r0.f1597y = r1
            goto L_0x016b
        L_0x0088:
            e1.a r1 = r0.U
            float r2 = r0.L
            float r5 = r0.J
            androidx.constraintlayout.motion.widget.a r3 = r0.f1595x
            float r6 = r3.g()
            androidx.constraintlayout.motion.widget.a r3 = r0.f1595x
            androidx.constraintlayout.motion.widget.a$b r3 = r3.f1642c
            if (r3 == 0) goto L_0x00a2
            androidx.constraintlayout.motion.widget.b r3 = r3.f1671l
            if (r3 == 0) goto L_0x00a2
            float r3 = r3.f1699s
            r7 = r3
            goto L_0x00a3
        L_0x00a2:
            r7 = r11
        L_0x00a3:
            r3 = r15
            r4 = r16
            r1.b(r2, r3, r4, r5, r6, r7)
            r0.A = r11
            int r1 = r0.C
            r0.N = r8
            r0.C = r1
            e1.a r1 = r0.U
            r0.f1597y = r1
            goto L_0x016b
        L_0x00b7:
            androidx.constraintlayout.motion.widget.MotionLayout$c r1 = r0.V
            float r2 = r0.L
            androidx.constraintlayout.motion.widget.a r3 = r0.f1595x
            float r3 = r3.g()
            r1.f1603a = r4
            r1.f1604b = r2
            r1.f1605c = r3
            androidx.constraintlayout.motion.widget.MotionLayout$c r1 = r0.V
            r0.f1597y = r1
            goto L_0x016b
        L_0x00cd:
            if (r1 == r2) goto L_0x00d8
            if (r1 != r6) goto L_0x00d2
            goto L_0x00d8
        L_0x00d2:
            if (r1 == r9) goto L_0x00d6
            if (r1 != r7) goto L_0x00d9
        L_0x00d6:
            r8 = r3
            goto L_0x00d9
        L_0x00d8:
            r8 = r11
        L_0x00d9:
            androidx.constraintlayout.motion.widget.a r1 = r0.f1595x
            androidx.constraintlayout.motion.widget.a$b r2 = r1.f1642c
            if (r2 == 0) goto L_0x00e6
            androidx.constraintlayout.motion.widget.b r3 = r2.f1671l
            if (r3 == 0) goto L_0x00e6
            int r3 = r3.D
            goto L_0x00e7
        L_0x00e6:
            r3 = r10
        L_0x00e7:
            if (r3 != 0) goto L_0x0109
            e1.a r2 = r0.U
            float r3 = r0.L
            float r6 = r1.g()
            androidx.constraintlayout.motion.widget.a r1 = r0.f1595x
            androidx.constraintlayout.motion.widget.a$b r1 = r1.f1642c
            if (r1 == 0) goto L_0x00ff
            androidx.constraintlayout.motion.widget.b r1 = r1.f1671l
            if (r1 == 0) goto L_0x00ff
            float r1 = r1.f1699s
            r7 = r1
            goto L_0x0100
        L_0x00ff:
            r7 = r11
        L_0x0100:
            r1 = r2
            r2 = r3
            r3 = r8
            r4 = r16
            r1.b(r2, r3, r4, r5, r6, r7)
            goto L_0x0161
        L_0x0109:
            e1.a r1 = r0.U
            float r3 = r0.L
            if (r2 == 0) goto L_0x0116
            androidx.constraintlayout.motion.widget.b r4 = r2.f1671l
            if (r4 == 0) goto L_0x0116
            float r4 = r4.f1706z
            goto L_0x0117
        L_0x0116:
            r4 = r11
        L_0x0117:
            if (r2 == 0) goto L_0x0120
            androidx.constraintlayout.motion.widget.b r5 = r2.f1671l
            if (r5 == 0) goto L_0x0120
            float r5 = r5.A
            goto L_0x0121
        L_0x0120:
            r5 = r11
        L_0x0121:
            if (r2 == 0) goto L_0x012a
            androidx.constraintlayout.motion.widget.b r6 = r2.f1671l
            if (r6 == 0) goto L_0x012a
            float r6 = r6.f1705y
            goto L_0x012b
        L_0x012a:
            r6 = r11
        L_0x012b:
            if (r2 == 0) goto L_0x0134
            androidx.constraintlayout.motion.widget.b r7 = r2.f1671l
            if (r7 == 0) goto L_0x0134
            float r7 = r7.B
            goto L_0x0135
        L_0x0134:
            r7 = r11
        L_0x0135:
            if (r2 == 0) goto L_0x013e
            androidx.constraintlayout.motion.widget.b r2 = r2.f1671l
            if (r2 == 0) goto L_0x013e
            int r2 = r2.C
            goto L_0x013f
        L_0x013e:
            r2 = r10
        L_0x013f:
            b1.k r9 = r1.f9073b
            if (r9 != 0) goto L_0x014a
            b1.k r9 = new b1.k
            r9.<init>()
            r1.f9073b = r9
        L_0x014a:
            b1.k r9 = r1.f9073b
            r1.f9074c = r9
            double r12 = (double) r8
            r9.f3946c = r12
            double r12 = (double) r6
            r9.f3944a = r12
            r9.f3948e = r3
            double r5 = (double) r5
            r9.f3945b = r5
            r9.f3950g = r4
            r9.f3951h = r7
            r9.f3952i = r2
            r9.f3947d = r11
        L_0x0161:
            int r1 = r0.C
            r0.N = r8
            r0.C = r1
            e1.a r1 = r0.U
            r0.f1597y = r1
        L_0x016b:
            r0.O = r10
            long r1 = r14.getNanoTime()
            r0.I = r1
            r14.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.D(float, float, int):void");
    }

    public final void E(int i10, int i11) {
        float f10;
        g1.d dVar;
        a aVar = this.f1595x;
        if (!(aVar == null || (dVar = aVar.f1641b) == null)) {
            int i12 = this.C;
            float f11 = (float) -1;
            d.a aVar2 = dVar.f10288b.get(i10);
            if (aVar2 == null) {
                i12 = i10;
            } else {
                int i13 = (f11 > -1.0f ? 1 : (f11 == -1.0f ? 0 : -1));
                if (i13 != 0 && i13 != 0) {
                    Iterator<d.b> it = aVar2.f10290b.iterator();
                    d.b bVar = null;
                    while (true) {
                        if (it.hasNext()) {
                            d.b next = it.next();
                            if (next.a(f11, f11)) {
                                if (i12 == next.f10296e) {
                                    break;
                                }
                                bVar = next;
                            }
                        } else {
                            i12 = bVar != null ? bVar.f10296e : aVar2.f10291c;
                        }
                    }
                } else if (aVar2.f10291c != i12) {
                    Iterator<d.b> it2 = aVar2.f10290b.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (i12 == it2.next().f10296e) {
                                break;
                            }
                        } else {
                            i12 = aVar2.f10291c;
                            break;
                        }
                    }
                }
            }
            if (i12 != -1) {
                i10 = i12;
            }
        }
        int i14 = this.C;
        if (i14 != i10) {
            if (this.B == i10) {
                r(0.0f);
                if (i11 > 0) {
                    this.J = ((float) i11) / 1000.0f;
                }
            } else if (this.D == i10) {
                r(1.0f);
                if (i11 > 0) {
                    this.J = ((float) i11) / 1000.0f;
                }
            } else {
                this.D = i10;
                if (i14 != -1) {
                    setTransition(i14, i10);
                    r(1.0f);
                    this.L = 0.0f;
                    r(1.0f);
                    this.C0 = null;
                    if (i11 > 0) {
                        this.J = ((float) i11) / 1000.0f;
                        return;
                    }
                    return;
                }
                this.T = false;
                this.N = 1.0f;
                this.K = 0.0f;
                this.L = 0.0f;
                this.M = getNanoTime();
                this.I = getNanoTime();
                this.O = false;
                this.f1597y = null;
                if (i11 == -1) {
                    this.J = ((float) this.f1595x.c()) / 1000.0f;
                }
                this.B = -1;
                this.f1595x.n(-1, this.D);
                SparseArray sparseArray = new SparseArray();
                if (i11 == 0) {
                    this.J = ((float) this.f1595x.c()) / 1000.0f;
                } else if (i11 > 0) {
                    this.J = ((float) i11) / 1000.0f;
                }
                int childCount = getChildCount();
                this.H.clear();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = getChildAt(i15);
                    this.H.put(childAt, new n(childAt));
                    sparseArray.put(childAt.getId(), this.H.get(childAt));
                }
                this.P = true;
                this.G0.e((androidx.constraintlayout.widget.a) null, this.f1595x.b(i10));
                C();
                this.G0.a();
                int childCount2 = getChildCount();
                for (int i16 = 0; i16 < childCount2; i16++) {
                    View childAt2 = getChildAt(i16);
                    n nVar = this.H.get(childAt2);
                    if (nVar != null) {
                        p pVar = nVar.f9734f;
                        pVar.f9758c = 0.0f;
                        pVar.f9759d = 0.0f;
                        pVar.j(childAt2.getX(), childAt2.getY(), (float) childAt2.getWidth(), (float) childAt2.getHeight());
                        f1.l lVar = nVar.f9736h;
                        lVar.getClass();
                        childAt2.getX();
                        childAt2.getY();
                        childAt2.getWidth();
                        childAt2.getHeight();
                        lVar.c(childAt2);
                    }
                }
                int width = getWidth();
                int height = getHeight();
                if (this.f1582k0 != null) {
                    for (int i17 = 0; i17 < childCount; i17++) {
                        n nVar2 = this.H.get(getChildAt(i17));
                        if (nVar2 != null) {
                            this.f1595x.f(nVar2);
                        }
                    }
                    Iterator<MotionHelper> it3 = this.f1582k0.iterator();
                    while (it3.hasNext()) {
                        it3.next().u(this, this.H);
                    }
                    for (int i18 = 0; i18 < childCount; i18++) {
                        n nVar3 = this.H.get(getChildAt(i18));
                        if (nVar3 != null) {
                            nVar3.h(width, height, getNanoTime());
                        }
                    }
                } else {
                    for (int i19 = 0; i19 < childCount; i19++) {
                        n nVar4 = this.H.get(getChildAt(i19));
                        if (nVar4 != null) {
                            this.f1595x.f(nVar4);
                            nVar4.h(width, height, getNanoTime());
                        }
                    }
                }
                a.b bVar2 = this.f1595x.f1642c;
                if (bVar2 != null) {
                    f10 = bVar2.f1668i;
                } else {
                    f10 = 0.0f;
                }
                if (f10 != 0.0f) {
                    float f12 = Float.MAX_VALUE;
                    float f13 = -3.4028235E38f;
                    for (int i20 = 0; i20 < childCount; i20++) {
                        p pVar2 = this.H.get(getChildAt(i20)).f9735g;
                        float f14 = pVar2.f9761f + pVar2.f9760e;
                        f12 = Math.min(f12, f14);
                        f13 = Math.max(f13, f14);
                    }
                    for (int i21 = 0; i21 < childCount; i21++) {
                        n nVar5 = this.H.get(getChildAt(i21));
                        p pVar3 = nVar5.f9735g;
                        float f15 = pVar3.f9760e;
                        float f16 = pVar3.f9761f;
                        nVar5.f9742n = 1.0f / (1.0f - f10);
                        nVar5.f9741m = f10 - ((((f15 + f16) - f12) * f10) / (f13 - f12));
                    }
                }
                this.K = 0.0f;
                this.L = 0.0f;
                this.P = true;
                invalidate();
            }
        }
    }

    public final void F(int i10, androidx.constraintlayout.widget.a aVar) {
        a aVar2 = this.f1595x;
        if (aVar2 != null) {
            aVar2.f1646g.put(i10, aVar);
        }
        this.G0.e(this.f1595x.b(this.B), this.f1595x.b(this.D));
        C();
        if (this.C == i10) {
            aVar.b(this);
        }
    }

    public final void G(int i10, View... viewArr) {
        androidx.constraintlayout.widget.a aVar;
        a aVar2 = this.f1595x;
        if (aVar2 != null) {
            d dVar = aVar2.f1656q;
            dVar.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<c> it = dVar.f1742b.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next.f1707a == i10) {
                    for (View view : viewArr) {
                        if (next.b(view)) {
                            arrayList.add(view);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View[] viewArr2 = (View[]) arrayList.toArray(new View[0]);
                        int currentState = dVar.f1741a.getCurrentState();
                        if (next.f1711e == 2) {
                            next.a(dVar, dVar.f1741a, currentState, (androidx.constraintlayout.widget.a) null, viewArr2);
                        } else if (currentState == -1) {
                            dVar.f1741a.toString();
                        } else {
                            a aVar3 = dVar.f1741a.f1595x;
                            if (aVar3 == null) {
                                aVar = null;
                            } else {
                                aVar = aVar3.b(currentState);
                            }
                            androidx.constraintlayout.widget.a aVar4 = aVar;
                            if (aVar4 != null) {
                                next.a(dVar, dVar.f1741a, currentState, aVar4, viewArr2);
                            }
                        }
                        arrayList.clear();
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0338  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0362  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x036d  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0396  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03a3  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:215:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dispatchDraw(android.graphics.Canvas r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r2 = r0.f1582k0
            if (r2 == 0) goto L_0x001c
            java.util.Iterator r2 = r2.iterator()
        L_0x000c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x001c
            java.lang.Object r3 = r2.next()
            androidx.constraintlayout.motion.widget.MotionHelper r3 = (androidx.constraintlayout.motion.widget.MotionHelper) r3
            r3.getClass()
            goto L_0x000c
        L_0x001c:
            r2 = 0
            r0.t(r2)
            androidx.constraintlayout.motion.widget.a r3 = r0.f1595x
            r4 = 0
            if (r3 == 0) goto L_0x0058
            androidx.constraintlayout.motion.widget.d r3 = r3.f1656q
            if (r3 == 0) goto L_0x0058
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c$a> r5 = r3.f1744d
            if (r5 != 0) goto L_0x002e
            goto L_0x0058
        L_0x002e:
            java.util.Iterator r5 = r5.iterator()
        L_0x0032:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0042
            java.lang.Object r6 = r5.next()
            androidx.constraintlayout.motion.widget.c$a r6 = (androidx.constraintlayout.motion.widget.c.a) r6
            r6.a()
            goto L_0x0032
        L_0x0042:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c$a> r5 = r3.f1744d
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c$a> r6 = r3.f1745e
            r5.removeAll(r6)
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c$a> r5 = r3.f1745e
            r5.clear()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c$a> r5 = r3.f1744d
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0058
            r3.f1744d = r4
        L_0x0058:
            super.dispatchDraw(r28)
            androidx.constraintlayout.motion.widget.a r3 = r0.f1595x
            if (r3 != 0) goto L_0x0060
            return
        L_0x0060:
            int r3 = r0.R
            r4 = 1
            r3 = r3 & r4
            r5 = 1093664768(0x41300000, float:11.0)
            r6 = 1092616192(0x41200000, float:10.0)
            if (r3 != r4) goto L_0x0123
            boolean r3 = r27.isInEditMode()
            if (r3 != 0) goto L_0x0123
            int r3 = r0.f1584m0
            int r3 = r3 + r4
            r0.f1584m0 = r3
            long r7 = r27.getNanoTime()
            long r9 = r0.f1585n0
            r11 = -1
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x00a0
            long r9 = r7 - r9
            r11 = 200000000(0xbebc200, double:9.8813129E-316)
            int r3 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a2
            int r3 = r0.f1584m0
            float r3 = (float) r3
            float r9 = (float) r9
            r10 = 814313567(0x3089705f, float:1.0E-9)
            float r9 = r9 * r10
            float r3 = r3 / r9
            r9 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r9
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r9
            r0.f1586o0 = r3
            r0.f1584m0 = r2
            r0.f1585n0 = r7
            goto L_0x00a2
        L_0x00a0:
            r0.f1585n0 = r7
        L_0x00a2:
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r7 = 1109917696(0x42280000, float:42.0)
            r3.setTextSize(r7)
            float r7 = r27.getProgress()
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 * r8
            int r7 = (int) r7
            float r7 = (float) r7
            float r7 = r7 / r6
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            float r9 = r0.f1586o0
            r8.append(r9)
            java.lang.String r9 = " fps "
            r8.append(r9)
            int r9 = r0.B
            java.lang.String r9 = f1.a.e(r9, r0)
            r8.append(r9)
            java.lang.String r9 = " -> "
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r8 = android.support.v4.media.a.q(r8)
            int r9 = r0.D
            java.lang.String r9 = f1.a.e(r9, r0)
            r8.append(r9)
            java.lang.String r9 = " (progress: "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = " ) state="
            r8.append(r7)
            int r7 = r0.C
            r9 = -1
            if (r7 != r9) goto L_0x00f9
            java.lang.String r7 = "undefined"
            goto L_0x00fd
        L_0x00f9:
            java.lang.String r7 = f1.a.e(r7, r0)
        L_0x00fd:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r8)
            int r8 = r27.getHeight()
            int r8 = r8 + -29
            float r8 = (float) r8
            r1.drawText(r7, r5, r8, r3)
            r8 = -7864184(0xffffffffff880088, float:NaN)
            r3.setColor(r8)
            int r8 = r27.getHeight()
            int r8 = r8 + -30
            float r8 = (float) r8
            r1.drawText(r7, r6, r8, r3)
        L_0x0123:
            int r3 = r0.R
            if (r3 <= r4) goto L_0x0523
            androidx.constraintlayout.motion.widget.MotionLayout$d r3 = r0.S
            if (r3 != 0) goto L_0x0132
            androidx.constraintlayout.motion.widget.MotionLayout$d r3 = new androidx.constraintlayout.motion.widget.MotionLayout$d
            r3.<init>()
            r0.S = r3
        L_0x0132:
            androidx.constraintlayout.motion.widget.MotionLayout$d r3 = r0.S
            java.util.HashMap<android.view.View, f1.n> r7 = r0.H
            androidx.constraintlayout.motion.widget.a r8 = r0.f1595x
            int r8 = r8.c()
            int r9 = r0.R
            r3.getClass()
            if (r7 == 0) goto L_0x0523
            int r10 = r7.size()
            if (r10 != 0) goto L_0x014b
            goto L_0x0525
        L_0x014b:
            r28.save()
            androidx.constraintlayout.motion.widget.MotionLayout r10 = androidx.constraintlayout.motion.widget.MotionLayout.this
            boolean r10 = r10.isInEditMode()
            r11 = 2
            if (r10 != 0) goto L_0x01a3
            r10 = r9 & 1
            if (r10 != r11) goto L_0x01a3
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = androidx.constraintlayout.motion.widget.MotionLayout.this
            android.content.Context r11 = r11.getContext()
            android.content.res.Resources r11 = r11.getResources()
            androidx.constraintlayout.motion.widget.MotionLayout r12 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r12 = r12.D
            java.lang.String r11 = r11.getResourceName(r12)
            r10.append(r11)
            java.lang.String r11 = ":"
            r10.append(r11)
            androidx.constraintlayout.motion.widget.MotionLayout r11 = androidx.constraintlayout.motion.widget.MotionLayout.this
            float r11 = r11.getProgress()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r11 = r11.getHeight()
            int r11 = r11 + -30
            float r11 = (float) r11
            android.graphics.Paint r12 = r3.f1614h
            r1.drawText(r10, r6, r11, r12)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = androidx.constraintlayout.motion.widget.MotionLayout.this
            int r6 = r6.getHeight()
            int r6 = r6 + -29
            float r6 = (float) r6
            android.graphics.Paint r11 = r3.f1611e
            r1.drawText(r10, r5, r6, r11)
        L_0x01a3:
            java.util.Collection r5 = r7.values()
            java.util.Iterator r5 = r5.iterator()
            r6 = r1
        L_0x01ac:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0520
            java.lang.Object r7 = r5.next()
            f1.n r7 = (f1.n) r7
            f1.p r10 = r7.f9734f
            int r10 = r10.f9757b
            java.util.ArrayList<f1.p> r11 = r7.f9749u
            java.util.Iterator r11 = r11.iterator()
        L_0x01c2:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x01d5
            java.lang.Object r12 = r11.next()
            f1.p r12 = (f1.p) r12
            int r12 = r12.f9757b
            int r10 = java.lang.Math.max(r10, r12)
            goto L_0x01c2
        L_0x01d5:
            f1.p r11 = r7.f9735g
            int r11 = r11.f9757b
            int r10 = java.lang.Math.max(r10, r11)
            if (r9 <= 0) goto L_0x01e2
            if (r10 != 0) goto L_0x01e2
            r10 = r4
        L_0x01e2:
            if (r10 != 0) goto L_0x01e5
            goto L_0x01ac
        L_0x01e5:
            float[] r4 = r3.f1609c
            int[] r11 = r3.f1608b
            if (r4 == 0) goto L_0x0245
            b1.b[] r12 = r7.f9738j
            r12 = r12[r2]
            double[] r15 = r12.g()
            if (r11 == 0) goto L_0x0211
            java.util.ArrayList<f1.p> r12 = r7.f9749u
            java.util.Iterator r12 = r12.iterator()
            r13 = r2
        L_0x01fc:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x0211
            java.lang.Object r14 = r12.next()
            f1.p r14 = (f1.p) r14
            int r16 = r13 + 1
            int r14 = r14.f9770v
            r11[r13] = r14
            r13 = r16
            goto L_0x01fc
        L_0x0211:
            r11 = r2
            r18 = r11
        L_0x0214:
            int r12 = r15.length
            if (r2 >= r12) goto L_0x0240
            b1.b[] r12 = r7.f9738j
            r11 = r12[r11]
            r12 = r15[r2]
            double[] r14 = r7.f9744p
            r11.c(r12, r14)
            f1.p r11 = r7.f9734f
            r12 = r15[r2]
            int[] r14 = r7.f9743o
            r19 = r5
            double[] r5 = r7.f9744p
            r20 = r15
            r15 = r5
            r16 = r4
            r17 = r18
            r11.i(r12, r14, r15, r16, r17)
            int r18 = r18 + 2
            int r2 = r2 + 1
            r11 = 0
            r5 = r19
            r15 = r20
            goto L_0x0214
        L_0x0240:
            r19 = r5
            int r18 = r18 / 2
            goto L_0x0249
        L_0x0245:
            r19 = r5
            r18 = 0
        L_0x0249:
            r2 = r18
            r3.f1617k = r2
            r2 = 1
            if (r10 < r2) goto L_0x050f
            int r2 = r8 / 16
            float[] r4 = r3.f1607a
            if (r4 == 0) goto L_0x025b
            int r4 = r4.length
            int r5 = r2 * 2
            if (r4 == r5) goto L_0x0268
        L_0x025b:
            int r4 = r2 * 2
            float[] r4 = new float[r4]
            r3.f1607a = r4
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            r3.f1610d = r4
        L_0x0268:
            int r4 = r3.f1619m
            float r4 = (float) r4
            r6.translate(r4, r4)
            android.graphics.Paint r4 = r3.f1611e
            r5 = 1996488704(0x77000000, float:2.5961484E33)
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f1615i
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f1612f
            r4.setColor(r5)
            android.graphics.Paint r4 = r3.f1613g
            r4.setColor(r5)
            float[] r4 = r3.f1607a
            int r5 = r2 + -1
            float r5 = (float) r5
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r6 / r5
            java.util.HashMap<java.lang.String, e1.c> r11 = r7.f9753y
            java.lang.String r12 = "translationX"
            if (r11 != 0) goto L_0x0295
            r11 = 0
            goto L_0x029b
        L_0x0295:
            java.lang.Object r11 = r11.get(r12)
            b1.j r11 = (b1.j) r11
        L_0x029b:
            r15 = r11
            java.util.HashMap<java.lang.String, e1.c> r11 = r7.f9753y
            java.lang.String r13 = "translationY"
            if (r11 != 0) goto L_0x02a4
            r11 = 0
            goto L_0x02aa
        L_0x02a4:
            java.lang.Object r11 = r11.get(r13)
            b1.j r11 = (b1.j) r11
        L_0x02aa:
            r14 = r11
            java.util.HashMap<java.lang.String, e1.b> r11 = r7.f9754z
            if (r11 != 0) goto L_0x02b1
            r11 = 0
            goto L_0x02b7
        L_0x02b1:
            java.lang.Object r11 = r11.get(r12)
            e1.b r11 = (e1.b) r11
        L_0x02b7:
            r12 = r11
            java.util.HashMap<java.lang.String, e1.b> r11 = r7.f9754z
            if (r11 != 0) goto L_0x02be
            r11 = 0
            goto L_0x02c4
        L_0x02be:
            java.lang.Object r11 = r11.get(r13)
            e1.b r11 = (e1.b) r11
        L_0x02c4:
            r13 = r11
            r11 = 0
        L_0x02c6:
            if (r11 >= r2) goto L_0x03d3
            r18 = r2
            float r2 = (float) r11
            float r2 = r2 * r5
            r20 = r5
            float r5 = r7.f9742n
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x02f3
            float r6 = r7.f9741m
            int r16 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x02db
            r2 = 0
        L_0x02db:
            int r16 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r16 <= 0) goto L_0x02f3
            r21 = r8
            r22 = r9
            double r8 = (double) r2
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r8 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r8 >= 0) goto L_0x02f7
            float r2 = r2 - r6
            float r2 = r2 * r5
            r5 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r5)
            goto L_0x02f7
        L_0x02f3:
            r21 = r8
            r22 = r9
        L_0x02f7:
            double r5 = (double) r2
            f1.p r8 = r7.f9734f
            b1.c r8 = r8.f9756a
            java.util.ArrayList<f1.p> r9 = r7.f9749u
            java.util.Iterator r9 = r9.iterator()
            r16 = 2143289344(0x7fc00000, float:NaN)
            r17 = 0
        L_0x0306:
            boolean r23 = r9.hasNext()
            if (r23 == 0) goto L_0x0334
            java.lang.Object r23 = r9.next()
            r24 = r5
            r5 = r23
            f1.p r5 = (f1.p) r5
            b1.c r6 = r5.f9756a
            if (r6 == 0) goto L_0x0331
            r23 = r6
            float r6 = r5.f9758c
            int r26 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r26 >= 0) goto L_0x0327
            r17 = r6
            r8 = r23
            goto L_0x0331
        L_0x0327:
            boolean r6 = java.lang.Float.isNaN(r16)
            if (r6 == 0) goto L_0x0331
            float r5 = r5.f9758c
            r16 = r5
        L_0x0331:
            r5 = r24
            goto L_0x0306
        L_0x0334:
            r24 = r5
            if (r8 == 0) goto L_0x0352
            boolean r5 = java.lang.Float.isNaN(r16)
            if (r5 == 0) goto L_0x0340
            r16 = 1065353216(0x3f800000, float:1.0)
        L_0x0340:
            float r5 = r2 - r17
            float r16 = r16 - r17
            float r5 = r5 / r16
            double r5 = (double) r5
            double r5 = r8.a(r5)
            float r5 = (float) r5
            float r5 = r5 * r16
            float r5 = r5 + r17
            double r5 = (double) r5
            goto L_0x0354
        L_0x0352:
            r5 = r24
        L_0x0354:
            b1.b[] r8 = r7.f9738j
            r9 = 0
            r8 = r8[r9]
            double[] r9 = r7.f9744p
            r8.c(r5, r9)
            b1.a r8 = r7.f9739k
            if (r8 == 0) goto L_0x036d
            double[] r9 = r7.f9744p
            r16 = r12
            int r12 = r9.length
            if (r12 <= 0) goto L_0x036f
            r8.c(r5, r9)
            goto L_0x036f
        L_0x036d:
            r16 = r12
        L_0x036f:
            f1.p r8 = r7.f9734f
            int[] r9 = r7.f9743o
            double[] r12 = r7.f9744p
            int r23 = r11 * 2
            r24 = r11
            r11 = r8
            r8 = r12
            r1 = r13
            r0 = r16
            r12 = r5
            r5 = r14
            r14 = r9
            r6 = r15
            r15 = r8
            r16 = r4
            r17 = r23
            r11.i(r12, r14, r15, r16, r17)
            if (r0 == 0) goto L_0x0396
            r8 = r4[r23]
            float r9 = r0.a(r2)
            float r9 = r9 + r8
            r4[r23] = r9
            goto L_0x03a1
        L_0x0396:
            if (r6 == 0) goto L_0x03a1
            r8 = r4[r23]
            float r9 = r6.a(r2)
            float r9 = r9 + r8
            r4[r23] = r9
        L_0x03a1:
            if (r1 == 0) goto L_0x03af
            int r23 = r23 + 1
            r8 = r4[r23]
            float r2 = r1.a(r2)
            float r2 = r2 + r8
            r4[r23] = r2
            goto L_0x03bc
        L_0x03af:
            if (r5 == 0) goto L_0x03bc
            int r23 = r23 + 1
            r8 = r4[r23]
            float r2 = r5.a(r2)
            float r2 = r2 + r8
            r4[r23] = r2
        L_0x03bc:
            int r11 = r24 + 1
            r2 = 1065353216(0x3f800000, float:1.0)
            r12 = r0
            r13 = r1
            r14 = r5
            r15 = r6
            r5 = r20
            r8 = r21
            r9 = r22
            r0 = r27
            r1 = r28
            r6 = r2
            r2 = r18
            goto L_0x02c6
        L_0x03d3:
            r21 = r8
            r22 = r9
            int r0 = r3.f1617k
            r1 = r28
            r3.a(r1, r10, r0, r7)
            android.graphics.Paint r0 = r3.f1611e
            r2 = -21965(0xffffffffffffaa33, float:NaN)
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.f1612f
            r2 = -2067046(0xffffffffffe0759a, float:NaN)
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.f1615i
            r0.setColor(r2)
            android.graphics.Paint r0 = r3.f1613g
            r2 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
            r0.setColor(r2)
            int r0 = r3.f1619m
            int r0 = -r0
            float r0 = (float) r0
            r1.translate(r0, r0)
            int r0 = r3.f1617k
            r3.a(r1, r10, r0, r7)
            r0 = 5
            if (r10 != r0) goto L_0x050b
            android.graphics.Path r0 = r3.f1610d
            r0.reset()
            r0 = 0
        L_0x040f:
            r2 = 50
            if (r0 > r2) goto L_0x04e2
            float r4 = (float) r0
            float r2 = (float) r2
            float r4 = r4 / r2
            float[] r2 = r3.f1616j
            r5 = 0
            float r4 = r7.b(r4, r5)
            b1.b[] r5 = r7.f9738j
            r6 = 0
            r5 = r5[r6]
            double r8 = (double) r4
            double[] r4 = r7.f9744p
            r5.c(r8, r4)
            f1.p r4 = r7.f9734f
            int[] r5 = r7.f9743o
            double[] r6 = r7.f9744p
            float r8 = r4.f9760e
            float r9 = r4.f9761f
            float r10 = r4.f9762n
            float r11 = r4.f9763o
            r12 = 0
        L_0x0437:
            int r13 = r5.length
            if (r12 >= r13) goto L_0x0456
            r13 = r6[r12]
            float r13 = (float) r13
            r14 = r5[r12]
            r15 = 1
            if (r14 == r15) goto L_0x0452
            r15 = 2
            if (r14 == r15) goto L_0x0450
            r15 = 3
            if (r14 == r15) goto L_0x044e
            r15 = 4
            if (r14 == r15) goto L_0x044c
            goto L_0x0453
        L_0x044c:
            r11 = r13
            goto L_0x0453
        L_0x044e:
            r10 = r13
            goto L_0x0453
        L_0x0450:
            r9 = r13
            goto L_0x0453
        L_0x0452:
            r8 = r13
        L_0x0453:
            int r12 = r12 + 1
            goto L_0x0437
        L_0x0456:
            f1.n r4 = r4.f9768t
            if (r4 == 0) goto L_0x047c
            r4 = 0
            double r4 = (double) r4
            double r12 = (double) r8
            double r8 = (double) r9
            double r14 = java.lang.Math.sin(r8)
            double r14 = r14 * r12
            double r14 = r14 + r4
            r6 = 1073741824(0x40000000, float:2.0)
            float r6 = r10 / r6
            r16 = r7
            double r6 = (double) r6
            double r14 = r14 - r6
            float r6 = (float) r14
            double r7 = java.lang.Math.cos(r8)
            double r7 = r7 * r12
            double r4 = r4 - r7
            r7 = 1073741824(0x40000000, float:2.0)
            float r7 = r11 / r7
            double r7 = (double) r7
            double r4 = r4 - r7
            float r9 = (float) r4
            r8 = r6
            goto L_0x047e
        L_0x047c:
            r16 = r7
        L_0x047e:
            float r10 = r10 + r8
            float r11 = r11 + r9
            r4 = 2143289344(0x7fc00000, float:NaN)
            java.lang.Float.isNaN(r4)
            java.lang.Float.isNaN(r4)
            r4 = 0
            float r8 = r8 + r4
            float r9 = r9 + r4
            float r10 = r10 + r4
            float r11 = r11 + r4
            r4 = 0
            r2[r4] = r8
            r4 = 1
            r2[r4] = r9
            r4 = 2
            r2[r4] = r10
            r4 = 3
            r2[r4] = r9
            r4 = 4
            r2[r4] = r10
            r4 = 5
            r2[r4] = r11
            r4 = 6
            r2[r4] = r8
            r5 = 7
            r2[r5] = r11
            android.graphics.Path r2 = r3.f1610d
            float[] r6 = r3.f1616j
            r7 = 0
            r7 = r6[r7]
            r8 = 1
            r6 = r6[r8]
            r2.moveTo(r7, r6)
            android.graphics.Path r2 = r3.f1610d
            float[] r6 = r3.f1616j
            r7 = 2
            r7 = r6[r7]
            r8 = 3
            r6 = r6[r8]
            r2.lineTo(r7, r6)
            android.graphics.Path r2 = r3.f1610d
            float[] r6 = r3.f1616j
            r7 = 4
            r7 = r6[r7]
            r8 = 5
            r6 = r6[r8]
            r2.lineTo(r7, r6)
            android.graphics.Path r2 = r3.f1610d
            float[] r6 = r3.f1616j
            r4 = r6[r4]
            r5 = r6[r5]
            r2.lineTo(r4, r5)
            android.graphics.Path r2 = r3.f1610d
            r2.close()
            int r0 = r0 + 1
            r7 = r16
            goto L_0x040f
        L_0x04e2:
            r0 = 0
            r2 = 1
            android.graphics.Paint r4 = r3.f1611e
            r5 = 1140850688(0x44000000, float:512.0)
            r4.setColor(r5)
            r4 = 1073741824(0x40000000, float:2.0)
            r1.translate(r4, r4)
            android.graphics.Path r4 = r3.f1610d
            android.graphics.Paint r5 = r3.f1611e
            r1.drawPath(r4, r5)
            r4 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1.translate(r4, r4)
            android.graphics.Paint r4 = r3.f1611e
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r4.setColor(r5)
            android.graphics.Path r4 = r3.f1610d
            android.graphics.Paint r5 = r3.f1611e
            r1.drawPath(r4, r5)
            goto L_0x050d
        L_0x050b:
            r0 = 0
            r2 = 1
        L_0x050d:
            r6 = r1
            goto L_0x0514
        L_0x050f:
            r21 = r8
            r22 = r9
            r0 = 0
        L_0x0514:
            r4 = r2
            r2 = r0
            r0 = r27
            r5 = r19
            r8 = r21
            r9 = r22
            goto L_0x01ac
        L_0x0520:
            r28.restore()
        L_0x0523:
            r0 = r27
        L_0x0525:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionHelper> r1 = r0.f1582k0
            if (r1 == 0) goto L_0x053d
            java.util.Iterator r1 = r1.iterator()
        L_0x052d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x053d
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.motion.widget.MotionHelper r2 = (androidx.constraintlayout.motion.widget.MotionHelper) r2
            r2.getClass()
            goto L_0x052d
        L_0x053d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    public final void g(int i10) {
        this.f1861r = null;
    }

    public int[] getConstraintSetIds() {
        a aVar = this.f1595x;
        if (aVar == null) {
            return null;
        }
        int size = aVar.f1646g.size();
        int[] iArr = new int[size];
        for (int i10 = 0; i10 < size; i10++) {
            iArr[i10] = aVar.f1646g.keyAt(i10);
        }
        return iArr;
    }

    public int getCurrentState() {
        return this.C;
    }

    public ArrayList<a.b> getDefinedTransitions() {
        a aVar = this.f1595x;
        if (aVar == null) {
            return null;
        }
        return aVar.f1643d;
    }

    public f1.b getDesignTool() {
        if (this.W == null) {
            this.W = new f1.b();
        }
        return this.W;
    }

    public int getEndState() {
        return this.D;
    }

    public long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.L;
    }

    public a getScene() {
        return this.f1595x;
    }

    public int getStartState() {
        return this.B;
    }

    public float getTargetPosition() {
        return this.N;
    }

    public Bundle getTransitionState() {
        if (this.B0 == null) {
            this.B0 = new g();
        }
        g gVar = this.B0;
        MotionLayout motionLayout = MotionLayout.this;
        gVar.f1633d = motionLayout.D;
        gVar.f1632c = motionLayout.B;
        gVar.f1631b = motionLayout.getVelocity();
        gVar.f1630a = MotionLayout.this.getProgress();
        g gVar2 = this.B0;
        gVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putFloat("motion.progress", gVar2.f1630a);
        bundle.putFloat("motion.velocity", gVar2.f1631b);
        bundle.putInt("motion.StartState", gVar2.f1632c);
        bundle.putInt("motion.EndState", gVar2.f1633d);
        return bundle;
    }

    public long getTransitionTimeMs() {
        a aVar = this.f1595x;
        if (aVar != null) {
            this.J = ((float) aVar.c()) / 1000.0f;
        }
        return (long) (this.J * 1000.0f);
    }

    public float getVelocity() {
        return this.A;
    }

    public final void h(int i10, View view) {
        b bVar;
        float f10;
        boolean z10;
        a aVar = this.f1595x;
        if (aVar != null) {
            float f11 = this.f1578g0;
            float f12 = 0.0f;
            if (f11 != 0.0f) {
                float f13 = this.f1575d0 / f11;
                float f14 = this.f1576e0 / f11;
                a.b bVar2 = aVar.f1642c;
                if (bVar2 != null && (bVar = bVar2.f1671l) != null) {
                    boolean z11 = false;
                    bVar.f1693m = false;
                    float progress = bVar.f1698r.getProgress();
                    bVar.f1698r.w(bVar.f1684d, progress, bVar.f1688h, bVar.f1687g, bVar.f1694n);
                    float f15 = bVar.f1691k;
                    float[] fArr = bVar.f1694n;
                    float f16 = fArr[0];
                    float f17 = bVar.f1692l;
                    float f18 = fArr[1];
                    if (f15 != 0.0f) {
                        f10 = (f13 * f15) / f16;
                    } else {
                        f10 = (f14 * f17) / f18;
                    }
                    if (!Float.isNaN(f10)) {
                        progress += f10 / 3.0f;
                    }
                    if (progress != 0.0f) {
                        if (progress != 1.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = bVar.f1683c;
                        if (i11 != 3) {
                            z11 = true;
                        }
                        if (z11 && z10) {
                            MotionLayout motionLayout = bVar.f1698r;
                            if (((double) progress) >= 0.5d) {
                                f12 = 1.0f;
                            }
                            motionLayout.D(f12, f10, i11);
                        }
                    }
                }
            }
        }
    }

    public final void i(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (!(!this.f1574c0 && i10 == 0 && i11 == 0)) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.f1574c0 = false;
    }

    public final boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    public final void j(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    public final boolean k(View view, View view2, int i10, int i11) {
        a.b bVar;
        b bVar2;
        a aVar = this.f1595x;
        if (aVar == null || (bVar = aVar.f1642c) == null || (bVar2 = bVar.f1671l) == null || (bVar2.f1703w & 2) != 0) {
            return false;
        }
        return true;
    }

    public final void l(View view, View view2, int i10, int i11) {
        this.f1577f0 = getNanoTime();
        this.f1578g0 = 0.0f;
        this.f1575d0 = 0.0f;
        this.f1576e0 = 0.0f;
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [boolean] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v5 */
    public final void m(View view, int i10, int i11, int[] iArr, int i12) {
        a.b bVar;
        boolean z10;
        boolean z11;
        ? r12;
        b bVar2;
        float f10;
        float f11;
        b bVar3;
        b bVar4;
        b bVar5;
        int i13;
        View view2 = view;
        int i14 = i10;
        int i15 = i11;
        a aVar = this.f1595x;
        if (aVar != null && (bVar = aVar.f1642c) != null && z10) {
            int i16 = -1;
            if (!(!bVar.f1674o) || (bVar5 = bVar.f1671l) == null || (i13 = bVar5.f1685e) == -1 || view.getId() == i13) {
                a.b bVar6 = aVar.f1642c;
                if (bVar6 == null || (bVar4 = bVar6.f1671l) == null) {
                    z11 = false;
                } else {
                    z11 = bVar4.f1701u;
                }
                if (z11) {
                    b bVar7 = bVar.f1671l;
                    if (!(bVar7 == null || (bVar7.f1703w & 4) == 0)) {
                        i16 = i15;
                    }
                    float f12 = this.K;
                    if ((f12 == 1.0f || f12 == 0.0f) && view2.canScrollVertically(i16)) {
                        return;
                    }
                }
                b bVar8 = bVar.f1671l;
                if (!(bVar8 == null || (bVar8.f1703w & 1) == 0)) {
                    float f13 = (float) i14;
                    float f14 = (float) i15;
                    a.b bVar9 = aVar.f1642c;
                    if (bVar9 == null || (bVar3 = bVar9.f1671l) == null) {
                        f11 = 0.0f;
                    } else {
                        bVar3.f1698r.w(bVar3.f1684d, bVar3.f1698r.getProgress(), bVar3.f1688h, bVar3.f1687g, bVar3.f1694n);
                        float f15 = bVar3.f1691k;
                        if (f15 != 0.0f) {
                            float[] fArr = bVar3.f1694n;
                            if (fArr[0] == 0.0f) {
                                fArr[0] = 1.0E-7f;
                            }
                            f11 = (f13 * f15) / fArr[0];
                        } else {
                            float[] fArr2 = bVar3.f1694n;
                            if (fArr2[1] == 0.0f) {
                                fArr2[1] = 1.0E-7f;
                            }
                            f11 = (f14 * bVar3.f1692l) / fArr2[1];
                        }
                    }
                    float f16 = this.L;
                    if ((f16 <= 0.0f && f11 < 0.0f) || (f16 >= 1.0f && f11 > 0.0f)) {
                        view2.setNestedScrollingEnabled(false);
                        view2.post(new a(view2));
                        return;
                    }
                }
                float f17 = this.K;
                long nanoTime = getNanoTime();
                float f18 = (float) i14;
                this.f1575d0 = f18;
                float f19 = (float) i15;
                this.f1576e0 = f19;
                this.f1578g0 = (float) (((double) (nanoTime - this.f1577f0)) * 1.0E-9d);
                this.f1577f0 = nanoTime;
                a.b bVar10 = aVar.f1642c;
                if (!(bVar10 == null || (bVar2 = bVar10.f1671l) == null)) {
                    float progress = bVar2.f1698r.getProgress();
                    if (!bVar2.f1693m) {
                        bVar2.f1693m = true;
                        bVar2.f1698r.setProgress(progress);
                    }
                    bVar2.f1698r.w(bVar2.f1684d, progress, bVar2.f1688h, bVar2.f1687g, bVar2.f1694n);
                    float f20 = bVar2.f1691k;
                    float[] fArr3 = bVar2.f1694n;
                    if (((double) Math.abs((bVar2.f1692l * fArr3[1]) + (f20 * fArr3[0]))) < 0.01d) {
                        float[] fArr4 = bVar2.f1694n;
                        fArr4[0] = 0.01f;
                        fArr4[1] = 0.01f;
                    }
                    float f21 = bVar2.f1691k;
                    if (f21 != 0.0f) {
                        f10 = (f18 * f21) / bVar2.f1694n[0];
                    } else {
                        f10 = (f19 * bVar2.f1692l) / bVar2.f1694n[1];
                    }
                    float max = Math.max(Math.min(progress + f10, 1.0f), 0.0f);
                    if (max != bVar2.f1698r.getProgress()) {
                        bVar2.f1698r.setProgress(max);
                    }
                }
                if (f17 != this.K) {
                    iArr[0] = i14;
                    r12 = 1;
                    iArr[1] = i15;
                } else {
                    r12 = 1;
                }
                t(false);
                if (iArr[0] != 0 || iArr[r12] != 0) {
                    this.f1574c0 = r12;
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        a.b bVar;
        int i10;
        boolean z10;
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            display.getRotation();
        }
        a aVar = this.f1595x;
        if (!(aVar == null || (i10 = this.C) == -1)) {
            androidx.constraintlayout.widget.a b10 = aVar.b(i10);
            a aVar2 = this.f1595x;
            for (int i11 = 0; i11 < aVar2.f1646g.size(); i11++) {
                int keyAt = aVar2.f1646g.keyAt(i11);
                int i12 = aVar2.f1648i.get(keyAt);
                int size = aVar2.f1648i.size();
                while (true) {
                    if (i12 <= 0) {
                        z10 = false;
                        break;
                    } else if (i12 == keyAt) {
                        break;
                    } else {
                        int i13 = size - 1;
                        if (size < 0) {
                            break;
                        }
                        i12 = aVar2.f1648i.get(i12);
                        size = i13;
                    }
                }
                z10 = true;
                if (z10) {
                    break;
                }
                aVar2.m(keyAt, this);
            }
            ArrayList<MotionHelper> arrayList = this.f1582k0;
            if (arrayList != null) {
                Iterator<MotionHelper> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
            }
            if (b10 != null) {
                b10.b(this);
            }
            this.B = this.C;
        }
        A();
        g gVar = this.B0;
        if (gVar == null) {
            a aVar3 = this.f1595x;
            if (aVar3 != null && (bVar = aVar3.f1642c) != null && bVar.f1673n == 4) {
                r(1.0f);
                this.C0 = null;
                setState(i.SETUP);
                setState(i.MOVING);
            }
        } else if (this.E0) {
            post(new b());
        } else {
            gVar.a();
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar;
        int i10;
        RectF b10;
        int currentState;
        androidx.constraintlayout.widget.a aVar;
        boolean z10;
        int i11;
        c cVar;
        a aVar2 = this.f1595x;
        if (aVar2 != null && this.G) {
            d dVar = aVar2.f1656q;
            if (!(dVar == null || (currentState = dVar.f1741a.getCurrentState()) == -1)) {
                if (dVar.f1743c == null) {
                    dVar.f1743c = new HashSet<>();
                    Iterator<c> it = dVar.f1742b.iterator();
                    while (it.hasNext()) {
                        c next = it.next();
                        int childCount = dVar.f1741a.getChildCount();
                        for (int i12 = 0; i12 < childCount; i12++) {
                            View childAt = dVar.f1741a.getChildAt(i12);
                            if (next.c(childAt)) {
                                childAt.getId();
                                dVar.f1743c.add(childAt);
                            }
                        }
                    }
                }
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                Rect rect = new Rect();
                int action = motionEvent.getAction();
                ArrayList<c.a> arrayList = dVar.f1744d;
                int i13 = 2;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator<c.a> it2 = dVar.f1744d.iterator();
                    while (it2.hasNext()) {
                        c.a next2 = it2.next();
                        if (action != 1) {
                            if (action != 2) {
                                next2.getClass();
                            } else {
                                next2.f1730c.f9730b.getHitRect(next2.f1739l);
                                if (!next2.f1739l.contains((int) x10, (int) y10) && !next2.f1735h) {
                                    next2.b();
                                }
                            }
                        } else if (!next2.f1735h) {
                            next2.b();
                        }
                    }
                }
                if (action == 0 || action == 1) {
                    a aVar3 = dVar.f1741a.f1595x;
                    if (aVar3 == null) {
                        aVar = null;
                    } else {
                        aVar = aVar3.b(currentState);
                    }
                    androidx.constraintlayout.widget.a aVar4 = aVar;
                    Iterator<c> it3 = dVar.f1742b.iterator();
                    while (it3.hasNext()) {
                        c next3 = it3.next();
                        int i14 = next3.f1708b;
                        if (i14 != 1 ? i14 != i13 ? !(i14 == 3 && action == 0) : action != 1 : action != 0) {
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        if (z10) {
                            Iterator<View> it4 = dVar.f1743c.iterator();
                            while (it4.hasNext()) {
                                View next4 = it4.next();
                                if (next3.c(next4)) {
                                    next4.getHitRect(rect);
                                    if (rect.contains((int) x10, (int) y10)) {
                                        cVar = next3;
                                        i11 = i13;
                                        next3.a(dVar, dVar.f1741a, currentState, aVar4, next4);
                                    } else {
                                        cVar = next3;
                                        i11 = i13;
                                    }
                                    next3 = cVar;
                                    i13 = i11;
                                }
                            }
                        }
                    }
                }
            }
            a.b bVar2 = this.f1595x.f1642c;
            if (bVar2 != null && (!bVar2.f1674o) && (bVar = bVar2.f1671l) != null && ((motionEvent.getAction() != 0 || (b10 = bVar.b(this, new RectF())) == null || b10.contains(motionEvent.getX(), motionEvent.getY())) && (i10 = bVar.f1685e) != -1)) {
                View view = this.J0;
                if (view == null || view.getId() != i10) {
                    this.J0 = findViewById(i10);
                }
                View view2 = this.J0;
                if (view2 != null) {
                    this.I0.set((float) view2.getLeft(), (float) this.J0.getTop(), (float) this.J0.getRight(), (float) this.J0.getBottom());
                    if (this.I0.contains(motionEvent.getX(), motionEvent.getY())) {
                        if (!y((float) this.J0.getLeft(), (float) this.J0.getTop(), motionEvent, this.J0)) {
                            return onTouchEvent(motionEvent);
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.A0 = true;
        try {
            if (this.f1595x == null) {
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            }
            int i14 = i12 - i10;
            int i15 = i13 - i11;
            if (!(this.f1572a0 == i14 && this.f1573b0 == i15)) {
                C();
                t(true);
            }
            this.f1572a0 = i14;
            this.f1573b0 = i15;
            this.A0 = false;
        } finally {
            this.A0 = false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0053, code lost:
        if (r9 != false) goto L_0x0055;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r18, int r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.constraintlayout.motion.widget.a r3 = r0.f1595x
            if (r3 != 0) goto L_0x000e
            super.onMeasure(r18, r19)
            return
        L_0x000e:
            int r3 = r0.E
            r4 = 0
            r5 = 1
            if (r3 != r1) goto L_0x001b
            int r3 = r0.F
            if (r3 == r2) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r3 = r4
            goto L_0x001c
        L_0x001b:
            r3 = r5
        L_0x001c:
            boolean r6 = r0.H0
            if (r6 == 0) goto L_0x0029
            r0.H0 = r4
            r17.A()
            r17.B()
            r3 = r5
        L_0x0029:
            boolean r6 = r0.f1858o
            if (r6 == 0) goto L_0x002e
            r3 = r5
        L_0x002e:
            r0.E = r1
            r0.F = r2
            androidx.constraintlayout.motion.widget.a r6 = r0.f1595x
            int r6 = r6.h()
            androidx.constraintlayout.motion.widget.a r7 = r0.f1595x
            androidx.constraintlayout.motion.widget.a$b r7 = r7.f1642c
            r8 = -1
            if (r7 != 0) goto L_0x0041
            r7 = r8
            goto L_0x0043
        L_0x0041:
            int r7 = r7.f1662c
        L_0x0043:
            if (r3 != 0) goto L_0x0055
            androidx.constraintlayout.motion.widget.MotionLayout$e r9 = r0.G0
            int r10 = r9.f1625e
            if (r6 != r10) goto L_0x0052
            int r9 = r9.f1626f
            if (r7 == r9) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r9 = r4
            goto L_0x0053
        L_0x0052:
            r9 = r5
        L_0x0053:
            if (r9 == 0) goto L_0x007a
        L_0x0055:
            int r9 = r0.B
            if (r9 == r8) goto L_0x007a
            super.onMeasure(r18, r19)
            androidx.constraintlayout.motion.widget.MotionLayout$e r1 = r0.G0
            androidx.constraintlayout.motion.widget.a r2 = r0.f1595x
            androidx.constraintlayout.widget.a r2 = r2.b(r6)
            androidx.constraintlayout.motion.widget.a r3 = r0.f1595x
            androidx.constraintlayout.widget.a r3 = r3.b(r7)
            r1.e(r2, r3)
            androidx.constraintlayout.motion.widget.MotionLayout$e r1 = r0.G0
            r1.f()
            androidx.constraintlayout.motion.widget.MotionLayout$e r1 = r0.G0
            r1.f1625e = r6
            r1.f1626f = r7
            r1 = r4
            goto L_0x0080
        L_0x007a:
            if (r3 == 0) goto L_0x007f
            super.onMeasure(r18, r19)
        L_0x007f:
            r1 = r5
        L_0x0080:
            boolean r2 = r0.f1589r0
            if (r2 != 0) goto L_0x0086
            if (r1 == 0) goto L_0x00d5
        L_0x0086:
            int r1 = r17.getPaddingTop()
            int r2 = r17.getPaddingBottom()
            int r2 = r2 + r1
            int r1 = r17.getPaddingLeft()
            int r3 = r17.getPaddingRight()
            int r3 = r3 + r1
            c1.f r1 = r0.f1853c
            int r1 = r1.u()
            int r1 = r1 + r3
            c1.f r3 = r0.f1853c
            int r3 = r3.o()
            int r3 = r3 + r2
            int r2 = r0.f1594w0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r6) goto L_0x00ae
            if (r2 != 0) goto L_0x00bd
        L_0x00ae:
            int r1 = r0.f1590s0
            float r2 = (float) r1
            float r7 = r0.f1598y0
            int r8 = r0.f1592u0
            int r8 = r8 - r1
            float r1 = (float) r8
            float r7 = r7 * r1
            float r7 = r7 + r2
            int r1 = (int) r7
            r17.requestLayout()
        L_0x00bd:
            int r2 = r0.f1596x0
            if (r2 == r6) goto L_0x00c3
            if (r2 != 0) goto L_0x00d2
        L_0x00c3:
            int r2 = r0.f1591t0
            float r3 = (float) r2
            float r6 = r0.f1598y0
            int r7 = r0.f1593v0
            int r7 = r7 - r2
            float r2 = (float) r7
            float r6 = r6 * r2
            float r6 = r6 + r3
            int r3 = (int) r6
            r17.requestLayout()
        L_0x00d2:
            r0.setMeasuredDimension(r1, r3)
        L_0x00d5:
            float r1 = r0.N
            float r2 = r0.L
            float r1 = r1 - r2
            float r1 = java.lang.Math.signum(r1)
            long r2 = r17.getNanoTime()
            f1.o r6 = r0.f1597y
            boolean r7 = r6 instanceof e1.a
            r8 = 814313567(0x3089705f, float:1.0E-9)
            r9 = 0
            if (r7 != 0) goto L_0x00f7
            long r10 = r0.M
            long r10 = r2 - r10
            float r7 = (float) r10
            float r7 = r7 * r1
            float r7 = r7 * r8
            float r10 = r0.J
            float r7 = r7 / r10
            goto L_0x00f8
        L_0x00f7:
            r7 = r9
        L_0x00f8:
            float r10 = r0.L
            float r10 = r10 + r7
            boolean r7 = r0.O
            if (r7 == 0) goto L_0x0101
            float r10 = r0.N
        L_0x0101:
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 <= 0) goto L_0x010b
            float r11 = r0.N
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0115
        L_0x010b:
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 > 0) goto L_0x0118
            float r11 = r0.N
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0118
        L_0x0115:
            float r10 = r0.N
            goto L_0x0119
        L_0x0118:
            r5 = r4
        L_0x0119:
            if (r6 == 0) goto L_0x012f
            if (r5 != 0) goto L_0x012f
            boolean r5 = r0.T
            if (r5 == 0) goto L_0x012b
            long r10 = r0.I
            long r2 = r2 - r10
            float r2 = (float) r2
            float r2 = r2 * r8
            float r10 = r6.getInterpolation(r2)
            goto L_0x012f
        L_0x012b:
            float r10 = r6.getInterpolation(r10)
        L_0x012f:
            if (r7 <= 0) goto L_0x0137
            float r2 = r0.N
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0141
        L_0x0137:
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0143
            float r1 = r0.N
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L_0x0143
        L_0x0141:
            float r10 = r0.N
        L_0x0143:
            r0.f1598y0 = r10
            int r1 = r17.getChildCount()
            long r2 = r17.getNanoTime()
            android.view.animation.Interpolator r5 = r0.f1599z
            if (r5 != 0) goto L_0x0152
            goto L_0x0156
        L_0x0152:
            float r10 = r5.getInterpolation(r10)
        L_0x0156:
            if (r4 >= r1) goto L_0x0173
            android.view.View r15 = r0.getChildAt(r4)
            java.util.HashMap<android.view.View, f1.n> r5 = r0.H
            java.lang.Object r5 = r5.get(r15)
            r11 = r5
            f1.n r11 = (f1.n) r11
            if (r11 == 0) goto L_0x0170
            lc.b r5 = r0.f1600z0
            r12 = r10
            r13 = r2
            r16 = r5
            r11.e(r12, r13, r15, r16)
        L_0x0170:
            int r4 = r4 + 1
            goto L_0x0156
        L_0x0173:
            boolean r1 = r0.f1589r0
            if (r1 == 0) goto L_0x017a
            r17.requestLayout()
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onMeasure(int, int):void");
    }

    public final boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    public final void onRtlPropertiesChanged(int i10) {
        b bVar;
        a aVar = this.f1595x;
        if (aVar != null) {
            boolean f10 = f();
            aVar.f1655p = f10;
            a.b bVar2 = aVar.f1642c;
            if (bVar2 != null && (bVar = bVar2.f1671l) != null) {
                bVar.c(f10);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:187:0x04e6  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x050b  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0536  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0547  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x059a  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0819  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x0832  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x083e  */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0840  */
    /* JADX WARNING: Removed duplicated region for block: B:363:0x0843  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0848 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            androidx.constraintlayout.motion.widget.a r2 = r0.f1595x
            if (r2 == 0) goto L_0x084a
            boolean r3 = r0.G
            if (r3 == 0) goto L_0x084a
            boolean r2 = r2.o()
            if (r2 == 0) goto L_0x084a
            androidx.constraintlayout.motion.widget.a r2 = r0.f1595x
            androidx.constraintlayout.motion.widget.a$b r3 = r2.f1642c
            r4 = 1
            if (r3 == 0) goto L_0x0023
            boolean r3 = r3.f1674o
            r3 = r3 ^ r4
            if (r3 != 0) goto L_0x0023
            boolean r1 = super.onTouchEvent(r34)
            return r1
        L_0x0023:
            int r3 = r33.getCurrentState()
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            androidx.constraintlayout.motion.widget.MotionLayout$f r6 = r2.f1654o
            if (r6 != 0) goto L_0x003f
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r2.f1640a
            r6.getClass()
            androidx.constraintlayout.motion.widget.MotionLayout$f r6 = androidx.constraintlayout.motion.widget.MotionLayout.f.f1628b
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.f1629a = r7
            r2.f1654o = r6
        L_0x003f:
            androidx.constraintlayout.motion.widget.MotionLayout$f r6 = r2.f1654o
            android.view.VelocityTracker r6 = r6.f1629a
            if (r6 == 0) goto L_0x0048
            r6.addMovement(r1)
        L_0x0048:
            r6 = 2
            r8 = -1
            if (r3 == r8) goto L_0x021d
            int r11 = r34.getAction()
            if (r11 == 0) goto L_0x01b3
            if (r11 == r6) goto L_0x0056
            goto L_0x021d
        L_0x0056:
            boolean r11 = r2.f1652m
            if (r11 == 0) goto L_0x005c
            goto L_0x021d
        L_0x005c:
            float r11 = r34.getRawY()
            float r12 = r2.f1658s
            float r11 = r11 - r12
            float r12 = r34.getRawX()
            float r13 = r2.f1657r
            float r12 = r12 - r13
            double r13 = (double) r12
            r15 = 0
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 != 0) goto L_0x0076
            double r13 = (double) r11
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x0221
        L_0x0076:
            android.view.MotionEvent r13 = r2.f1651l
            if (r13 != 0) goto L_0x007c
            goto L_0x0221
        L_0x007c:
            if (r3 == r8) goto L_0x0179
            g1.d r14 = r2.f1641b
            if (r14 == 0) goto L_0x0089
            int r14 = r14.a(r3)
            if (r14 == r8) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r14 = r3
        L_0x008a:
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList<androidx.constraintlayout.motion.widget.a$b> r10 = r2.f1643d
            java.util.Iterator r10 = r10.iterator()
        L_0x0095:
            boolean r17 = r10.hasNext()
            if (r17 == 0) goto L_0x00b1
            java.lang.Object r17 = r10.next()
            r8 = r17
            androidx.constraintlayout.motion.widget.a$b r8 = (androidx.constraintlayout.motion.widget.a.b) r8
            int r6 = r8.f1663d
            if (r6 == r14) goto L_0x00ab
            int r6 = r8.f1662c
            if (r6 != r14) goto L_0x00ae
        L_0x00ab:
            r15.add(r8)
        L_0x00ae:
            r6 = 2
            r8 = -1
            goto L_0x0095
        L_0x00b1:
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>()
            java.util.Iterator r8 = r15.iterator()
            r10 = 0
            r14 = 0
        L_0x00bc:
            boolean r15 = r8.hasNext()
            if (r15 == 0) goto L_0x017b
            java.lang.Object r15 = r8.next()
            androidx.constraintlayout.motion.widget.a$b r15 = (androidx.constraintlayout.motion.widget.a.b) r15
            boolean r4 = r15.f1674o
            if (r4 == 0) goto L_0x00ce
            goto L_0x0166
        L_0x00ce:
            androidx.constraintlayout.motion.widget.b r4 = r15.f1671l
            if (r4 == 0) goto L_0x0166
            boolean r7 = r2.f1655p
            r4.c(r7)
            androidx.constraintlayout.motion.widget.b r4 = r15.f1671l
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r2.f1640a
            android.graphics.RectF r4 = r4.b(r7, r6)
            if (r4 == 0) goto L_0x00f1
            float r7 = r13.getX()
            float r9 = r13.getY()
            boolean r4 = r4.contains(r7, r9)
            if (r4 != 0) goto L_0x00f1
            goto L_0x0166
        L_0x00f1:
            androidx.constraintlayout.motion.widget.b r4 = r15.f1671l
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r2.f1640a
            android.graphics.RectF r4 = r4.a(r7, r6)
            if (r4 == 0) goto L_0x010a
            float r7 = r13.getX()
            float r9 = r13.getY()
            boolean r4 = r4.contains(r7, r9)
            if (r4 != 0) goto L_0x010a
            goto L_0x0166
        L_0x010a:
            androidx.constraintlayout.motion.widget.b r4 = r15.f1671l
            float r7 = r4.f1691k
            float r7 = r7 * r12
            float r9 = r4.f1692l
            float r9 = r9 * r11
            float r9 = r9 + r7
            boolean r4 = r4.f1690j
            if (r4 == 0) goto L_0x014c
            float r4 = r13.getX()
            androidx.constraintlayout.motion.widget.b r7 = r15.f1671l
            r7.getClass()
            r7 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 - r7
            float r9 = r13.getY()
            r18 = r6
            androidx.constraintlayout.motion.widget.b r6 = r15.f1671l
            r6.getClass()
            float r9 = r9 - r7
            float r6 = r12 + r4
            float r7 = r11 + r9
            r19 = r8
            double r7 = (double) r7
            r20 = r11
            r21 = r12
            double r11 = (double) r6
            double r6 = java.lang.Math.atan2(r7, r11)
            double r11 = (double) r4
            double r8 = (double) r9
            double r8 = java.lang.Math.atan2(r11, r8)
            double r6 = r6 - r8
            float r4 = (float) r6
            r6 = 1092616192(0x41200000, float:10.0)
            float r9 = r4 * r6
            goto L_0x0154
        L_0x014c:
            r18 = r6
            r19 = r8
            r20 = r11
            r21 = r12
        L_0x0154:
            int r4 = r15.f1662c
            if (r4 != r3) goto L_0x015b
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x015e
        L_0x015b:
            r4 = 1066192077(0x3f8ccccd, float:1.1)
        L_0x015e:
            float r4 = r4 * r9
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x016e
            r10 = r4
            r14 = r15
            goto L_0x016e
        L_0x0166:
            r18 = r6
            r19 = r8
            r20 = r11
            r21 = r12
        L_0x016e:
            r6 = r18
            r8 = r19
            r11 = r20
            r12 = r21
            r4 = 1
            goto L_0x00bc
        L_0x0179:
            androidx.constraintlayout.motion.widget.a$b r14 = r2.f1642c
        L_0x017b:
            if (r14 == 0) goto L_0x021d
            r0.setTransition((androidx.constraintlayout.motion.widget.a.b) r14)
            androidx.constraintlayout.motion.widget.a$b r3 = r2.f1642c
            androidx.constraintlayout.motion.widget.b r3 = r3.f1671l
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r2.f1640a
            android.graphics.RectF r3 = r3.b(r4, r5)
            if (r3 == 0) goto L_0x01a0
            android.view.MotionEvent r4 = r2.f1651l
            float r4 = r4.getX()
            android.view.MotionEvent r5 = r2.f1651l
            float r5 = r5.getY()
            boolean r3 = r3.contains(r4, r5)
            if (r3 != 0) goto L_0x01a0
            r3 = 1
            goto L_0x01a1
        L_0x01a0:
            r3 = 0
        L_0x01a1:
            r2.f1653n = r3
            androidx.constraintlayout.motion.widget.a$b r3 = r2.f1642c
            androidx.constraintlayout.motion.widget.b r3 = r3.f1671l
            float r4 = r2.f1657r
            float r5 = r2.f1658s
            r3.f1696p = r4
            r3.f1697q = r5
            r4 = 0
            r3.f1693m = r4
            goto L_0x021d
        L_0x01b3:
            r4 = 0
            float r3 = r34.getRawX()
            r2.f1657r = r3
            float r3 = r34.getRawY()
            r2.f1658s = r3
            r2.f1651l = r1
            r2.f1652m = r4
            androidx.constraintlayout.motion.widget.a$b r1 = r2.f1642c
            androidx.constraintlayout.motion.widget.b r1 = r1.f1671l
            if (r1 == 0) goto L_0x0221
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.f1640a
            android.graphics.RectF r1 = r1.a(r3, r5)
            if (r1 == 0) goto L_0x01eb
            android.view.MotionEvent r3 = r2.f1651l
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.f1651l
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L_0x01eb
            r1 = 0
            r2.f1651l = r1
            r1 = 1
            r2.f1652m = r1
            goto L_0x0221
        L_0x01eb:
            androidx.constraintlayout.motion.widget.a$b r1 = r2.f1642c
            androidx.constraintlayout.motion.widget.b r1 = r1.f1671l
            androidx.constraintlayout.motion.widget.MotionLayout r3 = r2.f1640a
            android.graphics.RectF r1 = r1.b(r3, r5)
            if (r1 == 0) goto L_0x020d
            android.view.MotionEvent r3 = r2.f1651l
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.f1651l
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L_0x020d
            r1 = 1
            r2.f1653n = r1
            goto L_0x0210
        L_0x020d:
            r1 = 0
            r2.f1653n = r1
        L_0x0210:
            androidx.constraintlayout.motion.widget.a$b r1 = r2.f1642c
            androidx.constraintlayout.motion.widget.b r1 = r1.f1671l
            float r3 = r2.f1657r
            float r2 = r2.f1658s
            r1.f1696p = r3
            r1.f1697q = r2
            goto L_0x0221
        L_0x021d:
            boolean r3 = r2.f1652m
            if (r3 == 0) goto L_0x0225
        L_0x0221:
            r3 = r0
            r0 = 0
            goto L_0x0834
        L_0x0225:
            androidx.constraintlayout.motion.widget.a$b r3 = r2.f1642c
            if (r3 == 0) goto L_0x0801
            androidx.constraintlayout.motion.widget.b r3 = r3.f1671l
            if (r3 == 0) goto L_0x0801
            boolean r4 = r2.f1653n
            if (r4 != 0) goto L_0x0801
            androidx.constraintlayout.motion.widget.MotionLayout$f r4 = r2.f1654o
            androidx.constraintlayout.motion.widget.MotionLayout$i r5 = androidx.constraintlayout.motion.widget.MotionLayout.i.FINISHED
            boolean r6 = r3.f1690j
            if (r6 == 0) goto L_0x05bd
            android.view.VelocityTracker r6 = r4.f1629a
            if (r6 == 0) goto L_0x0240
            r6.addMovement(r1)
        L_0x0240:
            int r6 = r34.getAction()
            if (r6 == 0) goto L_0x05ac
            r19 = 1135869952(0x43b40000, float:360.0)
            r20 = 1073741824(0x40000000, float:2.0)
            r13 = 1
            if (r6 == r13) goto L_0x0416
            r13 = 2
            if (r6 == r13) goto L_0x0252
            goto L_0x0801
        L_0x0252:
            r34.getRawY()
            r34.getRawX()
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f1698r
            int r5 = r5.getWidth()
            float r5 = (float) r5
            float r5 = r5 / r20
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f1698r
            int r6 = r6.getHeight()
            float r6 = (float) r6
            float r6 = r6 / r20
            int r7 = r3.f1689i
            r8 = -1
            if (r7 == r8) goto L_0x02a8
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f1698r
            android.view.View r5 = r5.findViewById(r7)
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f1698r
            int[] r7 = r3.f1695o
            r6.getLocationOnScreen(r7)
            int[] r6 = r3.f1695o
            r7 = 0
            r6 = r6[r7]
            float r6 = (float) r6
            int r7 = r5.getLeft()
            int r8 = r5.getRight()
            int r8 = r8 + r7
            float r7 = (float) r8
            float r7 = r7 / r20
            float r6 = r6 + r7
            int[] r7 = r3.f1695o
            r8 = 1
            r7 = r7[r8]
            float r7 = (float) r7
            int r8 = r5.getTop()
            int r5 = r5.getBottom()
            int r5 = r5 + r8
            float r5 = (float) r5
            float r5 = r5 / r20
            float r5 = r5 + r7
            r32 = r6
            r6 = r5
            r5 = r32
            goto L_0x02f5
        L_0x02a8:
            int r7 = r3.f1684d
            r8 = -1
            if (r7 == r8) goto L_0x02f5
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f1698r
            java.util.HashMap<android.view.View, f1.n> r9 = r8.H
            android.view.View r7 = r8.findViewById(r7)
            java.lang.Object r7 = r9.get(r7)
            f1.n r7 = (f1.n) r7
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f1698r
            f1.p r7 = r7.f9734f
            int r7 = r7.f9766r
            android.view.View r7 = r8.findViewById(r7)
            if (r7 != 0) goto L_0x02c8
            goto L_0x02f5
        L_0x02c8:
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f1698r
            int[] r6 = r3.f1695o
            r5.getLocationOnScreen(r6)
            int[] r5 = r3.f1695o
            r6 = 0
            r5 = r5[r6]
            float r5 = (float) r5
            int r6 = r7.getLeft()
            int r8 = r7.getRight()
            int r8 = r8 + r6
            float r6 = (float) r8
            float r6 = r6 / r20
            float r5 = r5 + r6
            int[] r6 = r3.f1695o
            r8 = 1
            r6 = r6[r8]
            float r6 = (float) r6
            int r8 = r7.getTop()
            int r7 = r7.getBottom()
            int r7 = r7 + r8
            float r7 = (float) r7
            float r7 = r7 / r20
            float r6 = r6 + r7
        L_0x02f5:
            float r7 = r34.getRawX()
            float r7 = r7 - r5
            float r8 = r34.getRawY()
            float r8 = r8 - r6
            float r9 = r34.getRawY()
            float r9 = r9 - r6
            double r13 = (double) r9
            float r9 = r34.getRawX()
            float r9 = r9 - r5
            double r10 = (double) r9
            double r9 = java.lang.Math.atan2(r13, r10)
            float r11 = r3.f1697q
            float r11 = r11 - r6
            double r13 = (double) r11
            float r6 = r3.f1696p
            float r6 = r6 - r5
            double r5 = (double) r6
            double r5 = java.lang.Math.atan2(r13, r5)
            double r5 = r9 - r5
            r13 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r5 = r5 * r13
            r13 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r5 = r5 / r13
            float r5 = (float) r5
            r6 = 1134886912(0x43a50000, float:330.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0333
            float r5 = r5 - r19
            goto L_0x033b
        L_0x0333:
            r6 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x033b
            float r5 = r5 + r19
        L_0x033b:
            float r6 = java.lang.Math.abs(r5)
            double r13 = (double) r6
            r20 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r6 = (r13 > r20 ? 1 : (r13 == r20 ? 0 : -1))
            if (r6 > 0) goto L_0x034d
            boolean r6 = r3.f1693m
            if (r6 == 0) goto L_0x0801
        L_0x034d:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f1698r
            float r6 = r6.getProgress()
            boolean r11 = r3.f1693m
            if (r11 != 0) goto L_0x035f
            r11 = 1
            r3.f1693m = r11
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f1698r
            r11.setProgress(r6)
        L_0x035f:
            int r11 = r3.f1684d
            r13 = -1
            if (r11 == r13) goto L_0x0389
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r3.f1698r
            float r14 = r3.f1688h
            float r15 = r3.f1687g
            float[] r12 = r3.f1694n
            r20 = r13
            r21 = r11
            r22 = r6
            r23 = r14
            r24 = r15
            r25 = r12
            r20.w(r21, r22, r23, r24, r25)
            float[] r11 = r3.f1694n
            r12 = 1
            r13 = r11[r12]
            double r13 = (double) r13
            double r13 = java.lang.Math.toDegrees(r13)
            float r13 = (float) r13
            r11[r12] = r13
            goto L_0x038e
        L_0x0389:
            r12 = 1
            float[] r11 = r3.f1694n
            r11[r12] = r19
        L_0x038e:
            float r11 = r3.f1702v
            float r5 = r5 * r11
            float[] r11 = r3.f1694n
            r11 = r11[r12]
            float r5 = r5 / r11
            float r5 = r5 + r6
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r5, r6)
            r11 = 0
            float r5 = java.lang.Math.max(r5, r11)
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f1698r
            float r12 = r12.getProgress()
            int r13 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r13 == 0) goto L_0x0403
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x03b4
            int r6 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r6 != 0) goto L_0x03be
        L_0x03b4:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f1698r
            if (r13 != 0) goto L_0x03ba
            r11 = 1
            goto L_0x03bb
        L_0x03ba:
            r11 = 0
        L_0x03bb:
            r6.s(r11)
        L_0x03be:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f1698r
            r6.setProgress(r5)
            android.view.VelocityTracker r5 = r4.f1629a
            if (r5 == 0) goto L_0x03cc
            r6 = 1000(0x3e8, float:1.401E-42)
            r5.computeCurrentVelocity(r6)
        L_0x03cc:
            android.view.VelocityTracker r5 = r4.f1629a
            if (r5 == 0) goto L_0x03d5
            float r5 = r5.getXVelocity()
            goto L_0x03d6
        L_0x03d5:
            r5 = 0
        L_0x03d6:
            android.view.VelocityTracker r4 = r4.f1629a
            if (r4 == 0) goto L_0x03df
            float r4 = r4.getYVelocity()
            goto L_0x03e0
        L_0x03df:
            r4 = 0
        L_0x03e0:
            double r11 = (double) r4
            double r4 = (double) r5
            double r13 = java.lang.Math.hypot(r11, r4)
            double r4 = java.lang.Math.atan2(r11, r4)
            double r4 = r4 - r9
            double r4 = java.lang.Math.sin(r4)
            double r4 = r4 * r13
            double r6 = (double) r7
            double r8 = (double) r8
            double r6 = java.lang.Math.hypot(r6, r8)
            double r4 = r4 / r6
            float r4 = (float) r4
            androidx.constraintlayout.motion.widget.MotionLayout r5 = r3.f1698r
            double r6 = (double) r4
            double r6 = java.lang.Math.toDegrees(r6)
            float r4 = (float) r6
            r5.A = r4
            goto L_0x0408
        L_0x0403:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f1698r
            r5 = 0
            r4.A = r5
        L_0x0408:
            float r4 = r34.getRawX()
            r3.f1696p = r4
            float r4 = r34.getRawY()
            r3.f1697q = r4
            goto L_0x0801
        L_0x0416:
            r6 = 0
            r3.f1693m = r6
            r6 = 16
            android.view.VelocityTracker r10 = r4.f1629a
            if (r10 == 0) goto L_0x0422
            r10.computeCurrentVelocity(r6)
        L_0x0422:
            android.view.VelocityTracker r6 = r4.f1629a
            if (r6 == 0) goto L_0x042b
            float r6 = r6.getXVelocity()
            goto L_0x042c
        L_0x042b:
            r6 = 0
        L_0x042c:
            android.view.VelocityTracker r4 = r4.f1629a
            if (r4 == 0) goto L_0x0435
            float r4 = r4.getYVelocity()
            goto L_0x0436
        L_0x0435:
            r4 = 0
        L_0x0436:
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r3.f1698r
            float r10 = r10.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f1698r
            int r11 = r11.getWidth()
            float r11 = (float) r11
            float r11 = r11 / r20
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f1698r
            int r12 = r12.getHeight()
            float r12 = (float) r12
            float r12 = r12 / r20
            int r13 = r3.f1689i
            r15 = -1
            if (r13 == r15) goto L_0x0482
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f1698r
            android.view.View r11 = r11.findViewById(r13)
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f1698r
            int[] r13 = r3.f1695o
            r12.getLocationOnScreen(r13)
            int[] r12 = r3.f1695o
            r13 = 0
            r12 = r12[r13]
            float r12 = (float) r12
            int r13 = r11.getLeft()
            int r15 = r11.getRight()
            int r15 = r15 + r13
            float r13 = (float) r15
            float r13 = r13 / r20
            float r13 = r13 + r12
            int[] r12 = r3.f1695o
            r15 = 1
            r12 = r12[r15]
            float r12 = (float) r12
            int r15 = r11.getTop()
            int r11 = r11.getBottom()
            goto L_0x04c7
        L_0x0482:
            int r13 = r3.f1684d
            r15 = -1
            if (r13 == r15) goto L_0x04cd
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.f1698r
            java.util.HashMap<android.view.View, f1.n> r12 = r11.H
            android.view.View r11 = r11.findViewById(r13)
            java.lang.Object r11 = r12.get(r11)
            f1.n r11 = (f1.n) r11
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f1698r
            f1.p r11 = r11.f9734f
            int r11 = r11.f9766r
            android.view.View r11 = r12.findViewById(r11)
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r3.f1698r
            int[] r13 = r3.f1695o
            r12.getLocationOnScreen(r13)
            int[] r12 = r3.f1695o
            r13 = 0
            r12 = r12[r13]
            float r12 = (float) r12
            int r13 = r11.getLeft()
            int r15 = r11.getRight()
            int r15 = r15 + r13
            float r13 = (float) r15
            float r13 = r13 / r20
            float r13 = r13 + r12
            int[] r12 = r3.f1695o
            r15 = 1
            r12 = r12[r15]
            float r12 = (float) r12
            int r15 = r11.getTop()
            int r11 = r11.getBottom()
        L_0x04c7:
            int r11 = r11 + r15
            float r11 = (float) r11
            float r11 = r11 / r20
            float r12 = r12 + r11
            r11 = r13
        L_0x04cd:
            float r13 = r34.getRawX()
            float r13 = r13 - r11
            float r11 = r34.getRawY()
            float r11 = r11 - r12
            double r7 = (double) r11
            double r14 = (double) r13
            double r7 = java.lang.Math.atan2(r7, r14)
            double r7 = java.lang.Math.toDegrees(r7)
            int r14 = r3.f1684d
            r15 = -1
            if (r14 == r15) goto L_0x050b
            androidx.constraintlayout.motion.widget.MotionLayout r15 = r3.f1698r
            float r12 = r3.f1688h
            float r9 = r3.f1687g
            float[] r0 = r3.f1694n
            r26 = r15
            r27 = r14
            r28 = r10
            r29 = r12
            r30 = r9
            r31 = r0
            r26.w(r27, r28, r29, r30, r31)
            float[] r0 = r3.f1694n
            r9 = 1
            r12 = r0[r9]
            double r14 = (double) r12
            double r14 = java.lang.Math.toDegrees(r14)
            float r12 = (float) r14
            r0[r9] = r12
            goto L_0x0510
        L_0x050b:
            r9 = 1
            float[] r0 = r3.f1694n
            r0[r9] = r19
        L_0x0510:
            float r4 = r4 + r11
            double r11 = (double) r4
            float r6 = r6 + r13
            double r13 = (double) r6
            double r11 = java.lang.Math.atan2(r11, r13)
            double r11 = java.lang.Math.toDegrees(r11)
            double r11 = r11 - r7
            float r0 = (float) r11
            r4 = 1115291648(0x427a0000, float:62.5)
            float r0 = r0 * r4
            boolean r4 = java.lang.Float.isNaN(r0)
            if (r4 != 0) goto L_0x0536
            r4 = 1077936128(0x40400000, float:3.0)
            float r14 = r0 * r4
            float r4 = r3.f1702v
            float r14 = r14 * r4
            float[] r4 = r3.f1694n
            r6 = 1
            r4 = r4[r6]
            float r14 = r14 / r4
            float r14 = r14 + r10
            goto L_0x0537
        L_0x0536:
            r14 = r10
        L_0x0537:
            r4 = 0
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x059a
            r4 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x059a
            int r4 = r3.f1683c
            r6 = 3
            if (r4 == r6) goto L_0x059a
            float r6 = r3.f1702v
            float r0 = r0 * r6
            float[] r6 = r3.f1694n
            r7 = 1
            r6 = r6[r7]
            float r0 = r0 / r6
            double r6 = (double) r14
            r8 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0559
            r6 = 0
            goto L_0x055b
        L_0x0559:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x055b:
            r7 = 6
            if (r4 != r7) goto L_0x056b
            float r4 = r10 + r0
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0569
            float r0 = java.lang.Math.abs(r0)
        L_0x0569:
            r6 = 1065353216(0x3f800000, float:1.0)
        L_0x056b:
            int r4 = r3.f1683c
            r7 = 7
            if (r4 != r7) goto L_0x057e
            float r4 = r10 + r0
            r6 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x057d
            float r0 = java.lang.Math.abs(r0)
            float r0 = -r0
        L_0x057d:
            r6 = 0
        L_0x057e:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f1698r
            int r7 = r3.f1683c
            r8 = 1077936128(0x40400000, float:3.0)
            float r0 = r0 * r8
            r4.D(r6, r0, r7)
            r0 = 0
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 >= 0) goto L_0x0593
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0801
        L_0x0593:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.f1698r
            r0.setState(r5)
            goto L_0x0801
        L_0x059a:
            r0 = 0
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x05a5
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 > 0) goto L_0x0801
        L_0x05a5:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.f1698r
            r0.setState(r5)
            goto L_0x0801
        L_0x05ac:
            float r0 = r34.getRawX()
            r3.f1696p = r0
            float r0 = r34.getRawY()
            r3.f1697q = r0
            r0 = 0
            r3.f1693m = r0
            goto L_0x0802
        L_0x05bd:
            android.view.VelocityTracker r0 = r4.f1629a
            if (r0 == 0) goto L_0x05c4
            r0.addMovement(r1)
        L_0x05c4:
            int r0 = r34.getAction()
            if (r0 == 0) goto L_0x07f1
            r6 = 1
            if (r0 == r6) goto L_0x0708
            r6 = 2
            if (r0 == r6) goto L_0x05d2
            goto L_0x0801
        L_0x05d2:
            float r0 = r34.getRawY()
            float r5 = r3.f1697q
            float r0 = r0 - r5
            float r5 = r34.getRawX()
            float r6 = r3.f1696p
            float r5 = r5 - r6
            float r6 = r3.f1691k
            float r6 = r6 * r5
            float r7 = r3.f1692l
            float r7 = r7 * r0
            float r7 = r7 + r6
            float r6 = java.lang.Math.abs(r7)
            float r7 = r3.f1704x
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 > 0) goto L_0x05f5
            boolean r6 = r3.f1693m
            if (r6 == 0) goto L_0x0801
        L_0x05f5:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f1698r
            float r6 = r6.getProgress()
            boolean r7 = r3.f1693m
            if (r7 != 0) goto L_0x0607
            r7 = 1
            r3.f1693m = r7
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f1698r
            r7.setProgress(r6)
        L_0x0607:
            int r8 = r3.f1684d
            r7 = -1
            if (r8 == r7) goto L_0x061b
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f1698r
            float r10 = r3.f1688h
            float r11 = r3.f1687g
            float[] r12 = r3.f1694n
            r9 = r6
            r7.w(r8, r9, r10, r11, r12)
            r9 = 0
            r10 = 1
            goto L_0x063a
        L_0x061b:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f1698r
            int r7 = r7.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f1698r
            int r8 = r8.getHeight()
            int r7 = java.lang.Math.min(r7, r8)
            float r7 = (float) r7
            float[] r8 = r3.f1694n
            float r9 = r3.f1692l
            float r9 = r9 * r7
            r10 = 1
            r8[r10] = r9
            float r9 = r3.f1691k
            float r7 = r7 * r9
            r9 = 0
            r8[r9] = r7
        L_0x063a:
            float r7 = r3.f1691k
            float[] r8 = r3.f1694n
            r11 = r8[r9]
            float r7 = r7 * r11
            float r9 = r3.f1692l
            r8 = r8[r10]
            float r9 = r9 * r8
            float r9 = r9 + r7
            float r7 = r3.f1702v
            float r9 = r9 * r7
            float r7 = java.lang.Math.abs(r9)
            double r7 = (double) r7
            r9 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r8 = 1008981770(0x3c23d70a, float:0.01)
            if (r7 >= 0) goto L_0x0664
            float[] r7 = r3.f1694n
            r9 = 0
            r7[r9] = r8
            r10 = 1
            r7[r10] = r8
            goto L_0x0666
        L_0x0664:
            r9 = 0
            r10 = 1
        L_0x0666:
            float r7 = r3.f1691k
            r11 = 0
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 == 0) goto L_0x0673
            float[] r0 = r3.f1694n
            r0 = r0[r9]
            float r5 = r5 / r0
            goto L_0x0679
        L_0x0673:
            float[] r5 = r3.f1694n
            r5 = r5[r10]
            float r5 = r0 / r5
        L_0x0679:
            float r6 = r6 + r5
            r0 = 1065353216(0x3f800000, float:1.0)
            float r5 = java.lang.Math.min(r6, r0)
            r0 = 0
            float r5 = java.lang.Math.max(r5, r0)
            int r0 = r3.f1683c
            r6 = 6
            if (r0 != r6) goto L_0x068e
            float r5 = java.lang.Math.max(r5, r8)
        L_0x068e:
            int r0 = r3.f1683c
            r6 = 7
            if (r0 != r6) goto L_0x069a
            r0 = 1065185444(0x3f7d70a4, float:0.99)
            float r5 = java.lang.Math.min(r5, r0)
        L_0x069a:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.f1698r
            float r0 = r0.getProgress()
            int r6 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r6 == 0) goto L_0x06f5
            r6 = 0
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 == 0) goto L_0x06af
            r6 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x06b9
        L_0x06af:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.f1698r
            if (r7 != 0) goto L_0x06b5
            r6 = 1
            goto L_0x06b6
        L_0x06b5:
            r6 = 0
        L_0x06b6:
            r0.s(r6)
        L_0x06b9:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.f1698r
            r0.setProgress(r5)
            android.view.VelocityTracker r0 = r4.f1629a
            if (r0 == 0) goto L_0x06c7
            r5 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r5)
        L_0x06c7:
            android.view.VelocityTracker r0 = r4.f1629a
            if (r0 == 0) goto L_0x06d0
            float r0 = r0.getXVelocity()
            goto L_0x06d1
        L_0x06d0:
            r0 = 0
        L_0x06d1:
            android.view.VelocityTracker r4 = r4.f1629a
            if (r4 == 0) goto L_0x06da
            float r4 = r4.getYVelocity()
            goto L_0x06db
        L_0x06da:
            r4 = 0
        L_0x06db:
            float r5 = r3.f1691k
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x06e9
            float[] r4 = r3.f1694n
            r5 = 0
            r4 = r4[r5]
            float r0 = r0 / r4
            goto L_0x06f0
        L_0x06e9:
            float[] r0 = r3.f1694n
            r5 = 1
            r0 = r0[r5]
            float r0 = r4 / r0
        L_0x06f0:
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.f1698r
            r4.A = r0
            goto L_0x06fa
        L_0x06f5:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.f1698r
            r4 = 0
            r0.A = r4
        L_0x06fa:
            float r0 = r34.getRawX()
            r3.f1696p = r0
            float r0 = r34.getRawY()
            r3.f1697q = r0
            goto L_0x0801
        L_0x0708:
            r0 = 0
            r3.f1693m = r0
            android.view.VelocityTracker r0 = r4.f1629a
            if (r0 == 0) goto L_0x0714
            r6 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r6)
        L_0x0714:
            android.view.VelocityTracker r0 = r4.f1629a
            if (r0 == 0) goto L_0x071d
            float r0 = r0.getXVelocity()
            goto L_0x071e
        L_0x071d:
            r0 = 0
        L_0x071e:
            android.view.VelocityTracker r4 = r4.f1629a
            if (r4 == 0) goto L_0x0727
            float r4 = r4.getYVelocity()
            goto L_0x0728
        L_0x0727:
            r4 = 0
        L_0x0728:
            androidx.constraintlayout.motion.widget.MotionLayout r6 = r3.f1698r
            float r6 = r6.getProgress()
            int r7 = r3.f1684d
            r8 = -1
            if (r7 == r8) goto L_0x074d
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f1698r
            float r9 = r3.f1688h
            float r10 = r3.f1687g
            float[] r11 = r3.f1694n
            r26 = r8
            r27 = r7
            r28 = r6
            r29 = r9
            r30 = r10
            r31 = r11
            r26.w(r27, r28, r29, r30, r31)
            r9 = 0
            r10 = 1
            goto L_0x076c
        L_0x074d:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f1698r
            int r7 = r7.getWidth()
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r3.f1698r
            int r8 = r8.getHeight()
            int r7 = java.lang.Math.min(r7, r8)
            float r7 = (float) r7
            float[] r8 = r3.f1694n
            float r9 = r3.f1692l
            float r9 = r9 * r7
            r10 = 1
            r8[r10] = r9
            float r9 = r3.f1691k
            float r7 = r7 * r9
            r9 = 0
            r8[r9] = r7
        L_0x076c:
            float r7 = r3.f1691k
            float[] r8 = r3.f1694n
            r11 = r8[r9]
            r8 = r8[r10]
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L_0x077b
            float r0 = r0 / r11
            goto L_0x077d
        L_0x077b:
            float r0 = r4 / r8
        L_0x077d:
            boolean r4 = java.lang.Float.isNaN(r0)
            if (r4 != 0) goto L_0x0789
            r4 = 1077936128(0x40400000, float:3.0)
            float r4 = r0 / r4
            float r4 = r4 + r6
            goto L_0x078a
        L_0x0789:
            r4 = r6
        L_0x078a:
            r7 = 0
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x07e0
            r7 = 1065353216(0x3f800000, float:1.0)
            int r8 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x07e0
            int r7 = r3.f1683c
            r8 = 3
            if (r7 == r8) goto L_0x07e0
            double r8 = (double) r4
            r10 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 >= 0) goto L_0x07a3
            r4 = 0
            goto L_0x07a5
        L_0x07a3:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x07a5:
            r8 = 6
            if (r7 != r8) goto L_0x07b5
            float r4 = r6 + r0
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x07b3
            float r0 = java.lang.Math.abs(r0)
        L_0x07b3:
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x07b5:
            int r7 = r3.f1683c
            r8 = 7
            if (r7 != r8) goto L_0x07c8
            float r4 = r6 + r0
            r7 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 <= 0) goto L_0x07c7
            float r0 = java.lang.Math.abs(r0)
            float r0 = -r0
        L_0x07c7:
            r4 = 0
        L_0x07c8:
            androidx.constraintlayout.motion.widget.MotionLayout r7 = r3.f1698r
            int r8 = r3.f1683c
            r7.D(r4, r0, r8)
            r0 = 0
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x07da
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x0801
        L_0x07da:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.f1698r
            r0.setState(r5)
            goto L_0x0801
        L_0x07e0:
            r0 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x07eb
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x0801
        L_0x07eb:
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r3.f1698r
            r0.setState(r5)
            goto L_0x0801
        L_0x07f1:
            float r0 = r34.getRawX()
            r3.f1696p = r0
            float r0 = r34.getRawY()
            r3.f1697q = r0
            r0 = 0
            r3.f1693m = r0
            goto L_0x0802
        L_0x0801:
            r0 = 0
        L_0x0802:
            float r3 = r34.getRawX()
            r2.f1657r = r3
            float r3 = r34.getRawY()
            r2.f1658s = r3
            int r1 = r34.getAction()
            r3 = 1
            if (r1 != r3) goto L_0x0832
            androidx.constraintlayout.motion.widget.MotionLayout$f r1 = r2.f1654o
            if (r1 == 0) goto L_0x0832
            android.view.VelocityTracker r3 = r1.f1629a
            if (r3 == 0) goto L_0x0824
            r3.recycle()
            r3 = 0
            r1.f1629a = r3
            goto L_0x0825
        L_0x0824:
            r3 = 0
        L_0x0825:
            r2.f1654o = r3
            r3 = r33
            int r1 = r3.C
            r4 = -1
            if (r1 == r4) goto L_0x0834
            r2.a(r1, r3)
            goto L_0x0834
        L_0x0832:
            r3 = r33
        L_0x0834:
            androidx.constraintlayout.motion.widget.a r1 = r3.f1595x
            androidx.constraintlayout.motion.widget.a$b r1 = r1.f1642c
            r2 = 4
            int r4 = r1.f1677r
            r2 = r2 & r4
            if (r2 == 0) goto L_0x0840
            r9 = 1
            goto L_0x0841
        L_0x0840:
            r9 = r0
        L_0x0841:
            if (r9 == 0) goto L_0x0848
            androidx.constraintlayout.motion.widget.b r0 = r1.f1671l
            boolean r0 = r0.f1693m
            return r0
        L_0x0848:
            r0 = 1
            return r0
        L_0x084a:
            r3 = r0
            boolean r0 = super.onTouchEvent(r34)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof MotionHelper) {
            MotionHelper motionHelper = (MotionHelper) view;
            if (this.f1583l0 == null) {
                this.f1583l0 = new CopyOnWriteArrayList<>();
            }
            this.f1583l0.add(motionHelper);
            if (motionHelper.f1568p) {
                if (this.f1580i0 == null) {
                    this.f1580i0 = new ArrayList<>();
                }
                this.f1580i0.add(motionHelper);
            }
            if (motionHelper.f1569q) {
                if (this.f1581j0 == null) {
                    this.f1581j0 = new ArrayList<>();
                }
                this.f1581j0.add(motionHelper);
            }
            if (motionHelper instanceof MotionEffect) {
                if (this.f1582k0 == null) {
                    this.f1582k0 = new ArrayList<>();
                }
                this.f1582k0.add(motionHelper);
            }
        }
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<MotionHelper> arrayList = this.f1580i0;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<MotionHelper> arrayList2 = this.f1581j0;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    public final void r(float f10) {
        a aVar = this.f1595x;
        if (aVar != null) {
            float f11 = this.L;
            float f12 = this.K;
            if (f11 != f12 && this.O) {
                this.L = f12;
            }
            float f13 = this.L;
            if (f13 != f10) {
                this.T = false;
                this.N = f10;
                this.J = ((float) aVar.c()) / 1000.0f;
                setProgress(this.N);
                this.f1597y = null;
                this.f1599z = this.f1595x.e();
                this.O = false;
                this.I = getNanoTime();
                this.P = true;
                this.K = f13;
                this.L = f13;
                invalidate();
            }
        }
    }

    public final void requestLayout() {
        a aVar;
        a.b bVar;
        if (!this.f1589r0 && this.C == -1 && (aVar = this.f1595x) != null && (bVar = aVar.f1642c) != null) {
            int i10 = bVar.f1676q;
            if (i10 != 0) {
                if (i10 == 2) {
                    int childCount = getChildCount();
                    for (int i11 = 0; i11 < childCount; i11++) {
                        this.H.get(getChildAt(i11)).f9732d = true;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        super.requestLayout();
    }

    public final void s(boolean z10) {
        float f10;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            n nVar = this.H.get(getChildAt(i10));
            if (nVar != null && "button".equals(f1.a.d(nVar.f9730b)) && nVar.A != null) {
                int i11 = 0;
                while (true) {
                    k[] kVarArr = nVar.A;
                    if (i11 >= kVarArr.length) {
                        break;
                    }
                    k kVar = kVarArr[i11];
                    if (z10) {
                        f10 = -100.0f;
                    } else {
                        f10 = 100.0f;
                    }
                    kVar.h(nVar.f9730b, f10);
                    i11++;
                }
            }
        }
    }

    public void setDebugMode(int i10) {
        this.R = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.E0 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.G = z10;
    }

    public void setInterpolatedProgress(float f10) {
        if (this.f1595x != null) {
            setState(i.MOVING);
            Interpolator e10 = this.f1595x.e();
            if (e10 != null) {
                setProgress(e10.getInterpolation(f10));
                return;
            }
        }
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<MotionHelper> arrayList = this.f1581j0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1581j0.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<MotionHelper> arrayList = this.f1580i0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f1580i0.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10, float f11) {
        if (!isAttachedToWindow()) {
            if (this.B0 == null) {
                this.B0 = new g();
            }
            g gVar = this.B0;
            gVar.f1630a = f10;
            gVar.f1631b = f11;
            return;
        }
        setProgress(f10);
        setState(i.MOVING);
        this.A = f11;
        float f12 = 0.0f;
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        if (i10 != 0) {
            if (i10 > 0) {
                f12 = 1.0f;
            }
            r(f12);
        } else if (f10 != 0.0f && f10 != 1.0f) {
            if (f10 > 0.5f) {
                f12 = 1.0f;
            }
            r(f12);
        }
    }

    public void setScene(a aVar) {
        b bVar;
        this.f1595x = aVar;
        boolean f10 = f();
        aVar.f1655p = f10;
        a.b bVar2 = aVar.f1642c;
        if (!(bVar2 == null || (bVar = bVar2.f1671l) == null)) {
            bVar.c(f10);
        }
        C();
    }

    public void setStartState(int i10) {
        if (!isAttachedToWindow()) {
            if (this.B0 == null) {
                this.B0 = new g();
            }
            g gVar = this.B0;
            gVar.f1632c = i10;
            gVar.f1633d = i10;
            return;
        }
        this.C = i10;
    }

    public void setState(i iVar) {
        i iVar2 = i.FINISHED;
        if (iVar != iVar2 || this.C != -1) {
            i iVar3 = this.F0;
            this.F0 = iVar;
            i iVar4 = i.MOVING;
            if (iVar3 == iVar4 && iVar == iVar4) {
                u();
            }
            int ordinal = iVar3.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                if (iVar == iVar4) {
                    u();
                }
                if (iVar == iVar2) {
                    v();
                }
            } else if (ordinal == 2 && iVar == iVar2) {
                v();
            }
        }
    }

    public void setTransition(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.B0 == null) {
                this.B0 = new g();
            }
            g gVar = this.B0;
            gVar.f1632c = i10;
            gVar.f1633d = i11;
            return;
        }
        a aVar = this.f1595x;
        if (aVar != null) {
            this.B = i10;
            this.D = i11;
            aVar.n(i10, i11);
            this.G0.e(this.f1595x.b(i10), this.f1595x.b(i11));
            C();
            this.L = 0.0f;
            r(0.0f);
        }
    }

    public void setTransitionDuration(int i10) {
        a aVar = this.f1595x;
        if (aVar != null) {
            a.b bVar = aVar.f1642c;
            if (bVar != null) {
                bVar.f1667h = Math.max(i10, 8);
            } else {
                aVar.f1649j = i10;
            }
        }
    }

    public void setTransitionListener(h hVar) {
        this.Q = hVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.B0 == null) {
            this.B0 = new g();
        }
        g gVar = this.B0;
        gVar.getClass();
        gVar.f1630a = bundle.getFloat("motion.progress");
        gVar.f1631b = bundle.getFloat("motion.velocity");
        gVar.f1632c = bundle.getInt("motion.StartState");
        gVar.f1633d = bundle.getInt("motion.EndState");
        if (isAttachedToWindow()) {
            this.B0.a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x020c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0119 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0173  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void t(boolean r23) {
        /*
            r22 = this;
            r0 = r22
            androidx.constraintlayout.motion.widget.MotionLayout$i r1 = androidx.constraintlayout.motion.widget.MotionLayout.i.FINISHED
            long r2 = r0.M
            r4 = -1
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L_0x0012
            long r2 = r22.getNanoTime()
            r0.M = r2
        L_0x0012:
            float r2 = r0.L
            r3 = 0
            int r4 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r5 = -1
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto L_0x0022
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L_0x0022
            r0.C = r5
        L_0x0022:
            boolean r4 = r0.f1579h0
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L_0x0034
            boolean r4 = r0.P
            if (r4 == 0) goto L_0x023e
            if (r23 != 0) goto L_0x0034
            float r4 = r0.N
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x023e
        L_0x0034:
            float r4 = r0.N
            float r4 = r4 - r2
            float r2 = java.lang.Math.signum(r4)
            long r9 = r22.getNanoTime()
            f1.o r4 = r0.f1597y
            boolean r11 = r4 instanceof f1.o
            r12 = 814313567(0x3089705f, float:1.0E-9)
            if (r11 != 0) goto L_0x0053
            long r13 = r0.M
            long r13 = r9 - r13
            float r11 = (float) r13
            float r11 = r11 * r2
            float r11 = r11 * r12
            float r13 = r0.J
            float r11 = r11 / r13
            goto L_0x0054
        L_0x0053:
            r11 = r3
        L_0x0054:
            float r13 = r0.L
            float r13 = r13 + r11
            boolean r14 = r0.O
            if (r14 == 0) goto L_0x005d
            float r13 = r0.N
        L_0x005d:
            int r14 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r14 <= 0) goto L_0x0067
            float r15 = r0.N
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 >= 0) goto L_0x0071
        L_0x0067:
            int r15 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r15 > 0) goto L_0x0077
            float r15 = r0.N
            int r15 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r15 > 0) goto L_0x0077
        L_0x0071:
            float r13 = r0.N
            r0.P = r7
            r15 = r8
            goto L_0x0078
        L_0x0077:
            r15 = r7
        L_0x0078:
            r0.L = r13
            r0.K = r13
            r0.M = r9
            r5 = 2
            r16 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r4 == 0) goto L_0x0104
            if (r15 != 0) goto L_0x0104
            boolean r15 = r0.T
            if (r15 == 0) goto L_0x00e7
            long r6 = r0.I
            long r6 = r9 - r6
            float r6 = (float) r6
            float r6 = r6 * r12
            float r4 = r4.getInterpolation(r6)
            f1.o r6 = r0.f1597y
            e1.a r7 = r0.U
            if (r6 != r7) goto L_0x00a6
            b1.m r6 = r7.f9074c
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x00a4
            r6 = r5
            goto L_0x00a7
        L_0x00a4:
            r6 = r8
            goto L_0x00a7
        L_0x00a6:
            r6 = 0
        L_0x00a7:
            r0.L = r4
            r0.M = r9
            f1.o r7 = r0.f1597y
            boolean r9 = r7 instanceof f1.o
            if (r9 == 0) goto L_0x0108
            float r7 = r7.a()
            r0.A = r7
            float r9 = java.lang.Math.abs(r7)
            float r10 = r0.J
            float r9 = r9 * r10
            int r9 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r9 > 0) goto L_0x00c8
            if (r6 != r5) goto L_0x00c8
            r5 = 0
            r0.P = r5
            goto L_0x00c9
        L_0x00c8:
            r5 = 0
        L_0x00c9:
            int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x00d9
            r9 = 1065353216(0x3f800000, float:1.0)
            int r10 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r10 < 0) goto L_0x00d9
            r0.L = r9
            r0.P = r5
            r4 = 1065353216(0x3f800000, float:1.0)
        L_0x00d9:
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0108
            int r7 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r7 > 0) goto L_0x0108
            r0.L = r3
            r0.P = r5
            r4 = r3
            goto L_0x0108
        L_0x00e7:
            float r4 = r4.getInterpolation(r13)
            f1.o r5 = r0.f1597y
            boolean r6 = r5 instanceof f1.o
            if (r6 == 0) goto L_0x00f8
            float r5 = r5.a()
            r0.A = r5
            goto L_0x0102
        L_0x00f8:
            float r13 = r13 + r11
            float r5 = r5.getInterpolation(r13)
            float r5 = r5 - r4
            float r5 = r5 * r2
            float r5 = r5 / r11
            r0.A = r5
        L_0x0102:
            r13 = r4
            goto L_0x0106
        L_0x0104:
            r0.A = r11
        L_0x0106:
            r4 = r13
            r6 = 0
        L_0x0108:
            float r5 = r0.A
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 <= 0) goto L_0x0117
            androidx.constraintlayout.motion.widget.MotionLayout$i r5 = androidx.constraintlayout.motion.widget.MotionLayout.i.MOVING
            r0.setState(r5)
        L_0x0117:
            if (r6 == r8) goto L_0x0141
            if (r14 <= 0) goto L_0x0121
            float r5 = r0.N
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x012b
        L_0x0121:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0130
            float r5 = r0.N
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x0130
        L_0x012b:
            float r4 = r0.N
            r5 = 0
            r0.P = r5
        L_0x0130:
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x013a
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x0141
        L_0x013a:
            r5 = 0
            r0.P = r5
            r0.setState(r1)
            goto L_0x0142
        L_0x0141:
            r5 = 0
        L_0x0142:
            int r6 = r22.getChildCount()
            r0.f1579h0 = r5
            long r9 = r22.getNanoTime()
            r0.f1598y0 = r4
            android.view.animation.Interpolator r7 = r0.f1599z
            if (r7 != 0) goto L_0x0154
            r7 = r4
            goto L_0x0158
        L_0x0154:
            float r7 = r7.getInterpolation(r4)
        L_0x0158:
            android.view.animation.Interpolator r11 = r0.f1599z
            if (r11 == 0) goto L_0x0170
            float r12 = r0.J
            float r12 = r2 / r12
            float r12 = r12 + r4
            float r11 = r11.getInterpolation(r12)
            r0.A = r11
            android.view.animation.Interpolator r12 = r0.f1599z
            float r12 = r12.getInterpolation(r4)
            float r11 = r11 - r12
            r0.A = r11
        L_0x0170:
            r11 = r5
        L_0x0171:
            if (r11 >= r6) goto L_0x019a
            android.view.View r12 = r0.getChildAt(r11)
            java.util.HashMap<android.view.View, f1.n> r13 = r0.H
            java.lang.Object r13 = r13.get(r12)
            r16 = r13
            f1.n r16 = (f1.n) r16
            if (r16 == 0) goto L_0x0196
            boolean r13 = r0.f1579h0
            lc.b r5 = r0.f1600z0
            r17 = r7
            r18 = r9
            r20 = r12
            r21 = r5
            boolean r5 = r16.e(r17, r18, r20, r21)
            r5 = r5 | r13
            r0.f1579h0 = r5
        L_0x0196:
            int r11 = r11 + 1
            r5 = 0
            goto L_0x0171
        L_0x019a:
            if (r14 <= 0) goto L_0x01a2
            float r5 = r0.N
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L_0x01ac
        L_0x01a2:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x01ae
            float r5 = r0.N
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x01ae
        L_0x01ac:
            r5 = r8
            goto L_0x01af
        L_0x01ae:
            r5 = 0
        L_0x01af:
            boolean r6 = r0.f1579h0
            if (r6 != 0) goto L_0x01bc
            boolean r6 = r0.P
            if (r6 != 0) goto L_0x01bc
            if (r5 == 0) goto L_0x01bc
            r0.setState(r1)
        L_0x01bc:
            boolean r6 = r0.f1589r0
            if (r6 == 0) goto L_0x01c3
            r22.requestLayout()
        L_0x01c3:
            boolean r6 = r0.f1579h0
            r5 = r5 ^ r8
            r5 = r5 | r6
            r0.f1579h0 = r5
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 > 0) goto L_0x01e6
            int r5 = r0.B
            r6 = -1
            if (r5 == r6) goto L_0x01e6
            int r6 = r0.C
            if (r6 == r5) goto L_0x01e6
            r0.C = r5
            androidx.constraintlayout.motion.widget.a r6 = r0.f1595x
            androidx.constraintlayout.widget.a r5 = r6.b(r5)
            r5.a(r0)
            r0.setState(r1)
            r7 = r8
            goto L_0x01e7
        L_0x01e6:
            r7 = 0
        L_0x01e7:
            double r5 = (double) r4
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 < 0) goto L_0x0203
            int r5 = r0.C
            int r6 = r0.D
            if (r5 == r6) goto L_0x0203
            r0.C = r6
            androidx.constraintlayout.motion.widget.a r5 = r0.f1595x
            androidx.constraintlayout.widget.a r5 = r5.b(r6)
            r5.a(r0)
            r0.setState(r1)
            r7 = r8
        L_0x0203:
            boolean r5 = r0.f1579h0
            if (r5 != 0) goto L_0x0220
            boolean r5 = r0.P
            if (r5 == 0) goto L_0x020c
            goto L_0x0220
        L_0x020c:
            if (r14 <= 0) goto L_0x0214
            r5 = 1065353216(0x3f800000, float:1.0)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x021c
        L_0x0214:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0223
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0223
        L_0x021c:
            r0.setState(r1)
            goto L_0x0223
        L_0x0220:
            r22.invalidate()
        L_0x0223:
            boolean r1 = r0.f1579h0
            if (r1 != 0) goto L_0x023e
            boolean r1 = r0.P
            if (r1 != 0) goto L_0x023e
            if (r14 <= 0) goto L_0x0233
            r1 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r5 == 0) goto L_0x023b
        L_0x0233:
            int r1 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x023e
            int r1 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x023e
        L_0x023b:
            r22.A()
        L_0x023e:
            float r1 = r0.L
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0252
            int r1 = r0.C
            int r2 = r0.D
            if (r1 == r2) goto L_0x024d
            goto L_0x024e
        L_0x024d:
            r8 = r7
        L_0x024e:
            r0.C = r2
        L_0x0250:
            r7 = r8
            goto L_0x0261
        L_0x0252:
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x0261
            int r1 = r0.C
            int r2 = r0.B
            if (r1 == r2) goto L_0x025d
            goto L_0x025e
        L_0x025d:
            r8 = r7
        L_0x025e:
            r0.C = r2
            goto L_0x0250
        L_0x0261:
            boolean r1 = r0.H0
            r1 = r1 | r7
            r0.H0 = r1
            if (r7 == 0) goto L_0x026f
            boolean r1 = r0.A0
            if (r1 != 0) goto L_0x026f
            r22.requestLayout()
        L_0x026f:
            float r1 = r0.L
            r0.K = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.t(boolean):void");
    }

    public final String toString() {
        Context context = getContext();
        return f1.a.c(context, this.B) + "->" + f1.a.c(context, this.D) + " (pos:" + this.L + " Dpos/Dt:" + this.A;
    }

    public final void u() {
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if ((this.Q != null || ((copyOnWriteArrayList = this.f1583l0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1588q0 != this.K) {
            if (this.f1587p0 != -1) {
                h hVar = this.Q;
                if (hVar != null) {
                    hVar.c();
                }
                CopyOnWriteArrayList<h> copyOnWriteArrayList2 = this.f1583l0;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<h> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().c();
                    }
                }
            }
            this.f1587p0 = -1;
            this.f1588q0 = this.K;
            h hVar2 = this.Q;
            if (hVar2 != null) {
                hVar2.b();
            }
            CopyOnWriteArrayList<h> copyOnWriteArrayList3 = this.f1583l0;
            if (copyOnWriteArrayList3 != null) {
                Iterator<h> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().b();
                }
            }
        }
    }

    public final void v() {
        int i10;
        CopyOnWriteArrayList<h> copyOnWriteArrayList;
        if ((this.Q != null || ((copyOnWriteArrayList = this.f1583l0) != null && !copyOnWriteArrayList.isEmpty())) && this.f1587p0 == -1) {
            this.f1587p0 = this.C;
            if (!this.L0.isEmpty()) {
                ArrayList<Integer> arrayList = this.L0;
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i10 = -1;
            }
            int i11 = this.C;
            if (!(i10 == i11 || i11 == -1)) {
                this.L0.add(Integer.valueOf(i11));
            }
        }
        B();
        Runnable runnable = this.C0;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void w(int i10, float f10, float f11, float f12, float[] fArr) {
        HashMap<View, n> hashMap = this.H;
        View c10 = c(i10);
        n nVar = hashMap.get(c10);
        if (nVar != null) {
            nVar.d(f10, f11, f12, fArr);
            c10.getY();
        } else if (c10 != null) {
            c10.getContext().getResources().getResourceName(i10);
        }
    }

    public final a.b x(int i10) {
        Iterator<a.b> it = this.f1595x.f1643d.iterator();
        while (it.hasNext()) {
            a.b next = it.next();
            if (next.f1660a == i10) {
                return next;
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean y(float r8, float r9, android.view.MotionEvent r10, android.view.View r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L_0x0036
            r0 = r11
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        L_0x000d:
            if (r2 < 0) goto L_0x0036
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r11.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r11.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.y(r4, r5, r10, r3)
            if (r3 == 0) goto L_0x0033
            r0 = r1
            goto L_0x0037
        L_0x0033:
            int r2 = r2 + -1
            goto L_0x000d
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x00ab
            android.graphics.RectF r2 = r7.I0
            int r3 = r11.getRight()
            float r3 = (float) r3
            float r3 = r3 + r8
            int r4 = r11.getLeft()
            float r4 = (float) r4
            float r3 = r3 - r4
            int r4 = r11.getBottom()
            float r4 = (float) r4
            float r4 = r4 + r9
            int r5 = r11.getTop()
            float r5 = (float) r5
            float r4 = r4 - r5
            r2.set(r8, r9, r3, r4)
            int r2 = r10.getAction()
            if (r2 != 0) goto L_0x006c
            android.graphics.RectF r2 = r7.I0
            float r3 = r10.getX()
            float r4 = r10.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 == 0) goto L_0x00ab
        L_0x006c:
            float r8 = -r8
            float r9 = -r9
            android.graphics.Matrix r2 = r11.getMatrix()
            boolean r3 = r2.isIdentity()
            if (r3 == 0) goto L_0x0085
            r10.offsetLocation(r8, r9)
            boolean r11 = r11.onTouchEvent(r10)
            float r8 = -r8
            float r9 = -r9
            r10.offsetLocation(r8, r9)
            goto L_0x00a8
        L_0x0085:
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r10)
            r10.offsetLocation(r8, r9)
            android.graphics.Matrix r8 = r7.K0
            if (r8 != 0) goto L_0x0097
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r7.K0 = r8
        L_0x0097:
            android.graphics.Matrix r8 = r7.K0
            r2.invert(r8)
            android.graphics.Matrix r8 = r7.K0
            r10.transform(r8)
            boolean r11 = r11.onTouchEvent(r10)
            r10.recycle()
        L_0x00a8:
            if (r11 == 0) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r1 = r0
        L_0x00ac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionLayout.y(float, float, android.view.MotionEvent, android.view.View):boolean");
    }

    public final void z(AttributeSet attributeSet) {
        a aVar;
        a aVar2;
        int i10;
        M0 = isInEditMode();
        int i11 = -1;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionLayout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            boolean z10 = true;
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = obtainStyledAttributes.getIndex(i12);
                if (index == R$styleable.MotionLayout_layoutDescription) {
                    this.f1595x = new a(getContext(), this, obtainStyledAttributes.getResourceId(index, -1));
                } else if (index == R$styleable.MotionLayout_currentState) {
                    this.C = obtainStyledAttributes.getResourceId(index, -1);
                } else if (index == R$styleable.MotionLayout_motionProgress) {
                    this.N = obtainStyledAttributes.getFloat(index, 0.0f);
                    this.P = true;
                } else if (index == R$styleable.MotionLayout_applyMotionScene) {
                    z10 = obtainStyledAttributes.getBoolean(index, z10);
                } else if (index == R$styleable.MotionLayout_showPaths) {
                    if (this.R == 0) {
                        if (obtainStyledAttributes.getBoolean(index, false)) {
                            i10 = 2;
                        } else {
                            i10 = 0;
                        }
                        this.R = i10;
                    }
                } else if (index == R$styleable.MotionLayout_motionDebug) {
                    this.R = obtainStyledAttributes.getInt(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
            if (!z10) {
                this.f1595x = null;
            }
        }
        if (!(this.R == 0 || (aVar2 = this.f1595x) == null)) {
            int h10 = aVar2.h();
            a aVar3 = this.f1595x;
            androidx.constraintlayout.widget.a b10 = aVar3.b(aVar3.h());
            f1.a.c(getContext(), h10);
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                View childAt = getChildAt(i13);
                if (b10.i(childAt.getId()) == null) {
                    f1.a.d(childAt);
                }
            }
            Integer[] numArr = (Integer[]) b10.f1946f.keySet().toArray(new Integer[0]);
            int length = numArr.length;
            int[] iArr = new int[length];
            for (int i14 = 0; i14 < length; i14++) {
                iArr[i14] = numArr[i14].intValue();
            }
            for (int i15 = 0; i15 < length; i15++) {
                int i16 = iArr[i15];
                f1.a.c(getContext(), i16);
                findViewById(iArr[i15]);
                int i17 = b10.h(i16).f1951e.f1974d;
                int i18 = b10.h(i16).f1951e.f1972c;
            }
            SparseIntArray sparseIntArray = new SparseIntArray();
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            Iterator<a.b> it = this.f1595x.f1643d.iterator();
            while (it.hasNext()) {
                a.b next = it.next();
                a.b bVar = this.f1595x.f1642c;
                int i19 = next.f1663d;
                int i20 = next.f1662c;
                f1.a.c(getContext(), i19);
                f1.a.c(getContext(), i20);
                sparseIntArray.get(i19);
                sparseIntArray2.get(i20);
                sparseIntArray.put(i19, i20);
                sparseIntArray2.put(i20, i19);
                this.f1595x.b(i19);
                this.f1595x.b(i20);
            }
        }
        if (this.C == -1 && (aVar = this.f1595x) != null) {
            this.C = aVar.h();
            this.B = this.f1595x.h();
            a.b bVar2 = this.f1595x.f1642c;
            if (bVar2 != null) {
                i11 = bVar2.f1662c;
            }
            this.D = i11;
        }
    }

    public void setState(int i10, int i11, int i12) {
        setState(i.SETUP);
        this.C = i10;
        this.B = -1;
        this.D = -1;
        g1.b bVar = this.f1861r;
        if (bVar != null) {
            bVar.b((float) i11, (float) i12, i10);
            return;
        }
        a aVar = this.f1595x;
        if (aVar != null) {
            aVar.b(i10).b(this);
        }
    }

    public void setProgress(float f10) {
        i iVar = i.FINISHED;
        i iVar2 = i.MOVING;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (!isAttachedToWindow()) {
            if (this.B0 == null) {
                this.B0 = new g();
            }
            this.B0.f1630a = f10;
            return;
        }
        if (i10 <= 0) {
            if (this.L == 1.0f && this.C == this.D) {
                setState(iVar2);
            }
            this.C = this.B;
            if (this.L == 0.0f) {
                setState(iVar);
            }
        } else if (f10 >= 1.0f) {
            if (this.L == 0.0f && this.C == this.B) {
                setState(iVar2);
            }
            this.C = this.D;
            if (this.L == 1.0f) {
                setState(iVar);
            }
        } else {
            this.C = -1;
            setState(iVar2);
        }
        if (this.f1595x != null) {
            this.O = true;
            this.N = f10;
            this.K = f10;
            this.M = -1;
            this.I = -1;
            this.f1597y = null;
            this.P = true;
            invalidate();
        }
    }

    public void setTransition(int i10) {
        if (this.f1595x != null) {
            a.b x10 = x(i10);
            this.B = x10.f1663d;
            this.D = x10.f1662c;
            if (!isAttachedToWindow()) {
                if (this.B0 == null) {
                    this.B0 = new g();
                }
                g gVar = this.B0;
                gVar.f1632c = this.B;
                gVar.f1633d = this.D;
                return;
            }
            float f10 = Float.NaN;
            int i11 = this.C;
            if (i11 == this.B) {
                f10 = 0.0f;
            } else if (i11 == this.D) {
                f10 = 1.0f;
            }
            a aVar = this.f1595x;
            aVar.f1642c = x10;
            b bVar = x10.f1671l;
            if (bVar != null) {
                bVar.c(aVar.f1655p);
            }
            this.G0.e(this.f1595x.b(this.B), this.f1595x.b(this.D));
            C();
            if (this.L != f10) {
                if (f10 == 0.0f) {
                    s(true);
                    this.f1595x.b(this.B).b(this);
                } else if (f10 == 1.0f) {
                    s(false);
                    this.f1595x.b(this.D).b(this);
                }
            }
            this.L = Float.isNaN(f10) ? 0.0f : f10;
            if (Float.isNaN(f10)) {
                f1.a.b();
                r(0.0f);
                return;
            }
            setProgress(f10);
        }
    }

    public void setTransition(a.b bVar) {
        int i10;
        long j10;
        b bVar2;
        a aVar = this.f1595x;
        aVar.f1642c = bVar;
        if (!(bVar == null || (bVar2 = bVar.f1671l) == null)) {
            bVar2.c(aVar.f1655p);
        }
        setState(i.SETUP);
        int i11 = this.C;
        a.b bVar3 = this.f1595x.f1642c;
        int i12 = -1;
        if (bVar3 == null) {
            i10 = -1;
        } else {
            i10 = bVar3.f1662c;
        }
        if (i11 == i10) {
            this.L = 1.0f;
            this.K = 1.0f;
            this.N = 1.0f;
        } else {
            this.L = 0.0f;
            this.K = 0.0f;
            this.N = 0.0f;
        }
        boolean z10 = true;
        if ((bVar.f1677r & 1) == 0) {
            z10 = false;
        }
        if (z10) {
            j10 = -1;
        } else {
            j10 = getNanoTime();
        }
        this.M = j10;
        int h10 = this.f1595x.h();
        a aVar2 = this.f1595x;
        a.b bVar4 = aVar2.f1642c;
        if (bVar4 != null) {
            i12 = bVar4.f1662c;
        }
        if (h10 != this.B || i12 != this.D) {
            this.B = h10;
            this.D = i12;
            aVar2.n(h10, i12);
            this.G0.e(this.f1595x.b(this.B), this.f1595x.b(this.D));
            e eVar = this.G0;
            int i13 = this.B;
            int i14 = this.D;
            eVar.f1625e = i13;
            eVar.f1626f = i14;
            eVar.f();
            C();
        }
    }

    public MotionLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new HashMap();
        this.D0 = new Rect();
        this.E0 = false;
        this.F0 = i.UNDEFINED;
        this.G0 = new e();
        this.H0 = false;
        this.I0 = new RectF();
        this.J0 = null;
        this.K0 = null;
        this.L0 = new ArrayList<>();
        z(attributeSet);
    }

    public MotionLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        new HashMap();
        this.D0 = new Rect();
        this.E0 = false;
        this.F0 = i.UNDEFINED;
        this.G0 = new e();
        this.H0 = false;
        this.I0 = new RectF();
        this.J0 = null;
        this.K0 = null;
        this.L0 = new ArrayList<>();
        z(attributeSet);
    }
}
