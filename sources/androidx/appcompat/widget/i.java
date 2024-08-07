package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.R$styleable;
import androidx.core.widget.f;
import h.a;
import w1.d0;

/* compiled from: AppCompatImageHelper */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1130a;

    /* renamed from: b  reason: collision with root package name */
    public l0 f1131b;

    /* renamed from: c  reason: collision with root package name */
    public int f1132c = 0;

    public i(ImageView imageView) {
        this.f1130a = imageView;
    }

    public final void a() {
        l0 l0Var;
        Drawable drawable = this.f1130a.getDrawable();
        if (drawable != null) {
            x.a(drawable);
        }
        if (drawable != null && (l0Var = this.f1131b) != null) {
            g.e(drawable, l0Var, this.f1130a.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int i11;
        Context context = this.f1130a.getContext();
        int[] iArr = R$styleable.AppCompatImageView;
        n0 m10 = n0.m(context, attributeSet, iArr, i10);
        ImageView imageView = this.f1130a;
        d0.n(imageView, imageView.getContext(), iArr, attributeSet, m10.f1157b, i10);
        try {
            Drawable drawable = this.f1130a.getDrawable();
            if (!(drawable != null || (i11 = m10.i(R$styleable.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = a.a(this.f1130a.getContext(), i11)) == null)) {
                this.f1130a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                x.a(drawable);
            }
            int i12 = R$styleable.AppCompatImageView_tint;
            if (m10.l(i12)) {
                f.c(this.f1130a, m10.b(i12));
            }
            int i13 = R$styleable.AppCompatImageView_tintMode;
            if (m10.l(i13)) {
                f.d(this.f1130a, x.c(m10.h(i13, -1), (PorterDuff.Mode) null));
            }
        } finally {
            m10.n();
        }
    }

    public final void c(int i10) {
        if (i10 != 0) {
            Drawable a10 = a.a(this.f1130a.getContext(), i10);
            if (a10 != null) {
                x.a(a10);
            }
            this.f1130a.setImageDrawable(a10);
        } else {
            this.f1130a.setImageDrawable((Drawable) null);
        }
        a();
    }
}
