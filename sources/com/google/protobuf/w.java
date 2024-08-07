package com.google.protobuf;

import android.support.v4.media.a;
import com.google.protobuf.q;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;
import tc.b0;
import tc.c;
import tc.d0;
import tc.n;
import tc.q;
import tc.v;
import tc.x;
import tc.y;

/* compiled from: MessageSchema */
public final class w<T> implements x<T> {

    /* renamed from: n  reason: collision with root package name */
    public static final int[] f7939n = new int[0];

    /* renamed from: o  reason: collision with root package name */
    public static final Unsafe f7940o = b0.p();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f7941a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f7942b;

    /* renamed from: c  reason: collision with root package name */
    public final u f7943c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7944d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f7945e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7946f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f7947g;

    /* renamed from: h  reason: collision with root package name */
    public final int f7948h;

    /* renamed from: i  reason: collision with root package name */
    public final q f7949i;

    /* renamed from: j  reason: collision with root package name */
    public final o f7950j;

    /* renamed from: k  reason: collision with root package name */
    public final c0<?, ?> f7951k;

    /* renamed from: l  reason: collision with root package name */
    public final f<?> f7952l;

    /* renamed from: m  reason: collision with root package name */
    public final s f7953m;

    public w(int[] iArr, Object[] objArr, int i10, int i11, u uVar, boolean z10, int[] iArr2, int i12, int i13, q qVar, o oVar, c0 c0Var, f fVar, s sVar) {
        boolean z11;
        this.f7941a = iArr;
        this.f7942b = objArr;
        boolean z12 = uVar instanceof i;
        this.f7945e = z10;
        if (fVar == null || !fVar.d(uVar)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f7944d = z11;
        this.f7946f = false;
        this.f7947g = iArr2;
        this.f7948h = i12;
        this.f7949i = qVar;
        this.f7950j = oVar;
        this.f7951k = c0Var;
        this.f7952l = fVar;
        this.f7943c = uVar;
        this.f7953m = sVar;
    }

    public static void E(int i10, Object obj, e eVar) {
        if (obj instanceof String) {
            eVar.f7899a.v0(i10, (String) obj);
            return;
        }
        eVar.b(i10, (c) obj);
    }

    public static void j(Object obj) {
        if (!p(obj)) {
            throw new IllegalArgumentException(f0.b0.q("Mutating immutable message: ", obj));
        }
    }

    public static boolean p(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof i) {
            return ((i) obj).B();
        }
        return true;
    }

    public static List<?> r(Object obj, long j10) {
        return (List) b0.o(obj, j10);
    }

