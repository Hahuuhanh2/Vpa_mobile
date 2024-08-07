package gi;

import android.content.Intent;
import com.vpa.daugia.module.auth.data.model.ContactPersonIdentityCard;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import ek.i;
import rk.l;
import sk.k;
import yg.a;

/* compiled from: ProfileActivity.kt */
public final class x0 extends k implements l<ContactPersonIdentityCard, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20421a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x0(ProfileActivity profileActivity) {
        super(1);
        this.f20421a = profileActivity;
    }

    public final Object invoke(Object obj) {
        ContactPersonIdentityCard contactPersonIdentityCard = (ContactPersonIdentityCard) obj;
        Intent intent = this.f20421a.getIntent();
        boolean z10 = false;
        if (intent != null && !intent.hasExtra("DATA_VERIFY")) {
            z10 = true;
        }
        if (z10) {
            ((mg.x0) this.f20421a.M()).v(new a(contactPersonIdentityCard));
        }
        return i.f20112a;
    }
}
