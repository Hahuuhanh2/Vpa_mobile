package y;

import f0.m0;
import z.d;

/* compiled from: DeviceQuirks */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final d f17339a;

    /* JADX WARNING: Code restructure failed: missing block: B:147:0x025f, code lost:
        if (r2 == false) goto L_0x0262;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0204  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0209  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x022b  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0264  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0117  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0198  */
    static {
        /*
            z.d r0 = new z.d
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<java.lang.String> r2 = y.t.f17351a
            java.lang.String r3 = android.os.Build.MODEL
            boolean r2 = r2.contains(r3)
            r4 = 0
            r5 = 1
            java.lang.String r6 = "Google"
            if (r2 == 0) goto L_0x0025
            java.lang.String r2 = android.os.Build.MANUFACTURER
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L_0x0025
            int r2 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r2 < r7) goto L_0x0025
            r2 = r5
            goto L_0x0026
        L_0x0025:
            r2 = r4
        L_0x0026:
            if (r2 == 0) goto L_0x0030
            y.t r2 = new y.t
            r2.<init>()
            r1.add(r2)
        L_0x0030:
            boolean r2 = y.m.b()
            if (r2 == 0) goto L_0x003e
            y.m r2 = new y.m
            r2.<init>()
            r1.add(r2)
        L_0x003e:
            java.util.List<java.lang.String> r2 = y.y.f17356a
            java.lang.String r2 = android.os.Build.BRAND
            java.lang.String r7 = "GOOGLE"
            r7.equalsIgnoreCase(r2)
            java.lang.String r7 = "OnePlus"
            boolean r8 = r7.equalsIgnoreCase(r2)
            if (r8 == 0) goto L_0x005b
            java.lang.String r8 = android.os.Build.DEVICE
            java.lang.String r9 = "OnePlus6"
            boolean r8 = r9.equalsIgnoreCase(r8)
            if (r8 == 0) goto L_0x005b
            r8 = r5
            goto L_0x005c
        L_0x005b:
            r8 = r4
        L_0x005c:
            if (r8 != 0) goto L_0x00b0
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0070
            java.lang.String r7 = android.os.Build.DEVICE
            java.lang.String r8 = "OnePlus6T"
            boolean r7 = r8.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x0070
            r7 = r5
            goto L_0x0071
        L_0x0070:
            r7 = r4
        L_0x0071:
            if (r7 != 0) goto L_0x00b0
            java.lang.String r7 = "HUAWEI"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0087
            java.lang.String r7 = android.os.Build.DEVICE
            java.lang.String r8 = "HWANE"
            boolean r7 = r8.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x0087
            r7 = r5
            goto L_0x0088
        L_0x0087:
            r7 = r4
        L_0x0088:
            if (r7 != 0) goto L_0x00b0
            boolean r7 = y.l.b()
            if (r7 != 0) goto L_0x00b0
            boolean r7 = y.l.a()
            if (r7 != 0) goto L_0x00b0
            java.lang.String r7 = "REDMI"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x00aa
            java.lang.String r7 = android.os.Build.DEVICE
            java.lang.String r8 = "joyeuse"
            boolean r7 = r8.equalsIgnoreCase(r7)
            if (r7 == 0) goto L_0x00aa
            r7 = r5
            goto L_0x00ab
        L_0x00aa:
            r7 = r4
        L_0x00ab:
            if (r7 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r7 = r4
            goto L_0x00b1
        L_0x00b0:
            r7 = r5
        L_0x00b1:
            if (r7 == 0) goto L_0x00bb
            y.l r7 = new y.l
            r7.<init>()
            r1.add(r7)
        L_0x00bb:
            java.util.List<java.lang.String> r7 = y.j.f17338a
            java.util.Locale r8 = java.util.Locale.US
            java.lang.String r9 = r3.toUpperCase(r8)
            boolean r7 = r7.contains(r9)
            if (r7 == 0) goto L_0x00d1
            y.j r7 = new y.j
            r7.<init>()
            r1.add(r7)
        L_0x00d1:
            java.util.List<java.lang.String> r7 = y.a0.f17334a
            java.lang.String r7 = android.os.Build.MANUFACTURER
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x00ef
            java.util.List<java.lang.String> r6 = y.a0.f17334a
            java.lang.String r9 = android.os.Build.DEVICE
            java.util.Locale r10 = java.util.Locale.getDefault()
            java.lang.String r9 = r9.toLowerCase(r10)
            boolean r6 = r6.contains(r9)
            if (r6 == 0) goto L_0x00ef
            r6 = r5
            goto L_0x00f0
        L_0x00ef:
            r6 = r4
        L_0x00f0:
            if (r6 == 0) goto L_0x00fa
            y.a0 r6 = new y.a0
            r6.<init>()
            r1.add(r6)
        L_0x00fa:
            java.lang.String r6 = r7.toUpperCase(r8)
            java.lang.String r9 = "SAMSUNG"
            boolean r6 = r9.equals(r6)
            if (r6 == 0) goto L_0x0114
            java.lang.String r6 = r3.toUpperCase(r8)
            java.lang.String r9 = "SM-A716"
            boolean r6 = r6.startsWith(r9)
            if (r6 == 0) goto L_0x0114
            r6 = r5
            goto L_0x0115
        L_0x0114:
            r6 = r4
        L_0x0115:
            if (r6 == 0) goto L_0x011f
            y.d0 r6 = new y.d0
            r6.<init>()
            r1.add(r6)
        L_0x011f:
            f0.r0 r6 = y.o.f17341a
            java.lang.String r6 = android.os.Build.DEVICE
            java.lang.String r9 = "heroqltevzw"
            boolean r9 = r9.equalsIgnoreCase(r6)
            if (r9 != 0) goto L_0x0136
            java.lang.String r9 = "heroqltetmo"
            boolean r6 = r9.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0134
            goto L_0x0136
        L_0x0134:
            r6 = r4
            goto L_0x0137
        L_0x0136:
            r6 = r5
        L_0x0137:
            if (r6 != 0) goto L_0x0148
            boolean r6 = y.o.a()
            if (r6 != 0) goto L_0x0148
            boolean r6 = y.o.b()
            if (r6 == 0) goto L_0x0146
            goto L_0x0148
        L_0x0146:
            r6 = r4
            goto L_0x0149
        L_0x0148:
            r6 = r5
        L_0x0149:
            if (r6 == 0) goto L_0x0153
            y.o r6 = new y.o
            r6.<init>()
            r1.add(r6)
        L_0x0153:
            java.util.HashSet r6 = y.p.f17346a
            android.util.Pair r9 = new android.util.Pair
            java.lang.String r7 = r7.toLowerCase(r8)
            java.lang.String r10 = r3.toLowerCase(r8)
            r9.<init>(r7, r10)
            boolean r6 = r6.contains(r9)
            if (r6 == 0) goto L_0x0170
            y.p r6 = new y.p
            r6.<init>()
            r1.add(r6)
        L_0x0170:
            java.lang.String r6 = "Huawei"
            boolean r6 = r6.equalsIgnoreCase(r2)
            if (r6 == 0) goto L_0x0182
            java.lang.String r6 = "mha-l29"
            boolean r6 = r6.equalsIgnoreCase(r3)
            if (r6 == 0) goto L_0x0182
            r6 = r5
            goto L_0x0183
        L_0x0182:
            r6 = r4
        L_0x0183:
            if (r6 == 0) goto L_0x018d
            y.b0 r6 = new y.b0
            r6.<init>()
            r1.add(r6)
        L_0x018d:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 23
            if (r6 > r7) goto L_0x0195
            r6 = r5
            goto L_0x0196
        L_0x0195:
            r6 = r4
        L_0x0196:
            if (r6 == 0) goto L_0x01a0
            y.e0 r6 = new y.e0
            r6.<init>()
            r1.add(r6)
        L_0x01a0:
            java.util.List<java.lang.String> r6 = y.f0.f17337a
            java.lang.String r7 = r3.toLowerCase(r8)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x01b4
            y.f0 r6 = new y.f0
            r6.<init>()
            r1.add(r6)
        L_0x01b4:
            java.lang.String r6 = "samsung"
            boolean r7 = r6.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x01ca
            java.lang.String r7 = r3.toUpperCase(r8)
            java.lang.String r9 = "SM-F936"
            boolean r7 = r7.startsWith(r9)
            if (r7 == 0) goto L_0x01ca
            r7 = r5
            goto L_0x01cb
        L_0x01ca:
            r7 = r4
        L_0x01cb:
            if (r7 != 0) goto L_0x01e9
            java.lang.String r7 = "xiaomi"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x01e3
            java.lang.String r7 = r3.toUpperCase(r8)
            java.lang.String r9 = "MI 8"
            boolean r7 = r7.startsWith(r9)
            if (r7 == 0) goto L_0x01e3
            r7 = r5
            goto L_0x01e4
        L_0x01e3:
            r7 = r4
        L_0x01e4:
            if (r7 == 0) goto L_0x01e7
            goto L_0x01e9
        L_0x01e7:
            r7 = r4
            goto L_0x01ea
        L_0x01e9:
            r7 = r5
        L_0x01ea:
            if (r7 == 0) goto L_0x01f4
            y.i0 r7 = new y.i0
            r7.<init>()
            r1.add(r7)
        L_0x01f4:
            java.lang.String r7 = "motorola"
            boolean r7 = r7.equalsIgnoreCase(r2)
            if (r7 == 0) goto L_0x0206
            java.lang.String r7 = "moto e5 play"
            boolean r7 = r7.equalsIgnoreCase(r3)
            if (r7 == 0) goto L_0x0206
            r7 = r5
            goto L_0x0207
        L_0x0206:
            r7 = r4
        L_0x0207:
            if (r7 == 0) goto L_0x0211
            y.n r7 = new y.n
            r7.<init>()
            r1.add(r7)
        L_0x0211:
            java.util.List<java.lang.String> r7 = y.w.f17354a
            boolean r2 = r6.equalsIgnoreCase(r2)
            java.lang.String r6 = "tp1a"
            if (r2 == 0) goto L_0x022b
            java.lang.String r2 = android.os.Build.ID
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r7)
            boolean r2 = r2.startsWith(r6)
            if (r2 == 0) goto L_0x022b
            r2 = r5
            goto L_0x022c
        L_0x022b:
            r2 = r4
        L_0x022c:
            if (r2 != 0) goto L_0x0261
            java.util.List<java.lang.String> r2 = y.w.f17354a
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r9 = r3.toLowerCase(r7)
            boolean r2 = r2.contains(r9)
            if (r2 == 0) goto L_0x025e
            java.lang.String r2 = android.os.Build.ID
            java.lang.String r2 = r2.toLowerCase(r7)
            boolean r2 = r2.startsWith(r6)
            if (r2 != 0) goto L_0x0259
            java.lang.String r2 = android.os.Build.ID
            java.lang.String r2 = r2.toLowerCase(r7)
            java.lang.String r6 = "td1a"
            boolean r2 = r2.startsWith(r6)
            if (r2 == 0) goto L_0x0257
            goto L_0x0259
        L_0x0257:
            r2 = r4
            goto L_0x025a
        L_0x0259:
            r2 = r5
        L_0x025a:
            if (r2 == 0) goto L_0x025e
            r2 = r5
            goto L_0x025f
        L_0x025e:
            r2 = r4
        L_0x025f:
            if (r2 == 0) goto L_0x0262
        L_0x0261:
            r4 = r5
        L_0x0262:
            if (r4 == 0) goto L_0x026c
            y.w r2 = new y.w
            r2.<init>()
            r1.add(r2)
        L_0x026c:
            java.util.HashMap r2 = y.c0.f17335a
            java.lang.String r3 = r3.toUpperCase(r8)
            boolean r2 = r2.containsKey(r3)
            if (r2 == 0) goto L_0x0280
            y.c0 r2 = new y.c0
            r2.<init>()
            r1.add(r2)
        L_0x0280:
            r0.<init>((java.util.ArrayList) r1)
            f17339a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y.k.<clinit>():void");
    }

    public static <T extends m0> T a(Class<T> cls) {
        return f17339a.f(cls);
    }
}
