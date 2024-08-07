package dh;

import al.d0;
import com.vpa.daugia.module.cart.data.api.CartApiHelper;
import com.vpa.daugia.module.cart.ui.CartViewModel;
import ef.k;
import ik.d;
import java.util.ArrayList;
import jk.a;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.cart.ui.CartViewModel$getDetailByOrderId$1", f = "CartViewModel.kt", l = {134}, m = "invokeSuspend")
/* compiled from: CartViewModel.kt */
public final class f extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19935a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CartViewModel f19936b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f19937c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(CartViewModel cartViewModel, String str, d<? super f> dVar) {
        super(2, dVar);
        this.f19936b = cartViewModel;
        this.f19937c = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new f(this.f19936b, this.f19937c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f19935a;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f19936b.f19608o.k(f.b.f18005a);
            CartApiHelper cartApiHelper = this.f19936b.f19597d;
            String str = this.f19937c;
            this.f19935a = 1;
            obj = cartApiHelper.getDetailByOrderId(str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                l.p(e10, this.f19936b.f19608o);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = (ArrayList) ((k) obj).d();
        if (arrayList != null) {
            this.f19936b.f19608o.k(new f.c(arrayList));
        }
        return ek.i.f20112a;
    }
}
