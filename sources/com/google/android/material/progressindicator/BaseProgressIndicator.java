package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.material.R$attr;
import com.google.android.material.R$style;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.u;
import h8.b;
import h8.g;
import h8.j;
import h8.k;
import h8.l;
import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseProgressIndicator<S extends h8.b> extends ProgressBar {

    /* renamed from: t  reason: collision with root package name */
    public static final int f6614t = R$style.Widget_MaterialComponents_ProgressIndicator;

    /* renamed from: a  reason: collision with root package name */
    public S f6615a;

    /* renamed from: b  reason: collision with root package name */
    public int f6616b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f6617c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6618d;

    /* renamed from: e  reason: collision with root package name */
    public final int f6619e;

    /* renamed from: f  reason: collision with root package name */
    public h8.a f6620f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f6621n = false;

    /* renamed from: o  reason: collision with root package name */
    public int f6622o = 4;

    /* renamed from: p  reason: collision with root package name */
    public final a f6623p = new a();

    /* renamed from: q  reason: collision with root package name */
    public final b f6624q = new b();

    /* renamed from: r  reason: collision with root package name */
    public final c f6625r = new c();

    /* renamed from: s  reason: collision with root package name */
    public final d f6626s = new d();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            int i10 = BaseProgressIndicator.f6614t;
            if (baseProgressIndicator.f6619e > 0) {
                SystemClock.uptimeMillis();
            }
            baseProgressIndicator.setVisibility(0);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            int i10 = BaseProgressIndicator.f6614t;
            boolean z10 = false;
            ((j) baseProgressIndicator.getCurrentDrawable()).e(false, false, true);
            if ((baseProgressIndicator.getProgressDrawable() == null || !baseProgressIndicator.getProgressDrawable().isVisible()) && (baseProgressIndicator.getIndeterminateDrawable() == null || !baseProgressIndicator.getIndeterminateDrawable().isVisible())) {
                z10 = true;
            }
            if (z10) {
                baseProgressIndicator.setVisibility(4);
            }
            BaseProgressIndicator.this.getClass();
        }
    }

    public class c extends j3.c {
        public c() {
        }

        public final void a(Drawable drawable) {
            BaseProgressIndicator.this.setIndeterminate(false);
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            baseProgressIndicator.setProgressCompat(baseProgressIndicator.f6616b, baseProgressIndicator.f6617c);
        }
    }

    public class d extends j3.c {
        public d() {
        }

        public final void a(Drawable drawable) {
            BaseProgressIndicator baseProgressIndicator = BaseProgressIndicator.this;
            if (!baseProgressIndicator.f6621n) {
                baseProgressIndicator.setVisibility(baseProgressIndicator.f6622o);
            }
        }
    }

    public BaseProgressIndicator(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(p8.a.a(context, attributeSet, i10, f6614t), attributeSet, i10);
        Context context2 = getContext();
        this.f6615a = a(context2, attributeSet);
        TypedArray d10 = u.d(context2, attributeSet, R$styleable.BaseProgressIndicator, i10, i11, new int[0]);
        d10.getInt(R$styleable.BaseProgressIndicator_showDelay, -1);
        this.f6619e = Math.min(d10.getInt(R$styleable.BaseProgressIndicator_minHideDelay, -1), 1000);
        d10.recycle();
        this.f6620f = new h8.a();
        this.f6618d = true;
    }

    private k<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() == null) {
                return null;
            }
            return getIndeterminateDrawable().f10669s;
        } else if (getProgressDrawable() == null) {
            return null;
        } else {
            return getProgressDrawable().f10649s;
        }
    }

    public abstract S a(Context context, AttributeSet attributeSet);

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (getWindowVisibility() == 0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r4 = this;
            java.util.WeakHashMap<android.view.View, w1.q0> r0 = w1.d0.f16298a
            boolean r0 = w1.d0.g.b(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0033
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L_0x0033
            r0 = r4
        L_0x0011:
            int r3 = r0.getVisibility()
            if (r3 == 0) goto L_0x0018
            goto L_0x0026
        L_0x0018:
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x0028
            int r0 = r4.getWindowVisibility()
            if (r0 != 0) goto L_0x0026
        L_0x0024:
            r0 = r1
            goto L_0x002d
        L_0x0026:
            r0 = r2
            goto L_0x002d
        L_0x0028:
            boolean r3 = r0 instanceof android.view.View
            if (r3 != 0) goto L_0x0030
            goto L_0x0024
        L_0x002d:
            if (r0 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0030:
            android.view.View r0 = (android.view.View) r0
            goto L_0x0011
        L_0x0033:
            r1 = r2
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.progressindicator.BaseProgressIndicator.b():boolean");
    }

    public Drawable getCurrentDrawable() {
        if (isIndeterminate()) {
            return getIndeterminateDrawable();
        }
        return getProgressDrawable();
    }

    public int getHideAnimationBehavior() {
        return this.f6615a.f10628f;
    }

    public int[] getIndicatorColor() {
        return this.f6615a.f10625c;
    }

    public int getShowAnimationBehavior() {
        return this.f6615a.f10627e;
    }

    public int getTrackColor() {
        return this.f6615a.f10626d;
    }

    public int getTrackCornerRadius() {
        return this.f6615a.f10624b;
    }

    public int getTrackThickness() {
        return this.f6615a.f10623a;
    }

    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!(getProgressDrawable() == null || getIndeterminateDrawable() == null)) {
            getIndeterminateDrawable().f10670t.g(this.f6625r);
        }
        if (getProgressDrawable() != null) {
            g progressDrawable = getProgressDrawable();
            d dVar = this.f6626s;
            if (progressDrawable.f10662f == null) {
                progressDrawable.f10662f = new ArrayList();
            }
            if (!progressDrawable.f10662f.contains(dVar)) {
                progressDrawable.f10662f.add(dVar);
            }
        }
        if (getIndeterminateDrawable() != null) {
            l indeterminateDrawable = getIndeterminateDrawable();
            d dVar2 = this.f6626s;
            if (indeterminateDrawable.f10662f == null) {
                indeterminateDrawable.f10662f = new ArrayList();
            }
            if (!indeterminateDrawable.f10662f.contains(dVar2)) {
                indeterminateDrawable.f10662f.add(dVar2);
            }
        }
        if (b()) {
            if (this.f6619e > 0) {
                SystemClock.uptimeMillis();
            }
            setVisibility(0);
        }
    }

    public final void onDetachedFromWindow() {
        removeCallbacks(this.f6624q);
        removeCallbacks(this.f6623p);
        ((j) getCurrentDrawable()).e(false, false, false);
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().g(this.f6626s);
            getIndeterminateDrawable().f10670t.j();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().g(this.f6626s);
        }
        super.onDetachedFromWindow();
    }

    public final synchronized void onDraw(Canvas canvas) {
        int save = canvas.save();
        if (!(getPaddingLeft() == 0 && getPaddingTop() == 0)) {
            canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
        }
        if (!(getPaddingRight() == 0 && getPaddingBottom() == 0)) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(save);
    }

    public final synchronized void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        k currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate != null) {
            if (currentDrawingDelegate.e() < 0) {
                i12 = View.getDefaultSize(getSuggestedMinimumWidth(), i10);
            } else {
                i12 = currentDrawingDelegate.e() + getPaddingLeft() + getPaddingRight();
            }
            if (currentDrawingDelegate.d() < 0) {
                i13 = View.getDefaultSize(getSuggestedMinimumHeight(), i11);
            } else {
                i13 = currentDrawingDelegate.d() + getPaddingTop() + getPaddingBottom();
            }
            setMeasuredDimension(i12, i13);
        }
    }

    public final void onVisibilityChanged(View view, int i10) {
        boolean z10;
        super.onVisibilityChanged(view, i10);
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6618d) {
            ((j) getCurrentDrawable()).e(b(), false, z10);
        }
    }

    public final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        if (this.f6618d) {
            ((j) getCurrentDrawable()).e(b(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(h8.a aVar) {
        this.f6620f = aVar;
        if (getProgressDrawable() != null) {
            getProgressDrawable().f10659c = aVar;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().f10659c = aVar;
        }
    }

    public void setHideAnimationBehavior(int i10) {
        this.f6615a.f10628f = i10;
        invalidate();
    }

    public synchronized void setIndeterminate(boolean z10) {
        if (z10 != isIndeterminate()) {
            j jVar = (j) getCurrentDrawable();
            if (jVar != null) {
                jVar.e(false, false, false);
            }
            super.setIndeterminate(z10);
            j jVar2 = (j) getCurrentDrawable();
            if (jVar2 != null) {
                jVar2.e(b(), false, false);
            }
            if ((jVar2 instanceof l) && b()) {
                ((l) jVar2).f10670t.i();
            }
            this.f6621n = false;
        }
    }

    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable((Drawable) null);
        } else if (drawable instanceof l) {
            ((j) drawable).e(false, false, false);
            super.setIndeterminateDrawable(drawable);
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{m9.b.B(getContext(), R$attr.colorPrimary, -1)};
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.f6615a.f10625c = iArr;
            getIndeterminateDrawable().f10670t.f();
            invalidate();
        }
    }

    public synchronized void setProgress(int i10) {
        if (!isIndeterminate()) {
            setProgressCompat(i10, false);
        }
    }

    public void setProgressCompat(int i10, boolean z10) {
        if (!isIndeterminate()) {
            super.setProgress(i10);
            if (getProgressDrawable() != null && !z10) {
                getProgressDrawable().jumpToCurrentState();
            }
        } else if (getProgressDrawable() != null) {
            this.f6616b = i10;
            this.f6617c = z10;
            this.f6621n = true;
            if (getIndeterminateDrawable().isVisible()) {
                h8.a aVar = this.f6620f;
                ContentResolver contentResolver = getContext().getContentResolver();
                aVar.getClass();
                if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                    getIndeterminateDrawable().f10670t.h();
                    return;
                }
            }
            this.f6625r.a(getIndeterminateDrawable());
        }
    }

    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable((Drawable) null);
        } else if (drawable instanceof g) {
            g gVar = (g) drawable;
            gVar.e(false, false, false);
            super.setProgressDrawable(gVar);
            gVar.setLevel((int) ((((float) getProgress()) / ((float) getMax())) * 10000.0f));
        } else {
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i10) {
        this.f6615a.f10627e = i10;
        invalidate();
    }

    public void setTrackColor(int i10) {
        S s10 = this.f6615a;
        if (s10.f10626d != i10) {
            s10.f10626d = i10;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i10) {
        S s10 = this.f6615a;
        if (s10.f10624b != i10) {
            s10.f10624b = Math.min(i10, s10.f10623a / 2);
        }
    }

    public void setTrackThickness(int i10) {
        S s10 = this.f6615a;
        if (s10.f10623a != i10) {
            s10.f10623a = i10;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i10) {
        if (i10 == 0 || i10 == 4 || i10 == 8) {
            this.f6622o = i10;
            return;
        }
        throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
    }

    public l<S> getIndeterminateDrawable() {
        return (l) super.getIndeterminateDrawable();
    }

    public g<S> getProgressDrawable() {
        return (g) super.getProgressDrawable();
    }
}
