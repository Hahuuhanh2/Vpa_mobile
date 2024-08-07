package bh;

import al.d0;
import bc.h;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.api.request.RecoverOtpRequest;
import com.vpa.daugia.module.auth.data.api.response.CheckRecover;
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

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$checkOtpPhone$1", f = "LoginViewModel.kt", l = {540}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class c extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19124a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19125b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(LoginViewModel loginViewModel, d<? super c> dVar) {
        super(2, dVar);
        this.f19125b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new c(this.f19125b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19124a;
        String str3 = null;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f19125b.f19567z.k(f.b.f18005a);
            User user = (User) this.f19125b.L.f8545b;
            if (user != null) {
                str = user.getPhoneVerificationCode();
            } else {
                str = null;
            }
            User user2 = (User) this.f19125b.L.f8545b;
            if (user2 != null) {
                str2 = user2.getPhone();
            } else {
                str2 = null;
            }
            RecoverOtpRequest recoverOtpRequest = new RecoverOtpRequest((String) null, str2, str, (String) null, 9, (sk.e) null);
            AuthApiHelper authApiHelper = this.f19125b.f19546e;
            this.f19124a = 1;
            obj = authApiHelper.checkOtpPhone(recoverOtpRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                r2.p<f<CheckRecover>> pVar = this.f19125b.f19567z;
                try {
                    if (e instanceof HttpException) {
                        y<?> yVar = ((HttpException) e).f22764a;
                        if (!(yVar == null || (responseBody = yVar.f23248c) == null)) {
                            str3 = responseBody.q();
                        }
                        try {
                            String str4 = (String) fk.p.N0(((k) new h().d(k.class, str3)).c());
                            if (str4 == null) {
                                str4 = "Error";
                            }
                            e = new Exception(str4);
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
        CheckRecover checkRecover = (CheckRecover) obj;
        if (checkRecover.getSuccess()) {
            this.f19125b.f19567z.k(new f.c(checkRecover));
        } else {
            this.f19125b.f19567z.k(new f.a(new Exception(checkRecover.getMessage())));
        }
        return ek.i.f20112a;
    }
}
