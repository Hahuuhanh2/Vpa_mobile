package zg;

import al.r0;
import android.view.View;
import bh.t;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import com.vpa.daugia.module.auth.ui.viewmodel.LoginViewModel;
import fk.l;
import gf.a;
import ik.d;
import java.util.ArrayList;
import mg.a4;
import p3.l0;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23757a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StepThreePersonalActivity f23758b;

    public /* synthetic */ x0(StepThreePersonalActivity stepThreePersonalActivity, int i10) {
        this.f23757a = i10;
        this.f23758b = stepThreePersonalActivity;
    }

    public final void onClick(View view) {
        ContactPersonIdentityCard frontOfIdentityCard;
        ArrayList<a> files;
        switch (this.f23757a) {
            case 0:
                StepThreePersonalActivity stepThreePersonalActivity = this.f23758b;
                int i10 = StepThreePersonalActivity.f19534a0;
                j.f(stepThreePersonalActivity, "this$0");
                LoginViewModel T = stepThreePersonalActivity.T();
                l0.j0(l0.d0(T), r0.f19085b, new t(T, (d<? super t>) null), 2);
                return;
            default:
                StepThreePersonalActivity stepThreePersonalActivity2 = this.f23758b;
                int i11 = StepThreePersonalActivity.f19534a0;
                j.f(stepThreePersonalActivity2, "this$0");
                User user = (User) stepThreePersonalActivity2.T().L.f8545b;
                if (!(user == null || (frontOfIdentityCard = user.getFrontOfIdentityCard()) == null || (files = frontOfIdentityCard.getFiles()) == null)) {
                    a aVar = (a) l.J0(files);
                }
                ((a4) stepThreePersonalActivity2.M()).R.setImageResource(0);
                j.c(view);
                view.setVisibility(8);
                return;
        }
    }
}
