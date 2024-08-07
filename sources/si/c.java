package si;

import al.d0;
import com.vpa.daugia.module.support.data.api.SupportApiHelper;
import com.vpa.daugia.module.support.data.api.request.FAQRequest;
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

@e(c = "com.vpa.daugia.module.support.ui.SupportViewModel$getFAQ$1", f = "SupportViewModel.kt", l = {45}, m = "invokeSuspend")
/* compiled from: SupportViewModel.kt */
public final class c extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f22911a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SupportViewModel f22912b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(SupportViewModel supportViewModel, d<? super c> dVar) {
        super(2, dVar);
        this.f22912b = supportViewModel;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new c(this.f22912b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f22911a;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f22912b.f19889e.k(f.b.f18005a);
            SupportApiHelper supportApiHelper = this.f22912b.f19888d;
            FAQRequest fAQRequest = new FAQRequest((String) null, 1, (sk.e) null);
            this.f22911a = 1;
            obj = supportApiHelper.getFAQ(fAQRequest, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                l.p(e10, this.f22912b.f19889e);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f22912b.f19889e.k(new f.c((ArrayList) obj));
        return ek.i.f20112a;
    }
}
