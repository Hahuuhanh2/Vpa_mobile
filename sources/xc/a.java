package xc;

import cd.b;
import cd.g;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import p3.l0;
import uc.j;
import z.d;

/* compiled from: Detector */
public final class a {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f17276g = {3808, 476, 2107, 1799};

    /* renamed from: a  reason: collision with root package name */
    public final b f17277a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f17278b;

    /* renamed from: c  reason: collision with root package name */
    public int f17279c;

    /* renamed from: d  reason: collision with root package name */
    public int f17280d;

    /* renamed from: e  reason: collision with root package name */
    public int f17281e;

    /* renamed from: f  reason: collision with root package name */
    public int f17282f;

    /* renamed from: xc.a$a  reason: collision with other inner class name */
    /* compiled from: Detector */
    public static final class C0228a {

        /* renamed from: a  reason: collision with root package name */
        public final int f17283a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17284b;

        public C0228a(int i10, int i11) {
            this.f17283a = i10;
            this.f17284b = i11;
        }

        public final String toString() {
            return "<" + this.f17283a + ' ' + this.f17284b + '>';
        }
    }

    public a(b bVar) {
        this.f17277a = bVar;
    }

    public static j[] b(j[] jVarArr, int i10, int i11) {
        float f10 = ((float) i11) / (((float) i10) * 2.0f);
        j jVar = jVarArr[0];
        float f11 = jVar.f15488a;
        j jVar2 = jVarArr[2];
        float f12 = jVar2.f15488a;
        float f13 = f11 - f12;
        float f14 = jVar.f15489b;
        float f15 = jVar2.f15489b;
        float f16 = f14 - f15;
        float f17 = (f11 + f12) / 2.0f;
        float f18 = (f14 + f15) / 2.0f;
        float f19 = f13 * f10;
        float f20 = f16 * f10;
        j jVar3 = new j(f17 + f19, f18 + f20);
        j jVar4 = new j(f17 - f19, f18 - f20);
        j jVar5 = jVarArr[1];
        float f21 = jVar5.f15488a;
        j jVar6 = jVarArr[3];
        float f22 = jVar6.f15488a;
        float f23 = f21 - f22;
        float f24 = jVar5.f15489b;
        float f25 = jVar6.f15489b;
        float f26 = f24 - f25;
        float f27 = (f21 + f22) / 2.0f;
        float f28 = (f24 + f25) / 2.0f;
        float f29 = f23 * f10;
        float f30 = f10 * f26;
        return new j[]{jVar3, new j(f27 + f29, f28 + f30), jVar4, new j(f27 - f29, f28 - f30)};
    }

