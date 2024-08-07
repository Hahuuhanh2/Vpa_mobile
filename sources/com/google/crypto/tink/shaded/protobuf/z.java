package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.a;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.d;
import com.google.crypto.tink.shaded.protobuf.p;
import f0.b0;
import j9.c;
import j9.c0;
import j9.d;
import j9.l;
import j9.o;
import j9.r;
import j9.w;
import j9.x;
import j9.y;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* compiled from: MessageSchema */
public final class z<T> implements c0<T> {

    /* renamed from: r  reason: collision with root package name */
    public static final int[] f7430r = new int[0];

    /* renamed from: s  reason: collision with root package name */
    public static final Unsafe f7431s = c0.p();

    /* renamed from: a  reason: collision with root package name */
    public final int[] f7432a;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f7433b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7434c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7435d;

    /* renamed from: e  reason: collision with root package name */
    public final x f7436e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7437f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f7438g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f7439h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f7440i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f7441j;

    /* renamed from: k  reason: collision with root package name */
    public final int f7442k;

    /* renamed from: l  reason: collision with root package name */
    public final int f7443l;

    /* renamed from: m  reason: collision with root package name */
    public final r f7444m;

    /* renamed from: n  reason: collision with root package name */
    public final t f7445n;

    /* renamed from: o  reason: collision with root package name */
    public final g0<?, ?> f7446o;

    /* renamed from: p  reason: collision with root package name */
    public final j<?> f7447p;

    /* renamed from: q  reason: collision with root package name */
    public final l f7448q;

    public z(int[] iArr, Object[] objArr, int i10, int i11, x xVar, boolean z10, int[] iArr2, int i12, int i13, r rVar, t tVar, g0 g0Var, j jVar, l lVar) {
        boolean z11;
        this.f7432a = iArr;
        this.f7433b = objArr;
        this.f7434c = i10;
        this.f7435d = i11;
        this.f7438g = xVar instanceof n;
        this.f7439h = z10;
        if (jVar == null || !jVar.e(xVar)) {
            z11 = false;
        } else {
            z11 = true;
        }
        this.f7437f = z11;
        this.f7440i = false;
        this.f7441j = iArr2;
        this.f7442k = i12;
        this.f7443l = i13;
        this.f7444m = rVar;
        this.f7445n = tVar;
        this.f7446o = g0Var;
        this.f7447p = jVar;
        this.f7436e = xVar;
        this.f7448q = lVar;
    }

    public static z C(o oVar, r rVar, t tVar, g0 g0Var, j jVar, l lVar) {
        if (oVar instanceof x) {
            return D((x) oVar, rVar, tVar, g0Var, jVar, lVar);
        }
        j9.z zVar = (j9.z) oVar;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:155:0x0345  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0348  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x039a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.crypto.tink.shaded.protobuf.z<T> D(j9.x r35, j9.r r36, com.google.crypto.tink.shaded.protobuf.t r37, com.google.crypto.tink.shaded.protobuf.g0<?, ?> r38, com.google.crypto.tink.shaded.protobuf.j<?> r39, j9.l r40) {
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
            int[] r7 = f7430r
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
            sun.misc.Unsafe r8 = f7431s
            java.lang.Object[] r18 = r35.d()
            com.google.crypto.tink.shaded.protobuf.x r19 = r35.b()
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
            java.lang.reflect.Field r11 = Q(r3, r11)
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
            java.lang.reflect.Field r14 = Q(r3, r14)
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
            java.lang.reflect.Field r14 = Q(r3, r14)
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
            java.lang.reflect.Field r15 = Q(r3, r15)
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
            com.google.crypto.tink.shaded.protobuf.z r0 = new com.google.crypto.tink.shaded.protobuf.z
            com.google.crypto.tink.shaded.protobuf.x r1 = r35.b()
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.z.D(j9.x, j9.r, com.google.crypto.tink.shaded.protobuf.t, com.google.crypto.tink.shaded.protobuf.g0, com.google.crypto.tink.shaded.protobuf.j, j9.l):com.google.crypto.tink.shaded.protobuf.z");
    }

    public static long E(int i10) {
        return (long) (i10 & 1048575);
    }

    public static <T> int F(T t10, long j10) {
        return ((Integer) c0.o(t10, j10)).intValue();
    }

    public static <T> long G(T t10, long j10) {
        return ((Long) c0.o(t10, j10)).longValue();
    }

    public static Field Q(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder w9 = b0.w("Field ", str, " for ");
            w9.append(cls.getName());
            w9.append(" not found. Known fields are ");
            w9.append(Arrays.toString(declaredFields));
            throw new RuntimeException(w9.toString());
        }
    }

    public static void Z(int i10, Object obj, d dVar) {
        if (obj instanceof String) {
            dVar.f11749a.s0(i10, (String) obj);
            return;
        }
        dVar.b(i10, (c) obj);
    }

    public static void l(Object obj) {
        if (!u(obj)) {
            throw new IllegalArgumentException(b0.q("Mutating immutable message: ", obj));
        }
    }

    public static h0 q(Object obj) {
        n nVar = (n) obj;
        h0 h0Var = nVar.unknownFields;
        if (h0Var != h0.f7386f) {
            return h0Var;
        }
        h0 h0Var2 = new h0();
        nVar.unknownFields = h0Var2;
        return h0Var2;
    }

