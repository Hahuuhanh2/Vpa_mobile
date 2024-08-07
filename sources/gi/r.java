package gi;

import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import ek.i;
import rk.a;
import sk.k;

/* compiled from: OrganizationProfileActivity.kt */
public final class r extends k implements a<i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OrganizationProfileActivity f20408a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(OrganizationProfileActivity organizationProfileActivity) {
        super(0);
        this.f20408a = organizationProfileActivity;
    }

    public final Object invoke() {
        OrganizationProfileActivity organizationProfileActivity = this.f20408a;
        organizationProfileActivity.Y = "REGISTER";
        organizationProfileActivity.f19807c0.a("android.permission.CAMERA");
        return i.f20112a;
    }
}
