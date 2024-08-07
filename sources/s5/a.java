package s5;

import android.app.Activity;
import androidx.fragment.app.o;
import sk.j;
import u5.e;
import u5.f;

/* compiled from: CompatPermissionRequestBuilder.kt */
public final class a extends o {

    /* renamed from: b  reason: collision with root package name */
    public final Activity f14634b;

    public a(Activity activity) {
        j.f(activity, "activity");
        this.f14634b = activity;
    }

    public final f J(String[] strArr, e eVar) {
        return new f(this.f14634b, strArr, eVar.a());
    }
}
