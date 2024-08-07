package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R$style;
import l8.h;
import l8.m;
import l8.n;
import l8.q;

public class ShapeableImageView extends AppCompatImageView implements q {
    public static final int C = R$style.Widget_MaterialComponents_ShapeableImageView;
    public int A;
    public boolean B;

    /* renamed from: d  reason: collision with root package name */
    public final n f6336d;

    /* renamed from: e  reason: collision with root package name */
    public final RectF f6337e;

    /* renamed from: f  reason: collision with root package name */
    public final RectF f6338f;

    /* renamed from: n  reason: collision with root package name */
    public final Paint f6339n;

    /* renamed from: o  reason: collision with root package name */
    public final Paint f6340o;

    /* renamed from: p  reason: collision with root package name */
    public final Path f6341p;

    /* renamed from: q  reason: collision with root package name */
    public ColorStateList f6342q;

    /* renamed from: r  reason: collision with root package name */
    public h f6343r;

    /* renamed from: s  reason: collision with root package name */
    public m f6344s;

    /* renamed from: t  reason: collision with root package name */
    public float f6345t;

    /* renamed from: u  reason: collision with root package name */
    public Path f6346u;

    /* renamed from: v  reason: collision with root package name */
    public int f6347v;

    /* renamed from: w  reason: collision with root package name */
    public int f6348w;

    /* renamed from: x  reason: collision with root package name */
    public int f6349x;

    /* renamed from: y  reason: collision with root package name */
    public int f6350y;

    /* renamed from: z  reason: collision with root package name */
    public int f6351z;

    @TargetApi(21)
    public class a extends ViewOutlineProvider {

        /* renamed from: a  reason: collision with root package name */
        public final Rect f6352a = new Rect();

        public a() {
        }

