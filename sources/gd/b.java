package gd;

/* compiled from: Version */
public final class b {

    /* renamed from: h  reason: collision with root package name */
    public static final b[] f10442h = {new b(1, 10, 10, 8, 8, new C0113b(5, new a(1, 3))), new b(2, 12, 12, 10, 10, new C0113b(7, new a(1, 5))), new b(3, 14, 14, 12, 12, new C0113b(10, new a(1, 8))), new b(4, 16, 16, 14, 14, new C0113b(12, new a(1, 12))), new b(5, 18, 18, 16, 16, new C0113b(14, new a(1, 18))), new b(6, 20, 20, 18, 18, new C0113b(18, new a(1, 22))), new b(7, 22, 22, 20, 20, new C0113b(20, new a(1, 30))), new b(8, 24, 24, 22, 22, new C0113b(24, new a(1, 36))), new b(9, 26, 26, 24, 24, new C0113b(28, new a(1, 44))), new b(10, 32, 32, 14, 14, new C0113b(36, new a(1, 62))), new b(11, 36, 36, 16, 16, new C0113b(42, new a(1, 86))), new b(12, 40, 40, 18, 18, new C0113b(48, new a(1, 114))), new b(13, 44, 44, 20, 20, new C0113b(56, new a(1, 144))), new b(14, 48, 48, 22, 22, new C0113b(68, new a(1, 174))), new b(15, 52, 52, 24, 24, new C0113b(42, new a(2, 102))), new b(16, 64, 64, 14, 14, new C0113b(56, new a(2, 140))), new b(17, 72, 72, 16, 16, new C0113b(36, new a(4, 92))), new b(18, 80, 80, 18, 18, new C0113b(48, new a(4, 114))), new b(19, 88, 88, 20, 20, new C0113b(56, new a(4, 144))), new b(20, 96, 96, 22, 22, new C0113b(68, new a(4, 174))), new b(21, 104, 104, 24, 24, new C0113b(56, new a(6, 136))), new b(22, 120, 120, 18, 18, new C0113b(68, new a(6, 175))), new b(23, 132, 132, 20, 20, new C0113b(62, new a(8, 163))), new b(24, 144, 144, 22, 22, new C0113b(new a(8, 156), new a(2, 155))), new b(25, 8, 18, 6, 16, new C0113b(7, new a(1, 5))), new b(26, 8, 32, 6, 14, new C0113b(11, new a(1, 10))), new b(27, 12, 26, 10, 24, new C0113b(14, new a(1, 16))), new b(28, 12, 36, 10, 16, new C0113b(18, new a(1, 22))), new b(29, 16, 36, 14, 16, new C0113b(24, new a(1, 32))), new b(30, 16, 48, 14, 22, new C0113b(28, new a(1, 49)))};

    /* renamed from: a  reason: collision with root package name */
    public final int f10443a;

    /* renamed from: b  reason: collision with root package name */
    public final int f10444b;

    /* renamed from: c  reason: collision with root package name */
    public final int f10445c;

    /* renamed from: d  reason: collision with root package name */
    public final int f10446d;

    /* renamed from: e  reason: collision with root package name */
    public final int f10447e;

    /* renamed from: f  reason: collision with root package name */
    public final C0113b f10448f;

    /* renamed from: g  reason: collision with root package name */
    public final int f10449g;

    /* compiled from: Version */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f10450a;

        /* renamed from: b  reason: collision with root package name */
        public final int f10451b;

        public a(int i10, int i11) {
            this.f10450a = i10;
            this.f10451b = i11;
        }
    }

    public b(int i10, int i11, int i12, int i13, int i14, C0113b bVar) {
        this.f10443a = i10;
        this.f10444b = i11;
        this.f10445c = i12;
        this.f10446d = i13;
        this.f10447e = i14;
        this.f10448f = bVar;
        int i15 = bVar.f10452a;
        int i16 = 0;
        for (a aVar : bVar.f10453b) {
            i16 += (aVar.f10451b + i15) * aVar.f10450a;
        }
        this.f10449g = i16;
    }

    public final String toString() {
        return String.valueOf(this.f10443a);
    }

    /* renamed from: gd.b$b  reason: collision with other inner class name */
    /* compiled from: Version */
    public static final class C0113b {

        /* renamed from: a  reason: collision with root package name */
        public final int f10452a;

        /* renamed from: b  reason: collision with root package name */
        public final a[] f10453b;

        public C0113b(int i10, a aVar) {
            this.f10452a = i10;
            this.f10453b = new a[]{aVar};
        }

        public C0113b(a aVar, a aVar2) {
            this.f10452a = 62;
            this.f10453b = new a[]{aVar, aVar2};
        }
    }
}
