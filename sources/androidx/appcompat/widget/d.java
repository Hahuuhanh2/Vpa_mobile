package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: AppCompatBackgroundHelper */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final View f1067a;

    /* renamed from: b  reason: collision with root package name */
    public final g f1068b;

    /* renamed from: c  reason: collision with root package name */
    public int f1069c = -1;

    /* renamed from: d  reason: collision with root package name */
    public l0 f1070d;

    /* renamed from: e  reason: collision with root package name */
    public l0 f1071e;

    /* renamed from: f  reason: collision with root package name */
    public l0 f1072f;

    public d(View view) {
        this.f1067a = view;
        this.f1068b = g.a();
    }

    public final void a() {
        boolean z10;
        Drawable background = this.f1067a.getBackground();
        if (background != null) {
            boolean z11 = true;
            if (this.f1070d != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f1072f == null) {
                    this.f1072f = new l0();
                }
                l0 l0Var = this.f1072f;
                l0Var.f1144a = null;
                l0Var.f1147d = false;
                l0Var.f1145b = null;
                l0Var.f1146c = false;
                View view = this.f1067a;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                ColorStateList g2 = d0.i.g(view);
                if (g2 != null) {
                    l0Var.f1147d = true;
                    l0Var.f1144a = g2;
                }
                PorterDuff.Mode h10 = d0.i.h(this.f1067a);
                if (h10 != null) {
                    l0Var.f1146c = true;
                    l0Var.f1145b = h10;
                }
                if (l0Var.f1147d || l0Var.f1146c) {
                    g.e(background, l0Var, this.f1067a.getDrawableState());
                } else {
                    z11 = false;
                }
                if (z11) {
                    return;
                }
            }
            l0 l0Var2 = this.f1071e;
            if (l0Var2 != null) {
                g.e(background, l0Var2, this.f1067a.getDrawableState());
                return;
            }
            l0 l0Var3 = this.f1070d;
            if (l0Var3 != null) {
                g.e(background, l0Var3, this.f1067a.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        l0 l0Var = this.f1071e;
        if (l0Var != null) {
            return l0Var.f1144a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        l0 l0Var = this.f1071e;
        if (l0Var != null) {
            return l0Var.f1145b;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r0.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
        throw r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.view.View r0 = r7.f1067a
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R$styleable.ViewBackgroundHelper
            androidx.appcompat.widget.n0 r0 = androidx.appcompat.widget.n0.m(r0, r8, r3, r9)
            android.view.View r1 = r7.f1067a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1157b
            r4 = r8
            r6 = r9
            w1.d0.n(r1, r2, r3, r4, r5, r6)
            int r8 = androidx.appcompat.R$styleable.ViewBackgroundHelper_android_background     // Catch:{ all -> 0x006e }
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x006e }
            r1 = -1
            if (r9 == 0) goto L_0x0043
            int r8 = r0.i(r8, r1)     // Catch:{ all -> 0x006e }
            r7.f1069c = r8     // Catch:{ all -> 0x006e }
            androidx.appcompat.widget.g r8 = r7.f1068b     // Catch:{ all -> 0x006e }
            android.view.View r9 = r7.f1067a     // Catch:{ all -> 0x006e }
            android.content.Context r9 = r9.getContext()     // Catch:{ all -> 0x006e }
            int r2 = r7.f1069c     // Catch:{ all -> 0x006e }
            monitor-enter(r8)     // Catch:{ all -> 0x006e }
            androidx.appcompat.widget.d0 r3 = r8.f1105a     // Catch:{ all -> 0x0040 }
            android.content.res.ColorStateList r9 = r3.i(r9, r2)     // Catch:{ all -> 0x0040 }
            monitor-exit(r8)     // Catch:{ all -> 0x006e }
            if (r9 == 0) goto L_0x0043
            r7.g(r9)     // Catch:{ all -> 0x006e }
            goto L_0x0043
        L_0x0040:
            r9 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x006e }
            throw r9     // Catch:{ all -> 0x006e }
        L_0x0043:
            int r8 = androidx.appcompat.R$styleable.ViewBackgroundHelper_backgroundTint     // Catch:{ all -> 0x006e }
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x006e }
            if (r9 == 0) goto L_0x0054
            android.view.View r9 = r7.f1067a     // Catch:{ all -> 0x006e }
            android.content.res.ColorStateList r8 = r0.b(r8)     // Catch:{ all -> 0x006e }
            w1.d0.i.q(r9, r8)     // Catch:{ all -> 0x006e }
        L_0x0054:
            int r8 = androidx.appcompat.R$styleable.ViewBackgroundHelper_backgroundTintMode     // Catch:{ all -> 0x006e }
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x006e }
            if (r9 == 0) goto L_0x006a
            android.view.View r9 = r7.f1067a     // Catch:{ all -> 0x006e }
            int r8 = r0.h(r8, r1)     // Catch:{ all -> 0x006e }
            r1 = 0
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.x.c(r8, r1)     // Catch:{ all -> 0x006e }
            w1.d0.i.r(r9, r8)     // Catch:{ all -> 0x006e }
        L_0x006a:
            r0.n()
            return
        L_0x006e:
            r8 = move-exception
            r0.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.d.d(android.util.AttributeSet, int):void");
    }

    public final void e() {
        this.f1069c = -1;
        g((ColorStateList) null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f1069c = i10;
        g gVar = this.f1068b;
        if (gVar != null) {
            Context context = this.f1067a.getContext();
            synchronized (gVar) {
                colorStateList = gVar.f1105a.i(context, i10);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1070d == null) {
                this.f1070d = new l0();
            }
            l0 l0Var = this.f1070d;
            l0Var.f1144a = colorStateList;
            l0Var.f1147d = true;
        } else {
            this.f1070d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f1071e == null) {
            this.f1071e = new l0();
        }
        l0 l0Var = this.f1071e;
        l0Var.f1144a = colorStateList;
        l0Var.f1147d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f1071e == null) {
            this.f1071e = new l0();
        }
        l0 l0Var = this.f1071e;
        l0Var.f1145b = mode;
        l0Var.f1146c = true;
        a();
    }
}