    public final vc.a a(boolean z10) {
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        j jVar5;
        j jVar6;
        j jVar7;
        j jVar8;
        C0228a aVar;
        boolean z11;
        int i10;
        int i11;
        long j10;
        int i12;
        C0228a aVar2;
        boolean z12;
        int i13 = 2;
        int i14 = -1;
        int i15 = 1;
        try {
            j[] b10 = new dd.a(this.f17277a).b();
            jVar3 = b10[0];
            jVar2 = b10[1];
            jVar = b10[2];
            jVar4 = b10[3];
        } catch (NotFoundException unused) {
            b bVar = this.f17277a;
            int i16 = bVar.f4689a / 2;
            int i17 = bVar.f4690b / 2;
            int i18 = i17 - 7;
            int i19 = i16 + 7 + 1;
            int i20 = i19;
            int i21 = i18;
            while (true) {
                i21--;
                if (!f(i20, i21) || this.f17277a.b(i20, i21)) {
                    int i22 = i20 - 1;
                    int i23 = i21 + 1;
                } else {
                    i20++;
                }
            }
            int i222 = i20 - 1;
            int i232 = i21 + 1;
            while (f(i222, i232) && !this.f17277a.b(i222, i232)) {
                i222++;
            }
            int i24 = i222 - 1;
            while (f(i24, i232) && !this.f17277a.b(i24, i232)) {
                i232--;
            }
            j jVar9 = new j((float) i24, (float) (i232 + 1));
            int i25 = i17 + 7;
            int i26 = i25;
            while (true) {
                i26++;
                if (!f(i19, i26) || this.f17277a.b(i19, i26)) {
                    int i27 = i19 - 1;
                    int i28 = i26 - 1;
                } else {
                    i19++;
                }
            }
            int i272 = i19 - 1;
            int i282 = i26 - 1;
            while (f(i272, i282) && !this.f17277a.b(i272, i282)) {
                i272++;
            }
            int i29 = i272 - 1;
            while (f(i29, i282) && !this.f17277a.b(i29, i282)) {
                i282++;
            }
            j jVar10 = new j((float) i29, (float) (i282 - 1));
            int i30 = i16 - 7;
            int i31 = i30 - 1;
            while (true) {
                i25++;
                if (!f(i31, i25) || this.f17277a.b(i31, i25)) {
                    int i32 = i31 + 1;
                    int i33 = i25 - 1;
                } else {
                    i31--;
                }
            }
            int i322 = i31 + 1;
            int i332 = i25 - 1;
            while (f(i322, i332) && !this.f17277a.b(i322, i332)) {
                i322--;
            }
            int i34 = i322 + 1;
            while (f(i34, i332) && !this.f17277a.b(i34, i332)) {
                i332++;
            }
            j jVar11 = new j((float) i34, (float) (i332 - 1));
            do {
                i30--;
                i18--;
                if (!f(i30, i18) || this.f17277a.b(i30, i18)) {
                    int i35 = i30 + 1;
                    int i36 = i18 + 1;
                }
                i30--;
                i18--;
                break;
            } while (this.f17277a.b(i30, i18));
            int i352 = i30 + 1;
            int i362 = i18 + 1;
            while (f(i352, i362) && !this.f17277a.b(i352, i362)) {
                i352--;
            }
            int i37 = i352 + 1;
            while (f(i37, i362) && !this.f17277a.b(i37, i362)) {
                i362--;
            }
            jVar4 = new j((float) i37, (float) (i362 + 1));
            jVar = jVar11;
            jVar2 = jVar10;
            jVar3 = jVar9;
        }
        int S = m9.b.S((((jVar3.f15488a + jVar4.f15488a) + jVar2.f15488a) + jVar.f15488a) / 4.0f);
        int S2 = m9.b.S((((jVar3.f15489b + jVar4.f15489b) + jVar2.f15489b) + jVar.f15489b) / 4.0f);
        try {
            j[] b11 = new dd.a(this.f17277a, 15, S, S2).b();
            jVar7 = b11[0];
            jVar6 = b11[1];
            jVar5 = b11[2];
            jVar8 = b11[3];
        } catch (NotFoundException unused2) {
            int i38 = S2 - 7;
            int i39 = S + 7 + 1;
            int i40 = i39;
            int i41 = i38;
            while (true) {
                i41--;
                if (!f(i40, i41) || this.f17277a.b(i40, i41)) {
                    int i42 = i40 - 1;
                    int i43 = i41 + 1;
                } else {
                    i40++;
                }
            }
            int i422 = i40 - 1;
            int i432 = i41 + 1;
            while (f(i422, i432) && !this.f17277a.b(i422, i432)) {
                i422++;
            }
            int i44 = i422 - 1;
            while (f(i44, i432) && !this.f17277a.b(i44, i432)) {
                i432--;
            }
            j jVar12 = new j((float) i44, (float) (i432 + 1));
            int i45 = S2 + 7;
            int i46 = i45;
            while (true) {
                i46++;
                if (!f(i39, i46) || this.f17277a.b(i39, i46)) {
                    int i47 = i39 - 1;
                    int i48 = i46 - 1;
                } else {
                    i39++;
                }
            }
            int i472 = i39 - 1;
            int i482 = i46 - 1;
            while (f(i472, i482) && !this.f17277a.b(i472, i482)) {
                i472++;
            }
            int i49 = i472 - 1;
            while (f(i49, i482) && !this.f17277a.b(i49, i482)) {
                i482++;
            }
            j jVar13 = new j((float) i49, (float) (i482 - 1));
            int i50 = S - 7;
            int i51 = i50 - 1;
            while (true) {
                i45++;
                if (!f(i51, i45) || this.f17277a.b(i51, i45)) {
                    int i52 = i51 + 1;
                    int i53 = i45 - 1;
                } else {
                    i51--;
                }
            }
            int i522 = i51 + 1;
            int i532 = i45 - 1;
            while (f(i522, i532) && !this.f17277a.b(i522, i532)) {
                i522--;
            }
            int i54 = i522 + 1;
            while (f(i54, i532) && !this.f17277a.b(i54, i532)) {
                i532++;
            }
            j jVar14 = new j((float) i54, (float) (i532 - 1));
            do {
                i50--;
                i38--;
                if (!f(i50, i38) || this.f17277a.b(i50, i38)) {
                    int i55 = i50 + 1;
                    int i56 = i38 + 1;
                }
                i50--;
                i38--;
                break;
            } while (this.f17277a.b(i50, i38));
            int i552 = i50 + 1;
            int i562 = i38 + 1;
            while (f(i552, i562) && !this.f17277a.b(i552, i562)) {
                i552--;
            }
            int i57 = i552 + 1;
            while (f(i57, i562) && !this.f17277a.b(i57, i562)) {
                i562--;
            }
            jVar8 = new j((float) i57, (float) (i562 + 1));
            jVar7 = jVar12;
            j jVar15 = jVar13;
            jVar5 = jVar14;
            jVar6 = jVar15;
        }
        C0228a aVar3 = new C0228a(m9.b.S((((jVar7.f15488a + jVar8.f15488a) + jVar6.f15488a) + jVar5.f15488a) / 4.0f), m9.b.S((((jVar7.f15489b + jVar8.f15489b) + jVar6.f15489b) + jVar5.f15489b) / 4.0f));
        this.f17281e = 1;
        boolean z13 = true;
        C0228a aVar4 = aVar3;
        C0228a aVar5 = aVar4;
        C0228a aVar6 = aVar5;
        while (true) {
            if (this.f17281e >= 9) {
                aVar = aVar4;
                break;
            }
            C0228a e10 = e(aVar3, z13, i15, i14);
            C0228a e11 = e(aVar4, z13, i15, i15);
            C0228a e12 = e(aVar5, z13, i14, i15);
            C0228a e13 = e(aVar6, z13, i14, i14);
            if (this.f17281e > i13) {
                int i58 = e13.f17283a;
                int i59 = e13.f17284b;
                double d10 = (double) (i58 - e10.f17283a);
                double d11 = (double) (i59 - e10.f17284b);
                float sqrt = ((float) Math.sqrt((d11 * d11) + (d10 * d10))) * ((float) this.f17281e);
                int i60 = aVar6.f17283a;
                int i61 = aVar6.f17284b;
                aVar = aVar4;
                double d12 = (double) (i60 - aVar3.f17283a);
                double d13 = (double) (i61 - aVar3.f17284b);
                double sqrt2 = (double) (sqrt / (((float) Math.sqrt((d13 * d13) + (d12 * d12))) * ((float) (this.f17281e + 2))));
                if (sqrt2 < 0.75d || sqrt2 > 1.25d) {
                    break;
                }
                C0228a aVar7 = new C0228a(e10.f17283a - 3, e10.f17284b + 3);
                C0228a aVar8 = new C0228a(e11.f17283a - 3, e11.f17284b - 3);
                C0228a aVar9 = new C0228a(e12.f17283a + 3, e12.f17284b - 3);
                aVar2 = e10;
                C0228a aVar10 = new C0228a(e13.f17283a + 3, e13.f17284b + 3);
                int c10 = c(aVar10, aVar7);
                if (c10 != 0 && c(aVar7, aVar8) == c10 && c(aVar8, aVar9) == c10 && c(aVar9, aVar10) == c10) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (!z12) {
                    break;
                }
            } else {
                aVar2 = e10;
            }
            z13 = !z13;
            this.f17281e++;
            aVar6 = e13;
            aVar4 = e11;
            aVar5 = e12;
            aVar3 = aVar2;
            i13 = 2;
            i14 = -1;
            i15 = 1;
        }
        int i62 = this.f17281e;
        if (i62 == 5 || i62 == 7) {
            if (i62 == 5) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f17278b = z11;
            int i63 = i62 * 2;
            j[] b12 = b(new j[]{new j(((float) aVar3.f17283a) + 0.5f, ((float) aVar3.f17284b) - 0.5f), new j(((float) aVar.f17283a) + 0.5f, ((float) aVar.f17284b) + 0.5f), new j(((float) aVar5.f17283a) - 0.5f, ((float) aVar5.f17284b) + 0.5f), new j(((float) aVar6.f17283a) - 0.5f, ((float) aVar6.f17284b) - 0.5f)}, i63 - 3, i63);
            if (z10) {
                j jVar16 = b12[0];
                b12[0] = b12[2];
                b12[2] = jVar16;
            }
            if (!g(b12[0]) || !g(b12[1]) || !g(b12[2]) || !g(b12[3])) {
                throw NotFoundException.f7967c;
            }
            int i64 = this.f17281e * 2;
            int[] iArr = {h(b12[0], b12[1], i64), h(b12[1], b12[2], i64), h(b12[2], b12[3], i64), h(b12[3], b12[0], i64)};
            int i65 = 0;
            for (int i66 = 0; i66 < 4; i66++) {
                int i67 = iArr[i66];
                i65 = (i65 << 3) + ((i67 >> (i64 - 2)) << 1) + (i67 & 1);
            }
            int i68 = ((i65 & 1) << 11) + (i65 >> 1);
            for (int i69 = 0; i69 < 4; i69++) {
                if (Integer.bitCount(f17276g[i69] ^ i68) <= 2) {
                    this.f17282f = i69;
                    long j11 = 0;
                    int i70 = 0;
                    while (true) {
                        i10 = 10;
                        if (i70 >= 4) {
                            break;
                        }
                        int i71 = iArr[(this.f17282f + i70) % 4];
                        if (this.f17278b) {
                            j10 = j11 << 7;
                            i12 = (i71 >> 1) & 127;
                        } else {
                            j10 = j11 << 10;
                            i12 = ((i71 >> 2) & 992) + ((i71 >> 1) & 31);
                        }
                        j11 = j10 + ((long) i12);
                        i70++;
                    }
                    if (this.f17278b) {
                        i10 = 7;
                        i11 = 2;
                    } else {
                        i11 = 4;
                    }
                    int i72 = i10 - i11;
                    int[] iArr2 = new int[i10];
                    while (true) {
                        i10--;
                        if (i10 >= 0) {
                            iArr2[i10] = ((int) j11) & 15;
                            j11 >>= 4;
                        } else {
                            try {
                                break;
                            } catch (ReedSolomonException unused3) {
                                throw NotFoundException.f7967c;
                            }
                        }
                    }
                    new d((Object) ed.a.f9342k).d(iArr2, i72);
                    int i73 = 0;
                    for (int i74 = 0; i74 < i11; i74++) {
                        i73 = (i73 << 4) + iArr2[i74];
                    }
                    if (this.f17278b) {
                        this.f17279c = (i73 >> 6) + 1;
                        this.f17280d = (i73 & 63) + 1;
                    } else {
                        this.f17279c = (i73 >> 11) + 1;
                        this.f17280d = (i73 & 2047) + 1;
                    }
                    b bVar2 = this.f17277a;
                    int i75 = this.f17282f;
                    j jVar17 = b12[i75 % 4];
                    j jVar18 = b12[(i75 + 1) % 4];
                    j jVar19 = b12[(i75 + 2) % 4];
                    j jVar20 = b12[(i75 + 3) % 4];
                    int d14 = d();
                    float f10 = ((float) d14) / 2.0f;
                    float f11 = (float) this.f17281e;
                    float f12 = f10 - f11;
                    float f13 = f10 + f11;
                    return new vc.a(l0.E0(bVar2, d14, d14, g.a(f12, f12, f13, f12, f13, f13, f12, f13, jVar17.f15488a, jVar17.f15489b, jVar18.f15488a, jVar18.f15489b, jVar19.f15488a, jVar19.f15489b, jVar20.f15488a, jVar20.f15489b)), b(b12, this.f17281e * 2, d()), this.f17278b, this.f17280d, this.f17279c);
                }
            }
            throw NotFoundException.f7967c;
        }
        throw NotFoundException.f7967c;
    }

