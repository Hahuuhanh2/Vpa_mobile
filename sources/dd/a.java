package dd;

import cd.b;
import com.google.zxing.NotFoundException;
import uc.j;

/* compiled from: WhiteRectangleDetector */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f8944a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8945b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8946c;

    /* renamed from: d  reason: collision with root package name */
    public final int f8947d;

    /* renamed from: e  reason: collision with root package name */
    public final int f8948e;

    /* renamed from: f  reason: collision with root package name */
    public final int f8949f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8950g;

    public a(b bVar, int i10, int i11, int i12) {
        this.f8944a = bVar;
        int i13 = bVar.f4690b;
        this.f8945b = i13;
        int i14 = bVar.f4689a;
        this.f8946c = i14;
        int i15 = i10 / 2;
        int i16 = i11 - i15;
        this.f8947d = i16;
        int i17 = i11 + i15;
        this.f8948e = i17;
        int i18 = i12 - i15;
        this.f8950g = i18;
        int i19 = i12 + i15;
        this.f8949f = i19;
        if (i18 < 0 || i16 < 0 || i19 >= i13 || i17 >= i14) {
            throw NotFoundException.f7967c;
        }
    }

    public final boolean a(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f8944a.b(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f8944a.b(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public final j[] b() {
        boolean z10;
        int i10 = this.f8947d;
        int i11 = this.f8948e;
        int i12 = this.f8950g;
        int i13 = this.f8949f;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = true;
        while (true) {
            if (!z15) {
                z10 = false;
                break;
            }
            boolean z16 = false;
            boolean z17 = true;
            while (true) {
                if ((z17 || !z11) && i11 < this.f8946c) {
                    z17 = a(i12, i13, i11, false);
                    if (z17) {
                        i11++;
                        z11 = true;
                        z16 = true;
                    } else if (!z11) {
                        i11++;
                    }
                }
            }
            if (i11 < this.f8946c) {
                boolean z18 = true;
                while (true) {
                    if ((z18 || !z12) && i13 < this.f8945b) {
                        z18 = a(i10, i11, i13, true);
                        if (z18) {
                            i13++;
                            z12 = true;
                            z16 = true;
                        } else if (!z12) {
                            i13++;
                        }
                    }
                }
                if (i13 < this.f8945b) {
                    boolean z19 = true;
                    while (true) {
                        if ((z19 || !z13) && i10 >= 0) {
                            z19 = a(i12, i13, i10, false);
                            if (z19) {
                                i10--;
                                z13 = true;
                                z16 = true;
                            } else if (!z13) {
                                i10--;
                            }
                        }
                    }
                    if (i10 >= 0) {
                        z15 = z16;
                        boolean z20 = true;
                        while (true) {
                            if ((z20 || !z14) && i12 >= 0) {
                                z20 = a(i10, i11, i12, true);
                                if (z20) {
                                    i12--;
                                    z15 = true;
                                    z14 = true;
                                } else if (!z14) {
                                    i12--;
                                }
                            }
                        }
                        if (i12 < 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        z10 = true;
        if (!z10) {
            int i14 = i11 - i10;
            j jVar = null;
            int i15 = 1;
            j jVar2 = null;
            while (jVar2 == null && i15 < i14) {
                jVar2 = c((float) i10, (float) (i13 - i15), (float) (i10 + i15), (float) i13);
                i15++;
            }
            if (jVar2 != null) {
                int i16 = 1;
                j jVar3 = null;
                while (jVar3 == null && i16 < i14) {
                    jVar3 = c((float) i10, (float) (i12 + i16), (float) (i10 + i16), (float) i12);
                    i16++;
                }
                if (jVar3 != null) {
                    int i17 = 1;
                    j jVar4 = null;
                    while (jVar4 == null && i17 < i14) {
                        jVar4 = c((float) i11, (float) (i12 + i17), (float) (i11 - i17), (float) i12);
                        i17++;
                    }
                    if (jVar4 != null) {
                        int i18 = 1;
                        while (jVar == null && i18 < i14) {
                            jVar = c((float) i11, (float) (i13 - i18), (float) (i11 - i18), (float) i13);
                            i18++;
                        }
                        if (jVar != null) {
                            float f10 = jVar.f15488a;
                            float f11 = jVar.f15489b;
                            float f12 = jVar2.f15488a;
                            float f13 = jVar2.f15489b;
                            float f14 = jVar4.f15488a;
                            float f15 = jVar4.f15489b;
                            float f16 = jVar3.f15488a;
                            float f17 = jVar3.f15489b;
                            if (f10 < ((float) this.f8946c) / 2.0f) {
                                return new j[]{new j(f16 - 1.0f, f17 + 1.0f), new j(f12 + 1.0f, f13 + 1.0f), new j(f14 - 1.0f, f15 - 1.0f), new j(f10 + 1.0f, f11 - 1.0f)};
                            }
                            return new j[]{new j(f16 + 1.0f, f17 + 1.0f), new j(f12 + 1.0f, f13 - 1.0f), new j(f14 - 1.0f, f15 + 1.0f), new j(f10 - 1.0f, f11 - 1.0f)};
                        }
                        throw NotFoundException.f7967c;
                    }
                    throw NotFoundException.f7967c;
                }
                throw NotFoundException.f7967c;
            }
            throw NotFoundException.f7967c;
        }
        throw NotFoundException.f7967c;
    }

    public final j c(float f10, float f11, float f12, float f13) {
        double d10 = (double) (f10 - f12);
        double d11 = (double) (f11 - f13);
        int S = m9.b.S((float) Math.sqrt((d11 * d11) + (d10 * d10)));
        float f14 = (float) S;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < S; i10++) {
            float f17 = (float) i10;
            int S2 = m9.b.S((f17 * f15) + f10);
            int S3 = m9.b.S((f17 * f16) + f11);
            if (this.f8944a.b(S2, S3)) {
                return new j((float) S2, (float) S3);
            }
        }
        return null;
    }

    public a(b bVar) {
        this(bVar, 10, bVar.f4689a / 2, bVar.f4690b / 2);
    }
}
