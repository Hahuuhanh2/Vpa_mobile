package com.airbnb.lottie;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.Choreographer;
import android.view.View;
import c7.j;
import f0.b0;
import g4.e;
import g4.f;
import g4.h;
import h4.g;
import j4.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import l4.p;
import m4.c;
import n4.d;
import z.k;

/* compiled from: LottieDrawable */
public final class c0 extends Drawable implements Drawable.Callback, Animatable {
    public boolean A;
    public final Matrix B;
    public Bitmap C;
    public Canvas D;
    public Rect E;
    public RectF F;
    public c4.a G;
    public Rect H;
    public Rect I;
    public RectF J;
    public RectF K;
    public Matrix L;
    public Matrix M;
    public boolean N;

    /* renamed from: a  reason: collision with root package name */
    public i f4772a;

    /* renamed from: b  reason: collision with root package name */
    public final d f4773b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4774c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f4775d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f4776e = false;

    /* renamed from: f  reason: collision with root package name */
    public int f4777f = 1;

    /* renamed from: n  reason: collision with root package name */
    public final ArrayList<b> f4778n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    public f4.b f4779o;

    /* renamed from: p  reason: collision with root package name */
    public String f4780p;

    /* renamed from: q  reason: collision with root package name */
    public f4.a f4781q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f4782r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f4783s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f4784t;

    /* renamed from: u  reason: collision with root package name */
    public c f4785u;

    /* renamed from: v  reason: collision with root package name */
    public int f4786v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f4787w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f4788x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f4789y;

    /* renamed from: z  reason: collision with root package name */
    public k0 f4790z;

