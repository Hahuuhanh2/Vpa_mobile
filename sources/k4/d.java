package k4;

import android.os.Bundle;
import android.support.v4.media.a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.airbnb.lottie.c;
import ga.b;
import i3.e;
import ia.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NetworkCache */
public final class d implements e, b, ha.b {

    /* renamed from: b  reason: collision with root package name */
    public static Class f11966b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f11967c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f11968d;

    /* renamed from: e  reason: collision with root package name */
    public static boolean f11969e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f11970f;

    /* renamed from: n  reason: collision with root package name */
    public static boolean f11971n;

    /* renamed from: a  reason: collision with root package name */
    public Object f11972a;

    public /* synthetic */ d(Object obj) {
        this.f11972a = obj;
    }

    public static String e(String str, b bVar, boolean z10) {
        String str2;
        StringBuilder q10 = a.q("lottie_cache_");
        q10.append(str.replaceAll("\\W+", ""));
        if (z10) {
            StringBuilder q11 = a.q(".temp");
            q11.append(bVar.f11965a);
            str2 = q11.toString();
        } else {
            str2 = bVar.f11965a;
        }
        q10.append(str2);
        return q10.toString();
    }

    public static String h(Bundle bundle, String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String next : bundle.keySet()) {
            jSONObject2.put(next, bundle.get(next));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    public final void a(Bundle bundle, String str) {
        ha.a aVar = (ha.a) this.f11972a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + h(bundle, str));
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(ViewGroup viewGroup, View view) {
    }

    public final void c(ha.a aVar) {
        this.f11972a = aVar;
        Log.isLoggable("FirebaseCrashlytics", 3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:441:0x0696, code lost:
        if (r3.length() <= 0) goto L_0x069b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:442:0x0698, code lost:
        r2.append(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:0x069b, code lost:
        r2 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:444:0x06a6, code lost:
        if (r4.isEmpty() == false) goto L_0x06a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:445:0x06a8, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x06ac, code lost:
        return new cd.e(r0, r2, r4, (java.lang.String) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cd.e d(cd.b r23) {
        /*
            r22 = this;
            z.k r0 = new z.k
            r1 = r23
            r0.<init>((cd.b) r1)
            java.lang.Object r1 = r0.f17756c
            gd.b r1 = (gd.b) r1
            int r2 = r1.f10449g
            byte[] r3 = new byte[r2]
            java.lang.Object r4 = r0.f17754a
            cd.b r4 = (cd.b) r4
            int r5 = r4.f4690b
            int r4 = r4.f4689a
            r7 = 0
            r9 = r7
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r14 = r13
            r8 = 4
        L_0x001f:
            r15 = 1
            if (r8 != r5) goto L_0x0086
            if (r9 != 0) goto L_0x0086
            if (r10 != 0) goto L_0x0086
            int r10 = r11 + 1
            int r6 = r5 + -1
            boolean r17 = r0.d(r6, r7, r5, r4)
            int r17 = r17 << 1
            boolean r18 = r0.d(r6, r15, r5, r4)
            if (r18 == 0) goto L_0x0038
            r17 = r17 | 1
        L_0x0038:
            int r17 = r17 << 1
            r7 = 2
            boolean r6 = r0.d(r6, r7, r5, r4)
            if (r6 == 0) goto L_0x0043
            r17 = r17 | 1
        L_0x0043:
            int r6 = r17 << 1
            int r7 = r4 + -2
            r15 = 0
            boolean r7 = r0.d(r15, r7, r5, r4)
            if (r7 == 0) goto L_0x0050
            r6 = r6 | 1
        L_0x0050:
            r7 = 1
            int r6 = r6 << r7
            int r7 = r4 + -1
            boolean r19 = r0.d(r15, r7, r5, r4)
            if (r19 == 0) goto L_0x005c
            r6 = r6 | 1
        L_0x005c:
            r15 = 1
            int r6 = r6 << r15
            boolean r17 = r0.d(r15, r7, r5, r4)
            if (r17 == 0) goto L_0x0066
            r6 = r6 | 1
        L_0x0066:
            int r6 = r6 << r15
            r15 = 2
            boolean r19 = r0.d(r15, r7, r5, r4)
            if (r19 == 0) goto L_0x0070
            r6 = r6 | 1
        L_0x0070:
            r15 = 1
            int r6 = r6 << r15
            r15 = 3
            boolean r7 = r0.d(r15, r7, r5, r4)
            if (r7 == 0) goto L_0x007b
            r6 = r6 | 1
        L_0x007b:
            byte r6 = (byte) r6
            r3[r11] = r6
            int r8 = r8 + -2
            int r9 = r9 + 2
            r11 = r10
            r10 = 1
            goto L_0x0229
        L_0x0086:
            int r6 = r5 + -2
            if (r8 != r6) goto L_0x00f4
            if (r9 != 0) goto L_0x00f4
            r7 = r4 & 3
            if (r7 == 0) goto L_0x00f4
            if (r12 != 0) goto L_0x00f4
            int r7 = r11 + 1
            int r12 = r5 + -3
            r15 = 0
            boolean r12 = r0.d(r12, r15, r5, r4)
            r19 = r7
            r7 = 1
            int r12 = r12 << r7
            boolean r6 = r0.d(r6, r15, r5, r4)
            if (r6 == 0) goto L_0x00a7
            r12 = r12 | 1
        L_0x00a7:
            int r6 = r12 << 1
            int r12 = r5 + -1
            boolean r12 = r0.d(r12, r15, r5, r4)
            if (r12 == 0) goto L_0x00b3
            r6 = r6 | 1
        L_0x00b3:
            int r6 = r6 << r7
            int r12 = r4 + -4
            boolean r12 = r0.d(r15, r12, r5, r4)
            if (r12 == 0) goto L_0x00be
            r6 = r6 | 1
        L_0x00be:
            int r6 = r6 << r7
            int r12 = r4 + -3
            boolean r12 = r0.d(r15, r12, r5, r4)
            if (r12 == 0) goto L_0x00c9
            r6 = r6 | 1
        L_0x00c9:
            int r6 = r6 << r7
            int r12 = r4 + -2
            boolean r12 = r0.d(r15, r12, r5, r4)
            if (r12 == 0) goto L_0x00d4
            r6 = r6 | 1
        L_0x00d4:
            int r6 = r6 << r7
            int r12 = r4 + -1
            boolean r17 = r0.d(r15, r12, r5, r4)
            if (r17 == 0) goto L_0x00df
            r6 = r6 | 1
        L_0x00df:
            int r6 = r6 << r7
            boolean r12 = r0.d(r7, r12, r5, r4)
            if (r12 == 0) goto L_0x00e8
            r6 = r6 | 1
        L_0x00e8:
            byte r6 = (byte) r6
            r3[r11] = r6
            int r8 = r8 + -2
            int r9 = r9 + 2
            r11 = r19
            r12 = 1
            goto L_0x0229
        L_0x00f4:
            int r7 = r5 + 4
            if (r8 != r7) goto L_0x016e
            r7 = 2
            if (r9 != r7) goto L_0x016e
            r7 = r4 & 7
            if (r7 != 0) goto L_0x016e
            if (r13 != 0) goto L_0x016e
            int r6 = r11 + 1
            int r7 = r5 + -1
            r13 = 0
            boolean r15 = r0.d(r7, r13, r5, r4)
            r13 = 1
            int r15 = r15 << r13
            int r13 = r4 + -1
            boolean r7 = r0.d(r7, r13, r5, r4)
            if (r7 == 0) goto L_0x0116
            r15 = r15 | 1
        L_0x0116:
            r7 = 1
            int r15 = r15 << r7
            int r7 = r4 + -3
            r19 = r6
            r6 = 0
            boolean r18 = r0.d(r6, r7, r5, r4)
            if (r18 == 0) goto L_0x0125
            r15 = r15 | 1
        L_0x0125:
            r6 = 1
            int r15 = r15 << r6
            int r6 = r4 + -2
            r20 = r10
            r10 = 0
            boolean r18 = r0.d(r10, r6, r5, r4)
            if (r18 == 0) goto L_0x0134
            r15 = r15 | 1
        L_0x0134:
            r21 = r12
            r12 = 1
            int r15 = r15 << r12
            boolean r17 = r0.d(r10, r13, r5, r4)
            if (r17 == 0) goto L_0x0140
            r15 = r15 | 1
        L_0x0140:
            int r10 = r15 << 1
            boolean r7 = r0.d(r12, r7, r5, r4)
            if (r7 == 0) goto L_0x014a
            r10 = r10 | 1
        L_0x014a:
            int r7 = r10 << 1
            boolean r6 = r0.d(r12, r6, r5, r4)
            if (r6 == 0) goto L_0x0154
            r7 = r7 | 1
        L_0x0154:
            int r6 = r7 << 1
            boolean r7 = r0.d(r12, r13, r5, r4)
            if (r7 == 0) goto L_0x015e
            r6 = r6 | 1
        L_0x015e:
            byte r6 = (byte) r6
            r3[r11] = r6
            int r8 = r8 + -2
            int r9 = r9 + 2
            r11 = r19
            r10 = r20
            r12 = r21
            r13 = 1
            goto L_0x0229
        L_0x016e:
            r20 = r10
            r21 = r12
            if (r8 != r6) goto L_0x01dd
            if (r9 != 0) goto L_0x01dd
            r7 = r4 & 7
            r10 = 4
            if (r7 != r10) goto L_0x01dd
            if (r14 != 0) goto L_0x01dd
            int r7 = r11 + 1
            int r10 = r5 + -3
            r12 = 0
            boolean r10 = r0.d(r10, r12, r5, r4)
            r14 = 1
            int r10 = r10 << r14
            boolean r6 = r0.d(r6, r12, r5, r4)
            if (r6 == 0) goto L_0x0190
            r10 = r10 | 1
        L_0x0190:
            int r6 = r10 << 1
            int r10 = r5 + -1
            boolean r10 = r0.d(r10, r12, r5, r4)
            if (r10 == 0) goto L_0x019c
            r6 = r6 | 1
        L_0x019c:
            int r6 = r6 << r14
            int r10 = r4 + -2
            boolean r10 = r0.d(r12, r10, r5, r4)
            if (r10 == 0) goto L_0x01a7
            r6 = r6 | 1
        L_0x01a7:
            int r6 = r6 << r14
            int r10 = r4 + -1
            boolean r15 = r0.d(r12, r10, r5, r4)
            if (r15 == 0) goto L_0x01b2
            r6 = r6 | 1
        L_0x01b2:
            int r6 = r6 << r14
            boolean r12 = r0.d(r14, r10, r5, r4)
            if (r12 == 0) goto L_0x01bb
            r6 = r6 | 1
        L_0x01bb:
            int r6 = r6 << r14
            r12 = 2
            boolean r15 = r0.d(r12, r10, r5, r4)
            if (r15 == 0) goto L_0x01c5
            r6 = r6 | 1
        L_0x01c5:
            int r6 = r6 << r14
            r12 = 3
            boolean r10 = r0.d(r12, r10, r5, r4)
            if (r10 == 0) goto L_0x01cf
            r6 = r6 | 1
        L_0x01cf:
            byte r6 = (byte) r6
            r3[r11] = r6
            int r8 = r8 + -2
            int r9 = r9 + 2
            r11 = r7
            r10 = r20
            r12 = r21
            r14 = 1
            goto L_0x0229
        L_0x01dd:
            if (r8 >= r5) goto L_0x01f5
            if (r9 < 0) goto L_0x01f5
            java.lang.Object r6 = r0.f17755b
            cd.b r6 = (cd.b) r6
            boolean r6 = r6.b(r9, r8)
            if (r6 != 0) goto L_0x01f5
            int r6 = r11 + 1
            int r7 = r0.e(r8, r9, r5, r4)
            byte r7 = (byte) r7
            r3[r11] = r7
            r11 = r6
        L_0x01f5:
            int r8 = r8 + -2
            int r9 = r9 + 2
            if (r8 < 0) goto L_0x01fd
            if (r9 < r4) goto L_0x01dd
        L_0x01fd:
            int r8 = r8 + 1
            int r9 = r9 + 3
        L_0x0201:
            if (r8 < 0) goto L_0x0219
            if (r9 >= r4) goto L_0x0219
            java.lang.Object r6 = r0.f17755b
            cd.b r6 = (cd.b) r6
            boolean r6 = r6.b(r9, r8)
            if (r6 != 0) goto L_0x0219
            int r6 = r11 + 1
            int r7 = r0.e(r8, r9, r5, r4)
            byte r7 = (byte) r7
            r3[r11] = r7
            r11 = r6
        L_0x0219:
            int r8 = r8 + 2
            int r9 = r9 + -2
            if (r8 >= r5) goto L_0x0221
            if (r9 >= 0) goto L_0x0201
        L_0x0221:
            int r8 = r8 + 3
            int r9 = r9 + 1
            r10 = r20
            r12 = r21
        L_0x0229:
            if (r8 < r5) goto L_0x06bf
            if (r9 < r4) goto L_0x06bf
            java.lang.Object r0 = r0.f17756c
            gd.b r0 = (gd.b) r0
            int r0 = r0.f10449g
            if (r11 != r0) goto L_0x06b8
            gd.b$b r0 = r1.f10448f
            gd.b$a[] r4 = r0.f10453b
            int r5 = r4.length
            r6 = 0
            r7 = 0
        L_0x023c:
            if (r6 >= r5) goto L_0x0246
            r8 = r4[r6]
            int r8 = r8.f10450a
            int r7 = r7 + r8
            int r6 = r6 + 1
            goto L_0x023c
        L_0x0246:
            gd.a[] r5 = new gd.a[r7]
            int r6 = r4.length
            r8 = 0
            r9 = 0
        L_0x024b:
            if (r8 >= r6) goto L_0x026b
            r10 = r4[r8]
            r11 = 0
        L_0x0250:
            int r12 = r10.f10450a
            if (r11 >= r12) goto L_0x0268
            int r12 = r10.f10451b
            int r13 = r0.f10452a
            int r13 = r13 + r12
            int r14 = r9 + 1
            gd.a r15 = new gd.a
            byte[] r13 = new byte[r13]
            r15.<init>(r12, r13)
            r5[r9] = r15
            int r11 = r11 + 1
            r9 = r14
            goto L_0x0250
        L_0x0268:
            int r8 = r8 + 1
            goto L_0x024b
        L_0x026b:
            r8 = 0
            r4 = r5[r8]
            byte[] r4 = r4.f10441b
            int r4 = r4.length
            int r0 = r0.f10452a
            int r4 = r4 - r0
            int r0 = r4 + -1
            r6 = 0
            r8 = 0
        L_0x0278:
            if (r6 >= r0) goto L_0x028e
            r10 = 0
        L_0x027b:
            if (r10 >= r9) goto L_0x028b
            r11 = r5[r10]
            byte[] r11 = r11.f10441b
            int r12 = r8 + 1
            byte r8 = r3[r8]
            r11[r6] = r8
            int r10 = r10 + 1
            r8 = r12
            goto L_0x027b
        L_0x028b:
            int r6 = r6 + 1
            goto L_0x0278
        L_0x028e:
            int r1 = r1.f10443a
            r6 = 24
            if (r1 != r6) goto L_0x0296
            r1 = 1
            goto L_0x0297
        L_0x0296:
            r1 = 0
        L_0x0297:
            r6 = 8
            if (r1 == 0) goto L_0x029d
            r10 = r6
            goto L_0x029e
        L_0x029d:
            r10 = r9
        L_0x029e:
            r11 = 0
        L_0x029f:
            if (r11 >= r10) goto L_0x02af
            r12 = r5[r11]
            byte[] r12 = r12.f10441b
            int r13 = r8 + 1
            byte r8 = r3[r8]
            r12[r0] = r8
            int r11 = r11 + 1
            r8 = r13
            goto L_0x029f
        L_0x02af:
            r11 = 0
            r0 = r5[r11]
            byte[] r0 = r0.f10441b
            int r0 = r0.length
        L_0x02b5:
            r10 = 7
            if (r4 >= r0) goto L_0x02db
            r11 = 0
        L_0x02b9:
            if (r11 >= r9) goto L_0x02d8
            if (r1 == 0) goto L_0x02c1
            int r12 = r11 + 8
            int r12 = r12 % r9
            goto L_0x02c2
        L_0x02c1:
            r12 = r11
        L_0x02c2:
            if (r1 == 0) goto L_0x02c9
            if (r12 <= r10) goto L_0x02c9
            int r13 = r4 + -1
            goto L_0x02ca
        L_0x02c9:
            r13 = r4
        L_0x02ca:
            r12 = r5[r12]
            byte[] r12 = r12.f10441b
            int r14 = r8 + 1
            byte r8 = r3[r8]
            r12[r13] = r8
            int r11 = r11 + 1
            r8 = r14
            goto L_0x02b9
        L_0x02d8:
            int r4 = r4 + 1
            goto L_0x02b5
        L_0x02db:
            if (r8 != r2) goto L_0x06b0
            r0 = 0
            r1 = 0
        L_0x02df:
            if (r0 >= r7) goto L_0x02e9
            r2 = r5[r0]
            int r2 = r2.f10440a
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L_0x02df
        L_0x02e9:
            byte[] r0 = new byte[r1]
            r1 = 0
        L_0x02ec:
            if (r1 >= r7) goto L_0x032e
            r2 = r5[r1]
            byte[] r3 = r2.f10441b
            int r2 = r2.f10440a
            int r4 = r3.length
            int[] r8 = new int[r4]
            r9 = 0
        L_0x02f8:
            if (r9 >= r4) goto L_0x0303
            byte r11 = r3[r9]
            r11 = r11 & 255(0xff, float:3.57E-43)
            r8[r9] = r11
            int r9 = r9 + 1
            goto L_0x02f8
        L_0x0303:
            r15 = r22
            java.lang.Object r4 = r15.f11972a     // Catch:{ ReedSolomonException -> 0x0329 }
            z.d r4 = (z.d) r4     // Catch:{ ReedSolomonException -> 0x0329 }
            int r9 = r3.length     // Catch:{ ReedSolomonException -> 0x0329 }
            int r9 = r9 - r2
            r4.d(r8, r9)     // Catch:{ ReedSolomonException -> 0x0329 }
            r4 = 0
        L_0x030f:
            if (r4 >= r2) goto L_0x0319
            r9 = r8[r4]
            byte r9 = (byte) r9
            r3[r4] = r9
            int r4 = r4 + 1
            goto L_0x030f
        L_0x0319:
            r4 = 0
        L_0x031a:
            if (r4 >= r2) goto L_0x0326
            int r8 = r4 * r7
            int r8 = r8 + r1
            byte r9 = r3[r4]
            r0[r8] = r9
            int r4 = r4 + 1
            goto L_0x031a
        L_0x0326:
            int r1 = r1 + 1
            goto L_0x02ec
        L_0x0329:
            com.google.zxing.ChecksumException r0 = com.google.zxing.ChecksumException.a()
            throw r0
        L_0x032e:
            r15 = r22
            cd.c r1 = new cd.c
            r1.<init>(r0)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 100
            r2.<init>(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 0
            r3.<init>(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 1
            r4.<init>(r5)
            r5 = 2
        L_0x0349:
            r7 = 6
            r8 = 5
            r9 = 29
            r11 = 254(0xfe, float:3.56E-43)
            r12 = 2
            if (r5 != r12) goto L_0x03d0
            r5 = 0
        L_0x0353:
            int r12 = r1.b(r6)
            if (r12 == 0) goto L_0x03cb
            r13 = 128(0x80, float:1.794E-43)
            if (r12 > r13) goto L_0x0369
            if (r5 == 0) goto L_0x0361
            int r12 = r12 + 128
        L_0x0361:
            r5 = 1
            int r12 = r12 - r5
            char r5 = (char) r12
            r2.append(r5)
            r14 = 0
            goto L_0x03c0
        L_0x0369:
            r13 = 129(0x81, float:1.81E-43)
            if (r12 != r13) goto L_0x0370
            r7 = 1
        L_0x036e:
            r14 = 0
            goto L_0x03c1
        L_0x0370:
            r13 = 229(0xe5, float:3.21E-43)
            if (r12 > r13) goto L_0x0383
            int r12 = r12 + -130
            r13 = 10
            if (r12 >= r13) goto L_0x037f
            r13 = 48
            r2.append(r13)
        L_0x037f:
            r2.append(r12)
            goto L_0x03ad
        L_0x0383:
            java.lang.String r13 = "\u001e\u0004"
            switch(r12) {
                case 230: goto L_0x03b7;
                case 231: goto L_0x03b4;
                case 232: goto L_0x03af;
                case 233: goto L_0x03ad;
                case 234: goto L_0x03ad;
                case 235: goto L_0x03aa;
                case 236: goto L_0x03a0;
                case 237: goto L_0x0396;
                case 238: goto L_0x0394;
                case 239: goto L_0x0392;
                case 240: goto L_0x036e;
                case 241: goto L_0x03ad;
                default: goto L_0x0388;
            }
        L_0x0388:
            r14 = 0
            if (r12 != r11) goto L_0x03c6
            int r12 = r1.a()
            if (r12 != 0) goto L_0x03c6
            goto L_0x03ba
        L_0x0392:
            r7 = 4
            goto L_0x036e
        L_0x0394:
            r7 = r8
            goto L_0x036e
        L_0x0396:
            java.lang.String r12 = "[)>\u001e06\u001d"
            r2.append(r12)
            r14 = 0
            r3.insert(r14, r13)
            goto L_0x03ba
        L_0x03a0:
            r14 = 0
            java.lang.String r12 = "[)>\u001e05\u001d"
            r2.append(r12)
            r3.insert(r14, r13)
            goto L_0x03ba
        L_0x03aa:
            r14 = 0
            r5 = 1
            goto L_0x03ba
        L_0x03ad:
            r14 = 0
            goto L_0x03ba
        L_0x03af:
            r14 = 0
            r2.append(r9)
            goto L_0x03ba
        L_0x03b4:
            r14 = 0
            r7 = r10
            goto L_0x03c1
        L_0x03b7:
            r14 = 0
            r7 = 3
            goto L_0x03c1
        L_0x03ba:
            int r12 = r1.a()
            if (r12 > 0) goto L_0x0353
        L_0x03c0:
            r7 = 2
        L_0x03c1:
            r5 = r7
            r9 = 1
            r10 = 2
            goto L_0x0684
        L_0x03c6:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x03cb:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x03d0:
            r14 = 0
            int r5 = v.v.g(r5)
            r12 = 30
            r13 = 27
            r10 = 40
            r14 = 2
            if (r5 == r14) goto L_0x05cd
            r14 = 32
            r9 = 3
            if (r5 == r9) goto L_0x0512
            r9 = 4
            if (r5 == r9) goto L_0x04ae
            if (r5 == r8) goto L_0x0478
            if (r5 != r7) goto L_0x0473
            int r5 = r1.f4694b
            r7 = 1
            int r5 = r5 + r7
            int r8 = r1.b(r6)
            int r9 = r5 + 1
            int r5 = r5 * 149
            int r5 = r5 % 255
            int r5 = r5 + r7
            int r8 = r8 - r5
            if (r8 < 0) goto L_0x03fd
            goto L_0x03ff
        L_0x03fd:
            int r8 = r8 + 256
        L_0x03ff:
            if (r8 != 0) goto L_0x0408
            int r5 = r1.a()
            int r8 = r5 / 8
            goto L_0x0424
        L_0x0408:
            r5 = 250(0xfa, float:3.5E-43)
            if (r8 >= r5) goto L_0x040d
            goto L_0x0424
        L_0x040d:
            int r8 = r8 + -249
            int r8 = r8 * r5
            int r5 = r1.b(r6)
            int r7 = r9 + 1
            int r9 = r9 * 149
            int r9 = r9 % 255
            r10 = 1
            int r9 = r9 + r10
            int r5 = r5 - r9
            if (r5 < 0) goto L_0x0420
            goto L_0x0422
        L_0x0420:
            int r5 = r5 + 256
        L_0x0422:
            int r8 = r8 + r5
            r9 = r7
        L_0x0424:
            if (r8 < 0) goto L_0x046e
            byte[] r5 = new byte[r8]
            r7 = 0
        L_0x0429:
            if (r7 >= r8) goto L_0x044f
            int r10 = r1.a()
            if (r10 < r6) goto L_0x044a
            int r10 = r1.b(r6)
            int r11 = r9 + 1
            int r9 = r9 * 149
            int r9 = r9 % 255
            r12 = 1
            int r9 = r9 + r12
            int r10 = r10 - r9
            if (r10 < 0) goto L_0x0441
            goto L_0x0443
        L_0x0441:
            int r10 = r10 + 256
        L_0x0443:
            byte r9 = (byte) r10
            r5[r7] = r9
            int r7 = r7 + 1
            r9 = r11
            goto L_0x0429
        L_0x044a:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x044f:
            r4.add(r5)
            java.lang.String r7 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x045d }
            java.lang.String r8 = "ISO8859_1"
            r7.<init>(r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x045d }
            r2.append(r7)     // Catch:{ UnsupportedEncodingException -> 0x045d }
            goto L_0x0480
        L_0x045d:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Platform does not support required encoding: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x046e:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0473:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0478:
            int r5 = r1.a()
            r8 = 16
            if (r5 > r8) goto L_0x0483
        L_0x0480:
            r8 = 4
            goto L_0x050e
        L_0x0483:
            r5 = 0
            r8 = 4
        L_0x0485:
            if (r5 >= r8) goto L_0x04a7
            int r9 = r1.b(r7)
            r10 = 31
            if (r9 != r10) goto L_0x049a
            int r5 = r1.f4695c
            int r5 = 8 - r5
            if (r5 == r6) goto L_0x05da
            r1.b(r5)
            goto L_0x050e
        L_0x049a:
            r10 = r9 & 32
            if (r10 != 0) goto L_0x04a0
            r9 = r9 | 64
        L_0x04a0:
            char r9 = (char) r9
            r2.append(r9)
            int r5 = r5 + 1
            goto L_0x0485
        L_0x04a7:
            int r5 = r1.a()
            if (r5 > 0) goto L_0x0478
            goto L_0x050e
        L_0x04ae:
            r8 = r9
            r5 = 3
            int[] r7 = new int[r5]
        L_0x04b2:
            int r9 = r1.a()
            if (r9 != r6) goto L_0x04b9
            goto L_0x050e
        L_0x04b9:
            int r9 = r1.b(r6)
            if (r9 != r11) goto L_0x04c0
            goto L_0x050e
        L_0x04c0:
            int r12 = r1.b(r6)
            m9.b.Q(r9, r12, r7)
            r9 = 0
        L_0x04c8:
            if (r9 >= r5) goto L_0x0508
            r12 = r7[r9]
            if (r12 == 0) goto L_0x04ff
            r13 = 1
            if (r12 == r13) goto L_0x04f9
            r13 = 2
            if (r12 == r13) goto L_0x04f3
            if (r12 == r5) goto L_0x04ef
            r5 = 14
            if (r12 >= r5) goto L_0x04e1
            int r12 = r12 + 44
            char r5 = (char) r12
            r2.append(r5)
            goto L_0x0504
        L_0x04e1:
            if (r12 >= r10) goto L_0x04ea
            int r12 = r12 + 51
            char r5 = (char) r12
            r2.append(r5)
            goto L_0x0504
        L_0x04ea:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x04ef:
            r2.append(r14)
            goto L_0x0504
        L_0x04f3:
            r5 = 62
            r2.append(r5)
            goto L_0x0504
        L_0x04f9:
            r5 = 42
            r2.append(r5)
            goto L_0x0504
        L_0x04ff:
            r5 = 13
            r2.append(r5)
        L_0x0504:
            int r9 = r9 + 1
            r5 = 3
            goto L_0x04c8
        L_0x0508:
            int r5 = r1.a()
            if (r5 > 0) goto L_0x0510
        L_0x050e:
            goto L_0x05da
        L_0x0510:
            r5 = 3
            goto L_0x04b2
        L_0x0512:
            r5 = r9
            r8 = 4
            int[] r7 = new int[r5]
            r9 = 0
            r16 = 0
        L_0x0519:
            int r8 = r1.a()
            if (r8 != r6) goto L_0x0521
            goto L_0x05c1
        L_0x0521:
            int r8 = r1.b(r6)
            if (r8 != r11) goto L_0x0529
            goto L_0x05c1
        L_0x0529:
            int r11 = r1.b(r6)
            m9.b.Q(r8, r11, r7)
            r11 = r16
            r8 = 0
        L_0x0533:
            if (r8 >= r5) goto L_0x05bb
            r6 = r7[r8]
            if (r9 == 0) goto L_0x0592
            r10 = 1
            if (r9 == r10) goto L_0x0582
            r10 = 2
            if (r9 == r10) goto L_0x055e
            if (r9 != r5) goto L_0x0559
            char[] r5 = m9.b.A
            if (r6 >= r14) goto L_0x0554
            char r5 = r5[r6]
            if (r11 == 0) goto L_0x0550
            int r5 = r5 + 128
            char r5 = (char) r5
            r2.append(r5)
            goto L_0x058a
        L_0x0550:
            r2.append(r5)
            goto L_0x0590
        L_0x0554:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0559:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x055e:
            char[] r5 = m9.b.f13214z
            if (r6 >= r13) goto L_0x0571
            char r5 = r5[r6]
            if (r11 == 0) goto L_0x056d
            int r5 = r5 + 128
            char r5 = (char) r5
            r2.append(r5)
            goto L_0x058a
        L_0x056d:
            r2.append(r5)
            goto L_0x0590
        L_0x0571:
            if (r6 == r13) goto L_0x057c
            if (r6 != r12) goto L_0x0577
            r11 = 1
            goto L_0x0590
        L_0x0577:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x057c:
            r5 = 29
            r2.append(r5)
            goto L_0x0590
        L_0x0582:
            if (r11 == 0) goto L_0x058c
            int r6 = r6 + 128
            char r5 = (char) r6
            r2.append(r5)
        L_0x058a:
            r11 = 0
            goto L_0x0590
        L_0x058c:
            char r5 = (char) r6
            r2.append(r5)
        L_0x0590:
            r9 = 0
            goto L_0x05ad
        L_0x0592:
            if (r6 >= r5) goto L_0x0598
            int r5 = r6 + 1
            r9 = r5
            goto L_0x05ad
        L_0x0598:
            char[] r5 = m9.b.f13213y
            r10 = 40
            if (r6 >= r10) goto L_0x05b6
            char r5 = r5[r6]
            if (r11 == 0) goto L_0x05aa
            int r5 = r5 + 128
            char r5 = (char) r5
            r2.append(r5)
            r11 = 0
            goto L_0x05ad
        L_0x05aa:
            r2.append(r5)
        L_0x05ad:
            int r8 = r8 + 1
            r5 = 3
            r6 = 8
            r10 = 40
            goto L_0x0533
        L_0x05b6:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x05bb:
            int r5 = r1.a()
            if (r5 > 0) goto L_0x05c2
        L_0x05c1:
            goto L_0x05da
        L_0x05c2:
            r16 = r11
            r5 = 3
            r6 = 8
            r10 = 40
            r11 = 254(0xfe, float:3.56E-43)
            goto L_0x0519
        L_0x05cd:
            r5 = 3
            int[] r6 = new int[r5]
            r7 = 0
            r8 = 0
        L_0x05d2:
            int r9 = r1.a()
            r10 = 8
            if (r9 != r10) goto L_0x05dd
        L_0x05da:
            r10 = 2
            goto L_0x0682
        L_0x05dd:
            int r9 = r1.b(r10)
            r11 = 254(0xfe, float:3.56E-43)
            if (r9 != r11) goto L_0x05e6
            goto L_0x05da
        L_0x05e6:
            int r14 = r1.b(r10)
            m9.b.Q(r9, r14, r6)
            r9 = 0
        L_0x05ee:
            if (r9 >= r5) goto L_0x0679
            r14 = r6[r9]
            if (r8 == 0) goto L_0x0650
            r10 = 1
            if (r8 == r10) goto L_0x063b
            r10 = 2
            if (r8 == r10) goto L_0x0613
            if (r8 != r5) goto L_0x060e
            if (r7 == 0) goto L_0x0605
            int r14 = r14 + 224
            char r5 = (char) r14
            r2.append(r5)
            goto L_0x0621
        L_0x0605:
            int r14 = r14 + 96
            char r5 = (char) r14
            r2.append(r5)
        L_0x060b:
            r5 = 29
            goto L_0x064c
        L_0x060e:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0613:
            char[] r5 = m9.b.f13212x
            if (r14 >= r13) goto L_0x0628
            char r5 = r5[r14]
            if (r7 == 0) goto L_0x0624
            int r5 = r5 + 128
            char r5 = (char) r5
            r2.append(r5)
        L_0x0621:
            r5 = 29
            goto L_0x0646
        L_0x0624:
            r2.append(r5)
            goto L_0x060b
        L_0x0628:
            if (r14 == r13) goto L_0x0635
            if (r14 != r12) goto L_0x0630
            r5 = 29
            r7 = 1
            goto L_0x064c
        L_0x0630:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0635:
            r5 = 29
            r2.append(r5)
            goto L_0x064c
        L_0x063b:
            r5 = 29
            r10 = 2
            if (r7 == 0) goto L_0x0648
            int r14 = r14 + 128
            char r7 = (char) r14
            r2.append(r7)
        L_0x0646:
            r7 = 0
            goto L_0x064c
        L_0x0648:
            char r8 = (char) r14
            r2.append(r8)
        L_0x064c:
            r5 = 40
            r8 = 0
            goto L_0x066d
        L_0x0650:
            r10 = 2
            if (r14 >= r5) goto L_0x0658
            int r8 = r14 + 1
            r5 = 40
            goto L_0x066d
        L_0x0658:
            char[] r16 = m9.b.f13211w
            r5 = 40
            if (r14 >= r5) goto L_0x0674
            char r14 = r16[r14]
            if (r7 == 0) goto L_0x066a
            int r14 = r14 + 128
            char r7 = (char) r14
            r2.append(r7)
            r7 = 0
            goto L_0x066d
        L_0x066a:
            r2.append(r14)
        L_0x066d:
            int r9 = r9 + 1
            r5 = 3
            r10 = 8
            goto L_0x05ee
        L_0x0674:
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x0679:
            r5 = 40
            r10 = 2
            int r9 = r1.a()
            if (r9 > 0) goto L_0x06ad
        L_0x0682:
            r5 = r10
            r9 = 1
        L_0x0684:
            if (r5 == r9) goto L_0x0692
            int r6 = r1.a()
            if (r6 > 0) goto L_0x068d
            goto L_0x0692
        L_0x068d:
            r6 = 8
            r10 = 7
            goto L_0x0349
        L_0x0692:
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x069b
            r2.append(r3)
        L_0x069b:
            cd.e r1 = new cd.e
            java.lang.String r2 = r2.toString()
            boolean r3 = r4.isEmpty()
            r5 = 0
            if (r3 == 0) goto L_0x06a9
            r4 = r5
        L_0x06a9:
            r1.<init>(r0, r2, r4, r5)
            return r1
        L_0x06ad:
            r5 = 3
            goto L_0x05d2
        L_0x06b0:
            r15 = r22
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x06b8:
            r15 = r22
            com.google.zxing.FormatException r0 = com.google.zxing.FormatException.a()
            throw r0
        L_0x06bf:
            r15 = r22
            r7 = 0
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.d.d(cd.b):cd.e");
    }

    public final File f() {
        c cVar = (c) ((c) this.f11972a);
        cVar.getClass();
        File file = new File(cVar.f4771a.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public final JSONObject g() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        Log.isLoggable("FirebaseCrashlytics", 3);
        FileInputStream fileInputStream2 = null;
        try {
            File file = (File) this.f11972a;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    jSONObject = new JSONObject(h.i(fileInputStream));
                    fileInputStream2 = fileInputStream;
                } catch (Exception unused) {
                    h.b(fileInputStream);
                    return null;
                } catch (Throwable th2) {
                    Throwable th3 = th2;
                    fileInputStream2 = fileInputStream;
                    th = th3;
                    h.b(fileInputStream2);
                    throw th;
                }
            } else {
                Log.isLoggable("FirebaseCrashlytics", 2);
                jSONObject = null;
            }
            h.b(fileInputStream2);
            return jSONObject;
        } catch (Exception unused2) {
            fileInputStream = null;
            h.b(fileInputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
            h.b(fileInputStream2);
            throw th;
        }
    }

    public final File i(String str, InputStream inputStream, b bVar) {
        FileOutputStream fileOutputStream;
        File file = new File(f(), e(str, bVar, true));
        try {
            fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    inputStream.close();
                    return file;
                }
            }
        } catch (Throwable th2) {
            inputStream.close();
            throw th2;
        }
    }

    public final void setVisibility(int i10) {
        ((View) this.f11972a).setVisibility(i10);
    }

    public d(na.c cVar) {
        this.f11972a = new File(cVar.f13552b, "com.crashlytics.settings.json");
    }

    public d(int i10) {
        if (i10 == 2) {
            this.f11972a = (k0.a) k0.b.a(k0.a.class);
        } else if (i10 == 4) {
        } else {
            if (i10 != 6) {
                this.f11972a = new ArrayDeque();
            } else {
                this.f11972a = new z.d((Object) ed.a.f9344m);
            }
        }
    }
}
