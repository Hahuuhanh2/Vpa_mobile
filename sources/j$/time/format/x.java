package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.o;
import j$.time.chrono.v;
import j$.time.temporal.a;
import j$.time.temporal.j;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

final class x {

    /* renamed from: a  reason: collision with root package name */
    private DateTimeFormatter f18205a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f18206b = true;

    /* renamed from: c  reason: collision with root package name */
    private boolean f18207c = true;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList f18208d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList f18209e;

    x(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f18208d = arrayList;
        this.f18209e = null;
        this.f18205a = dateTimeFormatter;
        arrayList.add(new E());
    }

    static boolean c(char c10, char c11) {
        return c10 == c11 || Character.toUpperCase(c10) == Character.toUpperCase(c11) || Character.toLowerCase(c10) == Character.toLowerCase(c11);
    }

    private E e() {
        ArrayList arrayList = this.f18208d;
        return (E) arrayList.get(arrayList.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public final void a(p pVar) {
        if (this.f18209e == null) {
            this.f18209e = new ArrayList();
        }
        this.f18209e.add(pVar);
    }

    /* access modifiers changed from: package-private */
    public final boolean b(char c10, char c11) {
        return this.f18206b ? c10 == c11 : c(c10, c11);
    }

    /* access modifiers changed from: package-private */
    public final x d() {
        x xVar = new x(this.f18205a);
        xVar.f18206b = this.f18206b;
        xVar.f18207c = this.f18207c;
        return xVar;
    }

    /* access modifiers changed from: package-private */
    public final void f(boolean z10) {
        ArrayList arrayList;
        int i10;
        if (z10) {
            arrayList = this.f18208d;
            i10 = arrayList.size() - 2;
        } else {
            arrayList = this.f18208d;
            i10 = arrayList.size() - 1;
        }
        arrayList.remove(i10);
    }

    /* access modifiers changed from: package-private */
    public final D g() {
        return this.f18205a.c();
    }

    /* access modifiers changed from: package-private */
    public final o h() {
        o oVar = e().f18126c;
        if (oVar != null) {
            return oVar;
        }
        o b10 = this.f18205a.b();
        return b10 == null ? v.f18100d : b10;
    }

    /* access modifiers changed from: package-private */
    public final Locale i() {
        return this.f18205a.d();
    }

    /* access modifiers changed from: package-private */
    public final Long j(a aVar) {
        return (Long) e().f18124a.get(aVar);
    }

    /* access modifiers changed from: package-private */
    public final boolean k() {
        return this.f18206b;
    }

    /* access modifiers changed from: package-private */
    public final boolean l() {
        return this.f18207c;
    }

    /* access modifiers changed from: package-private */
    public final void m(boolean z10) {
        this.f18206b = z10;
    }

    /* access modifiers changed from: package-private */
    public final void n(ZoneId zoneId) {
        if (zoneId != null) {
            e().f18125b = zoneId;
            return;
        }
        throw new NullPointerException("zone");
    }

    /* access modifiers changed from: package-private */
    public final int o(j$.time.temporal.o oVar, long j10, int i10, int i11) {
        if (oVar != null) {
            Long l10 = (Long) e().f18124a.put(oVar, Long.valueOf(j10));
            return (l10 == null || l10.longValue() == j10) ? i11 : ~i10;
        }
        throw new NullPointerException("field");
    }

    /* access modifiers changed from: package-private */
    public final void p() {
        e().getClass();
    }

    /* access modifiers changed from: package-private */
    public final void q(boolean z10) {
        this.f18207c = z10;
    }

    /* access modifiers changed from: package-private */
    public final void r() {
        ArrayList arrayList = this.f18208d;
        E e10 = e();
        e10.getClass();
        E e11 = new E();
        e11.f18124a.putAll(e10.f18124a);
        e11.f18125b = e10.f18125b;
        e11.f18126c = e10.f18126c;
        arrayList.add(e11);
    }

    /* access modifiers changed from: package-private */
    public final boolean s(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12) {
        if (i10 + i12 > charSequence.length() || i11 + i12 > charSequence2.length()) {
            return false;
        }
        if (this.f18206b) {
            for (int i13 = 0; i13 < i12; i13++) {
                if (charSequence.charAt(i10 + i13) != charSequence2.charAt(i11 + i13)) {
                    return false;
                }
            }
            return true;
        }
        for (int i14 = 0; i14 < i12; i14++) {
            char charAt = charSequence.charAt(i10 + i14);
            char charAt2 = charSequence2.charAt(i11 + i14);
            if (charAt != charAt2 && Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final j t(F f10, Set set) {
        E e10 = e();
        e10.f18126c = h();
        ZoneId zoneId = e10.f18125b;
        if (zoneId == null) {
            zoneId = this.f18205a.e();
        }
        e10.f18125b = zoneId;
        e10.l(f10, set);
        return e10;
    }

    public final String toString() {
        return e().toString();
    }
}
