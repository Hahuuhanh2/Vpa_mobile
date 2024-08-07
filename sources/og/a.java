package og;

import al.d0;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.vpa.daugia.C0540R$string;
import com.vpa.daugia.module.auth.ui.activity.AuthActivity;
import ik.d;
import kf.h;
import kk.e;
import kk.i;
import lg.b;
import p3.l0;
import rk.p;

@e(c = "com.vpa.daugia.di.module.ApiModule$provideOkHttpClient$2$intercept$1", f = "ApiModule.kt", l = {}, m = "invokeSuspend")
/* compiled from: ApiModule.kt */
public final class a extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f21787a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f21788b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, b bVar, d<? super a> dVar) {
        super(2, dVar);
        this.f21787a = context;
        this.f21788b = bVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a(this.f21787a, this.f21788b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        l0.Q0(obj);
        try {
            Context context = this.f21787a;
            Toast.makeText(context, context.getString(C0540R$string.login_to_continue), 1).show();
            this.f21788b.h("");
            this.f21788b.j(Boolean.FALSE, "IS_SHOW_BIOMETRIC");
            this.f21788b.l(false);
            Intent intent = new Intent(this.f21787a, AuthActivity.class);
            intent.setFlags(268468224);
            this.f21787a.getApplicationContext().startActivity(intent);
        } catch (Exception e10) {
            h.a(e10);
        }
        return ek.i.f20112a;
    }
}
