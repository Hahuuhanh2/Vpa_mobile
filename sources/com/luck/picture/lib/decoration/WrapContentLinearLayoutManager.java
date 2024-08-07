package com.luck.picture.lib.decoration;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class WrapContentLinearLayoutManager extends LinearLayoutManager {
    public WrapContentLinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
    }

    public final void o0(RecyclerView.s sVar, RecyclerView.w wVar) {
        try {
            super.o0(sVar, wVar);
        } catch (IndexOutOfBoundsException e10) {
            e10.printStackTrace();
        }
    }

    public WrapContentLinearLayoutManager() {
        super(1);
    }
}
