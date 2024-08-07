package k5;

import f0.b0;

/* compiled from: ThumbnailRequestCoordinator */
public final class j implements e, d {

    /* renamed from: a  reason: collision with root package name */
    public final e f12026a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12027b;

    /* renamed from: c  reason: collision with root package name */
    public volatile d f12028c;

    /* renamed from: d  reason: collision with root package name */
    public volatile d f12029d;

    /* renamed from: e  reason: collision with root package name */
    public int f12030e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f12031f = 3;

    /* renamed from: g  reason: collision with root package name */
    public boolean f12032g;

    public j(Object obj, e eVar) {
        this.f12027b = obj;
        this.f12026a = eVar;
    }

    public final boolean a() {
        boolean z10;
        synchronized (this.f12027b) {
            if (!this.f12029d.a()) {
                if (!this.f12028c.a()) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(k5.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f12027b
            monitor-enter(r0)
            k5.d r1 = r2.f12029d     // Catch:{ all -> 0x0028 }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x0028 }
            r1 = 4
            if (r3 == 0) goto L_0x0010
            r2.f12031f = r1     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0010:
            r2.f12030e = r1     // Catch:{ all -> 0x0028 }
            k5.e r3 = r2.f12026a     // Catch:{ all -> 0x0028 }
            if (r3 == 0) goto L_0x0019
            r3.b(r2)     // Catch:{ all -> 0x0028 }
        L_0x0019:
            int r3 = r2.f12031f     // Catch:{ all -> 0x0028 }
            boolean r3 = f0.b0.m(r3)     // Catch:{ all -> 0x0028 }
            if (r3 != 0) goto L_0x0026
            k5.d r3 = r2.f12029d     // Catch:{ all -> 0x0028 }
            r3.clear()     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.j.b(k5.d):void");
    }

    public final void c() {
        synchronized (this.f12027b) {
            if (!b0.m(this.f12031f)) {
                this.f12031f = 2;
                this.f12029d.c();
            }
            if (!b0.m(this.f12030e)) {
                this.f12030e = 2;
                this.f12028c.c();
            }
        }
    }

    public final void clear() {
        synchronized (this.f12027b) {
            this.f12032g = false;
            this.f12030e = 3;
            this.f12031f = 3;
            this.f12029d.clear();
            this.f12028c.clear();
        }
    }

    public final boolean d(d dVar) {
        boolean z10;
        boolean z11;
        synchronized (this.f12027b) {
            e eVar = this.f12026a;
            z10 = false;
            if (eVar != null) {
                if (!eVar.d(this)) {
                    z11 = false;
                    if (z11 && (dVar.equals(this.f12028c) || this.f12030e != 4)) {
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
        synchronized (this.f12027b) {
            e eVar = this.f12026a;
            z10 = false;
            if (eVar != null) {
                if (!eVar.e(this)) {
                    z11 = false;
                    if (z11 && dVar.equals(this.f12028c) && !a()) {
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
        synchronized (this.f12027b) {
            if (this.f12030e == 3) {
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
        synchronized (this.f12027b) {
            e eVar = this.f12026a;
            z10 = false;
            if (eVar != null) {
                if (!eVar.g(this)) {
                    z11 = false;
                    if (z11 && dVar.equals(this.f12028c) && this.f12030e != 2) {
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
        synchronized (this.f12027b) {
            e eVar2 = this.f12026a;
            if (eVar2 != null) {
                eVar = eVar2.getRoot();
            } else {
                eVar = this;
            }
        }
        return eVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(k5.d r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f12027b
            monitor-enter(r0)
            k5.d r1 = r2.f12028c     // Catch:{ all -> 0x001b }
            boolean r3 = r3.equals(r1)     // Catch:{ all -> 0x001b }
            r1 = 5
            if (r3 != 0) goto L_0x0010
            r2.f12031f = r1     // Catch:{ all -> 0x001b }
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x0010:
            r2.f12030e = r1     // Catch:{ all -> 0x001b }
            k5.e r3 = r2.f12026a     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0019
            r3.h(r2)     // Catch:{ all -> 0x001b }
        L_0x0019:
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            return
        L_0x001b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001b }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.j.h(k5.d):void");
    }

    public final void i() {
        synchronized (this.f12027b) {
            this.f12032g = true;
            try {
                if (!(this.f12030e == 4 || this.f12031f == 1)) {
                    this.f12031f = 1;
                    this.f12029d.i();
                }
                if (this.f12032g && this.f12030e != 1) {
                    this.f12030e = 1;
                    this.f12028c.i();
                }
            } finally {
                this.f12032g = false;
            }
        }
    }

    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f12027b) {
            z10 = true;
            if (this.f12030e != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean j() {
        boolean z10;
        synchronized (this.f12027b) {
            if (this.f12030e == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002d A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(k5.d r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof k5.j
            r1 = 0
            if (r0 == 0) goto L_0x002e
            k5.j r4 = (k5.j) r4
            k5.d r0 = r3.f12028c
            if (r0 != 0) goto L_0x0010
            k5.d r0 = r4.f12028c
            if (r0 != 0) goto L_0x002e
            goto L_0x001a
        L_0x0010:
            k5.d r0 = r3.f12028c
            k5.d r2 = r4.f12028c
            boolean r0 = r0.k(r2)
            if (r0 == 0) goto L_0x002e
        L_0x001a:
            k5.d r0 = r3.f12029d
            if (r0 != 0) goto L_0x0023
            k5.d r4 = r4.f12029d
            if (r4 != 0) goto L_0x002e
            goto L_0x002d
        L_0x0023:
            k5.d r0 = r3.f12029d
            k5.d r4 = r4.f12029d
            boolean r4 = r0.k(r4)
            if (r4 == 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k5.j.k(k5.d):boolean");
    }
}
