package zg;

import android.view.View;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import ek.i;
import jf.a;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: StepThreePersonalActivity.kt */
public final class d1 extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreePersonalActivity f23643a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d1(StepThreePersonalActivity stepThreePersonalActivity) {
        super(1);
        this.f23643a = stepThreePersonalActivity;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        StepThreePersonalActivity stepThreePersonalActivity = this.f23643a;
        stepThreePersonalActivity.X = "BACK";
        a aVar = new a();
        aVar.f11887v0 = new a1(stepThreePersonalActivity);
        aVar.n0(stepThreePersonalActivity.G(), "ModalBottomSheet");
        return i.f20112a;
    }
}
