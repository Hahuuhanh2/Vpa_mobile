package d6;

import android.content.Context;
import android.net.ConnectivityManager;
import e6.j;
import f0.b0;
import g6.m;
import java.net.MalformedURLException;
import java.net.URL;
import ua.d;
import ua.e;

/* compiled from: CctTransportBackend */
public final class b implements m {

    /* renamed from: a  reason: collision with root package name */
    public final d f8756a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f8757b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f8758c;

    /* renamed from: d  reason: collision with root package name */
    public final URL f8759d = c(a.f8750c);

    /* renamed from: e  reason: collision with root package name */
    public final o6.a f8760e;

    /* renamed from: f  reason: collision with root package name */
    public final o6.a f8761f;

    /* renamed from: g  reason: collision with root package name */
    public final int f8762g;

    /* compiled from: CctTransportBackend */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final URL f8763a;

        /* renamed from: b  reason: collision with root package name */
        public final j f8764b;

        /* renamed from: c  reason: collision with root package name */
        public final String f8765c;

        public a(URL url, j jVar, String str) {
            this.f8763a = url;
            this.f8764b = jVar;
            this.f8765c = str;
        }
    }

    /* renamed from: d6.b$b  reason: collision with other inner class name */
    /* compiled from: CctTransportBackend */
    public static final class C0089b {

        /* renamed from: a  reason: collision with root package name */
        public final int f8766a;

        /* renamed from: b  reason: collision with root package name */
        public final URL f8767b;

        /* renamed from: c  reason: collision with root package name */
        public final long f8768c;

        public C0089b(int i10, URL url, long j10) {
            this.f8766a = i10;
            this.f8767b = url;
            this.f8768c = j10;
        }
    }

    public b(Context context, o6.a aVar, o6.a aVar2) {
        e eVar = new e();
        e6.b.f9153a.configure(eVar);
        eVar.f15414d = true;
        this.f8756a = new d(eVar);
        this.f8758c = context;
        this.f8757b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f8760e = aVar2;
        this.f8761f = aVar;
        this.f8762g = 130000;
    }

    public static URL c(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(b0.r("Invalid url: ", str), e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x02a4 A[Catch:{ IOException -> 0x02ef }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x02b6 A[Catch:{ IOException -> 0x02ef }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final g6.b a(g6.a r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Iterable<f6.n> r3 = r1.f10373a
            java.util.Iterator r3 = r3.iterator()
        L_0x000f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x003b
            java.lang.Object r4 = r3.next()
            f6.n r4 = (f6.n) r4
            java.lang.String r5 = r4.g()
            boolean r6 = r2.containsKey(r5)
            if (r6 != 0) goto L_0x0031
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r4)
            r2.put(r5, r6)
            goto L_0x000f
        L_0x0031:
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
            goto L_0x000f
        L_0x003b:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0048:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "CctTransportBackend"
            r6 = 0
            if (r4 == 0) goto L_0x0263
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r7 = r4.getValue()
            java.util.List r7 = (java.util.List) r7
            r8 = 0
            java.lang.Object r7 = r7.get(r8)
            f6.n r7 = (f6.n) r7
            e6.p r17 = e6.p.DEFAULT
            o6.a r8 = r0.f8761f
            long r8 = r8.a()
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            o6.a r9 = r0.f8760e
            long r9 = r9.a()
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            e6.k$a r10 = e6.k.a.ANDROID_FIREBASE
            java.lang.String r11 = "sdk-version"
            int r11 = r7.f(r11)
            java.lang.Integer r19 = java.lang.Integer.valueOf(r11)
            java.lang.String r11 = "model"
            java.lang.String r20 = r7.a(r11)
            java.lang.String r11 = "hardware"
            java.lang.String r21 = r7.a(r11)
            java.lang.String r11 = "device"
            java.lang.String r22 = r7.a(r11)
            java.lang.String r11 = "product"
            java.lang.String r23 = r7.a(r11)
            java.lang.String r11 = "os-uild"
            java.lang.String r24 = r7.a(r11)
            java.lang.String r11 = "manufacturer"
            java.lang.String r25 = r7.a(r11)
            java.lang.String r11 = "fingerprint"
            java.lang.String r26 = r7.a(r11)
            java.lang.String r11 = "country"
            java.lang.String r28 = r7.a(r11)
            java.lang.String r11 = "locale"
            java.lang.String r27 = r7.a(r11)
            java.lang.String r11 = "mcc_mnc"
            java.lang.String r29 = r7.a(r11)
            java.lang.String r11 = "application_build"
            java.lang.String r30 = r7.a(r11)
            e6.c r7 = new e6.c
            r18 = r7
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            e6.e r13 = new e6.e
            r13.<init>(r10, r7)
            java.lang.Object r7 = r4.getKey()     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x00e5 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x00e5 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ NumberFormatException -> 0x00e5 }
            r15 = r6
            r14 = r7
            goto L_0x00ed
        L_0x00e5:
            java.lang.Object r7 = r4.getKey()
            java.lang.String r7 = (java.lang.String) r7
            r14 = r6
            r15 = r7
        L_0x00ed:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x00fc:
            boolean r7 = r4.hasNext()
            java.lang.String r10 = "Missing required properties:"
            java.lang.String r11 = ""
            if (r7 == 0) goto L_0x0228
            java.lang.Object r7 = r4.next()
            f6.n r7 = (f6.n) r7
            f6.m r12 = r7.d()
            r18 = r2
            c6.b r2 = r12.f10015a
            r16 = r4
            c6.b r4 = new c6.b
            r19 = r11
            java.lang.String r11 = "proto"
            r4.<init>(r11)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x012f
            byte[] r2 = r12.f10016b
            e6.f$a r4 = new e6.f$a
            r4.<init>()
            r4.f9216d = r2
            goto L_0x0150
        L_0x012f:
            c6.b r4 = new c6.b
            java.lang.String r11 = "json"
            r4.<init>(r11)
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x020c
            java.lang.String r2 = new java.lang.String
            byte[] r4 = r12.f10016b
            java.lang.String r11 = "UTF-8"
            java.nio.charset.Charset r11 = java.nio.charset.Charset.forName(r11)
            r2.<init>(r4, r11)
            e6.f$a r4 = new e6.f$a
            r4.<init>()
            r4.f9217e = r2
        L_0x0150:
            long r11 = r7.e()
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r4.f9213a = r2
            long r11 = r7.h()
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r4.f9215c = r2
            java.util.Map r2 = r7.b()
            java.lang.String r11 = "tz-offset"
            java.lang.Object r2 = r2.get(r11)
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0175
            r11 = 0
            goto L_0x017d
        L_0x0175:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r11 = r2.longValue()
        L_0x017d:
            java.lang.Long r2 = java.lang.Long.valueOf(r11)
            r4.f9218f = r2
            java.lang.String r2 = "net-type"
            int r2 = r7.f(r2)
            android.util.SparseArray<e6.o$b> r11 = e6.o.b.f9234a
            java.lang.Object r2 = r11.get(r2)
            e6.o$b r2 = (e6.o.b) r2
            java.lang.String r11 = "mobile-subtype"
            int r11 = r7.f(r11)
            android.util.SparseArray<e6.o$a> r12 = e6.o.a.f9232a
            java.lang.Object r11 = r12.get(r11)
            e6.o$a r11 = (e6.o.a) r11
            e6.i r12 = new e6.i
            r12.<init>(r2, r11)
            r4.f9219g = r12
            java.lang.Integer r2 = r7.c()
            if (r2 == 0) goto L_0x01b2
            java.lang.Integer r2 = r7.c()
            r4.f9214b = r2
        L_0x01b2:
            java.lang.Long r2 = r4.f9213a
            if (r2 != 0) goto L_0x01b9
            java.lang.String r11 = " eventTimeMs"
            goto L_0x01bb
        L_0x01b9:
            r11 = r19
        L_0x01bb:
            java.lang.Long r2 = r4.f9215c
            if (r2 != 0) goto L_0x01c5
            java.lang.String r2 = " eventUptimeMs"
            java.lang.String r11 = f0.b0.r(r11, r2)
        L_0x01c5:
            java.lang.Long r2 = r4.f9218f
            if (r2 != 0) goto L_0x01cf
            java.lang.String r2 = " timezoneOffsetSeconds"
            java.lang.String r11 = f0.b0.r(r11, r2)
        L_0x01cf:
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0202
            e6.f r2 = new e6.f
            java.lang.Long r7 = r4.f9213a
            long r20 = r7.longValue()
            java.lang.Integer r7 = r4.f9214b
            java.lang.Long r10 = r4.f9215c
            long r23 = r10.longValue()
            byte[] r10 = r4.f9216d
            java.lang.String r11 = r4.f9217e
            java.lang.Long r12 = r4.f9218f
            long r27 = r12.longValue()
            e6.o r4 = r4.f9219g
            r19 = r2
            r22 = r7
            r25 = r10
            r26 = r11
            r29 = r4
            r19.<init>(r20, r22, r23, r25, r26, r27, r29)
            r6.add(r2)
            goto L_0x0222
        L_0x0202:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = f0.b0.r(r10, r11)
            r1.<init>(r2)
            throw r1
        L_0x020c:
            java.lang.String r4 = j6.a.b(r5)
            r7 = 5
            boolean r4 = android.util.Log.isLoggable(r4, r7)
            if (r4 == 0) goto L_0x0222
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r7 = 0
            r4[r7] = r2
            java.lang.String r2 = "Received event of unsupported encoding %s. Skipping..."
            java.lang.String.format(r2, r4)
        L_0x0222:
            r4 = r16
            r2 = r18
            goto L_0x00fc
        L_0x0228:
            r18 = r2
            r19 = r11
            if (r8 != 0) goto L_0x0231
            java.lang.String r11 = " requestTimeMs"
            goto L_0x0233
        L_0x0231:
            r11 = r19
        L_0x0233:
            if (r9 != 0) goto L_0x023b
            java.lang.String r2 = " requestUptimeMs"
            java.lang.String r11 = f0.b0.r(r11, r2)
        L_0x023b:
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0259
            e6.g r2 = new e6.g
            long r4 = r8.longValue()
            long r11 = r9.longValue()
            r8 = r2
            r9 = r4
            r16 = r6
            r8.<init>(r9, r11, r13, r14, r15, r16, r17)
            r3.add(r2)
            r2 = r18
            goto L_0x0048
        L_0x0259:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = f0.b0.r(r10, r11)
            r1.<init>(r2)
            throw r1
        L_0x0263:
            r2 = 5
            e6.d r4 = new e6.d
            r4.<init>(r3)
            java.net.URL r3 = r0.f8759d
            byte[] r1 = r1.f10374b
            r7 = 3
            r8 = -1
            if (r1 == 0) goto L_0x028b
            d6.a r1 = d6.a.a(r1)     // Catch:{ IllegalArgumentException -> 0x0285 }
            java.lang.String r10 = r1.f8755b     // Catch:{ IllegalArgumentException -> 0x0285 }
            if (r10 == 0) goto L_0x027b
            goto L_0x027c
        L_0x027b:
            r10 = r6
        L_0x027c:
            java.lang.String r1 = r1.f8754a     // Catch:{ IllegalArgumentException -> 0x0285 }
            if (r1 == 0) goto L_0x028c
            java.net.URL r3 = c(r1)     // Catch:{ IllegalArgumentException -> 0x0285 }
            goto L_0x028c
        L_0x0285:
            g6.b r1 = new g6.b
            r1.<init>(r7, r8)
            return r1
        L_0x028b:
            r10 = r6
        L_0x028c:
            r1 = 2
            d6.b$a r11 = new d6.b$a     // Catch:{ IOException -> 0x02ef }
            r11.<init>(r3, r4, r10)     // Catch:{ IOException -> 0x02ef }
            ea.c r3 = new ea.c     // Catch:{ IOException -> 0x02ef }
            r4 = 12
            r3.<init>(r0, r4)     // Catch:{ IOException -> 0x02ef }
        L_0x0299:
            java.lang.Object r4 = r3.apply(r11)     // Catch:{ IOException -> 0x02ef }
            r10 = r4
            d6.b$b r10 = (d6.b.C0089b) r10     // Catch:{ IOException -> 0x02ef }
            java.net.URL r12 = r10.f8767b     // Catch:{ IOException -> 0x02ef }
            if (r12 == 0) goto L_0x02b6
            java.lang.String r13 = "Following redirect to: %s"
            j6.a.a(r5, r13, r12)     // Catch:{ IOException -> 0x02ef }
            java.net.URL r10 = r10.f8767b     // Catch:{ IOException -> 0x02ef }
            d6.b$a r12 = new d6.b$a     // Catch:{ IOException -> 0x02ef }
            e6.j r13 = r11.f8764b     // Catch:{ IOException -> 0x02ef }
            java.lang.String r11 = r11.f8765c     // Catch:{ IOException -> 0x02ef }
            r12.<init>(r10, r13, r11)     // Catch:{ IOException -> 0x02ef }
            r11 = r12
            goto L_0x02b7
        L_0x02b6:
            r11 = r6
        L_0x02b7:
            if (r11 == 0) goto L_0x02be
            int r2 = r2 + -1
            r10 = 1
            if (r2 >= r10) goto L_0x0299
        L_0x02be:
            d6.b$b r4 = (d6.b.C0089b) r4     // Catch:{ IOException -> 0x02ef }
            int r2 = r4.f8766a     // Catch:{ IOException -> 0x02ef }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x02cf
            long r2 = r4.f8768c     // Catch:{ IOException -> 0x02ef }
            g6.b r4 = new g6.b     // Catch:{ IOException -> 0x02ef }
            r6 = 1
            r4.<init>(r6, r2)     // Catch:{ IOException -> 0x02ef }
            return r4
        L_0x02cf:
            r3 = 500(0x1f4, float:7.0E-43)
            if (r2 >= r3) goto L_0x02e9
            r3 = 404(0x194, float:5.66E-43)
            if (r2 != r3) goto L_0x02d8
            goto L_0x02e9
        L_0x02d8:
            r3 = 400(0x190, float:5.6E-43)
            if (r2 != r3) goto L_0x02e3
            g6.b r2 = new g6.b     // Catch:{ IOException -> 0x02ef }
            r3 = 4
            r2.<init>(r3, r8)     // Catch:{ IOException -> 0x02ef }
            return r2
        L_0x02e3:
            g6.b r2 = new g6.b     // Catch:{ IOException -> 0x02ef }
            r2.<init>(r7, r8)     // Catch:{ IOException -> 0x02ef }
            return r2
        L_0x02e9:
            g6.b r2 = new g6.b     // Catch:{ IOException -> 0x02ef }
            r2.<init>(r1, r8)     // Catch:{ IOException -> 0x02ef }
            return r2
        L_0x02ef:
            java.lang.String r2 = j6.a.b(r5)
            r3 = 6
            android.util.Log.isLoggable(r2, r3)
            g6.b r2 = new g6.b
            r2.<init>(r1, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.b.a(g6.a):g6.b");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        if (e6.o.a.f9232a.get(r0) != null) goto L_0x00a4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f6.h b(f6.n r7) {
        /*
            r6 = this;
            android.net.ConnectivityManager r0 = r6.f8757b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            f6.h$a r7 = r7.i()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.util.Map<java.lang.String, java.lang.String> r2 = r7.f9996f
            java.lang.String r3 = "Property \"autoMetadata\" has not been set"
            if (r2 == 0) goto L_0x0119
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r4 = "sdk-version"
            r2.put(r4, r1)
            java.lang.String r1 = android.os.Build.MODEL
            java.lang.String r2 = "model"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.HARDWARE
            java.lang.String r2 = "hardware"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r2 = "device"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.PRODUCT
            java.lang.String r2 = "product"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.ID
            java.lang.String r2 = "os-uild"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r2 = "manufacturer"
            r7.a(r2, r1)
            java.lang.String r1 = android.os.Build.FINGERPRINT
            java.lang.String r2 = "fingerprint"
            r7.a(r2, r1)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r4 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r4)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f9996f
            if (r4 == 0) goto L_0x0113
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r4.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L_0x0076
            android.util.SparseArray<e6.o$b> r2 = e6.o.b.f9234a
            r2 = r1
            goto L_0x007a
        L_0x0076:
            int r2 = r0.getType()
        L_0x007a:
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f9996f
            if (r4 == 0) goto L_0x010d
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r5 = "net-type"
            r4.put(r5, r2)
            r2 = 0
            if (r0 != 0) goto L_0x008d
            android.util.SparseArray<e6.o$a> r0 = e6.o.a.f9232a
            goto L_0x00a3
        L_0x008d:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L_0x0098
            android.util.SparseArray<e6.o$a> r0 = e6.o.a.f9232a
            r0 = 100
            goto L_0x00a4
        L_0x0098:
            android.util.SparseArray<e6.o$a> r4 = e6.o.a.f9232a
            java.lang.Object r4 = r4.get(r0)
            e6.o$a r4 = (e6.o.a) r4
            if (r4 == 0) goto L_0x00a3
            goto L_0x00a4
        L_0x00a3:
            r0 = r2
        L_0x00a4:
            java.util.Map<java.lang.String, java.lang.String> r4 = r7.f9996f
            if (r4 == 0) goto L_0x0107
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = "mobile-subtype"
            r4.put(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = "country"
            r7.a(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r3 = "locale"
            r7.a(r3, r0)
            android.content.Context r0 = r6.f8758c
            java.lang.String r3 = "phone"
            java.lang.Object r0 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getSimOperator()
            java.lang.String r3 = "mcc_mnc"
            r7.a(r3, r0)
            android.content.Context r0 = r6.f8758c
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00ef }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x00ef }
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch:{ NameNotFoundException -> 0x00ef }
            int r1 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x00ef }
            goto L_0x00f9
        L_0x00ef:
            java.lang.String r0 = "CctTransportBackend"
            java.lang.String r0 = j6.a.b(r0)
            r2 = 6
            android.util.Log.isLoggable(r0, r2)
        L_0x00f9:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.lang.String r1 = "application_build"
            r7.a(r1, r0)
            f6.h r7 = r7.b()
            return r7
        L_0x0107:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x010d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0113:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        L_0x0119:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r7.<init>(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d6.b.b(f6.n):f6.h");
    }
}
