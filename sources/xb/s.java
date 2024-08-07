package xb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Map;
import sk.j;
import ua.d;
import ua.e;
import yb.b;
import zb.g;

/* compiled from: SessionEvents.kt */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final d f17251a;

    static {
        e eVar = new e();
        eVar.registerEncoder(r.class, f.f17198a);
        eVar.registerEncoder(v.class, g.f17202a);
        eVar.registerEncoder(i.class, e.f17194a);
        eVar.registerEncoder(b.class, d.f17187a);
        eVar.registerEncoder(a.class, c.f17182a);
        eVar.f15414d = true;
        f17251a = new d(eVar);
    }

    public static b a(m9.d dVar) {
        String str;
        j.f(dVar, "firebaseApp");
        dVar.a();
        Context context = dVar.f13218a;
        j.e(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            str = String.valueOf(packageInfo.getLongVersionCode());
        } else {
            str = String.valueOf(packageInfo.versionCode);
        }
        dVar.a();
        String str2 = dVar.f13220c.f13232b;
        j.e(str2, "firebaseApp.options.applicationId");
        String str3 = Build.MODEL;
        j.e(str3, "MODEL");
        String str4 = Build.VERSION.RELEASE;
        j.e(str4, "RELEASE");
        j.e(packageName, "packageName");
        String str5 = packageInfo.versionName;
        if (str5 == null) {
            str5 = str;
        }
        String str6 = Build.MANUFACTURER;
        j.e(str6, "MANUFACTURER");
        return new b(str2, str3, str4, new a(packageName, str5, str, str6));
    }

    public static r b(m9.d dVar, q qVar, g gVar, Map map) {
        h hVar;
        h hVar2 = h.COLLECTION_ENABLED;
        h hVar3 = h.COLLECTION_DISABLED;
        h hVar4 = h.COLLECTION_SDK_NOT_INSTALLED;
        j.f(dVar, "firebaseApp");
        j.f(qVar, "sessionDetails");
        j.f(gVar, "sessionsSettings");
        j.f(map, "subscribers");
        String str = qVar.f17244a;
        String str2 = qVar.f17245b;
        int i10 = qVar.f17246c;
        long j10 = qVar.f17247d;
        b bVar = (b) map.get(b.a.PERFORMANCE);
        if (bVar == null) {
            hVar = hVar4;
        } else if (bVar.a()) {
            hVar = hVar2;
        } else {
            hVar = hVar3;
        }
        b bVar2 = (b) map.get(b.a.CRASHLYTICS);
        if (bVar2 == null) {
            hVar2 = hVar4;
        } else if (!bVar2.a()) {
            hVar2 = hVar3;
        }
        return new r(new v(str, str2, i10, j10, new i(hVar, hVar2, gVar.a())), a(dVar));
    }
}
