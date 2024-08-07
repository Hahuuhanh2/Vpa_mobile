package yg;

import al.r0;
import android.widget.Toast;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ik.d;
import mg.i3;
import p3.l0;
import q.l;
import sk.j;

/* compiled from: LoginFragment.kt */
public final class e extends l.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f23546a;

    public e(g gVar) {
        this.f23546a = gVar;
    }

    public final void a(CharSequence charSequence) {
        j.f(charSequence, "errString");
        Toast.makeText(this.f23546a.d0(), charSequence, 0).show();
        ((i3) this.f23546a.i0()).A.requestFocus();
    }

    public final void b() {
        Toast.makeText(this.f23546a.d0(), this.f23546a.x(C0540R$string.authentication_failed), 0).show();
    }

    public final void c(l.b bVar) {
        j.f(bVar, "result");
        g gVar = this.f23546a;
        int i10 = g.f23548q0;
        LoginViewModel o02 = gVar.o0();
        l0.j0(l0.d0(o02), r0.f19085b, new bh.l(o02, (d<? super bh.l>) null), 2);
    }
}
