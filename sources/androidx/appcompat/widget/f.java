package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;
import androidx.core.widget.c;
import o1.a;

/* compiled from: AppCompatCompoundButtonHelper */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final CompoundButton f1089a;

    /* renamed from: b  reason: collision with root package name */
    public ColorStateList f1090b = null;

    /* renamed from: c  reason: collision with root package name */
    public PorterDuff.Mode f1091c = null;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1092d = false;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1093e = false;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1094f;

    public f(CompoundButton compoundButton) {
        this.f1089a = compoundButton;
    }

    public final void a() {
        Drawable a10 = c.a(this.f1089a);
        if (a10 == null) {
            return;
        }
        if (this.f1092d || this.f1093e) {
            Drawable mutate = a10.mutate();
            if (this.f1092d) {
                a.b.h(mutate, this.f1090b);
            }
            if (this.f1093e) {
                a.b.i(mutate, this.f1091c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f1089a.getDrawableState());
            }
            this.f1089a.setButtonDrawable(mutate);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a A[SYNTHETIC, Splitter:B:12:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005d A[Catch:{ all -> 0x0081 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006e A[Catch:{ all -> 0x0081 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.util.AttributeSet r8, int r9) {
        /*
            r7 = this;
            android.widget.CompoundButton r0 = r7.f1089a
            android.content.Context r0 = r0.getContext()
            int[] r3 = androidx.appcompat.R$styleable.CompoundButton
            androidx.appcompat.widget.n0 r0 = androidx.appcompat.widget.n0.m(r0, r8, r3, r9)
            android.widget.CompoundButton r1 = r7.f1089a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.f1157b
            r4 = r8
            r6 = r9
            w1.d0.n(r1, r2, r3, r4, r5, r6)
            int r8 = androidx.appcompat.R$styleable.CompoundButton_buttonCompat     // Catch:{ all -> 0x0081 }
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x0081 }
            r1 = 0
            if (r9 == 0) goto L_0x0037
            int r8 = r0.i(r8, r1)     // Catch:{ all -> 0x0081 }
            if (r8 == 0) goto L_0x0037
            android.widget.CompoundButton r9 = r7.f1089a     // Catch:{ NotFoundException -> 0x0037 }
            android.content.Context r2 = r9.getContext()     // Catch:{ NotFoundException -> 0x0037 }
            android.graphics.drawable.Drawable r8 = h.a.a(r2, r8)     // Catch:{ NotFoundException -> 0x0037 }
            r9.setButtonDrawable(r8)     // Catch:{ NotFoundException -> 0x0037 }
            r8 = 1
            goto L_0x0038
        L_0x0037:
            r8 = r1
        L_0x0038:
            if (r8 != 0) goto L_0x0055
            int r8 = androidx.appcompat.R$styleable.CompoundButton_android_button     // Catch:{ all -> 0x0081 }
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x0081 }
            if (r9 == 0) goto L_0x0055
            int r8 = r0.i(r8, r1)     // Catch:{ all -> 0x0081 }
            if (r8 == 0) goto L_0x0055
            android.widget.CompoundButton r9 = r7.f1089a     // Catch:{ all -> 0x0081 }
            android.content.Context r1 = r9.getContext()     // Catch:{ all -> 0x0081 }
            android.graphics.drawable.Drawable r8 = h.a.a(r1, r8)     // Catch:{ all -> 0x0081 }
            r9.setButtonDrawable(r8)     // Catch:{ all -> 0x0081 }
        L_0x0055:
            int r8 = androidx.appcompat.R$styleable.CompoundButton_buttonTint     // Catch:{ all -> 0x0081 }
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x0081 }
            if (r9 == 0) goto L_0x0066
            android.widget.CompoundButton r9 = r7.f1089a     // Catch:{ all -> 0x0081 }
            android.content.res.ColorStateList r8 = r0.b(r8)     // Catch:{ all -> 0x0081 }
            androidx.core.widget.b.c(r9, r8)     // Catch:{ all -> 0x0081 }
        L_0x0066:
            int r8 = androidx.appcompat.R$styleable.CompoundButton_buttonTintMode     // Catch:{ all -> 0x0081 }
            boolean r9 = r0.l(r8)     // Catch:{ all -> 0x0081 }
            if (r9 == 0) goto L_0x007d
            android.widget.CompoundButton r9 = r7.f1089a     // Catch:{ all -> 0x0081 }
            r1 = -1
            int r8 = r0.h(r8, r1)     // Catch:{ all -> 0x0081 }
            r1 = 0
            android.graphics.PorterDuff$Mode r8 = androidx.appcompat.widget.x.c(r8, r1)     // Catch:{ all -> 0x0081 }
            androidx.core.widget.b.d(r9, r8)     // Catch:{ all -> 0x0081 }
        L_0x007d:
            r0.n()
            return
        L_0x0081:
            r8 = move-exception
            r0.n()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f.b(android.util.AttributeSet, int):void");
    }
}
