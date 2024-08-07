package xb;

import al.g0;
import java.util.Locale;
import java.util.UUID;
import rk.a;
import sk.j;
import yk.h;

/* compiled from: SessionGenerator.kt */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f17253a;

    /* renamed from: b  reason: collision with root package name */
    public final z f17254b;

    /* renamed from: c  reason: collision with root package name */
    public final a<UUID> f17255c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17256d = a();

    /* renamed from: e  reason: collision with root package name */
    public int f17257e = -1;

    /* renamed from: f  reason: collision with root package name */
    public q f17258f;

    public u(boolean z10, g0 g0Var) {
        t tVar = t.f17252p;
        this.f17253a = z10;
        this.f17254b = g0Var;
        this.f17255c = tVar;
    }

    public final String a() {
        String uuid = this.f17255c.invoke().toString();
        j.e(uuid, "uuidGenerator().toString()");
        String lowerCase = h.J0(uuid, "-", "").toLowerCase(Locale.ROOT);
        j.e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
