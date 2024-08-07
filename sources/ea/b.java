package ea;

import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import p9.a;

/* compiled from: CrashlyticsAnalyticsListener */
public final class b implements a.C0180a {

    /* renamed from: a  reason: collision with root package name */
    public ga.b f9327a;

    /* renamed from: b  reason: collision with root package name */
    public ga.b f9328b;

    public final void a(int i10, Bundle bundle) {
        ga.b bVar;
        String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", new Object[]{Integer.valueOf(i10), bundle});
        Log.isLoggable("FirebaseCrashlytics", 2);
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            if ("clx".equals(bundle2.getString("_o"))) {
                bVar = this.f9327a;
            } else {
                bVar = this.f9328b;
            }
            if (bVar != null) {
                bVar.a(bundle2, string);
            }
        }
    }
}
