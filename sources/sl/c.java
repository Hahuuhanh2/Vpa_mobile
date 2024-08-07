package sl;

import f0.b0;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.threeten.bp.zone.ZoneRulesException;
import p3.l0;

/* compiled from: TzdbZoneRulesProvider */
public final class c extends h {

    /* renamed from: c  reason: collision with root package name */
    public List<String> f22941c;

    /* renamed from: d  reason: collision with root package name */
    public final ConcurrentSkipListMap f22942d = new ConcurrentSkipListMap();

    /* renamed from: e  reason: collision with root package name */
    public CopyOnWriteArraySet f22943e = new CopyOnWriteArraySet();

    /* compiled from: TzdbZoneRulesProvider */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f22944a;

        /* renamed from: b  reason: collision with root package name */
        public final String[] f22945b;

        /* renamed from: c  reason: collision with root package name */
        public final short[] f22946c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceArray<Object> f22947d;

        public a(String str, String[] strArr, short[] sArr, AtomicReferenceArray<Object> atomicReferenceArray) {
            this.f22947d = atomicReferenceArray;
            this.f22944a = str;
            this.f22945b = strArr;
            this.f22946c = sArr;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: sl.b} */
        /* JADX WARNING: type inference failed for: r4v2, types: [sl.d] */
        /* JADX WARNING: type inference failed for: r0v17, types: [sl.e] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final sl.f a(short r11) {
            /*
                r10 = this;
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r0 = r10.f22947d
                java.lang.Object r0 = r0.get(r11)
                boolean r1 = r0 instanceof byte[]
                if (r1 == 0) goto L_0x00b1
                byte[] r0 = (byte[]) r0
                java.io.DataInputStream r1 = new java.io.DataInputStream
                java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
                r2.<init>(r0)
                r1.<init>(r2)
                byte r0 = r1.readByte()
                r2 = 1
                if (r0 == r2) goto L_0x0052
                r2 = 2
                if (r0 == r2) goto L_0x0031
                r2 = 3
                if (r0 != r2) goto L_0x0029
                sl.e r0 = sl.e.a(r1)
                goto L_0x00ac
            L_0x0029:
                java.io.StreamCorruptedException r11 = new java.io.StreamCorruptedException
                java.lang.String r0 = "Unknown serialized type"
                r11.<init>(r0)
                throw r11
            L_0x0031:
                long r2 = sl.a.a(r1)
                nl.k r0 = sl.a.b(r1)
                nl.k r1 = sl.a.b(r1)
                boolean r4 = r0.equals(r1)
                if (r4 != 0) goto L_0x004a
                sl.d r4 = new sl.d
                r4.<init>((long) r2, (nl.k) r0, (nl.k) r1)
                r0 = r4
                goto L_0x00ac
            L_0x004a:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Offsets must not be equal"
                r11.<init>(r0)
                throw r11
            L_0x0052:
                int r0 = r1.readInt()
                long[] r4 = new long[r0]
                r3 = 0
                r5 = r3
            L_0x005a:
                if (r5 >= r0) goto L_0x0065
                long r6 = sl.a.a(r1)
                r4[r5] = r6
                int r5 = r5 + 1
                goto L_0x005a
            L_0x0065:
                int r0 = r0 + r2
                nl.k[] r5 = new nl.k[r0]
                r6 = r3
            L_0x0069:
                if (r6 >= r0) goto L_0x0074
                nl.k r7 = sl.a.b(r1)
                r5[r6] = r7
                int r6 = r6 + 1
                goto L_0x0069
            L_0x0074:
                int r0 = r1.readInt()
                long[] r6 = new long[r0]
                r7 = r3
            L_0x007b:
                if (r7 >= r0) goto L_0x0086
                long r8 = sl.a.a(r1)
                r6[r7] = r8
                int r7 = r7 + 1
                goto L_0x007b
            L_0x0086:
                int r0 = r0 + r2
                nl.k[] r7 = new nl.k[r0]
                r2 = r3
            L_0x008a:
                if (r2 >= r0) goto L_0x0095
                nl.k r8 = sl.a.b(r1)
                r7[r2] = r8
                int r2 = r2 + 1
                goto L_0x008a
            L_0x0095:
                byte r0 = r1.readByte()
                sl.e[] r8 = new sl.e[r0]
            L_0x009b:
                if (r3 >= r0) goto L_0x00a6
                sl.e r2 = sl.e.a(r1)
                r8[r3] = r2
                int r3 = r3 + 1
                goto L_0x009b
            L_0x00a6:
                sl.b r0 = new sl.b
                r3 = r0
                r3.<init>(r4, r5, r6, r7, r8)
            L_0x00ac:
                java.util.concurrent.atomic.AtomicReferenceArray<java.lang.Object> r1 = r10.f22947d
                r1.set(r11, r0)
            L_0x00b1:
                sl.f r0 = (sl.f) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: sl.c.a.a(short):sl.f");
        }

        public final String toString() {
            return this.f22944a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.InputStream} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e A[Catch:{ Exception -> 0x0056 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c() {
        /*
            r7 = this;
            r7.<init>()
            java.util.concurrent.ConcurrentSkipListMap r0 = new java.util.concurrent.ConcurrentSkipListMap
            r0.<init>()
            r7.f22942d = r0
            java.util.concurrent.CopyOnWriteArraySet r0 = new java.util.concurrent.CopyOnWriteArraySet
            r0.<init>()
            r7.f22943e = r0
            java.lang.Class<sl.h> r0 = sl.h.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "org/threeten/bp/TZDB.dat"
            java.util.Enumeration r0 = r0.getResources(r2)     // Catch:{ Exception -> 0x0067 }
            r2 = 0
            r4 = r1
            r3 = r2
        L_0x0021:
            boolean r5 = r0.hasMoreElements()     // Catch:{ Exception -> 0x0064 }
            if (r5 == 0) goto L_0x0059
            java.lang.Object r5 = r0.nextElement()     // Catch:{ Exception -> 0x0064 }
            java.net.URL r5 = (java.net.URL) r5     // Catch:{ Exception -> 0x0064 }
            java.util.concurrent.CopyOnWriteArraySet r4 = r7.f22943e     // Catch:{ Exception -> 0x0056 }
            java.lang.String r6 = r5.toExternalForm()     // Catch:{ Exception -> 0x0056 }
            boolean r4 = r4.add(r6)     // Catch:{ Exception -> 0x0056 }
            if (r4 == 0) goto L_0x0052
            java.io.InputStream r4 = r5.openStream()     // Catch:{ all -> 0x004b }
            boolean r6 = r7.e(r4)     // Catch:{ all -> 0x0048 }
            r6 = r6 | r2
            if (r4 == 0) goto L_0x0053
            r4.close()     // Catch:{ Exception -> 0x0056 }
            goto L_0x0053
        L_0x0048:
            r0 = move-exception
            r1 = r4
            goto L_0x004c
        L_0x004b:
            r0 = move-exception
        L_0x004c:
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ Exception -> 0x0056 }
        L_0x0051:
            throw r0     // Catch:{ Exception -> 0x0056 }
        L_0x0052:
            r6 = r2
        L_0x0053:
            r3 = r3 | r6
            r4 = r5
            goto L_0x0021
        L_0x0056:
            r0 = move-exception
            r1 = r5
            goto L_0x0068
        L_0x0059:
            if (r3 == 0) goto L_0x005c
            return
        L_0x005c:
            org.threeten.bp.zone.ZoneRulesException r0 = new org.threeten.bp.zone.ZoneRulesException
            java.lang.String r1 = "No time-zone rules found for 'TZDB'"
            r0.<init>(r1)
            throw r0
        L_0x0064:
            r0 = move-exception
            r1 = r4
            goto L_0x0068
        L_0x0067:
            r0 = move-exception
        L_0x0068:
            org.threeten.bp.zone.ZoneRulesException r2 = new org.threeten.bp.zone.ZoneRulesException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unable to load TZDB time-zone rules: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.c.<init>():void");
    }

    public f b(String str, boolean z10) {
        f fVar;
        l0.y0(str, "zoneId");
        a aVar = (a) this.f22942d.lastEntry().getValue();
        int binarySearch = Arrays.binarySearch(aVar.f22945b, str);
        if (binarySearch < 0) {
            fVar = null;
        } else {
            try {
                fVar = aVar.a(aVar.f22946c[binarySearch]);
            } catch (Exception e10) {
                StringBuilder w9 = b0.w("Invalid binary time-zone data: TZDB:", str, ", version: ");
                w9.append(aVar.f22944a);
                throw new ZoneRulesException(w9.toString(), e10);
            }
        }
        if (fVar != null) {
            return fVar;
        }
        throw new ZoneRulesException(b0.r("Unknown time-zone ID: ", str));
    }

    public Set<String> c() {
        return new HashSet(this.f22941c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.io.InputStream r14) {
        /*
            r13 = this;
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r14)
            byte r14 = r0.readByte()
            r1 = 1
            java.lang.String r2 = "File format not recognised"
            if (r14 != r1) goto L_0x00d7
            java.lang.String r14 = r0.readUTF()
            java.lang.String r3 = "TZDB"
            boolean r14 = r3.equals(r14)
            if (r14 == 0) goto L_0x00d1
            short r14 = r0.readShort()
            java.lang.String[] r2 = new java.lang.String[r14]
            r3 = 0
            r4 = r3
        L_0x0022:
            if (r4 >= r14) goto L_0x002d
            java.lang.String r5 = r0.readUTF()
            r2[r4] = r5
            int r4 = r4 + 1
            goto L_0x0022
        L_0x002d:
            short r4 = r0.readShort()
            java.lang.String[] r5 = new java.lang.String[r4]
            r6 = r3
        L_0x0034:
            if (r6 >= r4) goto L_0x003f
            java.lang.String r7 = r0.readUTF()
            r5[r6] = r7
            int r6 = r6 + 1
            goto L_0x0034
        L_0x003f:
            java.util.List r4 = java.util.Arrays.asList(r5)
            r13.f22941c = r4
            short r4 = r0.readShort()
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r7 = r3
        L_0x004c:
            if (r7 >= r4) goto L_0x005c
            short r8 = r0.readShort()
            byte[] r8 = new byte[r8]
            r0.readFully(r8)
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x004c
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceArray r4 = new java.util.concurrent.atomic.AtomicReferenceArray
            r4.<init>(r6)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r14)
            r7 = r3
        L_0x0067:
            if (r7 >= r14) goto L_0x0092
            short r8 = r0.readShort()
            java.lang.String[] r9 = new java.lang.String[r8]
            short[] r10 = new short[r8]
            r11 = r3
        L_0x0072:
            if (r11 >= r8) goto L_0x0085
            short r12 = r0.readShort()
            r12 = r5[r12]
            r9[r11] = r12
            short r12 = r0.readShort()
            r10[r11] = r12
            int r11 = r11 + 1
            goto L_0x0072
        L_0x0085:
            sl.c$a r8 = new sl.c$a
            r11 = r2[r7]
            r8.<init>(r11, r9, r10, r4)
            r6.add(r8)
            int r7 = r7 + 1
            goto L_0x0067
        L_0x0092:
            java.util.Iterator r14 = r6.iterator()
        L_0x0096:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00d0
            java.lang.Object r0 = r14.next()
            sl.c$a r0 = (sl.c.a) r0
            java.util.concurrent.ConcurrentSkipListMap r2 = r13.f22942d
            java.lang.String r3 = r0.f22944a
            java.lang.Object r2 = r2.putIfAbsent(r3, r0)
            sl.c$a r2 = (sl.c.a) r2
            if (r2 == 0) goto L_0x00ce
            java.lang.String r2 = r2.f22944a
            java.lang.String r3 = r0.f22944a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x00b9
            goto L_0x00ce
        L_0x00b9:
            org.threeten.bp.zone.ZoneRulesException r14 = new org.threeten.bp.zone.ZoneRulesException
            java.lang.String r1 = "Data already loaded for TZDB time-zone rules version: "
            java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
            java.lang.String r0 = r0.f22944a
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L_0x00ce:
            r3 = r1
            goto L_0x0096
        L_0x00d0:
            return r3
        L_0x00d1:
            java.io.StreamCorruptedException r14 = new java.io.StreamCorruptedException
            r14.<init>(r2)
            throw r14
        L_0x00d7:
            java.io.StreamCorruptedException r14 = new java.io.StreamCorruptedException
            r14.<init>(r2)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: sl.c.e(java.io.InputStream):boolean");
    }

    public final String toString() {
        return "TZDB";
    }
}
