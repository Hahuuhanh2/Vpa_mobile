package dh;

import al.d0;
import com.vpa.daugia.module.cart.data.api.CartApiHelper;
import com.vpa.daugia.module.cart.data.api.request.RemoveCartRequest;
import com.vpa.daugia.module.cart.data.model.Cart;
import com.vpa.daugia.module.cart.data.model.CartStatus;
import com.vpa.daugia.module.cart.ui.CartViewModel;
import ef.k;
import ef.n;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.cart.ui.CartViewModel$removeCart$1", f = "CartViewModel.kt", l = {106}, m = "invokeSuspend")
/* compiled from: CartViewModel.kt */
public final class g extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19938a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CartViewModel f19939b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f19940c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(CartViewModel cartViewModel, String str, d<? super g> dVar) {
        super(2, dVar);
        this.f19939b = cartViewModel;
        this.f19940c = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new g(this.f19939b, this.f19940c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19938a;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f19939b.f19606m.k(f.b.f18005a);
            CartApiHelper cartApiHelper = this.f19939b.f19597d;
            RemoveCartRequest removeCartRequest = new RemoveCartRequest(j7.a.e(this.f19940c));
            this.f19938a = 1;
            obj = cartApiHelper.removeCart(removeCartRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                l.p(e10, this.f19939b.f19606m);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k kVar = (k) obj;
        if (kVar.e()) {
            r2.p<f<Object>> pVar = this.f19939b.f19606m;
            Object d10 = kVar.d();
            if (d10 == null) {
                d10 = "";
            }
            pVar.k(new f.c(d10));
            CartViewModel cartViewModel = this.f19939b;
            n<Cart> nVar = new n<>((Object) null);
            cartViewModel.getClass();
            cartViewModel.f19598e = nVar;
            this.f19939b.d(CartStatus.NOT_PAID);
        }
        return ek.i.f20112a;
    }
}
