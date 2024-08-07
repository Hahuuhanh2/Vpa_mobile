package hh;

import al.d0;
import bc.h;
import com.vpa.daugia.module.common.data.request.ApproveDocs;
import com.vpa.daugia.module.common.ui.CommonViewModel;
import com.vpa.daugia.module.setting.data.api.SettingApiHelper;
import ef.k;
import ik.d;
import kk.e;
import kk.i;
import okhttp3.ResponseBody;
import p3.l0;
import retrofit2.HttpException;
import rk.p;
import ul.y;
import ze.f;

@e(c = "com.vpa.daugia.module.common.ui.CommonViewModel$approveDocs$1", f = "CommonViewModel.kt", l = {71}, m = "invokeSuspend")
/* compiled from: CommonViewModel.kt */
public final class a extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f20518a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ CommonViewModel f20519b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f20520c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(CommonViewModel commonViewModel, String str, d<? super a> dVar) {
        super(2, dVar);
        this.f20519b = commonViewModel;
        this.f20520c = str;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a(this.f20519b, this.f20520c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        ResponseBody responseBody;
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f20518a;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f20519b.f19621h.k(f.b.f18005a);
            SettingApiHelper settingApiHelper = this.f20519b.f19617d;
            ApproveDocs approveDocs = new ApproveDocs(this.f20520c);
            this.f20518a = 1;
            obj = settingApiHelper.approve(approveDocs, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                r2.p<f<Object>> pVar = this.f20519b.f19621h;
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
        k kVar = (k) obj;
        if (kVar.e()) {
            this.f20519b.f19621h.k(new f.c(kVar));
        } else {
            this.f20519b.f19621h.k(new f.a(new Throwable((String) fk.p.N0(kVar.c()))));
        }
        return ek.i.f20112a;
    }
}
