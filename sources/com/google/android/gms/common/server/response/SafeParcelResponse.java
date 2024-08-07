package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.util.Base64;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.util.VisibleForTesting;
import f7.c;
import h7.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m9.b;
import p3.l0;
import y6.j;

@VisibleForTesting
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new c();

    /* renamed from: a  reason: collision with root package name */
    public final int f5477a;

    /* renamed from: b  reason: collision with root package name */
    public final Parcel f5478b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5479c = 2;

    /* renamed from: d  reason: collision with root package name */
    public final zan f5480d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5481e;

    /* renamed from: f  reason: collision with root package name */
    public int f5482f;

    /* renamed from: n  reason: collision with root package name */
    public int f5483n;

    public SafeParcelResponse(int i10, Parcel parcel, zan zan) {
        String str;
        this.f5477a = i10;
        j.f(parcel);
        this.f5478b = parcel;
        this.f5480d = zan;
        if (zan == null) {
            str = null;
        } else {
            str = zan.f5492c;
        }
        this.f5481e = str;
        this.f5482f = 2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v16, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v21, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v8, resolved type: android.os.Parcel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v23, resolved type: java.lang.Object} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v22 */
    /* JADX WARNING: type inference failed for: r8v25 */
    /* JADX WARNING: type inference failed for: r8v26 */
    /* JADX WARNING: type inference failed for: r8v27 */
    /* JADX WARNING: type inference failed for: r8v28 */
    /* JADX WARNING: type inference failed for: r8v29 */
    /* JADX WARNING: type inference failed for: r8v30 */
    /* JADX WARNING: type inference failed for: r8v31 */
    /* JADX WARNING: type inference failed for: r8v32 */
    /* JADX WARNING: type inference failed for: r8v33 */
    /* JADX WARNING: type inference failed for: r8v34 */
    /* JADX WARNING: type inference failed for: r8v35 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=boolean[], code=?, for r8v19, types: [boolean[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void k(java.lang.StringBuilder r13, java.util.Map r14, android.os.Parcel r15) {
        /*
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.Set r14 = r14.entrySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x000d:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x0025
            java.lang.Object r1 = r14.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r2 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r2
            int r2 = r2.f5472n
            r0.put(r2, r1)
            goto L_0x000d
        L_0x0025:
            r14 = 123(0x7b, float:1.72E-43)
            r13.append(r14)
            int r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.t(r15)
            r1 = 0
            r2 = r1
        L_0x0030:
            int r3 = r15.dataPosition()
            if (r3 >= r14) goto L_0x0432
            int r3 = r15.readInt()
            char r4 = (char) r3
            java.lang.Object r4 = r0.get(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            if (r4 == 0) goto L_0x0030
            java.lang.String r5 = ","
            if (r2 == 0) goto L_0x004a
            r13.append(r5)
        L_0x004a:
            java.lang.Object r2 = r4.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r4.getValue()
            com.google.android.gms.common.server.response.FastJsonResponse$Field r4 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r4
            java.lang.String r6 = "\""
            r13.append(r6)
            r13.append(r2)
            java.lang.String r2 = "\":"
            r13.append(r2)
            com.google.android.gms.common.server.converter.StringToIntConverter r2 = r4.f5476r
            if (r2 == 0) goto L_0x0069
            r2 = 1
            goto L_0x006a
        L_0x0069:
            r2 = r1
        L_0x006a:
            r7 = 4
            r8 = 0
            if (r2 == 0) goto L_0x0158
            int r2 = r4.f5469d
            switch(r2) {
                case 0: goto L_0x0147;
                case 1: goto L_0x0126;
                case 2: goto L_0x0115;
                case 3: goto L_0x0101;
                case 4: goto L_0x00f0;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00d2;
                case 7: goto L_0x00c5;
                case 8: goto L_0x00b8;
                case 9: goto L_0x00b8;
                case 10: goto L_0x0087;
                case 11: goto L_0x007f;
                default: goto L_0x0073;
            }
        L_0x0073:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Unknown field out type = "
            java.lang.String r14 = android.support.v4.media.a.m(r14, r2)
            r13.<init>(r14)
            throw r13
        L_0x007f:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r14 = "Method does not accept concrete type."
            r13.<init>(r14)
            throw r13
        L_0x0087:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r3, r15)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.Set r5 = r2.keySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0098:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00af
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r2.getString(r6)
            y6.j.f(r7)
            r3.put(r6, r7)
            goto L_0x0098
        L_0x00af:
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.h(r4, r3)
            m(r13, r4, r2)
            goto L_0x042f
        L_0x00b8:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.c(r3, r15)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.h(r4, r2)
            m(r13, r4, r2)
            goto L_0x042f
        L_0x00c5:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r3, r15)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.h(r4, r2)
            m(r13, r4, r2)
            goto L_0x042f
        L_0x00d2:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.l(r3, r15)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.h(r4, r2)
            m(r13, r4, r2)
            goto L_0x042f
        L_0x00e3:
            java.math.BigDecimal r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.a(r3, r15)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.h(r4, r2)
            m(r13, r4, r2)
            goto L_0x042f
        L_0x00f0:
            double r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m(r3, r15)
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.h(r4, r2)
            m(r13, r4, r2)
            goto L_0x042f
        L_0x0101:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.v(r15, r3, r7)
            float r2 = r15.readFloat()
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.h(r4, r2)
            m(r13, r4, r2)
            goto L_0x042f
        L_0x0115:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r3, r15)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.h(r4, r2)
            m(r13, r4, r2)
            goto L_0x042f
        L_0x0126:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x0131
            goto L_0x013e
        L_0x0131:
            byte[] r5 = r15.createByteArray()
            int r3 = r3 + r2
            r15.setDataPosition(r3)
            java.math.BigInteger r8 = new java.math.BigInteger
            r8.<init>(r5)
        L_0x013e:
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.h(r4, r8)
            m(r13, r4, r2)
            goto L_0x042f
        L_0x0147:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r3, r15)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = com.google.android.gms.common.server.response.FastJsonResponse.h(r4, r2)
            m(r13, r4, r2)
            goto L_0x042f
        L_0x0158:
            boolean r2 = r4.f5470e
            if (r2 == 0) goto L_0x0319
            java.lang.String r2 = "["
            r13.append(r2)
            int r2 = r4.f5469d
            switch(r2) {
                case 0: goto L_0x02fd;
                case 1: goto L_0x02c6;
                case 2: goto L_0x02a2;
                case 3: goto L_0x027e;
                case 4: goto L_0x025a;
                case 5: goto L_0x021a;
                case 6: goto L_0x01f6;
                case 7: goto L_0x01db;
                case 8: goto L_0x01d3;
                case 9: goto L_0x01d3;
                case 10: goto L_0x01d3;
                case 11: goto L_0x016e;
                default: goto L_0x0166;
            }
        L_0x0166:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Unknown field type out."
            r13.<init>(r14)
            throw r13
        L_0x016e:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x0179
            goto L_0x01a4
        L_0x0179:
            int r6 = r15.readInt()
            android.os.Parcel[] r7 = new android.os.Parcel[r6]
            r9 = r1
        L_0x0180:
            if (r9 >= r6) goto L_0x019f
            int r10 = r15.readInt()
            if (r10 == 0) goto L_0x019a
            int r11 = r15.dataPosition()
            android.os.Parcel r12 = android.os.Parcel.obtain()
            r12.appendFrom(r15, r11, r10)
            r7[r9] = r12
            int r11 = r11 + r10
            r15.setDataPosition(r11)
            goto L_0x019c
        L_0x019a:
            r7[r9] = r8
        L_0x019c:
            int r9 = r9 + 1
            goto L_0x0180
        L_0x019f:
            int r3 = r3 + r2
            r15.setDataPosition(r3)
            r8 = r7
        L_0x01a4:
            int r2 = r8.length
            r3 = r1
        L_0x01a6:
            if (r3 >= r2) goto L_0x0312
            if (r3 <= 0) goto L_0x01ad
            r13.append(r5)
        L_0x01ad:
            r6 = r8[r3]
            r6.setDataPosition(r1)
            java.lang.String r6 = r4.f5474p
            y6.j.f(r6)
            com.google.android.gms.common.server.response.zan r6 = r4.f5475q
            y6.j.f(r6)
            com.google.android.gms.common.server.response.zan r6 = r4.f5475q
            java.lang.String r7 = r4.f5474p
            java.util.HashMap r6 = r6.f5491b
            java.lang.Object r6 = r6.get(r7)
            java.util.Map r6 = (java.util.Map) r6
            y6.j.f(r6)
            r7 = r8[r3]
            k(r13, r6, r7)
            int r3 = r3 + 1
            goto L_0x01a6
        L_0x01d3:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r14 = "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported"
            r13.<init>(r14)
            throw r13
        L_0x01db:
            java.lang.String[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.g(r3, r15)
            int r3 = r2.length
            r4 = r1
        L_0x01e1:
            if (r4 >= r3) goto L_0x0312
            if (r4 == 0) goto L_0x01e8
            r13.append(r5)
        L_0x01e8:
            r13.append(r6)
            r7 = r2[r4]
            r13.append(r7)
            r13.append(r6)
            int r4 = r4 + 1
            goto L_0x01e1
        L_0x01f6:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x0201
            goto L_0x0209
        L_0x0201:
            boolean[] r8 = r15.createBooleanArray()
            int r3 = r3 + r2
            r15.setDataPosition(r3)
        L_0x0209:
            int r2 = r8.length
            r3 = r1
        L_0x020b:
            if (r3 >= r2) goto L_0x0312
            if (r3 == 0) goto L_0x0212
            r13.append(r5)
        L_0x0212:
            boolean r4 = r8[r3]
            r13.append(r4)
            int r3 = r3 + 1
            goto L_0x020b
        L_0x021a:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x0225
            goto L_0x0249
        L_0x0225:
            int r4 = r15.readInt()
            java.math.BigDecimal[] r8 = new java.math.BigDecimal[r4]
            r6 = r1
        L_0x022c:
            if (r6 >= r4) goto L_0x0245
            byte[] r7 = r15.createByteArray()
            int r9 = r15.readInt()
            java.math.BigDecimal r10 = new java.math.BigDecimal
            java.math.BigInteger r11 = new java.math.BigInteger
            r11.<init>(r7)
            r10.<init>(r11, r9)
            r8[r6] = r10
            int r6 = r6 + 1
            goto L_0x022c
        L_0x0245:
            int r3 = r3 + r2
            r15.setDataPosition(r3)
        L_0x0249:
            int r2 = r8.length
            r3 = r1
        L_0x024b:
            if (r3 >= r2) goto L_0x0312
            if (r3 == 0) goto L_0x0252
            r13.append(r5)
        L_0x0252:
            r4 = r8[r3]
            r13.append(r4)
            int r3 = r3 + 1
            goto L_0x024b
        L_0x025a:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x0265
            goto L_0x026d
        L_0x0265:
            double[] r8 = r15.createDoubleArray()
            int r3 = r3 + r2
            r15.setDataPosition(r3)
        L_0x026d:
            int r2 = r8.length
            r3 = r1
        L_0x026f:
            if (r3 >= r2) goto L_0x0312
            if (r3 == 0) goto L_0x0276
            r13.append(r5)
        L_0x0276:
            r6 = r8[r3]
            r13.append(r6)
            int r3 = r3 + 1
            goto L_0x026f
        L_0x027e:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x0289
            goto L_0x0291
        L_0x0289:
            float[] r8 = r15.createFloatArray()
            int r3 = r3 + r2
            r15.setDataPosition(r3)
        L_0x0291:
            int r2 = r8.length
            r3 = r1
        L_0x0293:
            if (r3 >= r2) goto L_0x0312
            if (r3 == 0) goto L_0x029a
            r13.append(r5)
        L_0x029a:
            r4 = r8[r3]
            r13.append(r4)
            int r3 = r3 + 1
            goto L_0x0293
        L_0x02a2:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x02ad
            goto L_0x02b5
        L_0x02ad:
            long[] r8 = r15.createLongArray()
            int r3 = r3 + r2
            r15.setDataPosition(r3)
        L_0x02b5:
            int r2 = r8.length
            r3 = r1
        L_0x02b7:
            if (r3 >= r2) goto L_0x0312
            if (r3 == 0) goto L_0x02be
            r13.append(r5)
        L_0x02be:
            r6 = r8[r3]
            r13.append(r6)
            int r3 = r3 + 1
            goto L_0x02b7
        L_0x02c6:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x02d1
            goto L_0x02ec
        L_0x02d1:
            int r4 = r15.readInt()
            java.math.BigInteger[] r8 = new java.math.BigInteger[r4]
            r6 = r1
        L_0x02d8:
            if (r6 >= r4) goto L_0x02e8
            java.math.BigInteger r7 = new java.math.BigInteger
            byte[] r9 = r15.createByteArray()
            r7.<init>(r9)
            r8[r6] = r7
            int r6 = r6 + 1
            goto L_0x02d8
        L_0x02e8:
            int r3 = r3 + r2
            r15.setDataPosition(r3)
        L_0x02ec:
            int r2 = r8.length
            r3 = r1
        L_0x02ee:
            if (r3 >= r2) goto L_0x0312
            if (r3 == 0) goto L_0x02f5
            r13.append(r5)
        L_0x02f5:
            r4 = r8[r3]
            r13.append(r4)
            int r3 = r3 + 1
            goto L_0x02ee
        L_0x02fd:
            int[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.d(r3, r15)
            int r3 = r2.length
            r4 = r1
        L_0x0303:
            if (r4 >= r3) goto L_0x0312
            if (r4 == 0) goto L_0x030a
            r13.append(r5)
        L_0x030a:
            r6 = r2[r4]
            r13.append(r6)
            int r4 = r4 + 1
            goto L_0x0303
        L_0x0312:
            java.lang.String r2 = "]"
            r13.append(r2)
            goto L_0x042f
        L_0x0319:
            int r2 = r4.f5469d
            switch(r2) {
                case 0: goto L_0x0428;
                case 1: goto L_0x040c;
                case 2: goto L_0x0404;
                case 3: goto L_0x03f9;
                case 4: goto L_0x03f1;
                case 5: goto L_0x03e9;
                case 6: goto L_0x03e1;
                case 7: goto L_0x03cf;
                case 8: goto L_0x03ba;
                case 9: goto L_0x03a2;
                case 10: goto L_0x035d;
                case 11: goto L_0x0326;
                default: goto L_0x031e;
            }
        L_0x031e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Unknown field type out"
            r13.<init>(r14)
            throw r13
        L_0x0326:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x0331
            goto L_0x033c
        L_0x0331:
            android.os.Parcel r8 = android.os.Parcel.obtain()
            r8.appendFrom(r15, r3, r2)
            int r3 = r3 + r2
            r15.setDataPosition(r3)
        L_0x033c:
            r8.setDataPosition(r1)
            java.lang.String r2 = r4.f5474p
            y6.j.f(r2)
            com.google.android.gms.common.server.response.zan r2 = r4.f5475q
            y6.j.f(r2)
            com.google.android.gms.common.server.response.zan r2 = r4.f5475q
            java.lang.String r3 = r4.f5474p
            java.util.HashMap r2 = r2.f5491b
            java.lang.Object r2 = r2.get(r3)
            java.util.Map r2 = (java.util.Map) r2
            y6.j.f(r2)
            k(r13, r2, r8)
            goto L_0x042f
        L_0x035d:
            android.os.Bundle r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.b(r3, r15)
            java.util.Set r3 = r2.keySet()
            java.lang.String r4 = "{"
            r13.append(r4)
            java.util.Iterator r3 = r3.iterator()
            r4 = 1
        L_0x036f:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x039b
            java.lang.Object r7 = r3.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r4 != 0) goto L_0x0380
            r13.append(r5)
        L_0x0380:
            r13.append(r6)
            r13.append(r7)
            java.lang.String r4 = "\":\""
            r13.append(r4)
            java.lang.String r4 = r2.getString(r7)
            java.lang.String r4 = h7.f.a(r4)
            r13.append(r4)
            r13.append(r6)
            r4 = r1
            goto L_0x036f
        L_0x039b:
            java.lang.String r2 = "}"
            r13.append(r2)
            goto L_0x042f
        L_0x03a2:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.c(r3, r15)
            r13.append(r6)
            if (r2 != 0) goto L_0x03ac
            goto L_0x03b2
        L_0x03ac:
            r3 = 10
            java.lang.String r8 = android.util.Base64.encodeToString(r2, r3)
        L_0x03b2:
            r13.append(r8)
            r13.append(r6)
            goto L_0x042f
        L_0x03ba:
            byte[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.c(r3, r15)
            r13.append(r6)
            if (r2 != 0) goto L_0x03c4
            goto L_0x03c8
        L_0x03c4:
            java.lang.String r8 = android.util.Base64.encodeToString(r2, r1)
        L_0x03c8:
            r13.append(r8)
            r13.append(r6)
            goto L_0x042f
        L_0x03cf:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.f(r3, r15)
            r13.append(r6)
            java.lang.String r2 = h7.f.a(r2)
            r13.append(r2)
            r13.append(r6)
            goto L_0x042f
        L_0x03e1:
            boolean r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.l(r3, r15)
            r13.append(r2)
            goto L_0x042f
        L_0x03e9:
            java.math.BigDecimal r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.a(r3, r15)
            r13.append(r2)
            goto L_0x042f
        L_0x03f1:
            double r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.m(r3, r15)
            r13.append(r2)
            goto L_0x042f
        L_0x03f9:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.v(r15, r3, r7)
            float r2 = r15.readFloat()
            r13.append(r2)
            goto L_0x042f
        L_0x0404:
            long r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.p(r3, r15)
            r13.append(r2)
            goto L_0x042f
        L_0x040c:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.r(r3, r15)
            int r3 = r15.dataPosition()
            if (r2 != 0) goto L_0x0417
            goto L_0x0424
        L_0x0417:
            byte[] r4 = r15.createByteArray()
            int r3 = r3 + r2
            r15.setDataPosition(r3)
            java.math.BigInteger r8 = new java.math.BigInteger
            r8.<init>(r4)
        L_0x0424:
            r13.append(r8)
            goto L_0x042f
        L_0x0428:
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.o(r3, r15)
            r13.append(r2)
        L_0x042f:
            r2 = 1
            goto L_0x0030
        L_0x0432:
            int r0 = r15.dataPosition()
            if (r0 != r14) goto L_0x043e
            r14 = 125(0x7d, float:1.75E-43)
            r13.append(r14)
            return
        L_0x043e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException r13 = new com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException
            java.lang.String r0 = "Overread allowed size end="
            java.lang.String r14 = android.support.v4.media.a.m(r0, r14)
            r13.<init>(r14, r15)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.server.response.SafeParcelResponse.k(java.lang.StringBuilder, java.util.Map, android.os.Parcel):void");
    }

    public static final void l(StringBuilder sb2, int i10, Object obj) {
        String str = null;
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb2.append(obj);
                return;
            case 7:
                sb2.append("\"");
                j.f(obj);
                sb2.append(f.a(obj.toString()));
                sb2.append("\"");
                return;
            case 8:
                sb2.append("\"");
                byte[] bArr = (byte[]) obj;
                if (bArr != null) {
                    str = Base64.encodeToString(bArr, 0);
                }
                sb2.append(str);
                sb2.append("\"");
                return;
            case 9:
                sb2.append("\"");
                byte[] bArr2 = (byte[]) obj;
                if (bArr2 != null) {
                    str = Base64.encodeToString(bArr2, 10);
                }
                sb2.append(str);
                sb2.append("\"");
                return;
            case 10:
                j.f(obj);
                b.g0(sb2, (HashMap) obj);
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException(a.m("Unknown type = ", i10));
        }
    }

    public static final void m(StringBuilder sb2, FastJsonResponse.Field field, Object obj) {
        if (field.f5468c) {
            ArrayList arrayList = (ArrayList) obj;
            sb2.append("[");
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 != 0) {
                    sb2.append(",");
                }
                l(sb2, field.f5467b, arrayList.get(i10));
            }
            sb2.append("]");
            return;
        }
        l(sb2, field.f5467b, obj);
    }

    public final Map<String, FastJsonResponse.Field<?, ?>> a() {
        zan zan = this.f5480d;
        if (zan == null) {
            return null;
        }
        String str = this.f5481e;
        j.f(str);
        return (Map) zan.f5491b.get(str);
    }

    public final Object e() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final boolean g() {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public final Parcel j() {
        int i10 = this.f5482f;
        if (i10 == 0) {
            int n12 = l0.n1(20293, this.f5478b);
            this.f5483n = n12;
            l0.o1(n12, this.f5478b);
            this.f5482f = 2;
        } else if (i10 == 1) {
            l0.o1(this.f5483n, this.f5478b);
            this.f5482f = 2;
        }
        return this.f5478b;
    }

    public final String toString() {
        j.g(this.f5480d, "Cannot convert to JSON on client side.");
        Parcel j10 = j();
        j10.setDataPosition(0);
        StringBuilder sb2 = new StringBuilder(100);
        zan zan = this.f5480d;
        String str = this.f5481e;
        j.f(str);
        Map map = (Map) zan.f5491b.get(str);
        j.f(map);
        k(sb2, map, j10);
        return sb2.toString();
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        zan zan;
        int n12 = l0.n1(20293, parcel);
        l0.b1(parcel, 1, this.f5477a);
        Parcel j10 = j();
        if (j10 != null) {
            int n13 = l0.n1(2, parcel);
            parcel.appendFrom(j10, 0, j10.dataSize());
            l0.o1(n13, parcel);
        }
        int i11 = this.f5479c;
        if (i11 == 0) {
            zan = null;
        } else if (i11 != 1) {
            zan = this.f5480d;
        } else {
            zan = this.f5480d;
        }
        l0.e1(parcel, 3, zan, i10);
        l0.o1(n12, parcel);
    }
}
