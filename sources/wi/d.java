package wi;

import al.d0;
import android.app.Application;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaClient;
import com.vpa.daugia.ui.MainActivity;
import ek.f;
import jk.a;
import kf.h;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;
import sk.j;

@e(c = "com.vpa.daugia.ui.MainActivity$initializeRecaptchaClient$1", f = "MainActivity.kt", l = {439}, m = "invokeSuspend")
/* compiled from: MainActivity.kt */
public final class d extends i implements p<d0, ik.d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23425a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MainActivity f23426b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(MainActivity mainActivity, ik.d<? super d> dVar) {
        super(2, dVar);
        this.f23426b = mainActivity;
    }

    public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
        return new d(this.f23426b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f23425a;
        if (i10 == 0) {
            l0.Q0(obj);
            Recaptcha recaptcha = Recaptcha.INSTANCE;
            Application application = this.f23426b.getApplication();
            j.e(application, "getApplication(...)");
            this.f23425a = 1;
            obj2 = Recaptcha.m4getClientBWLJW6A$default(recaptcha, application, "6LceyQoqAAAAADRCKPLWlXxJlGDiS6ufXZmdI-3Q", 0, this, 4, (Object) null);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.Q0(obj);
            obj2 = ((f) obj).f20104a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        MainActivity mainActivity = this.f23426b;
        if (!(obj2 instanceof f.a)) {
            RecaptchaClient recaptchaClient = (RecaptchaClient) obj2;
            mainActivity.U = recaptchaClient;
            int i11 = h.f12560a;
            String.valueOf(recaptchaClient);
        }
        Throwable a10 = f.a(obj2);
        if (a10 != null) {
            a10.printStackTrace();
        }
        return ek.i.f20112a;
    }
}
