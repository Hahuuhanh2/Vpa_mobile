package yg;

import android.content.Intent;
import android.view.View;
import com.vpa.daugia.module.auth.data.model.Auth;
import com.vpa.daugia.ui.MainActivity;
import ek.i;
import mg.i3;
import of.a;
import of.b;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: LoginFragment.kt */
public final class f extends k implements l<ze.f<? extends Auth>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f23547a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(1);
        this.f23547a = gVar;
    }

    public final Object invoke(Object obj) {
        ze.f fVar = (ze.f) obj;
        if (fVar instanceof f.a) {
            this.f23547a.k0().dismiss();
            View view = ((i3) this.f23547a.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new a(view).a(((f.a) fVar).f18004a.getMessage(), b.ERROR);
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23547a.k0().show();
        } else if (fVar instanceof f.c) {
            this.f23547a.k0().dismiss();
            Intent intent = new Intent(this.f23547a.d0(), MainActivity.class);
            intent.setFlags(335544320);
            this.f23547a.h0(intent);
        }
        return i.f20112a;
    }
}
