package l7;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ClassLoader f12769a;

    /* renamed from: b  reason: collision with root package name */
    public static Thread f12770b;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0088, code lost:
        if (r1 == null) goto L_0x009c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.ClassLoader a() {
        /*
            java.lang.Class<l7.b> r0 = l7.b.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = f12769a     // Catch:{ all -> 0x00a5 }
            if (r1 != 0) goto L_0x00a1
            java.lang.Thread r1 = f12770b     // Catch:{ all -> 0x00a5 }
            r2 = 0
            if (r1 != 0) goto L_0x008d
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x00a5 }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x00a5 }
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch:{ all -> 0x00a5 }
            if (r1 != 0) goto L_0x001d
            r1 = r2
            goto L_0x0086
        L_0x001d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch:{ all -> 0x00a5 }
            int r4 = r1.activeGroupCount()     // Catch:{ SecurityException -> 0x007e }
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch:{ SecurityException -> 0x007e }
            r1.enumerate(r5)     // Catch:{ SecurityException -> 0x007e }
            r6 = 0
            r7 = r6
        L_0x002b:
            if (r7 >= r4) goto L_0x003f
            r8 = r5[r7]     // Catch:{ SecurityException -> 0x007e }
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch:{ SecurityException -> 0x007e }
            boolean r9 = r9.equals(r10)     // Catch:{ SecurityException -> 0x007e }
            if (r9 == 0) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x003f:
            r8 = r2
        L_0x0040:
            if (r8 != 0) goto L_0x0049
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x007e }
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch:{ SecurityException -> 0x007e }
        L_0x0049:
            int r1 = r8.activeCount()     // Catch:{ SecurityException -> 0x007e }
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch:{ SecurityException -> 0x007e }
            r8.enumerate(r4)     // Catch:{ SecurityException -> 0x007e }
        L_0x0052:
            if (r6 >= r1) goto L_0x0066
            r5 = r4[r6]     // Catch:{ SecurityException -> 0x007e }
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch:{ SecurityException -> 0x007e }
            boolean r7 = r7.equals(r9)     // Catch:{ SecurityException -> 0x007e }
            if (r7 == 0) goto L_0x0063
            goto L_0x0067
        L_0x0063:
            int r6 = r6 + 1
            goto L_0x0052
        L_0x0066:
            r5 = r2
        L_0x0067:
            if (r5 != 0) goto L_0x0084
            l7.a r1 = new l7.a     // Catch:{ SecurityException -> 0x0079 }
            r1.<init>(r8)     // Catch:{ SecurityException -> 0x0079 }
            r1.setContextClassLoader(r2)     // Catch:{ SecurityException -> 0x0076 }
            r1.start()     // Catch:{ SecurityException -> 0x0076 }
            r5 = r1
            goto L_0x0084
        L_0x0076:
            r4 = move-exception
            r5 = r1
            goto L_0x0081
        L_0x0079:
            r1 = move-exception
            r4 = r1
            goto L_0x0081
        L_0x007c:
            r1 = move-exception
            goto L_0x008b
        L_0x007e:
            r1 = move-exception
            r4 = r1
            r5 = r2
        L_0x0081:
            r4.getMessage()     // Catch:{ all -> 0x007c }
        L_0x0084:
            monitor-exit(r3)     // Catch:{ all -> 0x007c }
            r1 = r5
        L_0x0086:
            f12770b = r1     // Catch:{ all -> 0x00a5 }
            if (r1 != 0) goto L_0x008d
            goto L_0x009c
        L_0x008b:
            monitor-exit(r3)     // Catch:{ all -> 0x007c }
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x008d:
            monitor-enter(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.Thread r3 = f12770b     // Catch:{ SecurityException -> 0x0097 }
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch:{ SecurityException -> 0x0097 }
            goto L_0x009b
        L_0x0095:
            r2 = move-exception
            goto L_0x009f
        L_0x0097:
            r3 = move-exception
            r3.getMessage()     // Catch:{ all -> 0x0095 }
        L_0x009b:
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
        L_0x009c:
            f12769a = r2     // Catch:{ all -> 0x00a5 }
            goto L_0x00a1
        L_0x009f:
            monitor-exit(r1)     // Catch:{ all -> 0x0095 }
            throw r2     // Catch:{ all -> 0x00a5 }
        L_0x00a1:
            java.lang.ClassLoader r1 = f12769a     // Catch:{ all -> 0x00a5 }
            monitor-exit(r0)
            return r1
        L_0x00a5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l7.b.a():java.lang.ClassLoader");
    }
}
