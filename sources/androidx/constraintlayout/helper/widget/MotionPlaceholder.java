package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import c1.i;
import c1.l;
import c1.m;

public class MotionPlaceholder extends VirtualLayout {
    public MotionPlaceholder(Context context) {
        super(context);
    }

    public final void n(AttributeSet attributeSet) {
        super.n(attributeSet);
        this.f1845d = new l();
        t();
    }

    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i10, int i11) {
        u((m) null, i10, i11);
    }

    public final void s(i iVar, SparseArray sparseArray) {
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

    public MotionPlaceholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MotionPlaceholder(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
