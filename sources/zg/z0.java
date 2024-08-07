package zg;

import android.view.View;
import com.vpa.daugia.module.auth.ui.activity.StepThreePersonalActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class z0 implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreePersonalActivity f23771a;

    public /* synthetic */ z0(StepThreePersonalActivity stepThreePersonalActivity) {
        this.f23771a = stepThreePersonalActivity;
    }

    public final boolean onLongClick(View view) {
        StepThreePersonalActivity stepThreePersonalActivity = this.f23771a;
        int i10 = StepThreePersonalActivity.f19534a0;
        j.f(stepThreePersonalActivity, "this$0");
        stepThreePersonalActivity.T().K.setOrgIssuancePlace("Cục Cảnh sát quản lý hành chính về trật tự xã hội");
        return true;
    }
}