    public static w u(n nVar, q qVar, o oVar, c0 c0Var, f fVar, s sVar) {
        if (nVar instanceof tc.w) {
            return v((tc.w) nVar, qVar, oVar, c0Var, fVar, sVar);
        }
        y yVar = (y) nVar;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x039a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.protobuf.w<T> v(tc.w r35, tc.q r36, com.google.protobuf.o r37, com.google.protobuf.c0<?, ?> r38, com.google.protobuf.f<?> r39, com.google.protobuf.s r40) {
        /*
            int r0 = r35.c()
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r1
        L_0x000b:
            java.lang.String r0 = r35.e()
            int r4 = r0.length()
            char r5 = r0.charAt(r1)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0027
            r5 = 1
        L_0x001d:
            int r7 = r5 + 1
            char r5 = r0.charAt(r5)
            if (r5 < r6) goto L_0x0028
            r5 = r7
            goto L_0x001d
        L_0x0027:
            r7 = 1
        L_0x0028:
            int r5 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0047
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0034:
            int r11 = r5 + 1
            char r5 = r0.charAt(r5)
            if (r5 < r6) goto L_0x0044
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r11
            goto L_0x0034
        L_0x0044:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r11
        L_0x0047:
            if (r7 != 0) goto L_0x0054
            int[] r7 = f7939n
            r9 = r1
            r11 = r9
            r13 = r11
            r14 = r13
            r15 = r14
            r12 = r7
            r7 = r15
            goto L_0x0166
        L_0x0054:
            int r7 = r5 + 1
            char r5 = r0.charAt(r5)
            if (r5 < r6) goto L_0x0073
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0060:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0070
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0060
        L_0x0070:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r11
        L_0x0073:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0092
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x007f:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x008f
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r7 = r7 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x007f
        L_0x008f:
            int r9 = r9 << r11
            r7 = r7 | r9
            r9 = r12
        L_0x0092:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x009e:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00ae
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x009e
        L_0x00ae:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00b1:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00bd:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00cd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00bd
        L_0x00cd:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00d0:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00dc:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00ec
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00dc
        L_0x00ec:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00ef:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x0110
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x00fb:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x010c
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x00fb
        L_0x010c:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0110:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0133
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x011c:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x012e
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x011c
        L_0x012e:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0133:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0158
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r1 = r16
            r16 = 13
        L_0x0141:
            int r18 = r1 + 1
            char r1 = r0.charAt(r1)
            if (r1 < r6) goto L_0x0153
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r16
            r15 = r15 | r1
            int r16 = r16 + 13
            r1 = r18
            goto L_0x0141
        L_0x0153:
            int r1 = r1 << r16
            r15 = r15 | r1
            r16 = r18
        L_0x0158:
            int r1 = r15 + r13
            int r1 = r1 + r14
            int[] r1 = new int[r1]
            int r14 = r5 * 2
            int r14 = r14 + r7
            r7 = r9
            r9 = r12
            r12 = r1
            r1 = r5
            r5 = r16
        L_0x0166:
            sun.misc.Unsafe r8 = f7940o
            java.lang.Object[] r18 = r35.d()
            com.google.protobuf.u r19 = r35.b()
            java.lang.Class r3 = r19.getClass()
            int r6 = r9 * 3
            int[] r6 = new int[r6]
            int r9 = r9 * r2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r13 = r13 + r15
            r24 = r13
            r23 = r15
            r21 = 0
            r22 = 0
        L_0x0184:
            if (r5 >= r4) goto L_0x03ed
            int r25 = r5 + 1
            char r5 = r0.charAt(r5)
            r2 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r2) goto L_0x01b6
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r2 = r25
            r25 = 13
        L_0x0197:
            int r27 = r2 + 1
            char r2 = r0.charAt(r2)
            r28 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01b0
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r25
            r5 = r5 | r2
            int r25 = r25 + 13
            r2 = r27
            r4 = r28
            goto L_0x0197
        L_0x01b0:
            int r2 = r2 << r25
            r5 = r5 | r2
            r2 = r27
            goto L_0x01ba
        L_0x01b6:
            r28 = r4
            r2 = r25
        L_0x01ba:
            int r4 = r2 + 1
            char r2 = r0.charAt(r2)
            r25 = r4
            r4 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r4) goto L_0x01ec
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r4 = r25
            r25 = 13
        L_0x01cd:
            int r27 = r4 + 1
            char r4 = r0.charAt(r4)
            r29 = r13
            r13 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r13) goto L_0x01e6
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r25
            r2 = r2 | r4
            int r25 = r25 + 13
            r4 = r27
            r13 = r29
            goto L_0x01cd
        L_0x01e6:
            int r4 = r4 << r25
            r2 = r2 | r4
            r4 = r27
            goto L_0x01f0
        L_0x01ec:
            r29 = r13
            r4 = r25
        L_0x01f0:
            r13 = r2 & 255(0xff, float:3.57E-43)
            r25 = r15
            r15 = r2 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x01fe
            int r15 = r22 + 1
            r12[r22] = r21
            r22 = r15
        L_0x01fe:
            r15 = 51
            if (r13 < r15) goto L_0x02a9
            int r15 = r4 + 1
            char r4 = r0.charAt(r4)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x0234
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r15 = r27
            r27 = 13
        L_0x0215:
            int r33 = r15 + 1
            char r15 = r0.charAt(r15)
            r34 = r11
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r11) goto L_0x022e
            r11 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r27
            r4 = r4 | r11
            int r27 = r27 + 13
            r15 = r33
            r11 = r34
            goto L_0x0215
        L_0x022e:
            int r11 = r15 << r27
            r4 = r4 | r11
            r15 = r33
            goto L_0x0238
        L_0x0234:
            r34 = r11
            r15 = r27
        L_0x0238:
            int r11 = r13 + -51
            r27 = r15
            r15 = 9
            if (r11 == r15) goto L_0x025a
            r15 = 17
            if (r11 != r15) goto L_0x0245
            goto L_0x025a
        L_0x0245:
            r15 = 12
            if (r11 != r15) goto L_0x0258
            if (r10 != 0) goto L_0x0258
            int r11 = r21 / 3
            r15 = 2
            int r11 = r11 * r15
            r15 = 1
            int r11 = r11 + r15
            int r15 = r14 + 1
            r14 = r18[r14]
            r9[r11] = r14
            r14 = r15
        L_0x0258:
            r15 = 2
            goto L_0x026a
        L_0x025a:
            int r11 = r21 / 3
            r15 = 2
            int r11 = r11 * r15
            r20 = 1
            int r11 = r11 + 1
            int r26 = r14 + 1
            r14 = r18[r14]
            r9[r11] = r14
            r14 = r26
        L_0x026a:
            int r4 = r4 * r15
            r11 = r18[r4]
            boolean r15 = r11 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x0274
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x027c
        L_0x0274:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = y(r3, r11)
            r18[r4] = r11
        L_0x027c:
            r30 = r14
            long r14 = r8.objectFieldOffset(r11)
            int r11 = (int) r14
            int r4 = r4 + 1
            r14 = r18[r4]
            boolean r15 = r14 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x028e
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14
            goto L_0x0296
        L_0x028e:
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = y(r3, r14)
            r18[r4] = r14
        L_0x0296:
            long r14 = r8.objectFieldOffset(r14)
            int r4 = (int) r14
            r32 = r0
            r31 = r1
            r0 = r4
            r14 = r30
            r4 = 0
            r19 = 2
            r20 = 1
            goto L_0x03b7
        L_0x02a9:
            r34 = r11
            int r11 = r14 + 1
            r14 = r18[r14]
            java.lang.String r14 = (java.lang.String) r14
            java.lang.reflect.Field r14 = y(r3, r14)
            r15 = 9
            if (r13 == r15) goto L_0x0328
            r15 = 17
            if (r13 != r15) goto L_0x02bf
            goto L_0x0328
        L_0x02bf:
            r15 = 27
            if (r13 == r15) goto L_0x0317
            r15 = 49
            if (r13 != r15) goto L_0x02c8
            goto L_0x0317
        L_0x02c8:
            r15 = 12
            if (r13 == r15) goto L_0x02fd
            r15 = 30
            if (r13 == r15) goto L_0x02fd
            r15 = 44
            if (r13 != r15) goto L_0x02d5
            goto L_0x02fd
        L_0x02d5:
            r15 = 50
            if (r13 != r15) goto L_0x0314
            int r15 = r23 + 1
            r12[r23] = r21
            int r23 = r21 / 3
            r26 = 2
            int r23 = r23 * 2
            int r30 = r11 + 1
            r11 = r18[r11]
            r9[r23] = r11
            r11 = r2 & 2048(0x800, float:2.87E-42)
            if (r11 == 0) goto L_0x02f8
            int r23 = r23 + 1
            int r11 = r30 + 1
            r30 = r18[r30]
            r9[r23] = r30
            r23 = r15
            goto L_0x0314
        L_0x02f8:
            r23 = r15
            r20 = 1
            goto L_0x033a
        L_0x02fd:
            if (r10 != 0) goto L_0x0314
            int r15 = r21 / 3
            r26 = 2
            int r15 = r15 * 2
            r20 = 1
            int r15 = r15 + 1
            int r30 = r11 + 1
            r11 = r18[r11]
            r9[r15] = r11
            r20 = 1
            r26 = 2
            goto L_0x033a
        L_0x0314:
            r20 = 1
            goto L_0x0338
        L_0x0317:
            int r15 = r21 / 3
            r26 = 2
            int r15 = r15 * 2
            r20 = 1
            int r15 = r15 + 1
            int r30 = r11 + 1
            r11 = r18[r11]
            r9[r15] = r11
            goto L_0x033a
        L_0x0328:
            r20 = 1
            r26 = 2
            int r15 = r21 / 3
            int r15 = r15 * 2
            int r15 = r15 + 1
            java.lang.Class r30 = r14.getType()
            r9[r15] = r30
        L_0x0338:
            r30 = r11
        L_0x033a:
            long r14 = r8.objectFieldOffset(r14)
            int r11 = (int) r14
            r14 = r2 & 4096(0x1000, float:5.74E-42)
            r15 = 4096(0x1000, float:5.74E-42)
            if (r14 != r15) goto L_0x0348
            r15 = r20
            goto L_0x0349
        L_0x0348:
            r15 = 0
        L_0x0349:
            if (r15 == 0) goto L_0x039a
            r14 = 17
            if (r13 > r14) goto L_0x039a
            int r14 = r4 + 1
            char r4 = r0.charAt(r4)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r15) goto L_0x0375
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x035e:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r15) goto L_0x0370
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r19
            r4 = r4 | r14
            int r19 = r19 + 13
            r14 = r31
            goto L_0x035e
        L_0x0370:
            int r14 = r14 << r19
            r4 = r4 | r14
            r14 = r31
        L_0x0375:
            r19 = 2
            int r26 = r1 * 2
            int r31 = r4 / 32
            int r31 = r31 + r26
            r15 = r18[r31]
            r32 = r0
            boolean r0 = r15 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0388
            java.lang.reflect.Field r15 = (java.lang.reflect.Field) r15
            goto L_0x0390
        L_0x0388:
            java.lang.String r15 = (java.lang.String) r15
            java.lang.reflect.Field r15 = y(r3, r15)
            r18[r31] = r15
        L_0x0390:
            r31 = r1
            long r0 = r8.objectFieldOffset(r15)
            int r0 = (int) r0
            int r4 = r4 % 32
            goto L_0x03a5
        L_0x039a:
            r32 = r0
            r31 = r1
            r19 = 2
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r14 = r4
            r4 = 0
        L_0x03a5:
            r1 = 18
            if (r13 < r1) goto L_0x03b3
            r1 = 49
            if (r13 > r1) goto L_0x03b3
            int r1 = r24 + 1
            r12[r24] = r11
            r24 = r1
        L_0x03b3:
            r27 = r14
            r14 = r30
        L_0x03b7:
            int r1 = r21 + 1
            r6[r21] = r5
            int r5 = r1 + 1
            r15 = r2 & 512(0x200, float:7.175E-43)
            if (r15 == 0) goto L_0x03c4
            r15 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03c5
        L_0x03c4:
            r15 = 0
        L_0x03c5:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03cc
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03cd
        L_0x03cc:
            r2 = 0
        L_0x03cd:
            r2 = r2 | r15
            int r13 = r13 << 20
            r2 = r2 | r13
            r2 = r2 | r11
            r6[r1] = r2
            int r21 = r5 + 1
            int r1 = r4 << 20
            r0 = r0 | r1
            r6[r5] = r0
            r2 = r19
            r15 = r25
            r5 = r27
            r4 = r28
            r13 = r29
            r1 = r31
            r0 = r32
            r11 = r34
            goto L_0x0184
        L_0x03ed:
            r34 = r11
            r29 = r13
            r25 = r15
            com.google.protobuf.w r0 = new com.google.protobuf.w
            com.google.protobuf.u r1 = r35.b()
            r4 = r0
            r5 = r6
            r6 = r9
            r8 = r34
            r9 = r1
            r11 = r12
            r12 = r25
            r14 = r36
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.v(tc.w, tc.q, com.google.protobuf.o, com.google.protobuf.c0, com.google.protobuf.f, com.google.protobuf.s):com.google.protobuf.w");
    }

    public static <T> int w(T t10, long j10) {
        return ((Integer) b0.o(t10, j10)).intValue();
    }

    public static <T> long x(T t10, long j10) {
        return ((Long) b0.o(t10, j10)).longValue();
    }

    public static Field y(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder w9 = f0.b0.w("Field ", str, " for ");
            w9.append(cls.getName());
            w9.append(" not found. Known fields are ");
            w9.append(Arrays.toString(declaredFields));
            throw new RuntimeException(w9.toString());
        }
    }

    public final void A(T t10, int i10, int i11) {
        b0.t(t10, i10, (long) (this.f7941a[i11 + 2] & 1048575));
    }

    public final int B(int i10) {
        return this.f7941a[i10 + 1];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03a7, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0494, code lost:
        r10 = r10 + 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x036c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03aa  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x03c8  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x03fc  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x0435  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x0441  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0459  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0465  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0471  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x047d  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0489  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x049a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02df  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C(java.lang.Object r18, com.google.protobuf.e r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f7944d
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.f<?> r3 = r0.f7952l
            com.google.protobuf.h r3 = r3.b(r1)
            boolean r5 = r3.h()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.k()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f7941a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f7940o
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002d:
            if (r10 >= r6) goto L_0x0498
            int r13 = r0.B(r10)
            int[] r14 = r0.f7941a
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            r9 = 17
            if (r4 > r9) goto L_0x0058
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0052
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0052:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0076
            com.google.protobuf.f<?> r9 = r0.f7952l
            r9.a(r5)
            if (r15 < 0) goto L_0x0076
            com.google.protobuf.f<?> r9 = r0.f7952l
            r9.f(r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0074
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0059
        L_0x0074:
            r5 = 0
            goto L_0x0059
        L_0x0076:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x0399;
                case 19: goto L_0x038a;
                case 20: goto L_0x037b;
                case 21: goto L_0x036c;
                case 22: goto L_0x035d;
                case 23: goto L_0x034e;
                case 24: goto L_0x033f;
                case 25: goto L_0x0330;
                case 26: goto L_0x0321;
                case 27: goto L_0x030e;
                case 28: goto L_0x02ff;
                case 29: goto L_0x02ef;
                case 30: goto L_0x02df;
                case 31: goto L_0x02cf;
                case 32: goto L_0x02bf;
                case 33: goto L_0x02af;
                case 34: goto L_0x029f;
                case 35: goto L_0x028f;
                case 36: goto L_0x027f;
                case 37: goto L_0x026f;
                case 38: goto L_0x025f;
                case 39: goto L_0x024f;
                case 40: goto L_0x023f;
                case 41: goto L_0x022f;
                case 42: goto L_0x021f;
                case 43: goto L_0x020f;
                case 44: goto L_0x01ff;
                case 45: goto L_0x01ef;
                case 46: goto L_0x01df;
                case 47: goto L_0x01cf;
                case 48: goto L_0x01bf;
                case 49: goto L_0x01ac;
                case 50: goto L_0x01a3;
                case 51: goto L_0x018e;
                case 52: goto L_0x0179;
                case 53: goto L_0x016a;
                case 54: goto L_0x015b;
                case 55: goto L_0x014c;
                case 56: goto L_0x013d;
                case 57: goto L_0x012e;
                case 58: goto L_0x0119;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00e7;
                case 62: goto L_0x00d9;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00af;
                case 66: goto L_0x00a1;
                case 67: goto L_0x0093;
                case 68: goto L_0x0081;
                default: goto L_0x007e;
            }
        L_0x007e:
            r4 = 0
            goto L_0x0494
        L_0x0081:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            tc.x r8 = r0.l(r10)
            r2.h(r15, r8, r4)
            goto L_0x007e
        L_0x0093:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            long r13 = x(r1, r13)
            r2.p(r15, r13)
            goto L_0x007e
        L_0x00a1:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = w(r1, r13)
            r2.o(r15, r4)
            goto L_0x007e
        L_0x00af:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            long r13 = x(r1, r13)
            r2.n(r15, r13)
            goto L_0x007e
        L_0x00bd:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = w(r1, r13)
            r2.m(r15, r4)
            goto L_0x007e
        L_0x00cb:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = w(r1, r13)
            r2.d(r15, r4)
            goto L_0x007e
        L_0x00d9:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = w(r1, r13)
            r2.q(r15, r4)
            goto L_0x007e
        L_0x00e7:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            tc.c r4 = (tc.c) r4
            r2.b(r15, r4)
            goto L_0x007e
        L_0x00f7:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            tc.x r8 = r0.l(r10)
            r2.k(r15, r8, r4)
            goto L_0x007e
        L_0x010a:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            E(r15, r4, r2)
            goto L_0x007e
        L_0x0119:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = tc.b0.o(r1, r13)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.a(r15, r4)
            goto L_0x007e
        L_0x012e:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = w(r1, r13)
            r2.e(r15, r4)
            goto L_0x007e
        L_0x013d:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            long r13 = x(r1, r13)
            r2.f(r15, r13)
            goto L_0x007e
        L_0x014c:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = w(r1, r13)
            r2.i(r15, r4)
            goto L_0x007e
        L_0x015b:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            long r13 = x(r1, r13)
            r2.r(r15, r13)
            goto L_0x007e
        L_0x016a:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            long r13 = x(r1, r13)
            r2.j(r15, r13)
            goto L_0x007e
        L_0x0179:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = tc.b0.o(r1, r13)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.g(r15, r4)
            goto L_0x007e
        L_0x018e:
            boolean r4 = r0.q(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = tc.b0.o(r1, r13)
            java.lang.Double r4 = (java.lang.Double) r4
            double r13 = r4.doubleValue()
            r2.c(r15, r13)
            goto L_0x007e
        L_0x01a3:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.D(r2, r15, r4, r10)
            goto L_0x007e
        L_0x01ac:
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            tc.x r13 = r0.l(r10)
            com.google.protobuf.z.J(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01bf:
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.protobuf.z.Q(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01cf:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.P(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01df:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.O(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01ef:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.N(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01ff:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.F(r4, r8, r2, r15)
            goto L_0x007e
        L_0x020f:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.S(r4, r8, r2, r15)
            goto L_0x007e
        L_0x021f:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.C(r4, r8, r2, r15)
            goto L_0x007e
        L_0x022f:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.G(r4, r8, r2, r15)
            goto L_0x007e
        L_0x023f:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.H(r4, r8, r2, r15)
            goto L_0x007e
        L_0x024f:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.K(r4, r8, r2, r15)
            goto L_0x007e
        L_0x025f:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.T(r4, r8, r2, r15)
            goto L_0x007e
        L_0x026f:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.L(r4, r8, r2, r15)
            goto L_0x007e
        L_0x027f:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.I(r4, r8, r2, r15)
            goto L_0x007e
        L_0x028f:
            r15 = 1
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.E(r4, r8, r2, r15)
            goto L_0x007e
        L_0x029f:
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.protobuf.z.Q(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02af:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.P(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02bf:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.O(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02cf:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.N(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02df:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.F(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02ef:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.S(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02ff:
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.D(r4, r8, r2)
            goto L_0x007e
        L_0x030e:
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            tc.x r13 = r0.l(r10)
            com.google.protobuf.z.M(r4, r8, r2, r13)
            goto L_0x007e
        L_0x0321:
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.R(r4, r8, r2)
            goto L_0x007e
        L_0x0330:
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.protobuf.z.C(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x033f:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.G(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x034e:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.H(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x035d:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.K(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x036c:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.T(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x037b:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.L(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x038a:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.I(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x0399:
            r15 = 0
            int[] r4 = r0.f7941a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.z.E(r4, r8, r2, r15)
        L_0x03a7:
            r4 = r15
            goto L_0x0494
        L_0x03aa:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            tc.x r13 = r0.l(r10)
            r2.h(r15, r13, r8)
            goto L_0x0494
        L_0x03bb:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            long r13 = r7.getLong(r1, r13)
            r2.p(r15, r13)
            goto L_0x0494
        L_0x03c8:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.o(r15, r8)
            goto L_0x0494
        L_0x03d5:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            long r13 = r7.getLong(r1, r13)
            r2.n(r15, r13)
            goto L_0x0494
        L_0x03e2:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.m(r15, r8)
            goto L_0x0494
        L_0x03ef:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.d(r15, r8)
            goto L_0x0494
        L_0x03fc:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.q(r15, r8)
            goto L_0x0494
        L_0x0409:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            tc.c r8 = (tc.c) r8
            r2.b(r15, r8)
            goto L_0x0494
        L_0x0418:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            tc.x r13 = r0.l(r10)
            r2.k(r15, r13, r8)
            goto L_0x0494
        L_0x0429:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            E(r15, r8, r2)
            goto L_0x0494
        L_0x0435:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            boolean r8 = tc.b0.g(r1, r13)
            r2.a(r15, r8)
            goto L_0x0494
        L_0x0441:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.e(r15, r8)
            goto L_0x0494
        L_0x044d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            long r13 = r7.getLong(r1, r13)
            r2.f(r15, r13)
            goto L_0x0494
        L_0x0459:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            int r8 = r7.getInt(r1, r13)
            r2.i(r15, r8)
            goto L_0x0494
        L_0x0465:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            long r13 = r7.getLong(r1, r13)
            r2.r(r15, r13)
            goto L_0x0494
        L_0x0471:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            long r13 = r7.getLong(r1, r13)
            r2.j(r15, r13)
            goto L_0x0494
        L_0x047d:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            float r8 = tc.b0.l(r1, r13)
            r2.g(r15, r8)
            goto L_0x0494
        L_0x0489:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            double r13 = tc.b0.k(r1, r13)
            r2.c(r15, r13)
        L_0x0494:
            int r10 = r10 + 3
            goto L_0x002d
        L_0x0498:
            if (r5 == 0) goto L_0x04af
            com.google.protobuf.f<?> r4 = r0.f7952l
            r4.f(r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04ad
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0498
        L_0x04ad:
            r5 = 0
            goto L_0x0498
        L_0x04af:
            com.google.protobuf.c0<?, ?> r3 = r0.f7951k
            com.google.protobuf.d0 r1 = r3.a(r1)
            r3.h(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.C(java.lang.Object, com.google.protobuf.e):void");
    }

    public final void D(e eVar, int i10, Object obj, int i11) {
        if (obj != null) {
            q.a<?, ?> c10 = this.f7953m.c(k(i11));
            r e10 = this.f7953m.e(obj);
            eVar.f7899a.getClass();
            for (Map.Entry entry : e10.entrySet()) {
                eVar.f7899a.x0(i10, 2);
                eVar.f7899a.z0(q.a(c10, entry.getKey(), entry.getValue()));
                CodedOutputStream codedOutputStream = eVar.f7899a;
                Object key = entry.getKey();
                Object value = entry.getValue();
                h.p(codedOutputStream, c10.f7932a, 1, key);
                h.p(codedOutputStream, c10.f7934c, 2, value);
            }
        }
    }

    public final void a(T t10, T t11) {
        j(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f7941a.length; i10 += 3) {
            int B = B(i10);
            long j10 = (long) (1048575 & B);
            int i11 = this.f7941a[i10];
            switch ((B & 267386880) >>> 20) {
                case 0:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.f14954c.m(t10, j10, b0.k(t11, j10));
                        z(i10, t10);
                        break;
                    }
                case 1:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.f14954c.n(t10, j10, b0.l(t11, j10));
                        z(i10, t10);
                        break;
                    }
                case 2:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.u(t10, j10, b0.n(t11, j10));
                        z(i10, t10);
                        break;
                    }
                case 3:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.u(t10, j10, b0.n(t11, j10));
                        z(i10, t10);
                        break;
                    }
                case 4:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.t(t10, b0.m(t11, j10), j10);
                        z(i10, t10);
                        break;
                    }
                case 5:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.u(t10, j10, b0.n(t11, j10));
                        z(i10, t10);
                        break;
                    }
                case 6:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.t(t10, b0.m(t11, j10), j10);
                        z(i10, t10);
                        break;
                    }
                case 7:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.f14954c.k(t10, j10, b0.g(t11, j10));
                        z(i10, t10);
                        break;
                    }
                case 8:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.v(t10, j10, b0.o(t11, j10));
                        z(i10, t10);
                        break;
                    }
                case 9:
                    s(i10, t10, t11);
                    break;
                case 10:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.v(t10, j10, b0.o(t11, j10));
                        z(i10, t10);
                        break;
                    }
                case 11:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.t(t10, b0.m(t11, j10), j10);
                        z(i10, t10);
                        break;
                    }
                case 12:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.t(t10, b0.m(t11, j10), j10);
                        z(i10, t10);
                        break;
                    }
                case 13:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.t(t10, b0.m(t11, j10), j10);
                        z(i10, t10);
                        break;
                    }
                case 14:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.u(t10, j10, b0.n(t11, j10));
                        z(i10, t10);
                        break;
                    }
                case 15:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.t(t10, b0.m(t11, j10), j10);
                        z(i10, t10);
                        break;
                    }
                case 16:
                    if (!o(i10, t11)) {
                        break;
                    } else {
                        b0.u(t10, j10, b0.n(t11, j10));
                        z(i10, t10);
                        break;
                    }
                case 17:
                    s(i10, t10, t11);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f7950j.b(t10, j10, t11);
                    break;
                case 50:
                    s sVar = this.f7953m;
                    Class<?> cls = z.f7961a;
                    b0.v(t10, j10, sVar.a(b0.o(t10, j10), b0.o(t11, j10)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!q(t11, i11, i10)) {
                        break;
                    } else {
                        b0.v(t10, j10, b0.o(t11, j10));
                        A(t10, i11, i10);
                        break;
                    }
                case 60:
                    t(i10, t10, t11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!q(t11, i11, i10)) {
                        break;
                    } else {
                        b0.v(t10, j10, b0.o(t11, j10));
                        A(t10, i11, i10);
                        break;
                    }
                case 68:
                    t(i10, t10, t11);
                    break;
            }
        }
        c0<?, ?> c0Var = this.f7951k;
        Class<?> cls2 = z.f7961a;
        c0Var.f(t10, c0Var.e(c0Var.a(t10), c0Var.a(t11)));
        if (this.f7944d) {
            z.A(this.f7952l, t10, t11);
        }
    }

    public final T b() {
        return this.f7949i.a(this.f7943c);
    }

    public final void c(T t10) {
        if (p(t10)) {
            if (t10 instanceof i) {
                i iVar = (i) t10;
                iVar.u();
                iVar.t();
                iVar.C();
            }
            int length = this.f7941a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int B = B(i10);
                long j10 = (long) (1048575 & B);
                int i11 = (B & 267386880) >>> 20;
                if (i11 != 9) {
                    switch (i11) {
                        case 17:
                            break;
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            this.f7950j.a(t10, j10);
                            continue;
                        case 50:
                            Unsafe unsafe = f7940o;
                            Object object = unsafe.getObject(t10, j10);
                            if (object != null) {
                                unsafe.putObject(t10, j10, this.f7953m.b(object));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (o(i10, t10)) {
                    l(i10).c(f7940o.getObject(t10, j10));
                }
            }
            this.f7951k.d(t10);
            if (this.f7944d) {
                this.f7952l.e(t10);
            }
        }
    }

    public final boolean d(T t10) {
        boolean z10;
        boolean z11;
        int i10 = 0;
        int i11 = 0;
        int i12 = 1048575;
        while (true) {
            boolean z12 = true;
            if (i10 < this.f7948h) {
                int i13 = this.f7947g[i10];
                int i14 = this.f7941a[i13];
                int B = B(i13);
                int i15 = this.f7941a[i13 + 2];
                int i16 = i15 & 1048575;
                int i17 = 1 << (i15 >>> 20);
                if (i16 != i12) {
                    if (i16 != 1048575) {
                        i11 = f7940o.getInt(t10, (long) i16);
                    }
                    i12 = i16;
                }
                if ((268435456 & B) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (i12 == 1048575) {
                        z11 = o(i13, t10);
                    } else if ((i11 & i17) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return false;
                    }
                }
                int i18 = (267386880 & B) >>> 20;
                if (i18 == 9 || i18 == 17) {
                    if (i12 == 1048575) {
                        z12 = o(i13, t10);
                    } else if ((i11 & i17) == 0) {
                        z12 = false;
                    }
                    if (z12 && !l(i13).d(b0.o(t10, (long) (B & 1048575)))) {
                        return false;
                    }
                } else {
                    if (i18 != 27) {
                        if (i18 == 60 || i18 == 68) {
                            if (q(t10, i14, i13) && !l(i13).d(b0.o(t10, (long) (B & 1048575)))) {
                                return false;
                            }
                        } else if (i18 != 49) {
                            if (i18 != 50) {
                                continue;
                            } else {
                                r e10 = this.f7953m.e(b0.o(t10, (long) (B & 1048575)));
                                if (!e10.isEmpty()) {
                                    if (this.f7953m.c(k(i13)).f7934c.f14969a == d0.MESSAGE) {
                                        x<?> xVar = null;
                                        Iterator it = e10.values().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (xVar == null) {
                                                xVar = v.f15013c.a(next.getClass());
                                            }
                                            if (!xVar.d(next)) {
                                                z12 = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (!z12) {
                                    return false;
                                }
                            }
                        }
                    }
                    List list = (List) b0.o(t10, (long) (B & 1048575));
                    if (!list.isEmpty()) {
                        x l10 = l(i13);
                        int i19 = 0;
                        while (true) {
                            if (i19 >= list.size()) {
                                break;
                            } else if (!l10.d(list.get(i19))) {
                                z12 = false;
                                break;
                            } else {
                                i19++;
                            }
                        }
                    }
                    if (!z12) {
                        return false;
                    }
                }
                i10++;
            } else if (!this.f7944d || this.f7952l.b(t10).i()) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (com.google.protobuf.z.B(tc.b0.o(r10, r6), tc.b0.o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (com.google.protobuf.z.B(tc.b0.o(r10, r6), tc.b0.o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (tc.b0.n(r10, r6) == tc.b0.n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (tc.b0.m(r10, r6) == tc.b0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (tc.b0.n(r10, r6) == tc.b0.n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (tc.b0.m(r10, r6) == tc.b0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (tc.b0.m(r10, r6) == tc.b0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (tc.b0.m(r10, r6) == tc.b0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        if (com.google.protobuf.z.B(tc.b0.o(r10, r6), tc.b0.o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        if (com.google.protobuf.z.B(tc.b0.o(r10, r6), tc.b0.o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (com.google.protobuf.z.B(tc.b0.o(r10, r6), tc.b0.o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        if (tc.b0.g(r10, r6) == tc.b0.g(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
        if (tc.b0.m(r10, r6) == tc.b0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        if (tc.b0.n(r10, r6) == tc.b0.n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016d, code lost:
        if (tc.b0.m(r10, r6) == tc.b0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
        if (tc.b0.n(r10, r6) == tc.b0.n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (tc.b0.n(r10, r6) == tc.b0.n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (java.lang.Float.floatToIntBits(tc.b0.l(r10, r6)) == java.lang.Float.floatToIntBits(tc.b0.l(r11, r6))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c7, code lost:
        if (java.lang.Double.doubleToLongBits(tc.b0.k(r10, r6)) == java.lang.Double.doubleToLongBits(tc.b0.k(r11, r6))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f7941a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01d2
            int r4 = r9.B(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01af;
                case 1: goto L_0x0196;
                case 2: goto L_0x0183;
                case 3: goto L_0x0170;
                case 4: goto L_0x015f;
                case 5: goto L_0x014b;
                case 6: goto L_0x0139;
                case 7: goto L_0x0127;
                case 8: goto L_0x0111;
                case 9: goto L_0x00fb;
                case 10: goto L_0x00e5;
                case 11: goto L_0x00d3;
                case 12: goto L_0x00c1;
                case 13: goto L_0x00af;
                case 14: goto L_0x009b;
                case 15: goto L_0x0089;
                case 16: goto L_0x0075;
                case 17: goto L_0x005f;
                case 18: goto L_0x0051;
                case 19: goto L_0x0051;
                case 20: goto L_0x0051;
                case 21: goto L_0x0051;
                case 22: goto L_0x0051;
                case 23: goto L_0x0051;
                case 24: goto L_0x0051;
                case 25: goto L_0x0051;
                case 26: goto L_0x0051;
                case 27: goto L_0x0051;
                case 28: goto L_0x0051;
                case 29: goto L_0x0051;
                case 30: goto L_0x0051;
                case 31: goto L_0x0051;
                case 32: goto L_0x0051;
                case 33: goto L_0x0051;
                case 34: goto L_0x0051;
                case 35: goto L_0x0051;
                case 36: goto L_0x0051;
                case 37: goto L_0x0051;
                case 38: goto L_0x0051;
                case 39: goto L_0x0051;
                case 40: goto L_0x0051;
                case 41: goto L_0x0051;
                case 42: goto L_0x0051;
                case 43: goto L_0x0051;
                case 44: goto L_0x0051;
                case 45: goto L_0x0051;
                case 46: goto L_0x0051;
                case 47: goto L_0x0051;
                case 48: goto L_0x0051;
                case 49: goto L_0x0051;
                case 50: goto L_0x0043;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01cb
        L_0x001c:
            int[] r4 = r9.f7941a
            int r8 = r2 + 2
            r4 = r4[r8]
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = tc.b0.m(r10, r4)
            int r4 = tc.b0.m(r11, r4)
            if (r8 != r4) goto L_0x0030
            r4 = r3
            goto L_0x0031
        L_0x0030:
            r4 = r1
        L_0x0031:
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = tc.b0.o(r10, r6)
            java.lang.Object r5 = tc.b0.o(r11, r6)
            boolean r4 = com.google.protobuf.z.B(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0043:
            java.lang.Object r3 = tc.b0.o(r10, r6)
            java.lang.Object r4 = tc.b0.o(r11, r6)
            boolean r3 = com.google.protobuf.z.B(r3, r4)
            goto L_0x01cb
        L_0x0051:
            java.lang.Object r3 = tc.b0.o(r10, r6)
            java.lang.Object r4 = tc.b0.o(r11, r6)
            boolean r3 = com.google.protobuf.z.B(r3, r4)
            goto L_0x01cb
        L_0x005f:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = tc.b0.o(r10, r6)
            java.lang.Object r5 = tc.b0.o(r11, r6)
            boolean r4 = com.google.protobuf.z.B(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0075:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = tc.b0.n(r10, r6)
            long r6 = tc.b0.n(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0089:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = tc.b0.m(r10, r6)
            int r5 = tc.b0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x009b:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = tc.b0.n(r10, r6)
            long r6 = tc.b0.n(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00af:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = tc.b0.m(r10, r6)
            int r5 = tc.b0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00c1:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = tc.b0.m(r10, r6)
            int r5 = tc.b0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00d3:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = tc.b0.m(r10, r6)
            int r5 = tc.b0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00e5:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = tc.b0.o(r10, r6)
            java.lang.Object r5 = tc.b0.o(r11, r6)
            boolean r4 = com.google.protobuf.z.B(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00fb:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = tc.b0.o(r10, r6)
            java.lang.Object r5 = tc.b0.o(r11, r6)
            boolean r4 = com.google.protobuf.z.B(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0111:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = tc.b0.o(r10, r6)
            java.lang.Object r5 = tc.b0.o(r11, r6)
            boolean r4 = com.google.protobuf.z.B(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0127:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            boolean r4 = tc.b0.g(r10, r6)
            boolean r5 = tc.b0.g(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0139:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = tc.b0.m(r10, r6)
            int r5 = tc.b0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x014b:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = tc.b0.n(r10, r6)
            long r6 = tc.b0.n(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x015f:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = tc.b0.m(r10, r6)
            int r5 = tc.b0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0170:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = tc.b0.n(r10, r6)
            long r6 = tc.b0.n(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0183:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = tc.b0.n(r10, r6)
            long r6 = tc.b0.n(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0196:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            float r4 = tc.b0.l(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = tc.b0.l(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x01af:
            boolean r4 = r9.i(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            double r4 = tc.b0.k(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = tc.b0.k(r11, r6)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r3 = r1
        L_0x01cb:
            if (r3 != 0) goto L_0x01ce
            return r1
        L_0x01ce:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01d2:
            com.google.protobuf.c0<?, ?> r0 = r9.f7951k
            com.google.protobuf.d0 r0 = r0.a(r10)
            com.google.protobuf.c0<?, ?> r2 = r9.f7951k
            com.google.protobuf.d0 r2 = r2.a(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e5
            return r1
        L_0x01e5:
            boolean r0 = r9.f7944d
            if (r0 == 0) goto L_0x01fa
            com.google.protobuf.f<?> r0 = r9.f7952l
            com.google.protobuf.h r10 = r0.b(r10)
            com.google.protobuf.f<?> r0 = r9.f7952l
            com.google.protobuf.h r11 = r0.b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.e(java.lang.Object, java.lang.Object):boolean");
    }

    public final int f(T t10) {
        if (this.f7945e) {
            return n(t10);
        }
        return m(t10);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        if (r3 != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d9, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f3, code lost:
        if (r3 != false) goto L_0x01f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f6, code lost:
        r8 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f7, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0241, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0243, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(T r11) {
        /*
            r10 = this;
            int[] r0 = r10.f7941a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0247
            int r3 = r10.B(r1)
            int[] r4 = r10.f7941a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            r8 = 1231(0x4cf, float:1.725E-42)
            r9 = 1237(0x4d5, float:1.733E-42)
            switch(r3) {
                case 0: goto L_0x0233;
                case 1: goto L_0x0228;
                case 2: goto L_0x021d;
                case 3: goto L_0x0212;
                case 4: goto L_0x020b;
                case 5: goto L_0x0200;
                case 6: goto L_0x01f9;
                case 7: goto L_0x01eb;
                case 8: goto L_0x01de;
                case 9: goto L_0x01cf;
                case 10: goto L_0x01c3;
                case 11: goto L_0x01bb;
                case 12: goto L_0x01b3;
                case 13: goto L_0x01ab;
                case 14: goto L_0x019f;
                case 15: goto L_0x0197;
                case 16: goto L_0x018b;
                case 17: goto L_0x0180;
                case 18: goto L_0x0174;
                case 19: goto L_0x0174;
                case 20: goto L_0x0174;
                case 21: goto L_0x0174;
                case 22: goto L_0x0174;
                case 23: goto L_0x0174;
                case 24: goto L_0x0174;
                case 25: goto L_0x0174;
                case 26: goto L_0x0174;
                case 27: goto L_0x0174;
                case 28: goto L_0x0174;
                case 29: goto L_0x0174;
                case 30: goto L_0x0174;
                case 31: goto L_0x0174;
                case 32: goto L_0x0174;
                case 33: goto L_0x0174;
                case 34: goto L_0x0174;
                case 35: goto L_0x0174;
                case 36: goto L_0x0174;
                case 37: goto L_0x0174;
                case 38: goto L_0x0174;
                case 39: goto L_0x0174;
                case 40: goto L_0x0174;
                case 41: goto L_0x0174;
                case 42: goto L_0x0174;
                case 43: goto L_0x0174;
                case 44: goto L_0x0174;
                case 45: goto L_0x0174;
                case 46: goto L_0x0174;
                case 47: goto L_0x0174;
                case 48: goto L_0x0174;
                case 49: goto L_0x0174;
                case 50: goto L_0x0168;
                case 51: goto L_0x014c;
                case 52: goto L_0x0134;
                case 53: goto L_0x0122;
                case 54: goto L_0x0110;
                case 55: goto L_0x0102;
                case 56: goto L_0x00f0;
                case 57: goto L_0x00e2;
                case 58: goto L_0x00ca;
                case 59: goto L_0x00b6;
                case 60: goto L_0x00a4;
                case 61: goto L_0x0092;
                case 62: goto L_0x0084;
                case 63: goto L_0x0076;
                case 64: goto L_0x0068;
                case 65: goto L_0x0056;
                case 66: goto L_0x0048;
                case 67: goto L_0x0036;
                case 68: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0243
        L_0x0024:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = tc.b0.o(r11, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0036:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = x(r11, r5)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x0048:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = w(r11, r5)
            goto L_0x0241
        L_0x0056:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = x(r11, r5)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x0068:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = w(r11, r5)
            goto L_0x0241
        L_0x0076:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = w(r11, r5)
            goto L_0x0241
        L_0x0084:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = w(r11, r5)
            goto L_0x0241
        L_0x0092:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = tc.b0.o(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00a4:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = tc.b0.o(r11, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00b6:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = tc.b0.o(r11, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00ca:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = tc.b0.o(r11, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.nio.charset.Charset r4 = com.google.protobuf.k.f7917a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x00e2:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = w(r11, r5)
            goto L_0x0241
        L_0x00f0:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = x(r11, r5)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x0102:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = w(r11, r5)
            goto L_0x0241
        L_0x0110:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = x(r11, r5)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x0122:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = x(r11, r5)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x0134:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = tc.b0.o(r11, r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x014c:
            boolean r3 = r10.q(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = tc.b0.o(r11, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x0168:
            int r2 = r2 * 53
            java.lang.Object r3 = tc.b0.o(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0174:
            int r2 = r2 * 53
            java.lang.Object r3 = tc.b0.o(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0180:
            java.lang.Object r3 = tc.b0.o(r11, r5)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
            goto L_0x01d9
        L_0x018b:
            int r2 = r2 * 53
            long r3 = tc.b0.n(r11, r5)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x0197:
            int r2 = r2 * 53
            int r3 = tc.b0.m(r11, r5)
            goto L_0x0241
        L_0x019f:
            int r2 = r2 * 53
            long r3 = tc.b0.n(r11, r5)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x01ab:
            int r2 = r2 * 53
            int r3 = tc.b0.m(r11, r5)
            goto L_0x0241
        L_0x01b3:
            int r2 = r2 * 53
            int r3 = tc.b0.m(r11, r5)
            goto L_0x0241
        L_0x01bb:
            int r2 = r2 * 53
            int r3 = tc.b0.m(r11, r5)
            goto L_0x0241
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = tc.b0.o(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01cf:
            java.lang.Object r3 = tc.b0.o(r11, r5)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
        L_0x01d9:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0243
        L_0x01de:
            int r2 = r2 * 53
            java.lang.Object r3 = tc.b0.o(r11, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01eb:
            int r2 = r2 * 53
            boolean r3 = tc.b0.g(r11, r5)
            java.nio.charset.Charset r4 = com.google.protobuf.k.f7917a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x01f6:
            r8 = r9
        L_0x01f7:
            r3 = r8
            goto L_0x0241
        L_0x01f9:
            int r2 = r2 * 53
            int r3 = tc.b0.m(r11, r5)
            goto L_0x0241
        L_0x0200:
            int r2 = r2 * 53
            long r3 = tc.b0.n(r11, r5)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x020b:
            int r2 = r2 * 53
            int r3 = tc.b0.m(r11, r5)
            goto L_0x0241
        L_0x0212:
            int r2 = r2 * 53
            long r3 = tc.b0.n(r11, r5)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x021d:
            int r2 = r2 * 53
            long r3 = tc.b0.n(r11, r5)
            int r3 = com.google.protobuf.k.a(r3)
            goto L_0x0241
        L_0x0228:
            int r2 = r2 * 53
            float r3 = tc.b0.l(r11, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x0233:
            int r2 = r2 * 53
            double r3 = tc.b0.k(r11, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.k.a(r3)
        L_0x0241:
            int r3 = r3 + r2
            r2 = r3
        L_0x0243:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0247:
            int r2 = r2 * 53
            com.google.protobuf.c0<?, ?> r0 = r10.f7951k
            com.google.protobuf.d0 r0 = r0.a(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r10.f7944d
            if (r1 == 0) goto L_0x0265
            int r0 = r0 * 53
            com.google.protobuf.f<?> r1 = r10.f7952l
            com.google.protobuf.h r11 = r1.b(r11)
            int r11 = r11.hashCode()
            int r0 = r0 + r11
        L_0x0265:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.g(java.lang.Object):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0369  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x037a  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x039c  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x03ad  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x03cf  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03e0  */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0406  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0417  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0439  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x044a  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x045b  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x046e  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x04a5  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x04b5  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x04f5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0505  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0514 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0211  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0233  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0255  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x02ee  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0310  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0358  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(java.lang.Object r13, com.google.protobuf.e r14) {
        /*
            r12 = this;
            r14.getClass()
            boolean r0 = r12.f7945e
            if (r0 == 0) goto L_0x0538
            boolean r0 = r12.f7944d
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.google.protobuf.f<?> r0 = r12.f7952l
            com.google.protobuf.h r0 = r0.b(r13)
            boolean r2 = r0.h()
            if (r2 != 0) goto L_0x0023
            java.util.Iterator r0 = r0.k()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0025
        L_0x0023:
            r0 = r1
            r2 = r0
        L_0x0025:
            int[] r3 = r12.f7941a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x002a:
            if (r5 >= r3) goto L_0x0518
            int r6 = r12.B(r5)
            int[] r7 = r12.f7941a
            r7 = r7[r5]
        L_0x0034:
            if (r2 == 0) goto L_0x0051
            com.google.protobuf.f<?> r8 = r12.f7952l
            r8.a(r2)
            if (r7 < 0) goto L_0x0051
            com.google.protobuf.f<?> r8 = r12.f7952l
            r8.f(r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004f
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0034
        L_0x004f:
            r2 = r1
            goto L_0x0034
        L_0x0051:
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r8 = r8 & r6
            int r8 = r8 >>> 20
            r9 = 1
            r10 = 1048575(0xfffff, float:1.469367E-39)
            switch(r8) {
                case 0: goto L_0x0505;
                case 1: goto L_0x04f5;
                case 2: goto L_0x04e5;
                case 3: goto L_0x04d5;
                case 4: goto L_0x04c5;
                case 5: goto L_0x04b5;
                case 6: goto L_0x04a5;
                case 7: goto L_0x0494;
                case 8: goto L_0x0483;
                case 9: goto L_0x046e;
                case 10: goto L_0x045b;
                case 11: goto L_0x044a;
                case 12: goto L_0x0439;
                case 13: goto L_0x0428;
                case 14: goto L_0x0417;
                case 15: goto L_0x0406;
                case 16: goto L_0x03f5;
                case 17: goto L_0x03e0;
                case 18: goto L_0x03cf;
                case 19: goto L_0x03be;
                case 20: goto L_0x03ad;
                case 21: goto L_0x039c;
                case 22: goto L_0x038b;
                case 23: goto L_0x037a;
                case 24: goto L_0x0369;
                case 25: goto L_0x0358;
                case 26: goto L_0x0347;
                case 27: goto L_0x0332;
                case 28: goto L_0x0321;
                case 29: goto L_0x0310;
                case 30: goto L_0x02ff;
                case 31: goto L_0x02ee;
                case 32: goto L_0x02dd;
                case 33: goto L_0x02cc;
                case 34: goto L_0x02bb;
                case 35: goto L_0x02aa;
                case 36: goto L_0x0299;
                case 37: goto L_0x0288;
                case 38: goto L_0x0277;
                case 39: goto L_0x0266;
                case 40: goto L_0x0255;
                case 41: goto L_0x0244;
                case 42: goto L_0x0233;
                case 43: goto L_0x0222;
                case 44: goto L_0x0211;
                case 45: goto L_0x0200;
                case 46: goto L_0x01ef;
                case 47: goto L_0x01de;
                case 48: goto L_0x01cd;
                case 49: goto L_0x01b8;
                case 50: goto L_0x01ad;
                case 51: goto L_0x0196;
                case 52: goto L_0x017f;
                case 53: goto L_0x016e;
                case 54: goto L_0x015d;
                case 55: goto L_0x014c;
                case 56: goto L_0x013b;
                case 57: goto L_0x012a;
                case 58: goto L_0x0113;
                case 59: goto L_0x0102;
                case 60: goto L_0x00ed;
                case 61: goto L_0x00da;
                case 62: goto L_0x00c9;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a7;
                case 65: goto L_0x0096;
                case 66: goto L_0x0085;
                case 67: goto L_0x0074;
                case 68: goto L_0x005f;
                default: goto L_0x005d;
            }
        L_0x005d:
            goto L_0x0514
        L_0x005f:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            tc.x r8 = r12.l(r5)
            r14.h(r7, r8, r6)
            goto L_0x0514
        L_0x0074:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = x(r13, r8)
            r14.p(r7, r8)
            goto L_0x0514
        L_0x0085:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = w(r13, r8)
            r14.o(r7, r6)
            goto L_0x0514
        L_0x0096:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = x(r13, r8)
            r14.n(r7, r8)
            goto L_0x0514
        L_0x00a7:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = w(r13, r8)
            r14.m(r7, r6)
            goto L_0x0514
        L_0x00b8:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = w(r13, r8)
            r14.d(r7, r6)
            goto L_0x0514
        L_0x00c9:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = w(r13, r8)
            r14.q(r7, r6)
            goto L_0x0514
        L_0x00da:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            tc.c r6 = (tc.c) r6
            r14.b(r7, r6)
            goto L_0x0514
        L_0x00ed:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            tc.x r8 = r12.l(r5)
            r14.k(r7, r8, r6)
            goto L_0x0514
        L_0x0102:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            E(r7, r6, r14)
            goto L_0x0514
        L_0x0113:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r14.a(r7, r6)
            goto L_0x0514
        L_0x012a:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = w(r13, r8)
            r14.e(r7, r6)
            goto L_0x0514
        L_0x013b:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = x(r13, r8)
            r14.f(r7, r8)
            goto L_0x0514
        L_0x014c:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = w(r13, r8)
            r14.i(r7, r6)
            goto L_0x0514
        L_0x015d:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = x(r13, r8)
            r14.r(r7, r8)
            goto L_0x0514
        L_0x016e:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = x(r13, r8)
            r14.j(r7, r8)
            goto L_0x0514
        L_0x017f:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r14.g(r7, r6)
            goto L_0x0514
        L_0x0196:
            boolean r8 = r12.q(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r14.c(r7, r8)
            goto L_0x0514
        L_0x01ad:
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            r12.D(r14, r7, r6, r5)
            goto L_0x0514
        L_0x01b8:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            tc.x r8 = r12.l(r5)
            com.google.protobuf.z.J(r7, r6, r14, r8)
            goto L_0x0514
        L_0x01cd:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.Q(r7, r6, r14, r9)
            goto L_0x0514
        L_0x01de:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.P(r7, r6, r14, r9)
            goto L_0x0514
        L_0x01ef:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.O(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0200:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.N(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0211:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.F(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0222:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.S(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0233:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.C(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0244:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.G(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0255:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.H(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0266:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.K(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0277:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.T(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0288:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.L(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0299:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.I(r7, r6, r14, r9)
            goto L_0x0514
        L_0x02aa:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.E(r7, r6, r14, r9)
            goto L_0x0514
        L_0x02bb:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.Q(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02cc:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.P(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02dd:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.O(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02ee:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.N(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02ff:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.F(r7, r6, r14, r4)
            goto L_0x0514
        L_0x0310:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.S(r7, r6, r14, r4)
            goto L_0x0514
        L_0x0321:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.D(r7, r6, r14)
            goto L_0x0514
        L_0x0332:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            tc.x r8 = r12.l(r5)
            com.google.protobuf.z.M(r7, r6, r14, r8)
            goto L_0x0514
        L_0x0347:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.R(r7, r6, r14)
            goto L_0x0514
        L_0x0358:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.C(r7, r6, r14, r4)
            goto L_0x0514
        L_0x0369:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.G(r7, r6, r14, r4)
            goto L_0x0514
        L_0x037a:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.H(r7, r6, r14, r4)
            goto L_0x0514
        L_0x038b:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.K(r7, r6, r14, r4)
            goto L_0x0514
        L_0x039c:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.T(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03ad:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.L(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03be:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.I(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03cf:
            int[] r7 = r12.f7941a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.protobuf.z.E(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03e0:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            tc.x r8 = r12.l(r5)
            r14.h(r7, r8, r6)
            goto L_0x0514
        L_0x03f5:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = tc.b0.n(r13, r8)
            r14.p(r7, r8)
            goto L_0x0514
        L_0x0406:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = tc.b0.m(r13, r8)
            r14.o(r7, r6)
            goto L_0x0514
        L_0x0417:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = tc.b0.n(r13, r8)
            r14.n(r7, r8)
            goto L_0x0514
        L_0x0428:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = tc.b0.m(r13, r8)
            r14.m(r7, r6)
            goto L_0x0514
        L_0x0439:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = tc.b0.m(r13, r8)
            r14.d(r7, r6)
            goto L_0x0514
        L_0x044a:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = tc.b0.m(r13, r8)
            r14.q(r7, r6)
            goto L_0x0514
        L_0x045b:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            tc.c r6 = (tc.c) r6
            r14.b(r7, r6)
            goto L_0x0514
        L_0x046e:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            tc.x r8 = r12.l(r5)
            r14.k(r7, r8, r6)
            goto L_0x0514
        L_0x0483:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = tc.b0.o(r13, r8)
            E(r7, r6, r14)
            goto L_0x0514
        L_0x0494:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = tc.b0.g(r13, r8)
            r14.a(r7, r6)
            goto L_0x0514
        L_0x04a5:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = tc.b0.m(r13, r8)
            r14.e(r7, r6)
            goto L_0x0514
        L_0x04b5:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = tc.b0.n(r13, r8)
            r14.f(r7, r8)
            goto L_0x0514
        L_0x04c5:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = tc.b0.m(r13, r8)
            r14.i(r7, r6)
            goto L_0x0514
        L_0x04d5:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = tc.b0.n(r13, r8)
            r14.r(r7, r8)
            goto L_0x0514
        L_0x04e5:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = tc.b0.n(r13, r8)
            r14.j(r7, r8)
            goto L_0x0514
        L_0x04f5:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = tc.b0.l(r13, r8)
            r14.g(r7, r6)
            goto L_0x0514
        L_0x0505:
            boolean r8 = r12.o(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = tc.b0.k(r13, r8)
            r14.c(r7, r8)
        L_0x0514:
            int r5 = r5 + 3
            goto L_0x002a
        L_0x0518:
            if (r2 == 0) goto L_0x052e
            com.google.protobuf.f<?> r3 = r12.f7952l
            r3.f(r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x052c
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0518
        L_0x052c:
            r2 = r1
            goto L_0x0518
        L_0x052e:
            com.google.protobuf.c0<?, ?> r0 = r12.f7951k
            com.google.protobuf.d0 r13 = r0.a(r13)
            r0.h(r13, r14)
            goto L_0x053b
        L_0x0538:
            r12.C(r13, r14)
        L_0x053b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.h(java.lang.Object, com.google.protobuf.e):void");
    }

    public final boolean i(int i10, Object obj, Object obj2) {
        if (o(i10, obj) == o(i10, obj2)) {
            return true;
        }
        return false;
    }

    public final Object k(int i10) {
        return this.f7942b[(i10 / 3) * 2];
    }

    public final x l(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f7942b;
        x xVar = (x) objArr[i11];
        if (xVar != null) {
            return xVar;
        }
        x a10 = v.f15013c.a((Class) objArr[i11 + 1]);
        this.f7942b[i11] = a10;
        return a10;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0338, code lost:
        r6 = r6 + ((r9 + r4) + r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x04a8, code lost:
        r6 = r6 + r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int m(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f7940o
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r3
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000d:
            int[] r9 = r0.f7941a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0505
            int r9 = r0.B(r5)
            int[] r10 = r0.f7941a
            r11 = r10[r5]
            r12 = 267386880(0xff00000, float:2.3665827E-29)
            r12 = r12 & r9
            int r12 = r12 >>> 20
            r13 = 17
            r14 = 1
            if (r12 > r13) goto L_0x0036
            int r13 = r5 + 2
            r10 = r10[r13]
            r13 = r10 & r3
            int r15 = r10 >>> 20
            int r14 = r14 << r15
            if (r13 == r7) goto L_0x0054
            long r7 = (long) r13
            int r8 = r2.getInt(r1, r7)
            r7 = r13
            goto L_0x0054
        L_0x0036:
            boolean r10 = r0.f7946f
            if (r10 == 0) goto L_0x0052
            tc.g r10 = tc.g.DOUBLE_LIST_PACKED
            int r10 = r10.b()
            if (r12 < r10) goto L_0x0052
            tc.g r10 = tc.g.SINT64_LIST_PACKED
            int r10 = r10.b()
            if (r12 > r10) goto L_0x0052
            int[] r10 = r0.f7941a
            int r13 = r5 + 2
            r10 = r10[r13]
            r10 = r10 & r3
            goto L_0x0053
        L_0x0052:
            r10 = 0
        L_0x0053:
            r14 = 0
        L_0x0054:
            r9 = r9 & r3
            long r3 = (long) r9
            switch(r12) {
                case 0: goto L_0x04f5;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04df;
                case 3: goto L_0x04d2;
                case 4: goto L_0x04c5;
                case 5: goto L_0x04bc;
                case 6: goto L_0x04b3;
                case 7: goto L_0x04aa;
                case 8: goto L_0x048f;
                case 9: goto L_0x047d;
                case 10: goto L_0x046d;
                case 11: goto L_0x045f;
                case 12: goto L_0x0451;
                case 13: goto L_0x0447;
                case 14: goto L_0x043d;
                case 15: goto L_0x042f;
                case 16: goto L_0x0421;
                case 17: goto L_0x040d;
                case 18: goto L_0x0401;
                case 19: goto L_0x03f5;
                case 20: goto L_0x03e9;
                case 21: goto L_0x03dd;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03c5;
                case 24: goto L_0x03b9;
                case 25: goto L_0x03ad;
                case 26: goto L_0x03a1;
                case 27: goto L_0x0391;
                case 28: goto L_0x0385;
                case 29: goto L_0x0379;
                case 30: goto L_0x036d;
                case 31: goto L_0x0361;
                case 32: goto L_0x0355;
                case 33: goto L_0x0349;
                case 34: goto L_0x033d;
                case 35: goto L_0x031c;
                case 36: goto L_0x02ff;
                case 37: goto L_0x02e2;
                case 38: goto L_0x02c5;
                case 39: goto L_0x02a7;
                case 40: goto L_0x0289;
                case 41: goto L_0x026b;
                case 42: goto L_0x024d;
                case 43: goto L_0x022f;
                case 44: goto L_0x0211;
                case 45: goto L_0x01f3;
                case 46: goto L_0x01d5;
                case 47: goto L_0x01b7;
                case 48: goto L_0x0199;
                case 49: goto L_0x0189;
                case 50: goto L_0x0179;
                case 51: goto L_0x016d;
                case 52: goto L_0x0161;
                case 53: goto L_0x0151;
                case 54: goto L_0x0141;
                case 55: goto L_0x0131;
                case 56: goto L_0x0125;
                case 57: goto L_0x0119;
                case 58: goto L_0x010d;
                case 59: goto L_0x00ef;
                case 60: goto L_0x00db;
                case 61: goto L_0x00c9;
                case 62: goto L_0x00b9;
                case 63: goto L_0x00a9;
                case 64: goto L_0x009d;
                case 65: goto L_0x0091;
                case 66: goto L_0x0081;
                case 67: goto L_0x0071;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x04fe
        L_0x005b:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.protobuf.u r3 = (com.google.protobuf.u) r3
            tc.x r4 = r0.l(r5)
            int r3 = com.google.protobuf.CodedOutputStream.Q(r11, r3, r4)
            goto L_0x04fd
        L_0x0071:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            long r3 = x(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.Y(r11, r3)
            goto L_0x04fd
        L_0x0081:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            int r3 = w(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.X(r11, r3)
            goto L_0x04fd
        L_0x0091:
            boolean r3 = r0.q(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.W(r11)
            goto L_0x04fd
        L_0x009d:
            boolean r3 = r0.q(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.V(r11)
            goto L_0x04fd
        L_0x00a9:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            int r3 = w(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.M(r11, r3)
            goto L_0x04fd
        L_0x00b9:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            int r3 = w(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.c0(r11, r3)
            goto L_0x04fd
        L_0x00c9:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            tc.c r3 = (tc.c) r3
            int r3 = com.google.protobuf.CodedOutputStream.K(r11, r3)
            goto L_0x04fd
        L_0x00db:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            tc.x r4 = r0.l(r5)
            int r3 = com.google.protobuf.z.o(r11, r4, r3)
            goto L_0x04fd
        L_0x00ef:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof tc.c
            if (r4 == 0) goto L_0x0105
            tc.c r3 = (tc.c) r3
            int r3 = com.google.protobuf.CodedOutputStream.K(r11, r3)
            goto L_0x04a8
        L_0x0105:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.Z(r11, r3)
            goto L_0x04a8
        L_0x010d:
            boolean r3 = r0.q(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.J(r11)
            goto L_0x04fd
        L_0x0119:
            boolean r3 = r0.q(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.N(r11)
            goto L_0x04fd
        L_0x0125:
            boolean r3 = r0.q(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.O(r11)
            goto L_0x04fd
        L_0x0131:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            int r3 = w(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.R(r11, r3)
            goto L_0x04fd
        L_0x0141:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            long r3 = x(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.e0(r11, r3)
            goto L_0x04fd
        L_0x0151:
            boolean r9 = r0.q(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            long r3 = x(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.T(r11, r3)
            goto L_0x04fd
        L_0x0161:
            boolean r3 = r0.q(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.P(r11)
            goto L_0x04fd
        L_0x016d:
            boolean r3 = r0.q(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.L(r11)
            goto L_0x04fd
        L_0x0179:
            com.google.protobuf.s r9 = r0.f7953m
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.k(r5)
            int r3 = r9.d(r11, r3, r4)
            goto L_0x04fd
        L_0x0189:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            tc.x r4 = r0.l(r5)
            int r3 = com.google.protobuf.z.j(r11, r3, r4)
            goto L_0x04fd
        L_0x0199:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.t(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x01ad
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x01ad:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x01b7:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.r(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x01cb
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x01cb:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x01d5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.i(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x01e9
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x01e9:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x01f3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.g(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x0207
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0207:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x0211:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.e(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x0225
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0225:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x022f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.w(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x0243
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0243:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x024d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.b(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x0261
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0261:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x026b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.g(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x027f
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x027f:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x0289:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.i(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x029d
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x029d:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x02a7:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.l(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x02bb
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02bb:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x02c5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.y(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x02d9
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02d9:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x02e2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.n(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x02f6
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02f6:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x02ff:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.g(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x0313
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0313:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x031c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.i(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7946f
            if (r4 == 0) goto L_0x0330
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0330:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.protobuf.CodedOutputStream.d0(r3)
        L_0x0338:
            int r9 = r9 + r4
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x04fe
        L_0x033d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.s(r11, r3)
            goto L_0x04fd
        L_0x0349:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.q(r11, r3)
            goto L_0x04fd
        L_0x0355:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.h(r11, r3)
            goto L_0x04fd
        L_0x0361:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.f(r11, r3)
            goto L_0x04fd
        L_0x036d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.d(r11, r3)
            goto L_0x04fd
        L_0x0379:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.v(r11, r3)
            goto L_0x04fd
        L_0x0385:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.c(r11, r3)
            goto L_0x04fd
        L_0x0391:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            tc.x r4 = r0.l(r5)
            int r3 = com.google.protobuf.z.p(r11, r3, r4)
            goto L_0x04fd
        L_0x03a1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.u(r11, r3)
            goto L_0x04fd
        L_0x03ad:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.a(r11, r3)
            goto L_0x04fd
        L_0x03b9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.f(r11, r3)
            goto L_0x04fd
        L_0x03c5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.h(r11, r3)
            goto L_0x04fd
        L_0x03d1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.k(r11, r3)
            goto L_0x04fd
        L_0x03dd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.x(r11, r3)
            goto L_0x04fd
        L_0x03e9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.m(r11, r3)
            goto L_0x04fd
        L_0x03f5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.f(r11, r3)
            goto L_0x04fd
        L_0x0401:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.protobuf.z.h(r11, r3)
            goto L_0x04fd
        L_0x040d:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.protobuf.u r3 = (com.google.protobuf.u) r3
            tc.x r4 = r0.l(r5)
            int r3 = com.google.protobuf.CodedOutputStream.Q(r11, r3, r4)
            goto L_0x04fd
        L_0x0421:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            long r3 = r2.getLong(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.Y(r11, r3)
            goto L_0x04fd
        L_0x042f:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            int r3 = r2.getInt(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.X(r11, r3)
            goto L_0x04fd
        L_0x043d:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.W(r11)
            goto L_0x04fd
        L_0x0447:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.V(r11)
            goto L_0x04fd
        L_0x0451:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            int r3 = r2.getInt(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.M(r11, r3)
            goto L_0x04fd
        L_0x045f:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            int r3 = r2.getInt(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.c0(r11, r3)
            goto L_0x04fd
        L_0x046d:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            tc.c r3 = (tc.c) r3
            int r3 = com.google.protobuf.CodedOutputStream.K(r11, r3)
            goto L_0x04fd
        L_0x047d:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            tc.x r4 = r0.l(r5)
            int r3 = com.google.protobuf.z.o(r11, r4, r3)
            goto L_0x04fd
        L_0x048f:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof tc.c
            if (r4 == 0) goto L_0x04a2
            tc.c r3 = (tc.c) r3
            int r3 = com.google.protobuf.CodedOutputStream.K(r11, r3)
            goto L_0x04a8
        L_0x04a2:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.Z(r11, r3)
        L_0x04a8:
            int r6 = r6 + r3
            goto L_0x04fe
        L_0x04aa:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.J(r11)
            goto L_0x04fd
        L_0x04b3:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.N(r11)
            goto L_0x04fd
        L_0x04bc:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.O(r11)
            goto L_0x04fd
        L_0x04c5:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            int r3 = r2.getInt(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.R(r11, r3)
            goto L_0x04fd
        L_0x04d2:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            long r3 = r2.getLong(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.e0(r11, r3)
            goto L_0x04fd
        L_0x04df:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            long r3 = r2.getLong(r1, r3)
            int r3 = com.google.protobuf.CodedOutputStream.T(r11, r3)
            goto L_0x04fd
        L_0x04ec:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.P(r11)
            goto L_0x04fd
        L_0x04f5:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.protobuf.CodedOutputStream.L(r11)
        L_0x04fd:
            int r6 = r6 + r3
        L_0x04fe:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0505:
            com.google.protobuf.c0<?, ?> r2 = r0.f7951k
            com.google.protobuf.d0 r3 = r2.a(r1)
            int r2 = r2.b(r3)
            int r2 = r2 + r6
            boolean r3 = r0.f7944d
            if (r3 == 0) goto L_0x051f
            com.google.protobuf.f<?> r3 = r0.f7952l
            com.google.protobuf.h r1 = r3.b(r1)
            int r1 = r1.g()
            int r2 = r2 + r1
        L_0x051f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.m(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0315, code lost:
        r3 = r3 + ((r6 + r4) + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0477, code lost:
        r3 = r3 + r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f7940o
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f7941a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x04e1
            int r4 = r11.B(r2)
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            int[] r6 = r11.f7941a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r8 = (long) r4
            tc.g r4 = tc.g.DOUBLE_LIST_PACKED
            int r4 = r4.b()
            if (r5 < r4) goto L_0x0034
            tc.g r4 = tc.g.SINT64_LIST_PACKED
            int r4 = r4.b()
            if (r5 > r4) goto L_0x0034
            int[] r4 = r11.f7941a
            int r10 = r2 + 2
            r4 = r4[r10]
            r4 = r4 & r7
            goto L_0x0035
        L_0x0034:
            r4 = r1
        L_0x0035:
            switch(r5) {
                case 0: goto L_0x04d2;
                case 1: goto L_0x04c7;
                case 2: goto L_0x04b8;
                case 3: goto L_0x04a9;
                case 4: goto L_0x049a;
                case 5: goto L_0x048f;
                case 6: goto L_0x0484;
                case 7: goto L_0x0479;
                case 8: goto L_0x045c;
                case 9: goto L_0x0448;
                case 10: goto L_0x0436;
                case 11: goto L_0x0426;
                case 12: goto L_0x0416;
                case 13: goto L_0x040a;
                case 14: goto L_0x03fe;
                case 15: goto L_0x03ee;
                case 16: goto L_0x03de;
                case 17: goto L_0x03c8;
                case 18: goto L_0x03be;
                case 19: goto L_0x03b4;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a0;
                case 22: goto L_0x0396;
                case 23: goto L_0x038c;
                case 24: goto L_0x0382;
                case 25: goto L_0x0378;
                case 26: goto L_0x036e;
                case 27: goto L_0x0360;
                case 28: goto L_0x0356;
                case 29: goto L_0x034c;
                case 30: goto L_0x0342;
                case 31: goto L_0x0338;
                case 32: goto L_0x032e;
                case 33: goto L_0x0324;
                case 34: goto L_0x031a;
                case 35: goto L_0x02f9;
                case 36: goto L_0x02dc;
                case 37: goto L_0x02bf;
                case 38: goto L_0x02a2;
                case 39: goto L_0x0284;
                case 40: goto L_0x0266;
                case 41: goto L_0x0248;
                case 42: goto L_0x022a;
                case 43: goto L_0x020c;
                case 44: goto L_0x01ee;
                case 45: goto L_0x01d0;
                case 46: goto L_0x01b2;
                case 47: goto L_0x0194;
                case 48: goto L_0x0176;
                case 49: goto L_0x0168;
                case 50: goto L_0x0158;
                case 51: goto L_0x014c;
                case 52: goto L_0x0140;
                case 53: goto L_0x0130;
                case 54: goto L_0x0120;
                case 55: goto L_0x0110;
                case 56: goto L_0x0104;
                case 57: goto L_0x00f8;
                case 58: goto L_0x00ec;
                case 59: goto L_0x00ce;
                case 60: goto L_0x00ba;
                case 61: goto L_0x00a8;
                case 62: goto L_0x0098;
                case 63: goto L_0x0088;
                case 64: goto L_0x007c;
                case 65: goto L_0x0070;
                case 66: goto L_0x0060;
                case 67: goto L_0x0050;
                case 68: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x04dd
        L_0x003a:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = tc.b0.o(r12, r8)
            com.google.protobuf.u r4 = (com.google.protobuf.u) r4
            tc.x r5 = r11.l(r2)
            int r4 = com.google.protobuf.CodedOutputStream.Q(r6, r4, r5)
            goto L_0x04dc
        L_0x0050:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            long r4 = x(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.Y(r6, r4)
            goto L_0x04dc
        L_0x0060:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = w(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.X(r6, r4)
            goto L_0x04dc
        L_0x0070:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.W(r6)
            goto L_0x04dc
        L_0x007c:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.V(r6)
            goto L_0x04dc
        L_0x0088:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = w(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.M(r6, r4)
            goto L_0x04dc
        L_0x0098:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = w(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.c0(r6, r4)
            goto L_0x04dc
        L_0x00a8:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = tc.b0.o(r12, r8)
            tc.c r4 = (tc.c) r4
            int r4 = com.google.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x04dc
        L_0x00ba:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = tc.b0.o(r12, r8)
            tc.x r5 = r11.l(r2)
            int r4 = com.google.protobuf.z.o(r6, r5, r4)
            goto L_0x04dc
        L_0x00ce:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = tc.b0.o(r12, r8)
            boolean r5 = r4 instanceof tc.c
            if (r5 == 0) goto L_0x00e4
            tc.c r4 = (tc.c) r4
            int r4 = com.google.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x0477
        L_0x00e4:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.protobuf.CodedOutputStream.Z(r6, r4)
            goto L_0x0477
        L_0x00ec:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.J(r6)
            goto L_0x04dc
        L_0x00f8:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.N(r6)
            goto L_0x04dc
        L_0x0104:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.O(r6)
            goto L_0x04dc
        L_0x0110:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = w(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.R(r6, r4)
            goto L_0x04dc
        L_0x0120:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            long r4 = x(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.e0(r6, r4)
            goto L_0x04dc
        L_0x0130:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            long r4 = x(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.T(r6, r4)
            goto L_0x04dc
        L_0x0140:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.P(r6)
            goto L_0x04dc
        L_0x014c:
            boolean r4 = r11.q(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.L(r6)
            goto L_0x04dc
        L_0x0158:
            com.google.protobuf.s r4 = r11.f7953m
            java.lang.Object r5 = tc.b0.o(r12, r8)
            java.lang.Object r7 = r11.k(r2)
            int r4 = r4.d(r6, r5, r7)
            goto L_0x04dc
        L_0x0168:
            java.util.List r4 = r(r12, r8)
            tc.x r5 = r11.l(r2)
            int r4 = com.google.protobuf.z.j(r6, r4, r5)
            goto L_0x04dc
        L_0x0176:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.t(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x018a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x018a:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0194:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.r(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x01a8
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01a8:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x01b2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.i(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x01c6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01c6:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x01d0:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.g(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x01e4
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01e4:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x01ee:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.e(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x0202
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0202:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x020c:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.w(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x0220
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0220:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x022a:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.b(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x023e
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x023e:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0248:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.g(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x025c
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x025c:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0266:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.i(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x027a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x027a:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0284:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.l(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x0298
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0298:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02a2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.y(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x02b6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02b6:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02bf:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.n(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x02d3
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02d3:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02dc:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.g(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x02f0
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02f0:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02f9:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.protobuf.z.i(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7946f
            if (r7 == 0) goto L_0x030d
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x030d:
            int r4 = com.google.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.protobuf.CodedOutputStream.d0(r5)
        L_0x0315:
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r3 = r3 + r6
            goto L_0x04dd
        L_0x031a:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.s(r6, r4)
            goto L_0x04dc
        L_0x0324:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.q(r6, r4)
            goto L_0x04dc
        L_0x032e:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.h(r6, r4)
            goto L_0x04dc
        L_0x0338:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.f(r6, r4)
            goto L_0x04dc
        L_0x0342:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.d(r6, r4)
            goto L_0x04dc
        L_0x034c:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.v(r6, r4)
            goto L_0x04dc
        L_0x0356:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.c(r6, r4)
            goto L_0x04dc
        L_0x0360:
            java.util.List r4 = r(r12, r8)
            tc.x r5 = r11.l(r2)
            int r4 = com.google.protobuf.z.p(r6, r4, r5)
            goto L_0x04dc
        L_0x036e:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.u(r6, r4)
            goto L_0x04dc
        L_0x0378:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.a(r6, r4)
            goto L_0x04dc
        L_0x0382:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.f(r6, r4)
            goto L_0x04dc
        L_0x038c:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.h(r6, r4)
            goto L_0x04dc
        L_0x0396:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.k(r6, r4)
            goto L_0x04dc
        L_0x03a0:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.x(r6, r4)
            goto L_0x04dc
        L_0x03aa:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.m(r6, r4)
            goto L_0x04dc
        L_0x03b4:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.f(r6, r4)
            goto L_0x04dc
        L_0x03be:
            java.util.List r4 = r(r12, r8)
            int r4 = com.google.protobuf.z.h(r6, r4)
            goto L_0x04dc
        L_0x03c8:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = tc.b0.o(r12, r8)
            com.google.protobuf.u r4 = (com.google.protobuf.u) r4
            tc.x r5 = r11.l(r2)
            int r4 = com.google.protobuf.CodedOutputStream.Q(r6, r4, r5)
            goto L_0x04dc
        L_0x03de:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            long r4 = tc.b0.n(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.Y(r6, r4)
            goto L_0x04dc
        L_0x03ee:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = tc.b0.m(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.X(r6, r4)
            goto L_0x04dc
        L_0x03fe:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.W(r6)
            goto L_0x04dc
        L_0x040a:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.V(r6)
            goto L_0x04dc
        L_0x0416:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = tc.b0.m(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.M(r6, r4)
            goto L_0x04dc
        L_0x0426:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = tc.b0.m(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.c0(r6, r4)
            goto L_0x04dc
        L_0x0436:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = tc.b0.o(r12, r8)
            tc.c r4 = (tc.c) r4
            int r4 = com.google.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x04dc
        L_0x0448:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = tc.b0.o(r12, r8)
            tc.x r5 = r11.l(r2)
            int r4 = com.google.protobuf.z.o(r6, r5, r4)
            goto L_0x04dc
        L_0x045c:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = tc.b0.o(r12, r8)
            boolean r5 = r4 instanceof tc.c
            if (r5 == 0) goto L_0x0471
            tc.c r4 = (tc.c) r4
            int r4 = com.google.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x0477
        L_0x0471:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.protobuf.CodedOutputStream.Z(r6, r4)
        L_0x0477:
            int r3 = r3 + r4
            goto L_0x04dd
        L_0x0479:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.J(r6)
            goto L_0x04dc
        L_0x0484:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.N(r6)
            goto L_0x04dc
        L_0x048f:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.O(r6)
            goto L_0x04dc
        L_0x049a:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = tc.b0.m(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.R(r6, r4)
            goto L_0x04dc
        L_0x04a9:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            long r4 = tc.b0.n(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.e0(r6, r4)
            goto L_0x04dc
        L_0x04b8:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            long r4 = tc.b0.n(r12, r8)
            int r4 = com.google.protobuf.CodedOutputStream.T(r6, r4)
            goto L_0x04dc
        L_0x04c7:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.P(r6)
            goto L_0x04dc
        L_0x04d2:
            boolean r4 = r11.o(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.protobuf.CodedOutputStream.L(r6)
        L_0x04dc:
            int r3 = r3 + r4
        L_0x04dd:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x04e1:
            com.google.protobuf.c0<?, ?> r0 = r11.f7951k
            com.google.protobuf.d0 r12 = r0.a(r12)
            int r12 = r0.b(r12)
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.w.n(java.lang.Object):int");
    }

    public final boolean o(int i10, Object obj) {
        boolean equals;
        int i11 = this.f7941a[i10 + 2];
        long j10 = (long) (i11 & 1048575);
        if (j10 == 1048575) {
            int B = B(i10);
            long j11 = (long) (B & 1048575);
            switch ((B & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(b0.k(obj, j11)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(b0.l(obj, j11)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (b0.n(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (b0.n(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (b0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (b0.n(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (b0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return b0.g(obj, j11);
                case 8:
                    Object o10 = b0.o(obj, j11);
                    if (o10 instanceof String) {
                        equals = ((String) o10).isEmpty();
                        break;
                    } else if (o10 instanceof c) {
                        equals = c.f14960b.equals(o10);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (b0.o(obj, j11) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    equals = c.f14960b.equals(b0.o(obj, j11));
                    break;
                case 11:
                    if (b0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (b0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (b0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (b0.n(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (b0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (b0.n(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (b0.o(obj, j11) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        } else if (((1 << (i11 >>> 20)) & b0.m(obj, j10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean q(T t10, int i10, int i11) {
        if (b0.m(t10, (long) (this.f7941a[i11 + 2] & 1048575)) == i10) {
            return true;
        }
        return false;
    }

    public final void s(int i10, Object obj, Object obj2) {
        if (o(i10, obj2)) {
            long B = (long) (B(i10) & 1048575);
            Unsafe unsafe = f7940o;
            Object object = unsafe.getObject(obj2, B);
            if (object != null) {
                x l10 = l(i10);
                if (!o(i10, obj)) {
                    if (!p(object)) {
                        unsafe.putObject(obj, B, object);
                    } else {
                        Object b10 = l10.b();
                        l10.a(b10, object);
                        unsafe.putObject(obj, B, b10);
                    }
                    z(i10, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, B);
                if (!p(object2)) {
                    Object b11 = l10.b();
                    l10.a(b11, object2);
                    unsafe.putObject(obj, B, b11);
                    object2 = b11;
                }
                l10.a(object2, object);
                return;
            }
            StringBuilder q10 = a.q("Source subfield ");
            q10.append(this.f7941a[i10]);
            q10.append(" is present but null: ");
            q10.append(obj2);
            throw new IllegalStateException(q10.toString());
        }
    }

    public final void t(int i10, Object obj, Object obj2) {
        int i11 = this.f7941a[i10];
        if (q(obj2, i11, i10)) {
            long B = (long) (B(i10) & 1048575);
            Unsafe unsafe = f7940o;
            Object object = unsafe.getObject(obj2, B);
            if (object != null) {
                x l10 = l(i10);
                if (!q(obj, i11, i10)) {
                    if (!p(object)) {
                        unsafe.putObject(obj, B, object);
                    } else {
                        Object b10 = l10.b();
                        l10.a(b10, object);
                        unsafe.putObject(obj, B, b10);
                    }
                    A(obj, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, B);
                if (!p(object2)) {
                    Object b11 = l10.b();
                    l10.a(b11, object2);
                    unsafe.putObject(obj, B, b11);
                    object2 = b11;
                }
                l10.a(object2, object);
                return;
            }
            StringBuilder q10 = a.q("Source subfield ");
            q10.append(this.f7941a[i10]);
            q10.append(" is present but null: ");
            q10.append(obj2);
            throw new IllegalStateException(q10.toString());
        }
    }

    public final void z(int i10, Object obj) {
        int i11 = this.f7941a[i10 + 2];
        long j10 = (long) (1048575 & i11);
        if (j10 != 1048575) {
            b0.t(obj, (1 << (i11 >>> 20)) | b0.m(obj, j10), j10);
        }
    }
}