    /* compiled from: LottieDrawable */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float f10;
            c0 c0Var = c0.this;
            c cVar = c0Var.f4785u;
            if (cVar != null) {
                d dVar = c0Var.f4773b;
                i iVar = dVar.f13509q;
                if (iVar == null) {
                    f10 = 0.0f;
                } else {
                    float f11 = dVar.f13505f;
                    float f12 = iVar.f4842k;
                    f10 = (f11 - f12) / (iVar.f4843l - f12);
                }
                cVar.t(f10);
            }
        }
    }

    /* compiled from: LottieDrawable */
    public interface b {
        void run();
    }

    public c0() {
        d dVar = new d();
        this.f4773b = dVar;
        a aVar = new a();
        this.f4783s = false;
        this.f4784t = true;
        this.f4786v = 255;
        this.f4790z = k0.AUTOMATIC;
        this.A = false;
        this.B = new Matrix();
        this.N = false;
        dVar.addUpdateListener(aVar);
    }

    public static void f(RectF rectF, Rect rect) {
        rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
    }

    public final <T> void a(e eVar, T t10, k kVar) {
        float f10;
        c cVar = this.f4785u;
        if (cVar == null) {
            this.f4778n.add(new s(this, eVar, t10, kVar));
            return;
        }
        boolean z10 = true;
        if (eVar == e.f10359c) {
            cVar.h(kVar, t10);
        } else {
            f fVar = eVar.f10361b;
            if (fVar != null) {
                fVar.h(kVar, t10);
            } else {
                ArrayList arrayList = new ArrayList();
                this.f4785u.i(eVar, 0, arrayList, new e(new String[0]));
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((e) arrayList.get(i10)).f10361b.h(kVar, t10);
                }
                z10 = true ^ arrayList.isEmpty();
            }
        }
        if (z10) {
            invalidateSelf();
            if (t10 == g0.E) {
                d dVar = this.f4773b;
                i iVar = dVar.f13509q;
                if (iVar == null) {
                    f10 = 0.0f;
                } else {
                    float f11 = dVar.f13505f;
                    float f12 = iVar.f4842k;
                    f10 = (f11 - f12) / (iVar.f4843l - f12);
                }
                w(f10);
            }
        }
    }

    public final boolean b() {
        if (this.f4774c || this.f4775d) {
            return true;
        }
        return false;
    }

    public final void c() {
        i iVar = this.f4772a;
        if (iVar != null) {
            c.a aVar = p.f12684a;
            Rect rect = iVar.f4841j;
            List emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            g gVar = r13;
            g gVar2 = new g();
            j4.e eVar = r1;
            Rect rect2 = rect;
            j4.e eVar2 = new j4.e(emptyList, iVar, "__container", -1, 1, -1, (String) null, emptyList2, gVar, 0, 0, 0, 0.0f, 0.0f, rect2.width(), rect2.height(), (h4.c) null, (a1.c) null, Collections.emptyList(), 1, (h4.b) null, false, (lc.b) null, (j) null);
            i iVar2 = iVar;
            j4.c cVar = new j4.c(this, eVar, iVar2.f4840i, iVar2);
            this.f4785u = cVar;
            if (this.f4788x) {
                cVar.s(true);
            }
            this.f4785u.H = this.f4784t;
        }
    }

    public final void d() {
        d dVar = this.f4773b;
        if (dVar.f13510r) {
            dVar.cancel();
            if (!isVisible()) {
                this.f4777f = 1;
            }
        }
        this.f4772a = null;
        this.f4785u = null;
        this.f4779o = null;
        d dVar2 = this.f4773b;
        dVar2.f13509q = null;
        dVar2.f13507o = -2.14748365E9f;
        dVar2.f13508p = 2.14748365E9f;
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        if (this.f4776e) {
            try {
                if (this.A) {
                    j(canvas, this.f4785u);
                } else {
                    g(canvas);
                }
            } catch (Throwable unused) {
                n4.c.f13501a.getClass();
            }
        } else if (this.A) {
            j(canvas, this.f4785u);
        } else {
            g(canvas);
        }
        this.N = false;
        m9.b.v();
    }

    public final void e() {
        i iVar = this.f4772a;
        if (iVar != null) {
            k0 k0Var = this.f4790z;
            int i10 = Build.VERSION.SDK_INT;
            boolean z10 = iVar.f4845n;
            int i11 = iVar.f4846o;
            int ordinal = k0Var.ordinal();
            boolean z11 = false;
            if (ordinal != 1 && (ordinal == 2 || ((z10 && i10 < 28) || i11 > 4 || i10 <= 25))) {
                z11 = true;
            }
            this.A = z11;
        }
    }

    public final void g(Canvas canvas) {
        j4.c cVar = this.f4785u;
        i iVar = this.f4772a;
        if (cVar != null && iVar != null) {
            this.B.reset();
            Rect bounds = getBounds();
            if (!bounds.isEmpty()) {
                float height = ((float) bounds.height()) / ((float) iVar.f4841j.height());
                this.B.preScale(((float) bounds.width()) / ((float) iVar.f4841j.width()), height);
            }
            cVar.f(canvas, this.B, this.f4786v);
        }
    }

    public final int getAlpha() {
        return this.f4786v;
    }

    public final int getIntrinsicHeight() {
        i iVar = this.f4772a;
        if (iVar == null) {
            return -1;
        }
        return iVar.f4841j.height();
    }

    public final int getIntrinsicWidth() {
        i iVar = this.f4772a;
        if (iVar == null) {
            return -1;
        }
        return iVar.f4841j.width();
    }

    public final int getOpacity() {
        return -3;
    }

    public final void h() {
        this.f4778n.clear();
        this.f4773b.g(true);
        if (!isVisible()) {
            this.f4777f = 1;
        }
    }

    public final void i() {
        float f10;
        float f11;
        if (this.f4785u == null) {
            this.f4778n.add(new a0(this));
            return;
        }
        e();
        if (b() || this.f4773b.getRepeatCount() == 0) {
            if (isVisible()) {
                d dVar = this.f4773b;
                dVar.f13510r = true;
                boolean f12 = dVar.f();
                Iterator it = dVar.f13499b.iterator();
                while (it.hasNext()) {
                    Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
                    if (Build.VERSION.SDK_INT >= 26) {
                        animatorListener.onAnimationStart(dVar, f12);
                    } else {
                        animatorListener.onAnimationStart(dVar);
                    }
                }
                if (dVar.f()) {
                    f11 = dVar.c();
                } else {
                    f11 = dVar.e();
                }
                dVar.j((float) ((int) f11));
                dVar.f13504e = 0;
                dVar.f13506n = 0;
                if (dVar.f13510r) {
                    dVar.g(false);
                    Choreographer.getInstance().postFrameCallback(dVar);
                }
                this.f4777f = 1;
            } else {
                this.f4777f = 2;
            }
        }
        if (!b()) {
            d dVar2 = this.f4773b;
            if (dVar2.f13502c < 0.0f) {
                f10 = dVar2.e();
            } else {
                f10 = dVar2.c();
            }
            l((int) f10);
            d dVar3 = this.f4773b;
            dVar3.g(true);
            dVar3.a(dVar3.f());
            if (!isVisible()) {
                this.f4777f = 1;
            }
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    public final void invalidateSelf() {
        if (!this.N) {
            this.N = true;
            Drawable.Callback callback = getCallback();
            if (callback != null) {
                callback.invalidateDrawable(this);
            }
        }
    }

    public final boolean isRunning() {
        d dVar = this.f4773b;
        if (dVar == null) {
            return false;
        }
        return dVar.f13510r;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00eb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(android.graphics.Canvas r10, j4.c r11) {
        /*
            r9 = this;
            com.airbnb.lottie.i r0 = r9.f4772a
            if (r0 == 0) goto L_0x01b0
            if (r11 != 0) goto L_0x0008
            goto L_0x01b0
        L_0x0008:
            android.graphics.Canvas r0 = r9.D
            if (r0 == 0) goto L_0x000d
            goto L_0x0053
        L_0x000d:
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>()
            r9.D = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.K = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r9.L = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r9.M = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.E = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.F = r0
            c4.a r0 = new c4.a
            r0.<init>()
            r9.G = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.H = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r9.I = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r9.J = r0
        L_0x0053:
            android.graphics.Matrix r0 = r9.L
            r10.getMatrix(r0)
            android.graphics.Rect r0 = r9.E
            r10.getClipBounds(r0)
            android.graphics.Rect r0 = r9.E
            android.graphics.RectF r1 = r9.F
            int r2 = r0.left
            float r2 = (float) r2
            int r3 = r0.top
            float r3 = (float) r3
            int r4 = r0.right
            float r4 = (float) r4
            int r0 = r0.bottom
            float r0 = (float) r0
            r1.set(r2, r3, r4, r0)
            android.graphics.Matrix r0 = r9.L
            android.graphics.RectF r1 = r9.F
            r0.mapRect(r1)
            android.graphics.RectF r0 = r9.F
            android.graphics.Rect r1 = r9.E
            f(r0, r1)
            boolean r0 = r9.f4784t
            r1 = 0
            if (r0 == 0) goto L_0x0094
            android.graphics.RectF r0 = r9.K
            int r2 = r9.getIntrinsicWidth()
            float r2 = (float) r2
            int r3 = r9.getIntrinsicHeight()
            float r3 = (float) r3
            r4 = 0
            r0.set(r4, r4, r2, r3)
            goto L_0x009a
        L_0x0094:
            android.graphics.RectF r0 = r9.K
            r2 = 0
            r11.d(r0, r2, r1)
        L_0x009a:
            android.graphics.Matrix r0 = r9.L
            android.graphics.RectF r2 = r9.K
            r0.mapRect(r2)
            android.graphics.Rect r0 = r9.getBounds()
            int r2 = r0.width()
            float r2 = (float) r2
            int r3 = r9.getIntrinsicWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            int r0 = r0.height()
            float r0 = (float) r0
            int r3 = r9.getIntrinsicHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            android.graphics.RectF r3 = r9.K
            float r4 = r3.left
            float r4 = r4 * r2
            float r5 = r3.top
            float r5 = r5 * r0
            float r6 = r3.right
            float r6 = r6 * r2
            float r7 = r3.bottom
            float r7 = r7 * r0
            r3.set(r4, r5, r6, r7)
            android.graphics.drawable.Drawable$Callback r3 = r9.getCallback()
            boolean r4 = r3 instanceof android.view.View
            r5 = 1
            if (r4 != 0) goto L_0x00d6
            goto L_0x00e8
        L_0x00d6:
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r3 = r3.getParent()
            boolean r4 = r3 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x00e8
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            boolean r3 = r3.getClipChildren()
            r3 = r3 ^ r5
            goto L_0x00e9
        L_0x00e8:
            r3 = r1
        L_0x00e9:
            if (r3 != 0) goto L_0x00fe
            android.graphics.RectF r3 = r9.K
            android.graphics.Rect r4 = r9.E
            int r6 = r4.left
            float r6 = (float) r6
            int r7 = r4.top
            float r7 = (float) r7
            int r8 = r4.right
            float r8 = (float) r8
            int r4 = r4.bottom
            float r4 = (float) r4
            r3.intersect(r6, r7, r8, r4)
        L_0x00fe:
            android.graphics.RectF r3 = r9.K
            float r3 = r3.width()
            double r3 = (double) r3
            double r3 = java.lang.Math.ceil(r3)
            int r3 = (int) r3
            android.graphics.RectF r4 = r9.K
            float r4 = r4.height()
            double r6 = (double) r4
            double r6 = java.lang.Math.ceil(r6)
            int r4 = (int) r6
            if (r3 == 0) goto L_0x01b0
            if (r4 != 0) goto L_0x011c
            goto L_0x01b0
        L_0x011c:
            android.graphics.Bitmap r6 = r9.C
            if (r6 == 0) goto L_0x014f
            int r6 = r6.getWidth()
            if (r6 < r3) goto L_0x014f
            android.graphics.Bitmap r6 = r9.C
            int r6 = r6.getHeight()
            if (r6 >= r4) goto L_0x012f
            goto L_0x014f
        L_0x012f:
            android.graphics.Bitmap r6 = r9.C
            int r6 = r6.getWidth()
            if (r6 > r3) goto L_0x013f
            android.graphics.Bitmap r6 = r9.C
            int r6 = r6.getHeight()
            if (r6 <= r4) goto L_0x015e
        L_0x013f:
            android.graphics.Bitmap r6 = r9.C
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r1, r1, r3, r4)
            r9.C = r6
            android.graphics.Canvas r7 = r9.D
            r7.setBitmap(r6)
            r9.N = r5
            goto L_0x015e
        L_0x014f:
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r3, r4, r6)
            r9.C = r6
            android.graphics.Canvas r7 = r9.D
            r7.setBitmap(r6)
            r9.N = r5
        L_0x015e:
            boolean r5 = r9.N
            if (r5 == 0) goto L_0x01a0
            android.graphics.Matrix r5 = r9.B
            android.graphics.Matrix r6 = r9.L
            r5.set(r6)
            android.graphics.Matrix r5 = r9.B
            r5.preScale(r2, r0)
            android.graphics.Matrix r0 = r9.B
            android.graphics.RectF r2 = r9.K
            float r5 = r2.left
            float r5 = -r5
            float r2 = r2.top
            float r2 = -r2
            r0.postTranslate(r5, r2)
            android.graphics.Bitmap r0 = r9.C
            r0.eraseColor(r1)
            android.graphics.Canvas r0 = r9.D
            android.graphics.Matrix r2 = r9.B
            int r5 = r9.f4786v
            r11.f(r0, r2, r5)
            android.graphics.Matrix r11 = r9.L
            android.graphics.Matrix r0 = r9.M
            r11.invert(r0)
            android.graphics.Matrix r11 = r9.M
            android.graphics.RectF r0 = r9.J
            android.graphics.RectF r2 = r9.K
            r11.mapRect(r0, r2)
            android.graphics.RectF r11 = r9.J
            android.graphics.Rect r0 = r9.I
            f(r11, r0)
        L_0x01a0:
            android.graphics.Rect r11 = r9.H
            r11.set(r1, r1, r3, r4)
            android.graphics.Bitmap r11 = r9.C
            android.graphics.Rect r0 = r9.H
            android.graphics.Rect r1 = r9.I
            c4.a r2 = r9.G
            r10.drawBitmap(r11, r0, r1, r2)
        L_0x01b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.c0.j(android.graphics.Canvas, j4.c):void");
    }

    public final void k() {
        float f10;
        if (this.f4785u == null) {
            this.f4778n.add(new w(this));
            return;
        }
        e();
        if (b() || this.f4773b.getRepeatCount() == 0) {
            if (isVisible()) {
                d dVar = this.f4773b;
                dVar.f13510r = true;
                dVar.g(false);
                Choreographer.getInstance().postFrameCallback(dVar);
                dVar.f13504e = 0;
                if (dVar.f() && dVar.f13505f == dVar.e()) {
                    dVar.f13505f = dVar.c();
                } else if (!dVar.f() && dVar.f13505f == dVar.c()) {
                    dVar.f13505f = dVar.e();
                }
                this.f4777f = 1;
            } else {
                this.f4777f = 3;
            }
        }
        if (!b()) {
            d dVar2 = this.f4773b;
            if (dVar2.f13502c < 0.0f) {
                f10 = dVar2.e();
            } else {
                f10 = dVar2.c();
            }
            l((int) f10);
            d dVar3 = this.f4773b;
            dVar3.g(true);
            dVar3.a(dVar3.f());
            if (!isVisible()) {
                this.f4777f = 1;
            }
        }
    }

    public final void l(int i10) {
        if (this.f4772a == null) {
            this.f4778n.add(new u(this, i10, 1));
        } else {
            this.f4773b.j((float) i10);
        }
    }

    public final void m(int i10) {
        if (this.f4772a == null) {
            this.f4778n.add(new v(this, i10));
            return;
        }
        d dVar = this.f4773b;
        dVar.k(dVar.f13507o, ((float) i10) + 0.99f);
    }

    public final void n(String str) {
        i iVar = this.f4772a;
        if (iVar == null) {
            this.f4778n.add(new x(this, str));
            return;
        }
        h c10 = iVar.c(str);
        if (c10 != null) {
            m((int) (c10.f10365b + c10.f10366c));
            return;
        }
        throw new IllegalArgumentException(b0.s("Cannot find marker with name ", str, "."));
    }

    public final void o(float f10) {
        i iVar = this.f4772a;
        if (iVar == null) {
            this.f4778n.add(new q(this, f10, 2));
            return;
        }
        d dVar = this.f4773b;
        float f11 = iVar.f4842k;
        float f12 = iVar.f4843l;
        PointF pointF = n4.f.f13512a;
        dVar.k(dVar.f13507o, android.support.v4.media.a.e(f12, f11, f10, f11));
    }

    public final void p(int i10, int i11) {
        if (this.f4772a == null) {
            this.f4778n.add(new b0(this, i10, i11));
        } else {
            this.f4773b.k((float) i10, ((float) i11) + 0.99f);
        }
    }

    public final void q(String str) {
        i iVar = this.f4772a;
        if (iVar == null) {
            this.f4778n.add(new r(this, str));
            return;
        }
        h c10 = iVar.c(str);
        if (c10 != null) {
            int i10 = (int) c10.f10365b;
            p(i10, ((int) c10.f10366c) + i10);
            return;
        }
        throw new IllegalArgumentException(b0.s("Cannot find marker with name ", str, "."));
    }

    public final void r(String str, String str2, boolean z10) {
        float f10;
        i iVar = this.f4772a;
        if (iVar == null) {
            this.f4778n.add(new y(this, str, str2, z10));
            return;
        }
        h c10 = iVar.c(str);
        if (c10 != null) {
            int i10 = (int) c10.f10365b;
            h c11 = this.f4772a.c(str2);
            if (c11 != null) {
                float f11 = c11.f10365b;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                p(i10, (int) (f11 + f10));
                return;
            }
            throw new IllegalArgumentException(b0.s("Cannot find marker with name ", str2, "."));
        }
        throw new IllegalArgumentException(b0.s("Cannot find marker with name ", str, "."));
    }

    public final void s(float f10, float f11) {
        i iVar = this.f4772a;
        if (iVar == null) {
            this.f4778n.add(new t(this, f10, f11));
            return;
        }
        float f12 = iVar.f4842k;
        float f13 = iVar.f4843l;
        PointF pointF = n4.f.f13512a;
        p((int) android.support.v4.media.a.e(f13, f12, f10, f12), (int) android.support.v4.media.a.e(f13, f12, f11, f12));
    }

    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j10);
        }
    }

    public final void setAlpha(int i10) {
        this.f4786v = i10;
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        n4.c.b("Use addColorFilter instead.");
    }

    public final boolean setVisible(boolean z10, boolean z11) {
        boolean z12 = !isVisible();
        boolean visible = super.setVisible(z10, z11);
        if (z10) {
            int i10 = this.f4777f;
            if (i10 == 2) {
                i();
            } else if (i10 == 3) {
                k();
            }
        } else if (this.f4773b.f13510r) {
            h();
            this.f4777f = 3;
        } else if (!z12) {
            this.f4777f = 1;
        }
        return visible;
    }

    public final void start() {
        Drawable.Callback callback = getCallback();
        if (!(callback instanceof View) || !((View) callback).isInEditMode()) {
            i();
        }
    }

    public final void stop() {
        this.f4778n.clear();
        d dVar = this.f4773b;
        dVar.g(true);
        dVar.a(dVar.f());
        if (!isVisible()) {
            this.f4777f = 1;
        }
    }

    public final void t(int i10) {
        if (this.f4772a == null) {
            this.f4778n.add(new u(this, i10, 0));
            return;
        }
        d dVar = this.f4773b;
        dVar.k((float) i10, (float) ((int) dVar.f13508p));
    }

    public final void u(String str) {
        i iVar = this.f4772a;
        if (iVar == null) {
            this.f4778n.add(new z(this, str));
            return;
        }
        h c10 = iVar.c(str);
        if (c10 != null) {
            t((int) c10.f10365b);
            return;
        }
        throw new IllegalArgumentException(b0.s("Cannot find marker with name ", str, "."));
    }

    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(float f10) {
        i iVar = this.f4772a;
        if (iVar == null) {
            this.f4778n.add(new q(this, f10, 1));
            return;
        }
        float f11 = iVar.f4842k;
        float f12 = iVar.f4843l;
        PointF pointF = n4.f.f13512a;
        t((int) android.support.v4.media.a.e(f12, f11, f10, f11));
    }

    public final void w(float f10) {
        i iVar = this.f4772a;
        if (iVar == null) {
            this.f4778n.add(new q(this, f10, 0));
            return;
        }
        d dVar = this.f4773b;
        float f11 = iVar.f4842k;
        float f12 = iVar.f4843l;
        PointF pointF = n4.f.f13512a;
        dVar.j(((f12 - f11) * f10) + f11);
        m9.b.v();
    }
}
