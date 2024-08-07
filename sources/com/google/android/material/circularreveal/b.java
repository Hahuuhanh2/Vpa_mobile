package com.google.android.material.circularreveal;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.circularreveal.c;

/* compiled from: CircularRevealHelper */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final a f6062a;

    /* renamed from: b  reason: collision with root package name */
    public final View f6063b;

    /* renamed from: c  reason: collision with root package name */
    public final Paint f6064c;

    /* renamed from: d  reason: collision with root package name */
    public c.d f6065d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f6066e;

    /* compiled from: CircularRevealHelper */
    public interface a {
        void c(Canvas canvas);

        boolean d();
    }

    public b(a aVar) {
        this.f6062a = aVar;
        View view = (View) aVar;
        this.f6063b = view;
        view.setWillNotDraw(false);
        new Path();
        new Paint(7);
        Paint paint = new Paint(1);
        this.f6064c = paint;
        paint.setColor(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.Canvas r10) {
        /*
            r9 = this;
            com.google.android.material.circularreveal.c$d r0 = r9.f6065d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0017
            float r0 = r0.f6073c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0011
            r0 = r2
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r1
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0048
            com.google.android.material.circularreveal.b$a r0 = r9.f6062a
            r0.c(r10)
            android.graphics.Paint r0 = r9.f6064c
            int r0 = r0.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L_0x002e
            r0 = r2
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            if (r0 == 0) goto L_0x0074
            r4 = 0
            r5 = 0
            android.view.View r0 = r9.f6063b
            int r0 = r0.getWidth()
            float r6 = (float) r0
            android.view.View r0 = r9.f6063b
            int r0 = r0.getHeight()
            float r7 = (float) r0
            android.graphics.Paint r8 = r9.f6064c
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
            goto L_0x0074
        L_0x0048:
            com.google.android.material.circularreveal.b$a r0 = r9.f6062a
            r0.c(r10)
            android.graphics.Paint r0 = r9.f6064c
            int r0 = r0.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L_0x005b
            r0 = r2
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            if (r0 == 0) goto L_0x0074
            r4 = 0
            r5 = 0
            android.view.View r0 = r9.f6063b
            int r0 = r0.getWidth()
            float r6 = (float) r0
            android.view.View r0 = r9.f6063b
            int r0 = r0.getHeight()
            float r7 = (float) r0
            android.graphics.Paint r8 = r9.f6064c
            r3 = r10
            r3.drawRect(r4, r5, r6, r7, r8)
        L_0x0074:
            android.graphics.drawable.Drawable r0 = r9.f6066e
            if (r0 == 0) goto L_0x007d
            com.google.android.material.circularreveal.c$d r3 = r9.f6065d
            if (r3 == 0) goto L_0x007d
            r1 = r2
        L_0x007d:
            if (r1 == 0) goto L_0x00a8
            android.graphics.Rect r0 = r0.getBounds()
            com.google.android.material.circularreveal.c$d r1 = r9.f6065d
            float r1 = r1.f6071a
            int r2 = r0.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            com.google.android.material.circularreveal.c$d r2 = r9.f6065d
            float r2 = r2.f6072b
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r3
            float r2 = r2 - r0
            r10.translate(r1, r2)
            android.graphics.drawable.Drawable r0 = r9.f6066e
            r0.draw(r10)
            float r0 = -r1
            float r1 = -r2
            r10.translate(r0, r1)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.b.a(android.graphics.Canvas):void");
    }

    public final int b() {
        return this.f6064c.getColor();
    }

    public final c.d c() {
        boolean z10;
        c.d dVar = this.f6065d;
        if (dVar == null) {
            return null;
        }
        c.d dVar2 = new c.d(dVar);
        if (dVar2.f6073c == Float.MAX_VALUE) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            dVar2.f6073c = m9.b.t(dVar2.f6071a, dVar2.f6072b, (float) this.f6063b.getWidth(), (float) this.f6063b.getHeight());
        }
        return dVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r4 = this;
            com.google.android.material.circularreveal.b$a r0 = r4.f6062a
            boolean r0 = r0.d()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0024
            com.google.android.material.circularreveal.c$d r0 = r4.f6065d
            if (r0 == 0) goto L_0x001f
            float r0 = r0.f6073c
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0019
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = r1
            goto L_0x0020
        L_0x001f:
            r0 = r2
        L_0x0020:
            r0 = r0 ^ r2
            if (r0 != 0) goto L_0x0024
            r1 = r2
        L_0x0024:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.circularreveal.b.d():boolean");
    }

    public final void e(Drawable drawable) {
        this.f6066e = drawable;
        this.f6063b.invalidate();
    }

    public final void f(int i10) {
        this.f6064c.setColor(i10);
        this.f6063b.invalidate();
    }

    public final void g(c.d dVar) {
        boolean z10;
        if (dVar == null) {
            this.f6065d = null;
        } else {
            c.d dVar2 = this.f6065d;
            if (dVar2 == null) {
                this.f6065d = new c.d(dVar);
            } else {
                float f10 = dVar.f6071a;
                float f11 = dVar.f6072b;
                float f12 = dVar.f6073c;
                dVar2.f6071a = f10;
                dVar2.f6072b = f11;
                dVar2.f6073c = f12;
            }
            if (dVar.f6073c + 1.0E-4f >= m9.b.t(dVar.f6071a, dVar.f6072b, (float) this.f6063b.getWidth(), (float) this.f6063b.getHeight())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f6065d.f6073c = Float.MAX_VALUE;
            }
        }
        this.f6063b.invalidate();
    }
}
