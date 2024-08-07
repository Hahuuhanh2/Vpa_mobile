package com.swnishan.materialdatetimepicker.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import sk.j;

/* compiled from: LowFlingRecyclerView.kt */
public final class LowFlingRecyclerView extends RecyclerView {
    public HashMap S0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LowFlingRecyclerView(Context context) {
        this(context, (AttributeSet) null);
        j.f(context, "context");
    }

    public final boolean J(int i10, int i11) {
        return super.J(i10, (int) (((double) i11) * 0.25d));
    }

    public final View r0(int i10) {
        if (this.S0 == null) {
            this.S0 = new HashMap();
        }
        View view = (View) this.S0.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i10);
        this.S0.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public LowFlingRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        j.f(context, "context");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LowFlingRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j.f(context, "context");
    }
}
