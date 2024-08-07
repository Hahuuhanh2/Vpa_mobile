package bh;

import al.d0;
import android.os.Build;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.api.request.DeviceRequest;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ik.d;
import java.math.BigInteger;
import java.security.MessageDigest;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;
import yk.l;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$updateDevice$1", f = "LoginViewModel.kt", l = {648}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class r extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19159a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19160b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(LoginViewModel loginViewModel, d<? super r> dVar) {
        super(2, dVar);
        this.f19160b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new r(this.f19160b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19159a;
        if (i10 == 0) {
            l0.Q0(obj);
            String c10 = this.f19160b.f19545d.c();
            j.f(c10, "<this>");
            MessageDigest instance = MessageDigest.getInstance("MD5");
            byte[] bytes = c10.getBytes(yk.a.f23582b);
            j.e(bytes, "this as java.lang.String).getBytes(charset)");
            String bigInteger = new BigInteger(1, instance.digest(bytes)).toString(16);
            j.e(bigInteger, "toString(...)");
            String Y0 = l.Y0(bigInteger, 32);
            String c11 = this.f19160b.f19545d.c();
            StringBuilder sb2 = new StringBuilder();
            String str = Build.MANUFACTURER;
            sb2.append(str);
            sb2.append(" - ");
            String str2 = Build.MODEL;
            sb2.append(str2);
            String sb3 = sb2.toString();
            DeviceRequest deviceRequest = new DeviceRequest(Y0, str + " - " + str2 + " - " + Build.VERSION.RELEASE + " - 2", sb3, "ANDROID", c11);
            AuthApiHelper authApiHelper = this.f19160b.f19546e;
            this.f19159a = 1;
            if (authApiHelper.updateDevice(deviceRequest, this) == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ek.i.f20112a;
    }
}
