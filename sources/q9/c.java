package q9;

import al.g0;
import android.os.Bundle;
import n7.b;
import u8.f;

/* compiled from: com.google.android.gms:play-services-measurement-api@@21.5.1 */
public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f14381a;

    public c(d dVar) {
        this.f14381a = dVar;
    }

    public final void a(String str, String str2, Bundle bundle, long j10) {
        String str3;
        boolean z10;
        if (this.f14381a.f14382a.contains(str2)) {
            Bundle bundle2 = new Bundle();
            f<String> fVar = a.f14374a;
            String[] strArr = g0.f19031u;
            String[] strArr2 = g0.f19030t;
            int min = Math.min(33, 33);
            int i10 = 0;
            while (true) {
                if (i10 >= min) {
                    str3 = null;
                    break;
                }
                String str4 = strArr[i10];
                if (str2 == null && str4 == null) {
                    z10 = true;
                } else if (str2 == null) {
                    z10 = false;
                } else {
                    z10 = str2.equals(str4);
                }
                if (z10) {
                    str3 = strArr2[i10];
                    break;
                }
                i10++;
            }
            if (str3 != null) {
                str2 = str3;
            }
            bundle2.putString("events", str2);
            ((ea.b) this.f14381a.f14383b).a(2, bundle2);
        }
    }
}
