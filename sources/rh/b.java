package rh;

import al.d0;
import com.vpa.daugia.module.auth.data.api.AuthApiHelper;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.menu.ui.MenuViewModel;
import ef.k;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import p3.l0;
import rk.p;

@e(c = "com.vpa.daugia.module.menu.ui.MenuViewModel$getProfile$1", f = "MenuViewModel.kt", l = {70}, m = "invokeSuspend")
/* compiled from: MenuViewModel.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f22786a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ MenuViewModel f22787b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(MenuViewModel menuViewModel, d<? super b> dVar) {
        super(2, dVar);
        this.f22787b = menuViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(this.f22787b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f22786a;
        if (i10 == 0) {
            l0.Q0(obj);
            AuthApiHelper authApiHelper = this.f22787b.f19749e;
            this.f22786a = 1;
            obj = authApiHelper.getProfile(this);
            if (obj == aVar) {
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
        k kVar = (k) obj;
        User user = (User) kVar.d();
        if (user != null) {
            MenuViewModel menuViewModel = this.f22787b;
            if (kVar.e()) {
                menuViewModel.f19748d.g(user);
                menuViewModel.f19752h.k(user);
            }
        }
        return ek.i.f20112a;
    }
}
