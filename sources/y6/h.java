package y6;

import j$.util.concurrent.ConcurrentHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    public static final e f17557b = new e("LibraryVersion", "");

    /* renamed from: c  reason: collision with root package name */
    public static final h f17558c = new h();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f17559a = new ConcurrentHashMap();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a9 A[Catch:{ all -> 0x008c }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00da  */
    /* JADX WARNING: Unknown variable types count: 2 */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "Please provide a valid libraryName"
            y6.j.d(r1, r8)
            j$.util.concurrent.ConcurrentHashMap r1 = r7.f17559a
            boolean r1 = r1.containsKey(r8)
            if (r1 == 0) goto L_0x0018
            j$.util.concurrent.ConcurrentHashMap r0 = r7.f17559a
            java.lang.Object r8 = r0.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            return r8
        L_0x0018:
            java.util.Properties r1 = new java.util.Properties
            r1.<init>()
            r2 = 0
            java.lang.String r3 = "/%s.properties"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x008e }
            r5 = 0
            r4[r5] = r8     // Catch:{ IOException -> 0x008e }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ IOException -> 0x008e }
            java.lang.Class<y6.h> r4 = y6.h.class
            java.io.InputStream r3 = r4.getResourceAsStream(r3)     // Catch:{ IOException -> 0x008e }
            if (r3 == 0) goto L_0x0066
            r1.load(r3)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            java.lang.String r4 = "version"
            java.lang.String r2 = r1.getProperty(r4, r2)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            y6.e r1 = f17557b     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            r4.<init>()     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            r4.append(r8)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            java.lang.String r5 = " version is "
            r4.append(r5)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            r4.append(r2)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            r5 = 2
            java.lang.String r6 = r1.f17554a     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            boolean r5 = android.util.Log.isLoggable(r6, r5)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            if (r5 == 0) goto L_0x00b3
            java.lang.String r1 = r1.f17555b     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            if (r1 != 0) goto L_0x005f
            goto L_0x00b3
        L_0x005f:
            r1.concat(r4)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            goto L_0x00b3
        L_0x0063:
            r8 = move-exception
            goto L_0x00d8
        L_0x0066:
            y6.e r1 = f17557b     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            r4.<init>()     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            r4.append(r0)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            r4.append(r8)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            java.lang.String r5 = r1.f17554a     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            r6 = 5
            boolean r5 = android.util.Log.isLoggable(r5, r6)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            if (r5 == 0) goto L_0x00b3
            java.lang.String r1 = r1.f17555b     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            if (r1 != 0) goto L_0x0085
            goto L_0x00b3
        L_0x0085:
            r1.concat(r4)     // Catch:{ IOException -> 0x0089, all -> 0x0063 }
            goto L_0x00b3
        L_0x0089:
            r1 = r2
            r2 = r3
            goto L_0x008f
        L_0x008c:
            r8 = move-exception
            goto L_0x00d7
        L_0x008e:
            r1 = r2
        L_0x008f:
            y6.e r3 = f17557b     // Catch:{ all -> 0x008c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008c }
            r4.<init>()     // Catch:{ all -> 0x008c }
            r4.append(r0)     // Catch:{ all -> 0x008c }
            r4.append(r8)     // Catch:{ all -> 0x008c }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x008c }
            java.lang.String r4 = r3.f17554a     // Catch:{ all -> 0x008c }
            r5 = 6
            boolean r4 = android.util.Log.isLoggable(r4, r5)     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x00b1
            java.lang.String r3 = r3.f17555b     // Catch:{ all -> 0x008c }
            if (r3 != 0) goto L_0x00ae
            goto L_0x00b1
        L_0x00ae:
            r3.concat(r0)     // Catch:{ all -> 0x008c }
        L_0x00b1:
            r3 = r2
            r2 = r1
        L_0x00b3:
            if (r3 == 0) goto L_0x00b8
            h7.e.a(r3)
        L_0x00b8:
            if (r2 != 0) goto L_0x00d1
            y6.e r0 = f17557b
            r1 = 3
            java.lang.String r2 = r0.f17554a
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L_0x00cf
            java.lang.String r0 = r0.f17555b
            if (r0 != 0) goto L_0x00ca
            goto L_0x00cf
        L_0x00ca:
            java.lang.String r1 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.concat(r1)
        L_0x00cf:
            java.lang.String r2 = "UNKNOWN"
        L_0x00d1:
            j$.util.concurrent.ConcurrentHashMap r0 = r7.f17559a
            r0.put(r8, r2)
            return r2
        L_0x00d7:
            r3 = r2
        L_0x00d8:
            if (r3 == 0) goto L_0x00dd
            h7.e.a(r3)
        L_0x00dd:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: y6.h.a(java.lang.String):java.lang.String");
    }
}
