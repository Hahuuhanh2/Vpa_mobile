package zg;

import android.graphics.drawable.Drawable;
import c0.q0;
import com.bumptech.glide.b;
import com.ots.core.R$drawable;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.auth.ui.activity.StepThreeOrganizationActivity;
import ek.i;
import gf.a;
import k5.g;
import kf.h;
import mg.y3;
import rk.l;
import sk.j;
import sk.k;
import ze.f;

/* compiled from: StepThreeOrganizationActivity.kt */
public final class u0 extends k implements l<f<? extends a>, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ StepThreeOrganizationActivity f23732a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u0(StepThreeOrganizationActivity stepThreeOrganizationActivity) {
        super(1);
        this.f23732a = stepThreeOrganizationActivity;
    }

    public final Object invoke(Object obj) {
        ContactPersonIdentityCard contactPersonIdentityCard;
        f fVar = (f) obj;
        if (fVar instanceof f.a) {
            this.f23732a.O().dismiss();
        } else if (j.a(fVar, f.b.f18005a)) {
            this.f23732a.O().show();
        } else if (fVar instanceof f.c) {
            this.f23732a.O().dismiss();
            StepThreeOrganizationActivity stepThreeOrganizationActivity = this.f23732a;
            com.bumptech.glide.l g2 = b.c(stepThreeOrganizationActivity).g(stepThreeOrganizationActivity);
            Integer valueOf = Integer.valueOf(R$drawable.ic_default_image);
            g2.getClass();
            com.bumptech.glide.k D = new com.bumptech.glide.k(g2.f4948a, g2, Drawable.class, g2.f4949b).D(valueOf);
            j.e(D, "load(...)");
            m5.a aVar = new m5.a(300, true);
            ContactPersonIdentityCard contactPersonIdentityCard2 = null;
            try {
                lg.b bVar = this.f23732a.S;
                if (bVar != null) {
                    String a10 = bVar.a();
                    ((a) ((f.c) fVar).f18006a).getClass();
                    int i10 = h.f12560a;
                    com.bumptech.glide.k E = D.E(new y4.f(j7.a.f11713u + "web-api/user-bidding/api/file/download/" + ((a) ((f.c) fVar).f18006a).a(), new q0(a10, 1)));
                    j.e(E, "load(...)");
                    D = E;
                    s4.l[] lVarArr = {new b5.j()};
                    com.bumptech.glide.a aVar2 = new com.bumptech.glide.a();
                    aVar2.f5004a = aVar;
                    ((com.bumptech.glide.k) ((com.bumptech.glide.k) ((com.bumptech.glide.k) ((com.bumptech.glide.k) D.D(Integer.valueOf(R$drawable.ic_default_image)).y(new g()).r()).l(R$drawable.ic_default_image)).f(R$drawable.ic_default_image)).u(new s4.f(lVarArr), true)).G(aVar2).B(((y3) this.f23732a.M()).P);
                    User user = (User) this.f23732a.T().L.f8545b;
                    if (user != null) {
                        contactPersonIdentityCard = user.getFrontOfIdentityCard();
                    } else {
                        contactPersonIdentityCard = null;
                    }
                    if (contactPersonIdentityCard != null) {
                        contactPersonIdentityCard.setFiles(j7.a.e(((f.c) fVar).f18006a));
                    }
                    User user2 = (User) this.f23732a.T().L.f8545b;
                    if (user2 != null) {
                        contactPersonIdentityCard2 = user2.getContactPersonIdentityCard();
                    }
                    if (contactPersonIdentityCard2 != null) {
                        contactPersonIdentityCard2.setFiles(j7.a.e(((f.c) fVar).f18006a));
                    }
                } else {
                    j.l("sharedPrefsHelper");
                    throw null;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return i.f20112a;
    }
}
