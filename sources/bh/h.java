package bh;

import al.d0;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.api.request.AuthRequest;
import com.vpa.daugia.module.auth.data.model.Auth;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ef.k;
import ik.d;
import java.math.BigInteger;
import java.security.MessageDigest;
import jk.a;
import kk.e;
import kk.i;
import lg.b;
import okhttp3.ResponseBody;
import p3.l0;
import retrofit2.HttpException;
import rk.p;
import sk.j;
import ul.y;
import yk.l;
import ze.f;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$login$1", f = "LoginViewModel.kt", l = {710}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class h extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19138a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19139b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(LoginViewModel loginViewModel, d<? super h> dVar) {
        super(2, dVar);
        this.f19139b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new h(this.f19139b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19138a;
        String str = null;
        String str2 = "";
        if (i10 == 0) {
            l0.Q0(obj);
            this.f19139b.f19555n.k(f.b.f18005a);
            LoginViewModel loginViewModel = this.f19139b;
            String str3 = (String) loginViewModel.f19550i.f8545b;
            String str4 = (String) loginViewModel.f19551j.f8545b;
            if (str4 == null) {
                str4 = str2;
            }
            String c10 = loginViewModel.f19545d.c();
            String c11 = this.f19139b.f19545d.c();
            j.f(c11, "<this>");
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = c11.getBytes(yk.a.f23582b);
            j.e(bytes, "this as java.lang.String).getBytes(charset)");
            String bigInteger = new BigInteger(1, instance.digest(bytes)).toString(16);
            j.e(bigInteger, "toString(...)");
            AuthRequest authRequest = new AuthRequest(str3, str4, c10, l.Y0(bigInteger, 32));
            AuthApiHelper authApiHelper = this.f19139b.f19546e;
            this.f19138a = 1;
            obj = authApiHelper.login(authRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                r2.p<f<Auth>> pVar = this.f19139b.f19555n;
                try {
                    if (e instanceof HttpException) {
                        y<?> yVar = ((HttpException) e).f22764a;
                        if (!(yVar == null || (responseBody = yVar.f23248c) == null)) {
                            str = responseBody.q();
                        }
                        try {
                            String str5 = (String) fk.p.N0(((k) new bc.h().d(k.class, str)).c());
                            if (str5 == null) {
                                str5 = "Error";
                            }
                            e = new Exception(str5);
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
            Auth auth = (Auth) kVar.d();
            if (auth != null) {
                LoginViewModel loginViewModel2 = this.f19139b;
                if (auth.getSuccess()) {
                    b bVar = loginViewModel2.f19545d;
                    String accessToken = auth.getAccessToken();
                    if (accessToken != null) {
                        str2 = accessToken;
                    }
                    bVar.h(str2);
                    loginViewModel2.f19545d.k(auth.getRefreshToken());
                    if (!j.a(loginViewModel2.f19545d.f20850a.getString("PREF_KEY_CURRENT_USER_ID", (String) null), auth.getUserId())) {
                        loginViewModel2.f19545d.j(Boolean.FALSE, "isUsedBiometric");
                    }
                    loginViewModel2.f19545d.j(Boolean.valueOf(true ^ j.a(loginViewModel2.f19545d.f20850a.getString("PREF_KEY_CURRENT_USER_ID", (String) null), auth.getUserId())), "IS_SHOW_BIOMETRIC");
                    b bVar2 = loginViewModel2.f19545d;
                    bVar2.f20850a.edit().putString("PREF_KEY_CURRENT_USER_ID", auth.getUserId()).apply();
                    loginViewModel2.h((Auth) kVar.d());
                    LoginViewModel.f(loginViewModel2);
                } else {
                    loginViewModel2.f19555n.k(new f.a(new Exception(auth.getMessage())));
                }
            }
        } else {
            this.f19139b.f19555n.k(new f.a(new Exception((String) fk.p.M0(kVar.c()))));
        }
        return ek.i.f20112a;
    }
}
