package z;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b5.d;
import com.airbnb.lottie.l0;
import com.google.zxing.FormatException;
import g5.b;
import s4.h;
import u4.u;
import v4.c;
import y.n;

/* compiled from: OutputSizesCorrector */
public class k implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Object f17754a;

    /* renamed from: b  reason: collision with root package name */
    public Object f17755b;

    /* renamed from: c  reason: collision with root package name */
    public Object f17756c;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3) {
        this.f17754a = obj;
        this.f17755b = obj2;
        this.f17756c = obj3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Size[] a(android.util.Size[] r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r3 = java.util.Arrays.asList(r17)
            r2.<init>(r3)
            java.lang.Object r3 = r0.f17755b
            y.n r3 = (y.n) r3
            r4 = 1440(0x5a0, float:2.018E-42)
            r5 = 1
            r6 = 1920(0x780, float:2.69E-42)
            r7 = 1080(0x438, float:1.513E-42)
            r8 = 0
            r9 = 720(0x2d0, float:1.009E-42)
            r10 = 34
            if (r3 != 0) goto L_0x0020
            goto L_0x0081
        L_0x0020:
            if (r1 != r10) goto L_0x0075
            java.lang.String r3 = android.os.Build.BRAND
            java.lang.String r11 = "motorola"
            boolean r3 = r11.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0038
            java.lang.String r3 = android.os.Build.MODEL
            java.lang.String r11 = "moto e5 play"
            boolean r3 = r11.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x0038
            r3 = r5
            goto L_0x0039
        L_0x0038:
            r3 = r8
        L_0x0039:
            if (r3 == 0) goto L_0x0075
            r3 = 6
            android.util.Size[] r3 = new android.util.Size[r3]
            android.util.Size r11 = new android.util.Size
            r11.<init>(r6, r7)
            r3[r8] = r11
            android.util.Size r11 = new android.util.Size
            r11.<init>(r4, r7)
            r3[r5] = r11
            android.util.Size r11 = new android.util.Size
            r12 = 1280(0x500, float:1.794E-42)
            r11.<init>(r12, r9)
            r12 = 2
            r3[r12] = r11
            android.util.Size r11 = new android.util.Size
            r12 = 960(0x3c0, float:1.345E-42)
            r11.<init>(r12, r9)
            r12 = 3
            r3[r12] = r11
            android.util.Size r11 = new android.util.Size
            r12 = 864(0x360, float:1.211E-42)
            r13 = 480(0x1e0, float:6.73E-43)
            r11.<init>(r12, r13)
            r12 = 4
            r3[r12] = r11
            android.util.Size r11 = new android.util.Size
            r11.<init>(r9, r13)
            r12 = 5
            r3[r12] = r11
            goto L_0x0077
        L_0x0075:
            android.util.Size[] r3 = new android.util.Size[r8]
        L_0x0077:
            int r11 = r3.length
            if (r11 <= 0) goto L_0x0081
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.addAll(r3)
        L_0x0081:
            java.lang.Object r3 = r0.f17756c
            dc.h r3 = (dc.h) r3
            r3.getClass()
            java.lang.Class<y.l> r11 = y.l.class
            f0.m0 r11 = y.k.a(r11)
            y.l r11 = (y.l) r11
            if (r11 != 0) goto L_0x0099
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x0365
        L_0x0099:
            java.lang.String r3 = r3.f8904a
            java.lang.String r11 = android.os.Build.BRAND
            java.lang.String r12 = "OnePlus"
            boolean r13 = r12.equalsIgnoreCase(r11)
            if (r13 == 0) goto L_0x00b1
            java.lang.String r13 = android.os.Build.DEVICE
            java.lang.String r14 = "OnePlus6"
            boolean r13 = r14.equalsIgnoreCase(r13)
            if (r13 == 0) goto L_0x00b1
            r13 = r5
            goto L_0x00b2
        L_0x00b1:
            r13 = r8
        L_0x00b2:
            r14 = 3000(0xbb8, float:4.204E-42)
            r15 = 4000(0xfa0, float:5.605E-42)
            r5 = 3120(0xc30, float:4.372E-42)
            r8 = 4160(0x1040, float:5.83E-42)
            java.lang.String r4 = "0"
            r6 = 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L_0x00e0
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00dd
            if (r1 != r6) goto L_0x00dd
            android.util.Size r1 = new android.util.Size
            r1.<init>(r8, r5)
            r7.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r15, r14)
            r7.add(r1)
        L_0x00dd:
            r1 = r7
            goto L_0x0365
        L_0x00e0:
            boolean r12 = r12.equalsIgnoreCase(r11)
            if (r12 == 0) goto L_0x00f2
            java.lang.String r12 = android.os.Build.DEVICE
            java.lang.String r13 = "OnePlus6T"
            boolean r12 = r13.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x00f2
            r12 = 1
            goto L_0x00f3
        L_0x00f2:
            r12 = 0
        L_0x00f3:
            if (r12 == 0) goto L_0x0113
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00dd
            if (r1 != r6) goto L_0x00dd
            android.util.Size r1 = new android.util.Size
            r1.<init>(r8, r5)
            r7.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r15, r14)
            r7.add(r1)
            goto L_0x00dd
        L_0x0113:
            java.lang.String r5 = "HUAWEI"
            boolean r5 = r5.equalsIgnoreCase(r11)
            if (r5 == 0) goto L_0x0127
            java.lang.String r5 = android.os.Build.DEVICE
            java.lang.String r8 = "HWANE"
            boolean r5 = r8.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x0127
            r5 = 1
            goto L_0x0128
        L_0x0127:
            r5 = 0
        L_0x0128:
            r8 = 35
            if (r5 == 0) goto L_0x0151
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x014e
            if (r1 == r10) goto L_0x013c
            if (r1 == r8) goto L_0x013c
            goto L_0x014e
        L_0x013c:
            android.util.Size r1 = new android.util.Size
            r1.<init>(r9, r9)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 400(0x190, float:5.6E-43)
            r1.<init>(r3, r3)
            r5.add(r1)
        L_0x014e:
            r1 = r5
            goto L_0x0365
        L_0x0151:
            boolean r5 = y.l.b()
            r9 = 3088(0xc10, float:4.327E-42)
            r12 = 4128(0x1020, float:5.785E-42)
            r13 = 2322(0x912, float:3.254E-42)
            java.lang.String r14 = "1"
            r15 = 3264(0xcc0, float:4.574E-42)
            r6 = 2448(0x990, float:3.43E-42)
            r7 = 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x0255
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0205
            if (r1 == r10) goto L_0x01b7
            if (r1 != r8) goto L_0x014e
            android.util.Size r1 = new android.util.Size
            r1.<init>(r12, r13)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r9, r9)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r15, r6)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1836(0x72c, float:2.573E-42)
            r1.<init>(r15, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1536(0x600, float:2.152E-42)
            r1.<init>(r7, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1152(0x480, float:1.614E-42)
            r1.<init>(r7, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1920(0x780, float:2.69E-42)
            r4 = 1080(0x438, float:1.513E-42)
            r1.<init>(r3, r4)
            r5.add(r1)
            goto L_0x014e
        L_0x01b7:
            android.util.Size r1 = new android.util.Size
            r3 = 3096(0xc18, float:4.338E-42)
            r1.<init>(r12, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r12, r13)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r9, r9)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r15, r6)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1836(0x72c, float:2.573E-42)
            r1.<init>(r15, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1536(0x600, float:2.152E-42)
            r1.<init>(r7, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1152(0x480, float:1.614E-42)
            r1.<init>(r7, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1920(0x780, float:2.69E-42)
            r4 = 1080(0x438, float:1.513E-42)
            r1.<init>(r3, r4)
            r5.add(r1)
            goto L_0x014e
        L_0x0205:
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x014e
            if (r1 == r10) goto L_0x0211
            if (r1 == r8) goto L_0x0211
            goto L_0x014e
        L_0x0211:
            android.util.Size r1 = new android.util.Size
            r1.<init>(r15, r6)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1836(0x72c, float:2.573E-42)
            r1.<init>(r15, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r6, r6)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1920(0x780, float:2.69E-42)
            r1.<init>(r3, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r4 = 1536(0x600, float:2.152E-42)
            r1.<init>(r7, r4)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r4 = 1152(0x480, float:1.614E-42)
            r1.<init>(r7, r4)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r4 = 1080(0x438, float:1.513E-42)
            r1.<init>(r3, r4)
            r5.add(r1)
            goto L_0x014e
        L_0x0255:
            boolean r5 = y.l.a()
            if (r5 == 0) goto L_0x0328
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x02da
            if (r1 == r10) goto L_0x028c
            if (r1 != r8) goto L_0x014e
            android.util.Size r1 = new android.util.Size
            r3 = 1536(0x600, float:2.152E-42)
            r1.<init>(r7, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1152(0x480, float:1.614E-42)
            r1.<init>(r7, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1920(0x780, float:2.69E-42)
            r4 = 1080(0x438, float:1.513E-42)
            r1.<init>(r3, r4)
            r5.add(r1)
            goto L_0x014e
        L_0x028c:
            android.util.Size r1 = new android.util.Size
            r3 = 3096(0xc18, float:4.338E-42)
            r1.<init>(r12, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r12, r13)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r9, r9)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r1.<init>(r15, r6)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1836(0x72c, float:2.573E-42)
            r1.<init>(r15, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1536(0x600, float:2.152E-42)
            r1.<init>(r7, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1152(0x480, float:1.614E-42)
            r1.<init>(r7, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1920(0x780, float:2.69E-42)
            r4 = 1080(0x438, float:1.513E-42)
            r1.<init>(r3, r4)
            r5.add(r1)
            goto L_0x014e
        L_0x02da:
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x014e
            if (r1 == r10) goto L_0x02e6
            if (r1 == r8) goto L_0x02e6
            goto L_0x014e
        L_0x02e6:
            android.util.Size r1 = new android.util.Size
            r3 = 2576(0xa10, float:3.61E-42)
            r4 = 1932(0x78c, float:2.707E-42)
            r1.<init>(r3, r4)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 2560(0xa00, float:3.587E-42)
            r4 = 1440(0x5a0, float:2.018E-42)
            r1.<init>(r3, r4)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r3 = 1920(0x780, float:2.69E-42)
            r1.<init>(r3, r3)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r4 = 1536(0x600, float:2.152E-42)
            r1.<init>(r7, r4)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r4 = 1152(0x480, float:1.614E-42)
            r1.<init>(r7, r4)
            r5.add(r1)
            android.util.Size r1 = new android.util.Size
            r4 = 1080(0x438, float:1.513E-42)
            r1.<init>(r3, r4)
            r5.add(r1)
            goto L_0x014e
        L_0x0328:
            java.lang.String r5 = "REDMI"
            boolean r5 = r5.equalsIgnoreCase(r11)
            if (r5 == 0) goto L_0x033c
            java.lang.String r5 = android.os.Build.DEVICE
            java.lang.String r6 = "joyeuse"
            boolean r5 = r6.equalsIgnoreCase(r5)
            if (r5 == 0) goto L_0x033c
            r5 = 1
            goto L_0x033d
        L_0x033c:
            r5 = 0
        L_0x033d:
            if (r5 == 0) goto L_0x035c
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x014e
            r3 = 256(0x100, float:3.59E-43)
            if (r1 != r3) goto L_0x014e
            android.util.Size r1 = new android.util.Size
            r3 = 9280(0x2440, float:1.3004E-41)
            r4 = 6944(0x1b20, float:9.73E-42)
            r1.<init>(r3, r4)
            r5.add(r1)
            goto L_0x014e
        L_0x035c:
            java.lang.String r1 = "ExcludedSupportedSizesQuirk"
            c0.p0.g(r1)
            java.util.List r1 = java.util.Collections.emptyList()
        L_0x0365:
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x036c
            goto L_0x036f
        L_0x036c:
            r2.removeAll(r1)
        L_0x036f:
            boolean r1 = r2.isEmpty()
            if (r1 == 0) goto L_0x037a
            java.lang.String r1 = "OutputSizesCorrector"
            c0.p0.g(r1)
        L_0x037a:
            r1 = 0
            android.util.Size[] r1 = new android.util.Size[r1]
            java.lang.Object[] r1 = r2.toArray(r1)
            android.util.Size[] r1 = (android.util.Size[]) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z.k.a(android.util.Size[], int):android.util.Size[]");
    }

    public Object b(o4.b bVar) {
        return this.f17756c;
    }

    public final Object c(float f10, float f11, Object obj, Object obj2, float f12, float f13, float f14) {
        o4.b bVar = (o4.b) this.f17754a;
        bVar.f13719a = f10;
        bVar.f13720b = f11;
        bVar.f13721c = obj;
        bVar.f13722d = obj2;
        bVar.f13723e = f12;
        bVar.f13724f = f13;
        bVar.f13725g = f14;
        return b(bVar);
    }

    public final boolean d(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            i10 += i12;
            i11 += 4 - ((i12 + 4) & 7);
        }
        if (i11 < 0) {
            i11 += i13;
            i10 += 4 - ((i13 + 4) & 7);
        }
        ((cd.b) this.f17755b).g(i11, i10);
        return ((cd.b) this.f17754a).b(i11, i10);
    }

    public final int e(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (d(i14, i15, i12, i13) ? 1 : 0) << true;
        int i17 = i11 - 1;
        if (d(i14, i17, i12, i13)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i10 - 1;
        if (d(i19, i15, i12, i13)) {
            i18 |= 1;
        }
        int i20 = i18 << 1;
        if (d(i19, i17, i12, i13)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (d(i19, i11, i12, i13)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (d(i10, i15, i12, i13)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (d(i10, i17, i12, i13)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        if (d(i10, i11, i12, i13)) {
            return i24 | 1;
        }
        return i24;
    }

    public final u f(u uVar, h hVar) {
        Drawable drawable = (Drawable) uVar.get();
        if (drawable instanceof BitmapDrawable) {
            return ((b) this.f17755b).f(d.d(((BitmapDrawable) drawable).getBitmap(), (c) this.f17754a), hVar);
        }
        if (drawable instanceof f5.c) {
            return ((b) this.f17756c).f(uVar, hVar);
        }
        return null;
    }

    public /* synthetic */ k(vd.c[] cVarArr) {
        this.f17754a = cVarArr[0];
        this.f17755b = cVarArr[1];
        this.f17756c = cVarArr[2];
    }

    public /* synthetic */ k() {
        this.f17754a = new o4.b();
        this.f17756c = null;
    }

    public k(cd.b bVar) {
        int i10;
        int i11;
        cd.b bVar2 = bVar;
        int i12 = bVar2.f4690b;
        if (i12 < 8 || i12 > 144 || (i10 = i12 & 1) != 0) {
            throw FormatException.a();
        }
        int i13 = bVar2.f4689a;
        gd.b[] bVarArr = gd.b.f10442h;
        if (i10 == 0 && (i13 & 1) == 0) {
            for (gd.b bVar3 : gd.b.f10442h) {
                int i14 = bVar3.f10444b;
                if (i14 == i12 && (i11 = bVar3.f10445c) == i13) {
                    this.f17756c = bVar3;
                    if (bVar2.f4690b == i14) {
                        int i15 = bVar3.f10446d;
                        int i16 = bVar3.f10447e;
                        int i17 = i14 / i15;
                        int i18 = i11 / i16;
                        cd.b bVar4 = new cd.b(i18 * i16, i17 * i15);
                        for (int i19 = 0; i19 < i17; i19++) {
                            int i20 = i19 * i15;
                            for (int i21 = 0; i21 < i18; i21++) {
                                int i22 = i21 * i16;
                                for (int i23 = 0; i23 < i15; i23++) {
                                    int i24 = ((i15 + 2) * i19) + 1 + i23;
                                    int i25 = i20 + i23;
                                    for (int i26 = 0; i26 < i16; i26++) {
                                        if (bVar2.b(((i16 + 2) * i21) + 1 + i26, i24)) {
                                            bVar4.g(i22 + i26, i25);
                                        }
                                    }
                                }
                            }
                        }
                        this.f17754a = bVar4;
                        this.f17755b = new cd.b(bVar4.f4689a, bVar4.f4690b);
                        return;
                    }
                    throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
                }
            }
            throw FormatException.a();
        }
        throw FormatException.a();
    }

    public /* synthetic */ k(l0 l0Var) {
        this.f17754a = new o4.b();
        this.f17756c = l0Var;
    }

    public /* synthetic */ k(String str) {
        this.f17755b = (n) y.k.a(n.class);
        this.f17754a = str;
        this.f17756c = new dc.h(str);
    }
}
