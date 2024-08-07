package bh;

import al.d0;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import ef.k;
import ik.d;
import jk.a;
import kk.e;
import lg.b;
import p3.l0;
import rk.p;

@e(c = "com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel$logout$1", f = "LoginViewModel.kt", l = {796}, m = "invokeSuspend")
/* compiled from: LoginViewModel.kt */
public final class i extends kk.i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19140a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoginViewModel f19141b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(LoginViewModel loginViewModel, d<? super i> dVar) {
        super(2, dVar);
        this.f19141b = loginViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new i(this.f19141b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19140a;
        if (i10 == 0) {
            l0.Q0(obj);
            AuthApiHelper authApiHelper = this.f19141b.f19546e;
            this.f19140a = 1;
            obj2 = authApiHelper.logout(this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
                obj2 = obj;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = (k) obj2;
        b bVar = this.f19141b.f19545d;
        User user = r3;
        User user2 = new User((Integer) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (String) null, (Object) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, (Object) null, (String) null, (Integer) null, (Object) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (sk.e) null);
        bVar.g(user2);
        this.f19141b.f19545d.h("");
        this.f19141b.f19545d.i("");
        this.f19141b.f19545d.k("");
        b bVar2 = this.f19141b.f19545d;
        Boolean bool = Boolean.FALSE;
        bVar2.j(bool, "isUsedBiometric");
        this.f19141b.f19545d.j(bool, "IS_SHOW_BIOMETRIC");
        this.f19141b.f19545d.j("", "DATA_USER_AUCTION");
        this.f19141b.f19545d.l(false);
        return ek.i.f20112a;
    }
}
