package x7;

/* compiled from: Arrangement */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f17073a;

    /* renamed from: b  reason: collision with root package name */
    public float f17074b;

    /* renamed from: c  reason: collision with root package name */
    public int f17075c;

    /* renamed from: d  reason: collision with root package name */
    public int f17076d;

    /* renamed from: e  reason: collision with root package name */
    public float f17077e;

    /* renamed from: f  reason: collision with root package name */
    public float f17078f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17079g;

    /* renamed from: h  reason: collision with root package name */
    public final float f17080h;

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b8, code lost:
        if (r7 > r2.f17074b) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c7, code lost:
        if (r2.f17078f > r2.f17074b) goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(int r3, float r4, float r5, float r6, int r7, float r8, int r9, float r10, int r11, float r12) {
        /*
            r2 = this;
            r2.<init>()
            r2.f17073a = r3
            float r4 = al.g0.F(r4, r5, r6)
            r2.f17074b = r4
            r2.f17075c = r7
            r2.f17077e = r8
            r2.f17076d = r9
            r2.f17078f = r10
            r2.f17079g = r11
            float r0 = (float) r11
            float r0 = r0 * r10
            float r9 = (float) r9
            float r8 = r8 * r9
            float r8 = r8 + r0
            float r9 = (float) r7
            float r0 = r9 * r4
            float r0 = r0 + r8
            float r8 = r12 - r0
            r0 = 0
            if (r7 <= 0) goto L_0x0031
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0031
            float r8 = r8 / r9
            float r6 = r6 - r4
            float r5 = java.lang.Math.min(r8, r6)
            float r5 = r5 + r4
            r2.f17074b = r5
            goto L_0x0040
        L_0x0031:
            if (r7 <= 0) goto L_0x0040
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0040
            float r8 = r8 / r9
            float r5 = r5 - r4
            float r5 = java.lang.Math.max(r8, r5)
            float r5 = r5 + r4
            r2.f17074b = r5
        L_0x0040:
            int r4 = r2.f17075c
            if (r4 <= 0) goto L_0x0047
            float r5 = r2.f17074b
            goto L_0x0048
        L_0x0047:
            r5 = r0
        L_0x0048:
            r2.f17074b = r5
            int r6 = r2.f17076d
            if (r4 <= 0) goto L_0x0050
            r7 = r5
            goto L_0x0051
        L_0x0050:
            r7 = r0
        L_0x0051:
            float r4 = (float) r4
            float r8 = (float) r6
            r9 = 1073741824(0x40000000, float:2.0)
            float r1 = r8 / r9
            float r4 = r4 + r1
            float r4 = r4 * r7
            float r12 = r12 - r4
            float r4 = (float) r11
            float r1 = r1 + r4
            float r12 = r12 / r1
            r2.f17078f = r12
            float r5 = r5 + r12
            float r5 = r5 / r9
            r2.f17077e = r5
            if (r6 <= 0) goto L_0x00a0
            int r6 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x00a0
            float r6 = r10 - r12
            float r6 = r6 * r4
            r4 = 1036831949(0x3dcccccd, float:0.1)
            float r5 = r5 * r4
            float r5 = r5 * r8
            float r4 = java.lang.Math.abs(r6)
            float r4 = java.lang.Math.min(r4, r5)
            int r5 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x008f
            float r5 = r2.f17077e
            int r6 = r2.f17076d
            float r6 = (float) r6
            float r6 = r4 / r6
            float r5 = r5 - r6
            r2.f17077e = r5
            float r5 = r2.f17078f
            float r6 = (float) r11
            float r4 = r4 / r6
            float r4 = r4 + r5
            r2.f17078f = r4
            goto L_0x00a0
        L_0x008f:
            float r5 = r2.f17077e
            int r6 = r2.f17076d
            float r6 = (float) r6
            float r6 = r4 / r6
            float r6 = r6 + r5
            r2.f17077e = r6
            float r5 = r2.f17078f
            float r6 = (float) r11
            float r4 = r4 / r6
            float r5 = r5 - r4
            r2.f17078f = r5
        L_0x00a0:
            r4 = 0
            r5 = 1
            if (r11 <= 0) goto L_0x00bb
            int r6 = r2.f17075c
            if (r6 <= 0) goto L_0x00bb
            int r6 = r2.f17076d
            if (r6 <= 0) goto L_0x00bb
            float r6 = r2.f17078f
            float r7 = r2.f17077e
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ca
            float r6 = r2.f17074b
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ca
            goto L_0x00c9
        L_0x00bb:
            if (r11 <= 0) goto L_0x00cb
            int r6 = r2.f17075c
            if (r6 <= 0) goto L_0x00cb
            float r6 = r2.f17078f
            float r7 = r2.f17074b
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x00ca
        L_0x00c9:
            r4 = r5
        L_0x00ca:
            r5 = r4
        L_0x00cb:
            if (r5 != 0) goto L_0x00d1
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            goto L_0x00da
        L_0x00d1:
            float r4 = r2.f17078f
            float r10 = r10 - r4
            float r4 = java.lang.Math.abs(r10)
            float r3 = (float) r3
            float r3 = r3 * r4
        L_0x00da:
            r2.f17080h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.a.<init>(int, float, float, float, int, float, int, float, int, float):void");
    }

    public static a a(float f10, float f11, float f12, float f13, int[] iArr, float f14, int[] iArr2, float f15, int[] iArr3) {
        int[] iArr4 = iArr;
        int[] iArr5 = iArr2;
        int i10 = 1;
        a aVar = null;
        for (int i11 : iArr3) {
            int length = iArr5.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = iArr5[i12];
                int length2 = iArr4.length;
                int i14 = 0;
                while (i14 < length2) {
                    a aVar2 = r8;
                    int i15 = i14;
                    int i16 = length2;
                    int i17 = i12;
                    int i18 = length;
                    a aVar3 = new a(i10, f11, f12, f13, iArr4[i14], f14, i13, f15, i11, f10);
                    if (aVar == null || aVar2.f17080h < aVar.f17080h) {
                        if (aVar2.f17080h == 0.0f) {
                            return aVar2;
                        }
                        aVar = aVar2;
                    }
                    i10++;
                    i14 = i15 + 1;
                    length2 = i16;
                    i12 = i17;
                    length = i18;
                }
                int i19 = length;
                i12++;
            }
        }
        return aVar;
    }

    public final String toString() {
        StringBuilder q10 = android.support.v4.media.a.q("Arrangement [priority=");
        q10.append(this.f17073a);
        q10.append(", smallCount=");
        q10.append(this.f17075c);
        q10.append(", smallSize=");
        q10.append(this.f17074b);
        q10.append(", mediumCount=");
        q10.append(this.f17076d);
        q10.append(", mediumSize=");
        q10.append(this.f17077e);
        q10.append(", largeCount=");
        q10.append(this.f17079g);
        q10.append(", largeSize=");
        q10.append(this.f17078f);
        q10.append(", cost=");
        q10.append(this.f17080h);
        q10.append("]");
        return q10.toString();
    }
}
