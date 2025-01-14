package hd;

import p3.l0;

/* compiled from: SymbolInfo */
public class f {

    /* renamed from: i  reason: collision with root package name */
    public static f[] f10753i = {new f(false, 3, 5, 8, 8, 1), new f(false, 5, 7, 10, 10, 1), new f(true, 5, 7, 16, 6, 1), new f(false, 8, 10, 12, 12, 1), new f(true, 10, 11, 14, 6, 2), new f(false, 12, 12, 14, 14, 1), new f(true, 16, 14, 24, 10, 1), new f(false, 18, 14, 16, 16, 1), new f(false, 22, 18, 18, 18, 1), new f(true, 22, 18, 16, 10, 2), new f(false, 30, 20, 20, 20, 1), new f(true, 32, 24, 16, 14, 2), new f(false, 36, 24, 22, 22, 1), new f(false, 44, 28, 24, 24, 1), new f(true, 49, 28, 22, 14, 2), new f(false, 62, 36, 14, 14, 4), new f(false, 86, 42, 16, 16, 4), new f(false, 114, 48, 18, 18, 4), new f(false, 144, 56, 20, 20, 4), new f(false, 174, 68, 22, 22, 4), new f(false, 204, 84, 24, 24, 4, 102, 42), new f(false, 280, 112, 14, 14, 16, 140, 56), new f(false, 368, 144, 16, 16, 16, 92, 36), new f(false, 456, 192, 18, 18, 16, 114, 48), new f(false, 576, 224, 20, 20, 16, 144, 56), new f(false, 696, 272, 22, 22, 16, 174, 68), new f(false, 816, 336, 24, 24, 16, 136, 56), new f(false, 1050, 408, 18, 18, 36, 175, 68), new f(false, 1304, 496, 20, 20, 36, 163, 62), new a()};

    /* renamed from: a  reason: collision with root package name */
    public final boolean f10754a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10755b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10756c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10757d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10758e;

    /* renamed from: f  reason: collision with root package name */
    public final int f10759f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10760g;

    /* renamed from: h  reason: collision with root package name */
    public final int f10761h;

    public f(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    public static f f(int i10, g gVar, l0 l0Var, l0 l0Var2) {
        f[] fVarArr = f10753i;
        for (int i11 = 0; i11 < 30; i11++) {
            f fVar = fVarArr[i11];
            if ((gVar != g.FORCE_SQUARE || !fVar.f10754a) && ((gVar != g.FORCE_RECTANGLE || fVar.f10754a) && ((l0Var == null || (fVar.d() >= 0 && (fVar.e() * fVar.f10758e) + (fVar.e() << 1) >= 0)) && ((l0Var2 == null || (fVar.d() <= 0 && (fVar.e() * fVar.f10758e) + (fVar.e() << 1) <= 0)) && i10 <= fVar.f10755b)))) {
                return fVar;
            }
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
    }

    public int a(int i10) {
        return this.f10760g;
    }

    public final int b() {
        int i10 = this.f10759f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (!(i10 == 2 || i10 == 4)) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i11;
    }

    public int c() {
        return this.f10755b / this.f10760g;
    }

    public final int d() {
        return (b() * this.f10757d) + (b() << 1);
    }

    public final int e() {
        int i10 = this.f10759f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.f10754a) {
            str = "Rectangular Symbol:";
        } else {
            str = "Square Symbol:";
        }
        sb2.append(str);
        sb2.append(" data region ");
        sb2.append(this.f10757d);
        sb2.append('x');
        sb2.append(this.f10758e);
        sb2.append(", symbol size ");
        sb2.append(d());
        sb2.append('x');
        sb2.append((e() * this.f10758e) + (e() << 1));
        sb2.append(", symbol data size ");
        sb2.append(b() * this.f10757d);
        sb2.append('x');
        sb2.append(e() * this.f10758e);
        sb2.append(", codewords ");
        sb2.append(this.f10755b);
        sb2.append('+');
        sb2.append(this.f10756c);
        return sb2.toString();
    }

    public f(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f10754a = z10;
        this.f10755b = i10;
        this.f10756c = i11;
        this.f10757d = i12;
        this.f10758e = i13;
        this.f10759f = i14;
        this.f10760g = i15;
        this.f10761h = i16;
    }
}