    public final int c(C0228a aVar, C0228a aVar2) {
        int i10 = aVar.f17283a;
        int i11 = aVar.f17284b;
        double d10 = (double) (i10 - aVar2.f17283a);
        double d11 = (double) (i11 - aVar2.f17284b);
        float sqrt = (float) Math.sqrt((d11 * d11) + (d10 * d10));
        int i12 = aVar2.f17283a;
        int i13 = aVar.f17283a;
        float f10 = ((float) (i12 - i13)) / sqrt;
        int i14 = aVar2.f17284b;
        int i15 = aVar.f17284b;
        float f11 = ((float) (i14 - i15)) / sqrt;
        float f12 = (float) i13;
        float f13 = (float) i15;
        boolean b10 = this.f17277a.b(i13, i15);
        int ceil = (int) Math.ceil((double) sqrt);
        boolean z10 = false;
        int i16 = 0;
        for (int i17 = 0; i17 < ceil; i17++) {
            f12 += f10;
            f13 += f11;
            if (this.f17277a.b(m9.b.S(f12), m9.b.S(f13)) != b10) {
                i16++;
            }
        }
        float f14 = ((float) i16) / sqrt;
        if (f14 > 0.1f && f14 < 0.9f) {
            return 0;
        }
        if (f14 <= 0.1f) {
            z10 = true;
        }
        if (z10 == b10) {
            return 1;
        }
        return -1;
    }

