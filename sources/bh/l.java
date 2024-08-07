package bh;

import al.d0;
import bc.h;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.api.request.RefreshTokenRequest;
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
import ze.f;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$refreshToken$1", f = "LoginViewModel.kt", l = {757}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class l extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19146a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19147b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(LoginViewModel loginViewModel, d<? super l> dVar) {
        super(2, dVar);
        this.f19147b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new l(this.f19147b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19146a;
        String str = null;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f19147b.f19555n.k(f.b.f18005a);
            String d10 = this.f19147b.f19545d.d("PREF_KEY_REFRESH_TOKEN");
            String c10 = this.f19147b.f19545d.c();
            j.f(c10, "<this>");
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = c10.getBytes(yk.a.f23582b);
            j.e(bytes, "this as java.lang.String).getBytes(charset)");
            String bigInteger = new BigInteger(1, instance.digest(bytes)).toString(16);
            j.e(bigInteger, "toString(...)");
            RefreshTokenRequest refreshTokenRequest = new RefreshTokenRequest(d10, yk.l.Y0(bigInteger, 32));
            AuthApiHelper authApiHelper = this.f19147b.f19546e;
            this.f19146a = 1;
            obj = authApiHelper.refreshToken(refreshTokenRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                r2.p<f<Auth>> pVar = this.f19147b.f19555n;
                try {
                    if (e instanceof HttpException) {
                        y<?> yVar = ((HttpException) e).f22764a;
                        if (!(yVar == null || (responseBody = yVar.f23248c) == null)) {
                            str = responseBody.q();
                        }
                        try {
                            String str2 = (String) fk.p.N0(((k) new h().d(k.class, str)).c());
                            if (str2 == null) {
                                str2 = "Error";
                            }
                            e = new Exception(str2);
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
                LoginViewModel loginViewModel = this.f19147b;
                if (auth.getSuccess()) {
                    b bVar = loginViewModel.f19545d;
                    String accessToken = auth.getAccessToken();
                    String str3 = "";
                    if (accessToken == null) {
                        accessToken = str3;
                    }
                    bVar.h(accessToken);
                    b bVar2 = loginViewModel.f19545d;
                    String refreshToken = auth.getRefreshToken();
                    if (refreshToken != null) {
                        str3 = refreshToken;
                    }
                    bVar2.k(str3);
                    if (!j.a(loginViewModel.f19545d.f20850a.getString("PREF_KEY_CURRENT_USER_ID", (String) null), auth.getUserId())) {
                        loginViewModel.f19545d.j(Boolean.FALSE, "isUsedBiometric");
                    }
                    loginViewModel.f19545d.j(Boolean.valueOf(true ^ j.a(loginViewModel.f19545d.f20850a.getString("PREF_KEY_CURRENT_USER_ID", (String) null), auth.getUserId())), "IS_SHOW_BIOMETRIC");
                    b bVar3 = loginViewModel.f19545d;
                    bVar3.f20850a.edit().putString("PREF_KEY_CURRENT_USER_ID", auth.getUserId()).apply();
                    loginViewModel.h((Auth) kVar.d());
                    LoginViewModel.f(loginViewModel);
                } else {
                    r2.p<f<Auth>> pVar2 = loginViewModel.f19555n;
                    pVar2.k(new f.a(new Exception(auth.getMessage() + ", vui lòng đăng nhập bằng mật khẩu")));
                }
            }
        } else {
            r2.p<f<Auth>> pVar3 = this.f19147b.f19555n;
            pVar3.k(new f.a(new Exception(((String) fk.p.M0(kVar.c())) + ", vui lòng đăng nhập bằng mật khẩu")));
        }
        return ek.i.f20112a;
    }
}
