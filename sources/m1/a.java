package m1;

import android.util.TypedValue;

/* compiled from: ColorStateListInflaterCompat */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<TypedValue> f13045a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.a(android.content.res.Resources, android.content.res.XmlResourceParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x02e3  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x030a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList b(android.content.res.Resources r35, android.content.res.XmlResourceParser r36, android.util.AttributeSet r37, android.content.res.Resources.Theme r38) {
        /*
            r0 = r35
            r1 = r37
            r2 = r38
            java.lang.String r3 = r36.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x0356
            int r3 = r36.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = r7
        L_0x0020:
            int r9 = r36.next()
            if (r9 == r4) goto L_0x0345
            int r10 = r36.getDepth()
            if (r10 >= r3) goto L_0x002f
            r11 = 3
            if (r9 == r11) goto L_0x0345
        L_0x002f:
            r11 = 2
            if (r9 != r11) goto L_0x0334
            if (r10 > r3) goto L_0x0334
            java.lang.String r9 = r36.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x0334
        L_0x0042:
            int[] r9 = androidx.core.R$styleable.ColorStateListItem
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            int r10 = androidx.core.R$styleable.ColorStateListItem_android_color
            r12 = -1
            int r13 = r9.getResourceId(r10, r12)
            r14 = 31
            r15 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r12) goto L_0x0096
            java.lang.ThreadLocal<android.util.TypedValue> r12 = f13045a
            java.lang.Object r16 = r12.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L_0x0070
            android.util.TypedValue r11 = new android.util.TypedValue
            r11.<init>()
            r12.set(r11)
            goto L_0x0072
        L_0x0070:
            r11 = r16
        L_0x0072:
            r0.getValue(r13, r11, r4)
            int r11 = r11.type
            r12 = 28
            if (r11 < r12) goto L_0x007f
            if (r11 > r14) goto L_0x007f
            r11 = r4
            goto L_0x0080
        L_0x007f:
            r11 = r7
        L_0x0080:
            if (r11 != 0) goto L_0x0096
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008f }
            android.content.res.ColorStateList r10 = a(r0, r10, r2)     // Catch:{ Exception -> 0x008f }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008f }
            goto L_0x009a
        L_0x008f:
            int r10 = androidx.core.R$styleable.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r15)
            goto L_0x009a
        L_0x0096:
            int r10 = r9.getColor(r10, r15)
        L_0x009a:
            int r11 = androidx.core.R$styleable.ColorStateListItem_android_alpha
            boolean r12 = r9.hasValue(r11)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x00a9
            float r11 = r9.getFloat(r11, r13)
            goto L_0x00b7
        L_0x00a9:
            int r11 = androidx.core.R$styleable.ColorStateListItem_alpha
            boolean r12 = r9.hasValue(r11)
            if (r12 == 0) goto L_0x00b6
            float r11 = r9.getFloat(r11, r13)
            goto L_0x00b7
        L_0x00b6:
            r11 = r13
        L_0x00b7:
            int r12 = android.os.Build.VERSION.SDK_INT
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r14) goto L_0x00ca
            int r12 = androidx.core.R$styleable.ColorStateListItem_android_lStar
            boolean r14 = r9.hasValue(r12)
            if (r14 == 0) goto L_0x00ca
            float r12 = r9.getFloat(r12, r15)
            goto L_0x00d0
        L_0x00ca:
            int r12 = androidx.core.R$styleable.ColorStateListItem_lStar
            float r12 = r9.getFloat(r12, r15)
        L_0x00d0:
            r9.recycle()
            int r9 = r37.getAttributeCount()
            int[] r14 = new int[r9]
            r4 = r7
            r15 = r4
        L_0x00db:
            if (r15 >= r9) goto L_0x0109
            int r13 = r1.getAttributeNameResource(r15)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r13 == r7) goto L_0x0101
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r13 == r7) goto L_0x0101
            int r7 = androidx.core.R$attr.alpha
            if (r13 == r7) goto L_0x0101
            int r7 = androidx.core.R$attr.lStar
            if (r13 == r7) goto L_0x0101
            int r7 = r4 + 1
            r0 = 0
            boolean r19 = r1.getAttributeBooleanValue(r15, r0)
            if (r19 == 0) goto L_0x00fd
            goto L_0x00fe
        L_0x00fd:
            int r13 = -r13
        L_0x00fe:
            r14[r4] = r13
            r4 = r7
        L_0x0101:
            int r15 = r15 + 1
            r0 = r35
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00db
        L_0x0109:
            int[] r0 = android.util.StateSet.trimStateSet(r14, r4)
            r4 = 0
            int r7 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            r9 = 1120403456(0x42c80000, float:100.0)
            if (r7 < 0) goto L_0x011a
            int r7 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r7 > 0) goto L_0x011a
            r7 = 1
            goto L_0x011b
        L_0x011a:
            r7 = 0
        L_0x011b:
            r13 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 != 0) goto L_0x012a
            if (r7 != 0) goto L_0x012a
            r4 = r0
            r28 = r3
            r16 = 1
            goto L_0x02f0
        L_0x012a:
            int r13 = android.graphics.Color.alpha(r10)
            float r13 = (float) r13
            float r13 = r13 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r11
            int r11 = (int) r13
            r13 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = al.g0.G(r11, r14, r13)
            if (r7 == 0) goto L_0x02e3
            b1.p r7 = b1.p.b(r10)
            float r10 = r7.f3977a
            float r7 = r7.f3978b
            m1.j r13 = m1.j.f13075k
            double r14 = (double) r7
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 < 0) goto L_0x02d9
            int r14 = java.lang.Math.round(r12)
            double r14 = (double) r14
            r19 = 0
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 <= 0) goto L_0x02d9
            int r14 = java.lang.Math.round(r12)
            double r14 = (double) r14
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 < 0) goto L_0x0166
            goto L_0x02d9
        L_0x0166:
            int r14 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x016c
            r10 = r4
            goto L_0x0172
        L_0x016c:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = java.lang.Math.min(r14, r10)
        L_0x0172:
            r20 = r4
            r15 = r7
            r14 = 0
            r19 = 1
        L_0x0178:
            float r21 = r20 - r7
            float r21 = java.lang.Math.abs(r21)
            r22 = 1053609165(0x3ecccccd, float:0.4)
            int r21 = (r21 > r22 ? 1 : (r21 == r22 ? 0 : -1))
            if (r21 < 0) goto L_0x02c8
            r21 = 1148846080(0x447a0000, float:1000.0)
            r23 = r4
            r24 = r9
            r22 = r21
            r25 = 0
        L_0x018f:
            float r26 = r23 - r24
            float r26 = java.lang.Math.abs(r26)
            r27 = 1008981770(0x3c23d70a, float:0.01)
            int r26 = (r26 > r27 ? 1 : (r26 == r27 ? 0 : -1))
            r27 = 1073741824(0x40000000, float:2.0)
            if (r26 <= 0) goto L_0x0284
            float r26 = r24 - r23
            float r26 = r26 / r27
            float r4 = r26 + r23
            b1.p r9 = b1.p.c(r4, r15, r10)
            m1.j r1 = m1.j.f13075k
            int r1 = r9.d(r1)
            int r9 = android.graphics.Color.red(r1)
            float r9 = p3.l0.k0(r9)
            int r28 = android.graphics.Color.green(r1)
            float r28 = p3.l0.k0(r28)
            int r29 = android.graphics.Color.blue(r1)
            float r29 = p3.l0.k0(r29)
            float[][] r30 = p3.l0.f13960r
            r16 = 1
            r30 = r30[r16]
            r18 = 0
            r31 = r30[r18]
            float r9 = r9 * r31
            r31 = r30[r16]
            float r28 = r28 * r31
            float r28 = r28 + r9
            r9 = 2
            r17 = r30[r9]
            float r29 = r29 * r17
            float r29 = r29 + r28
            r17 = 1120403456(0x42c80000, float:100.0)
            float r9 = r29 / r17
            r28 = 1007753895(0x3c111aa7, float:0.008856452)
            int r28 = (r9 > r28 ? 1 : (r9 == r28 ? 0 : -1))
            if (r28 > 0) goto L_0x01f2
            r28 = 1147261687(0x4461d2f7, float:903.2963)
            float r9 = r9 * r28
            r28 = r3
            goto L_0x0201
        L_0x01f2:
            r28 = r3
            double r2 = (double) r9
            double r2 = java.lang.Math.cbrt(r2)
            float r2 = (float) r2
            r3 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r3
            r3 = 1098907648(0x41800000, float:16.0)
            float r9 = r2 - r3
        L_0x0201:
            float r2 = r12 - r9
            float r2 = java.lang.Math.abs(r2)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0259
            b1.p r1 = b1.p.b(r1)
            float r3 = r1.f3979c
            r29 = r2
            float r2 = r1.f3978b
            b1.p r2 = b1.p.c(r3, r2, r10)
            float r3 = r1.f3980d
            r30 = r4
            float r4 = r2.f3980d
            float r3 = r3 - r4
            float r4 = r1.f3981e
            r31 = r10
            float r10 = r2.f3981e
            float r4 = r4 - r10
            float r10 = r1.f3982f
            float r2 = r2.f3982f
            float r10 = r10 - r2
            float r3 = r3 * r3
            float r4 = r4 * r4
            float r4 = r4 + r3
            float r10 = r10 * r10
            float r10 = r10 + r4
            double r2 = (double) r10
            double r2 = java.lang.Math.sqrt(r2)
            r32 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            r4 = r0
            r10 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r2, r0)
            double r0 = r0 * r32
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x0260
            r22 = r0
            r25 = r10
            r21 = r29
            goto L_0x0260
        L_0x0259:
            r30 = r4
            r31 = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r4 = r0
        L_0x0260:
            r0 = 0
            int r2 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x026a
            int r2 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x026a
            goto L_0x0293
        L_0x026a:
            int r2 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0271
            r23 = r30
            goto L_0x0273
        L_0x0271:
            r24 = r30
        L_0x0273:
            r1 = r37
            r2 = r38
            r9 = r17
            r3 = r28
            r10 = r31
            r34 = r4
            r4 = r0
            r0 = r34
            goto L_0x018f
        L_0x0284:
            r28 = r3
            r17 = r9
            r31 = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r34 = r4
            r4 = r0
            r0 = r34
        L_0x0293:
            r2 = r25
            if (r19 == 0) goto L_0x02a8
            if (r2 == 0) goto L_0x029e
            int r10 = r2.d(r13)
            goto L_0x02e8
        L_0x029e:
            float r2 = r7 - r20
            float r2 = r2 / r27
            float r2 = r2 + r20
            r15 = r2
            r19 = 0
            goto L_0x02b7
        L_0x02a8:
            if (r2 != 0) goto L_0x02ae
            r7 = r15
            r15 = r20
            goto L_0x02af
        L_0x02ae:
            r14 = r2
        L_0x02af:
            float r2 = r7 - r15
            float r2 = r2 / r27
            float r2 = r2 + r15
            r20 = r15
            r15 = r2
        L_0x02b7:
            r1 = r37
            r2 = r38
            r9 = r17
            r3 = r28
            r10 = r31
            r34 = r4
            r4 = r0
            r0 = r34
            goto L_0x0178
        L_0x02c8:
            r4 = r0
            r28 = r3
            r16 = 1
            if (r14 != 0) goto L_0x02d4
            int r10 = p3.l0.f0(r12)
            goto L_0x02e8
        L_0x02d4:
            int r10 = r14.d(r13)
            goto L_0x02e8
        L_0x02d9:
            r4 = r0
            r28 = r3
            r16 = 1
            int r10 = p3.l0.f0(r12)
            goto L_0x02e8
        L_0x02e3:
            r4 = r0
            r28 = r3
            r16 = 1
        L_0x02e8:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x02f0:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            r3 = 4
            if (r0 <= r1) goto L_0x0305
            if (r8 > r3) goto L_0x02fc
            r1 = r2
            goto L_0x02fe
        L_0x02fc:
            int r1 = r8 * 2
        L_0x02fe:
            int[] r1 = new int[r1]
            r7 = 0
            java.lang.System.arraycopy(r5, r7, r1, r7, r8)
            r5 = r1
        L_0x0305:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x0322
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            if (r8 > r3) goto L_0x0315
            goto L_0x0317
        L_0x0315:
            int r2 = r8 * 2
        L_0x0317:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            r6 = r1
        L_0x0322:
            r6[r8] = r4
            int[][] r6 = (int[][]) r6
            r1 = r37
            r2 = r38
            r8 = r0
            r4 = r16
            r3 = r28
            r7 = 0
            r0 = r35
            goto L_0x0020
        L_0x0334:
            r28 = r3
            r16 = r4
            r0 = r35
            r1 = r37
            r2 = r38
            r4 = r16
            r3 = r28
            r7 = 0
            goto L_0x0020
        L_0x0345:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x0356:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r36.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m1.a.b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
