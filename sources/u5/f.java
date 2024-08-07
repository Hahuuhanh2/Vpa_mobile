package u5;

import android.app.Activity;
import fk.p;
import java.util.ArrayList;
import sk.j;
import t5.a;
import t5.b;
import u5.d;

/* compiled from: RuntimePermissionRequest.kt */
public final class f extends a implements d.a {

    /* renamed from: b  reason: collision with root package name */
    public final d f15286b;

    public f(Activity activity, String[] strArr, d dVar) {
        j.f(activity, "activity");
        j.f(dVar, "handler");
        this.f15286b = dVar;
        dVar.a(strArr, this);
    }

    public final void a(ArrayList arrayList) {
        for (b.a a10 : p.d1(this.f14834a)) {
            a10.a(arrayList);
        }
    }
}
