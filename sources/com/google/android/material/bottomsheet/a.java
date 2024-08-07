package com.google.android.material.bottomsheet;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.b;
import w1.q;
import w1.w0;

/* compiled from: BottomSheetDialog */
public final class a implements q {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f5862a;

    public a(b bVar) {
        this.f5862a = bVar;
    }

    public final w0 g(View view, w0 w0Var) {
        b bVar = this.f5862a;
        b.C0061b bVar2 = bVar.f5870t;
        if (bVar2 != null) {
            bVar.f5863f.f5812e0.remove(bVar2);
        }
        b bVar3 = this.f5862a;
        bVar3.f5870t = new b.C0061b(bVar3.f5866p, w0Var);
        b bVar4 = this.f5862a;
        bVar4.f5870t.e(bVar4.getWindow());
        b bVar5 = this.f5862a;
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = bVar5.f5863f;
        b.C0061b bVar6 = bVar5.f5870t;
        if (!bottomSheetBehavior.f5812e0.contains(bVar6)) {
            bottomSheetBehavior.f5812e0.add(bVar6);
        }
        return w0Var;
    }
}
