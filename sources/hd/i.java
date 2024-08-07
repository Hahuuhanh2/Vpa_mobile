package hd;

import lb.b;

/* compiled from: X12Encoder */
public final class i extends b {
    public i() {
        super(10);
    }

    public final int c(char c10, StringBuilder sb2) {
        if (c10 == 13) {
            sb2.append(0);
        } else if (c10 == ' ') {
            sb2.append(3);
        } else if (c10 == '*') {
            sb2.append(1);
        } else if (c10 == '>') {
            sb2.append(2);
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) ((c10 - '0') + 4));
        } else if (c10 < 'A' || c10 > 'Z') {
            m9.b.E(c10);
            throw null;
        } else {
            sb2.append((char) ((c10 - 'A') + 14));
        }
        return 1;
    }

    public final int h() {
        return 3;
    }

    public final void j(d dVar, StringBuilder sb2) {
        dVar.d(dVar.a());
        int a10 = dVar.f10747f.f10755b - dVar.a();
        dVar.f10745d -= sb2.length();
        if ((dVar.f10742a.length() - dVar.f10748g) - dVar.f10745d > 1 || a10 > 1 || (dVar.f10742a.length() - dVar.f10748g) - dVar.f10745d != a10) {
            dVar.e(254);
        }
        if (dVar.f10746e < 0) {
            dVar.f10746e = 0;
        }
    }

    public final void m(d dVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!dVar.c()) {
                break;
            }
            char b10 = dVar.b();
            dVar.f10745d++;
            c(b10, sb2);
            if (sb2.length() % 3 == 0) {
                b.l(dVar, sb2);
                if (m9.b.M(dVar.f10742a, dVar.f10745d, 3) != 3) {
                    dVar.f10746e = 0;
                    break;
                }
            }
        }
        j(dVar, sb2);
    }
}
