package gi;

import android.view.View;
import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import ek.i;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: OrganizationProfileActivity.kt */
public final class q extends k implements l<View, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OrganizationProfileActivity f20406a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q(OrganizationProfileActivity organizationProfileActivity) {
        super(1);
        this.f20406a = organizationProfileActivity;
    }

    public final Object invoke(Object obj) {
        j.f((View) obj, "it");
        OrganizationProfileActivity organizationProfileActivity = this.f20406a;
        organizationProfileActivity.Y = "BACK";
        organizationProfileActivity.f19807c0.a("android.permission.CAMERA");
        return i.f20112a;
    }
}
