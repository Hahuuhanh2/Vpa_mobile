package si;

import al.d0;
import com.vpa.daugia.module.support.data.api.SupportApiHelper;
import com.vpa.daugia.module.support.data.model.Article;
import com.vpa.daugia.module.support.ui.SupportViewModel;
import ik.d;
import kk.e;
import kk.i;
import n0.l;
import p3.l0;
import rk.p;
import ze.f;

@e(c = "com.vpa.daugia.module.support.ui.SupportViewModel$getArticle$1", f = "SupportViewModel.kt", l = {74}, m = "invokeSuspend")
/* compiled from: SupportViewModel.kt */
public final class a extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f22906a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ SupportViewModel f22907b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Long f22908c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(SupportViewModel supportViewModel, Long l10, d<? super a> dVar) {
        super(2, dVar);
        this.f22907b = supportViewModel;
        this.f22908c = l10;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a(this.f22907b, this.f22908c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f22906a;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f22907b.f19893i.k(f.b.f18005a);
            SupportApiHelper supportApiHelper = this.f22907b.f19888d;
            Long l10 = this.f22908c;
            this.f22906a = 1;
            obj = supportApiHelper.getArticle(l10, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e10.printStackTrace();
                l.p(e10, this.f22907b.f19893i);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f22907b.f19893i.k(new f.c((Article) obj));
        return ek.i.f20112a;
    }
}
