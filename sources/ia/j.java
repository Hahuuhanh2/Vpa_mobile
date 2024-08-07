package ia;

import f0.k0;
import java.io.IOException;
import na.c;

/* compiled from: CrashlyticsAppQualitySessionsStore */
public final class j {

    /* renamed from: d  reason: collision with root package name */
    public static final i f11317d = new i(0);

    /* renamed from: e  reason: collision with root package name */
    public static final k0 f11318e = new k0(1);

    /* renamed from: a  reason: collision with root package name */
    public final c f11319a;

    /* renamed from: b  reason: collision with root package name */
    public String f11320b = null;

    /* renamed from: c  reason: collision with root package name */
    public String f11321c = null;

    public j(c cVar) {
        this.f11319a = cVar;
    }

    public static void a(c cVar, String str, String str2) {
        if (str != null && str2 != null) {
            try {
                cVar.b(str, "aqs." + str2).createNewFile();
            } catch (IOException unused) {
            }
        }
    }
}
