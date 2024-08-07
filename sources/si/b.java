package si;

import al.d0;
import com.vpa.daugia.module.support.data.api.SupportApiHelper;
import com.vpa.daugia.module.support.ui.SupportViewModel;
import ik.d;
import java.util.ArrayList;
import jk.a;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.support.ui.SupportViewModel$getCategory$1", f = "SupportViewModel.kt", l = {60}, m = "invokeSuspend")
/* compiled from: SupportViewModel.kt */
public final class b extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f22909a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SupportViewModel f22910b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(SupportViewModel supportViewModel, d<? super b> dVar) {
        super(2, dVar);
        this.f22910b = supportViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new b(this.f22910b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f22909a;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f22910b.f19891g.k(f.b.f18005a);
            SupportApiHelper supportApiHelper = this.f22910b.f19888d;
            this.f22909a = 1;
            obj = supportApiHelper.getCategory(this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                l.p(e10, this.f22910b.f19891g);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f22910b.f19891g.k(new f.c((ArrayList) obj));
        return ek.i.f20112a;
    }
}
