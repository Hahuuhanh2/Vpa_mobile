package zg;

import android.view.View;
import com.vpa.daugia.module.auth.data.api.request.RegisterORG;
import com.vpa.daugia.module.auth.ui.activity.StepThreeOrganizationActivity;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i0 implements View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreeOrganizationActivity f23674a;

    public /* synthetic */ i0(StepThreeOrganizationActivity stepThreeOrganizationActivity) {
        this.f23674a = stepThreeOrganizationActivity;
    }

    public final boolean onLongClick(View view) {
        StepThreeOrganizationActivity stepThreeOrganizationActivity = this.f23674a;
        int i10 = StepThreeOrganizationActivity.Z;
        j.f(stepThreeOrganizationActivity, "this$0");
        RegisterORG registerORG = stepThreeOrganizationActivity.T().K;
        registerORG.setAddress("Hồ Chí Minh");
        registerORG.setEmail("ntb123@gmail.com");
        registerORG.setPhone("0123465123");
        registerORG.setBankAccount("123456789");
        registerORG.setBankAccountOwner("Hồ Quốc Thịnh");
        registerORG.setTaxCode("123456789006");
        registerORG.setOrgBusinessRegistration("8237423411");
        registerORG.setOrgIssuancePlace("Hồ Chí Minh");
        registerORG.setContactPersonName("Hồ Quốc Thịnh");
        registerORG.setCompanyName("OTS COMPANY");
        registerORG.setRepresentativeRole("Chủ tịch");
        registerORG.setContactPersonTitle("Chủ tịch");
        return true;
    }
}
