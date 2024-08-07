package zg;

import android.widget.CompoundButton;
import com.ots.core.base.BaseActivity;
import com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity;
import com.vpa.daugia.module.auth.ui.activity.StepTwoActivity;
import com.vpa.daugia.module.menu.ui.activity.SettingActivity;
import com.vpa.daugia.module.payment.ui.activity.RegulationActivity;
import com.vpa.daugia.module.profile.ui.activity.InstructVerifyActivity;
import mg.b1;
import mg.c4;
import mg.e0;
import mg.f1;
import mg.p1;
import q.k;
import sh.b;
import sk.j;
import th.c;
import th.e;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23634a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f23635b;

    public /* synthetic */ c0(BaseActivity baseActivity, int i10) {
        this.f23634a = i10;
        this.f23635b = baseActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f23634a) {
            case 0:
                RegisterAccountActivity registerAccountActivity = (RegisterAccountActivity) this.f23635b;
                String str = RegisterAccountActivity.T;
                j.f(registerAccountActivity, "this$0");
                if (z10) {
                    ((b1) registerAccountActivity.M()).f20969x.setEnabled(true);
                    ((b1) registerAccountActivity.M()).f20971z.setChecked(false);
                    return;
                }
                return;
            case 1:
                StepTwoActivity stepTwoActivity = (StepTwoActivity) this.f23635b;
                int i10 = StepTwoActivity.V;
                j.f(stepTwoActivity, "this$0");
                ((c4) stepTwoActivity.M()).f21011z.f21275w.setEnabled(stepTwoActivity.U());
                return;
            case 2:
                SettingActivity settingActivity = (SettingActivity) this.f23635b;
                int i11 = SettingActivity.U;
                j.f(settingActivity, "this$0");
                if (z10) {
                    int a10 = new k(new k.c(settingActivity)).a(15);
                    if (a10 == 0) {
                        c cVar = new c(settingActivity);
                        cVar.f23015j = new b(settingActivity);
                        cVar.h();
                        return;
                    } else if (a10 == 11) {
                        ((p1) settingActivity.M()).f21283w.setChecked(false);
                        new e(settingActivity).h();
                        return;
                    } else {
                        return;
                    }
                } else {
                    settingActivity.T(false);
                    return;
                }
            case 3:
                RegulationActivity regulationActivity = (RegulationActivity) this.f23635b;
                int i12 = RegulationActivity.O;
                j.f(regulationActivity, "this$0");
                ((f1) regulationActivity.M()).f21055w.setEnabled(z10);
                return;
            default:
                InstructVerifyActivity instructVerifyActivity = (InstructVerifyActivity) this.f23635b;
                int i13 = InstructVerifyActivity.P;
                j.f(instructVerifyActivity, "this$0");
                ((e0) instructVerifyActivity.M()).f21036y.setEnabled(z10);
                return;
        }
    }
}
