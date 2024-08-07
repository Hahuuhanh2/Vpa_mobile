package androidx.fragment.app;

import android.content.res.Configuration;
import i1.z;
import v1.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2709a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FragmentManager f2710b;

    public /* synthetic */ u(FragmentManager fragmentManager, int i10) {
        this.f2709a = i10;
        this.f2710b = fragmentManager;
    }

    public final void accept(Object obj) {
        switch (this.f2709a) {
            case 0:
                FragmentManager fragmentManager = this.f2710b;
                Configuration configuration = (Configuration) obj;
                if (fragmentManager.L()) {
                    fragmentManager.h(false, configuration);
                    return;
                }
                return;
            default:
                FragmentManager fragmentManager2 = this.f2710b;
                z zVar = (z) obj;
                if (fragmentManager2.L()) {
                    fragmentManager2.r(zVar.f11015a, false);
                    return;
                }
                return;
        }
    }
}
