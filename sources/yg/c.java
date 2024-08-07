package yg;

import al.r0;
import android.content.Intent;
import android.view.View;
import bh.i;
import com.vpa.daugia.module.auth.ui.activity.ForgotActivity;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import com.vpa.daugia.ui.MainActivity;
import ik.d;
import p3.l0;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23542a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g f23543b;

    public /* synthetic */ c(g gVar, int i10) {
        this.f23542a = i10;
        this.f23543b = gVar;
    }

    public final void onClick(View view) {
        switch (this.f23542a) {
            case 0:
                g gVar = this.f23543b;
                int i10 = g.f23548q0;
                j.f(gVar, "this$0");
                LoginViewModel o02 = gVar.o0();
                l0.j0(l0.d0(o02), r0.f19085b, new i(o02, (d<? super i>) null), 2);
                Intent intent = new Intent(gVar.d0(), MainActivity.class);
                intent.setFlags(268435456);
                gVar.d0().startActivity(intent);
                return;
            default:
                g gVar2 = this.f23543b;
                int i11 = g.f23548q0;
                j.f(gVar2, "this$0");
                gVar2.h0(new Intent(gVar2.d0(), ForgotActivity.class));
                return;
        }
    }
}
