package bh;

import al.d0;
import bc.h;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ef.k;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import okhttp3.ResponseBody;
import p3.l0;
import retrofit2.HttpException;
import rk.p;
import ul.y;
import ze.f;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$getRecoverWithMail$1", f = "LoginViewModel.kt", l = {581}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class f extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19134a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19135b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(LoginViewModel loginViewModel, d<? super f> dVar) {
        super(2, dVar);
        this.f19135b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new f(this.f19135b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19134a;
        String str2 = null;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f19135b.f19563v.k(f.b.f18005a);
            LoginViewModel loginViewModel = this.f19135b;
            AuthApiHelper authApiHelper = loginViewModel.f19546e;
            User user = (User) loginViewModel.L.f8545b;
            if (user != null) {
                str = user.getEmail();
            } else {
                str = null;
            }
            this.f19134a = 1;
            obj = authApiHelper.getRecoverWithMail(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                r2.p<ze.f<Object>> pVar = this.f19135b.f19563v;
                try {
                    if (e instanceof HttpException) {
                        y<?> yVar = ((HttpException) e).f22764a;
                        if (!(yVar == null || (responseBody = yVar.f23248c) == null)) {
                            str2 = responseBody.q();
                        }
                        try {
                            String str3 = (String) fk.p.N0(((k) new h().d(k.class, str2)).c());
                            if (str3 == null) {
                                str3 = "Error";
                            }
                            e = new Exception(str3);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
                pVar.k(new f.a(e));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = (k) obj;
        if (kVar.e()) {
            this.f19135b.f19563v.k(new f.c(Boolean.valueOf(kVar.e())));
        } else {
            this.f19135b.f19563v.k(new f.a(new Exception((String) fk.p.M0(kVar.c()))));
        }
        return ek.i.f20112a;
    }
}