    public static boolean u(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof n) {
            return ((n) obj).w();
        }
        return true;
    }

    public static List<?> w(Object obj, long j10) {
        return (List) c0.o(obj, j10);
    }

    public final Object A(int i10, Object obj) {
        c0 p10 = p(i10);
        long W = (long) (W(i10) & 1048575);
        if (!t(i10, obj)) {
            return p10.b();
        }
        Object object = f7431s.getObject(obj, W);
        if (u(object)) {
            return object;
        }
        Object b10 = p10.b();
        if (object != null) {
            p10.a(b10, object);
        }
        return b10;
    }

    public final Object B(T t10, int i10, int i11) {
        c0 p10 = p(i11);
        if (!v(t10, i10, i11)) {
            return p10.b();
        }
        Object object = f7431s.getObject(t10, (long) (W(i11) & 1048575));
        if (u(object)) {
            return object;
        }
        Object b10 = p10.b();
        if (object != null) {
            p10.a(b10, object);
        }
        return b10;
    }

    public final void H(Object obj, byte[] bArr, int i10, int i11, int i12, long j10, d.a aVar) {
        Unsafe unsafe = f7431s;
        Object o10 = o(i12);
        Object object = unsafe.getObject(obj, j10);
        if (this.f7448q.h(object)) {
            w f10 = this.f7448q.f();
            this.f7448q.a(f10, object);
            unsafe.putObject(obj, j10, f10);
            object = f10;
        }
        this.f7448q.c(o10);
        this.f7448q.g(object);
        int G = d.G(bArr, i10, aVar);
        int i13 = aVar.f7334a;
        if (i13 < 0 || i13 > i11 - G) {
            throw InvalidProtocolBufferException.g();
        }
        throw null;
    }

    public final int I(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, int i17, d.a aVar) {
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i12;
        int i20 = i13;
        int i21 = i14;
        long j11 = j10;
        int i22 = i17;
        d.a aVar2 = aVar;
        Unsafe unsafe = f7431s;
        long j12 = (long) (this.f7432a[i22 + 2] & 1048575);
        switch (i16) {
            case 51:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Double.valueOf(d.d(i18, bArr2)));
                    int i23 = i18 + 8;
                    unsafe.putInt(t11, j12, i20);
                    return i23;
                }
                break;
            case 52:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Float.valueOf(d.k(i18, bArr2)));
                    int i24 = i18 + 4;
                    unsafe.putInt(t11, j12, i20);
                    return i24;
                }
                break;
            case 53:
            case 54:
                if (i21 == 0) {
                    int I = d.I(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(aVar2.f7335b));
                    unsafe.putInt(t11, j12, i20);
                    return I;
                }
                break;
            case 55:
            case 62:
                if (i21 == 0) {
                    int G = d.G(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(aVar2.f7334a));
                    unsafe.putInt(t11, j12, i20);
                    return G;
                }
                break;
            case 56:
            case 65:
                if (i21 == 1) {
                    unsafe.putObject(t11, j11, Long.valueOf(d.i(i18, bArr2)));
                    int i25 = i18 + 8;
                    unsafe.putInt(t11, j12, i20);
                    return i25;
                }
                break;
            case 57:
            case 64:
                if (i21 == 5) {
                    unsafe.putObject(t11, j11, Integer.valueOf(d.g(i18, bArr2)));
                    int i26 = i18 + 4;
                    unsafe.putInt(t11, j12, i20);
                    return i26;
                }
                break;
            case 58:
                if (i21 == 0) {
                    int I2 = d.I(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, Boolean.valueOf(aVar2.f7335b != 0));
                    unsafe.putInt(t11, j12, i20);
                    return I2;
                }
                break;
            case 59:
                if (i21 == 2) {
                    int G2 = d.G(bArr2, i18, aVar2);
                    int i27 = aVar2.f7334a;
                    if (i27 == 0) {
                        unsafe.putObject(t11, j11, "");
                    } else if ((i15 & 536870912) == 0 || i0.e(bArr2, G2, G2 + i27)) {
                        unsafe.putObject(t11, j11, new String(bArr2, G2, i27, p.f7415a));
                        G2 += i27;
                    } else {
                        throw InvalidProtocolBufferException.b();
                    }
                    unsafe.putInt(t11, j12, i20);
                    return G2;
                }
                break;
            case 60:
                if (i21 == 2) {
                    Object B = B(t11, i20, i22);
                    int L = d.L(B, p(i22), bArr, i10, i11, aVar);
                    V(t11, i20, i22, B);
                    return L;
                }
                break;
            case 61:
                if (i21 == 2) {
                    int b10 = d.b(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, aVar2.f7336c);
                    unsafe.putInt(t11, j12, i20);
                    return b10;
                }
                break;
            case 63:
                if (i21 == 0) {
                    int G3 = d.G(bArr2, i18, aVar2);
                    int i28 = aVar2.f7334a;
                    p.b n10 = n(i22);
                    if (n10 == null || n10.a()) {
                        unsafe.putObject(t11, j11, Integer.valueOf(i28));
                        unsafe.putInt(t11, j12, i20);
                    } else {
                        q(t10).c(i19, Long.valueOf((long) i28));
                    }
                    return G3;
                }
                break;
            case 66:
                if (i21 == 0) {
                    int G4 = d.G(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, Integer.valueOf(f.b(aVar2.f7334a)));
                    unsafe.putInt(t11, j12, i20);
                    return G4;
                }
                break;
            case 67:
                if (i21 == 0) {
                    int I3 = d.I(bArr2, i18, aVar2);
                    unsafe.putObject(t11, j11, Long.valueOf(f.c(aVar2.f7335b)));
                    unsafe.putInt(t11, j12, i20);
                    return I3;
                }
                break;
            case 68:
                if (i21 == 3) {
                    Object B2 = B(t11, i20, i22);
                    int K = d.K(B2, p(i22), bArr, i10, i11, (i19 & -8) | 4, aVar);
                    V(t11, i20, i22, B2);
                    return K;
                }
                break;
        }
        return i18;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0371, code lost:
        if (r0 != r15) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x03bf, code lost:
        if (r0 != r15) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03db, code lost:
        r8 = r32;
        r7 = r34;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0276, code lost:
        r27 = r6;
        r6 = r24 | r22;
        r0 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0296, code lost:
        r0 = r6 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02b1, code lost:
        r0 = r6 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02b3, code lost:
        r6 = r24 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02b6, code lost:
        r1 = r34;
        r3 = r8;
        r4 = r10;
        r2 = r13;
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02bf, code lost:
        r7 = r34;
        r2 = r6;
        r17 = r8;
        r26 = r9;
        r8 = r13;
        r19 = r16;
        r20 = r24;
        r16 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x0410  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int J(T r30, byte[] r31, int r32, int r33, int r34, com.google.crypto.tink.shaded.protobuf.d.a r35) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r35
            l(r30)
            sun.misc.Unsafe r9 = f7431s
            r0 = r32
            r1 = r34
            r2 = 0
            r3 = -1
            r4 = 0
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x001a:
            if (r0 >= r13) goto L_0x042a
            int r2 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x0029
            int r0 = com.google.crypto.tink.shaded.protobuf.d.F(r0, r12, r2, r11)
            int r2 = r11.f7334a
            goto L_0x002e
        L_0x0029:
            r27 = r2
            r2 = r0
            r0 = r27
        L_0x002e:
            int r8 = r2 >>> 3
            r7 = r2 & 7
            r10 = 3
            if (r8 <= r3) goto L_0x0046
            int r4 = r4 / r10
            int r3 = r15.f7434c
            if (r8 < r3) goto L_0x0043
            int r3 = r15.f7435d
            if (r8 > r3) goto L_0x0043
            int r3 = r15.T(r8, r4)
            goto L_0x0044
        L_0x0043:
            r3 = -1
        L_0x0044:
            r4 = 0
            goto L_0x0056
        L_0x0046:
            int r3 = r15.f7434c
            if (r8 < r3) goto L_0x0054
            int r3 = r15.f7435d
            if (r8 > r3) goto L_0x0054
            r4 = 0
            int r3 = r15.T(r8, r4)
            goto L_0x0056
        L_0x0054:
            r4 = 0
            r3 = -1
        L_0x0056:
            r10 = -1
            if (r3 != r10) goto L_0x006c
            r7 = r1
            r16 = r4
            r19 = r16
            r23 = r5
            r20 = r6
            r17 = r8
            r26 = r9
            r18 = r10
            r8 = r2
        L_0x0069:
            r2 = r0
            goto L_0x03e1
        L_0x006c:
            int[] r1 = r15.f7432a
            int r17 = r3 + 1
            r10 = r1[r17]
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r10 & r17
            int r13 = r17 >>> 20
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r10 & r16
            r19 = r10
            long r10 = (long) r4
            r4 = 17
            r20 = r0
            if (r13 > r4) goto L_0x02d1
            int r4 = r3 + 2
            r1 = r1[r4]
            int r4 = r1 >>> 20
            r0 = 1
            int r22 = r0 << r4
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r4
            if (r1 == r5) goto L_0x00a3
            if (r5 == r4) goto L_0x009b
            long r4 = (long) r5
            r9.putInt(r14, r4, r6)
        L_0x009b:
            long r4 = (long) r1
            int r6 = r9.getInt(r14, r4)
            r23 = r1
            goto L_0x00a5
        L_0x00a3:
            r23 = r5
        L_0x00a5:
            r24 = r6
            r1 = 5
            switch(r13) {
                case 0: goto L_0x0299;
                case 1: goto L_0x027e;
                case 2: goto L_0x0259;
                case 3: goto L_0x0259;
                case 4: goto L_0x023d;
                case 5: goto L_0x0220;
                case 6: goto L_0x0206;
                case 7: goto L_0x01df;
                case 8: goto L_0x01b7;
                case 9: goto L_0x0190;
                case 10: goto L_0x0173;
                case 11: goto L_0x023d;
                case 12: goto L_0x013a;
                case 13: goto L_0x0206;
                case 14: goto L_0x0220;
                case 15: goto L_0x011a;
                case 16: goto L_0x00f2;
                case 17: goto L_0x00b8;
                default: goto L_0x00ab;
            }
        L_0x00ab:
            r11 = r35
            r13 = r2
            r10 = r3
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02bf
        L_0x00b8:
            r4 = 3
            if (r7 != r4) goto L_0x00e5
            java.lang.Object r7 = r15.A(r3, r14)
            int r0 = r8 << 3
            r5 = r0 | 4
            com.google.crypto.tink.shaded.protobuf.c0 r1 = r15.p(r3)
            r6 = r20
            r0 = r7
            r13 = r2
            r2 = r31
            r10 = r3
            r3 = r6
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r33
            r6 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.d.K(r0, r1, r2, r3, r4, r5, r6)
            r15.U(r10, r14, r7)
            r6 = r24 | r22
            r11 = r35
            goto L_0x031e
        L_0x00e5:
            r13 = r2
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r11 = r35
            r10 = r3
            goto L_0x02bf
        L_0x00f2:
            r13 = r2
            r4 = r3
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != 0) goto L_0x0115
            r2 = r10
            r11 = r35
            int r6 = com.google.crypto.tink.shaded.protobuf.d.I(r12, r6, r11)
            long r0 = r11.f7335b
            long r19 = com.google.crypto.tink.shaded.protobuf.f.c(r0)
            r0 = r9
            r1 = r30
            r10 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x0276
        L_0x0115:
            r11 = r35
            r10 = r4
            goto L_0x02bf
        L_0x011a:
            r13 = r2
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != 0) goto L_0x02bf
            int r0 = com.google.crypto.tink.shaded.protobuf.d.G(r12, r6, r11)
            int r1 = r11.f7334a
            int r1 = com.google.crypto.tink.shaded.protobuf.f.b(r1)
            r9.putInt(r14, r2, r1)
            goto L_0x02b3
        L_0x013a:
            r13 = r2
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != 0) goto L_0x02bf
            int r0 = com.google.crypto.tink.shaded.protobuf.d.G(r12, r6, r11)
            int r1 = r11.f7334a
            com.google.crypto.tink.shaded.protobuf.p$b r4 = r15.n(r10)
            if (r4 == 0) goto L_0x016e
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x015e
            goto L_0x016e
        L_0x015e:
            com.google.crypto.tink.shaded.protobuf.h0 r2 = q(r30)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.c(r13, r1)
            r6 = r24
            goto L_0x02b6
        L_0x016e:
            r9.putInt(r14, r2, r1)
            goto L_0x02b3
        L_0x0173:
            r13 = r2
            r6 = r20
            r0 = 2
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != r0) goto L_0x02bf
            int r0 = com.google.crypto.tink.shaded.protobuf.d.b(r12, r6, r11)
            java.lang.Object r1 = r11.f7336c
            r9.putObject(r14, r2, r1)
            goto L_0x02b3
        L_0x0190:
            r11 = r35
            r13 = r2
            r10 = r3
            r6 = r20
            r0 = 2
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 != r0) goto L_0x02bf
            java.lang.Object r7 = r15.A(r10, r14)
            com.google.crypto.tink.shaded.protobuf.c0 r1 = r15.p(r10)
            r0 = r7
            r2 = r31
            r3 = r6
            r4 = r33
            r5 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.d.L(r0, r1, r2, r3, r4, r5)
            r15.U(r10, r14, r7)
            goto L_0x02b3
        L_0x01b7:
            r13 = r2
            r6 = r20
            r0 = 2
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != r0) goto L_0x02bf
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r19 & r0
            if (r0 != 0) goto L_0x01d4
            int r0 = com.google.crypto.tink.shaded.protobuf.d.A(r12, r6, r11)
            goto L_0x01d8
        L_0x01d4:
            int r0 = com.google.crypto.tink.shaded.protobuf.d.D(r12, r6, r11)
        L_0x01d8:
            java.lang.Object r1 = r11.f7336c
            r9.putObject(r14, r2, r1)
            goto L_0x02b3
        L_0x01df:
            r13 = r2
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != 0) goto L_0x02bf
            int r1 = com.google.crypto.tink.shaded.protobuf.d.I(r12, r6, r11)
            long r4 = r11.f7335b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x01fe
            r4 = r0
            goto L_0x0200
        L_0x01fe:
            r4 = r16
        L_0x0200:
            j9.c0.q(r14, r2, r4)
            r0 = r1
            goto L_0x02b3
        L_0x0206:
            r13 = r2
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != r1) goto L_0x02bf
            int r0 = com.google.crypto.tink.shaded.protobuf.d.g(r6, r12)
            r9.putInt(r14, r2, r0)
            goto L_0x0296
        L_0x0220:
            r13 = r2
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != r0) goto L_0x02bf
            long r4 = com.google.crypto.tink.shaded.protobuf.d.i(r6, r12)
            r0 = r9
            r1 = r30
            r0.putLong(r1, r2, r4)
            goto L_0x02b1
        L_0x023d:
            r13 = r2
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != 0) goto L_0x02bf
            int r0 = com.google.crypto.tink.shaded.protobuf.d.G(r12, r6, r11)
            int r1 = r11.f7334a
            r9.putInt(r14, r2, r1)
            goto L_0x02b3
        L_0x0259:
            r13 = r2
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != 0) goto L_0x02bf
            int r6 = com.google.crypto.tink.shaded.protobuf.d.I(r12, r6, r11)
            long r4 = r11.f7335b
            r0 = r9
            r1 = r30
            r0.putLong(r1, r2, r4)
        L_0x0276:
            r0 = r24 | r22
            r27 = r6
            r6 = r0
            r0 = r27
            goto L_0x02b6
        L_0x027e:
            r13 = r2
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != r1) goto L_0x02bf
            float r0 = com.google.crypto.tink.shaded.protobuf.d.k(r6, r12)
            j9.c0.v(r14, r2, r0)
        L_0x0296:
            int r0 = r6 + 4
            goto L_0x02b3
        L_0x0299:
            r13 = r2
            r6 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            if (r7 != r0) goto L_0x02bf
            double r0 = com.google.crypto.tink.shaded.protobuf.d.d(r6, r12)
            j9.c0.u(r14, r2, r0)
        L_0x02b1:
            int r0 = r6 + 8
        L_0x02b3:
            r1 = r24 | r22
            r6 = r1
        L_0x02b6:
            r1 = r34
            r3 = r8
            r4 = r10
            r2 = r13
            r5 = r23
            goto L_0x0325
        L_0x02bf:
            r7 = r34
            r2 = r6
            r17 = r8
            r26 = r9
            r8 = r13
            r19 = r16
            r20 = r24
            r18 = -1
            r16 = r10
            goto L_0x03e1
        L_0x02d1:
            r4 = r2
            r1 = r20
            r16 = 0
            r17 = 1048575(0xfffff, float:1.469367E-39)
            r27 = r10
            r11 = r35
            r10 = r3
            r2 = r27
            r0 = 27
            if (r13 != r0) goto L_0x033c
            r0 = 2
            if (r7 != r0) goto L_0x0329
            java.lang.Object r0 = r9.getObject(r14, r2)
            com.google.crypto.tink.shaded.protobuf.p$c r0 = (com.google.crypto.tink.shaded.protobuf.p.c) r0
            boolean r7 = r0.f()
            if (r7 != 0) goto L_0x0305
            int r7 = r0.size()
            if (r7 != 0) goto L_0x02fc
            r7 = 10
            goto L_0x02fe
        L_0x02fc:
            int r7 = r7 * 2
        L_0x02fe:
            com.google.crypto.tink.shaded.protobuf.p$c r0 = r0.b(r7)
            r9.putObject(r14, r2, r0)
        L_0x0305:
            r7 = r0
            com.google.crypto.tink.shaded.protobuf.c0 r0 = r15.p(r10)
            r3 = r1
            r1 = r4
            r2 = r31
            r13 = r4
            r4 = r33
            r23 = r5
            r5 = r7
            r20 = r6
            r6 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.d.o(r0, r1, r2, r3, r4, r5, r6)
            r6 = r20
        L_0x031e:
            r5 = r23
            r1 = r34
            r3 = r8
            r4 = r10
            r2 = r13
        L_0x0325:
            r13 = r33
            goto L_0x001a
        L_0x0329:
            r23 = r5
            r20 = r6
            r15 = r1
            r32 = r4
            r17 = r8
            r26 = r9
            r19 = r16
            r18 = -1
            r16 = r10
            goto L_0x038c
        L_0x033c:
            r23 = r5
            r20 = r6
            r5 = r1
            r6 = r4
            r0 = 49
            if (r13 > r0) goto L_0x0374
            r4 = r19
            long r0 = (long) r4
            r21 = r0
            r0 = r29
            r1 = r30
            r24 = r2
            r2 = r31
            r3 = r5
            r4 = r33
            r15 = r5
            r5 = r6
            r32 = r6
            r6 = r8
            r18 = -1
            r17 = r8
            r8 = r10
            r26 = r9
            r19 = r16
            r16 = r10
            r9 = r21
            r11 = r13
            r12 = r24
            r14 = r35
            int r0 = r0.L(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x03db
            goto L_0x03c1
        L_0x0374:
            r24 = r2
            r15 = r5
            r32 = r6
            r17 = r8
            r26 = r9
            r4 = r19
            r18 = -1
            r19 = r16
            r16 = r10
            r0 = 50
            if (r13 != r0) goto L_0x03a6
            r0 = 2
            if (r7 == r0) goto L_0x0392
        L_0x038c:
            r8 = r32
            r7 = r34
            r2 = r15
            goto L_0x03e1
        L_0x0392:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r16
            r6 = r24
            r8 = r35
            r0.H(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x03a6:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r8 = r4
            r4 = r33
            r5 = r32
            r6 = r17
            r9 = r13
            r10 = r24
            r12 = r16
            r13 = r35
            int r0 = r0.I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x03db
        L_0x03c1:
            r15 = r29
            r14 = r30
            r12 = r31
            r2 = r32
            r13 = r33
            r1 = r34
            r11 = r35
        L_0x03cf:
            r4 = r16
            r3 = r17
            r6 = r20
            r5 = r23
            r9 = r26
            goto L_0x001a
        L_0x03db:
            r8 = r32
            r7 = r34
            goto L_0x0069
        L_0x03e1:
            if (r8 != r7) goto L_0x03f0
            if (r7 == 0) goto L_0x03f0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r29
            r6 = r2
            r0 = r20
            r5 = r23
            goto L_0x0439
        L_0x03f0:
            r9 = r29
            boolean r0 = r9.f7437f
            r10 = r35
            if (r0 == 0) goto L_0x0410
            com.google.crypto.tink.shaded.protobuf.i r0 = r10.f7337d
            com.google.crypto.tink.shaded.protobuf.i r1 = com.google.crypto.tink.shaded.protobuf.i.a()
            if (r0 == r1) goto L_0x0410
            com.google.crypto.tink.shaded.protobuf.x r5 = r9.f7436e
            r0 = r8
            r1 = r31
            r3 = r33
            r4 = r30
            r6 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.d.f(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x041f
        L_0x0410:
            com.google.crypto.tink.shaded.protobuf.h0 r4 = q(r30)
            r0 = r8
            r1 = r31
            r3 = r33
            r5 = r35
            int r0 = com.google.crypto.tink.shaded.protobuf.d.E(r0, r1, r2, r3, r4, r5)
        L_0x041f:
            r14 = r30
            r12 = r31
            r13 = r33
            r1 = r7
            r2 = r8
            r15 = r9
            r11 = r10
            goto L_0x03cf
        L_0x042a:
            r23 = r5
            r20 = r6
            r26 = r9
            r9 = r15
            r6 = r0
            r7 = r1
            r8 = r2
            r0 = r20
            r1 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0439:
            if (r5 == r1) goto L_0x0444
            long r1 = (long) r5
            r10 = r30
            r3 = r26
            r3.putInt(r10, r1, r0)
            goto L_0x0446
        L_0x0444:
            r10 = r30
        L_0x0446:
            r11 = 0
            int r0 = r9.f7442k
            r12 = r0
        L_0x044a:
            int r0 = r9.f7443l
            if (r12 >= r0) goto L_0x0461
            int[] r0 = r9.f7441j
            r2 = r0[r12]
            com.google.crypto.tink.shaded.protobuf.g0<?, ?> r4 = r9.f7446o
            r0 = r29
            r1 = r30
            r3 = r11
            r5 = r30
            r0.m(r1, r2, r3, r4, r5)
            int r12 = r12 + 1
            goto L_0x044a
        L_0x0461:
            if (r7 != 0) goto L_0x046d
            r0 = r33
            if (r6 != r0) goto L_0x0468
            goto L_0x0473
        L_0x0468:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f()
            throw r0
        L_0x046d:
            r0 = r33
            if (r6 > r0) goto L_0x0474
            if (r8 != r7) goto L_0x0474
        L_0x0473:
            return r6
        L_0x0474:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.z.J(java.lang.Object, byte[], int, int, int, com.google.crypto.tink.shaded.protobuf.d$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v2, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a4, code lost:
        if (r0 != r15) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02ed, code lost:
        if (r0 != r15) goto L_0x02ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ef, code lost:
        r2 = r18;
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ad, code lost:
        r23 = r32;
        r13 = r2;
        r10 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012c, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x012f, code lost:
        r4 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0195, code lost:
        r10 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c2, code lost:
        r0 = r18 | r21;
        r5 = r6;
        r19 = r8;
        r18 = r13;
        r6 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01db, code lost:
        r0 = r10 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01ed, code lost:
        r0 = r10 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01ef, code lost:
        r1 = r18 | r21;
        r19 = r4;
        r5 = r6;
        r18 = r13;
        r6 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f9, code lost:
        r28 = r4;
        r2 = r10;
        r10 = r13;
        r25 = r18;
        r17 = 0;
        r22 = -1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void K(java.lang.Object r30, byte[] r31, int r32, int r33, com.google.crypto.tink.shaded.protobuf.d.a r34) {
        /*
            r29 = this;
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            l(r30)
            sun.misc.Unsafe r9 = f7431s
            r10 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r7 = -1
            r0 = r32
            r1 = r7
            r5 = r8
            r2 = r10
            r6 = r2
        L_0x001a:
            if (r0 >= r13) goto L_0x0324
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.google.crypto.tink.shaded.protobuf.d.F(r0, r12, r3, r11)
            int r3 = r11.f7334a
            r4 = r0
            r16 = r3
            goto L_0x002f
        L_0x002c:
            r16 = r0
            r4 = r3
        L_0x002f:
            int r3 = r16 >>> 3
            r0 = r16 & 7
            if (r3 <= r1) goto L_0x0044
            int r2 = r2 / 3
            int r1 = r15.f7434c
            if (r3 < r1) goto L_0x0051
            int r1 = r15.f7435d
            if (r3 > r1) goto L_0x0051
            int r1 = r15.T(r3, r2)
            goto L_0x0052
        L_0x0044:
            int r1 = r15.f7434c
            if (r3 < r1) goto L_0x0051
            int r1 = r15.f7435d
            if (r3 > r1) goto L_0x0051
            int r1 = r15.T(r3, r10)
            goto L_0x0052
        L_0x0051:
            r1 = r7
        L_0x0052:
            r2 = r1
            if (r2 != r7) goto L_0x0063
            r23 = r3
            r2 = r4
            r25 = r6
            r22 = r7
            r28 = r9
            r17 = r10
            r6 = r5
            goto L_0x02f9
        L_0x0063:
            int[] r1 = r15.f7432a
            int r17 = r2 + 1
            r10 = r1[r17]
            r17 = 267386880(0xff00000, float:2.3665827E-29)
            r17 = r10 & r17
            int r13 = r17 >>> 20
            r7 = r10 & r8
            r18 = r9
            long r8 = (long) r7
            r7 = 17
            r32 = r3
            if (r13 > r7) goto L_0x0205
            int r7 = r2 + 2
            r1 = r1[r7]
            int r7 = r1 >>> 20
            r3 = 1
            int r7 = r3 << r7
            r21 = r7
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r7
            r19 = r4
            if (r1 == r5) goto L_0x00a4
            if (r5 == r7) goto L_0x0096
            long r3 = (long) r5
            r5 = r18
            r5.putInt(r14, r3, r6)
            goto L_0x0098
        L_0x0096:
            r5 = r18
        L_0x0098:
            if (r1 == r7) goto L_0x009f
            long r3 = (long) r1
            int r6 = r5.getInt(r14, r3)
        L_0x009f:
            r4 = r5
            r18 = r6
            r6 = r1
            goto L_0x00a9
        L_0x00a4:
            r4 = r18
            r18 = r6
            r6 = r5
        L_0x00a9:
            r1 = 5
            switch(r13) {
                case 0: goto L_0x01de;
                case 1: goto L_0x01cd;
                case 2: goto L_0x01a9;
                case 3: goto L_0x01a9;
                case 4: goto L_0x0198;
                case 5: goto L_0x017b;
                case 6: goto L_0x016a;
                case 7: goto L_0x014f;
                case 8: goto L_0x0132;
                case 9: goto L_0x010c;
                case 10: goto L_0x00f9;
                case 11: goto L_0x0198;
                case 12: goto L_0x00e7;
                case 13: goto L_0x016a;
                case 14: goto L_0x017b;
                case 15: goto L_0x00d1;
                case 16: goto L_0x00b4;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            r23 = r32
            r13 = r2
            r10 = r19
            goto L_0x01f9
        L_0x00b4:
            if (r0 != 0) goto L_0x00ad
            r5 = r19
            int r10 = com.google.crypto.tink.shaded.protobuf.d.I(r12, r5, r11)
            long r0 = r11.f7335b
            long r19 = com.google.crypto.tink.shaded.protobuf.f.c(r0)
            r0 = r4
            r1 = r30
            r23 = r32
            r13 = r2
            r2 = r8
            r8 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
            goto L_0x01c2
        L_0x00d1:
            r23 = r32
            r13 = r2
            r10 = r4
            r5 = r19
            if (r0 != 0) goto L_0x012f
            int r0 = com.google.crypto.tink.shaded.protobuf.d.G(r12, r5, r11)
            int r1 = r11.f7334a
            int r1 = com.google.crypto.tink.shaded.protobuf.f.b(r1)
            r10.putInt(r14, r8, r1)
            goto L_0x012c
        L_0x00e7:
            r23 = r32
            r13 = r2
            r10 = r4
            r5 = r19
            if (r0 != 0) goto L_0x012f
            int r0 = com.google.crypto.tink.shaded.protobuf.d.G(r12, r5, r11)
            int r1 = r11.f7334a
            r10.putInt(r14, r8, r1)
            goto L_0x012c
        L_0x00f9:
            r23 = r32
            r13 = r2
            r10 = r4
            r5 = r19
            r1 = 2
            if (r0 != r1) goto L_0x012f
            int r0 = com.google.crypto.tink.shaded.protobuf.d.b(r12, r5, r11)
            java.lang.Object r1 = r11.f7336c
            r10.putObject(r14, r8, r1)
            goto L_0x012c
        L_0x010c:
            r23 = r32
            r13 = r2
            r10 = r4
            r5 = r19
            r1 = 2
            if (r0 != r1) goto L_0x012f
            java.lang.Object r8 = r15.A(r13, r14)
            com.google.crypto.tink.shaded.protobuf.c0 r1 = r15.p(r13)
            r0 = r8
            r2 = r31
            r3 = r5
            r4 = r33
            r5 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.d.L(r0, r1, r2, r3, r4, r5)
            r15.U(r13, r14, r8)
        L_0x012c:
            r4 = r10
            goto L_0x01ef
        L_0x012f:
            r4 = r10
            goto L_0x0195
        L_0x0132:
            r23 = r32
            r13 = r2
            r5 = r19
            r1 = 2
            if (r0 != r1) goto L_0x0195
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r10
            if (r0 != 0) goto L_0x0144
            int r0 = com.google.crypto.tink.shaded.protobuf.d.A(r12, r5, r11)
            goto L_0x0148
        L_0x0144:
            int r0 = com.google.crypto.tink.shaded.protobuf.d.D(r12, r5, r11)
        L_0x0148:
            java.lang.Object r1 = r11.f7336c
            r4.putObject(r14, r8, r1)
            goto L_0x01ef
        L_0x014f:
            r23 = r32
            r13 = r2
            r5 = r19
            if (r0 != 0) goto L_0x0195
            int r0 = com.google.crypto.tink.shaded.protobuf.d.I(r12, r5, r11)
            long r1 = r11.f7335b
            r19 = 0
            int r1 = (r1 > r19 ? 1 : (r1 == r19 ? 0 : -1))
            if (r1 == 0) goto L_0x0164
            r3 = 1
            goto L_0x0165
        L_0x0164:
            r3 = 0
        L_0x0165:
            j9.c0.q(r14, r8, r3)
            goto L_0x01ef
        L_0x016a:
            r23 = r32
            r13 = r2
            r5 = r19
            if (r0 != r1) goto L_0x0195
            int r0 = com.google.crypto.tink.shaded.protobuf.d.g(r5, r12)
            r4.putInt(r14, r8, r0)
            r10 = r5
            goto L_0x01db
        L_0x017b:
            r23 = r32
            r13 = r2
            r5 = r19
            r1 = 1
            if (r0 != r1) goto L_0x0195
            long r19 = com.google.crypto.tink.shaded.protobuf.d.i(r5, r12)
            r0 = r4
            r1 = r30
            r2 = r8
            r8 = r4
            r10 = r5
            r4 = r19
            r0.putLong(r1, r2, r4)
            r4 = r8
            goto L_0x01ed
        L_0x0195:
            r10 = r5
            goto L_0x01f9
        L_0x0198:
            r23 = r32
            r13 = r2
            r10 = r19
            if (r0 != 0) goto L_0x01f9
            int r0 = com.google.crypto.tink.shaded.protobuf.d.G(r12, r10, r11)
            int r1 = r11.f7334a
            r4.putInt(r14, r8, r1)
            goto L_0x01ef
        L_0x01a9:
            r23 = r32
            r13 = r2
            r10 = r19
            if (r0 != 0) goto L_0x01f9
            int r10 = com.google.crypto.tink.shaded.protobuf.d.I(r12, r10, r11)
            long r2 = r11.f7335b
            r0 = r4
            r1 = r30
            r19 = r2
            r2 = r8
            r8 = r4
            r4 = r19
            r0.putLong(r1, r2, r4)
        L_0x01c2:
            r0 = r18 | r21
            r5 = r6
            r19 = r8
            r18 = r13
            r6 = r0
            r0 = r10
            goto L_0x024f
        L_0x01cd:
            r23 = r32
            r13 = r2
            r10 = r19
            if (r0 != r1) goto L_0x01f9
            float r0 = com.google.crypto.tink.shaded.protobuf.d.k(r10, r12)
            j9.c0.v(r14, r8, r0)
        L_0x01db:
            int r0 = r10 + 4
            goto L_0x01ef
        L_0x01de:
            r23 = r32
            r13 = r2
            r10 = r19
            r1 = 1
            if (r0 != r1) goto L_0x01f9
            double r0 = com.google.crypto.tink.shaded.protobuf.d.d(r10, r12)
            j9.c0.u(r14, r8, r0)
        L_0x01ed:
            int r0 = r10 + 8
        L_0x01ef:
            r1 = r18 | r21
            r19 = r4
            r5 = r6
            r18 = r13
            r6 = r1
            goto L_0x024f
        L_0x01f9:
            r28 = r4
            r2 = r10
            r10 = r13
            r25 = r18
            r17 = 0
            r22 = -1
            goto L_0x02f9
        L_0x0205:
            r23 = r32
            r3 = r2
            r2 = r4
            r4 = r18
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r13 != r1) goto L_0x026b
            r1 = 2
            if (r0 != r1) goto L_0x025c
            java.lang.Object r0 = r4.getObject(r14, r8)
            com.google.crypto.tink.shaded.protobuf.p$c r0 = (com.google.crypto.tink.shaded.protobuf.p.c) r0
            boolean r1 = r0.f()
            if (r1 != 0) goto L_0x0233
            int r1 = r0.size()
            if (r1 != 0) goto L_0x022a
            r1 = 10
            goto L_0x022c
        L_0x022a:
            int r1 = r1 * 2
        L_0x022c:
            com.google.crypto.tink.shaded.protobuf.p$c r0 = r0.b(r1)
            r4.putObject(r14, r8, r0)
        L_0x0233:
            r8 = r0
            com.google.crypto.tink.shaded.protobuf.c0 r0 = r15.p(r3)
            r1 = r16
            r9 = r2
            r2 = r31
            r18 = r3
            r3 = r9
            r19 = r4
            r4 = r33
            r10 = r5
            r5 = r8
            r8 = r6
            r6 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.d.o(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
            r5 = r10
        L_0x024f:
            r13 = r33
            r8 = r7
            r2 = r18
            r9 = r19
            r1 = r23
            r7 = -1
            r10 = 0
            goto L_0x001a
        L_0x025c:
            r18 = r3
            r15 = r2
            r28 = r4
            r24 = r5
            r25 = r6
            r17 = 0
            r22 = -1
            goto L_0x02be
        L_0x026b:
            r18 = r3
            r19 = r4
            r4 = r2
            r1 = 49
            if (r13 > r1) goto L_0x02a9
            long r2 = (long) r10
            r10 = r0
            r0 = r29
            r1 = r30
            r20 = r2
            r2 = r31
            r3 = r4
            r15 = r4
            r4 = r33
            r24 = r5
            r5 = r16
            r25 = r6
            r6 = r23
            r17 = r7
            r22 = -1
            r7 = r10
            r26 = r8
            r9 = r17
            r8 = r18
            r28 = r19
            r17 = 0
            r9 = r20
            r11 = r13
            r12 = r26
            r14 = r34
            int r0 = r0.L(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x02a7
            goto L_0x02ef
        L_0x02a7:
            r4 = r0
            goto L_0x02f4
        L_0x02a9:
            r7 = r0
            r15 = r4
            r24 = r5
            r25 = r6
            r26 = r8
            r28 = r19
            r17 = 0
            r22 = -1
            r0 = 50
            if (r13 != r0) goto L_0x02d4
            r0 = 2
            if (r7 == r0) goto L_0x02c0
        L_0x02be:
            r4 = r15
            goto L_0x02f4
        L_0x02c0:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r18
            r6 = r26
            r8 = r34
            r0.H(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x02d4:
            r0 = r29
            r1 = r30
            r2 = r31
            r3 = r15
            r4 = r33
            r5 = r16
            r6 = r23
            r8 = r10
            r9 = r13
            r10 = r26
            r12 = r18
            r13 = r34
            int r0 = r0.I(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x02a7
        L_0x02ef:
            r2 = r18
            r5 = r24
            goto L_0x030b
        L_0x02f4:
            r2 = r4
            r10 = r18
            r6 = r24
        L_0x02f9:
            com.google.crypto.tink.shaded.protobuf.h0 r4 = q(r30)
            r0 = r16
            r1 = r31
            r3 = r33
            r5 = r34
            int r0 = com.google.crypto.tink.shaded.protobuf.d.E(r0, r1, r2, r3, r4, r5)
            r5 = r6
            r2 = r10
        L_0x030b:
            r6 = r25
            r15 = r29
            r14 = r30
            r12 = r31
            r13 = r33
            r11 = r34
            r10 = r17
            r7 = r22
            r1 = r23
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x001a
        L_0x0324:
            r25 = r6
            r1 = r8
            r28 = r9
            if (r5 == r1) goto L_0x0335
            long r1 = (long) r5
            r3 = r30
            r6 = r25
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0335:
            r1 = r33
            if (r0 != r1) goto L_0x033a
            return
        L_0x033a:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.z.K(java.lang.Object, byte[], int, int, com.google.crypto.tink.shaded.protobuf.d$a):void");
    }

    public final int L(T t10, byte[] bArr, int i10, int i11, int i12, int i13, int i14, int i15, long j10, int i16, long j11, d.a aVar) {
        int i17;
        T t11 = t10;
        byte[] bArr2 = bArr;
        int i18 = i10;
        int i19 = i14;
        int i20 = i15;
        long j12 = j11;
        d.a aVar2 = aVar;
        Unsafe unsafe = f7431s;
        p.c cVar = (p.c) unsafe.getObject(t10, j12);
        if (!cVar.f()) {
            int size = cVar.size();
            cVar = cVar.b(size == 0 ? 10 : size * 2);
            unsafe.putObject(t10, j12, cVar);
        }
        switch (i16) {
            case 18:
            case 35:
                if (i19 == 2) {
                    return d.q(bArr, i18, cVar, aVar2);
                }
                if (i19 == 1) {
                    return d.e(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 19:
            case 36:
                if (i19 == 2) {
                    return d.t(bArr, i18, cVar, aVar2);
                }
                if (i19 == 5) {
                    return d.l(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i19 == 2) {
                    return d.x(bArr, i18, cVar, aVar2);
                }
                if (i19 == 0) {
                    return d.J(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i19 == 2) {
                    return d.w(bArr, i18, cVar, aVar2);
                }
                if (i19 == 0) {
                    return d.H(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i19 == 2) {
                    return d.s(bArr, i18, cVar, aVar2);
                }
                if (i19 == 1) {
                    return d.j(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i19 == 2) {
                    return d.r(bArr, i18, cVar, aVar2);
                }
                if (i19 == 5) {
                    return d.h(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 25:
            case 42:
                if (i19 == 2) {
                    return d.p(bArr, i18, cVar, aVar2);
                }
                if (i19 == 0) {
                    return d.a(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 26:
                if (i19 == 2) {
                    if ((j10 & 536870912) == 0) {
                        return d.B(i12, bArr, i10, i11, cVar, aVar);
                    }
                    return d.C(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 27:
                if (i19 == 2) {
                    return d.o(p(i20), i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 28:
                if (i19 == 2) {
                    return d.c(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 30:
            case 44:
                if (i19 == 2) {
                    i17 = d.w(bArr, i18, cVar, aVar2);
                } else if (i19 == 0) {
                    i17 = d.H(i12, bArr, i10, i11, cVar, aVar);
                }
                d0.z(t10, i13, cVar, n(i20), null, this.f7446o);
                return i17;
            case 33:
            case 47:
                if (i19 == 2) {
                    return d.u(bArr, i18, cVar, aVar2);
                }
                if (i19 == 0) {
                    return d.y(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 34:
            case 48:
                if (i19 == 2) {
                    return d.v(bArr, i18, cVar, aVar2);
                }
                if (i19 == 0) {
                    return d.z(i12, bArr, i10, i11, cVar, aVar);
                }
                break;
            case 49:
                if (i19 == 3) {
                    return d.m(p(i20), i12, bArr, i10, i11, cVar, aVar);
                }
                break;
        }
        return i18;
    }

    public final <E> void M(Object obj, long j10, y yVar, c0<E> c0Var, i iVar) {
        int w9;
        List c10 = this.f7445n.c(obj, j10);
        g gVar = (g) yVar;
        int i10 = gVar.f7381b;
        if ((i10 & 7) == 3) {
            do {
                E b10 = c0Var.b();
                gVar.b(b10, c0Var, iVar);
                c0Var.c(b10);
                c10.add(b10);
                if (!gVar.f7380a.e() && gVar.f7383d == 0) {
                    w9 = gVar.f7380a.w();
                } else {
                    return;
                }
            } while (w9 == i10);
            gVar.f7383d = w9;
            return;
        }
        int i11 = InvalidProtocolBufferException.f7324b;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }

    public final <E> void N(Object obj, int i10, y yVar, c0<E> c0Var, i iVar) {
        int w9;
        List c10 = this.f7445n.c(obj, (long) (i10 & 1048575));
        g gVar = (g) yVar;
        int i11 = gVar.f7381b;
        if ((i11 & 7) == 2) {
            do {
                E b10 = c0Var.b();
                gVar.c(b10, c0Var, iVar);
                c0Var.c(b10);
                c10.add(b10);
                if (!gVar.f7380a.e() && gVar.f7383d == 0) {
                    w9 = gVar.f7380a.w();
                } else {
                    return;
                }
            } while (w9 == i11);
            gVar.f7383d = w9;
            return;
        }
        int i12 = InvalidProtocolBufferException.f7324b;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }

    public final void O(Object obj, int i10, y yVar) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            g gVar = (g) yVar;
            gVar.v(2);
            c0.y(obj, (long) (i10 & 1048575), gVar.f7380a.v());
        } else if (this.f7438g) {
            g gVar2 = (g) yVar;
            gVar2.v(2);
            c0.y(obj, (long) (i10 & 1048575), gVar2.f7380a.u());
        } else {
            c0.y(obj, (long) (i10 & 1048575), ((g) yVar).e());
        }
    }

    public final void P(Object obj, int i10, y yVar) {
        boolean z10;
        if ((536870912 & i10) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            ((g) yVar).r(this.f7445n.c(obj, (long) (i10 & 1048575)), true);
            return;
        }
        ((g) yVar).r(this.f7445n.c(obj, (long) (i10 & 1048575)), false);
    }

    public final void R(int i10, Object obj) {
        int i11 = this.f7432a[i10 + 2];
        long j10 = (long) (1048575 & i11);
        if (j10 != 1048575) {
            c0.w(obj, (1 << (i11 >>> 20)) | c0.m(obj, j10), j10);
        }
    }

    public final void S(T t10, int i10, int i11) {
        c0.w(t10, i10, (long) (this.f7432a[i11 + 2] & 1048575));
    }

    public final int T(int i10, int i11) {
        int length = (this.f7432a.length / 3) - 1;
        while (i11 <= length) {
            int i12 = (length + i11) >>> 1;
            int i13 = i12 * 3;
            int i14 = this.f7432a[i13];
            if (i10 == i14) {
                return i13;
            }
            if (i10 < i14) {
                length = i12 - 1;
            } else {
                i11 = i12 + 1;
            }
        }
        return -1;
    }

    public final void U(int i10, Object obj, Object obj2) {
        f7431s.putObject(obj, (long) (W(i10) & 1048575), obj2);
        R(i10, obj);
    }

    public final void V(T t10, int i10, int i11, Object obj) {
        f7431s.putObject(t10, (long) (W(i11) & 1048575), obj);
        S(t10, i10, i11);
    }

    public final int W(int i10) {
        return this.f7432a[i10 + 1];
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
    public final void X(java.lang.Object r18, j9.d r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f7437f
            if (r3 == 0) goto L_0x0021
            com.google.crypto.tink.shaded.protobuf.j<?> r3 = r0.f7447p
            com.google.crypto.tink.shaded.protobuf.l r3 = r3.c(r1)
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
            int[] r6 = r0.f7432a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f7431s
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002d:
            if (r10 >= r6) goto L_0x0498
            int r13 = r0.W(r10)
            int[] r14 = r0.f7432a
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
            com.google.crypto.tink.shaded.protobuf.j<?> r9 = r0.f7447p
            r9.a(r5)
            if (r15 < 0) goto L_0x0076
            com.google.crypto.tink.shaded.protobuf.j<?> r9 = r0.f7447p
            r9.j(r5)
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
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.c0 r8 = r0.p(r10)
            r2.h(r15, r8, r4)
            goto L_0x007e
        L_0x0093:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            long r13 = G(r1, r13)
            r2.p(r15, r13)
            goto L_0x007e
        L_0x00a1:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = F(r1, r13)
            r2.o(r15, r4)
            goto L_0x007e
        L_0x00af:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            long r13 = G(r1, r13)
            r2.n(r15, r13)
            goto L_0x007e
        L_0x00bd:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = F(r1, r13)
            r2.m(r15, r4)
            goto L_0x007e
        L_0x00cb:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = F(r1, r13)
            r2.d(r15, r4)
            goto L_0x007e
        L_0x00d9:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = F(r1, r13)
            r2.q(r15, r4)
            goto L_0x007e
        L_0x00e7:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            j9.c r4 = (j9.c) r4
            r2.b(r15, r4)
            goto L_0x007e
        L_0x00f7:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.c0 r8 = r0.p(r10)
            r2.k(r15, r8, r4)
            goto L_0x007e
        L_0x010a:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            Z(r15, r4, r2)
            goto L_0x007e
        L_0x0119:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = j9.c0.o(r1, r13)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.a(r15, r4)
            goto L_0x007e
        L_0x012e:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = F(r1, r13)
            r2.e(r15, r4)
            goto L_0x007e
        L_0x013d:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            long r13 = G(r1, r13)
            r2.f(r15, r13)
            goto L_0x007e
        L_0x014c:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            int r4 = F(r1, r13)
            r2.i(r15, r4)
            goto L_0x007e
        L_0x015b:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            long r13 = G(r1, r13)
            r2.r(r15, r13)
            goto L_0x007e
        L_0x016a:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            long r13 = G(r1, r13)
            r2.j(r15, r13)
            goto L_0x007e
        L_0x0179:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = j9.c0.o(r1, r13)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.g(r15, r4)
            goto L_0x007e
        L_0x018e:
            boolean r4 = r0.v(r1, r15, r10)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = j9.c0.o(r1, r13)
            java.lang.Double r4 = (java.lang.Double) r4
            double r13 = r4.doubleValue()
            r2.c(r15, r13)
            goto L_0x007e
        L_0x01a3:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.Y(r2, r15, r4, r10)
            goto L_0x007e
        L_0x01ac:
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.c0 r13 = r0.p(r10)
            com.google.crypto.tink.shaded.protobuf.d0.L(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01bf:
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.crypto.tink.shaded.protobuf.d0.S(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01cf:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.R(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01df:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.Q(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01ef:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.P(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01ff:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.H(r4, r8, r2, r15)
            goto L_0x007e
        L_0x020f:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.U(r4, r8, r2, r15)
            goto L_0x007e
        L_0x021f:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.E(r4, r8, r2, r15)
            goto L_0x007e
        L_0x022f:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.I(r4, r8, r2, r15)
            goto L_0x007e
        L_0x023f:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.J(r4, r8, r2, r15)
            goto L_0x007e
        L_0x024f:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.M(r4, r8, r2, r15)
            goto L_0x007e
        L_0x025f:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.V(r4, r8, r2, r15)
            goto L_0x007e
        L_0x026f:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.N(r4, r8, r2, r15)
            goto L_0x007e
        L_0x027f:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.K(r4, r8, r2, r15)
            goto L_0x007e
        L_0x028f:
            r15 = 1
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.G(r4, r8, r2, r15)
            goto L_0x007e
        L_0x029f:
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.crypto.tink.shaded.protobuf.d0.S(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02af:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.R(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02bf:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.Q(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02cf:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.P(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02df:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.H(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02ef:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.U(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x02ff:
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.F(r4, r8, r2)
            goto L_0x007e
        L_0x030e:
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.c0 r13 = r0.p(r10)
            com.google.crypto.tink.shaded.protobuf.d0.O(r4, r8, r2, r13)
            goto L_0x007e
        L_0x0321:
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.T(r4, r8, r2)
            goto L_0x007e
        L_0x0330:
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.crypto.tink.shaded.protobuf.d0.E(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x033f:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.I(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x034e:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.J(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x035d:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.M(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x036c:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.V(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x037b:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.N(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x038a:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.K(r4, r8, r2, r15)
            goto L_0x03a7
        L_0x0399:
            r15 = 0
            int[] r4 = r0.f7432a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.crypto.tink.shaded.protobuf.d0.G(r4, r8, r2, r15)
        L_0x03a7:
            r4 = r15
            goto L_0x0494
        L_0x03aa:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.c0 r13 = r0.p(r10)
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
            j9.c r8 = (j9.c) r8
            r2.b(r15, r8)
            goto L_0x0494
        L_0x0418:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.crypto.tink.shaded.protobuf.c0 r13 = r0.p(r10)
            r2.k(r15, r13, r8)
            goto L_0x0494
        L_0x0429:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            java.lang.Object r8 = r7.getObject(r1, r13)
            Z(r15, r8, r2)
            goto L_0x0494
        L_0x0435:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            boolean r8 = j9.c0.g(r1, r13)
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
            float r8 = j9.c0.l(r1, r13)
            r2.g(r15, r8)
            goto L_0x0494
        L_0x0489:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x0494
            double r13 = j9.c0.k(r1, r13)
            r2.c(r15, r13)
        L_0x0494:
            int r10 = r10 + 3
            goto L_0x002d
        L_0x0498:
            if (r5 == 0) goto L_0x04af
            com.google.crypto.tink.shaded.protobuf.j<?> r4 = r0.f7447p
            r4.j(r5)
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
            com.google.crypto.tink.shaded.protobuf.g0<?, ?> r3 = r0.f7446o
            com.google.crypto.tink.shaded.protobuf.h0 r1 = r3.g(r1)
            r3.s(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.z.X(java.lang.Object, j9.d):void");
    }

    public final void Y(j9.d dVar, int i10, Object obj, int i11) {
        if (obj != null) {
            this.f7448q.c(o(i11));
            w e10 = this.f7448q.e(obj);
            dVar.f11749a.getClass();
            Iterator it = e10.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                dVar.f11749a.t0(i10, 2);
                entry.getKey();
                entry.getValue();
                throw null;
            }
        }
    }

    public final void a(T t10, T t11) {
        l(t10);
        t11.getClass();
        for (int i10 = 0; i10 < this.f7432a.length; i10 += 3) {
            int W = W(i10);
            long j10 = (long) (1048575 & W);
            int i11 = this.f7432a[i10];
            switch ((W & 267386880) >>> 20) {
                case 0:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.u(t10, j10, c0.k(t11, j10));
                        R(i10, t10);
                        break;
                    }
                case 1:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.v(t10, j10, c0.l(t11, j10));
                        R(i10, t10);
                        break;
                    }
                case 2:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.x(t10, j10, c0.n(t11, j10));
                        R(i10, t10);
                        break;
                    }
                case 3:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.x(t10, j10, c0.n(t11, j10));
                        R(i10, t10);
                        break;
                    }
                case 4:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.w(t10, c0.m(t11, j10), j10);
                        R(i10, t10);
                        break;
                    }
                case 5:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.x(t10, j10, c0.n(t11, j10));
                        R(i10, t10);
                        break;
                    }
                case 6:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.w(t10, c0.m(t11, j10), j10);
                        R(i10, t10);
                        break;
                    }
                case 7:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.q(t10, j10, c0.g(t11, j10));
                        R(i10, t10);
                        break;
                    }
                case 8:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.y(t10, j10, c0.o(t11, j10));
                        R(i10, t10);
                        break;
                    }
                case 9:
                    y(i10, t10, t11);
                    break;
                case 10:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.y(t10, j10, c0.o(t11, j10));
                        R(i10, t10);
                        break;
                    }
                case 11:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.w(t10, c0.m(t11, j10), j10);
                        R(i10, t10);
                        break;
                    }
                case 12:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.w(t10, c0.m(t11, j10), j10);
                        R(i10, t10);
                        break;
                    }
                case 13:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.w(t10, c0.m(t11, j10), j10);
                        R(i10, t10);
                        break;
                    }
                case 14:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.x(t10, j10, c0.n(t11, j10));
                        R(i10, t10);
                        break;
                    }
                case 15:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.w(t10, c0.m(t11, j10), j10);
                        R(i10, t10);
                        break;
                    }
                case 16:
                    if (!t(i10, t11)) {
                        break;
                    } else {
                        c0.x(t10, j10, c0.n(t11, j10));
                        R(i10, t10);
                        break;
                    }
                case 17:
                    y(i10, t10, t11);
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
                    this.f7445n.b(t10, j10, t11);
                    break;
                case 50:
                    l lVar = this.f7448q;
                    Class<?> cls = d0.f7338a;
                    c0.y(t10, j10, lVar.a(c0.o(t10, j10), c0.o(t11, j10)));
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
                    if (!v(t11, i11, i10)) {
                        break;
                    } else {
                        c0.y(t10, j10, c0.o(t11, j10));
                        S(t10, i11, i10);
                        break;
                    }
                case 60:
                    z(i10, t10, t11);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!v(t11, i11, i10)) {
                        break;
                    } else {
                        c0.y(t10, j10, c0.o(t11, j10));
                        S(t10, i11, i10);
                        break;
                    }
                case 68:
                    z(i10, t10, t11);
                    break;
            }
        }
        g0<?, ?> g0Var = this.f7446o;
        Class<?> cls2 = d0.f7338a;
        g0Var.o(t10, g0Var.k(g0Var.g(t10), g0Var.g(t11)));
        if (this.f7437f) {
            d0.B(this.f7447p, t10, t11);
        }
    }

    public final T b() {
        return this.f7444m.a(this.f7436e);
    }

    public final void c(T t10) {
        if (u(t10)) {
            if (t10 instanceof n) {
                n nVar = (n) t10;
                nVar.o();
                nVar.n();
                nVar.x();
            }
            int length = this.f7432a.length;
            for (int i10 = 0; i10 < length; i10 += 3) {
                int W = W(i10);
                long j10 = (long) (1048575 & W);
                int i11 = (W & 267386880) >>> 20;
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
                            this.f7445n.a(t10, j10);
                            continue;
                        case 50:
                            Unsafe unsafe = f7431s;
                            Object object = unsafe.getObject(t10, j10);
                            if (object != null) {
                                unsafe.putObject(t10, j10, this.f7448q.b(object));
                                break;
                            } else {
                                continue;
                            }
                    }
                }
                if (t(i10, t10)) {
                    p(i10).c(f7431s.getObject(t10, j10));
                }
            }
            this.f7446o.j(t10);
            if (this.f7437f) {
                this.f7447p.f(t10);
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
            if (i10 < this.f7442k) {
                int i13 = this.f7441j[i10];
                int i14 = this.f7432a[i13];
                int W = W(i13);
                int i15 = this.f7432a[i13 + 2];
                int i16 = i15 & 1048575;
                int i17 = 1 << (i15 >>> 20);
                if (i16 != i12) {
                    if (i16 != 1048575) {
                        i11 = f7431s.getInt(t10, (long) i16);
                    }
                    i12 = i16;
                }
                if ((268435456 & W) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    if (i12 == 1048575) {
                        z11 = t(i13, t10);
                    } else if ((i11 & i17) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        return false;
                    }
                }
                int i18 = (267386880 & W) >>> 20;
                if (i18 == 9 || i18 == 17) {
                    if (i12 == 1048575) {
                        z12 = t(i13, t10);
                    } else if ((i11 & i17) == 0) {
                        z12 = false;
                    }
                    if (z12 && !p(i13).d(c0.o(t10, (long) (W & 1048575)))) {
                        return false;
                    }
                } else {
                    if (i18 != 27) {
                        if (i18 == 60 || i18 == 68) {
                            if (v(t10, i14, i13) && !p(i13).d(c0.o(t10, (long) (W & 1048575)))) {
                                return false;
                            }
                        } else if (i18 != 49) {
                            if (i18 == 50 && !this.f7448q.e(c0.o(t10, (long) (W & 1048575))).isEmpty()) {
                                this.f7448q.c(o(i13));
                                throw null;
                            }
                        }
                    }
                    List list = (List) c0.o(t10, (long) (W & 1048575));
                    if (!list.isEmpty()) {
                        c0 p10 = p(i13);
                        int i19 = 0;
                        while (true) {
                            if (i19 >= list.size()) {
                                break;
                            } else if (!p10.d(list.get(i19))) {
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
            } else if (!this.f7437f || this.f7447p.c(t10).i()) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (com.google.crypto.tink.shaded.protobuf.d0.C(j9.c0.o(r10, r6), j9.c0.o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (com.google.crypto.tink.shaded.protobuf.d0.C(j9.c0.o(r10, r6), j9.c0.o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (j9.c0.n(r10, r6) == j9.c0.n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (j9.c0.m(r10, r6) == j9.c0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (j9.c0.n(r10, r6) == j9.c0.n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (j9.c0.m(r10, r6) == j9.c0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (j9.c0.m(r10, r6) == j9.c0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (j9.c0.m(r10, r6) == j9.c0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        if (com.google.crypto.tink.shaded.protobuf.d0.C(j9.c0.o(r10, r6), j9.c0.o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        if (com.google.crypto.tink.shaded.protobuf.d0.C(j9.c0.o(r10, r6), j9.c0.o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (com.google.crypto.tink.shaded.protobuf.d0.C(j9.c0.o(r10, r6), j9.c0.o(r11, r6)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        if (j9.c0.g(r10, r6) == j9.c0.g(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
        if (j9.c0.m(r10, r6) == j9.c0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        if (j9.c0.n(r10, r6) == j9.c0.n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016d, code lost:
        if (j9.c0.m(r10, r6) == j9.c0.m(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
        if (j9.c0.n(r10, r6) == j9.c0.n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (j9.c0.n(r10, r6) == j9.c0.n(r11, r6)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (java.lang.Float.floatToIntBits(j9.c0.l(r10, r6)) == java.lang.Float.floatToIntBits(j9.c0.l(r11, r6))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c7, code lost:
        if (java.lang.Double.doubleToLongBits(j9.c0.k(r10, r6)) == java.lang.Double.doubleToLongBits(j9.c0.k(r11, r6))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f7432a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01d2
            int r4 = r9.W(r2)
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
            int[] r4 = r9.f7432a
            int r8 = r2 + 2
            r4 = r4[r8]
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = j9.c0.m(r10, r4)
            int r4 = j9.c0.m(r11, r4)
            if (r8 != r4) goto L_0x0030
            r4 = r3
            goto L_0x0031
        L_0x0030:
            r4 = r1
        L_0x0031:
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = j9.c0.o(r10, r6)
            java.lang.Object r5 = j9.c0.o(r11, r6)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.d0.C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0043:
            java.lang.Object r3 = j9.c0.o(r10, r6)
            java.lang.Object r4 = j9.c0.o(r11, r6)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.d0.C(r3, r4)
            goto L_0x01cb
        L_0x0051:
            java.lang.Object r3 = j9.c0.o(r10, r6)
            java.lang.Object r4 = j9.c0.o(r11, r6)
            boolean r3 = com.google.crypto.tink.shaded.protobuf.d0.C(r3, r4)
            goto L_0x01cb
        L_0x005f:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = j9.c0.o(r10, r6)
            java.lang.Object r5 = j9.c0.o(r11, r6)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.d0.C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0075:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = j9.c0.n(r10, r6)
            long r6 = j9.c0.n(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0089:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j9.c0.m(r10, r6)
            int r5 = j9.c0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x009b:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = j9.c0.n(r10, r6)
            long r6 = j9.c0.n(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00af:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j9.c0.m(r10, r6)
            int r5 = j9.c0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00c1:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j9.c0.m(r10, r6)
            int r5 = j9.c0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00d3:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j9.c0.m(r10, r6)
            int r5 = j9.c0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00e5:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = j9.c0.o(r10, r6)
            java.lang.Object r5 = j9.c0.o(r11, r6)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.d0.C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00fb:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = j9.c0.o(r10, r6)
            java.lang.Object r5 = j9.c0.o(r11, r6)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.d0.C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0111:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = j9.c0.o(r10, r6)
            java.lang.Object r5 = j9.c0.o(r11, r6)
            boolean r4 = com.google.crypto.tink.shaded.protobuf.d0.C(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0127:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            boolean r4 = j9.c0.g(r10, r6)
            boolean r5 = j9.c0.g(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0139:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j9.c0.m(r10, r6)
            int r5 = j9.c0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x014b:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = j9.c0.n(r10, r6)
            long r6 = j9.c0.n(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x015f:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = j9.c0.m(r10, r6)
            int r5 = j9.c0.m(r11, r6)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0170:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = j9.c0.n(r10, r6)
            long r6 = j9.c0.n(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0183:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = j9.c0.n(r10, r6)
            long r6 = j9.c0.n(r11, r6)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0196:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            float r4 = j9.c0.l(r10, r6)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = j9.c0.l(r11, r6)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x01af:
            boolean r4 = r9.k(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            double r4 = j9.c0.k(r10, r6)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = j9.c0.k(r11, r6)
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
            com.google.crypto.tink.shaded.protobuf.g0<?, ?> r0 = r9.f7446o
            com.google.crypto.tink.shaded.protobuf.h0 r0 = r0.g(r10)
            com.google.crypto.tink.shaded.protobuf.g0<?, ?> r2 = r9.f7446o
            com.google.crypto.tink.shaded.protobuf.h0 r2 = r2.g(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e5
            return r1
        L_0x01e5:
            boolean r0 = r9.f7437f
            if (r0 == 0) goto L_0x01fa
            com.google.crypto.tink.shaded.protobuf.j<?> r0 = r9.f7447p
            com.google.crypto.tink.shaded.protobuf.l r10 = r0.c(r10)
            com.google.crypto.tink.shaded.protobuf.j<?> r0 = r9.f7447p
            com.google.crypto.tink.shaded.protobuf.l r11 = r0.c(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.z.e(java.lang.Object, java.lang.Object):boolean");
    }

    public final int f(T t10) {
        if (this.f7439h) {
            return s(t10);
        }
        return r(t10);
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
            int[] r0 = r10.f7432a
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L_0x0005:
            if (r1 >= r0) goto L_0x0247
            int r3 = r10.W(r1)
            int[] r4 = r10.f7432a
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
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = j9.c0.o(r11, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0036:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = G(r11, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0048:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = F(r11, r5)
            goto L_0x0241
        L_0x0056:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = G(r11, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0068:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = F(r11, r5)
            goto L_0x0241
        L_0x0076:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = F(r11, r5)
            goto L_0x0241
        L_0x0084:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = F(r11, r5)
            goto L_0x0241
        L_0x0092:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = j9.c0.o(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00a4:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            java.lang.Object r3 = j9.c0.o(r11, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00b6:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = j9.c0.o(r11, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x00ca:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = j9.c0.o(r11, r5)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.p.f7415a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x00e2:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = F(r11, r5)
            goto L_0x0241
        L_0x00f0:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = G(r11, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0102:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            int r3 = F(r11, r5)
            goto L_0x0241
        L_0x0110:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = G(r11, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0122:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            long r3 = G(r11, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0134:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = j9.c0.o(r11, r5)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x014c:
            boolean r3 = r10.v(r11, r4, r1)
            if (r3 == 0) goto L_0x0243
            int r2 = r2 * 53
            java.lang.Object r3 = j9.c0.o(r11, r5)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0168:
            int r2 = r2 * 53
            java.lang.Object r3 = j9.c0.o(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0174:
            int r2 = r2 * 53
            java.lang.Object r3 = j9.c0.o(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x0180:
            java.lang.Object r3 = j9.c0.o(r11, r5)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
            goto L_0x01d9
        L_0x018b:
            int r2 = r2 * 53
            long r3 = j9.c0.n(r11, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0197:
            int r2 = r2 * 53
            int r3 = j9.c0.m(r11, r5)
            goto L_0x0241
        L_0x019f:
            int r2 = r2 * 53
            long r3 = j9.c0.n(r11, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x01ab:
            int r2 = r2 * 53
            int r3 = j9.c0.m(r11, r5)
            goto L_0x0241
        L_0x01b3:
            int r2 = r2 * 53
            int r3 = j9.c0.m(r11, r5)
            goto L_0x0241
        L_0x01bb:
            int r2 = r2 * 53
            int r3 = j9.c0.m(r11, r5)
            goto L_0x0241
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = j9.c0.o(r11, r5)
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01cf:
            java.lang.Object r3 = j9.c0.o(r11, r5)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
        L_0x01d9:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0243
        L_0x01de:
            int r2 = r2 * 53
            java.lang.Object r3 = j9.c0.o(r11, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0241
        L_0x01eb:
            int r2 = r2 * 53
            boolean r3 = j9.c0.g(r11, r5)
            java.nio.charset.Charset r4 = com.google.crypto.tink.shaded.protobuf.p.f7415a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x01f6:
            r8 = r9
        L_0x01f7:
            r3 = r8
            goto L_0x0241
        L_0x01f9:
            int r2 = r2 * 53
            int r3 = j9.c0.m(r11, r5)
            goto L_0x0241
        L_0x0200:
            int r2 = r2 * 53
            long r3 = j9.c0.n(r11, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x020b:
            int r2 = r2 * 53
            int r3 = j9.c0.m(r11, r5)
            goto L_0x0241
        L_0x0212:
            int r2 = r2 * 53
            long r3 = j9.c0.n(r11, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x021d:
            int r2 = r2 * 53
            long r3 = j9.c0.n(r11, r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
            goto L_0x0241
        L_0x0228:
            int r2 = r2 * 53
            float r3 = j9.c0.l(r11, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0241
        L_0x0233:
            int r2 = r2 * 53
            double r3 = j9.c0.k(r11, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.p.a(r3)
        L_0x0241:
            int r3 = r3 + r2
            r2 = r3
        L_0x0243:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0247:
            int r2 = r2 * 53
            com.google.crypto.tink.shaded.protobuf.g0<?, ?> r0 = r10.f7446o
            com.google.crypto.tink.shaded.protobuf.h0 r0 = r0.g(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r10.f7437f
            if (r1 == 0) goto L_0x0265
            int r0 = r0 * 53
            com.google.crypto.tink.shaded.protobuf.j<?> r1 = r10.f7447p
            com.google.crypto.tink.shaded.protobuf.l r11 = r1.c(r11)
            int r11 = r11.hashCode()
            int r0 = r0 + r11
        L_0x0265:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.z.g(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:78|77|143|144|(0)|147|(0)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x066e, code lost:
        r13 = r10.f(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0679, code lost:
        r0 = r8.f7442k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x067d, code lost:
        if (r0 < r8.f7443l) goto L_0x067f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x067f, code lost:
        m(r19, r8.f7441j[r0], r13, r10, r19);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0691, code lost:
        if (r13 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0669 */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x066e A[Catch:{ all -> 0x0028 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0679 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0012 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(T r19, j9.y r20, com.google.crypto.tink.shaded.protobuf.i r21) {
        /*
            r18 = this;
            r8 = r18
            r9 = r19
            r0 = r21
            r21.getClass()
            l(r19)
            com.google.crypto.tink.shaded.protobuf.g0<?, ?> r10 = r8.f7446o
            com.google.crypto.tink.shaded.protobuf.j<?> r11 = r8.f7447p
            r13 = 0
            r14 = 0
        L_0x0012:
            r15 = r20
            com.google.crypto.tink.shaded.protobuf.g r15 = (com.google.crypto.tink.shaded.protobuf.g) r15     // Catch:{ all -> 0x0028 }
            int r2 = r15.a()     // Catch:{ all -> 0x0028 }
            int r1 = r8.f7434c     // Catch:{ all -> 0x0028 }
            r3 = 0
            if (r2 < r1) goto L_0x002b
            int r1 = r8.f7435d     // Catch:{ all -> 0x0028 }
            if (r2 > r1) goto L_0x002b
            int r1 = r8.T(r2, r3)     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            goto L_0x0696
        L_0x002b:
            r1 = -1
        L_0x002c:
            if (r1 >= 0) goto L_0x0097
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r1) goto L_0x0052
            int r0 = r8.f7442k
        L_0x0035:
            int r1 = r8.f7443l
            if (r0 >= r1) goto L_0x004b
            int[] r1 = r8.f7441j
            r3 = r1[r0]
            r1 = r18
            r2 = r19
            r4 = r13
            r5 = r10
            r6 = r19
            r1.m(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0035
        L_0x004b:
            if (r13 == 0) goto L_0x0695
        L_0x004d:
            r10.n(r9, r13)
            goto L_0x0695
        L_0x0052:
            boolean r1 = r8.f7437f     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0058
            r1 = 0
            goto L_0x005e
        L_0x0058:
            com.google.crypto.tink.shaded.protobuf.x r1 = r8.f7436e     // Catch:{ all -> 0x0028 }
            com.google.crypto.tink.shaded.protobuf.n$e r1 = r11.b(r0, r1, r2)     // Catch:{ all -> 0x0028 }
        L_0x005e:
            if (r1 == 0) goto L_0x006c
            if (r14 != 0) goto L_0x0066
            com.google.crypto.tink.shaded.protobuf.l r14 = r11.d(r9)     // Catch:{ all -> 0x0028 }
        L_0x0066:
            java.lang.Object r1 = r11.g(r1)     // Catch:{ all -> 0x0028 }
        L_0x006a:
            r13 = r1
            goto L_0x0012
        L_0x006c:
            r10.p()     // Catch:{ all -> 0x0028 }
            if (r13 != 0) goto L_0x0075
            com.google.crypto.tink.shaded.protobuf.h0 r13 = r10.f(r9)     // Catch:{ all -> 0x0028 }
        L_0x0075:
            boolean r1 = r10.l(r13, r15)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x007c
            goto L_0x0012
        L_0x007c:
            int r0 = r8.f7442k
        L_0x007e:
            int r1 = r8.f7443l
            if (r0 >= r1) goto L_0x0094
            int[] r1 = r8.f7441j
            r3 = r1[r0]
            r1 = r18
            r2 = r19
            r4 = r13
            r5 = r10
            r6 = r19
            r1.m(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x007e
        L_0x0094:
            if (r13 == 0) goto L_0x0695
            goto L_0x004d
        L_0x0097:
            int r4 = r8.W(r1)     // Catch:{ all -> 0x0028 }
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            r6 = 3
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 5
            r7 = 1
            switch(r5) {
                case 0: goto L_0x0631;
                case 1: goto L_0x061b;
                case 2: goto L_0x0604;
                case 3: goto L_0x05ed;
                case 4: goto L_0x05d6;
                case 5: goto L_0x05bf;
                case 6: goto L_0x05a8;
                case 7: goto L_0x0591;
                case 8: goto L_0x0587;
                case 9: goto L_0x056f;
                case 10: goto L_0x055d;
                case 11: goto L_0x0546;
                case 12: goto L_0x051c;
                case 13: goto L_0x0505;
                case 14: goto L_0x04ee;
                case 15: goto L_0x04d7;
                case 16: goto L_0x04c0;
                case 17: goto L_0x04a9;
                case 18: goto L_0x0498;
                case 19: goto L_0x0487;
                case 20: goto L_0x0476;
                case 21: goto L_0x0465;
                case 22: goto L_0x0454;
                case 23: goto L_0x0443;
                case 24: goto L_0x0432;
                case 25: goto L_0x0421;
                case 26: goto L_0x041a;
                case 27: goto L_0x0407;
                case 28: goto L_0x03f6;
                case 29: goto L_0x03e5;
                case 30: goto L_0x03c8;
                case 31: goto L_0x03b7;
                case 32: goto L_0x03a6;
                case 33: goto L_0x0395;
                case 34: goto L_0x0384;
                case 35: goto L_0x0373;
                case 36: goto L_0x0362;
                case 37: goto L_0x0351;
                case 38: goto L_0x0340;
                case 39: goto L_0x032f;
                case 40: goto L_0x031e;
                case 41: goto L_0x030d;
                case 42: goto L_0x02fc;
                case 43: goto L_0x02eb;
                case 44: goto L_0x02ce;
                case 45: goto L_0x02bd;
                case 46: goto L_0x02ac;
                case 47: goto L_0x029b;
                case 48: goto L_0x028a;
                case 49: goto L_0x0274;
                case 50: goto L_0x0266;
                case 51: goto L_0x024b;
                case 52: goto L_0x0233;
                case 53: goto L_0x021b;
                case 54: goto L_0x0203;
                case 55: goto L_0x01eb;
                case 56: goto L_0x01d2;
                case 57: goto L_0x01b9;
                case 58: goto L_0x01a0;
                case 59: goto L_0x0198;
                case 60: goto L_0x0182;
                case 61: goto L_0x0172;
                case 62: goto L_0x0159;
                case 63: goto L_0x012c;
                case 64: goto L_0x0113;
                case 65: goto L_0x00fa;
                case 66: goto L_0x00e1;
                case 67: goto L_0x00c8;
                case 68: goto L_0x00b3;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            r17 = 0
            if (r13 != 0) goto L_0x0648
            com.google.crypto.tink.shaded.protobuf.h0 r1 = r10.f(r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0647
        L_0x00b3:
            java.lang.Object r3 = r8.B(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.x r3 = (com.google.crypto.tink.shaded.protobuf.x) r3     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.c0 r4 = r8.p(r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r6)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.b(r3, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.V(r9, r2, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x00c8:
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r3 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            long r6 = r3.t()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r4, r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x00e1:
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r3 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            int r3 = r3.s()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r4, r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x00fa:
            long r3 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r7)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r5 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            long r5 = r5.r()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r3, r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x0113:
            long r3 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r12)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r5 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            int r5 = r5.q()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r3, r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x012c:
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r3 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            int r3 = r3.k()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.p$b r5 = r8.n(r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            if (r5 == 0) goto L_0x0149
            boolean r5 = r5.a()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            if (r5 == 0) goto L_0x0142
            goto L_0x0149
        L_0x0142:
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.d0.D(r9, r2, r3, r13, r10)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r13 = r1
            goto L_0x0262
        L_0x0149:
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r4, r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x0159:
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r3 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            int r3 = r3.x()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r4, r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x0172:
            long r3 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c r5 = r15.e()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r3, r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x0182:
            java.lang.Object r3 = r8.B(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.x r3 = (com.google.crypto.tink.shaded.protobuf.x) r3     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.c0 r4 = r8.p(r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r5 = 2
            r15.v(r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.c(r3, r4, r0)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.V(r9, r2, r1, r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x0198:
            r8.O(r9, r4, r15)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x01a0:
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r3 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            boolean r3 = r3.h()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r4, r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x01b9:
            long r3 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r12)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r5 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            int r5 = r5.l()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r3, r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x01d2:
            long r3 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r7)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r5 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            long r5 = r5.m()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r3, r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x01eb:
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r3 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            int r3 = r3.o()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r4, r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x0203:
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r3 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            long r6 = r3.y()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r4, r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x021b:
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r3 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            long r6 = r3.p()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Long r3 = java.lang.Long.valueOf(r6)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r4, r3)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x0233:
            long r3 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r12)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r5 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            float r5 = r5.n()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r3, r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            goto L_0x0262
        L_0x024b:
            long r3 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r15.v(r7)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            com.google.crypto.tink.shaded.protobuf.f r5 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0270 }
            double r5 = r5.j()     // Catch:{ InvalidWireTypeException -> 0x0270 }
            java.lang.Double r5 = java.lang.Double.valueOf(r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            j9.c0.y(r9, r3, r5)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.S(r9, r2, r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
        L_0x0262:
            r17 = 0
            goto L_0x0012
        L_0x0266:
            java.lang.Object r2 = r8.o(r1)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r8.x(r9, r1, r2, r15)     // Catch:{ InvalidWireTypeException -> 0x0270 }
            r17 = 0
            throw r17     // Catch:{ InvalidWireTypeException -> 0x0669 }
        L_0x0270:
            r17 = 0
            goto L_0x0669
        L_0x0274:
            r17 = 0
            long r3 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.c0 r6 = r8.p(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r1 = r18
            r2 = r19
            r5 = r15
            r7 = r21
            r1.M(r2, r3, r5, r6, r7)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x028a:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.q(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x029b:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.p(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x02ac:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.o(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x02bd:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.n(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x02ce:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r3 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r3 = r3.c(r9, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.h(r3)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.p$b r4 = r8.n(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r1 = r19
            r5 = r13
            r6 = r10
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.d0.z(r1, r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x006a
        L_0x02eb:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.s(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x02fc:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.d(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x030d:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.i(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x031e:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.j(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x032f:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.l(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0340:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.t(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0351:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.m(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0362:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.k(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0373:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.g(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0384:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.q(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0395:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.p(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x03a6:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.o(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x03b7:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.n(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x03c8:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r3 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r3 = r3.c(r9, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.h(r3)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.p$b r4 = r8.n(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r1 = r19
            r5 = r13
            r6 = r10
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.d0.z(r1, r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x006a
        L_0x03e5:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.s(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x03f6:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.f(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0407:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.c0 r5 = r8.p(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r1 = r18
            r2 = r19
            r3 = r4
            r4 = r15
            r6 = r21
            r1.N(r2, r3, r4, r5, r6)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x041a:
            r17 = 0
            r8.P(r9, r4, r15)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0421:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.d(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0432:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.i(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0443:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.j(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0454:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.l(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0465:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.t(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0476:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.m(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0487:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.k(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0498:
            r17 = 0
            com.google.crypto.tink.shaded.protobuf.t r1 = r8.f7445n     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            java.util.List r1 = r1.c(r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.g(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x04a9:
            r17 = 0
            java.lang.Object r2 = r8.A(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.x r2 = (com.google.crypto.tink.shaded.protobuf.x) r2     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.c0 r3 = r8.p(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r6)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.b(r2, r3, r0)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.U(r1, r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x04c0:
            r17 = 0
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r2 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = r2.t()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.x(r9, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x04d7:
            r17 = 0
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r2 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            int r2 = r2.s()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.w(r9, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x04ee:
            r17 = 0
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r7)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r4 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r4 = r4.r()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.x(r9, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0505:
            r17 = 0
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r12)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r4 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            int r4 = r4.q()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.w(r9, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x051c:
            r17 = 0
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r3 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            int r3 = r3.k()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.p$b r5 = r8.n(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            if (r5 == 0) goto L_0x053a
            boolean r5 = r5.a()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            if (r5 == 0) goto L_0x0534
            goto L_0x053a
        L_0x0534:
            java.lang.Object r1 = com.google.crypto.tink.shaded.protobuf.d0.D(r9, r2, r3, r13, r10)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x006a
        L_0x053a:
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.w(r9, r3, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0546:
            r17 = 0
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r2 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            int r2 = r2.x()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.w(r9, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x055d:
            r17 = 0
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c r4 = r15.e()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.y(r9, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x056f:
            r17 = 0
            java.lang.Object r2 = r8.A(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.x r2 = (com.google.crypto.tink.shaded.protobuf.x) r2     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.c0 r3 = r8.p(r1)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r4 = 2
            r15.v(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.c(r2, r3, r0)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.U(r1, r9, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0587:
            r17 = 0
            r8.O(r9, r4, r15)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0591:
            r17 = 0
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r2 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            boolean r2 = r2.h()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.q(r9, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x05a8:
            r17 = 0
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r12)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r4 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            int r4 = r4.l()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.w(r9, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x05bf:
            r17 = 0
            long r2 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r7)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r4 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r4 = r4.m()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.x(r9, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x05d6:
            r17 = 0
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r2 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            int r2 = r2.o()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.w(r9, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x05ed:
            r17 = 0
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r2 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = r2.y()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.x(r9, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0604:
            r17 = 0
            long r4 = E(r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r3)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r2 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            long r2 = r2.p()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.x(r9, r4, r2)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x061b:
            r17 = 0
            r2 = r4 & r16
            long r2 = (long) r2     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r12)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r4 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            float r4 = r4.n()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.v(r9, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0631:
            r17 = 0
            r2 = r4 & r16
            long r2 = (long) r2     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r15.v(r7)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            com.google.crypto.tink.shaded.protobuf.f r4 = r15.f7380a     // Catch:{ InvalidWireTypeException -> 0x0669 }
            double r4 = r4.j()     // Catch:{ InvalidWireTypeException -> 0x0669 }
            j9.c0.u(r9, r2, r4)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            r8.R(r1, r9)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            goto L_0x0012
        L_0x0647:
            r13 = r1
        L_0x0648:
            boolean r1 = r10.l(r13, r15)     // Catch:{ InvalidWireTypeException -> 0x0669 }
            if (r1 != 0) goto L_0x0012
            int r0 = r8.f7442k
        L_0x0650:
            int r1 = r8.f7443l
            if (r0 >= r1) goto L_0x0666
            int[] r1 = r8.f7441j
            r3 = r1[r0]
            r1 = r18
            r2 = r19
            r4 = r13
            r5 = r10
            r6 = r19
            r1.m(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x0650
        L_0x0666:
            if (r13 == 0) goto L_0x0695
            goto L_0x0693
        L_0x0669:
            r10.p()     // Catch:{ all -> 0x0028 }
            if (r13 != 0) goto L_0x0673
            com.google.crypto.tink.shaded.protobuf.h0 r1 = r10.f(r9)     // Catch:{ all -> 0x0028 }
            r13 = r1
        L_0x0673:
            boolean r1 = r10.l(r13, r15)     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0012
            int r0 = r8.f7442k
        L_0x067b:
            int r1 = r8.f7443l
            if (r0 >= r1) goto L_0x0691
            int[] r1 = r8.f7441j
            r3 = r1[r0]
            r1 = r18
            r2 = r19
            r4 = r13
            r5 = r10
            r6 = r19
            r1.m(r2, r3, r4, r5, r6)
            int r0 = r0 + 1
            goto L_0x067b
        L_0x0691:
            if (r13 == 0) goto L_0x0695
        L_0x0693:
            goto L_0x004d
        L_0x0695:
            return
        L_0x0696:
            int r1 = r8.f7442k
            r7 = r1
        L_0x0699:
            int r1 = r8.f7443l
            if (r7 >= r1) goto L_0x06af
            int[] r1 = r8.f7441j
            r3 = r1[r7]
            r1 = r18
            r2 = r19
            r4 = r13
            r5 = r10
            r6 = r19
            r1.m(r2, r3, r4, r5, r6)
            int r7 = r7 + 1
            goto L_0x0699
        L_0x06af:
            if (r13 == 0) goto L_0x06b4
            r10.n(r9, r13)
        L_0x06b4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.z.h(java.lang.Object, j9.y, com.google.crypto.tink.shaded.protobuf.i):void");
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
    public final void i(java.lang.Object r13, j9.d r14) {
        /*
            r12 = this;
            r14.getClass()
            boolean r0 = r12.f7439h
            if (r0 == 0) goto L_0x0538
            boolean r0 = r12.f7437f
            r1 = 0
            if (r0 == 0) goto L_0x0023
            com.google.crypto.tink.shaded.protobuf.j<?> r0 = r12.f7447p
            com.google.crypto.tink.shaded.protobuf.l r0 = r0.c(r13)
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
            int[] r3 = r12.f7432a
            int r3 = r3.length
            r4 = 0
            r5 = r4
        L_0x002a:
            if (r5 >= r3) goto L_0x0518
            int r6 = r12.W(r5)
            int[] r7 = r12.f7432a
            r7 = r7[r5]
        L_0x0034:
            if (r2 == 0) goto L_0x0051
            com.google.crypto.tink.shaded.protobuf.j<?> r8 = r12.f7447p
            r8.a(r2)
            if (r7 < 0) goto L_0x0051
            com.google.crypto.tink.shaded.protobuf.j<?> r8 = r12.f7447p
            r8.j(r2)
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
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            com.google.crypto.tink.shaded.protobuf.c0 r8 = r12.p(r5)
            r14.h(r7, r8, r6)
            goto L_0x0514
        L_0x0074:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = G(r13, r8)
            r14.p(r7, r8)
            goto L_0x0514
        L_0x0085:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = F(r13, r8)
            r14.o(r7, r6)
            goto L_0x0514
        L_0x0096:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = G(r13, r8)
            r14.n(r7, r8)
            goto L_0x0514
        L_0x00a7:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = F(r13, r8)
            r14.m(r7, r6)
            goto L_0x0514
        L_0x00b8:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = F(r13, r8)
            r14.d(r7, r6)
            goto L_0x0514
        L_0x00c9:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = F(r13, r8)
            r14.q(r7, r6)
            goto L_0x0514
        L_0x00da:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            j9.c r6 = (j9.c) r6
            r14.b(r7, r6)
            goto L_0x0514
        L_0x00ed:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            com.google.crypto.tink.shaded.protobuf.c0 r8 = r12.p(r5)
            r14.k(r7, r8, r6)
            goto L_0x0514
        L_0x0102:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            Z(r7, r6, r14)
            goto L_0x0514
        L_0x0113:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            r14.a(r7, r6)
            goto L_0x0514
        L_0x012a:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = F(r13, r8)
            r14.e(r7, r6)
            goto L_0x0514
        L_0x013b:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = G(r13, r8)
            r14.f(r7, r8)
            goto L_0x0514
        L_0x014c:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = F(r13, r8)
            r14.i(r7, r6)
            goto L_0x0514
        L_0x015d:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = G(r13, r8)
            r14.r(r7, r8)
            goto L_0x0514
        L_0x016e:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = G(r13, r8)
            r14.j(r7, r8)
            goto L_0x0514
        L_0x017f:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r14.g(r7, r6)
            goto L_0x0514
        L_0x0196:
            boolean r8 = r12.v(r13, r7, r5)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.lang.Double r6 = (java.lang.Double) r6
            double r8 = r6.doubleValue()
            r14.c(r7, r8)
            goto L_0x0514
        L_0x01ad:
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            r12.Y(r14, r7, r6, r5)
            goto L_0x0514
        L_0x01b8:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.c0 r8 = r12.p(r5)
            com.google.crypto.tink.shaded.protobuf.d0.L(r7, r6, r14, r8)
            goto L_0x0514
        L_0x01cd:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.S(r7, r6, r14, r9)
            goto L_0x0514
        L_0x01de:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.R(r7, r6, r14, r9)
            goto L_0x0514
        L_0x01ef:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.Q(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0200:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.P(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0211:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.H(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0222:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.U(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0233:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.E(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0244:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.I(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0255:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.J(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0266:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.M(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0277:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.V(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0288:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.N(r7, r6, r14, r9)
            goto L_0x0514
        L_0x0299:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.K(r7, r6, r14, r9)
            goto L_0x0514
        L_0x02aa:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r10 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.G(r7, r6, r14, r9)
            goto L_0x0514
        L_0x02bb:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.S(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02cc:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.R(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02dd:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.Q(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02ee:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.P(r7, r6, r14, r4)
            goto L_0x0514
        L_0x02ff:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.H(r7, r6, r14, r4)
            goto L_0x0514
        L_0x0310:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.U(r7, r6, r14, r4)
            goto L_0x0514
        L_0x0321:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.F(r7, r6, r14)
            goto L_0x0514
        L_0x0332:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.c0 r8 = r12.p(r5)
            com.google.crypto.tink.shaded.protobuf.d0.O(r7, r6, r14, r8)
            goto L_0x0514
        L_0x0347:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.T(r7, r6, r14)
            goto L_0x0514
        L_0x0358:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.E(r7, r6, r14, r4)
            goto L_0x0514
        L_0x0369:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.I(r7, r6, r14, r4)
            goto L_0x0514
        L_0x037a:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.J(r7, r6, r14, r4)
            goto L_0x0514
        L_0x038b:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.M(r7, r6, r14, r4)
            goto L_0x0514
        L_0x039c:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.V(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03ad:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.N(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03be:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.K(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03cf:
            int[] r7 = r12.f7432a
            r7 = r7[r5]
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.google.crypto.tink.shaded.protobuf.d0.G(r7, r6, r14, r4)
            goto L_0x0514
        L_0x03e0:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            com.google.crypto.tink.shaded.protobuf.c0 r8 = r12.p(r5)
            r14.h(r7, r8, r6)
            goto L_0x0514
        L_0x03f5:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = j9.c0.n(r13, r8)
            r14.p(r7, r8)
            goto L_0x0514
        L_0x0406:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j9.c0.m(r13, r8)
            r14.o(r7, r6)
            goto L_0x0514
        L_0x0417:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = j9.c0.n(r13, r8)
            r14.n(r7, r8)
            goto L_0x0514
        L_0x0428:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j9.c0.m(r13, r8)
            r14.m(r7, r6)
            goto L_0x0514
        L_0x0439:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j9.c0.m(r13, r8)
            r14.d(r7, r6)
            goto L_0x0514
        L_0x044a:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j9.c0.m(r13, r8)
            r14.q(r7, r6)
            goto L_0x0514
        L_0x045b:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            j9.c r6 = (j9.c) r6
            r14.b(r7, r6)
            goto L_0x0514
        L_0x046e:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            com.google.crypto.tink.shaded.protobuf.c0 r8 = r12.p(r5)
            r14.k(r7, r8, r6)
            goto L_0x0514
        L_0x0483:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            java.lang.Object r6 = j9.c0.o(r13, r8)
            Z(r7, r6, r14)
            goto L_0x0514
        L_0x0494:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            boolean r6 = j9.c0.g(r13, r8)
            r14.a(r7, r6)
            goto L_0x0514
        L_0x04a5:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j9.c0.m(r13, r8)
            r14.e(r7, r6)
            goto L_0x0514
        L_0x04b5:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = j9.c0.n(r13, r8)
            r14.f(r7, r8)
            goto L_0x0514
        L_0x04c5:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            int r6 = j9.c0.m(r13, r8)
            r14.i(r7, r6)
            goto L_0x0514
        L_0x04d5:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = j9.c0.n(r13, r8)
            r14.r(r7, r8)
            goto L_0x0514
        L_0x04e5:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            long r8 = j9.c0.n(r13, r8)
            r14.j(r7, r8)
            goto L_0x0514
        L_0x04f5:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            float r6 = j9.c0.l(r13, r8)
            r14.g(r7, r6)
            goto L_0x0514
        L_0x0505:
            boolean r8 = r12.t(r5, r13)
            if (r8 == 0) goto L_0x0514
            r6 = r6 & r10
            long r8 = (long) r6
            double r8 = j9.c0.k(r13, r8)
            r14.c(r7, r8)
        L_0x0514:
            int r5 = r5 + 3
            goto L_0x002a
        L_0x0518:
            if (r2 == 0) goto L_0x052e
            com.google.crypto.tink.shaded.protobuf.j<?> r3 = r12.f7447p
            r3.j(r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x052c
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0518
        L_0x052c:
            r2 = r1
            goto L_0x0518
        L_0x052e:
            com.google.crypto.tink.shaded.protobuf.g0<?, ?> r0 = r12.f7446o
            com.google.crypto.tink.shaded.protobuf.h0 r13 = r0.g(r13)
            r0.s(r13, r14)
            goto L_0x053b
        L_0x0538:
            r12.X(r13, r14)
        L_0x053b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.z.i(java.lang.Object, j9.d):void");
    }

    public final void j(T t10, byte[] bArr, int i10, int i11, d.a aVar) {
        if (this.f7439h) {
            K(t10, bArr, i10, i11, aVar);
        } else {
            J(t10, bArr, i10, i11, 0, aVar);
        }
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        if (t(i10, obj) == t(i10, obj2)) {
            return true;
        }
        return false;
    }

    public final void m(Object obj, int i10, Object obj2, g0 g0Var, Object obj3) {
        p.b n10;
        int i11 = this.f7432a[i10];
        Object o10 = c0.o(obj, (long) (W(i10) & 1048575));
        if (o10 != null && (n10 = n(i10)) != null) {
            w g2 = this.f7448q.g(o10);
            this.f7448q.c(o(i10));
            for (Map.Entry entry : g2.entrySet()) {
                ((Integer) entry.getValue()).intValue();
                if (!n10.a()) {
                    if (obj2 == null) {
                        g0Var.f(obj3);
                    }
                    entry.getKey();
                    entry.getValue();
                    throw null;
                }
            }
        }
    }

    public final p.b n(int i10) {
        return (p.b) this.f7433b[((i10 / 3) * 2) + 1];
    }

    public final Object o(int i10) {
        return this.f7433b[(i10 / 3) * 2];
    }

    public final c0 p(int i10) {
        int i11 = (i10 / 3) * 2;
        Object[] objArr = this.f7433b;
        c0 c0Var = (c0) objArr[i11];
        if (c0Var != null) {
            return c0Var;
        }
        c0 a10 = w.f11791c.a((Class) objArr[i11 + 1]);
        this.f7433b[i11] = a10;
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
    public final int r(T r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            sun.misc.Unsafe r2 = f7431s
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r7 = r3
            r5 = 0
            r6 = 0
            r8 = 0
        L_0x000d:
            int[] r9 = r0.f7432a
            int r9 = r9.length
            if (r5 >= r9) goto L_0x0505
            int r9 = r0.W(r5)
            int[] r10 = r0.f7432a
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
            boolean r10 = r0.f7440i
            if (r10 == 0) goto L_0x0052
            j9.g r10 = j9.g.DOUBLE_LIST_PACKED
            int r10 = r10.b()
            if (r12 < r10) goto L_0x0052
            j9.g r10 = j9.g.SINT64_LIST_PACKED
            int r10 = r10.b()
            if (r12 > r10) goto L_0x0052
            int[] r10 = r0.f7432a
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
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.crypto.tink.shaded.protobuf.x r3 = (com.google.crypto.tink.shaded.protobuf.x) r3
            com.google.crypto.tink.shaded.protobuf.c0 r4 = r0.p(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Q(r11, r3, r4)
            goto L_0x04fd
        L_0x0071:
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            long r3 = G(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Y(r11, r3)
            goto L_0x04fd
        L_0x0081:
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            int r3 = F(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.X(r11, r3)
            goto L_0x04fd
        L_0x0091:
            boolean r3 = r0.v(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r11)
            goto L_0x04fd
        L_0x009d:
            boolean r3 = r0.v(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.V(r11)
            goto L_0x04fd
        L_0x00a9:
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            int r3 = F(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.M(r11, r3)
            goto L_0x04fd
        L_0x00b9:
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            int r3 = F(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.c0(r11, r3)
            goto L_0x04fd
        L_0x00c9:
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            j9.c r3 = (j9.c) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r11, r3)
            goto L_0x04fd
        L_0x00db:
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.crypto.tink.shaded.protobuf.c0 r4 = r0.p(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.o(r11, r4, r3)
            goto L_0x04fd
        L_0x00ef:
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof j9.c
            if (r4 == 0) goto L_0x0105
            j9.c r3 = (j9.c) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r11, r3)
            goto L_0x04a8
        L_0x0105:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Z(r11, r3)
            goto L_0x04a8
        L_0x010d:
            boolean r3 = r0.v(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.J(r11)
            goto L_0x04fd
        L_0x0119:
            boolean r3 = r0.v(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.N(r11)
            goto L_0x04fd
        L_0x0125:
            boolean r3 = r0.v(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.O(r11)
            goto L_0x04fd
        L_0x0131:
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            int r3 = F(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.R(r11, r3)
            goto L_0x04fd
        L_0x0141:
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            long r3 = G(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.e0(r11, r3)
            goto L_0x04fd
        L_0x0151:
            boolean r9 = r0.v(r1, r11, r5)
            if (r9 == 0) goto L_0x04fe
            long r3 = G(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.T(r11, r3)
            goto L_0x04fd
        L_0x0161:
            boolean r3 = r0.v(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.P(r11)
            goto L_0x04fd
        L_0x016d:
            boolean r3 = r0.v(r1, r11, r5)
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.L(r11)
            goto L_0x04fd
        L_0x0179:
            j9.l r9 = r0.f7448q
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.lang.Object r4 = r0.o(r5)
            int r3 = r9.d(r11, r3, r4)
            goto L_0x04fd
        L_0x0189:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.c0 r4 = r0.p(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.j(r11, r3, r4)
            goto L_0x04fd
        L_0x0199:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.t(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x01ad
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x01ad:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x01b7:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.r(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x01cb
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x01cb:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x01d5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.i(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x01e9
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x01e9:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x01f3:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.g(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x0207
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0207:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x0211:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.e(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x0225
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0225:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x022f:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.w(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x0243
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0243:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x024d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.b(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x0261
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0261:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x026b:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.g(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x027f
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x027f:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x0289:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.i(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x029d
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x029d:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x02a7:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.l(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x02bb
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02bb:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x02c5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.y(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x02d9
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02d9:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x02e2:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.n(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x02f6
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x02f6:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x02ff:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.g(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x0313
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0313:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
            goto L_0x0338
        L_0x031c:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.i(r3)
            if (r3 <= 0) goto L_0x04fe
            boolean r4 = r0.f7440i
            if (r4 == 0) goto L_0x0330
            long r9 = (long) r10
            r2.putInt(r1, r9, r3)
        L_0x0330:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r11)
            int r9 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r3)
        L_0x0338:
            int r9 = r9 + r4
            int r9 = r9 + r3
            int r6 = r6 + r9
            goto L_0x04fe
        L_0x033d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.s(r11, r3)
            goto L_0x04fd
        L_0x0349:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.q(r11, r3)
            goto L_0x04fd
        L_0x0355:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.h(r11, r3)
            goto L_0x04fd
        L_0x0361:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.f(r11, r3)
            goto L_0x04fd
        L_0x036d:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.d(r11, r3)
            goto L_0x04fd
        L_0x0379:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.v(r11, r3)
            goto L_0x04fd
        L_0x0385:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.c(r11, r3)
            goto L_0x04fd
        L_0x0391:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            com.google.crypto.tink.shaded.protobuf.c0 r4 = r0.p(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.p(r11, r3, r4)
            goto L_0x04fd
        L_0x03a1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.u(r11, r3)
            goto L_0x04fd
        L_0x03ad:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.a(r11, r3)
            goto L_0x04fd
        L_0x03b9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.f(r11, r3)
            goto L_0x04fd
        L_0x03c5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.h(r11, r3)
            goto L_0x04fd
        L_0x03d1:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.k(r11, r3)
            goto L_0x04fd
        L_0x03dd:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.x(r11, r3)
            goto L_0x04fd
        L_0x03e9:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.m(r11, r3)
            goto L_0x04fd
        L_0x03f5:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.f(r11, r3)
            goto L_0x04fd
        L_0x0401:
            java.lang.Object r3 = r2.getObject(r1, r3)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.h(r11, r3)
            goto L_0x04fd
        L_0x040d:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.crypto.tink.shaded.protobuf.x r3 = (com.google.crypto.tink.shaded.protobuf.x) r3
            com.google.crypto.tink.shaded.protobuf.c0 r4 = r0.p(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Q(r11, r3, r4)
            goto L_0x04fd
        L_0x0421:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            long r3 = r2.getLong(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Y(r11, r3)
            goto L_0x04fd
        L_0x042f:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            int r3 = r2.getInt(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.X(r11, r3)
            goto L_0x04fd
        L_0x043d:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r11)
            goto L_0x04fd
        L_0x0447:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.V(r11)
            goto L_0x04fd
        L_0x0451:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            int r3 = r2.getInt(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.M(r11, r3)
            goto L_0x04fd
        L_0x045f:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            int r3 = r2.getInt(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.c0(r11, r3)
            goto L_0x04fd
        L_0x046d:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            j9.c r3 = (j9.c) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r11, r3)
            goto L_0x04fd
        L_0x047d:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            com.google.crypto.tink.shaded.protobuf.c0 r4 = r0.p(r5)
            int r3 = com.google.crypto.tink.shaded.protobuf.d0.o(r11, r4, r3)
            goto L_0x04fd
        L_0x048f:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            java.lang.Object r3 = r2.getObject(r1, r3)
            boolean r4 = r3 instanceof j9.c
            if (r4 == 0) goto L_0x04a2
            j9.c r3 = (j9.c) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r11, r3)
            goto L_0x04a8
        L_0x04a2:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Z(r11, r3)
        L_0x04a8:
            int r6 = r6 + r3
            goto L_0x04fe
        L_0x04aa:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.J(r11)
            goto L_0x04fd
        L_0x04b3:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.N(r11)
            goto L_0x04fd
        L_0x04bc:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.O(r11)
            goto L_0x04fd
        L_0x04c5:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            int r3 = r2.getInt(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.R(r11, r3)
            goto L_0x04fd
        L_0x04d2:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            long r3 = r2.getLong(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.e0(r11, r3)
            goto L_0x04fd
        L_0x04df:
            r9 = r8 & r14
            if (r9 == 0) goto L_0x04fe
            long r3 = r2.getLong(r1, r3)
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.T(r11, r3)
            goto L_0x04fd
        L_0x04ec:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.P(r11)
            goto L_0x04fd
        L_0x04f5:
            r3 = r8 & r14
            if (r3 == 0) goto L_0x04fe
            int r3 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.L(r11)
        L_0x04fd:
            int r6 = r6 + r3
        L_0x04fe:
            int r5 = r5 + 3
            r3 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000d
        L_0x0505:
            com.google.crypto.tink.shaded.protobuf.g0<?, ?> r2 = r0.f7446o
            com.google.crypto.tink.shaded.protobuf.h0 r3 = r2.g(r1)
            int r2 = r2.h(r3)
            int r2 = r2 + r6
            boolean r3 = r0.f7437f
            if (r3 == 0) goto L_0x051f
            com.google.crypto.tink.shaded.protobuf.j<?> r3 = r0.f7447p
            com.google.crypto.tink.shaded.protobuf.l r1 = r3.c(r1)
            int r1 = r1.g()
            int r2 = r2 + r1
        L_0x051f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.z.r(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0315, code lost:
        r3 = r3 + ((r6 + r4) + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0477, code lost:
        r3 = r3 + r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int s(T r12) {
        /*
            r11 = this;
            sun.misc.Unsafe r0 = f7431s
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x0005:
            int[] r4 = r11.f7432a
            int r4 = r4.length
            if (r2 >= r4) goto L_0x04e1
            int r4 = r11.W(r2)
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r5 = r5 & r4
            int r5 = r5 >>> 20
            int[] r6 = r11.f7432a
            r6 = r6[r2]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r8 = (long) r4
            j9.g r4 = j9.g.DOUBLE_LIST_PACKED
            int r4 = r4.b()
            if (r5 < r4) goto L_0x0034
            j9.g r4 = j9.g.SINT64_LIST_PACKED
            int r4 = r4.b()
            if (r5 > r4) goto L_0x0034
            int[] r4 = r11.f7432a
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
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j9.c0.o(r12, r8)
            com.google.crypto.tink.shaded.protobuf.x r4 = (com.google.crypto.tink.shaded.protobuf.x) r4
            com.google.crypto.tink.shaded.protobuf.c0 r5 = r11.p(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Q(r6, r4, r5)
            goto L_0x04dc
        L_0x0050:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            long r4 = G(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Y(r6, r4)
            goto L_0x04dc
        L_0x0060:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = F(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.X(r6, r4)
            goto L_0x04dc
        L_0x0070:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r6)
            goto L_0x04dc
        L_0x007c:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.V(r6)
            goto L_0x04dc
        L_0x0088:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = F(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.M(r6, r4)
            goto L_0x04dc
        L_0x0098:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = F(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.c0(r6, r4)
            goto L_0x04dc
        L_0x00a8:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j9.c0.o(r12, r8)
            j9.c r4 = (j9.c) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x04dc
        L_0x00ba:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j9.c0.o(r12, r8)
            com.google.crypto.tink.shaded.protobuf.c0 r5 = r11.p(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.o(r6, r5, r4)
            goto L_0x04dc
        L_0x00ce:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j9.c0.o(r12, r8)
            boolean r5 = r4 instanceof j9.c
            if (r5 == 0) goto L_0x00e4
            j9.c r4 = (j9.c) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x0477
        L_0x00e4:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Z(r6, r4)
            goto L_0x0477
        L_0x00ec:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.J(r6)
            goto L_0x04dc
        L_0x00f8:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.N(r6)
            goto L_0x04dc
        L_0x0104:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.O(r6)
            goto L_0x04dc
        L_0x0110:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = F(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.R(r6, r4)
            goto L_0x04dc
        L_0x0120:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            long r4 = G(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.e0(r6, r4)
            goto L_0x04dc
        L_0x0130:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            long r4 = G(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.T(r6, r4)
            goto L_0x04dc
        L_0x0140:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.P(r6)
            goto L_0x04dc
        L_0x014c:
            boolean r4 = r11.v(r12, r6, r2)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.L(r6)
            goto L_0x04dc
        L_0x0158:
            j9.l r4 = r11.f7448q
            java.lang.Object r5 = j9.c0.o(r12, r8)
            java.lang.Object r7 = r11.o(r2)
            int r4 = r4.d(r6, r5, r7)
            goto L_0x04dc
        L_0x0168:
            java.util.List r4 = w(r12, r8)
            com.google.crypto.tink.shaded.protobuf.c0 r5 = r11.p(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.j(r6, r4, r5)
            goto L_0x04dc
        L_0x0176:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.t(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x018a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x018a:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0194:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.r(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x01a8
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01a8:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x01b2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.i(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x01c6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01c6:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x01d0:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.g(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x01e4
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x01e4:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x01ee:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.e(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x0202
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0202:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x020c:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.w(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x0220
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0220:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x022a:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.b(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x023e
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x023e:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0248:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.g(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x025c
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x025c:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0266:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.i(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x027a
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x027a:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x0284:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.l(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x0298
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x0298:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02a2:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.y(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x02b6
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02b6:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02bf:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.n(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x02d3
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02d3:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02dc:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.g(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x02f0
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x02f0:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
            goto L_0x0315
        L_0x02f9:
            java.lang.Object r5 = r0.getObject(r12, r8)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.crypto.tink.shaded.protobuf.d0.i(r5)
            if (r5 <= 0) goto L_0x04dd
            boolean r7 = r11.f7440i
            if (r7 == 0) goto L_0x030d
            long r7 = (long) r4
            r0.putInt(r12, r7, r5)
        L_0x030d:
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.b0(r6)
            int r6 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.d0(r5)
        L_0x0315:
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r3 = r3 + r6
            goto L_0x04dd
        L_0x031a:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.s(r6, r4)
            goto L_0x04dc
        L_0x0324:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.q(r6, r4)
            goto L_0x04dc
        L_0x032e:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.h(r6, r4)
            goto L_0x04dc
        L_0x0338:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.f(r6, r4)
            goto L_0x04dc
        L_0x0342:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.d(r6, r4)
            goto L_0x04dc
        L_0x034c:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.v(r6, r4)
            goto L_0x04dc
        L_0x0356:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.c(r6, r4)
            goto L_0x04dc
        L_0x0360:
            java.util.List r4 = w(r12, r8)
            com.google.crypto.tink.shaded.protobuf.c0 r5 = r11.p(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.p(r6, r4, r5)
            goto L_0x04dc
        L_0x036e:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.u(r6, r4)
            goto L_0x04dc
        L_0x0378:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.a(r6, r4)
            goto L_0x04dc
        L_0x0382:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.f(r6, r4)
            goto L_0x04dc
        L_0x038c:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.h(r6, r4)
            goto L_0x04dc
        L_0x0396:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.k(r6, r4)
            goto L_0x04dc
        L_0x03a0:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.x(r6, r4)
            goto L_0x04dc
        L_0x03aa:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.m(r6, r4)
            goto L_0x04dc
        L_0x03b4:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.f(r6, r4)
            goto L_0x04dc
        L_0x03be:
            java.util.List r4 = w(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.h(r6, r4)
            goto L_0x04dc
        L_0x03c8:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j9.c0.o(r12, r8)
            com.google.crypto.tink.shaded.protobuf.x r4 = (com.google.crypto.tink.shaded.protobuf.x) r4
            com.google.crypto.tink.shaded.protobuf.c0 r5 = r11.p(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Q(r6, r4, r5)
            goto L_0x04dc
        L_0x03de:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            long r4 = j9.c0.n(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Y(r6, r4)
            goto L_0x04dc
        L_0x03ee:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = j9.c0.m(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.X(r6, r4)
            goto L_0x04dc
        L_0x03fe:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.W(r6)
            goto L_0x04dc
        L_0x040a:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.V(r6)
            goto L_0x04dc
        L_0x0416:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = j9.c0.m(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.M(r6, r4)
            goto L_0x04dc
        L_0x0426:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = j9.c0.m(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.c0(r6, r4)
            goto L_0x04dc
        L_0x0436:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j9.c0.o(r12, r8)
            j9.c r4 = (j9.c) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x04dc
        L_0x0448:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j9.c0.o(r12, r8)
            com.google.crypto.tink.shaded.protobuf.c0 r5 = r11.p(r2)
            int r4 = com.google.crypto.tink.shaded.protobuf.d0.o(r6, r5, r4)
            goto L_0x04dc
        L_0x045c:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            java.lang.Object r4 = j9.c0.o(r12, r8)
            boolean r5 = r4 instanceof j9.c
            if (r5 == 0) goto L_0x0471
            j9.c r4 = (j9.c) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.K(r6, r4)
            goto L_0x0477
        L_0x0471:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.Z(r6, r4)
        L_0x0477:
            int r3 = r3 + r4
            goto L_0x04dd
        L_0x0479:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.J(r6)
            goto L_0x04dc
        L_0x0484:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.N(r6)
            goto L_0x04dc
        L_0x048f:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.O(r6)
            goto L_0x04dc
        L_0x049a:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = j9.c0.m(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.R(r6, r4)
            goto L_0x04dc
        L_0x04a9:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            long r4 = j9.c0.n(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.e0(r6, r4)
            goto L_0x04dc
        L_0x04b8:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            long r4 = j9.c0.n(r12, r8)
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.T(r6, r4)
            goto L_0x04dc
        L_0x04c7:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.P(r6)
            goto L_0x04dc
        L_0x04d2:
            boolean r4 = r11.t(r2, r12)
            if (r4 == 0) goto L_0x04dd
            int r4 = com.google.crypto.tink.shaded.protobuf.CodedOutputStream.L(r6)
        L_0x04dc:
            int r3 = r3 + r4
        L_0x04dd:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x04e1:
            com.google.crypto.tink.shaded.protobuf.g0<?, ?> r0 = r11.f7446o
            com.google.crypto.tink.shaded.protobuf.h0 r12 = r0.g(r12)
            int r12 = r0.h(r12)
            int r12 = r12 + r3
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.z.s(java.lang.Object):int");
    }

    public final boolean t(int i10, Object obj) {
        boolean equals;
        int i11 = this.f7432a[i10 + 2];
        long j10 = (long) (i11 & 1048575);
        if (j10 == 1048575) {
            int W = W(i10);
            long j11 = (long) (W & 1048575);
            switch ((W & 267386880) >>> 20) {
                case 0:
                    if (Double.doubleToRawLongBits(c0.k(obj, j11)) != 0) {
                        return true;
                    }
                    return false;
                case 1:
                    if (Float.floatToRawIntBits(c0.l(obj, j11)) != 0) {
                        return true;
                    }
                    return false;
                case 2:
                    if (c0.n(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (c0.n(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (c0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (c0.n(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (c0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return c0.g(obj, j11);
                case 8:
                    Object o10 = c0.o(obj, j11);
                    if (o10 instanceof String) {
                        equals = ((String) o10).isEmpty();
                        break;
                    } else if (o10 instanceof c) {
                        equals = c.f11735b.equals(o10);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (c0.o(obj, j11) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    equals = c.f11735b.equals(c0.o(obj, j11));
                    break;
                case 11:
                    if (c0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (c0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (c0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (c0.n(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (c0.m(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (c0.n(obj, j11) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (c0.o(obj, j11) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        } else if (((1 << (i11 >>> 20)) & c0.m(obj, j10)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean v(T t10, int i10, int i11) {
        if (c0.m(t10, (long) (this.f7432a[i11 + 2] & 1048575)) == i10) {
            return true;
        }
        return false;
    }

    public final void x(Object obj, int i10, Object obj2, y yVar) {
        long W = (long) (W(i10) & 1048575);
        Object o10 = c0.o(obj, W);
        if (o10 == null) {
            o10 = this.f7448q.f();
            c0.y(obj, W, o10);
        } else if (this.f7448q.h(o10)) {
            w f10 = this.f7448q.f();
            this.f7448q.a(f10, o10);
            c0.y(obj, W, f10);
            o10 = f10;
        }
        this.f7448q.g(o10);
        this.f7448q.c(obj2);
        g gVar = (g) yVar;
        gVar.v(2);
        gVar.f7380a.g(gVar.f7380a.x());
        throw null;
    }

    public final void y(int i10, Object obj, Object obj2) {
        if (t(i10, obj2)) {
            long W = (long) (W(i10) & 1048575);
            Unsafe unsafe = f7431s;
            Object object = unsafe.getObject(obj2, W);
            if (object != null) {
                c0 p10 = p(i10);
                if (!t(i10, obj)) {
                    if (!u(object)) {
                        unsafe.putObject(obj, W, object);
                    } else {
                        Object b10 = p10.b();
                        p10.a(b10, object);
                        unsafe.putObject(obj, W, b10);
                    }
                    R(i10, obj);
                    return;
                }
                Object object2 = unsafe.getObject(obj, W);
                if (!u(object2)) {
                    Object b11 = p10.b();
                    p10.a(b11, object2);
                    unsafe.putObject(obj, W, b11);
                    object2 = b11;
                }
                p10.a(object2, object);
                return;
            }
            StringBuilder q10 = a.q("Source subfield ");
            q10.append(this.f7432a[i10]);
            q10.append(" is present but null: ");
            q10.append(obj2);
            throw new IllegalStateException(q10.toString());
        }
    }

    public final void z(int i10, Object obj, Object obj2) {
        int i11 = this.f7432a[i10];
        if (v(obj2, i11, i10)) {
            long W = (long) (W(i10) & 1048575);
            Unsafe unsafe = f7431s;
            Object object = unsafe.getObject(obj2, W);
            if (object != null) {
                c0 p10 = p(i10);
                if (!v(obj, i11, i10)) {
                    if (!u(object)) {
                        unsafe.putObject(obj, W, object);
                    } else {
                        Object b10 = p10.b();
                        p10.a(b10, object);
                        unsafe.putObject(obj, W, b10);
                    }
                    S(obj, i11, i10);
                    return;
                }
                Object object2 = unsafe.getObject(obj, W);
                if (!u(object2)) {
                    Object b11 = p10.b();
                    p10.a(b11, object2);
                    unsafe.putObject(obj, W, b11);
                    object2 = b11;
                }
                p10.a(object2, object);
                return;
            }
            StringBuilder q10 = a.q("Source subfield ");
            q10.append(this.f7432a[i10]);
            q10.append(" is present but null: ");
            q10.append(obj2);
            throw new IllegalStateException(q10.toString());
        }
    }
}
