package wg;

import al.d0;
import al.r0;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.vpa.daugia.module.auction.data.model.AccountRequest;
import com.vpa.daugia.module.auction.ui.viewmodel.AuctionRoomViewModel;
import com.vpa.daugia.ui.MainActivity;
import ek.f;
import ik.d;
import jk.a;
import kk.e;
import kk.i;
import mg.c3;
import of.b;
import p3.l0;
import rk.p;
import sk.j;
import xg.g;

@e(c = "com.vpa.daugia.module.auction.ui.fragment.AuctionFragment$executeGetRecaptchaToken$1", f = "AuctionFragment.kt", l = {163}, m = "invokeSuspend")
/* compiled from: AuctionFragment.kt */
public final class c extends i implements p<d0, d<? super ek.i>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f23393a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f23394b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar, d<? super c> dVar) {
        super(2, dVar);
        this.f23394b = bVar;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        return new c(this.f23394b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i10 = this.f23393a;
        if (i10 == 0) {
            l0.Q0(obj);
            FragmentActivity m10 = this.f23394b.m();
            j.d(m10, "null cannot be cast to non-null type com.vpa.daugia.ui.MainActivity");
            RecaptchaClient recaptchaClient = ((MainActivity) m10).U;
            j.c(recaptchaClient);
            RecaptchaAction recaptchaAction = RecaptchaAction.LOGIN;
            this.f23393a = 1;
            obj2 = recaptchaClient.m7executegIAlus(recaptchaAction, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else if (i10 == 1) {
            l0.Q0(obj);
            obj2 = ((f) obj).f20104a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b bVar = this.f23394b;
        if (!(obj2 instanceof f.a)) {
            String str = (String) obj2;
            int i11 = b.f23380q0;
            AccountRequest accountRequest = (AccountRequest) bVar.n0().F.f8545b;
            if (accountRequest != null) {
                accountRequest.setCaptcha(str);
            }
            bVar.n0().F.g(accountRequest);
            AuctionRoomViewModel n02 = bVar.n0();
            l0.j0(l0.d0(n02), r0.f19085b, new g(n02, (d<? super g>) null), 2);
        }
        b bVar2 = this.f23394b;
        Throwable a10 = f.a(obj2);
        if (a10 != null) {
            a10.printStackTrace();
            View view = ((c3) bVar2.i0()).f8554e;
            j.e(view, "getRoot(...)");
            new of.a(view).a("Lỗi kết nối recaptcha vui lòng thử lại sau!", b.ERROR);
        }
        return ek.i.f20112a;
    }
}
