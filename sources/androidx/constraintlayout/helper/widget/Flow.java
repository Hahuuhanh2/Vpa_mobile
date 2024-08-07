package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R$styleable;
import androidx.constraintlayout.widget.VirtualLayout;
import androidx.constraintlayout.widget.a;
import c1.e;
import c1.g;
import c1.j;
import c1.m;

public class Flow extends VirtualLayout {

    /* renamed from: r  reason: collision with root package name */
    public g f1549r;

    public Flow(Context context) {
        super(context);
    }

    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.f1549r = new g();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintLayout_Layout_android_orientation) {
                    this.f1549r.f4476b1 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_padding) {
                    g gVar = this.f1549r;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f4508y0 = dimensionPixelSize;
                    gVar.f4509z0 = dimensionPixelSize;
                    gVar.A0 = dimensionPixelSize;
                    gVar.B0 = dimensionPixelSize;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingStart) {
                    g gVar2 = this.f1549r;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.A0 = dimensionPixelSize2;
                    gVar2.C0 = dimensionPixelSize2;
                    gVar2.D0 = dimensionPixelSize2;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.f1549r.B0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.f1549r.C0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.f1549r.f4508y0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.f1549r.D0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.f1549r.f4509z0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.f1549r.Z0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.f1549r.J0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.f1549r.K0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.f1549r.L0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.f1549r.N0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.f1549r.M0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.f1549r.O0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.f1549r.P0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.f1549r.R0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.f1549r.T0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.f1549r.S0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.f1549r.U0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.f1549r.Q0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.f1549r.X0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.f1549r.Y0 = obtainStyledAttributes.getInt(index, 2);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.f1549r.V0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.f1549r.W0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.f1549r.f4475a1 = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1845d = this.f1549r;
        t();
    }

    public final void o(a.C0016a aVar, j jVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.o(aVar, jVar, layoutParams, sparseArray);
        if (jVar instanceof g) {
            g gVar = (g) jVar;
            int i10 = layoutParams.V;
            if (i10 != -1) {
                gVar.f4476b1 = i10;
            }
        }
    }

    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i10, int i11) {
        u(this.f1549r, i10, i11);
    }

    public final void p(e eVar, boolean z10) {
        g gVar = this.f1549r;
        int i10 = gVar.A0;
        if (i10 <= 0 && gVar.B0 <= 0) {
            return;
        }
        if (z10) {
            gVar.C0 = gVar.B0;
            gVar.D0 = i10;
            return;
        }
        gVar.C0 = i10;
        gVar.D0 = gVar.B0;
    }

    public void setFirstHorizontalBias(float f10) {
        this.f1549r.R0 = f10;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f1549r.L0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f10) {
        this.f1549r.S0 = f10;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f1549r.M0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f1549r.X0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f10) {
        this.f1549r.P0 = f10;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f1549r.V0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f1549r.J0 = i10;
        requestLayout();
    }

    public void setLastHorizontalBias(float f10) {
        this.f1549r.T0 = f10;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i10) {
        this.f1549r.N0 = i10;
        requestLayout();
    }

    public void setLastVerticalBias(float f10) {
        this.f1549r.U0 = f10;
        requestLayout();
    }

    public void setLastVerticalStyle(int i10) {
        this.f1549r.O0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f1549r.f4475a1 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f1549r.f4476b1 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        g gVar = this.f1549r;
        gVar.f4508y0 = i10;
        gVar.f4509z0 = i10;
        gVar.A0 = i10;
        gVar.B0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f1549r.f4509z0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f1549r.C0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f1549r.D0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f1549r.f4508y0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f1549r.Y0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f10) {
        this.f1549r.Q0 = f10;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f1549r.W0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f1549r.K0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f1549r.Z0 = i10;
        requestLayout();
    }

    public final void u(m mVar, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mVar != null) {
            mVar.V(mode, size, mode2, size2);
            setMeasuredDimension(mVar.F0, mVar.G0);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
