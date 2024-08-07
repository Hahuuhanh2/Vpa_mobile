package ja;

import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f11825a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f11826b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f11825a = i10;
        this.f11826b = obj;
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [wb.d] */
    /* JADX WARNING: type inference failed for: r3v8, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: type inference failed for: r3v10, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13, types: [java.io.BufferedWriter, java.io.Writer] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0086 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c8 A[SYNTHETIC, Splitter:B:59:0x00c8] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf A[Catch:{ FileNotFoundException | JSONException -> 0x00cc, all -> 0x00c5 }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            int r0 = r7.f11825a
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0097
        L_0x0009:
            java.lang.Object r0 = r7.f11826b
            ja.h$a r0 = (ja.h.a) r0
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Callable<java.lang.Void>> r3 = r0.f11834b
            r3.set(r2)
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicMarkableReference<ja.b> r3 = r0.f11833a     // Catch:{ all -> 0x003c }
            boolean r3 = r3.isMarked()     // Catch:{ all -> 0x003c }
            if (r3 == 0) goto L_0x0041
            java.util.concurrent.atomic.AtomicMarkableReference<ja.b> r3 = r0.f11833a     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.getReference()     // Catch:{ all -> 0x003c }
            ja.b r3 = (ja.b) r3     // Catch:{ all -> 0x003c }
            monitor-enter(r3)     // Catch:{ all -> 0x003c }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x003e }
            java.util.HashMap r5 = r3.f11798a     // Catch:{ all -> 0x003e }
            r4.<init>(r5)     // Catch:{ all -> 0x003e }
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)     // Catch:{ all -> 0x003e }
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            java.util.concurrent.atomic.AtomicMarkableReference<ja.b> r3 = r0.f11833a     // Catch:{ all -> 0x003c }
            java.lang.Object r5 = r3.getReference()     // Catch:{ all -> 0x003c }
            ja.b r5 = (ja.b) r5     // Catch:{ all -> 0x003c }
            r3.set(r5, r1)     // Catch:{ all -> 0x003c }
            goto L_0x0042
        L_0x003c:
            r1 = move-exception
            goto L_0x0095
        L_0x003e:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            throw r1     // Catch:{ all -> 0x003c }
        L_0x0041:
            r4 = r2
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            if (r4 == 0) goto L_0x0094
            ja.h r1 = ja.h.this
            ja.d r3 = r1.f11827a
            java.lang.String r1 = r1.f11829c
            boolean r0 = r0.f11835c
            if (r0 == 0) goto L_0x0058
            na.c r0 = r3.f11805a
            java.lang.String r3 = "internal-keys"
            java.io.File r0 = r0.b(r1, r3)
            goto L_0x0060
        L_0x0058:
            na.c r0 = r3.f11805a
            java.lang.String r3 = "keys"
            java.io.File r0 = r0.b(r1, r3)
        L_0x0060:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.io.BufferedWriter r3 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            java.nio.charset.Charset r6 = ja.d.f11804b     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            r4.<init>(r5, r6)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0085, all -> 0x0083 }
            r3.write(r1)     // Catch:{ Exception -> 0x0086, all -> 0x0081 }
            r3.flush()     // Catch:{ Exception -> 0x0086, all -> 0x0081 }
            goto L_0x0089
        L_0x0081:
            r0 = move-exception
            goto L_0x0090
        L_0x0083:
            r0 = move-exception
            goto L_0x008f
        L_0x0085:
            r3 = r2
        L_0x0086:
            ja.d.d(r0)     // Catch:{ all -> 0x008d }
        L_0x0089:
            ia.h.b(r3)
            goto L_0x0094
        L_0x008d:
            r0 = move-exception
            r2 = r3
        L_0x008f:
            r3 = r2
        L_0x0090:
            ia.h.b(r3)
            throw r0
        L_0x0094:
            return r2
        L_0x0095:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r1
        L_0x0097:
            java.lang.Object r0 = r7.f11826b
            wb.h r0 = (wb.h) r0
            monitor-enter(r0)
            android.content.Context r3 = r0.f16786a     // Catch:{ FileNotFoundException | JSONException -> 0x00cc, all -> 0x00c5 }
            java.lang.String r4 = r0.f16787b     // Catch:{ FileNotFoundException | JSONException -> 0x00cc, all -> 0x00c5 }
            java.io.FileInputStream r3 = r3.openFileInput(r4)     // Catch:{ FileNotFoundException | JSONException -> 0x00cc, all -> 0x00c5 }
            int r4 = r3.available()     // Catch:{ FileNotFoundException | JSONException -> 0x00cd, all -> 0x00c2 }
            byte[] r5 = new byte[r4]     // Catch:{ FileNotFoundException | JSONException -> 0x00cd, all -> 0x00c2 }
            r3.read(r5, r1, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x00cd, all -> 0x00c2 }
            java.lang.String r1 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x00cd, all -> 0x00c2 }
            java.lang.String r4 = "UTF-8"
            r1.<init>(r5, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x00cd, all -> 0x00c2 }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x00cd, all -> 0x00c2 }
            r4.<init>(r1)     // Catch:{ FileNotFoundException | JSONException -> 0x00cd, all -> 0x00c2 }
            wb.d r2 = wb.d.a(r4)     // Catch:{ FileNotFoundException | JSONException -> 0x00cd, all -> 0x00c2 }
            r3.close()     // Catch:{ all -> 0x00d3 }
            monitor-exit(r0)
            goto L_0x00d7
        L_0x00c2:
            r1 = move-exception
            r2 = r3
            goto L_0x00c6
        L_0x00c5:
            r1 = move-exception
        L_0x00c6:
            if (r2 == 0) goto L_0x00cb
            r2.close()     // Catch:{ all -> 0x00d3 }
        L_0x00cb:
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00cc:
            r3 = r2
        L_0x00cd:
            if (r3 == 0) goto L_0x00d6
            r3.close()     // Catch:{ all -> 0x00d3 }
            goto L_0x00d6
        L_0x00d3:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00d6:
            monitor-exit(r0)
        L_0x00d7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.g.call():java.lang.Object");
    }
}
