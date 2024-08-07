package com.google.android.material.carousel;

import al.g0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import com.google.android.material.carousel.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import x7.e;
import x7.f;
import x7.g;
import x7.h;

public class CarouselLayoutManager extends RecyclerView.m implements x7.b, RecyclerView.v.b {
    public final c A;
    public o B;
    public c C;
    public b D;
    public int E;
    public HashMap F;
    public f G;
    public final View.OnLayoutChangeListener H;
    public int I;
    public int J;
    public int K;

    /* renamed from: x  reason: collision with root package name */
    public int f5943x;

    /* renamed from: y  reason: collision with root package name */
    public int f5944y;

    /* renamed from: z  reason: collision with root package name */
    public int f5945z;

    public class a extends l {
        public a(Context context) {
            super(context);
        }

        public final PointF a(int i10) {
            return CarouselLayoutManager.this.a(i10);
        }

        public final int i(int i10, View view) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            if (carouselLayoutManager.C == null || !carouselLayoutManager.c1()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager2 = CarouselLayoutManager.this;
            carouselLayoutManager2.getClass();
            int O = RecyclerView.m.O(view);
            return (int) (((float) carouselLayoutManager2.f5943x) - ((float) carouselLayoutManager2.Z0(O, carouselLayoutManager2.X0(O))));
        }

        public final int j(int i10, View view) {
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            if (carouselLayoutManager.C == null || carouselLayoutManager.c1()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager2 = CarouselLayoutManager.this;
            carouselLayoutManager2.getClass();
            int O = RecyclerView.m.O(view);
            return (int) (((float) carouselLayoutManager2.f5943x) - ((float) carouselLayoutManager2.Z0(O, carouselLayoutManager2.X0(O))));
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final View f5947a;

        /* renamed from: b  reason: collision with root package name */
        public final float f5948b;

        /* renamed from: c  reason: collision with root package name */
        public final float f5949c;

        /* renamed from: d  reason: collision with root package name */
        public final d f5950d;

        public b(View view, float f10, float f11, d dVar) {
            this.f5947a = view;
            this.f5948b = f10;
            this.f5949c = f11;
            this.f5950d = dVar;
        }
    }

    public static class c extends RecyclerView.l {

        /* renamed from: a  reason: collision with root package name */
        public final Paint f5951a;

        /* renamed from: b  reason: collision with root package name */
        public List<b.C0062b> f5952b = Collections.unmodifiableList(new ArrayList());

        public c() {
            Paint paint = new Paint();
            this.f5951a = paint;
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        public final void f(Canvas canvas, RecyclerView recyclerView) {
            this.f5951a.setStrokeWidth(recyclerView.getResources().getDimension(R$dimen.m3_carousel_debug_keyline_width));
            for (b.C0062b next : this.f5952b) {
                this.f5951a.setColor(n1.d.b(next.f5976c, -65281, -16776961));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).c1()) {
                    canvas.drawLine(next.f5975b, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).G.i(), next.f5975b, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).G.d(), this.f5951a);
                } else {
                    canvas.drawLine((float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).G.f(), next.f5975b, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).G.g(), next.f5975b, this.f5951a);
                }
            }
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final b.C0062b f5953a;

        /* renamed from: b  reason: collision with root package name */
        public final b.C0062b f5954b;

