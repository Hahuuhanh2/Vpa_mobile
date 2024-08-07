package k5;

/* compiled from: ErrorRequestCoordinator */
public final class b implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f11994a;

    /* renamed from: b  reason: collision with root package name */
    public final e f11995b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f11996c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f11997d;

    /* renamed from: e  reason: collision with root package name */
    public int f11998e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f11999f = 3;

    public b(Object obj, e eVar) {
        this.f11994a = obj;
        this.f11995b = eVar;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f11994a) {
            if (!this.f11996c.a()) {
                if (!this.f11997d.a()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final void b(d dVar) {
        synchronized (this.f11994a) {
            if (dVar.equals(this.f11996c)) {
                this.f11998e = 4;
            } else if (dVar.equals(this.f11997d)) {
                this.f11999f = 4;
            }
            e eVar = this.f11995b;
            if (eVar != null) {
                eVar.b(this);
            }
        }
    }

    public final void c() {
        synchronized (this.f11994a) {
            if (this.f11998e == 1) {
                this.f11998e = 2;
                this.f11996c.c();
            }
            if (this.f11999f == 1) {
                this.f11999f = 2;
                this.f11997d.c();
            }
        }
    }

    public final void clear() {
        synchronized (this.f11994a) {
            this.f11998e = 3;
            this.f11996c.clear();
            if (this.f11999f != 3) {
                this.f11999f = 3;
                this.f11997d.clear();
            }
        }
    }

    public final boolean d(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f11994a) {
            e eVar = this.f11995b;
            z10 = false;
            if (eVar != null) {
                if (!eVar.d(this)) {
                    z11 = false;
                    if (z11 && l(dVar)) {
                        z10 = true;
                    }
                }
            }
            z11 = true;
            z10 = true;
        }
        return z10;
    }

    public final boolean e(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f11994a) {
            e eVar = this.f11995b;
            z10 = false;
            if (eVar != null) {
                if (!eVar.e(this)) {
                    z11 = false;
                    if (z11 && l(dVar)) {
                        z10 = true;
                    }
                }
            }
            z11 = true;
            z10 = true;
        }
        return z10;
    }

    public final boolean f() {
        boolean z10;
        synchronized (this.f11994a) {
            if (this.f11998e == 3 && this.f11999f == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean g(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f11994a) {
            e eVar = this.f11995b;
            z10 = false;
            if (eVar != null) {
                if (!eVar.g(this)) {
                    z11 = false;
                    if (z11 && l(dVar)) {
                        z10 = true;
                    }
                }
            }
            z11 = true;
            z10 = true;
        }
        return z10;
    }

    public final e getRoot() {
        e eVar;
        synchronized (this.f11994a) {
            e eVar2 = this.f11995b;
            if (eVar2 != null) {
                eVar = eVar2.getRoot();
            } else {
                eVar = this;
            }
        }
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(k5.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f11994a
            monitor-enter(r0)
            k5.d r1 = r2.f11997d     // Catch:{ all -> 0x0027 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0027 }
            r1 = 5
            if (r3 != 0) goto L_0x001c
            r2.f11998e = r1     // Catch:{ all -> 0x0027 }
            int r3 = r2.f11999f     // Catch:{ all -> 0x0027 }
            r1 = 1
            if (r3 == r1) goto L_0x001a
            r2.f11999f = r1     // Catch:{ all -> 0x0027 }
            k5.d r3 = r2.f11997d     // Catch:{ all -> 0x0027 }
            r3.i()     // Catch:{ all -> 0x0027 }
        L_0x001a:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x001c:
            r2.f11999f = r1     // Catch:{ all -> 0x0027 }
            k5.e r3 = r2.f11995b     // Catch:{ all -> 0x0027 }
            if (r3 == 0) goto L_0x0025
            r3.h(r2)     // Catch:{ all -> 0x0027 }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            return
        L_0x0027:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0027 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.b.h(k5.d):void");
    }

    public final void i() {
        synchronized (this.f11994a) {
            if (this.f11998e != 1) {
                this.f11998e = 1;
                this.f11996c.i();
            }
        }
    }

    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f11994a) {
            z10 = true;
            if (this.f11998e != 1) {
                if (this.f11999f != 1) {
                    z10 = false;
                }
            }
        }
        return z10;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f11994a) {
            if (this.f11998e != 4) {
                if (this.f11999f != 4) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    public final boolean k(d dVar) {
        if (!(dVar instanceof b)) {
            return false;
        }
        b bVar = (b) dVar;
        if (!this.f11996c.k(bVar.f11996c) || !this.f11997d.k(bVar.f11997d)) {
            return false;
        }
        return true;
    }

    public final boolean l(d dVar) {
        if (dVar.equals(this.f11996c) || (this.f11998e == 5 && dVar.equals(this.f11997d))) {
            return true;
        }
        return false;
    }
}
