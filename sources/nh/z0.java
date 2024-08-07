package nh;

import al.d0;
import bc.h;
import com.vpa.daugia.module.home.data.api.HomeApiHelper;
import com.vpa.daugia.module.home.data.model.News;
import com.vpa.daugia.module.home.ui.HomeViewModel;
import ef.k;
import ef.n;
import ik.d;
import java.util.ArrayList;
import jk.a;
import kk.e;
import kk.i;
import okhttp3.ResponseBody;
import p3.l0;
import retrofit2.HttpException;
import rk.p;
import ul.y;
import ze.f;

@e(c = "com.vpa.daugia.module.home.ui.HomeViewModel$getNews$1", f = "HomeViewModel.kt", l = {340}, m = "invokeSuspend")
/* compiled from: HomeViewModel.kt */
public final class z0 extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f21714a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModel f21715b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Integer f21716c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z0(HomeViewModel homeViewModel, Integer num, d<? super z0> dVar) {
        super(2, dVar);
        this.f21715b = homeViewModel;
        this.f21716c = num;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new z0(this.f21715b, this.f21716c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((z0) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        ResponseBody responseBody;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f21714a;
        if (i10 == 0) {
            l0.Q0(obj);
            HomeApiHelper homeApiHelper = this.f21715b.f19706d;
            Integer num = this.f21716c;
            this.f21714a = 1;
            obj = homeApiHelper.getNews(num, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                r2.p<f<ArrayList<News>>> pVar = this.f21715b.B;
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
        ArrayList a10 = ((n) obj).a();
        if (a10 != null) {
            this.f21715b.B.k(new f.c(a10));
        }
        return ek.i.f20112a;
    }
}
