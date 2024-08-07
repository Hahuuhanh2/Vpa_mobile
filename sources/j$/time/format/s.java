package j$.time.format;

import j$.time.b;
import j$.time.chrono.v;
import j$.time.temporal.a;
import j$.time.temporal.n;
import j$.time.temporal.o;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

final class s implements C0353g {

    /* renamed from: a  reason: collision with root package name */
    private final o f18181a;

    /* renamed from: b  reason: collision with root package name */
    private final TextStyle f18182b;

    /* renamed from: c  reason: collision with root package name */
    private final C f18183c;

    /* renamed from: d  reason: collision with root package name */
    private volatile k f18184d;

    s(o oVar, TextStyle textStyle, C c10) {
        this.f18181a = oVar;
        this.f18182b = textStyle;
        this.f18183c = c10;
    }

    public final boolean m(A a10, StringBuilder sb2) {
        String str;
        v vVar;
        Long e10 = a10.e(this.f18181a);
        if (e10 == null) {
            return false;
        }
        j$.time.chrono.o oVar = (j$.time.chrono.o) a10.d().K(n.e());
        if (oVar == null || oVar == (vVar = v.f18100d)) {
            str = this.f18183c.d(this.f18181a, e10.longValue(), this.f18182b, a10.c());
        } else {
            C c10 = this.f18183c;
            o oVar2 = this.f18181a;
            long longValue = e10.longValue();
            TextStyle textStyle = this.f18182b;
            Locale c11 = a10.c();
            c10.getClass();
            str = (oVar == vVar || !(oVar2 instanceof a)) ? c10.d(oVar2, longValue, textStyle, c11) : null;
        }
        if (str == null) {
            if (this.f18184d == null) {
                this.f18184d = new k(this.f18181a, 1, 19, 1);
            }
            return this.f18184d.m(a10, sb2);
        }
        sb2.append(str);
        return true;
    }

    public final int n(x xVar, CharSequence charSequence, int i10) {
        v vVar;
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        Iterator it = null;
        TextStyle textStyle = xVar.l() ? this.f18182b : null;
        j$.time.chrono.o h10 = xVar.h();
        if (h10 == null || h10 == (vVar = v.f18100d)) {
            it = this.f18183c.e(this.f18181a, textStyle, xVar.i());
        } else {
            C c10 = this.f18183c;
            o oVar = this.f18181a;
            Locale i11 = xVar.i();
            c10.getClass();
            if (h10 == vVar || !(oVar instanceof a)) {
                it = c10.e(oVar, textStyle, i11);
            }
        }
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (xVar.s(str, 0, charSequence, i10, str.length())) {
                    return xVar.o(this.f18181a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                }
            }
            if (xVar.l()) {
                return ~i10;
            }
        }
        if (this.f18184d == null) {
            this.f18184d = new k(this.f18181a, 1, 19, 1);
        }
        return this.f18184d.n(xVar, charSequence, i10);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2;
        if (this.f18182b == TextStyle.FULL) {
            sb2 = b.b("Text(");
            obj = this.f18181a;
        } else {
            sb2 = b.b("Text(");
            sb2.append(this.f18181a);
            sb2.append(",");
            obj = this.f18182b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
