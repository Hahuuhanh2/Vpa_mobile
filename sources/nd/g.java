package nd;

import cd.a;

/* compiled from: AI01decoder */
public abstract class g extends i {
    public g(a aVar) {
        super(aVar);
    }

    public final void b(int i10, StringBuilder sb2) {
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append('9');
        c(sb2, i10, length);
    }

    public final void c(StringBuilder sb2, int i10, int i11) {
        int i12 = 0;
        for (int i13 = 0; i13 < 4; i13++) {
            int c10 = this.f13573b.c((i13 * 10) + i10, 10);
            if (c10 / 100 == 0) {
                sb2.append('0');
            }
            if (c10 / 10 == 0) {
                sb2.append('0');
            }
            sb2.append(c10);
        }
        int i14 = 0;
        for (int i15 = 0; i15 < 13; i15++) {
            int charAt = sb2.charAt(i15 + i11) - '0';
            if ((i15 & 1) == 0) {
                charAt *= 3;
            }
            i14 += charAt;
        }
        int i16 = 10 - (i14 % 10);
        if (i16 != 10) {
            i12 = i16;
        }
        sb2.append(i12);
    }
}
