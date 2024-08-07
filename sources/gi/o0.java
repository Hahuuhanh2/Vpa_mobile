package gi;

import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import ek.i;
import java.util.ArrayList;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: ProfileActivity.kt */
public final class o0 extends k implements l<String, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20403a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o0(ProfileActivity profileActivity) {
        super(1);
        this.f20403a = profileActivity;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        j.f(str, "it");
        ProfileActivity profileActivity = this.f20403a;
        int i10 = ProfileActivity.f19812b0;
        profileActivity.T().g(str);
        this.f20403a.T().G.g(new ArrayList());
        return i.f20112a;
    }
}
