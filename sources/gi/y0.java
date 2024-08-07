package gi;

import android.widget.ImageView;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import ek.i;
import gf.a;
import java.util.ArrayList;
import kf.h;
import mg.x0;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: ProfileActivity.kt */
public final class y0 extends k implements l<f<? extends a>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20423a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y0(ProfileActivity profileActivity) {
        super(1);
        this.f20423a = profileActivity;
    }

    public final Object invoke(Object obj) {
        int i10;
        ContactPersonIdentityCard frontOfIdentityCard;
        ArrayList<a> files;
        User user;
        ContactPersonIdentityCard frontOfIdentityCard2;
        ArrayList<a> files2;
        ContactPersonIdentityCard frontOfIdentityCard3;
        ArrayList<a> files3;
        int i11;
        ContactPersonIdentityCard frontOfIdentityCard4;
        ArrayList<a> files4;
        User user2;
        ContactPersonIdentityCard frontOfIdentityCard5;
        ArrayList<a> files5;
        ContactPersonIdentityCard frontOfIdentityCard6;
        ArrayList<a> files6;
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f20423a.O().dismiss();
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f20423a.O().show();
        } else if (fVar instanceof f.c) {
            this.f20423a.O().dismiss();
            User user3 = (User) this.f20423a.T().L.f8545b;
            if (user3 != null) {
                user3.getFrontOfIdentityCard();
            }
            int i12 = h.f12560a;
            String str = this.f20423a.W;
            if (j.a(str, "FRONT")) {
                User user4 = (User) this.f20423a.T().L.f8545b;
                if (user4 == null || (frontOfIdentityCard6 = user4.getFrontOfIdentityCard()) == null || (files6 = frontOfIdentityCard6.getFiles()) == null) {
                    i11 = 0;
                } else {
                    i11 = files6.size();
                }
                if (!(i11 <= 1 || (user2 = (User) this.f20423a.T().L.f8545b) == null || (frontOfIdentityCard5 = user2.getFrontOfIdentityCard()) == null || (files5 = frontOfIdentityCard5.getFiles()) == null)) {
                    a aVar = (a) fk.l.J0(files5);
                }
                User user5 = (User) this.f20423a.T().L.f8545b;
                if (!(user5 == null || (frontOfIdentityCard4 = user5.getFrontOfIdentityCard()) == null || (files4 = frontOfIdentityCard4.getFiles()) == null)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(j7.a.f11713u);
                    sb2.append("web-api/user-bidding/api/file/download/");
                    f.c cVar = (f.c) fVar;
                    sb2.append(((a) cVar.f18006a).a());
                    files4.add(0, new a(sb2.toString(), ((a) cVar.f18006a).b(), 4));
                }
                User user6 = (User) this.f20423a.T().L.f8545b;
                if (user6 != null) {
                    user6.getFrontOfIdentityCard();
                }
                ImageView imageView = ((x0) this.f20423a.M()).A;
                j.e(imageView, "btnFront");
                imageView.setVisibility(0);
            } else if (j.a(str, "BACK")) {
                User user7 = (User) this.f20423a.T().L.f8545b;
                if (user7 == null || (frontOfIdentityCard3 = user7.getFrontOfIdentityCard()) == null || (files3 = frontOfIdentityCard3.getFiles()) == null) {
                    i10 = 0;
                } else {
                    i10 = files3.size();
                }
                if (!(i10 <= 1 || (user = (User) this.f20423a.T().L.f8545b) == null || (frontOfIdentityCard2 = user.getFrontOfIdentityCard()) == null || (files2 = frontOfIdentityCard2.getFiles()) == null)) {
                    a aVar2 = (a) fk.l.K0(files2);
                }
                User user8 = (User) this.f20423a.T().L.f8545b;
                if (!(user8 == null || (frontOfIdentityCard = user8.getFrontOfIdentityCard()) == null || (files = frontOfIdentityCard.getFiles()) == null)) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(j7.a.f11713u);
                    sb3.append("web-api/user-bidding/api/file/download/");
                    f.c cVar2 = (f.c) fVar;
                    sb3.append(((a) cVar2.f18006a).a());
                    files.add(new a(sb3.toString(), ((a) cVar2.f18006a).b(), 4));
                }
                User user9 = (User) this.f20423a.T().L.f8545b;
                if (user9 != null) {
                    user9.getFrontOfIdentityCard();
                }
                ImageView imageView2 = ((x0) this.f20423a.M()).f21446y;
                j.e(imageView2, "btnBackSide");
                imageView2.setVisibility(0);
            }
            User user10 = (User) this.f20423a.T().L.f8545b;
            if (user10 != null) {
                user10.getFrontOfIdentityCard();
            }
        }
        return i.f20112a;
    }
}
