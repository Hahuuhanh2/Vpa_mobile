package j$.time.format;

import j$.time.b;
import j$.time.temporal.a;
import j$.time.temporal.o;
import j$.time.temporal.s;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: j$.time.format.h  reason: case insensitive filesystem */
final class C0354h implements C0353g {

    /* renamed from: a  reason: collision with root package name */
    private final o f18147a;

    /* renamed from: b  reason: collision with root package name */
    private final int f18148b;

    /* renamed from: c  reason: collision with root package name */
    private final int f18149c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f18150d;

    C0354h(a aVar, int i10, int i11, boolean z10) {
        if (aVar == null) {
            throw new NullPointerException("field");
        } else if (!aVar.o().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: " + aVar);
        } else if (i10 < 0 || i10 > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i10);
        } else if (i11 < 1 || i11 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i11);
        } else if (i11 >= i10) {
            this.f18147a = aVar;
            this.f18148b = i10;
            this.f18149c = i11;
            this.f18150d = z10;
        } else {
            throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i11 + " < " + i10);
        }
    }

    public final boolean m(A a10, StringBuilder sb2) {
        Long e10 = a10.e(this.f18147a);
        if (e10 == null) {
            return false;
        }
        D b10 = a10.b();
        long longValue = e10.longValue();
        s o10 = this.f18147a.o();
        o10.b(longValue, this.f18147a);
        BigDecimal valueOf = BigDecimal.valueOf(o10.e());
        BigDecimal divide = BigDecimal.valueOf(longValue).subtract(valueOf).divide(BigDecimal.valueOf(o10.d()).subtract(valueOf).add(BigDecimal.ONE), 9, RoundingMode.FLOOR);
        BigDecimal stripTrailingZeros = divide.compareTo(BigDecimal.ZERO) == 0 ? BigDecimal.ZERO : divide.stripTrailingZeros();
        if (stripTrailingZeros.scale() != 0) {
            String substring = stripTrailingZeros.setScale(Math.min(Math.max(stripTrailingZeros.scale(), this.f18148b), this.f18149c), RoundingMode.FLOOR).toPlainString().substring(2);
            b10.getClass();
            if (this.f18150d) {
                sb2.append('.');
            }
            sb2.append(substring);
            return true;
        } else if (this.f18148b <= 0) {
            return true;
        } else {
            if (this.f18150d) {
                b10.getClass();
                sb2.append('.');
            }
            for (int i10 = 0; i10 < this.f18148b; i10++) {
                b10.getClass();
                sb2.append('0');
            }
            return true;
        }
    }

    public final int n(x xVar, CharSequence charSequence, int i10) {
        int i11;
        int i12 = xVar.l() ? this.f18148b : 0;
        int i13 = xVar.l() ? this.f18149c : 9;
        int length = charSequence.length();
        if (i10 == length) {
            return i12 > 0 ? ~i10 : i10;
        }
        if (this.f18150d) {
            char charAt = charSequence.charAt(i10);
            xVar.g().getClass();
            if (charAt != '.') {
                return i12 > 0 ? ~i10 : i10;
            }
            i10++;
        }
        int i14 = i10;
        int i15 = i12 + i14;
        if (i15 > length) {
            return ~i14;
        }
        int min = Math.min(i13 + i14, length);
        int i16 = 0;
        int i17 = i14;
        while (true) {
            if (i17 >= min) {
                i11 = i17;
                break;
            }
            int i18 = i17 + 1;
            int a10 = xVar.g().a(charSequence.charAt(i17));
            if (a10 >= 0) {
                i16 = (i16 * 10) + a10;
                i17 = i18;
            } else if (i18 < i15) {
                return ~i14;
            } else {
                i11 = i18 - 1;
            }
        }
        BigDecimal movePointLeft = new BigDecimal(i16).movePointLeft(i11 - i14);
        s o10 = this.f18147a.o();
        BigDecimal valueOf = BigDecimal.valueOf(o10.e());
        return xVar.o(this.f18147a, movePointLeft.multiply(BigDecimal.valueOf(o10.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i14, i11);
    }

    public final String toString() {
        String str = this.f18150d ? ",DecimalPoint" : "";
        StringBuilder b10 = b.b("Fraction(");
        b10.append(this.f18147a);
        b10.append(",");
        b10.append(this.f18148b);
        b10.append(",");
        b10.append(this.f18149c);
        b10.append(str);
        b10.append(")");
        return b10.toString();
    }
}
