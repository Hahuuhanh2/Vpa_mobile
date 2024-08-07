package yg;

import al.r0;
import android.content.Intent;
import android.view.View;
import bh.h;
import com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import mg.i3;
import of.a;
import of.b;
import p3.l0;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23544a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f23545b;

    public /* synthetic */ d(g gVar, int i10) {
        this.f23544a = i10;
        this.f23545b = gVar;
    }

    public final void onClick(View view) {
        switch (this.f23544a) {
            case 0:
                g gVar = this.f23545b;
                int i10 = g.f23548q0;
                j.f(gVar, "this$0");
                boolean z10 = false;
                if (((i3) gVar.i0()).f21114z.b()) {
                    View view2 = ((i3) gVar.i0()).f8554e;
                    j.e(view2, "getRoot(...)");
                    new a(view2).a(((i3) gVar.i0()).f21114z.getValidatorTypeText(), b.ERROR);
                    ((i3) gVar.i0()).f21114z.requestFocus();
                } else if (((i3) gVar.i0()).A.b()) {
                    View view3 = ((i3) gVar.i0()).f8554e;
                    j.e(view3, "getRoot(...)");
                    new a(view3).a(((i3) gVar.i0()).A.getValidatorTypeText(), b.ERROR);
                    ((i3) gVar.i0()).A.requestFocus();
                } else {
                    z10 = true;
                }
                if (z10) {
                    LoginViewModel o02 = gVar.o0();
                    l0.j0(l0.d0(o02), r0.f19085b, new h(o02, (ik.d<? super h>) null), 2);
                    return;
                }
                return;
            default:
                g gVar2 = this.f23545b;
                int i11 = g.f23548q0;
                j.f(gVar2, "this$0");
                gVar2.h0(new Intent(gVar2.d0(), RegisterAccountActivity.class));
                return;
        }
    }
}
