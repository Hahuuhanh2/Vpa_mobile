package gi;

import android.os.Bundle;
import android.widget.ImageView;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import ek.i;
import fk.p;
import gf.a;
import java.util.ArrayList;
import kf.h;
import mg.m0;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: OrganizationProfileActivity.kt */
public final class e0 extends k implements l<User, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OrganizationProfileActivity f20364a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e0(OrganizationProfileActivity organizationProfileActivity) {
        super(1);
        this.f20364a = organizationProfileActivity;
    }

    public final Object invoke(Object obj) {
        String str;
        String str2;
        int i10;
        boolean z10;
        int i11;
        ArrayList<a> files;
        ArrayList<a> files2;
        ArrayList<a> files3;
        a aVar;
        String a10;
        ArrayList<a> files4;
        a aVar2;
        ArrayList<a> files5;
        a aVar3;
        String string;
        boolean z11;
        boolean z12;
        User user = (User) obj;
        Class<User> cls = User.class;
        OrganizationProfileActivity organizationProfileActivity = this.f20364a;
        boolean z13 = true;
        int i12 = 0;
        if (organizationProfileActivity.T) {
            int i13 = h.f12560a;
            Bundle extras = organizationProfileActivity.getIntent().getExtras();
            if (!(extras == null || (string = extras.getString("DATA_ORG")) == null)) {
                OrganizationProfileActivity organizationProfileActivity2 = this.f20364a;
                String representativeRole = user.getRepresentativeRole();
                if (representativeRole == null || representativeRole.length() == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    ((m0) organizationProfileActivity2.M()).T.setText(((User) new bc.h().d(cls, string)).getRepresentativeRole());
                    user.setRepresentativeRole(((User) new bc.h().d(cls, string)).getRepresentativeRole());
                }
                String taxCode = user.getTaxCode();
                if (taxCode == null || taxCode.length() == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (z12) {
                    ((m0) organizationProfileActivity2.M()).U.setText(((User) new bc.h().d(cls, string)).getTaxCode());
                    user.setTaxCode(((User) new bc.h().d(cls, string)).getTaxCode());
                }
                organizationProfileActivity2.V().L.g(user);
            }
        }
        OrganizationProfileActivity organizationProfileActivity3 = this.f20364a;
        ContactPersonIdentityCard frontOfIdentityCard = user.getFrontOfIdentityCard();
        String str3 = "";
        if (frontOfIdentityCard == null || (files5 = frontOfIdentityCard.getFiles()) == null || (aVar3 = (a) p.N0(files5)) == null || (str = aVar3.a()) == null) {
            str = str3;
        }
        organizationProfileActivity3.Z = str;
        OrganizationProfileActivity organizationProfileActivity4 = this.f20364a;
        ContactPersonIdentityCard contactPersonIdentityCard = user.getContactPersonIdentityCard();
        if (contactPersonIdentityCard == null || (files4 = contactPersonIdentityCard.getFiles()) == null || (aVar2 = (a) p.N0(files4)) == null || (str2 = aVar2.a()) == null) {
            str2 = str3;
        }
        organizationProfileActivity4.f19805a0 = str2;
        OrganizationProfileActivity organizationProfileActivity5 = this.f20364a;
        ContactPersonIdentityCard contactPersonIdentityCard2 = user.getContactPersonIdentityCard();
        if (!(contactPersonIdentityCard2 == null || (files3 = contactPersonIdentityCard2.getFiles()) == null || (aVar = (a) p.S0(files3)) == null || (a10 = aVar.a()) == null)) {
            str3 = a10;
        }
        organizationProfileActivity5.f19806b0 = str3;
        Integer profileStatus = user.getProfileStatus();
        if (profileStatus == null || profileStatus.intValue() != 5) {
            ImageView imageView = ((m0) this.f20364a.M()).B;
            j.e(imageView, "btnFront");
            ContactPersonIdentityCard contactPersonIdentityCard3 = user.getContactPersonIdentityCard();
            if (contactPersonIdentityCard3 == null || (files2 = contactPersonIdentityCard3.getFiles()) == null) {
                i10 = 0;
            } else {
                i10 = files2.size();
            }
            if (i10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView.setVisibility(i11);
            ImageView imageView2 = ((m0) this.f20364a.M()).f21209y;
            j.e(imageView2, "btnBackSide");
            ContactPersonIdentityCard contactPersonIdentityCard4 = user.getContactPersonIdentityCard();
            if (contactPersonIdentityCard4 == null || (files = contactPersonIdentityCard4.getFiles()) == null || files.size() != 2) {
                z13 = false;
            }
            if (!z13) {
                i12 = 8;
            }
            imageView2.setVisibility(i12);
        }
        return i.f20112a;
    }
}
