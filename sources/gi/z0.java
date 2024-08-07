package gi;

import android.content.Intent;
import com.vpa.daugia.module.auth.data.model.AccountType;
import com.vpa.daugia.module.auth.data.model.User;
import com.vpa.daugia.module.profile.ui.activity.PolicyAndTermActivity;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import ek.i;
import rk.a;
import sk.k;

/* compiled from: ProfileActivity.kt */
public final class z0 extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ User f20425a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20426b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z0(User user, ProfileActivity profileActivity) {
        super(0);
        this.f20425a = user;
        this.f20426b = profileActivity;
    }

    public final Object invoke() {
        Integer accountType = this.f20425a.getAccountType();
        int value = AccountType.PERSON.getValue();
        if (accountType != null && accountType.intValue() == value) {
            Intent intent = new Intent(this.f20426b, PolicyAndTermActivity.class);
            intent.putExtra("ON_VERIFY_PROFILE", this.f20426b.U);
            this.f20426b.startActivity(intent);
        }
        return i.f20112a;
    }
}
