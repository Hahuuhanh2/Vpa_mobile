package j$.time.format;

import j$.time.b;

/* renamed from: j$.time.format.e  reason: case insensitive filesystem */
final class C0351e implements C0353g {

    /* renamed from: a  reason: collision with root package name */
    private final char f18144a;

    C0351e(char c10) {
        this.f18144a = c10;
    }

    public final boolean m(A a10, StringBuilder sb2) {
        sb2.append(this.f18144a);
        return true;
    }

    public final int n(x xVar, CharSequence charSequence, int i10) {
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        char charAt = charSequence.charAt(i10);
        return (charAt == this.f18144a || (!xVar.k() && (Character.toUpperCase(charAt) == Character.toUpperCase(this.f18144a) || Character.toLowerCase(charAt) == Character.toLowerCase(this.f18144a)))) ? i10 + 1 : ~i10;
    }

    public final String toString() {
        if (this.f18144a == '\'') {
            return "''";
        }
        StringBuilder b10 = b.b("'");
        b10.append(this.f18144a);
        b10.append("'");
        return b10.toString();
    }
}
