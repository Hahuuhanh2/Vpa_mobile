package f0;

import c0.j;
import c0.p0;
import d0.a;
import f0.r;
import h0.g;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import v.u;

/* compiled from: CameraStateRegistry */
public final class t implements a.C0084a {

    /* renamed from: a  reason: collision with root package name */
    public final StringBuilder f9594a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    public final Object f9595b;

    /* renamed from: c  reason: collision with root package name */
    public int f9596c;

    /* renamed from: d  reason: collision with root package name */
    public final d0.a f9597d;

    /* renamed from: e  reason: collision with root package name */
    public final HashMap f9598e;

    /* renamed from: f  reason: collision with root package name */
    public int f9599f;

    /* compiled from: CameraStateRegistry */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public r.a f9600a = null;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f9601b;

        /* renamed from: c  reason: collision with root package name */
        public final b f9602c;

        /* renamed from: d  reason: collision with root package name */
        public final c f9603d;

        public a(g gVar, u.c cVar, u.b bVar) {
            this.f9601b = gVar;
            this.f9602c = cVar;
            this.f9603d = bVar;
        }
    }

    /* compiled from: CameraStateRegistry */
    public interface b {
    }

    /* compiled from: CameraStateRegistry */
    public interface c {
    }

    public t(a0.a aVar) {
        Object obj = new Object();
        this.f9595b = obj;
        this.f9598e = new HashMap();
        this.f9596c = 1;
        synchronized (obj) {
            this.f9597d = aVar;
            this.f9599f = this.f9596c;
        }
    }

    public final void a(int i10, int i11) {
        int i12;
        boolean z10;
        synchronized (this.f9595b) {
            boolean z11 = true;
            if (i11 == 2) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            this.f9596c = i12;
            if (i10 == 2 || i11 != 2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (i10 != 2 || i11 == 2) {
                z11 = false;
            }
            if (z10 || z11) {
                c();
            }
        }
    }

    public final a b(String str) {
        for (j jVar : this.f9598e.keySet()) {
            if (str.equals(((q) jVar.a()).b())) {
                return (a) this.f9598e.get(jVar);
            }
        }
        return null;
    }

    public final void c() {
        boolean z10;
        String str;
        if (p0.d("CameraStateRegistry")) {
            this.f9594a.setLength(0);
            this.f9594a.append("Recalculating open cameras:\n");
            this.f9594a.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{"Camera", "State"}));
            this.f9594a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry entry : this.f9598e.entrySet()) {
            if (p0.d("CameraStateRegistry")) {
                if (((a) entry.getValue()).f9600a != null) {
                    str = ((a) entry.getValue()).f9600a.toString();
                } else {
                    str = "UNKNOWN";
                }
                this.f9594a.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{((j) entry.getKey()).toString(), str}));
            }
            r.a aVar = ((a) entry.getValue()).f9600a;
            if (aVar == null || !aVar.f9580a) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                i10++;
            }
        }
        if (p0.d("CameraStateRegistry")) {
            this.f9594a.append("-------------------------------------------------------------------\n");
            this.f9594a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f9596c)}));
            this.f9594a.getClass();
            p0.a("CameraStateRegistry");
        }
        this.f9599f = Math.max(this.f9596c - i10, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(c0.j r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f9595b
            monitor-enter(r0)
            java.util.HashMap r1 = r9.f9598e     // Catch:{ all -> 0x009a }
            java.lang.Object r1 = r1.get(r10)     // Catch:{ all -> 0x009a }
            f0.t$a r1 = (f0.t.a) r1     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "Camera must first be registered with registerCamera()"
            al.g0.D(r1, r2)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = "CameraStateRegistry"
            boolean r2 = c0.p0.d(r2)     // Catch:{ all -> 0x009a }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0050
            java.lang.StringBuilder r2 = r9.f9594a     // Catch:{ all -> 0x009a }
            r2.setLength(r3)     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r2 = r9.f9594a     // Catch:{ all -> 0x009a }
            java.util.Locale r5 = java.util.Locale.US     // Catch:{ all -> 0x009a }
            java.lang.String r6 = "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]"
            r7 = 4
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x009a }
            r7[r3] = r10     // Catch:{ all -> 0x009a }
            int r10 = r9.f9599f     // Catch:{ all -> 0x009a }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x009a }
            r7[r4] = r10     // Catch:{ all -> 0x009a }
            r10 = 2
            f0.r$a r8 = r1.f9600a     // Catch:{ all -> 0x009a }
            if (r8 == 0) goto L_0x003d
            boolean r8 = r8.f9580a     // Catch:{ all -> 0x009a }
            if (r8 == 0) goto L_0x003d
            r8 = r4
            goto L_0x003e
        L_0x003d:
            r8 = r3
        L_0x003e:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x009a }
            r7[r10] = r8     // Catch:{ all -> 0x009a }
            r10 = 3
            f0.r$a r8 = r1.f9600a     // Catch:{ all -> 0x009a }
            r7[r10] = r8     // Catch:{ all -> 0x009a }
            java.lang.String r10 = java.lang.String.format(r5, r6, r7)     // Catch:{ all -> 0x009a }
            r2.append(r10)     // Catch:{ all -> 0x009a }
        L_0x0050:
            int r10 = r9.f9599f     // Catch:{ all -> 0x009a }
            if (r10 > 0) goto L_0x0064
            f0.r$a r10 = r1.f9600a     // Catch:{ all -> 0x009a }
            if (r10 == 0) goto L_0x005e
            boolean r10 = r10.f9580a     // Catch:{ all -> 0x009a }
            if (r10 == 0) goto L_0x005e
            r10 = r4
            goto L_0x005f
        L_0x005e:
            r10 = r3
        L_0x005f:
            if (r10 == 0) goto L_0x0062
            goto L_0x0064
        L_0x0062:
            r10 = r3
            goto L_0x0069
        L_0x0064:
            f0.r$a r10 = f0.r.a.OPENING     // Catch:{ all -> 0x009a }
            r1.f9600a = r10     // Catch:{ all -> 0x009a }
            r10 = r4
        L_0x0069:
            java.lang.String r1 = "CameraStateRegistry"
            boolean r1 = c0.p0.d(r1)     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x0093
            java.lang.StringBuilder r1 = r9.f9594a     // Catch:{ all -> 0x009a }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x009a }
            java.lang.String r5 = " --> %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x009a }
            if (r10 == 0) goto L_0x007e
            java.lang.String r6 = "SUCCESS"
            goto L_0x0080
        L_0x007e:
            java.lang.String r6 = "FAIL"
        L_0x0080:
            r4[r3] = r6     // Catch:{ all -> 0x009a }
            java.lang.String r2 = java.lang.String.format(r2, r5, r4)     // Catch:{ all -> 0x009a }
            r1.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "CameraStateRegistry"
            java.lang.StringBuilder r2 = r9.f9594a     // Catch:{ all -> 0x009a }
            r2.getClass()     // Catch:{ all -> 0x009a }
            c0.p0.a(r1)     // Catch:{ all -> 0x009a }
        L_0x0093:
            if (r10 == 0) goto L_0x0098
            r9.c()     // Catch:{ all -> 0x009a }
        L_0x0098:
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            return r10
        L_0x009a:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x009a }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.t.d(c0.j):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0058, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0053 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            f0.r$a r0 = f0.r.a.CONFIGURED
            java.lang.Object r1 = r6.f9595b
            monitor-enter(r1)
            d0.a r2 = r6.f9597d     // Catch:{ all -> 0x0059 }
            a0.a r2 = (a0.a) r2     // Catch:{ all -> 0x0059 }
            int r2 = r2.f8e     // Catch:{ all -> 0x0059 }
            r3 = 2
            r4 = 1
            if (r2 == r3) goto L_0x0011
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            return r4
        L_0x0011:
            f0.t$a r2 = r6.b(r7)     // Catch:{ all -> 0x0059 }
            r3 = 0
            if (r2 == 0) goto L_0x001f
            f0.t$a r7 = r6.b(r7)     // Catch:{ all -> 0x0059 }
            f0.r$a r7 = r7.f9600a     // Catch:{ all -> 0x0059 }
            goto L_0x0020
        L_0x001f:
            r7 = r3
        L_0x0020:
            if (r8 == 0) goto L_0x002e
            f0.t$a r2 = r6.b(r8)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x002e
            f0.t$a r8 = r6.b(r8)     // Catch:{ all -> 0x0059 }
            f0.r$a r3 = r8.f9600a     // Catch:{ all -> 0x0059 }
        L_0x002e:
            f0.r$a r8 = f0.r.a.OPEN     // Catch:{ all -> 0x0059 }
            boolean r2 = r8.equals(r7)     // Catch:{ all -> 0x0059 }
            r5 = 0
            if (r2 != 0) goto L_0x0040
            boolean r7 = r0.equals(r7)     // Catch:{ all -> 0x0059 }
            if (r7 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r7 = r5
            goto L_0x0041
        L_0x0040:
            r7 = r4
        L_0x0041:
            boolean r8 = r8.equals(r3)     // Catch:{ all -> 0x0059 }
            if (r8 != 0) goto L_0x0050
            boolean r8 = r0.equals(r3)     // Catch:{ all -> 0x0059 }
            if (r8 == 0) goto L_0x004e
            goto L_0x0050
        L_0x004e:
            r8 = r5
            goto L_0x0051
        L_0x0050:
            r8 = r4
        L_0x0051:
            if (r7 == 0) goto L_0x0056
            if (r8 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r4 = r5
        L_0x0057:
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            return r4
        L_0x0059:
            r7 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0059 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f0.t.e(java.lang.String, java.lang.String):boolean");
    }
}
