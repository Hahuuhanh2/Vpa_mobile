package zg;

import android.view.View;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import fk.l;
import gf.a;
import java.util.ArrayList;
import mg.a4;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class y0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23764a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StepThreePersonalActivity f23765b;

    public /* synthetic */ y0(StepThreePersonalActivity stepThreePersonalActivity, int i10) {
        this.f23764a = i10;
        this.f23765b = stepThreePersonalActivity;
    }

    public final void onClick(View view) {
        ContactPersonIdentityCard frontOfIdentityCard;
        ArrayList<a> files;
        switch (this.f23764a) {
            case 0:
                StepThreePersonalActivity stepThreePersonalActivity = this.f23765b;
                int i10 = StepThreePersonalActivity.f19534a0;
                j.f(stepThreePersonalActivity, "this$0");
                stepThreePersonalActivity.finish();
                return;
            default:
                StepThreePersonalActivity stepThreePersonalActivity2 = this.f23765b;
                int i11 = StepThreePersonalActivity.f19534a0;
                j.f(stepThreePersonalActivity2, "this$0");
                User user = (User) stepThreePersonalActivity2.T().L.f8545b;
                if (!(user == null || (frontOfIdentityCard = user.getFrontOfIdentityCard()) == null || (files = frontOfIdentityCard.getFiles()) == null)) {
                    a aVar = (a) l.K0(files);
                }
                ((a4) stepThreePersonalActivity2.M()).Q.setImageResource(0);
                j.c(view);
                view.setVisibility(8);
                return;
        }
    }
}
