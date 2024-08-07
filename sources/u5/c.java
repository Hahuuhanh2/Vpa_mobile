package u5;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.w;

/* compiled from: ResultLauncherRuntimePermissionHandlerProvider.kt */
public final class c implements e {

    /* renamed from: a  reason: collision with root package name */
    public final FragmentManager f15285a;

    public c(w wVar) {
        this.f15285a = wVar;
    }

    public final d a() {
        d dVar;
        Fragment D = this.f15285a.D("KPermissionsFragment");
        if (D instanceof d) {
            dVar = (d) D;
        } else {
            dVar = null;
        }
        if (dVar != null) {
            return dVar;
        }
        b bVar = new b();
        FragmentManager fragmentManager = this.f15285a;
        fragmentManager.getClass();
        a aVar = new a(fragmentManager);
        aVar.g(0, bVar, "KPermissionsFragment", 1);
        aVar.d();
        return bVar;
    }
}
