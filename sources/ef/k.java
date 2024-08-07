package ef;

import cc.b;
import fk.r;
import java.util.ArrayList;
import java.util.List;
import sk.j;

/* compiled from: HttpData.kt */
public final class k<T> {
    @b("success")

    /* renamed from: a  reason: collision with root package name */
    private boolean f9464a;
    @b("result")

    /* renamed from: b  reason: collision with root package name */
    private final T f9465b;
    @b("data")

    /* renamed from: c  reason: collision with root package name */
    private final T f9466c;
    @b("errorCode")

    /* renamed from: d  reason: collision with root package name */
    private final Integer f9467d;
    @b("errors")

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f9468e;
    @b("total")

    /* renamed from: f  reason: collision with root package name */
    private final Integer f9469f;
    @b("totalElements")

    /* renamed from: g  reason: collision with root package name */
    private final Integer f9470g;

    public k() {
        this(false, (Integer) null, (ArrayList) null, 127);
    }

    public k(boolean z10, Integer num, ArrayList arrayList, int i10) {
        z10 = (i10 & 1) != 0 ? false : z10;
        num = (i10 & 8) != 0 ? null : num;
        List list = (i10 & 16) != 0 ? r.f20213a : arrayList;
        j.f(list, "errors");
        this.f9464a = z10;
        this.f9465b = null;
        this.f9466c = null;
        this.f9467d = num;
        this.f9468e = list;
        this.f9469f = null;
        this.f9470g = null;
    }

    public final T a() {
        return this.f9466c;
    }

    public final Integer b() {
        return this.f9467d;
    }

    public final List<String> c() {
        return this.f9468e;
    }

    public final T d() {
        return this.f9465b;
    }

    public final boolean e() {
        return this.f9464a;
    }

    public final Integer f() {
        return this.f9469f;
    }

    public final Integer g() {
        return this.f9470g;
    }
}
