package gi;

import android.view.View;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import fk.l;
import gf.a;
import java.util.ArrayList;
import mg.m0;
import sk.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f20380a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ OrganizationProfileActivity f20381b;

    public /* synthetic */ g(OrganizationProfileActivity organizationProfileActivity, int i10) {
        this.f20380a = i10;
        this.f20381b = organizationProfileActivity;
    }

    public final void onClick(View view) {
        ContactPersonIdentityCard contactPersonIdentityCard;
        ArrayList<a> files;
        switch (this.f20380a) {
            case 0:
                OrganizationProfileActivity organizationProfileActivity = this.f20381b;
                int i10 = OrganizationProfileActivity.f19804d0;
                j.f(organizationProfileActivity, "this$0");
                organizationProfileActivity.f19805a0 = "";
                User user = (User) organizationProfileActivity.V().L.f8545b;
                if (!(user == null || (contactPersonIdentityCard = user.getContactPersonIdentityCard()) == null || (files = contactPersonIdentityCard.getFiles()) == null)) {
                    a aVar = (a) l.J0(files);
                }
                ((m0) organizationProfileActivity.M()).f21191i0.setImageResource(0);
                j.c(view);
                view.setVisibility(8);
                return;
            default:
                OrganizationProfileActivity organizationProfileActivity2 = this.f20381b;
                int i11 = OrganizationProfileActivity.f19804d0;
                j.f(organizationProfileActivity2, "this$0");
                organizationProfileActivity2.finish();
                return;
        }
    }
}
