package com.ots.core.utils.customview;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.search.h;
import com.ots.core.R$layout;
import com.ots.core.utils.customview.textview.AppTextView;
import d2.f;
import d2.l;
import ek.g;
import java.util.ArrayList;
import mf.c;
import p002if.e;
import sk.j;
import sk.k;

/* compiled from: BaseBottomSheetSelectDialog.kt */
public final class a extends c {
    public static final /* synthetic */ int F0 = 0;
    public String A0;
    public boolean B0;
    public hf.a C0;
    public final g D0 = j7.a.b0(new b(this));
    public C0083a E0;

    /* renamed from: z0  reason: collision with root package name */
    public ArrayList<gf.b> f8386z0;

    /* renamed from: com.ots.core.utils.customview.a$a  reason: collision with other inner class name */
    /* compiled from: BaseBottomSheetSelectDialog.kt */
    public interface C0083a {
        void a(ArrayList<gf.b> arrayList, String str);
    }

    /* compiled from: BaseBottomSheetSelectDialog.kt */
    public static final class b extends k implements rk.a<e> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ a f8387a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.f8387a = aVar;
        }

        public final Object invoke() {
            a aVar = this.f8387a;
            return new e(aVar.B0, new b(aVar));
        }
    }

    public a(ArrayList<gf.b> arrayList, String str, boolean z10) {
        j.f(arrayList, "selectionItem");
        this.f8386z0 = arrayList;
        this.A0 = str;
        this.B0 = z10;
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        LayoutInflater layoutInflater2 = this.Q;
        if (layoutInflater2 == null) {
            layoutInflater2 = P((Bundle) null);
            this.Q = layoutInflater2;
        }
        int i10 = hf.a.A;
        DataBinderMapperImpl dataBinderMapperImpl = f.f8544a;
        hf.a aVar = (hf.a) l.l(layoutInflater2, R$layout.base_bottom_sheet_select_dialog, viewGroup, (Object) null);
        this.C0 = aVar;
        if (aVar != null) {
            return aVar.f8554e;
        }
        return null;
    }

    public final void W(View view, Bundle bundle) {
        AppTextView appTextView;
        j.f(view, "view");
        hf.a aVar = this.C0;
        if (!(aVar == null || (appTextView = aVar.f10774z) == null)) {
            appTextView.getText();
        }
        hf.a aVar2 = this.C0;
        if (aVar2 != null) {
            aVar2.f10774z.setText(this.A0);
            RecyclerView recyclerView = aVar2.f10773y;
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter((e) this.D0.getValue());
            d0();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            aVar2.f10771w.setOnClickListener(new h(this, 6));
            aVar2.f10772x.setOnClickListener(new com.google.android.material.textfield.b(this, 9));
        }
        ((e) this.D0.getValue()).A(this.f8386z0);
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            com.google.android.material.bottomsheet.b bVar = (com.google.android.material.bottomsheet.b) dialog;
            if (bVar.f5863f == null) {
                bVar.f();
            }
            bVar.f5863f.K(3);
        }
    }
}
