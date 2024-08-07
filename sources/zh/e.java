package zh;

import android.widget.Toast;
import com.vpa.daugia.module.payment.ui.activity.RegulationActivity;
import mg.f1;
import sk.j;
import x5.g;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements x5.e, g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RegulationActivity f23781a;

    public /* synthetic */ e(RegulationActivity regulationActivity) {
        this.f23781a = regulationActivity;
    }

    public final void a() {
        RegulationActivity regulationActivity = this.f23781a;
        int i10 = RegulationActivity.O;
        j.f(regulationActivity, "this$0");
        ((f1) regulationActivity.M()).f21058z.r();
    }

    public final void h(int i10) {
        RegulationActivity regulationActivity = this.f23781a;
        int i11 = RegulationActivity.O;
        j.f(regulationActivity, "this$0");
        Toast.makeText(regulationActivity, "Error while opening page" + i10, 1).show();
    }
}
