package bh;

import al.d0;
import bc.h;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.api.request.RegisterORG;
import com.vpa.daugia.module.auth.data.model.Auth;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ef.k;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import lg.b;
import okhttp3.ResponseBody;
import p3.l0;
import retrofit2.HttpException;
import rk.p;
import ul.y;
import ze.f;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$registerORG$1", f = "LoginViewModel.kt", l = {191}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class n extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19150a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19151b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(LoginViewModel loginViewModel, d<? super n> dVar) {
        super(2, dVar);
        this.f19151b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new n(this.f19151b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19150a;
        String str10 = null;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f19151b.f19559r.k(f.b.f18005a);
            LoginViewModel loginViewModel = this.f19151b;
            User user = (User) loginViewModel.L.f8545b;
            if (user != null) {
                str = user.getCompanyName();
            } else {
                str = null;
            }
            User user2 = (User) this.f19151b.L.f8545b;
            if (user2 != null) {
                str2 = user2.getContactPersonName();
            } else {
                str2 = null;
            }
            User user3 = (User) this.f19151b.L.f8545b;
            if (user3 != null) {
                str3 = user3.getContactPersonName();
            } else {
                str3 = null;
            }
            User user4 = (User) this.f19151b.L.f8545b;
            if (user4 != null) {
                str4 = user4.getRepresentativeRole();
            } else {
                str4 = null;
            }
            User user5 = (User) this.f19151b.L.f8545b;
            if (user5 != null) {
                str5 = user5.getRepresentativeRole();
            } else {
                str5 = null;
            }
            User user6 = (User) this.f19151b.L.f8545b;
            if (user6 != null) {
                str6 = user6.getPassword();
            } else {
                str6 = null;
            }
            User user7 = (User) this.f19151b.L.f8545b;
            if (user7 != null) {
                str7 = user7.getRePass();
            } else {
                str7 = null;
            }
            User user8 = (User) this.f19151b.L.f8545b;
            if (user8 != null) {
                str8 = user8.getPhone();
            } else {
                str8 = null;
            }
            User user9 = (User) this.f19151b.L.f8545b;
            if (user9 != null) {
                str9 = user9.getPhoneVerificationCode();
            } else {
                str9 = null;
            }
            RegisterORG registerORG = new RegisterORG((String) null, (String) null, (String) null, (String) null, str, (ContactPersonIdentityCard) null, str2, str4, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (Long) null, (String) null, str8, (String) null, (String) null, (String) null, str5, str3, str6, str7, str9, 491311, (sk.e) null);
            loginViewModel.getClass();
            loginViewModel.K = registerORG;
            LoginViewModel loginViewModel2 = this.f19151b;
            AuthApiHelper authApiHelper = loginViewModel2.f19546e;
            RegisterORG registerORG2 = loginViewModel2.K;
            this.f19150a = 1;
            obj2 = authApiHelper.registerORG(registerORG2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
                obj2 = obj;
            } catch (Exception e10) {
                e = e10;
                r2.p<f<Auth>> pVar = this.f19151b.f19559r;
                try {
                    if (e instanceof HttpException) {
                        y<?> yVar = ((HttpException) e).f22764a;
                        if (!(yVar == null || (responseBody = yVar.f23248c) == null)) {
                            str10 = responseBody.q();
                        }
                        try {
                            String str11 = (String) fk.p.N0(((k) new h().d(k.class, str10)).c());
                            if (str11 == null) {
                                str11 = "Error";
                            }
                            e = new Exception(str11);
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
        k kVar = (k) obj2;
        if (kVar.e()) {
            Auth auth = (Auth) kVar.d();
            if (auth != null) {
                LoginViewModel loginViewModel3 = this.f19151b;
                if (auth.getSuccess()) {
                    r2.p<f<Auth>> pVar2 = loginViewModel3.f19559r;
                    Auth auth2 = (Auth) kVar.d();
                    if (auth2 == null) {
                        auth2 = new Auth((String) null, (Integer) null, (String) null, (String) null, false, false, (String) null, (String) null, (String) null, (String) null, 1023, (sk.e) null);
                    }
                    pVar2.k(new f.c(auth2));
                    b bVar = loginViewModel3.f19545d;
                    String accessToken = auth.getAccessToken();
                    if (accessToken == null) {
                        accessToken = "";
                    }
                    bVar.h(accessToken);
                    LoginViewModel.f(loginViewModel3);
                    loginViewModel3.h((Auth) null);
                } else {
                    loginViewModel3.f19559r.k(new f.a(new Exception(auth.getMessage())));
                }
            }
        } else {
            this.f19151b.f19559r.k(new f.a(new Exception((String) fk.p.M0(kVar.c()))));
        }
        return ek.i.f20112a;
    }
}
