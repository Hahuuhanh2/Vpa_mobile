package yc;

/* compiled from: State */
public final class e {

    /* renamed from: e  reason: collision with root package name */
    public static final e f17654e = new e(f.f17659b, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public final int f17655a;

    /* renamed from: b  reason: collision with root package name */
    public final f f17656b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17657c;

    /* renamed from: d  reason: collision with root package name */
    public final int f17658d;

    public e(f fVar, int i10, int i11, int i12) {
        this.f17656b = fVar;
        this.f17655a = i10;
        this.f17657c = i11;
        this.f17658d = i12;
    }

    public final e a(int i10) {
        int i11;
        f fVar = this.f17656b;
        int i12 = this.f17655a;
        int i13 = this.f17658d;
        if (i12 == 4 || i12 == 2) {
            int i14 = c.f17648c[i12][0];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            fVar.getClass();
            d dVar = new d(fVar, i15, i16);
            i13 += i16;
            i12 = 0;
            fVar = dVar;
        }
        int i17 = this.f17657c;
        if (i17 == 0 || i17 == 31) {
            i11 = 18;
        } else if (i17 == 62) {
            i11 = 9;
        } else {
            i11 = 8;
        }
        int i18 = i17 + 1;
        e eVar = new e(fVar, i12, i18, i13 + i11);
        if (i18 == 2078) {
            return eVar.b(i10 + 1);
        }
        return eVar;
    }

    public final e b(int i10) {
        int i11 = this.f17657c;
        if (i11 == 0) {
            return this;
        }
        f fVar = this.f17656b;
        fVar.getClass();
        return new e(new a(fVar, i10 - i11, i11), this.f17655a, 0, this.f17658d);
    }

    public final boolean c(e eVar) {
        int i10;
        int i11 = this.f17658d + (c.f17648c[this.f17655a][eVar.f17655a] >> 16);
        int i12 = this.f17657c;
        int i13 = eVar.f17657c;
        if (i12 < i13) {
            int i14 = 20;
            if (i13 > 62) {
                i10 = 21;
            } else if (i13 > 31) {
                i10 = 20;
            } else if (i13 > 0) {
                i10 = 10;
            } else {
                i10 = 0;
            }
            if (i12 > 62) {
                i14 = 21;
            } else if (i12 <= 31) {
                if (i12 > 0) {
                    i14 = 10;
                } else {
                    i14 = 0;
                }
            }
            i11 += i10 - i14;
        } else if (i12 > i13 && i13 > 0) {
            i11 += 10;
        }
        if (i11 <= eVar.f17658d) {
            return true;
        }
        return false;
    }

    public final e d(int i10, int i11) {
        int i12;
        int i13 = this.f17658d;
        f fVar = this.f17656b;
        int i14 = this.f17655a;
        if (i10 != i14) {
            int i15 = c.f17648c[i14][i10];
            int i16 = 65535 & i15;
            int i17 = i15 >> 16;
            fVar.getClass();
            i13 += i17;
            fVar = new d(fVar, i16, i17);
        }
        if (i10 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        fVar.getClass();
        return new e(new d(fVar, i11, i12), i10, 0, i13 + i12);
    }

    public final e e(int i10, int i11) {
        int i12;
        f fVar = this.f17656b;
        int i13 = this.f17655a;
        if (i13 == 2) {
            i12 = 4;
        } else {
            i12 = 5;
        }
        int i14 = c.f17650e[i13][i10];
        fVar.getClass();
        return new e(new d(new d(fVar, i14, i12), i11, 5), this.f17655a, 0, this.f17658d + i12 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{c.f17647b[this.f17655a], Integer.valueOf(this.f17658d), Integer.valueOf(this.f17657c)});
    }
}