        public d(b.C0062b bVar, b.C0062b bVar2) {
            boolean z10;
            if (bVar.f5974a <= bVar2.f5974a) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.z(z10);
            this.f5953a = bVar;
            this.f5954b = bVar2;
        }
    }

    public CarouselLayoutManager() {
        h hVar = new h();
        this.A = new c();
        this.E = 0;
        this.H = new x7.c(this);
        this.J = -1;
        this.K = 0;
        this.B = hVar;
        i1();
        k1(0);
    }

    public static float Y0(float f10, d dVar) {
        b.C0062b bVar = dVar.f5953a;
        float f11 = bVar.f5977d;
        b.C0062b bVar2 = dVar.f5954b;
        return t7.b.a(f11, bVar2.f5977d, bVar.f5975b, bVar2.f5975b, f10);
    }

    public static d b1(float f10, List list, boolean z10) {
        float f11;
        float f12 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f13 = -3.4028235E38f;
        float f14 = Float.MAX_VALUE;
        float f15 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            b.C0062b bVar = (b.C0062b) list.get(i14);
            if (z10) {
                f11 = bVar.f5975b;
            } else {
                f11 = bVar.f5974a;
            }
            float abs = Math.abs(f11 - f10);
            if (f11 <= f10 && abs <= f12) {
                i10 = i14;
                f12 = abs;
            }
            if (f11 > f10 && abs <= f14) {
                i12 = i14;
                f14 = abs;
            }
            if (f11 <= f15) {
                i11 = i14;
                f15 = f11;
            }
            if (f11 > f13) {
                i13 = i14;
                f13 = f11;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((b.C0062b) list.get(i10), (b.C0062b) list.get(i12));
    }

    public final int B0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        if (c1()) {
            return j1(i10, sVar, wVar);
        }
        return 0;
    }

    public final RecyclerView.LayoutParams C() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final void C0(int i10) {
        this.J = i10;
        if (this.C != null) {
            this.f5943x = Z0(i10, X0(i10));
            this.E = g0.G(i10, 0, Math.max(0, L() - 1));
            m1(this.C);
            A0();
        }
    }

    public final int D0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        if (p()) {
            return j1(i10, sVar, wVar);
        }
        return 0;
    }

    public final void K(View view, Rect rect) {
        float f10;
        super.K(view, rect);
        float centerY = (float) rect.centerY();
        if (c1()) {
            centerY = (float) rect.centerX();
        }
        float Y0 = Y0(centerY, b1(centerY, this.D.f5962b, true));
        float f11 = 0.0f;
        if (c1()) {
            f10 = (((float) rect.width()) - Y0) / 2.0f;
        } else {
            f10 = 0.0f;
        }
        if (!c1()) {
            f11 = (((float) rect.height()) - Y0) / 2.0f;
        }
        rect.set((int) (((float) rect.left) + f10), (int) (((float) rect.top) + f11), (int) (((float) rect.right) - f10), (int) (((float) rect.bottom) - f11));
    }

    public final void M0(RecyclerView recyclerView, RecyclerView.w wVar, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.f3084a = i10;
        N0(aVar);
    }

    public final void P0(View view, int i10, b bVar) {
        float f10 = this.D.f5961a / 2.0f;
        l(view, i10, false);
        float f11 = bVar.f5949c;
        this.G.j(view, (int) (f11 - f10), (int) (f11 + f10));
        l1(view, bVar.f5948b, bVar.f5950d);
    }

    public final float Q0(float f10, float f11) {
        if (d1()) {
            return f10 - f11;
        }
        return f10 + f11;
    }

    public final void R0(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        float U0 = U0(i10);
        while (i10 < wVar.b()) {
            b g12 = g1(sVar, U0, i10);
            if (!e1(g12.f5949c, g12.f5950d)) {
                U0 = Q0(U0, this.D.f5961a);
                if (!f1(g12.f5949c, g12.f5950d)) {
                    P0(g12.f5947a, -1, g12);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void S0(int i10, RecyclerView.s sVar) {
        float U0 = U0(i10);
        while (i10 >= 0) {
            b g12 = g1(sVar, U0, i10);
            if (!f1(g12.f5949c, g12.f5950d)) {
                float f10 = this.D.f5961a;
                if (d1()) {
                    U0 += f10;
                } else {
                    U0 -= f10;
                }
                if (!e1(g12.f5949c, g12.f5950d)) {
                    P0(g12.f5947a, 0, g12);
                }
                i10--;
            } else {
                return;
            }
        }
    }

    public final float T0(View view, float f10, d dVar) {
        b.C0062b bVar = dVar.f5953a;
        float f11 = bVar.f5975b;
        b.C0062b bVar2 = dVar.f5954b;
        float a10 = t7.b.a(f11, bVar2.f5975b, bVar.f5974a, bVar2.f5974a, f10);
        if (dVar.f5954b != this.D.b() && dVar.f5953a != this.D.d()) {
            return a10;
        }
        float b10 = this.G.b((RecyclerView.LayoutParams) view.getLayoutParams()) / this.D.f5961a;
        b.C0062b bVar3 = dVar.f5954b;
        return a10 + (((1.0f - bVar3.f5976c) + b10) * (f10 - bVar3.f5974a));
    }

    public final float U0(int i10) {
        return Q0((float) (this.G.h() - this.f5943x), this.D.f5961a * ((float) i10));
    }

    public final void V0(RecyclerView.s sVar, RecyclerView.w wVar) {
        int i10;
        int i11;
        while (H() > 0) {
            View G2 = G(0);
            Rect rect = new Rect();
            super.K(G2, rect);
            if (c1()) {
                i11 = rect.centerX();
            } else {
                i11 = rect.centerY();
            }
            float f10 = (float) i11;
            if (!f1(f10, b1(f10, this.D.f5962b, true))) {
                break;
            }
            y0(G2, sVar);
        }
        while (H() - 1 >= 0) {
            View G3 = G(H() - 1);
            Rect rect2 = new Rect();
            super.K(G3, rect2);
            if (c1()) {
                i10 = rect2.centerX();
            } else {
                i10 = rect2.centerY();
            }
            float f11 = (float) i10;
            if (!e1(f11, b1(f11, this.D.f5962b, true))) {
                break;
            }
            y0(G3, sVar);
        }
        if (H() == 0) {
            S0(this.E - 1, sVar);
            R0(this.E, sVar, wVar);
            return;
        }
        int O = RecyclerView.m.O(G(0));
        int O2 = RecyclerView.m.O(G(H() - 1));
        S0(O - 1, sVar);
        R0(O2 + 1, sVar, wVar);
    }

    public final int W0() {
        if (c1()) {
            return this.f3060v;
        }
        return this.f3061w;
    }

    public final void X(View view, int i10, int i11) {
        float f10;
        float f11;
        if (view instanceof g) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            Rect rect = new Rect();
            n(view, rect);
            int i12 = rect.left + rect.right + 0;
            int i13 = rect.top + rect.bottom + 0;
            c cVar = this.C;
            if (cVar == null || this.G.f17084a != 0) {
                f10 = (float) layoutParams.width;
            } else {
                f10 = cVar.f5980a.f5961a;
            }
            if (cVar == null || this.G.f17084a != 1) {
                f11 = (float) layoutParams.height;
            } else {
                f11 = cVar.f5980a.f5961a;
            }
            view.measure(RecyclerView.m.I(this.f3060v, this.f3058t, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin + i12, (int) f10, c1()), RecyclerView.m.I(this.f3061w, this.f3059u, getPaddingBottom() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + i13, (int) f11, p()));
            return;
        }
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    public final b X0(int i10) {
        b bVar;
        HashMap hashMap = this.F;
        if (hashMap == null || (bVar = (b) hashMap.get(Integer.valueOf(g0.G(i10, 0, Math.max(0, L() - 1))))) == null) {
            return this.C.f5980a;
        }
        return bVar;
    }

    public final int Z0(int i10, b bVar) {
        if (d1()) {
            float f10 = bVar.f5961a;
            return (int) (((((float) W0()) - bVar.c().f5974a) - (((float) i10) * f10)) - (f10 / 2.0f));
        }
        return (int) ((bVar.f5961a / 2.0f) + ((((float) i10) * bVar.f5961a) - bVar.a().f5974a));
    }

    public final PointF a(int i10) {
        if (this.C == null) {
            return null;
        }
        int Z0 = Z0(i10, X0(i10)) - this.f5943x;
        if (c1()) {
            return new PointF((float) Z0, 0.0f);
        }
        return new PointF(0.0f, (float) Z0);
    }

    public final int a1(int i10, b bVar) {
        int i11;
        int i12 = Integer.MAX_VALUE;
        for (b.C0062b next : bVar.f5962b.subList(bVar.f5963c, bVar.f5964d + 1)) {
            float f10 = bVar.f5961a;
            float f11 = (f10 / 2.0f) + (((float) i10) * f10);
            if (d1()) {
                i11 = (int) ((((float) W0()) - next.f5974a) - f11);
            } else {
                i11 = (int) (f11 - next.f5974a);
            }
            int i13 = i11 - this.f5943x;
            if (Math.abs(i12) > Math.abs(i13)) {
                i12 = i13;
            }
        }
        return i12;
    }

    public final void b0(RecyclerView recyclerView) {
        i1();
        recyclerView.addOnLayoutChangeListener(this.H);
    }

    public final void c0(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.H);
    }

    public final boolean c1() {
        if (this.G.f17084a == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r9 != 1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        if (d1() != false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r9 == 1) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        if (d1() != false) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0046  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View d0(android.view.View r6, int r7, androidx.recyclerview.widget.RecyclerView.s r8, androidx.recyclerview.widget.RecyclerView.w r9) {
        /*
            r5 = this;
            int r9 = r5.H()
            r0 = 0
            if (r9 != 0) goto L_0x0008
            return r0
        L_0x0008:
            x7.f r9 = r5.G
            int r9 = r9.f17084a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = -1
            if (r7 == r2) goto L_0x0042
            r4 = 2
            if (r7 == r4) goto L_0x0040
            r4 = 17
            if (r7 == r4) goto L_0x0035
            r4 = 33
            if (r7 == r4) goto L_0x0032
            r4 = 66
            if (r7 == r4) goto L_0x0029
            r4 = 130(0x82, float:1.82E-43)
            if (r7 == r4) goto L_0x0026
            goto L_0x003e
        L_0x0026:
            if (r9 != r2) goto L_0x003e
            goto L_0x0040
        L_0x0029:
            if (r9 != 0) goto L_0x003e
            boolean r7 = r5.d1()
            if (r7 == 0) goto L_0x0040
            goto L_0x0042
        L_0x0032:
            if (r9 != r2) goto L_0x003e
            goto L_0x0042
        L_0x0035:
            if (r9 != 0) goto L_0x003e
            boolean r7 = r5.d1()
            if (r7 == 0) goto L_0x0042
            goto L_0x0040
        L_0x003e:
            r7 = r1
            goto L_0x0043
        L_0x0040:
            r7 = r2
            goto L_0x0043
        L_0x0042:
            r7 = r3
        L_0x0043:
            if (r7 != r1) goto L_0x0046
            return r0
        L_0x0046:
            r9 = 0
            if (r7 != r3) goto L_0x0080
            int r6 = androidx.recyclerview.widget.RecyclerView.m.O(r6)
            if (r6 != 0) goto L_0x0050
            return r0
        L_0x0050:
            android.view.View r6 = r5.G(r9)
            int r6 = androidx.recyclerview.widget.RecyclerView.m.O(r6)
            int r6 = r6 - r2
            if (r6 < 0) goto L_0x006f
            int r7 = r5.L()
            if (r6 < r7) goto L_0x0062
            goto L_0x006f
        L_0x0062:
            float r7 = r5.U0(r6)
            com.google.android.material.carousel.CarouselLayoutManager$b r6 = r5.g1(r8, r7, r6)
            android.view.View r7 = r6.f5947a
            r5.P0(r7, r9, r6)
        L_0x006f:
            boolean r6 = r5.d1()
            if (r6 == 0) goto L_0x007b
            int r6 = r5.H()
            int r9 = r6 + -1
        L_0x007b:
            android.view.View r6 = r5.G(r9)
            goto L_0x00c1
        L_0x0080:
            int r6 = androidx.recyclerview.widget.RecyclerView.m.O(r6)
            int r7 = r5.L()
            int r7 = r7 - r2
            if (r6 != r7) goto L_0x008c
            return r0
        L_0x008c:
            int r6 = r5.H()
            int r6 = r6 - r2
            android.view.View r6 = r5.G(r6)
            int r6 = androidx.recyclerview.widget.RecyclerView.m.O(r6)
            int r6 = r6 + r2
            if (r6 < 0) goto L_0x00b0
            int r7 = r5.L()
            if (r6 < r7) goto L_0x00a3
            goto L_0x00b0
        L_0x00a3:
            float r7 = r5.U0(r6)
            com.google.android.material.carousel.CarouselLayoutManager$b r6 = r5.g1(r8, r7, r6)
            android.view.View r7 = r6.f5947a
            r5.P0(r7, r3, r6)
        L_0x00b0:
            boolean r6 = r5.d1()
            if (r6 == 0) goto L_0x00b7
            goto L_0x00bd
        L_0x00b7:
            int r6 = r5.H()
            int r9 = r6 + -1
        L_0x00bd:
            android.view.View r6 = r5.G(r9)
        L_0x00c1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.d0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$w):android.view.View");
    }

    public final boolean d1() {
        if (!c1() || M() != 1) {
            return false;
        }
        return true;
    }

    public final void e0(AccessibilityEvent accessibilityEvent) {
        super.e0(accessibilityEvent);
        if (H() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.m.O(G(0)));
            accessibilityEvent.setToIndex(RecyclerView.m.O(G(H() - 1)));
        }
    }

    public final boolean e1(float f10, d dVar) {
        float f11;
        float Y0 = Y0(f10, dVar) / 2.0f;
        if (d1()) {
            f11 = f10 + Y0;
        } else {
            f11 = f10 - Y0;
        }
        if (d1()) {
            if (f11 < 0.0f) {
                return true;
            }
        } else if (f11 > ((float) W0())) {
            return true;
        }
        return false;
    }

    public final boolean f1(float f10, d dVar) {
        float Q0 = Q0(f10, Y0(f10, dVar) / 2.0f);
        if (!d1() ? Q0 >= 0.0f : Q0 <= ((float) W0())) {
            return false;
        }
        return true;
    }

    public final b g1(RecyclerView.s sVar, float f10, int i10) {
        View d10 = sVar.d(i10);
        X(d10, 0, 0);
        float Q0 = Q0(f10, this.D.f5961a / 2.0f);
        d b12 = b1(Q0, this.D.f5962b, false);
        return new b(d10, Q0, T0(d10, Q0, b12), b12);
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01fa  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0233  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h1(androidx.recyclerview.widget.RecyclerView.s r25) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = r25
            android.view.View r2 = r2.d(r1)
            r0.X(r2, r1, r1)
            androidx.fragment.app.o r3 = r0.B
            com.google.android.material.carousel.b r2 = r3.C(r0, r2)
            boolean r3 = r24.d1()
            r4 = 1
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x006c
            int r3 = r24.W0()
            float r3 = (float) r3
            com.google.android.material.carousel.b$a r12 = new com.google.android.material.carousel.b$a
            float r6 = r2.f5961a
            r12.<init>(r6, r3)
            com.google.android.material.carousel.b$b r6 = r2.d()
            float r6 = r6.f5975b
            float r3 = r3 - r6
            com.google.android.material.carousel.b$b r6 = r2.d()
            float r6 = r6.f5977d
            float r6 = r6 / r5
            float r3 = r3 - r6
            java.util.List<com.google.android.material.carousel.b$b> r6 = r2.f5962b
            int r6 = r6.size()
            int r6 = r6 - r4
            r13 = r6
        L_0x003e:
            if (r13 < 0) goto L_0x0068
            java.util.List<com.google.android.material.carousel.b$b> r6 = r2.f5962b
            java.lang.Object r6 = r6.get(r13)
            r14 = r6
            com.google.android.material.carousel.b$b r14 = (com.google.android.material.carousel.b.C0062b) r14
            float r9 = r14.f5977d
            float r6 = r9 / r5
            float r7 = r6 + r3
            int r6 = r2.f5963c
            if (r13 < r6) goto L_0x0059
            int r6 = r2.f5964d
            if (r13 > r6) goto L_0x0059
            r10 = r4
            goto L_0x005a
        L_0x0059:
            r10 = r1
        L_0x005a:
            float r8 = r14.f5976c
            boolean r11 = r14.f5978e
            r6 = r12
            r6.a(r7, r8, r9, r10, r11)
            float r6 = r14.f5977d
            float r3 = r3 + r6
            int r13 = r13 + -1
            goto L_0x003e
        L_0x0068:
            com.google.android.material.carousel.b r2 = r12.d()
        L_0x006c:
            com.google.android.material.carousel.c r3 = new com.google.android.material.carousel.c
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.add(r2)
            r6 = r1
        L_0x0077:
            java.util.List<com.google.android.material.carousel.b$b> r7 = r2.f5962b
            int r7 = r7.size()
            r14 = -1
            if (r6 >= r7) goto L_0x0090
            java.util.List<com.google.android.material.carousel.b$b> r7 = r2.f5962b
            java.lang.Object r7 = r7.get(r6)
            com.google.android.material.carousel.b$b r7 = (com.google.android.material.carousel.b.C0062b) r7
            boolean r7 = r7.f5978e
            if (r7 != 0) goto L_0x008d
            goto L_0x0091
        L_0x008d:
            int r6 = r6 + 1
            goto L_0x0077
        L_0x0090:
            r6 = r14
        L_0x0091:
            com.google.android.material.carousel.b$b r7 = r2.a()
            float r7 = r7.f5975b
            com.google.android.material.carousel.b$b r8 = r2.a()
            float r8 = r8.f5977d
            float r8 = r8 / r5
            float r7 = r7 - r8
            r22 = 0
            int r7 = (r7 > r22 ? 1 : (r7 == r22 ? 0 : -1))
            r23 = 0
            if (r7 < 0) goto L_0x00ca
            com.google.android.material.carousel.b$b r7 = r2.a()
            r8 = r1
        L_0x00ac:
            java.util.List<com.google.android.material.carousel.b$b> r9 = r2.f5962b
            int r9 = r9.size()
            if (r8 >= r9) goto L_0x00c4
            java.util.List<com.google.android.material.carousel.b$b> r9 = r2.f5962b
            java.lang.Object r9 = r9.get(r8)
            com.google.android.material.carousel.b$b r9 = (com.google.android.material.carousel.b.C0062b) r9
            boolean r10 = r9.f5978e
            if (r10 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            int r8 = r8 + 1
            goto L_0x00ac
        L_0x00c4:
            r9 = r23
        L_0x00c6:
            if (r7 != r9) goto L_0x00ca
            r7 = r4
            goto L_0x00cb
        L_0x00ca:
            r7 = r1
        L_0x00cb:
            if (r7 != 0) goto L_0x018a
            if (r6 != r14) goto L_0x00d1
            goto L_0x018a
        L_0x00d1:
            int r7 = r2.f5963c
            int r7 = r7 - r6
            boolean r8 = r24.c1()
            if (r8 == 0) goto L_0x00dd
            int r8 = r0.f3060v
            goto L_0x00df
        L_0x00dd:
            int r8 = r0.f3061w
        L_0x00df:
            float r12 = (float) r8
            com.google.android.material.carousel.b$b r8 = r2.b()
            float r8 = r8.f5975b
            com.google.android.material.carousel.b$b r9 = r2.b()
            float r9 = r9.f5977d
            float r9 = r9 / r5
            float r8 = r8 - r9
            if (r7 > 0) goto L_0x0112
            com.google.android.material.carousel.b$b r9 = r2.a()
            float r9 = r9.f5979f
            int r9 = (r9 > r22 ? 1 : (r9 == r22 ? 0 : -1))
            if (r9 <= 0) goto L_0x0112
            com.google.android.material.carousel.b$b r6 = r2.a()
            float r6 = r6.f5979f
            float r9 = r8 + r6
            int r10 = r2.f5963c
            int r11 = r2.f5964d
            r7 = 0
            r8 = 0
            r6 = r2
            com.google.android.material.carousel.b r6 = com.google.android.material.carousel.c.c(r6, r7, r8, r9, r10, r11, r12)
            r13.add(r6)
            goto L_0x018a
        L_0x0112:
            r9 = r1
            r10 = r22
        L_0x0115:
            if (r9 >= r7) goto L_0x018a
            int r11 = r13.size()
            int r11 = r11 + r14
            java.lang.Object r11 = r13.get(r11)
            r15 = r11
            com.google.android.material.carousel.b r15 = (com.google.android.material.carousel.b) r15
            int r11 = r6 + r9
            java.util.List<com.google.android.material.carousel.b$b> r1 = r2.f5962b
            int r1 = r1.size()
            int r1 = r1 + r14
            java.util.List<com.google.android.material.carousel.b$b> r4 = r2.f5962b
            java.lang.Object r4 = r4.get(r11)
            com.google.android.material.carousel.b$b r4 = (com.google.android.material.carousel.b.C0062b) r4
            float r4 = r4.f5979f
            float r10 = r10 + r4
            int r11 = r11 + r14
            if (r11 < 0) goto L_0x016c
            java.util.List<com.google.android.material.carousel.b$b> r1 = r2.f5962b
            java.lang.Object r1 = r1.get(r11)
            com.google.android.material.carousel.b$b r1 = (com.google.android.material.carousel.b.C0062b) r1
            float r1 = r1.f5976c
            int r4 = r15.f5964d
        L_0x0146:
            java.util.List<com.google.android.material.carousel.b$b> r11 = r15.f5962b
            int r11 = r11.size()
            if (r4 >= r11) goto L_0x0160
            java.util.List<com.google.android.material.carousel.b$b> r11 = r15.f5962b
            java.lang.Object r11 = r11.get(r4)
            com.google.android.material.carousel.b$b r11 = (com.google.android.material.carousel.b.C0062b) r11
            float r11 = r11.f5976c
            int r11 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r11 != 0) goto L_0x015d
            goto L_0x0168
        L_0x015d:
            int r4 = r4 + 1
            goto L_0x0146
        L_0x0160:
            java.util.List<com.google.android.material.carousel.b$b> r1 = r15.f5962b
            int r1 = r1.size()
            int r4 = r1 + -1
        L_0x0168:
            int r4 = r4 + r14
            r17 = r4
            goto L_0x016e
        L_0x016c:
            r17 = r1
        L_0x016e:
            int r1 = r2.f5963c
            int r1 = r1 - r9
            int r19 = r1 + -1
            int r1 = r2.f5964d
            int r1 = r1 - r9
            int r20 = r1 + -1
            float r18 = r8 + r10
            r16 = r6
            r21 = r12
            com.google.android.material.carousel.b r1 = com.google.android.material.carousel.c.c(r15, r16, r17, r18, r19, r20, r21)
            r13.add(r1)
            int r9 = r9 + 1
            r1 = 0
            r4 = 1
            goto L_0x0115
        L_0x018a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r2)
            java.util.List<com.google.android.material.carousel.b$b> r4 = r2.f5962b
            int r4 = r4.size()
            int r4 = r4 + r14
        L_0x0199:
            if (r4 < 0) goto L_0x01ab
            java.util.List<com.google.android.material.carousel.b$b> r6 = r2.f5962b
            java.lang.Object r6 = r6.get(r4)
            com.google.android.material.carousel.b$b r6 = (com.google.android.material.carousel.b.C0062b) r6
            boolean r6 = r6.f5978e
            if (r6 != 0) goto L_0x01a8
            goto L_0x01ac
        L_0x01a8:
            int r4 = r4 + -1
            goto L_0x0199
        L_0x01ab:
            r4 = r14
        L_0x01ac:
            int r6 = r0.f3061w
            boolean r7 = r24.c1()
            if (r7 == 0) goto L_0x01b6
            int r6 = r0.f3060v
        L_0x01b6:
            com.google.android.material.carousel.b$b r7 = r2.c()
            float r7 = r7.f5975b
            com.google.android.material.carousel.b$b r8 = r2.c()
            float r8 = r8.f5977d
            float r8 = r8 / r5
            float r8 = r8 + r7
            float r6 = (float) r6
            int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r6 > 0) goto L_0x01e9
            com.google.android.material.carousel.b$b r6 = r2.c()
            java.util.List<com.google.android.material.carousel.b$b> r7 = r2.f5962b
            int r7 = r7.size()
        L_0x01d3:
            int r7 = r7 + r14
            if (r7 < 0) goto L_0x01e3
            java.util.List<com.google.android.material.carousel.b$b> r8 = r2.f5962b
            java.lang.Object r8 = r8.get(r7)
            com.google.android.material.carousel.b$b r8 = (com.google.android.material.carousel.b.C0062b) r8
            boolean r9 = r8.f5978e
            if (r9 != 0) goto L_0x01d3
            goto L_0x01e5
        L_0x01e3:
            r8 = r23
        L_0x01e5:
            if (r6 != r8) goto L_0x01e9
            r6 = 1
            goto L_0x01ea
        L_0x01e9:
            r6 = 0
        L_0x01ea:
            if (r6 != 0) goto L_0x02a0
            if (r4 != r14) goto L_0x01f0
            goto L_0x02a0
        L_0x01f0:
            int r6 = r2.f5964d
            int r15 = r4 - r6
            boolean r6 = r24.c1()
            if (r6 == 0) goto L_0x01fd
            int r6 = r0.f3060v
            goto L_0x01ff
        L_0x01fd:
            int r6 = r0.f3061w
        L_0x01ff:
            float r12 = (float) r6
            com.google.android.material.carousel.b$b r6 = r2.b()
            float r6 = r6.f5975b
            com.google.android.material.carousel.b$b r7 = r2.b()
            float r7 = r7.f5977d
            float r7 = r7 / r5
            float r5 = r6 - r7
            if (r15 > 0) goto L_0x0233
            com.google.android.material.carousel.b$b r6 = r2.c()
            float r6 = r6.f5979f
            int r6 = (r6 > r22 ? 1 : (r6 == r22 ? 0 : -1))
            if (r6 <= 0) goto L_0x0233
            com.google.android.material.carousel.b$b r4 = r2.c()
            float r4 = r4.f5979f
            float r9 = r5 - r4
            int r10 = r2.f5963c
            int r11 = r2.f5964d
            r7 = 0
            r8 = 0
            r6 = r2
            com.google.android.material.carousel.b r4 = com.google.android.material.carousel.c.c(r6, r7, r8, r9, r10, r11, r12)
            r1.add(r4)
            goto L_0x02a0
        L_0x0233:
            r11 = 0
        L_0x0234:
            if (r11 >= r15) goto L_0x02a0
            int r6 = r1.size()
            int r6 = r6 + r14
            java.lang.Object r6 = r1.get(r6)
            com.google.android.material.carousel.b r6 = (com.google.android.material.carousel.b) r6
            int r7 = r4 - r11
            java.util.List<com.google.android.material.carousel.b$b> r8 = r2.f5962b
            java.lang.Object r8 = r8.get(r7)
            com.google.android.material.carousel.b$b r8 = (com.google.android.material.carousel.b.C0062b) r8
            float r8 = r8.f5979f
            float r22 = r22 + r8
            r8 = 1
            int r7 = r7 + r8
            java.util.List<com.google.android.material.carousel.b$b> r8 = r2.f5962b
            int r8 = r8.size()
            if (r7 >= r8) goto L_0x0280
            java.util.List<com.google.android.material.carousel.b$b> r8 = r2.f5962b
            java.lang.Object r7 = r8.get(r7)
            com.google.android.material.carousel.b$b r7 = (com.google.android.material.carousel.b.C0062b) r7
            float r7 = r7.f5976c
            int r8 = r6.f5963c
            int r8 = r8 + r14
        L_0x0266:
            if (r8 < 0) goto L_0x027a
            java.util.List<com.google.android.material.carousel.b$b> r9 = r6.f5962b
            java.lang.Object r9 = r9.get(r8)
            com.google.android.material.carousel.b$b r9 = (com.google.android.material.carousel.b.C0062b) r9
            float r9 = r9.f5976c
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 != 0) goto L_0x0277
            goto L_0x027b
        L_0x0277:
            int r8 = r8 + -1
            goto L_0x0266
        L_0x027a:
            r8 = 0
        L_0x027b:
            r16 = 1
            int r8 = r8 + 1
            goto L_0x0283
        L_0x0280:
            r16 = 1
            r8 = 0
        L_0x0283:
            int r7 = r2.f5963c
            int r7 = r7 + r11
            int r10 = r7 + 1
            int r7 = r2.f5964d
            int r7 = r7 + r11
            int r17 = r7 + 1
            float r9 = r5 - r22
            r7 = r4
            r18 = r11
            r11 = r17
            r17 = r12
            com.google.android.material.carousel.b r6 = com.google.android.material.carousel.c.c(r6, r7, r8, r9, r10, r11, r12)
            r1.add(r6)
            int r11 = r18 + 1
            goto L_0x0234
        L_0x02a0:
            r3.<init>(r2, r13, r1)
            r0.C = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.h1(androidx.recyclerview.widget.RecyclerView$s):void");
    }

    public final void i0(int i10, int i11) {
        int L = L();
        int i12 = this.I;
        if (L != i12 && this.C != null) {
            if (this.B.H(this, i12)) {
                i1();
            }
            this.I = L;
        }
    }

    public final void i1() {
        this.C = null;
        A0();
    }

    public final int j1(int i10, RecyclerView.s sVar, RecyclerView.w wVar) {
        float f10;
        if (H() == 0 || i10 == 0) {
            return 0;
        }
        if (this.C == null) {
            h1(sVar);
        }
        int i11 = this.f5943x;
        int i12 = this.f5944y;
        int i13 = this.f5945z;
        int i14 = i11 + i10;
        if (i14 < i12) {
            i10 = i12 - i11;
        } else if (i14 > i13) {
            i10 = i13 - i11;
        }
        this.f5943x = i11 + i10;
        m1(this.C);
        float f11 = this.D.f5961a / 2.0f;
        float U0 = U0(RecyclerView.m.O(G(0)));
        Rect rect = new Rect();
        if (d1()) {
            f10 = this.D.c().f5975b;
        } else {
            f10 = this.D.a().f5975b;
        }
        float f12 = Float.MAX_VALUE;
        for (int i15 = 0; i15 < H(); i15++) {
            View G2 = G(i15);
            float Q0 = Q0(U0, f11);
            d b12 = b1(Q0, this.D.f5962b, false);
            float T0 = T0(G2, Q0, b12);
            super.K(G2, rect);
            l1(G2, Q0, b12);
            this.G.l(f11, T0, rect, G2);
            float abs = Math.abs(f10 - T0);
            if (abs < f12) {
                this.J = RecyclerView.m.O(G2);
                f12 = abs;
            }
            U0 = Q0(U0, this.D.f5961a);
        }
        V0(sVar, wVar);
        return i10;
    }

    public final void k1(int i10) {
        f fVar;
        if (i10 == 0 || i10 == 1) {
            m((String) null);
            f fVar2 = this.G;
            if (fVar2 == null || i10 != fVar2.f17084a) {
                if (i10 == 0) {
                    fVar = new e(this);
                } else if (i10 == 1) {
                    fVar = new x7.d(this);
                } else {
                    throw new IllegalArgumentException("invalid orientation");
                }
                this.G = fVar;
                i1();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.m("invalid orientation:", i10));
    }

    public final void l0(int i10, int i11) {
        int L = L();
        int i12 = this.I;
        if (L != i12 && this.C != null) {
            if (this.B.H(this, i12)) {
                i1();
            }
            this.I = L;
        }
    }

    public final void l1(View view, float f10, d dVar) {
        if (view instanceof g) {
            b.C0062b bVar = dVar.f5953a;
            float f11 = bVar.f5976c;
            b.C0062b bVar2 = dVar.f5954b;
            float a10 = t7.b.a(f11, bVar2.f5976c, bVar.f5974a, bVar2.f5974a, f10);
            float height = (float) view.getHeight();
            float width = (float) view.getWidth();
            float a11 = t7.b.a(0.0f, width / 2.0f, 0.0f, 1.0f, a10);
            RectF c10 = this.G.c(height, width, t7.b.a(0.0f, height / 2.0f, 0.0f, 1.0f, a10), a11);
            float T0 = T0(view, f10, dVar);
            RectF rectF = new RectF(T0 - (c10.width() / 2.0f), T0 - (c10.height() / 2.0f), (c10.width() / 2.0f) + T0, (c10.height() / 2.0f) + T0);
            RectF rectF2 = new RectF((float) this.G.f(), (float) this.G.i(), (float) this.G.g(), (float) this.G.d());
            this.B.getClass();
            this.G.a(c10, rectF, rectF2);
            this.G.k(c10, rectF, rectF2);
            ((g) view).setMaskRectF(c10);
        }
    }

    public final void m1(c cVar) {
        b bVar;
        int i10 = this.f5945z;
        int i11 = this.f5944y;
        if (i10 <= i11) {
            if (d1()) {
                List<b> list = cVar.f5982c;
                bVar = list.get(list.size() - 1);
            } else {
                List<b> list2 = cVar.f5981b;
                bVar = list2.get(list2.size() - 1);
            }
            this.D = bVar;
        } else {
            this.D = cVar.a((float) this.f5943x, (float) i11, (float) i10);
        }
        c cVar2 = this.A;
        List<b.C0062b> list3 = this.D.f5962b;
        cVar2.getClass();
        cVar2.f5952b = Collections.unmodifiableList(list3);
    }

    public final boolean o() {
        return c1();
    }

    public final void o0(RecyclerView.s sVar, RecyclerView.w wVar) {
        boolean z10;
        b bVar;
        b.C0062b bVar2;
        int i10;
        float f10;
        b bVar3;
        b.C0062b bVar4;
        float f11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        if (wVar.b() <= 0 || ((float) W0()) <= 0.0f) {
            w0(sVar);
            this.E = 0;
            return;
        }
        boolean d12 = d1();
        if (this.C == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            h1(sVar);
        }
        c cVar = this.C;
        boolean d13 = d1();
        int i18 = -1;
        if (d13) {
            List<b> list = cVar.f5982c;
            bVar = list.get(list.size() - 1);
        } else {
            List<b> list2 = cVar.f5981b;
            bVar = list2.get(list2.size() - 1);
        }
        if (d13) {
            bVar2 = bVar.c();
        } else {
            bVar2 = bVar.a();
        }
        int paddingStart = getPaddingStart();
        if (d13) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        float f12 = (float) (paddingStart * i10);
        float f13 = bVar2.f5974a;
        float f14 = bVar.f5961a / 2.0f;
        if (d1()) {
            f10 = f13 + f14;
        } else {
            f10 = f13 - f14;
        }
        int h10 = (int) ((f12 + ((float) this.G.h())) - f10);
        c cVar2 = this.C;
        boolean d14 = d1();
        if (d14) {
            List<b> list3 = cVar2.f5981b;
            bVar3 = list3.get(list3.size() - 1);
        } else {
            List<b> list4 = cVar2.f5982c;
            bVar3 = list4.get(list4.size() - 1);
        }
        if (d14) {
            bVar4 = bVar3.a();
        } else {
            bVar4 = bVar3.c();
        }
        float b10 = (((float) (wVar.b() - 1)) * bVar3.f5961a) + ((float) getPaddingEnd());
        if (d14) {
            f11 = -1.0f;
        } else {
            f11 = 1.0f;
        }
        int h11 = (int) (((b10 * f11) - (bVar4.f5974a - ((float) this.G.h()))) + (((float) this.G.e()) - bVar4.f5974a));
        if (d14) {
            i11 = Math.min(0, h11);
        } else {
            i11 = Math.max(0, h11);
        }
        if (d12) {
            i12 = i11;
        } else {
            i12 = h10;
        }
        this.f5944y = i12;
        if (d12) {
            i11 = h10;
        }
        this.f5945z = i11;
        if (z10) {
            this.f5943x = h10;
            c cVar3 = this.C;
            int L = L();
            int i19 = this.f5944y;
            int i20 = this.f5945z;
            boolean d15 = d1();
            float f15 = cVar3.f5980a.f5961a;
            HashMap hashMap = new HashMap();
            int i21 = 0;
            int i22 = 0;
            while (i21 < L) {
                if (d15) {
                    i16 = (L - i21) - 1;
                } else {
                    i16 = i21;
                }
                float f16 = ((float) i16) * f15;
                if (d15) {
                    i17 = i18;
                } else {
                    i17 = 1;
                }
                if (f16 * ((float) i17) > ((float) i20) - cVar3.f5986g || i21 >= L - cVar3.f5982c.size()) {
                    Integer valueOf = Integer.valueOf(i16);
                    List<b> list5 = cVar3.f5982c;
                    hashMap.put(valueOf, list5.get(g0.G(i22, 0, list5.size() - 1)));
                    i22++;
                }
                i21++;
                i18 = -1;
            }
            int i23 = 0;
            for (int i24 = L - 1; i24 >= 0; i24--) {
                if (d15) {
                    i14 = (L - i24) - 1;
                } else {
                    i14 = i24;
                }
                float f17 = ((float) i14) * f15;
                if (d15) {
                    i15 = -1;
                } else {
                    i15 = 1;
                }
                if (f17 * ((float) i15) < ((float) i19) + cVar3.f5985f || i24 < cVar3.f5981b.size()) {
                    Integer valueOf2 = Integer.valueOf(i14);
                    List<b> list6 = cVar3.f5981b;
                    hashMap.put(valueOf2, list6.get(g0.G(i23, 0, list6.size() - 1)));
                    i23++;
                }
            }
            this.F = hashMap;
            int i25 = this.J;
            if (i25 != -1) {
                this.f5943x = Z0(i25, X0(i25));
            }
        }
        int i26 = this.f5943x;
        int i27 = this.f5944y;
        int i28 = this.f5945z;
        int i29 = i26 + 0;
        if (i29 < i27) {
            i13 = i27 - i26;
        } else if (i29 > i28) {
            i13 = i28 - i26;
        } else {
            i13 = 0;
        }
        this.f5943x = i13 + i26;
        this.E = g0.G(this.E, 0, wVar.b());
        m1(this.C);
        A(sVar);
        V0(sVar, wVar);
        this.I = L();
    }

    public final boolean p() {
        return !c1();
    }

    public final void p0(RecyclerView.w wVar) {
        if (H() == 0) {
            this.E = 0;
        } else {
            this.E = RecyclerView.m.O(G(0));
        }
    }

    public final int u(RecyclerView.w wVar) {
        if (H() == 0 || this.C == null || L() <= 1) {
            return 0;
        }
        return (int) (((float) this.f3060v) * (this.C.f5980a.f5961a / ((float) (this.f5945z - this.f5944y))));
    }

    public final int v(RecyclerView.w wVar) {
        return this.f5943x;
    }

    public final int w(RecyclerView.w wVar) {
        return this.f5945z - this.f5944y;
    }

    public final int x(RecyclerView.w wVar) {
        if (H() == 0 || this.C == null || L() <= 1) {
            return 0;
        }
        return (int) (((float) this.f3061w) * (this.C.f5980a.f5961a / ((float) (this.f5945z - this.f5944y))));
    }

    public final int y(RecyclerView.w wVar) {
        return this.f5943x;
    }

    public final int z(RecyclerView.w wVar) {
        return this.f5945z - this.f5944y;
    }

    public final boolean z0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int a12;
        if (this.C == null || (a12 = a1(RecyclerView.m.O(view), X0(RecyclerView.m.O(view)))) == 0) {
            return false;
        }
        int i10 = this.f5943x;
        int i11 = this.f5944y;
        int i12 = this.f5945z;
        int i13 = i10 + a12;
        if (i13 < i11) {
            a12 = i11 - i10;
        } else if (i13 > i12) {
            a12 = i12 - i10;
        }
        int a13 = a1(RecyclerView.m.O(view), this.C.a((float) (i10 + a12), (float) i11, (float) i12));
        if (c1()) {
            recyclerView.scrollBy(a13, 0);
            return true;
        }
        recyclerView.scrollBy(0, a13);
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.A = new c();
        this.E = 0;
        this.H = new r0.e(this, 1);
        this.J = -1;
        this.K = 0;
        this.B = new h();
        i1();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Carousel);
            this.K = obtainStyledAttributes.getInt(R$styleable.Carousel_carousel_alignment, 0);
            i1();
            k1(obtainStyledAttributes.getInt(R$styleable.RecyclerView_android_orientation, 0));
            obtainStyledAttributes.recycle();
        }
    }
}
