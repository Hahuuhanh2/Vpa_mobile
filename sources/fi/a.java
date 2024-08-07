package fi;

import al.d0;
import bc.h;
import com.vpa.daugia.module.auth.data.api.response.EkycReponse;
import com.vpa.daugia.module.common.data.api.CommonApiHelper;
import com.vpa.daugia.module.profile.ui.ProfileViewModel;
import ef.k;
import ik.d;
import java.util.List;
import kk.e;
import kk.i;
import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import p3.l0;
import retrofit2.HttpException;
import rk.p;
import sk.j;
import ul.y;
import ze.f;

@e(c = "com.vpa.daugia.module.profile.ui.ProfileViewModel$ekyc$1", f = "ProfileViewModel.kt", l = {31}, m = "invokeSuspend")
/* compiled from: ProfileViewModel.kt */
public final class a extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f20170a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProfileViewModel f20171b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ List<MultipartBody.Part> f20172c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(ProfileViewModel profileViewModel, List<MultipartBody.Part> list, d<? super a> dVar) {
        super(2, dVar);
        this.f20171b = profileViewModel;
        this.f20172c = list;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new a(this.f20171b, this.f20172c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        EkycReponse ekycReponse;
        String str;
        ResponseBody responseBody;
        jk.a aVar = jk.a.COROUTINE_SUSPENDED;
        int i10 = this.f20170a;
        if (i10 == 0) {
            l0.Q0(obj);
            this.f20171b.f19802e.k(f.b.f18005a);
            CommonApiHelper commonApiHelper = this.f20171b.f19801d;
            List<MultipartBody.Part> list = this.f20172c;
            this.f20170a = 1;
            obj = commonApiHelper.ekyc(list, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            try {
                l0.Q0(obj);
            } catch (Exception e10) {
                e = e10;
                e.printStackTrace();
                r2.p<f<EkycReponse>> pVar = this.f20171b.f19802e;
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
        if (kVar.e() && (ekycReponse = (EkycReponse) kVar.d()) != null) {
            ProfileViewModel profileViewModel = this.f20171b;
            if (j.a(ekycReponse.getErrorCode(), "11")) {
                profileViewModel.f19802e.k(new f.a(new Throwable(ekycReponse.getErrorMessage())));
            } else {
                profileViewModel.f19802e.k(new f.c(ekycReponse));
            }
        }
        return ek.i.f20112a;
    }
}
