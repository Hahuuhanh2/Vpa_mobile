package kd;

import com.google.zxing.FormatException;
import java.util.Map;
import uc.a;
import uc.h;
import uc.i;
import vl.d;

/* compiled from: EAN8Reader */
public final class k extends u {

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ int f12485i;

    /* renamed from: j  reason: collision with root package name */
    public final Object f12486j;

    public k(int i10) {
        this.f12485i = i10;
        if (i10 != 1) {
            this.f12486j = new int[4];
        } else {
            this.f12486j = new i();
        }
    }

    public static h r(h hVar) {
        String str = hVar.f15472a;
        if (str.charAt(0) == '0') {
            h hVar2 = new h(str.substring(1), (byte[]) null, hVar.f15474c, a.UPC_A);
            Map<i, Object> map = hVar.f15476e;
            if (map != null) {
                hVar2.a(map);
            }
            return hVar2;
        }
        throw FormatException.a();
    }

    public final h a(d dVar) {
        switch (this.f12485i) {
            case 1:
                return r(((u) this.f12486j).a(dVar));
            default:
                return b(dVar, (Map) null);
        }
    }

    public final h b(d dVar, Map map) {
        switch (this.f12485i) {
            case 1:
                return r(((u) this.f12486j).b(dVar, map));
            default:
                return super.b(dVar, map);
        }
    }

    public final h c(int i10, cd.a aVar, Map map) {
        switch (this.f12485i) {
            case 1:
                return r(((u) this.f12486j).c(i10, aVar, map));
            default:
                return super.c(i10, aVar, map);
        }
    }

    public final int l(cd.a aVar, int[] iArr, StringBuilder sb2) {
        switch (this.f12485i) {
            case 0:
                int[] iArr2 = (int[]) this.f12486j;
                iArr2[0] = 0;
                iArr2[1] = 0;
                iArr2[2] = 0;
                iArr2[3] = 0;
                int i10 = aVar.f4688b;
                int i11 = iArr[1];
                for (int i12 = 0; i12 < 4 && i11 < i10; i12++) {
                    sb2.append((char) (u.j(aVar, iArr2, i11, u.f12509g) + 48));
                    for (int i13 : iArr2) {
                        i11 += i13;
                    }
                }
                int i14 = u.n(aVar, i11, true, u.f12507e, new int[5])[1];
                for (int i15 = 0; i15 < 4 && i14 < i10; i15++) {
                    sb2.append((char) (u.j(aVar, iArr2, i14, u.f12509g) + 48));
                    for (int i16 : iArr2) {
                        i14 += i16;
                    }
                }
                return i14;
            default:
                return ((u) this.f12486j).l(aVar, iArr, sb2);
        }
    }

    public final h m(int i10, cd.a aVar, int[] iArr, Map map) {
        switch (this.f12485i) {
            case 1:
                return r(((u) this.f12486j).m(i10, aVar, iArr, map));
            default:
                return super.m(i10, aVar, iArr, map);
        }
    }

    public final a p() {
        switch (this.f12485i) {
            case 0:
                return a.EAN_8;
            default:
                return a.UPC_A;
        }
    }
}
