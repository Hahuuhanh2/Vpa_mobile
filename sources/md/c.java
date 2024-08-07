package md;

import androidx.viewpager2.widget.d;
import com.google.zxing.NotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kd.q;
import ld.a;
import ld.b;
import nd.e;
import nd.i;
import nd.j;
import uc.h;

/* compiled from: RSSExpandedReader */
public final class c extends a {

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f13265k = {7, 5, 4, 3, 1};

    /* renamed from: l  reason: collision with root package name */
    public static final int[] f13266l = {4, 20, 52, 104, 204};

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f13267m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n  reason: collision with root package name */
    public static final int[][] f13268n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o  reason: collision with root package name */
    public static final int[][] f13269o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, 128, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, 200, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p  reason: collision with root package name */
    public static final int[][] f13270p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f13271g = new ArrayList(11);

    /* renamed from: h  reason: collision with root package name */
    public final ArrayList f13272h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public final int[] f13273i = new int[2];

    /* renamed from: j  reason: collision with root package name */
    public boolean f13274j;

    public static h n(List<a> list) {
        i iVar;
        int size = (list.size() << 1) - 1;
        if (list.get(list.size() - 1).f13260b == null) {
            size--;
        }
        cd.a aVar = new cd.a(size * 12);
        int i10 = list.get(0).f13260b.f12959a;
        int i11 = 0;
        for (int i12 = 11; i12 >= 0; i12--) {
            if (((1 << i12) & i10) != 0) {
                aVar.l(i11);
            }
            i11++;
        }
        for (int i13 = 1; i13 < list.size(); i13++) {
            a aVar2 = list.get(i13);
            int i14 = aVar2.f13259a.f12959a;
            for (int i15 = 11; i15 >= 0; i15--) {
                if (((1 << i15) & i14) != 0) {
                    aVar.l(i11);
                }
                i11++;
            }
            b bVar = aVar2.f13260b;
            if (bVar != null) {
                int i16 = bVar.f12959a;
                for (int i17 = 11; i17 >= 0; i17--) {
                    if (((1 << i17) & i16) != 0) {
                        aVar.l(i11);
                    }
                    i11++;
                }
            }
        }
        if (aVar.e(1)) {
            iVar = new nd.c(1, aVar);
        } else if (!aVar.e(2)) {
            iVar = new j(aVar);
        } else {
            int d10 = d.d(1, 4, aVar);
            if (d10 == 4) {
                iVar = new nd.a(aVar);
            } else if (d10 != 5) {
                int d11 = d.d(1, 5, aVar);
                if (d11 == 12) {
                    iVar = new nd.c(0, aVar);
                } else if (d11 != 13) {
                    switch (d.d(1, 7, aVar)) {
                        case 56:
                            iVar = new e(aVar, "310", "11");
                            break;
                        case 57:
                            iVar = new e(aVar, "320", "11");
                            break;
                        case 58:
                            iVar = new e(aVar, "310", "13");
                            break;
                        case 59:
                            iVar = new e(aVar, "320", "13");
                            break;
                        case 60:
                            iVar = new e(aVar, "310", "15");
                            break;
                        case 61:
                            iVar = new e(aVar, "320", "15");
                            break;
                        case 62:
                            iVar = new e(aVar, "310", "17");
                            break;
                        case 63:
                            iVar = new e(aVar, "320", "17");
                            break;
                        default:
                            throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(aVar)));
                    }
                } else {
                    iVar = new nd.d(aVar);
                }
            } else {
                iVar = new nd.b(aVar);
            }
        }
        String a10 = iVar.a();
        uc.j[] jVarArr = list.get(0).f13261c.f12963c;
        uc.j[] jVarArr2 = list.get(list.size() - 1).f13261c.f12963c;
        return new h(a10, (byte[]) null, new uc.j[]{jVarArr[0], jVarArr[1], jVarArr2[0], jVarArr2[1]}, uc.a.RSS_EXPANDED);
    }

    public final h c(int i10, cd.a aVar, Map<uc.b, ?> map) {
        this.f13271g.clear();
        this.f13274j = false;
        try {
            return n(p(i10, aVar));
        } catch (NotFoundException unused) {
            this.f13271g.clear();
            this.f13274j = true;
            return n(p(i10, aVar));
        }
    }

    public final boolean k() {
        a aVar = (a) this.f13271g.get(0);
        b bVar = aVar.f13259a;
        b bVar2 = aVar.f13260b;
        if (bVar2 == null) {
            return false;
        }
        int i10 = bVar2.f12960b;
        int i11 = 2;
        for (int i12 = 1; i12 < this.f13271g.size(); i12++) {
            a aVar2 = (a) this.f13271g.get(i12);
            i10 += aVar2.f13259a.f12960b;
            i11++;
            b bVar3 = aVar2.f13260b;
            if (bVar3 != null) {
                i10 += bVar3.f12960b;
                i11++;
            }
        }
        if (((i11 - 4) * 211) + (i10 % 211) == bVar.f12959a) {
            return true;
        }
        return false;
    }

    public final List l(int i10, ArrayList arrayList) {
        boolean z10;
        while (i10 < this.f13272h.size()) {
            b bVar = (b) this.f13272h.get(i10);
            this.f13271g.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f13271g.addAll(((b) it.next()).f13262a);
            }
            this.f13271g.addAll(bVar.f13262a);
            ArrayList arrayList2 = this.f13271g;
            int[][] iArr = f13270p;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= 10) {
                    break;
                }
                int[] iArr2 = iArr[i11];
                if (arrayList2.size() <= iArr2.length) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= arrayList2.size()) {
                            z10 = true;
                            break;
                        } else if (((a) arrayList2.get(i12)).f13261c.f12961a != iArr2[i12]) {
                            z10 = false;
                            break;
                        } else {
                            i12++;
                        }
                    }
                    if (z10) {
                        z11 = true;
                        break;
                    }
                }
                i11++;
            }
            if (!z11) {
                i10++;
            } else if (k()) {
                return this.f13271g;
            } else {
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.add(bVar);
                try {
                    return l(i10 + 1, arrayList3);
                } catch (NotFoundException unused) {
                }
            }
        }
        throw NotFoundException.f7967c;
    }

    public final List<a> m(boolean z10) {
        List<a> list = null;
        if (this.f13272h.size() > 25) {
            this.f13272h.clear();
            return null;
        }
        this.f13271g.clear();
        if (z10) {
            Collections.reverse(this.f13272h);
        }
        try {
            list = l(0, new ArrayList());
        } catch (NotFoundException unused) {
        }
        if (z10) {
            Collections.reverse(this.f13272h);
        }
        return list;
    }

    public final b o(cd.a aVar, ld.c cVar, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i10;
        boolean z18;
        boolean z19;
        cd.a aVar2 = aVar;
        ld.c cVar2 = cVar;
        int[] iArr = this.f12954b;
        Arrays.fill(iArr, 0);
        if (z11) {
            q.g(cVar2.f12962b[0], aVar2, iArr);
        } else {
            q.f(cVar2.f12962b[1], aVar2, iArr);
            int i11 = 0;
            for (int length = iArr.length - 1; i11 < length; length--) {
                int i12 = iArr[i11];
                iArr[i11] = iArr[length];
                iArr[length] = i12;
                i11++;
            }
        }
        float Z = ((float) m9.b.Z(iArr)) / 17.0f;
        int[] iArr2 = cVar2.f12962b;
        float f10 = ((float) (iArr2[1] - iArr2[0])) / 15.0f;
        if (Math.abs(Z - f10) / f10 <= 0.3f) {
            int[] iArr3 = this.f12957e;
            int[] iArr4 = this.f12958f;
            float[] fArr = this.f12955c;
            float[] fArr2 = this.f12956d;
            for (int i13 = 0; i13 < iArr.length; i13++) {
                float f11 = (((float) iArr[i13]) * 1.0f) / Z;
                int i14 = (int) (0.5f + f11);
                if (i14 <= 0) {
                    if (f11 >= 0.3f) {
                        i14 = 1;
                    } else {
                        throw NotFoundException.f7967c;
                    }
                } else if (i14 > 8) {
                    if (f11 <= 8.7f) {
                        i14 = 8;
                    } else {
                        throw NotFoundException.f7967c;
                    }
                }
                int i15 = i13 / 2;
                if ((i13 & 1) == 0) {
                    iArr3[i15] = i14;
                    fArr[i15] = f11 - ((float) i14);
                } else {
                    iArr4[i15] = i14;
                    fArr2[i15] = f11 - ((float) i14);
                }
            }
            int Z2 = m9.b.Z(this.f12957e);
            int Z3 = m9.b.Z(this.f12958f);
            if (Z2 > 13) {
                z12 = false;
                z13 = true;
            } else {
                z13 = false;
                if (Z2 < 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (Z3 > 13) {
                z15 = false;
                z14 = true;
            } else if (Z3 < 4) {
                z14 = false;
                z15 = true;
            } else {
                z15 = false;
                z14 = false;
            }
            int i16 = (Z2 + Z3) - 17;
            if ((Z2 & 1) == 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((Z3 & 1) == 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (i16 != -1) {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw NotFoundException.f7967c;
                    } else if (z16) {
                        if (!z17) {
                            z13 = true;
                        } else {
                            throw NotFoundException.f7967c;
                        }
                    } else if (z17) {
                        z14 = true;
                    } else {
                        throw NotFoundException.f7967c;
                    }
                } else if (z16) {
                    if (!z17) {
                        throw NotFoundException.f7967c;
                    } else if (Z2 < Z3) {
                        z12 = true;
                        z14 = true;
                    } else {
                        z13 = true;
                        z15 = true;
                    }
                } else if (z17) {
                    throw NotFoundException.f7967c;
                }
            } else if (z16) {
                if (!z17) {
                    z12 = true;
                } else {
                    throw NotFoundException.f7967c;
                }
            } else if (z17) {
                z15 = true;
            } else {
                throw NotFoundException.f7967c;
            }
            if (z12) {
                if (!z13) {
                    a.i(this.f12955c, this.f12957e);
                } else {
                    throw NotFoundException.f7967c;
                }
            }
            if (z13) {
                a.h(this.f12955c, this.f12957e);
            }
            if (z15) {
                if (!z14) {
                    a.i(this.f12955c, this.f12958f);
                } else {
                    throw NotFoundException.f7967c;
                }
            }
            if (z14) {
                a.h(this.f12956d, this.f12958f);
            }
            int i17 = cVar2.f12961a * 4;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 2;
            }
            int i18 = ((i17 + i10) + (z11 ^ true ? 1 : 0)) - 1;
            int i19 = 0;
            int i20 = 0;
            for (int length2 = iArr3.length - 1; length2 >= 0; length2--) {
                if (cVar2.f12961a != 0 || !z10 || !z11) {
                    z19 = true;
                } else {
                    z19 = false;
                }
                if (z19) {
                    i19 += iArr3[length2] * f13269o[i18][length2 * 2];
                }
                i20 += iArr3[length2];
            }
            int i21 = 0;
            for (int length3 = iArr4.length - 1; length3 >= 0; length3--) {
                if (cVar2.f12961a != 0 || !z10 || !z11) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (z18) {
                    i21 += iArr4[length3] * f13269o[i18][(length3 * 2) + 1];
                }
            }
            int i22 = i19 + i21;
            if ((i20 & 1) != 0 || i20 > 13 || i20 < 4) {
                throw NotFoundException.f7967c;
            }
            int i23 = (13 - i20) / 2;
            int i24 = f13265k[i23];
            int i25 = 9 - i24;
            return new b((j7.a.L(iArr3, i24, true) * f13266l[i23]) + j7.a.L(iArr4, i25, false) + f13267m[i23], i22);
        }
        throw NotFoundException.f7967c;
    }

    public final List<a> p(int i10, cd.a aVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        while (!z15) {
            try {
                ArrayList arrayList = this.f13271g;
                arrayList.add(q(aVar, arrayList, i10));
            } catch (NotFoundException e10) {
                if (!this.f13271g.isEmpty()) {
                    z15 = true;
                } else {
                    throw e10;
                }
            }
        }
        if (k()) {
            return this.f13271g;
        }
        boolean z16 = !this.f13272h.isEmpty();
        int i11 = 0;
        boolean z17 = false;
        while (true) {
            if (i11 >= this.f13272h.size()) {
                z10 = false;
                break;
            }
            b bVar = (b) this.f13272h.get(i11);
            if (bVar.f13263b > i10) {
                z10 = bVar.f13262a.equals(this.f13271g);
                break;
            }
            z17 = bVar.f13262a.equals(this.f13271g);
            i11++;
        }
        if (!z10 && !z17) {
            ArrayList arrayList2 = this.f13271g;
            Iterator it = this.f13272h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z11 = false;
                    break;
                }
                b bVar2 = (b) it.next();
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z13 = true;
                        continue;
                        break;
                    }
                    a aVar2 = (a) it2.next();
                    Iterator it3 = bVar2.f13262a.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (aVar2.equals((a) it3.next())) {
                                z14 = true;
                                continue;
                                break;
                            }
                        } else {
                            z14 = false;
                            continue;
                            break;
                        }
                    }
                    if (!z14) {
                        z13 = false;
                        continue;
                        break;
                    }
                }
                if (z13) {
                    z11 = true;
                    break;
                }
            }
            if (!z11) {
                this.f13272h.add(i11, new b(i10, this.f13271g));
                ArrayList arrayList3 = this.f13271g;
                Iterator it4 = this.f13272h.iterator();
                while (it4.hasNext()) {
                    b bVar3 = (b) it4.next();
                    if (bVar3.f13262a.size() != arrayList3.size()) {
                        Iterator it5 = bVar3.f13262a.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                if (!arrayList3.contains((a) it5.next())) {
                                    z12 = false;
                                    break;
                                }
                            } else {
                                z12 = true;
                                break;
                            }
                        }
                        if (z12) {
                            it4.remove();
                        }
                    }
                }
            }
        }
        if (z16) {
            List<a> m10 = m(false);
            if (m10 != null) {
                return m10;
            }
            List<a> m11 = m(true);
            if (m11 != null) {
                return m11;
            }
        }
        throw NotFoundException.f7967c;
    }

    public final a q(cd.a aVar, ArrayList arrayList, int i10) {
        boolean z10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        ld.c cVar;
        boolean z11;
        cd.a aVar2 = aVar;
        ArrayList arrayList2 = arrayList;
        int i19 = 2;
        int i20 = 1;
        int i21 = 0;
        if (arrayList.size() % 2 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f13274j) {
            z10 = !z10;
        }
        boolean z12 = true;
        int i22 = -1;
        while (true) {
            int[] iArr = this.f12953a;
            iArr[i11] = i11;
            iArr[i20] = i11;
            iArr[i19] = i11;
            int i23 = 3;
            iArr[3] = i11;
            int i24 = aVar2.f4688b;
            if (i22 >= 0) {
                i12 = i22;
            } else if (arrayList.isEmpty()) {
                i12 = i11;
            } else {
                i12 = ((a) arrayList2.get(arrayList.size() - i20)).f13261c.f12962b[i20];
            }
            if (arrayList.size() % i19 != 0) {
                i13 = i20;
            } else {
                i13 = i11;
            }
            if (this.f13274j) {
                i13 ^= 1;
            }
            boolean z13 = i11;
            while (i12 < i24) {
                z13 = aVar2.e(i12) ^ i20;
                if (!z13) {
                    break;
                }
                i12++;
            }
            int i25 = z13;
            int i26 = i12;
            while (i12 < i24) {
                if (aVar2.e(i12) != i25) {
                    iArr[i11] = iArr[i11] + i20;
                    i14 = i23;
                    i15 = i20;
                } else {
                    if (i11 == i23) {
                        if (i13 != 0) {
                            int length = iArr.length;
                            for (int i27 = 0; i27 < length / 2; i27++) {
                                int i28 = iArr[i27];
                                int i29 = (length - i27) - 1;
                                iArr[i27] = iArr[i29];
                                iArr[i29] = i28;
                            }
                        }
                        if (a.j(iArr)) {
                            int[] iArr2 = this.f13273i;
                            iArr2[0] = i26;
                            iArr2[1] = i12;
                            if (z10) {
                                do {
                                    i26--;
                                    if (i26 < 0 || aVar2.e(i26)) {
                                        i26++;
                                        int[] iArr3 = this.f13273i;
                                        i16 = iArr3[0] - i26;
                                        i17 = 1;
                                        i18 = iArr3[1];
                                    }
                                    i26--;
                                    break;
                                } while (aVar2.e(i26));
                                i26++;
                                int[] iArr32 = this.f13273i;
                                i16 = iArr32[0] - i26;
                                i17 = 1;
                                i18 = iArr32[1];
                            } else {
                                i17 = 1;
                                i18 = aVar2.g(i12 + 1);
                                i16 = i18 - this.f13273i[1];
                            }
                            int i30 = i18;
                            int i31 = i26;
                            int[] iArr4 = this.f12953a;
                            System.arraycopy(iArr4, 0, iArr4, i17, iArr4.length - i17);
                            iArr4[0] = i16;
                            b bVar = null;
                            try {
                                int[][] iArr5 = f13268n;
                                int i32 = 0;
                                while (i32 < 6) {
                                    if (q.e(iArr4, iArr5[i32], 0.45f) < 0.2f) {
                                        cVar = new ld.c(i32, i31, i30, i10, new int[]{i31, i30});
                                        if (cVar == null) {
                                            int i33 = this.f13273i[0];
                                            if (aVar2.e(i33)) {
                                                i22 = aVar2.f(aVar2.g(i33));
                                            } else {
                                                i22 = aVar2.g(aVar2.f(i33));
                                            }
                                        } else {
                                            z12 = false;
                                        }
                                        if (!z12) {
                                            b o10 = o(aVar2, cVar, z10, true);
                                            if (!arrayList.isEmpty()) {
                                                if (((a) arrayList2.get(arrayList.size() - 1)).f13260b == null) {
                                                    z11 = true;
                                                } else {
                                                    z11 = false;
                                                }
                                                if (z11) {
                                                    throw NotFoundException.f7967c;
                                                }
                                            }
                                            try {
                                                bVar = o(aVar2, cVar, z10, false);
                                            } catch (NotFoundException unused) {
                                            }
                                            return new a(o10, bVar, cVar);
                                        }
                                        i19 = 2;
                                        i20 = 1;
                                        i21 = 0;
                                    } else {
                                        i32++;
                                    }
                                }
                                throw NotFoundException.f7967c;
                            } catch (NotFoundException unused2) {
                                cVar = null;
                            }
                        } else {
                            if (i13 != 0) {
                                int length2 = iArr.length;
                                for (int i34 = 0; i34 < length2 / 2; i34++) {
                                    int i35 = iArr[i34];
                                    int i36 = (length2 - i34) - 1;
                                    iArr[i34] = iArr[i36];
                                    iArr[i36] = i35;
                                }
                            }
                            i15 = 1;
                            i26 += iArr[0] + iArr[1];
                            iArr[0] = iArr[2];
                            i14 = 3;
                            iArr[1] = iArr[3];
                            iArr[2] = 0;
                            iArr[3] = 0;
                            i11--;
                        }
                    } else {
                        i14 = i23;
                        i15 = i20;
                        i11++;
                    }
                    iArr[i11] = i15;
                    i25 ^= 1;
                }
                i12++;
                i20 = i15;
                i23 = i14;
            }
            throw NotFoundException.f7967c;
        }
    }

    public final void reset() {
        this.f13271g.clear();
        this.f13272h.clear();
    }
}
