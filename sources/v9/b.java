package v9;

import androidx.fragment.app.o;
import j7.a;
import java.util.Map;
import y6.j;

/* compiled from: DefaultAppCheckToken */
public final class b extends o {

    /* renamed from: e  reason: collision with root package name */
    public static final /* synthetic */ int f16087e = 0;

    /* renamed from: b  reason: collision with root package name */
    public final String f16088b;

    /* renamed from: c  reason: collision with root package name */
    public final long f16089c;

    /* renamed from: d  reason: collision with root package name */
    public final long f16090d;

    public b(String str, long j10, long j11) {
        j.c(str);
        this.f16088b = str;
        this.f16090d = j10;
        this.f16089c = j11;
    }

    public static b J(a aVar) {
        long j10;
        j.f(aVar);
        try {
            j10 = (long) (Double.parseDouble(aVar.f16086b.replace("s", "")) * 1000.0d);
        } catch (NumberFormatException unused) {
            Map l02 = a.l0(aVar.f16085a);
            j10 = 1000 * (L("exp", l02) - L("iat", l02));
        }
        return new b(aVar.f16085a, j10, System.currentTimeMillis());
    }

    public static b K(String str) {
        j.f(str);
        Map l02 = a.l0(str);
        long L = L("iat", l02);
        return new b(str, (L("exp", l02) - L) * 1000, L * 1000);
    }

    public static long L(String str, Map map) {
        j.f(map);
        j.c(str);
        Integer num = (Integer) map.get(str);
        if (num == null) {
            return 0;
        }
        return num.longValue();
    }

    public final long g() {
        return this.f16089c + this.f16090d;
    }

    public final String v() {
        return this.f16088b;
    }
}
