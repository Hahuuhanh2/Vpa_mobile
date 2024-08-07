package x2;

/* compiled from: InvalidationTracker.kt */
public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ h f16929a;

    public i(h hVar) {
        this.f16929a = hVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0063, code lost:
        p3.l0.u(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final gk.f a() {
        /*
            r4 = this;
            x2.h r0 = r4.f16929a
            gk.f r1 = new gk.f
            r1.<init>()
            x2.n r0 = r0.f16907a
            c3.a r2 = new c3.a
            java.lang.String r3 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
            r2.<init>(r3)
            r3 = 0
            android.database.Cursor r0 = r0.l(r2, r3)
        L_0x0015:
            boolean r2 = r0.moveToNext()     // Catch:{ all -> 0x0060 }
            if (r2 == 0) goto L_0x0028
            r2 = 0
            int r2 = r0.getInt(r2)     // Catch:{ all -> 0x0060 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0060 }
            r1.add(r2)     // Catch:{ all -> 0x0060 }
            goto L_0x0015
        L_0x0028:
            ek.i r2 = ek.i.f20112a     // Catch:{ all -> 0x0060 }
            p3.l0.u(r0, r3)
            gk.f r0 = al.g0.v(r1)
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x005f
            x2.h r1 = r4.f16929a
            c3.f r1 = r1.f16914h
            java.lang.String r2 = "Required value was null."
            if (r1 == 0) goto L_0x0055
            x2.h r1 = r4.f16929a
            c3.f r1 = r1.f16914h
            if (r1 == 0) goto L_0x004b
            r1.t()
            goto L_0x005f
        L_0x004b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x0055:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L_0x005f:
            return r0
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r2 = move-exception
            p3.l0.u(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.i.a():gk.f");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            x2.h r0 = r5.f16929a
            x2.n r0 = r0.f16907a
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.f16951h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            java.lang.String r1 = "readWriteLock.readLock()"
            sk.j.e(r0, r1)
            r0.lock()
            r1 = 1
            x2.h r2 = r5.f16929a     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            boolean r2 = r2.b()     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            if (r2 != 0) goto L_0x0024
        L_0x001b:
            r0.unlock()
            x2.h r0 = r5.f16929a
            r0.getClass()
            return
        L_0x0024:
            x2.h r2 = r5.f16929a     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f16912f     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            r3 = 0
            boolean r2 = r2.compareAndSet(r1, r3)     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            if (r2 != 0) goto L_0x0030
            goto L_0x001b
        L_0x0030:
            x2.h r2 = r5.f16929a     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            x2.n r2 = r2.f16907a     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            c3.c r2 = r2.g()     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            c3.b r2 = r2.P()     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            boolean r2 = r2.q0()     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            if (r2 == 0) goto L_0x0043
            goto L_0x001b
        L_0x0043:
            x2.h r2 = r5.f16929a     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            x2.n r2 = r2.f16907a     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            c3.c r2 = r2.g()     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            c3.b r2 = r2.P()     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            r2.J()     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            gk.f r3 = r5.a()     // Catch:{ all -> 0x005d }
            r2.I()     // Catch:{ all -> 0x005d }
            r2.X()     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            goto L_0x0069
        L_0x005d:
            r3 = move-exception
            r2.X()     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
            throw r3     // Catch:{ IllegalStateException -> 0x0067, SQLiteException -> 0x0064 }
        L_0x0062:
            r1 = move-exception
            goto L_0x00a4
        L_0x0064:
            fk.t r3 = fk.t.f20215a     // Catch:{ all -> 0x0062 }
            goto L_0x0069
        L_0x0067:
            fk.t r3 = fk.t.f20215a     // Catch:{ all -> 0x0062 }
        L_0x0069:
            r0.unlock()
            x2.h r0 = r5.f16929a
            r0.getClass()
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x00a3
            x2.h r0 = r5.f16929a
            o.b<x2.h$c, x2.h$d> r1 = r0.f16916j
            monitor-enter(r1)
            o.b<x2.h$c, x2.h$d> r0 = r0.f16916j     // Catch:{ all -> 0x00a0 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x00a0 }
        L_0x0083:
            r2 = r0
            o.b$e r2 = (o.b.e) r2     // Catch:{ all -> 0x00a0 }
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x00a0 }
            if (r4 == 0) goto L_0x009c
            java.lang.Object r2 = r2.next()     // Catch:{ all -> 0x00a0 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x00a0 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x00a0 }
            x2.h$d r2 = (x2.h.d) r2     // Catch:{ all -> 0x00a0 }
            r2.a(r3)     // Catch:{ all -> 0x00a0 }
            goto L_0x0083
        L_0x009c:
            ek.i r0 = ek.i.f20112a     // Catch:{ all -> 0x00a0 }
            monitor-exit(r1)
            goto L_0x00a3
        L_0x00a0:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00a3:
            return
        L_0x00a4:
            r0.unlock()
            x2.h r0 = r5.f16929a
            r0.getClass()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x2.i.run():void");
    }
}
