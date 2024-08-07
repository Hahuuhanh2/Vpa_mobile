package zg;

import android.widget.CompoundButton;
import com.ots.core.base.BaseActivity;
import com.vpa.daugia.module.auth.ui.activity.RegisterAccountActivity;
import com.vpa.daugia.module.auth.ui.activity.StepOneActivity;
import com.vpa.daugia.module.history.ui.activity.AuctionReportActivity;
import com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity;
import mg.b1;
import mg.k;
import mg.u0;
import mg.w3;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b0 implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f23624a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseActivity f23625b;

    public /* synthetic */ b0(BaseActivity baseActivity, int i10) {
        this.f23624a = i10;
        this.f23625b = baseActivity;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        switch (this.f23624a) {
            case 0:
                RegisterAccountActivity registerAccountActivity = (RegisterAccountActivity) this.f23625b;
                String str = RegisterAccountActivity.T;
                j.f(registerAccountActivity, "this$0");
                if (z10) {
                    ((b1) registerAccountActivity.M()).f20969x.setEnabled(true);
                    ((b1) registerAccountActivity.M()).A.setChecked(false);
                    return;
                }
                return;
            case 1:
                StepOneActivity stepOneActivity = (StepOneActivity) this.f23625b;
                int i10 = StepOneActivity.T;
                j.f(stepOneActivity, "this$0");
                if (z10) {
                    ((w3) stepOneActivity.M()).f21417z.setChecked(false);
                    ((w3) stepOneActivity.M()).f21415x.setEnabled(true);
                    return;
                }
                return;
            case 2:
                AuctionReportActivity auctionReportActivity = (AuctionReportActivity) this.f23625b;
                int i11 = AuctionReportActivity.V;
                j.f(auctionReportActivity, "this$0");
                ((k) auctionReportActivity.M()).f21138w.setEnabled(z10);
                return;
            default:
                PolicyAndTermActivity policyAndTermActivity = (PolicyAndTermActivity) this.f23625b;
                int i12 = PolicyAndTermActivity.P;
                j.f(policyAndTermActivity, "this$0");
                ((u0) policyAndTermActivity.M()).f21373y.setEnabled(z10);
                return;
        }
    }
}
