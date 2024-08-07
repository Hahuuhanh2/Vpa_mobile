package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R$styleable;
import o1.a;
import w1.d0;

/* compiled from: AppCompatSeekBarHelper */
public final class m extends j {

    /* renamed from: d  reason: collision with root package name */
    public final SeekBar f1148d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1149e;

    /* renamed from: f  reason: collision with root package name */
    public ColorStateList f1150f = null;

    /* renamed from: g  reason: collision with root package name */
    public PorterDuff.Mode f1151g = null;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1152h = false;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1153i = false;

    public m(SeekBar seekBar) {
        super(seekBar);
        this.f1148d = seekBar;
    }

    public final void a(AttributeSet attributeSet, int i10) {
        super.a(attributeSet, i10);
        Context context = this.f1148d.getContext();
        int[] iArr = R$styleable.AppCompatSeekBar;
        n0 m10 = n0.m(context, attributeSet, iArr, i10);
        SeekBar seekBar = this.f1148d;
        d0.n(seekBar, seekBar.getContext(), iArr, attributeSet, m10.f1157b, i10);
        Drawable f10 = m10.f(R$styleable.AppCompatSeekBar_android_thumb);
        if (f10 != null) {
            this.f1148d.setThumb(f10);
        }
        Drawable e10 = m10.e(R$styleable.AppCompatSeekBar_tickMark);
        Drawable drawable = this.f1149e;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
        this.f1149e = e10;
        if (e10 != null) {
            e10.setCallback(this.f1148d);
            a.c.b(e10, d0.e.d(this.f1148d));
            if (e10.isStateful()) {
                e10.setState(this.f1148d.getDrawableState());
            }
            c();
        }
        this.f1148d.invalidate();
        int i11 = R$styleable.AppCompatSeekBar_tickMarkTintMode;
        if (m10.l(i11)) {
            this.f1151g = x.c(m10.h(i11, -1), this.f1151g);
            this.f1153i = true;
        }
        int i12 = R$styleable.AppCompatSeekBar_tickMarkTint;
        if (m10.l(i12)) {
            this.f1150f = m10.b(i12);
            this.f1152h = true;
        }
        m10.n();
        c();
    }

    public final void c() {
        Drawable drawable = this.f1149e;
        if (drawable == null) {
            return;
        }
        if (this.f1152h || this.f1153i) {
            Drawable mutate = drawable.mutate();
            this.f1149e = mutate;
            if (this.f1152h) {
                a.b.h(mutate, this.f1150f);
            }
            if (this.f1153i) {
                a.b.i(this.f1149e, this.f1151g);
            }
            if (this.f1149e.isStateful()) {
                this.f1149e.setState(this.f1148d.getDrawableState());
            }
        }
    }

    public final void d(Canvas canvas) {
        int i10;
        if (this.f1149e != null) {
            int max = this.f1148d.getMax();
            int i11 = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1149e.getIntrinsicWidth();
                int intrinsicHeight = this.f1149e.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i10 = intrinsicWidth / 2;
                } else {
                    i10 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i11 = intrinsicHeight / 2;
                }
                this.f1149e.setBounds(-i10, -i11, i10, i11);
                float width = ((float) ((this.f1148d.getWidth() - this.f1148d.getPaddingLeft()) - this.f1148d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1148d.getPaddingLeft(), (float) (this.f1148d.getHeight() / 2));
                for (int i12 = 0; i12 <= max; i12++) {
                    this.f1149e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
