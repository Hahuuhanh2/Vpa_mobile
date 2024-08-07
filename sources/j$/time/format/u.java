package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.e;
import j$.time.temporal.a;
import j$.time.temporal.p;
import j$.time.zone.i;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.HashSet;

class u implements C0353g {

    /* renamed from: c  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f18187c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile AbstractMap.SimpleImmutableEntry f18188d;

    /* renamed from: a  reason: collision with root package name */
    private final p f18189a;

    /* renamed from: b  reason: collision with root package name */
    private final String f18190b;

    u(p pVar, String str) {
        this.f18189a = pVar;
        this.f18190b = str;
    }

    private static int b(x xVar, CharSequence charSequence, int i10, int i11, l lVar) {
        String upperCase = charSequence.toString().substring(i10, i11).toUpperCase();
        if (i11 < charSequence.length() && charSequence.charAt(i11) != '0' && !xVar.b(charSequence.charAt(i11), 'Z')) {
            x d10 = xVar.d();
            int n10 = lVar.n(d10, charSequence, i11);
            if (n10 < 0) {
                try {
                    if (lVar == l.f18160d) {
                        return ~i10;
                    }
                    xVar.n(ZoneId.of(upperCase));
                    return i11;
                } catch (e unused) {
                    return ~i10;
                }
            } else {
                xVar.n(ZoneId.W(upperCase, ZoneOffset.e0((int) d10.j(a.OFFSET_SECONDS).longValue())));
                return n10;
            }
        } else {
            xVar.n(ZoneId.of(upperCase));
            return i11;
        }
    }

    /* access modifiers changed from: protected */
    public o a(x xVar) {
        HashSet a10 = i.a();
        int size = a10.size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = xVar.k() ? f18187c : f18188d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    AbstractMap.SimpleImmutableEntry simpleImmutableEntry2 = xVar.k() ? f18187c : f18188d;
                    if (simpleImmutableEntry2 == null || ((Integer) simpleImmutableEntry2.getKey()).intValue() != size) {
                        simpleImmutableEntry2 = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), o.g(a10, xVar));
                        if (xVar.k()) {
                            f18187c = simpleImmutableEntry2;
                        } else {
                            f18188d = simpleImmutableEntry2;
                        }
                    }
                } catch (Throwable th2) {
                    while (true) {
                        throw th2;
                    }
                }
            }
        }
        return (o) simpleImmutableEntry.getValue();
    }

    public boolean m(A a10, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) a10.f(this.f18189a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.l());
        return true;
    }

    public final int n(x xVar, CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        if (i10 > length) {
            throw new IndexOutOfBoundsException();
        } else if (i10 == length) {
            return ~i10;
        } else {
            char charAt = charSequence.charAt(i10);
            if (charAt == '+' || charAt == '-') {
                return b(xVar, charSequence, i10, i10, l.f18160d);
            }
            int i12 = i10 + 2;
            if (length >= i12) {
                char charAt2 = charSequence.charAt(i10 + 1);
                if (xVar.b(charAt, 'U') && xVar.b(charAt2, 'T')) {
                    int i13 = i10 + 3;
                    return (length < i13 || !xVar.b(charSequence.charAt(i12), 'C')) ? b(xVar, charSequence, i10, i12, l.f18161e) : b(xVar, charSequence, i10, i13, l.f18161e);
                } else if (xVar.b(charAt, 'G') && length >= (i11 = i10 + 3) && xVar.b(charAt2, 'M') && xVar.b(charSequence.charAt(i12), 'T')) {
                    return b(xVar, charSequence, i10, i11, l.f18161e);
                }
            }
            o a10 = a(xVar);
            ParsePosition parsePosition = new ParsePosition(i10);
            String d10 = a10.d(charSequence, parsePosition);
            if (d10 != null) {
                xVar.n(ZoneId.of(d10));
                return parsePosition.getIndex();
            } else if (!xVar.b(charAt, 'Z')) {
                return ~i10;
            } else {
                xVar.n(ZoneOffset.UTC);
                return i10 + 1;
            }
        }
    }

    public final String toString() {
        return this.f18190b;
    }
}
