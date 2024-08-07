package nh;

import al.d0;
import bc.h;
import com.vpa.daugia.module.home.data.api.HomeApiHelper;
import com.vpa.daugia.module.home.data.model.NewDetail;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ef.k;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import okhttp3.ResponseBody;
import p3.l0;
import retrofit2.HttpException;
import rk.p;
import ul.y;
import ze.f;

@e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$getArticle$1", f = "HomeViewModel.kt", l = {355}, m = "invokeSuspend")
/* compiled from: HomeViewModel.kt */
public final class u0 extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f21691a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f21692b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Long f21693c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0(HomeViewModel homeViewModel, Long l10, d<? super u0> dVar) {
        super(2, dVar);
        this.f21692b = homeViewModel;
        this.f21693c = l10;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new u0(this.f21692b, this.f21693c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u0) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f21691a;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f21692b.F.k(f.b.f18005a);
            HomeApiHelper homeApiHelper = this.f21692b.f19706d;
            Long l10 = this.f21693c;
            this.f21691a = 1;
            obj = homeApiHelper.getArticle(l10, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                r2.p<f<NewDetail>> pVar = this.f21692b.F;
                try {
                    if (e instanceof HttpException) {
                        y<?> yVar = ((HttpException) e).f22764a;
                        if (yVar == null || (responseBody = yVar.f23248c) == null) {
                            str = null;
                        } else {
                            str = responseBody.q();
                        }
                        try {
                            String str2 = (String) fk.p.N0(((k) new h().d(k.class, str)).c());
                            if (str2 == null) {
                                str2 = "Error";
                            }
                            e = new Exception(str2);
                        } catch (Exception unused) {
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                }
                pVar.k(new f.a(e));
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f21692b.F.k(new f.c((NewDetail) obj));
        return ek.i.f20112a;
    }
}
