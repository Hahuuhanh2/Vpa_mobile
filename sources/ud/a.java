package ud;

import cd.b;
import com.google.zxing.FormatException;

/* compiled from: BitMatrixParser */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f15490a;

    /* renamed from: b  reason: collision with root package name */
    public h f15491b;

    /* renamed from: c  reason: collision with root package name */
    public e f15492c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15493d;

    public a(b bVar) {
        int i10 = bVar.f4690b;
        if (i10 < 21 || (i10 & 3) != 1) {
            throw FormatException.a();
        }
        this.f15490a = bVar;
    }

    public final int a(int i10, int i11, int i12) {
        boolean z10;
        if (this.f15493d) {
            z10 = this.f15490a.b(i11, i10);
        } else {
            z10 = this.f15490a.b(i10, i11);
        }
        if (z10) {
            return (i12 << 1) | 1;
        }
        return i12 << 1;
    }

    public final void b() {
        int i10 = 0;
        while (i10 < this.f15490a.f4689a) {
            int i11 = i10 + 1;
            int i12 = i11;
            while (true) {
                b bVar = this.f15490a;
                if (i12 >= bVar.f4690b) {
                    break;
                }
                if (bVar.b(i10, i12) != this.f15490a.b(i12, i10)) {
                    this.f15490a.a(i12, i10);
                    this.f15490a.a(i10, i12);
                }
                i12++;
            }
            i10 = i11;
        }
    }

    public final e c() {
        e eVar = this.f15492c;
        if (eVar != null) {
            return eVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = a(i12, 8, i11);
        }
        int a10 = a(8, 7, a(8, 8, a(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            a10 = a(8, i13, a10);
        }
        int i14 = this.f15490a.f4690b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = a(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = a(i17, 8, i10);
        }
        e a11 = e.a(a10, i10);
        if (a11 == null) {
            a11 = e.a(a10 ^ 21522, i10 ^ 21522);
        }
        this.f15492c = a11;
        if (a11 != null) {
            return a11;
        }
        throw FormatException.a();
    }

    public final h d() {
        h hVar = this.f15491b;
        if (hVar != null) {
            return hVar;
        }
        int i10 = this.f15490a.f4690b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return h.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = a(i16, i15, i14);
            }
        }
        h b10 = h.b(i14);
        if (b10 == null || (b10.f15517a * 4) + 17 != i10) {
            for (int i17 = 5; i17 >= 0; i17--) {
                for (int i18 = i10 - 9; i18 >= i12; i18--) {
                    i13 = a(i17, i18, i13);
                }
            }
            h b11 = h.b(i13);
            if (b11 == null || (b11.f15517a * 4) + 17 != i10) {
                throw FormatException.a();
            }
            this.f15491b = b11;
            return b11;
        }
        this.f15491b = b10;
        return b10;
    }

    public final void e() {
        if (this.f15492c != null) {
            c cVar = c.values()[this.f15492c.f15500b];
            b bVar = this.f15490a;
            int i10 = bVar.f4690b;
            cVar.getClass();
            for (int i11 = 0; i11 < i10; i11++) {
                for (int i12 = 0; i12 < i10; i12++) {
                    if (cVar.b(i11, i12)) {
                        bVar.a(i12, i11);
                    }
                }
            }
        }
    }
}
