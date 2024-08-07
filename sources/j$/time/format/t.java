package j$.time.format;

import j$.time.temporal.WeekFields;
import j$.time.temporal.o;
import java.util.Locale;

final class t implements C0353g {

    /* renamed from: a  reason: collision with root package name */
    private char f18185a;

    /* renamed from: b  reason: collision with root package name */
    private int f18186b;

    t(char c10, int i10) {
        this.f18185a = c10;
        this.f18186b = i10;
    }

    private k a(Locale locale) {
        o oVar;
        WeekFields of2 = WeekFields.of(locale);
        char c10 = this.f18185a;
        int i10 = 1;
        if (c10 == 'W') {
            oVar = of2.h();
        } else if (c10 == 'Y') {
            o g2 = of2.g();
            int i11 = this.f18186b;
            if (i11 == 2) {
                return new q(g2, q.f18177i, 0);
            }
            if (i11 >= 4) {
                i10 = 5;
            }
            return new k(g2, i11, 19, i10, -1);
        } else if (c10 == 'c' || c10 == 'e') {
            oVar = of2.d();
        } else if (c10 == 'w') {
            oVar = of2.i();
        } else {
            throw new IllegalStateException("unreachable");
        }
        if (this.f18186b == 2) {
            i10 = 2;
        }
        return new k(oVar, i10, 2, 4);
    }

    public final boolean m(A a10, StringBuilder sb2) {
        return a(a10.c()).m(a10, sb2);
    }

    public final int n(x xVar, CharSequence charSequence, int i10) {
        return a(xVar.i()).n(xVar, charSequence, i10);
    }

    public final String toString() {
        String str;
        String b10;
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append("Localized(");
        char c10 = this.f18185a;
        if (c10 == 'Y') {
            int i10 = this.f18186b;
            int i11 = 1;
            if (i10 == 1) {
                b10 = "WeekBasedYear";
            } else if (i10 == 2) {
                b10 = "ReducedValue(WeekBasedYear,2,2,2000-01-01)";
            } else {
                sb2.append("WeekBasedYear,");
                sb2.append(this.f18186b);
                sb2.append(",");
                sb2.append(19);
                sb2.append(",");
                if (this.f18186b >= 4) {
                    i11 = 5;
                }
                b10 = G.b(i11);
            }
            sb2.append(b10);
        } else {
            if (c10 == 'W') {
                str = "WeekOfMonth";
            } else if (c10 == 'c' || c10 == 'e') {
                str = "DayOfWeek";
            } else {
                if (c10 == 'w') {
                    str = "WeekOfWeekBasedYear";
                }
                sb2.append(",");
                sb2.append(this.f18186b);
            }
            sb2.append(str);
            sb2.append(",");
            sb2.append(this.f18186b);
        }
        sb2.append(")");
        return sb2.toString();
    }
}
