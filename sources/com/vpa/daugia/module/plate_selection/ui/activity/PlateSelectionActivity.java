package com.vpa.daugia.module.plate_selection.ui.activity;

import ai.c;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ots.core.base.BaseActivity;
import com.ots.core.utils.customview.textview.AppTextView;
import com.vpa.daugia.C0535R$layout;
import com.vpa.daugia.C0540R$string;
import ek.g;
import mg.s0;
import sk.k;
import zh.d;

/* compiled from: PlateSelectionActivity.kt */
public final class PlateSelectionActivity extends BaseActivity<s0> {
    public static final /* synthetic */ int P = 0;
    public final g O = j7.a.b0(a.f19799a);

    /* compiled from: PlateSelectionActivity.kt */
    public static final class a extends k implements rk.a<di.a> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f19799a = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new di.a(a.f19800a);
        }
    }

    public final int N() {
        return C0535R$layout.activity_plate_selection;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((AppTextView) ((s0) M()).f21343z.f10530d).setText(getString(C0540R$string.selection_list));
        RecyclerView recyclerView = ((s0) M()).f21342y;
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        recyclerView.setAdapter((di.a) this.O.getValue());
        ((di.a) this.O.getValue()).A(j7.a.g0("", "", "", "", ""));
        ((ImageButton) ((s0) M()).f21343z.f10528b).setOnClickListener(new c(this, 1));
        ((s0) M()).f21340w.setOnClickListener(new d(this, 2));
    }
}
