package nl;

import java.util.regex.Pattern;
import sl.f;
import sl.h;

/* compiled from: ZoneRegion */
public final class l extends j {

    /* renamed from: d  reason: collision with root package name */
    public static final Pattern f21781d = Pattern.compile("[A-Za-z][A-Za-z0-9~/._+-]+");

    /* renamed from: b  reason: collision with root package name */
    public final String f21782b;

    /* renamed from: c  reason: collision with root package name */
    public final transient f f21783c;

    public l(String str, f fVar) {
        this.f21782b = str;
        this.f21783c = fVar;
    }

    public final String getId() {
        return this.f21782b;
    }

    public final f s() {
        f fVar = this.f21783c;
        if (fVar != null) {
            return fVar;
        }
        return h.a(this.f21782b, false);
    }
}
