package rh;

import al.d0;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.menu.ui.MenuViewModel;
import ef.k;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import lg.b;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.menu.ui.MenuViewModel$logout$1", f = "MenuViewModel.kt", l = {93}, m = "invokeSuspend")
/* compiled from: MenuViewModel.kt */
public final class c extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f22788a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MenuViewModel f22789b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(MenuViewModel menuViewModel, d<? super c> dVar) {
        super(2, dVar);
        this.f22789b = menuViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new c(this.f22789b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f22788a;
        if (i10 == 0) {
            l0.Q0(obj);
            AuthApiHelper authApiHelper = this.f22789b.f19749e;
            this.f22788a = 1;
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
                l.p(e10, this.f22789b.f19751g);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b bVar = this.f22789b.f19748d;
        User user = r4;
        User user2 = new User((Integer) null, (String) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (Object) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (ContactPersonIdentityCard) null, (ContactPersonIdentityCard) null, (String) null, (String) null, (String) null, (Object) null, (Long) null, (String) null, (Long) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (Integer) null, (String) null, (Object) null, (String) null, (Integer) null, (Object) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, -1, 8191, (sk.e) null);
        bVar.g(user2);
        this.f22789b.f19748d.h("");
        this.f22789b.f19748d.i("");
        this.f22789b.f19748d.k("");
        b bVar2 = this.f22789b.f19748d;
        Boolean bool = Boolean.FALSE;
        bVar2.j(bool, "isUsedBiometric");
        this.f22789b.f19748d.j(bool, "IS_SHOW_BIOMETRIC");
        this.f22789b.f19748d.j("", "DATA_USER_AUCTION");
        this.f22789b.f19748d.l(false);
        r2.p<f<Object>> pVar = this.f22789b.f19751g;
        Object d10 = ((k) obj2).d();
        if (d10 == null) {
            d10 = new Object();
        }
        pVar.k(new f.c(d10));
        return ek.i.f20112a;
    }
}
