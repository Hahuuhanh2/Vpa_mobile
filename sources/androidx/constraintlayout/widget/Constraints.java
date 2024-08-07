package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.a;

public class Constraints extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    public a f1918a;

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public a getConstraintSet() {
        if (this.f1918a == null) {
            this.f1918a = new a();
        }
        a aVar = this.f1918a;
        aVar.getClass();
        int childCount = getChildCount();
        aVar.f1946f.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (!aVar.f1945e || id2 != -1) {
                if (!aVar.f1946f.containsKey(Integer.valueOf(id2))) {
                    aVar.f1946f.put(Integer.valueOf(id2), new a.C0016a());
                }
                a.C0016a aVar2 = aVar.f1946f.get(Integer.valueOf(id2));
                if (aVar2 != null) {
                    if (childAt instanceof ConstraintHelper) {
                        ConstraintHelper constraintHelper = (ConstraintHelper) childAt;
                        aVar2.d(id2, layoutParams);
                        if (constraintHelper instanceof Barrier) {
                            a.b bVar = aVar2.f1951e;
                            bVar.f1985i0 = 1;
                            Barrier barrier = (Barrier) constraintHelper;
                            bVar.f1981g0 = barrier.getType();
                            aVar2.f1951e.f1987j0 = barrier.getReferencedIds();
                            aVar2.f1951e.f1983h0 = barrier.getMargin();
                        }
                    }
                    aVar2.d(id2, layoutParams);
                }
                i10++;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
        return this.f1918a;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.LayoutParams(layoutParams);
    }

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }

    public static class LayoutParams extends ConstraintLayout.LayoutParams {
        public float A0;
        public float B0;
        public float C0;
        public float D0;

        /* renamed from: r0  reason: collision with root package name */
        public float f1919r0;

        /* renamed from: s0  reason: collision with root package name */
        public boolean f1920s0;

        /* renamed from: t0  reason: collision with root package name */
        public float f1921t0;

        /* renamed from: u0  reason: collision with root package name */
        public float f1922u0;

        /* renamed from: v0  reason: collision with root package name */
        public float f1923v0;

        /* renamed from: w0  reason: collision with root package name */
        public float f1924w0;

        /* renamed from: x0  reason: collision with root package name */
        public float f1925x0;

        /* renamed from: y0  reason: collision with root package name */
        public float f1926y0;

        /* renamed from: z0  reason: collision with root package name */
        public float f1927z0;

        public LayoutParams() {
            super(-2);
            this.f1919r0 = 1.0f;
            this.f1920s0 = false;
            this.f1921t0 = 0.0f;
            this.f1922u0 = 0.0f;
            this.f1923v0 = 0.0f;
            this.f1924w0 = 0.0f;
            this.f1925x0 = 1.0f;
            this.f1926y0 = 1.0f;
            this.f1927z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1919r0 = 1.0f;
            this.f1920s0 = false;
            this.f1921t0 = 0.0f;
            this.f1922u0 = 0.0f;
            this.f1923v0 = 0.0f;
            this.f1924w0 = 0.0f;
            this.f1925x0 = 1.0f;
            this.f1926y0 = 1.0f;
            this.f1927z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            this.C0 = 0.0f;
            this.D0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ConstraintSet);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintSet_android_alpha) {
                    this.f1919r0 = obtainStyledAttributes.getFloat(index, this.f1919r0);
                } else if (index == R$styleable.ConstraintSet_android_elevation) {
                    this.f1921t0 = obtainStyledAttributes.getFloat(index, this.f1921t0);
                    this.f1920s0 = true;
                } else if (index == R$styleable.ConstraintSet_android_rotationX) {
                    this.f1923v0 = obtainStyledAttributes.getFloat(index, this.f1923v0);
                } else if (index == R$styleable.ConstraintSet_android_rotationY) {
                    this.f1924w0 = obtainStyledAttributes.getFloat(index, this.f1924w0);
                } else if (index == R$styleable.ConstraintSet_android_rotation) {
                    this.f1922u0 = obtainStyledAttributes.getFloat(index, this.f1922u0);
                } else if (index == R$styleable.ConstraintSet_android_scaleX) {
                    this.f1925x0 = obtainStyledAttributes.getFloat(index, this.f1925x0);
                } else if (index == R$styleable.ConstraintSet_android_scaleY) {
                    this.f1926y0 = obtainStyledAttributes.getFloat(index, this.f1926y0);
                } else if (index == R$styleable.ConstraintSet_android_transformPivotX) {
                    this.f1927z0 = obtainStyledAttributes.getFloat(index, this.f1927z0);
                } else if (index == R$styleable.ConstraintSet_android_transformPivotY) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == R$styleable.ConstraintSet_android_translationX) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                } else if (index == R$styleable.ConstraintSet_android_translationY) {
                    this.C0 = obtainStyledAttributes.getFloat(index, this.C0);
                } else if (index == R$styleable.ConstraintSet_android_translationZ) {
                    this.D0 = obtainStyledAttributes.getFloat(index, this.D0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
