package u5;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import fk.h;
import java.util.LinkedHashMap;
import sk.j;
import u5.d;

/* compiled from: ResultLauncherRuntimePermissionHandler.kt */
public class b extends Fragment implements d {

    /* renamed from: e0  reason: collision with root package name */
    public final LinkedHashMap f15283e0 = new LinkedHashMap();

    /* renamed from: f0  reason: collision with root package name */
    public String[] f15284f0;

    static {
        Class<b> cls = b.class;
    }

    public b() {
        Z(new a(this, 0), new g.b());
    }

    public final void I(Context context) {
        j.f(context, "context");
        super.I(context);
    }

    public final void J(Bundle bundle) {
        String[] strArr;
        super.J(bundle);
        if (this.f15284f0 == null) {
            if (bundle != null) {
                strArr = bundle.getStringArray("pending_permissions");
            } else {
                strArr = null;
            }
            this.f15284f0 = strArr;
        }
    }

    public final void T(Bundle bundle) {
        bundle.putStringArray("pending_permissions", this.f15284f0);
    }

    public final void a(String[] strArr, d.a aVar) {
        j.f(aVar, "listener");
        this.f15283e0.put(h.C0(strArr), aVar);
    }
}