    public final int d() {
        if (this.f17278b) {
            return (this.f17279c * 4) + 11;
        }
        int i10 = this.f17279c;
        if (i10 <= 4) {
            return (i10 * 4) + 15;
        }
        return ((((i10 - 4) / 8) + 1) * 2) + (i10 * 4) + 15;
    }

    public final C0228a e(C0228a aVar, boolean z10, int i10, int i11) {
        int i12 = aVar.f17283a + i10;
        int i13 = aVar.f17284b;
        while (true) {
            i13 += i11;
            if (!f(i12, i13) || this.f17277a.b(i12, i13) != z10) {
                int i14 = i12 - i10;
                int i15 = i13 - i11;
            } else {
                i12 += i10;
            }
        }
        int i142 = i12 - i10;
        int i152 = i13 - i11;
        while (f(i142, i152) && this.f17277a.b(i142, i152) == z10) {
            i142 += i10;
        }
        int i16 = i142 - i10;
        while (f(i16, i152) && this.f17277a.b(i16, i152) == z10) {
            i152 += i11;
        }
        return new C0228a(i16, i152 - i11);
    }

    public final boolean f(int i10, int i11) {
        if (i10 < 0) {
            return false;
        }
        b bVar = this.f17277a;
        if (i10 >= bVar.f4689a || i11 <= 0 || i11 >= bVar.f4690b) {
            return false;
        }
        return true;
    }

    public final boolean g(j jVar) {
        return f(m9.b.S(jVar.f15488a), m9.b.S(jVar.f15489b));
    }

    public final int h(j jVar, j jVar2, int i10) {
        float f10 = jVar.f15488a;
        float f11 = jVar.f15489b;
        double d10 = (double) (f10 - jVar2.f15488a);
        double d11 = (double) (f11 - jVar2.f15489b);
        float sqrt = (float) Math.sqrt((d11 * d11) + (d10 * d10));
        float f12 = sqrt / ((float) i10);
        float f13 = jVar.f15488a;
        float f14 = jVar.f15489b;
        float f15 = ((jVar2.f15488a - f13) * f12) / sqrt;
        float f16 = ((jVar2.f15489b - f14) * f12) / sqrt;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            float f17 = (float) i12;
            if (this.f17277a.b(m9.b.S((f17 * f15) + f13), m9.b.S((f17 * f16) + f14))) {
                i11 |= 1 << ((i10 - i12) - 1);
            }
        }
        return i11;
    }
}
