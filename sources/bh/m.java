package bh;

import al.d0;
import bc.h;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.api.request.UpdatePersonProfile;
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

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$register$1", f = "LoginViewModel.kt", l = {152}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class m extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19148a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19149b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m(LoginViewModel loginViewModel, d<? super m> dVar) {
        super(2, dVar);
        this.f19149b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new m(this.f19149b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
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
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19148a;
        String str8 = null;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f19149b.f19557p.k(f.b.f18005a);
            LoginViewModel loginViewModel = this.f19149b;
            User user = (User) loginViewModel.L.f8545b;
            if (user != null) {
                str = user.getFullname();
            } else {
                str = null;
            }
            User user2 = (User) this.f19149b.L.f8545b;
            if (user2 != null) {
                str2 = user2.getPhone();
            } else {
                str2 = null;
            }
            User user3 = (User) this.f19149b.L.f8545b;
            if (user3 != null) {
                str3 = user3.getIdentityNumber();
            } else {
                str3 = null;
            }
            User user4 = (User) this.f19149b.L.f8545b;
            if (user4 != null) {
                str4 = user4.getEmail();
            } else {
                str4 = null;
            }
            User user5 = (User) this.f19149b.L.f8545b;
            if (user5 != null) {
                str5 = user5.getPhoneVerificationCode();
            } else {
                str5 = null;
            }
            User user6 = (User) this.f19149b.L.f8545b;
            if (user6 != null) {
                str6 = user6.getPassword();
            } else {
                str6 = null;
            }
            User user7 = (User) this.f19149b.L.f8545b;
            if (user7 != null) {
                str7 = user7.getRePass();
            } else {
                str7 = null;
            }
            UpdatePersonProfile updatePersonProfile = new UpdatePersonProfile((String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (String) null, str4, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, str, str3, (Long) null, (String) null, str2, (String) null, (String) null, (String) null, str5, str6, str7, this.f19149b.f19545d.c(), 60639, (sk.e) null);
            loginViewModel.getClass();
            loginViewModel.J = updatePersonProfile;
            LoginViewModel loginViewModel2 = this.f19149b;
            AuthApiHelper authApiHelper = loginViewModel2.f19546e;
            UpdatePersonProfile updatePersonProfile2 = loginViewModel2.J;
            this.f19148a = 1;
            obj2 = authApiHelper.register(updatePersonProfile2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
                obj2 = obj;
            } catch (Exception e10) {
                e = e10;
                r2.p<f<Auth>> pVar = this.f19149b.f19557p;
                try {
                    if (e instanceof HttpException) {
                        y<?> yVar = ((HttpException) e).f22764a;
                        if (!(yVar == null || (responseBody = yVar.f23248c) == null)) {
                            str8 = responseBody.q();
                        }
                        try {
                            String str9 = (String) fk.p.N0(((k) new h().d(k.class, str8)).c());
                            if (str9 == null) {
                                str9 = "Error";
                            }
                            e = new Exception(str9);
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
                LoginViewModel loginViewModel3 = this.f19149b;
                if (auth.getSuccess()) {
                    r2.p<f<Auth>> pVar2 = loginViewModel3.f19557p;
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
                    loginViewModel3.f19557p.k(new f.a(new Exception(auth.getMessage())));
                }
            }
        } else {
            this.f19149b.f19557p.k(new f.a(new Exception((String) fk.p.M0(kVar.c()))));
        }
        return ek.i.f20112a;
    }
}
