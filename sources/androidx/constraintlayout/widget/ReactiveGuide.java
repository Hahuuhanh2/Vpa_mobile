package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ReactiveGuide extends View implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public int f1932a = -1;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1933b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f1934c = 0;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1935d = true;

    public ReactiveGuide(Context context) {
        super(context);
        super.setVisibility(8);
        a((AttributeSet) null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_ReactiveGuide);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.f1932a = obtainStyledAttributes.getResourceId(index, this.f1932a);
                } else if (index == R$styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.f1933b = obtainStyledAttributes.getBoolean(index, this.f1933b);
                } else if (index == R$styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.f1934c = obtainStyledAttributes.getResourceId(index, this.f1934c);
                } else if (index == R$styleable.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.f1935d = obtainStyledAttributes.getBoolean(index, this.f1935d);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f1932a != -1) {
            ConstraintLayout.getSharedValues().a(this.f1932a, this);
        }
    }

    @SuppressLint({"MissingSuperCall"})
    public final void draw(Canvas canvas) {
    }

    public int getApplyToConstraintSetId() {
        return this.f1934c;
    }

    public int getAttributeId() {
        return this.f1932a;
    }

    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setAnimateChange(boolean z10) {
        this.f1933b = z10;
    }

    public void setApplyToConstraintSetId(int i10) {
        this.f1934c = i10;
    }

    public void setAttributeId(int i10) {
        HashSet hashSet;
        b sharedValues = ConstraintLayout.getSharedValues();
        int i11 = this.f1932a;
        if (!(i11 == -1 || (hashSet = sharedValues.f2044a.get(Integer.valueOf(i11))) == null)) {
            ArrayList arrayList = new ArrayList();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                b.a aVar = (b.a) weakReference.get();
                if (aVar == null || aVar == this) {
                    arrayList.add(weakReference);
                }
            }
            hashSet.removeAll(arrayList);
        }
        this.f1932a = i10;
        if (i10 != -1) {
            sharedValues.a(i10, this);
        }
    }

    public void setGuidelineBegin(int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f1866a = i10;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f1868b = i10;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f10) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.f1870c = f10;
        setLayoutParams(layoutParams);
    }

    public void setVisibility(int i10) {
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
        a(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
        a(attributeSet);
    }
}
