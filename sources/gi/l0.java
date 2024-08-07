package gi;

import android.view.View;
import com.vpa.daugia.module.profile.ui.activity.ProfileActivity;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: ProfileActivity.kt */
public final class l0 extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ProfileActivity f20395a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l0(ProfileActivity profileActivity) {
        super(1);
        this.f20395a = profileActivity;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        ProfileActivity profileActivity = this.f20395a;
        profileActivity.W = "FRONT";
        profileActivity.f19813a0.a("android.permission.CAMERA");
        return i.f20112a;
    }
}
