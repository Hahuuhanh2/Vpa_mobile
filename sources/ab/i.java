package ab;

import al.g0;
import android.text.TextUtils;
import cb.a;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: Utils */
public final class i {

    /* renamed from: b  reason: collision with root package name */
    public static final long f161b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c  reason: collision with root package name */
    public static final Pattern f162c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d  reason: collision with root package name */
    public static i f163d;

    /* renamed from: a  reason: collision with root package name */
    public final g0 f164a;

    public i(g0 g0Var) {
        this.f164a = g0Var;
    }

    public static i a() {
        if (g0.f19018a == null) {
            g0.f19018a = new g0(9);
        }
        g0 g0Var = g0.f19018a;
        if (f163d == null) {
            f163d = new i(g0Var);
        }
        return f163d;
    }

    public final boolean b(a aVar) {
        if (TextUtils.isEmpty(aVar.f4669d)) {
            return true;
        }
        long j10 = aVar.f4672g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f164a.getClass();
        if (aVar.f4671f + j10 < timeUnit.toSeconds(System.currentTimeMillis()) + f161b) {
            return true;
        }
        return false;
    }
}
