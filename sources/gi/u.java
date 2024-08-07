package gi;

import com.vpa.daugia.module.profile.ui.activity.OrganizationProfileActivity;
import ek.i;
import java.util.ArrayList;
import rk.l;
import sk.j;
import sk.k;

/* compiled from: OrganizationProfileActivity.kt */
public final class u extends k implements l<String, i> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OrganizationProfileActivity f20414a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(OrganizationProfileActivity organizationProfileActivity) {
        super(1);
        this.f20414a = organizationProfileActivity;
    }

    public final Object invoke(Object obj) {
        String str = (String) obj;
        j.f(str, "it");
        OrganizationProfileActivity organizationProfileActivity = this.f20414a;
        int i10 = OrganizationProfileActivity.f19804d0;
        organizationProfileActivity.V().g(str);
        this.f20414a.V().G.g(new ArrayList());
        return i.f20112a;
    }
}
