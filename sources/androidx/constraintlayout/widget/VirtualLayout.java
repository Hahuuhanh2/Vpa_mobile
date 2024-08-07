package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import c1.m;

public abstract class VirtualLayout extends ConstraintHelper {

    /* renamed from: p  reason: collision with root package name */
    public boolean f1936p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1937q;

    public VirtualLayout(Context context) {
        super(context);
    }

    public final void j(ConstraintLayout constraintLayout) {
        i(constraintLayout);
    }

    public void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintLayout_Layout_android_visibility) {
                    this.f1936p = true;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_elevation) {
                    this.f1937q = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f1936p || this.f1937q) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i10 = 0; i10 < this.f1843b; i10++) {
                    View c10 = constraintLayout.c(this.f1842a[i10]);
                    if (c10 != null) {
                        if (this.f1936p) {
                            c10.setVisibility(visibility);
                        }
                        if (this.f1937q && elevation > 0.0f) {
                            c10.setTranslationZ(c10.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        h();
    }

    public void setVisibility(int i10) {
        super.setVisibility(i10);
        h();
    }

    public void u(m mVar, int i10, int i11) {
    }

    public VirtualLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
