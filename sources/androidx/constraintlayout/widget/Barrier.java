package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.a;
import c1.a;
import c1.e;
import c1.f;
import c1.j;

public class Barrier extends ConstraintHelper {

    /* renamed from: p  reason: collision with root package name */
    public int f1839p;

    /* renamed from: q  reason: collision with root package name */
    public int f1840q;

    /* renamed from: r  reason: collision with root package name */
    public a f1841r;

    public Barrier(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public boolean getAllowsGoneWidget() {
        return this.f1841r.f4383z0;
    }

    public int getMargin() {
        return this.f1841r.A0;
    }

    public int getType() {
        return this.f1839p;
    }

    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.f1841r = new a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == R$styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1841r.f4383z0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.f1841r.A0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f1845d = this.f1841r;
        t();
    }

    public final void o(a.C0016a aVar, j jVar, Constraints.LayoutParams layoutParams, SparseArray sparseArray) {
        super.o(aVar, jVar, layoutParams, sparseArray);
        if (jVar instanceof c1.a) {
            c1.a aVar2 = (c1.a) jVar;
            u(aVar2, aVar.f1951e.f1981g0, ((f) jVar.W).B0);
            a.b bVar = aVar.f1951e;
            aVar2.f4383z0 = bVar.f1997o0;
            aVar2.A0 = bVar.f1983h0;
        }
    }

    public final void p(e eVar, boolean z10) {
        u(eVar, this.f1839p, z10);
    }

    public void setAllowsGoneWidget(boolean z10) {
        this.f1841r.f4383z0 = z10;
    }

    public void setDpMargin(int i10) {
        this.f1841r.A0 = (int) ((((float) i10) * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i10) {
        this.f1841r.A0 = i10;
    }

    public void setType(int i10) {
        this.f1839p = i10;
    }

    public final void u(e eVar, int i10, boolean z10) {
        this.f1840q = i10;
        if (z10) {
            int i11 = this.f1839p;
            if (i11 == 5) {
                this.f1840q = 1;
            } else if (i11 == 6) {
                this.f1840q = 0;
            }
        } else {
            int i12 = this.f1839p;
            if (i12 == 5) {
                this.f1840q = 0;
            } else if (i12 == 6) {
                this.f1840q = 1;
            }
        }
        if (eVar instanceof c1.a) {
            ((c1.a) eVar).f4382y0 = this.f1840q;
        }
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public Barrier(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        super.setVisibility(8);
    }
}
