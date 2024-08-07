package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public boolean f866a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f867b;

    /* renamed from: c  reason: collision with root package name */
    public int f868c = -1;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int[] iArr = R$styleable.ButtonBarLayout;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        d0.n(this, context, iArr, attributeSet, obtainStyledAttributes, 0);
        this.f866a = obtainStyledAttributes.getBoolean(R$styleable.ButtonBarLayout_allowStacking, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f866a);
        }
    }

    private void setStacked(boolean z10) {
        int i10;
        int i11;
        if (this.f867b == z10) {
            return;
        }
        if (!z10 || this.f866a) {
            this.f867b = z10;
            setOrientation(z10 ? 1 : 0);
            if (z10) {
                i10 = 8388613;
            } else {
                i10 = 80;
            }
            setGravity(i10);
            View findViewById = findViewById(R$id.spacer);
            if (findViewById != null) {
                if (z10) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                findViewById.setVisibility(i11);
            }
            for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                bringChildToFront(getChildAt(childCount));
            }
        }
    }

    public final void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        int i13;
        int i14;
        boolean z11;
        int size = View.MeasureSpec.getSize(i10);
        int i15 = 0;
        if (this.f866a) {
            if (size > this.f868c && this.f867b) {
                setStacked(false);
            }
            this.f868c = size;
        }
        if (this.f867b || View.MeasureSpec.getMode(i10) != 1073741824) {
            i12 = i10;
            z10 = false;
        } else {
            i12 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z10 = true;
        }
        super.onMeasure(i12, i11);
        if (this.f866a && !this.f867b) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                setStacked(true);
                z10 = true;
            }
        }
        if (z10) {
            super.onMeasure(i10, i11);
        }
        int childCount = getChildCount();
        int i16 = 0;
        while (true) {
            i13 = -1;
            if (i16 >= childCount) {
                i16 = -1;
                break;
            } else if (getChildAt(i16).getVisibility() == 0) {
                break;
            } else {
                i16++;
            }
        }
        if (i16 >= 0) {
            View childAt = getChildAt(i16);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            i15 = 0 + childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f867b) {
                int i17 = i16 + 1;
                int childCount2 = getChildCount();
                while (true) {
                    if (i17 >= childCount2) {
                        break;
                    } else if (getChildAt(i17).getVisibility() == 0) {
                        i13 = i17;
                        break;
                    } else {
                        i17++;
                    }
                }
                if (i13 >= 0) {
                    i14 = getChildAt(i13).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
            } else {
                i14 = getPaddingBottom();
            }
            i15 += i14;
        }
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.d.d(this) != i15) {
            setMinimumHeight(i15);
            if (i11 == 0) {
                super.onMeasure(i10, i11);
            }
        }
    }

    public void setAllowStacking(boolean z10) {
        if (this.f866a != z10) {
            this.f866a = z10;
            if (!z10 && this.f867b) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
