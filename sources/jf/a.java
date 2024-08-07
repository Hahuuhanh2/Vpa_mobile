package jf;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import com.google.android.material.bottomsheet.b;
import com.google.android.material.bottomsheet.c;
import com.google.android.material.datepicker.q;
import com.google.android.material.search.h;
import com.ots.core.R$layout;
import d2.f;
import d2.l;
import hf.e;
import sk.j;

/* compiled from: ActionDialog.kt */
public final class a extends c {

    /* renamed from: w0  reason: collision with root package name */
    public static final /* synthetic */ int f11885w0 = 0;

    /* renamed from: u0  reason: collision with root package name */
    public e f11886u0;

    /* renamed from: v0  reason: collision with root package name */
    public C0130a f11887v0;

    /* renamed from: jf.a$a  reason: collision with other inner class name */
    /* compiled from: ActionDialog.kt */
    public interface C0130a {
        void a(String str);
    }

    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        j.f(layoutInflater, "inflater");
        LayoutInflater layoutInflater2 = this.Q;
        if (layoutInflater2 == null) {
            layoutInflater2 = P((Bundle) null);
            this.Q = layoutInflater2;
        }
        int i10 = e.f10785y;
        DataBinderMapperImpl dataBinderMapperImpl = f.f8544a;
        e eVar = (e) l.l(layoutInflater2, R$layout.dialog_action_image, viewGroup, (Object) null);
        this.f11886u0 = eVar;
        if (eVar != null) {
            return eVar.f8554e;
        }
        return null;
    }

    public final void W(View view, Bundle bundle) {
        j.f(view, "view");
        e eVar = this.f11886u0;
        if (eVar != null) {
            eVar.f10786w.setOnClickListener(new q(this, 3));
            eVar.f10787x.setOnClickListener(new h(this, 3));
        }
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            b bVar = (b) dialog;
            if (bVar.f5863f == null) {
                bVar.f();
            }
            bVar.f5863f.K(3);
        }
    }
}