        public final void getOutline(View view, Outline outline) {
            ShapeableImageView shapeableImageView = ShapeableImageView.this;
            if (shapeableImageView.f6344s != null) {
                if (shapeableImageView.f6343r == null) {
                    shapeableImageView.f6343r = new h(ShapeableImageView.this.f6344s);
                }
                ShapeableImageView.this.f6337e.round(this.f6352a);
                ShapeableImageView.this.f6343r.setBounds(this.f6352a);
                ShapeableImageView.this.f6343r.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public final boolean c() {
        if (getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    public final void d(int i10, int i11) {
        this.f6337e.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i10 - getPaddingRight()), (float) (i11 - getPaddingBottom()));
        this.f6336d.a(this.f6344s, 1.0f, this.f6337e, (h.a) null, this.f6341p);
        this.f6346u.rewind();
        this.f6346u.addPath(this.f6341p);
        this.f6338f.set(0.0f, 0.0f, (float) i10, (float) i11);
        this.f6346u.addRect(this.f6338f, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f6350y;
    }

    public final int getContentPaddingEnd() {
        int i10 = this.A;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (c()) {
            return this.f6347v;
        }
        return this.f6349x;
    }

    public int getContentPaddingLeft() {
        boolean z10;
        int i10;
        int i11;
        if (this.f6351z == Integer.MIN_VALUE && this.A == Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (c() && (i11 = this.A) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!c() && (i10 = this.f6351z) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f6347v;
    }

    public int getContentPaddingRight() {
        boolean z10;
        int i10;
        int i11;
        if (this.f6351z == Integer.MIN_VALUE && this.A == Integer.MIN_VALUE) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (c() && (i11 = this.f6351z) != Integer.MIN_VALUE) {
                return i11;
            }
            if (!c() && (i10 = this.A) != Integer.MIN_VALUE) {
                return i10;
            }
        }
        return this.f6349x;
    }

    public final int getContentPaddingStart() {
        int i10 = this.f6351z;
        if (i10 != Integer.MIN_VALUE) {
            return i10;
        }
        if (c()) {
            return this.f6349x;
        }
        return this.f6347v;
    }

    public int getContentPaddingTop() {
        return this.f6348w;
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public m getShapeAppearanceModel() {
        return this.f6344s;
    }

    public ColorStateList getStrokeColor() {
        return this.f6342q;
    }

    public float getStrokeWidth() {
        return this.f6345t;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f6346u, this.f6340o);
        if (this.f6342q != null) {
            this.f6339n.setStrokeWidth(this.f6345t);
            int colorForState = this.f6342q.getColorForState(getDrawableState(), this.f6342q.getDefaultColor());
            if (this.f6345t > 0.0f && colorForState != 0) {
                this.f6339n.setColor(colorForState);
                canvas.drawPath(this.f6341p, this.f6339n);
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (!this.B && isLayoutDirectionResolved()) {
            boolean z10 = true;
            this.B = true;
            if (!isPaddingRelative()) {
                if (this.f6351z == Integer.MIN_VALUE && this.A == Integer.MIN_VALUE) {
                    z10 = false;
                }
                if (!z10) {
                    setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                    return;
                }
            }
            setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
        }
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        d(i10, i11);
    }

    public void setContentPadding(int i10, int i11, int i12, int i13) {
        this.f6351z = Integer.MIN_VALUE;
        this.A = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f6347v) + i10, (super.getPaddingTop() - this.f6348w) + i11, (super.getPaddingRight() - this.f6349x) + i12, (super.getPaddingBottom() - this.f6350y) + i13);
        this.f6347v = i10;
        this.f6348w = i11;
        this.f6349x = i12;
        this.f6350y = i13;
    }

    public void setContentPaddingRelative(int i10, int i11, int i12, int i13) {
        int i14;
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i10, (super.getPaddingTop() - this.f6348w) + i11, (super.getPaddingEnd() - getContentPaddingEnd()) + i12, (super.getPaddingBottom() - this.f6350y) + i13);
        if (c()) {
            i14 = i12;
        } else {
            i14 = i10;
        }
        this.f6347v = i14;
        this.f6348w = i11;
        if (!c()) {
            i10 = i12;
        }
        this.f6349x = i10;
        this.f6350y = i13;
    }

    public void setPadding(int i10, int i11, int i12, int i13) {
        super.setPadding(getContentPaddingLeft() + i10, getContentPaddingTop() + i11, getContentPaddingRight() + i12, getContentPaddingBottom() + i13);
    }

    public void setPaddingRelative(int i10, int i11, int i12, int i13) {
        super.setPaddingRelative(getContentPaddingStart() + i10, getContentPaddingTop() + i11, getContentPaddingEnd() + i12, getContentPaddingBottom() + i13);
    }

    public void setShapeAppearanceModel(m mVar) {
        this.f6344s = mVar;
        h hVar = this.f6343r;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        d(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f6342q = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i10) {
        setStrokeColor(k1.a.getColorStateList(getContext(), i10));
    }

    public void setStrokeWidth(float f10) {
        if (this.f6345t != f10) {
            this.f6345t = f10;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i10) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i10));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = C
            android.content.Context r7 = p8.a.a(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            l8.n r7 = l8.n.a.f12861a
            r6.f6336d = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f6341p = r7
            r7 = 0
            r6.B = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f6340o = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f6337e = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f6338f = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f6346u = r2
            int[] r2 = com.google.android.material.R$styleable.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            r4 = 2
            r5 = 0
            r6.setLayerType(r4, r5)
            int r4 = com.google.android.material.R$styleable.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = i8.c.a(r1, r2, r4)
            r6.f6342q = r4
            int r4 = com.google.android.material.R$styleable.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f6345t = r4
            int r4 = com.google.android.material.R$styleable.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f6347v = r7
            r6.f6348w = r7
            r6.f6349x = r7
            r6.f6350y = r7
            int r4 = com.google.android.material.R$styleable.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f6347v = r4
            int r4 = com.google.android.material.R$styleable.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f6348w = r4
            int r4 = com.google.android.material.R$styleable.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f6349x = r4
            int r4 = com.google.android.material.R$styleable.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f6350y = r7
            int r7 = com.google.android.material.R$styleable.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f6351z = r7
            int r7 = com.google.android.material.R$styleable.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.A = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f6339n = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            l8.m$a r7 = l8.m.c(r1, r8, r9, r0)
            l8.m r8 = new l8.m
            r8.<init>(r7)
            r6.f6344s = r8
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
