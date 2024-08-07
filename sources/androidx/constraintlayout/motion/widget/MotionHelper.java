package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.R$styleable;
import f1.n;
import java.util.HashMap;

public class MotionHelper extends ConstraintHelper implements MotionLayout.h {

    /* renamed from: p  reason: collision with root package name */
    public boolean f1568p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1569q = false;

    /* renamed from: r  reason: collision with root package name */
    public float f1570r;

    /* renamed from: s  reason: collision with root package name */
    public View[] f1571s;

    public MotionHelper(Context context) {
        super(context);
    }

    public void a(int i10) {
    }

    public void b() {
    }

    public final void c() {
    }

    public final void d() {
    }

    public float getProgress() {
        return this.f1570r;
    }

    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.MotionHelper);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.MotionHelper_onShow) {
                    this.f1568p = obtainStyledAttributes.getBoolean(index, this.f1568p);
                } else if (index == R$styleable.MotionHelper_onHide) {
                    this.f1569q = obtainStyledAttributes.getBoolean(index, this.f1569q);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f10) {
        this.f1570r = f10;
        int i10 = 0;
        if (this.f1843b > 0) {
            this.f1571s = m((ConstraintLayout) getParent());
            while (i10 < this.f1843b) {
                setProgress(this.f1571s[i10], f10);
                i10++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i10 < childCount) {
            View childAt = viewGroup.getChildAt(i10);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f10);
            }
            i10++;
        }
    }

    public void setProgress(View view, float f10) {
    }

    public void u(MotionLayout motionLayout, HashMap<View, n> hashMap) {
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        n(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        n(attributeSet);
    }
}
