package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import c1.e;

public class Layer extends ConstraintHelper {
    public float A = Float.NaN;
    public boolean B = true;
    public View[] C = null;
    public float D = 0.0f;
    public float E = 0.0f;
    public boolean F;
    public boolean G;

    /* renamed from: p  reason: collision with root package name */
    public float f1550p = Float.NaN;

    /* renamed from: q  reason: collision with root package name */
    public float f1551q = Float.NaN;

    /* renamed from: r  reason: collision with root package name */
    public float f1552r = Float.NaN;

    /* renamed from: s  reason: collision with root package name */
    public ConstraintLayout f1553s;

    /* renamed from: t  reason: collision with root package name */
    public float f1554t = 1.0f;

    /* renamed from: u  reason: collision with root package name */
    public float f1555u = 1.0f;

    /* renamed from: v  reason: collision with root package name */
    public float f1556v = Float.NaN;

    /* renamed from: w  reason: collision with root package name */
    public float f1557w = Float.NaN;

    /* renamed from: x  reason: collision with root package name */
    public float f1558x = Float.NaN;

    /* renamed from: y  reason: collision with root package name */
    public float f1559y = Float.NaN;

    /* renamed from: z  reason: collision with root package name */
    public float f1560z = Float.NaN;

    public Layer(Context context) {
        super(context);
    }

    public final void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintLayout_Layout_android_visibility) {
                    this.F = true;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_elevation) {
                    this.G = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1553s = (ConstraintLayout) getParent();
        if (this.F || this.G) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i10 = 0; i10 < this.f1843b; i10++) {
                View c10 = this.f1553s.c(this.f1842a[i10]);
                if (c10 != null) {
                    if (this.F) {
                        c10.setVisibility(visibility);
                    }
                    if (this.G && elevation > 0.0f) {
                        c10.setTranslationZ(c10.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final void q() {
        v();
        this.f1556v = Float.NaN;
        this.f1557w = Float.NaN;
        e eVar = ((ConstraintLayout.LayoutParams) getLayoutParams()).f1899q0;
        eVar.R(0);
        eVar.O(0);
        u();
        layout(((int) this.f1560z) - getPaddingLeft(), ((int) this.A) - getPaddingTop(), getPaddingRight() + ((int) this.f1558x), getPaddingBottom() + ((int) this.f1559y));
        w();
    }

    public final void r(ConstraintLayout constraintLayout) {
        this.f1553s = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.f1552r = rotation;
        } else if (!Float.isNaN(this.f1552r)) {
            this.f1552r = rotation;
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h();
    }

    public void setPivotX(float f10) {
        this.f1550p = f10;
        w();
    }

    public void setPivotY(float f10) {
        this.f1551q = f10;
        w();
    }

    public void setRotation(float f10) {
        this.f1552r = f10;
        w();
    }

    public void setScaleX(float f10) {
        this.f1554t = f10;
        w();
    }

    public void setScaleY(float f10) {
        this.f1555u = f10;
        w();
    }

    public void setTranslationX(float f10) {
        this.D = f10;
        w();
    }

    public void setTranslationY(float f10) {
        this.E = f10;
        w();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        h();
    }

    public final void u() {
        if (this.f1553s != null) {
            if (!this.B && !Float.isNaN(this.f1556v) && !Float.isNaN(this.f1557w)) {
                return;
            }
            if (Float.isNaN(this.f1550p) || Float.isNaN(this.f1551q)) {
                View[] m10 = m(this.f1553s);
                int left = m10[0].getLeft();
                int top = m10[0].getTop();
                int right = m10[0].getRight();
                int bottom = m10[0].getBottom();
                for (int i10 = 0; i10 < this.f1843b; i10++) {
                    View view = m10[i10];
                    left = Math.min(left, view.getLeft());
                    top = Math.min(top, view.getTop());
                    right = Math.max(right, view.getRight());
                    bottom = Math.max(bottom, view.getBottom());
                }
                this.f1558x = (float) right;
                this.f1559y = (float) bottom;
                this.f1560z = (float) left;
                this.A = (float) top;
                if (Float.isNaN(this.f1550p)) {
                    this.f1556v = (float) ((left + right) / 2);
                } else {
                    this.f1556v = this.f1550p;
                }
                if (Float.isNaN(this.f1551q)) {
                    this.f1557w = (float) ((top + bottom) / 2);
                } else {
                    this.f1557w = this.f1551q;
                }
            } else {
                this.f1557w = this.f1551q;
                this.f1556v = this.f1550p;
            }
        }
    }

    public final void v() {
        int i10;
        if (this.f1553s != null && (i10 = this.f1843b) != 0) {
            View[] viewArr = this.C;
            if (viewArr == null || viewArr.length != i10) {
                this.C = new View[i10];
            }
            for (int i11 = 0; i11 < this.f1843b; i11++) {
                this.C[i11] = this.f1553s.c(this.f1842a[i11]);
            }
        }
    }

    public final void w() {
        double d10;
        if (this.f1553s != null) {
            if (this.C == null) {
                v();
            }
            u();
            if (Float.isNaN(this.f1552r)) {
                d10 = 0.0d;
            } else {
                d10 = Math.toRadians((double) this.f1552r);
            }
            float sin = (float) Math.sin(d10);
            float cos = (float) Math.cos(d10);
            float f10 = this.f1554t;
            float f11 = f10 * cos;
            float f12 = this.f1555u;
            float f13 = (-f12) * sin;
            float f14 = f10 * sin;
            float f15 = f12 * cos;
            for (int i10 = 0; i10 < this.f1843b; i10++) {
                View view = this.C[i10];
                int left = view.getLeft();
                int top = view.getTop();
                float right = ((float) ((view.getRight() + left) / 2)) - this.f1556v;
                float bottom = ((float) ((view.getBottom() + top) / 2)) - this.f1557w;
                view.setTranslationX((((f13 * bottom) + (f11 * right)) - right) + this.D);
                view.setTranslationY((((f15 * bottom) + (right * f14)) - bottom) + this.E);
                view.setScaleY(this.f1555u);
                view.setScaleX(this.f1554t);
                if (!Float.isNaN(this.f1552r)) {
                    view.setRotation(this.f1552r);
                }
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Layer(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
