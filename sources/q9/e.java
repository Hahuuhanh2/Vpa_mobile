package q9;

import android.os.Bundle;
import n7.b;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
public final class e implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f14384a;

    public e(f fVar) {
        this.f14384a = fVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j10) {
        if (str != null && (!a.f14374a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j10);
            bundle2.putBundle("params", bundle);
            ((ea.b) this.f14384a.f14385a).a(3, bundle2);
        }
    }
}
