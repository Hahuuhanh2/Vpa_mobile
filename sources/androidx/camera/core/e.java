package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.b;
import c0.k0;
import c0.p0;
import c0.q0;
import c0.v0;
import f0.d0;
import f0.f;
import f0.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: MetadataImageReader */
public final class e implements d0, b.a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f1287a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public a f1288b = new a();

    /* renamed from: c  reason: collision with root package name */
    public int f1289c = 0;

    /* renamed from: d  reason: collision with root package name */
    public q0 f1290d = new q0(this, 0);

    /* renamed from: e  reason: collision with root package name */
    public boolean f1291e = false;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f1292f;

    /* renamed from: g  reason: collision with root package name */
    public d0.a f1293g;

    /* renamed from: h  reason: collision with root package name */
    public Executor f1294h;

    /* renamed from: i  reason: collision with root package name */
    public final LongSparseArray<k0> f1295i = new LongSparseArray<>();

    /* renamed from: j  reason: collision with root package name */
    public final LongSparseArray<d> f1296j = new LongSparseArray<>();

    /* renamed from: k  reason: collision with root package name */
    public int f1297k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f1298l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f1299m = new ArrayList();

    /* compiled from: MetadataImageReader */
    public class a extends f {
        public a() {
        }

        public final void b(k kVar) {
            e eVar = e.this;
            synchronized (eVar.f1287a) {
                if (!eVar.f1291e) {
                    eVar.f1295i.put(kVar.c(), new j0.b(kVar));
                    eVar.m();
                }
            }
        }
    }

    public e(int i10, int i11, int i12, int i13) {
        c0.b bVar = new c0.b(ImageReader.newInstance(i10, i11, i12, i13));
        this.f1292f = bVar;
        this.f1297k = 0;
        this.f1298l = new ArrayList(h());
    }

    public final void a(d dVar) {
        synchronized (this.f1287a) {
            j(dVar);
        }
    }

    public final int b() {
        int b10;
        synchronized (this.f1287a) {
            b10 = this.f1292f.b();
        }
        return b10;
    }

    public final int c() {
        int c10;
        synchronized (this.f1287a) {
            c10 = this.f1292f.c();
        }
        return c10;
    }

    public final void close() {
        synchronized (this.f1287a) {
            if (!this.f1291e) {
                Iterator it = new ArrayList(this.f1298l).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).close();
                }
                this.f1298l.clear();
                this.f1292f.close();
                this.f1291e = true;
            }
        }
    }

    public final d d() {
        synchronized (this.f1287a) {
            if (this.f1298l.isEmpty()) {
                return null;
            }
            if (this.f1297k < this.f1298l.size()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f1298l.size() - 1; i10++) {
                    if (!this.f1299m.contains(this.f1298l.get(i10))) {
                        arrayList.add((d) this.f1298l.get(i10));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).close();
                }
                int size = this.f1298l.size() - 1;
                ArrayList arrayList2 = this.f1298l;
                this.f1297k = size + 1;
                d dVar = (d) arrayList2.get(size);
                this.f1299m.add(dVar);
                return dVar;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    public final int e() {
        int e10;
        synchronized (this.f1287a) {
            e10 = this.f1292f.e();
        }
        return e10;
    }

    public final void f() {
        synchronized (this.f1287a) {
            this.f1292f.f();
            this.f1293g = null;
            this.f1294h = null;
            this.f1289c = 0;
        }
    }

    public final void g(d0.a aVar, Executor executor) {
        synchronized (this.f1287a) {
            aVar.getClass();
            this.f1293g = aVar;
            executor.getClass();
            this.f1294h = executor;
            this.f1292f.g(this.f1290d, executor);
        }
    }

    public final Surface getSurface() {
        Surface surface;
        synchronized (this.f1287a) {
            surface = this.f1292f.getSurface();
        }
        return surface;
    }

    public final int h() {
        int h10;
        synchronized (this.f1287a) {
            h10 = this.f1292f.h();
        }
        return h10;
    }

    public final d i() {
        synchronized (this.f1287a) {
            if (this.f1298l.isEmpty()) {
                return null;
            }
            if (this.f1297k < this.f1298l.size()) {
                ArrayList arrayList = this.f1298l;
                int i10 = this.f1297k;
                this.f1297k = i10 + 1;
                d dVar = (d) arrayList.get(i10);
                this.f1299m.add(dVar);
                return dVar;
            }
            throw new IllegalStateException("Maximum image number reached.");
        }
    }

    public final void j(d dVar) {
        synchronized (this.f1287a) {
            int indexOf = this.f1298l.indexOf(dVar);
            if (indexOf >= 0) {
                this.f1298l.remove(indexOf);
                int i10 = this.f1297k;
                if (indexOf <= i10) {
                    this.f1297k = i10 - 1;
                }
            }
            this.f1299m.remove(dVar);
            if (this.f1289c > 0) {
                l(this.f1292f);
            }
        }
    }

    public final void k(v0 v0Var) {
        d0.a aVar;
        Executor executor;
        synchronized (this.f1287a) {
            aVar = null;
            if (this.f1298l.size() < h()) {
                v0Var.d(this);
                this.f1298l.add(v0Var);
                aVar = this.f1293g;
                executor = this.f1294h;
            } else {
                p0.a("TAG");
                v0Var.close();
                executor = null;
            }
        }
        if (aVar == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new v.f(6, this, aVar));
        } else {
            aVar.f(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(f0.d0 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f1287a
            monitor-enter(r0)
            boolean r1 = r6.f1291e     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x0009:
            android.util.LongSparseArray<androidx.camera.core.d> r1 = r6.f1296j     // Catch:{ all -> 0x005d }
            int r1 = r1.size()     // Catch:{ all -> 0x005d }
            java.util.ArrayList r2 = r6.f1298l     // Catch:{ all -> 0x005d }
            int r2 = r2.size()     // Catch:{ all -> 0x005d }
            int r1 = r1 + r2
            int r2 = r7.h()     // Catch:{ all -> 0x005d }
            if (r1 < r2) goto L_0x0023
            java.lang.String r7 = "MetadataImageReader"
            c0.p0.a(r7)     // Catch:{ all -> 0x005d }
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x0023:
            r2 = 0
            androidx.camera.core.d r2 = r7.i()     // Catch:{ IllegalStateException -> 0x0043 }
            if (r2 == 0) goto L_0x004d
            int r3 = r6.f1289c     // Catch:{ all -> 0x005d }
            int r3 = r3 + -1
            r6.f1289c = r3     // Catch:{ all -> 0x005d }
            int r1 = r1 + 1
            android.util.LongSparseArray<androidx.camera.core.d> r3 = r6.f1296j     // Catch:{ all -> 0x005d }
            c0.k0 r4 = r2.f0()     // Catch:{ all -> 0x005d }
            long r4 = r4.c()     // Catch:{ all -> 0x005d }
            r3.put(r4, r2)     // Catch:{ all -> 0x005d }
            r6.m()     // Catch:{ all -> 0x005d }
            goto L_0x004d
        L_0x0043:
            java.lang.String r3 = "MetadataImageReader"
            java.lang.String r3 = c0.p0.f(r3)     // Catch:{ all -> 0x005b }
            r4 = 3
            c0.p0.e(r4, r3)     // Catch:{ all -> 0x005b }
        L_0x004d:
            if (r2 == 0) goto L_0x0059
            int r2 = r6.f1289c     // Catch:{ all -> 0x005d }
            if (r2 <= 0) goto L_0x0059
            int r2 = r7.h()     // Catch:{ all -> 0x005d }
            if (r1 < r2) goto L_0x0023
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            return
        L_0x005b:
            r7 = move-exception
            throw r7     // Catch:{ all -> 0x005d }
        L_0x005d:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005d }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.e.l(f0.d0):void");
    }

    public final void m() {
        synchronized (this.f1287a) {
            for (int size = this.f1295i.size() - 1; size >= 0; size--) {
                k0 valueAt = this.f1295i.valueAt(size);
                long c10 = valueAt.c();
                d dVar = this.f1296j.get(c10);
                if (dVar != null) {
                    this.f1296j.remove(c10);
                    this.f1295i.removeAt(size);
                    k(new v0(dVar, (Size) null, valueAt));
                }
            }
            n();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r10 = this;
            java.lang.Object r0 = r10.f1287a
            monitor-enter(r0)
            android.util.LongSparseArray<androidx.camera.core.d> r1 = r10.f1296j     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 == 0) goto L_0x008c
            android.util.LongSparseArray<c0.k0> r1 = r10.f1295i     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            if (r1 != 0) goto L_0x0015
            goto L_0x008c
        L_0x0015:
            android.util.LongSparseArray<androidx.camera.core.d> r1 = r10.f1296j     // Catch:{ all -> 0x008e }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<c0.k0> r3 = r10.f1295i     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x008e }
            boolean r4 = r3.equals(r1)     // Catch:{ all -> 0x008e }
            r5 = 1
            if (r4 != 0) goto L_0x0032
            r2 = r5
        L_0x0032:
            al.g0.z(r2)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            long r8 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x006b
            android.util.LongSparseArray<androidx.camera.core.d> r1 = r10.f1296j     // Catch:{ all -> 0x008e }
            int r1 = r1.size()     // Catch:{ all -> 0x008e }
            int r1 = r1 - r5
        L_0x0048:
            if (r1 < 0) goto L_0x008a
            android.util.LongSparseArray<androidx.camera.core.d> r2 = r10.f1296j     // Catch:{ all -> 0x008e }
            long r4 = r2.keyAt(r1)     // Catch:{ all -> 0x008e }
            long r6 = r3.longValue()     // Catch:{ all -> 0x008e }
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0068
            android.util.LongSparseArray<androidx.camera.core.d> r2 = r10.f1296j     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x008e }
            androidx.camera.core.d r2 = (androidx.camera.core.d) r2     // Catch:{ all -> 0x008e }
            r2.close()     // Catch:{ all -> 0x008e }
            android.util.LongSparseArray<androidx.camera.core.d> r2 = r10.f1296j     // Catch:{ all -> 0x008e }
            r2.removeAt(r1)     // Catch:{ all -> 0x008e }
        L_0x0068:
            int r1 = r1 + -1
            goto L_0x0048
        L_0x006b:
            android.util.LongSparseArray<c0.k0> r2 = r10.f1295i     // Catch:{ all -> 0x008e }
            int r2 = r2.size()     // Catch:{ all -> 0x008e }
            int r2 = r2 - r5
        L_0x0072:
            if (r2 < 0) goto L_0x008a
            android.util.LongSparseArray<c0.k0> r3 = r10.f1295i     // Catch:{ all -> 0x008e }
            long r3 = r3.keyAt(r2)     // Catch:{ all -> 0x008e }
            long r5 = r1.longValue()     // Catch:{ all -> 0x008e }
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L_0x0087
            android.util.LongSparseArray<c0.k0> r3 = r10.f1295i     // Catch:{ all -> 0x008e }
            r3.removeAt(r2)     // Catch:{ all -> 0x008e }
        L_0x0087:
            int r2 = r2 + -1
            goto L_0x0072
        L_0x008a:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008c:
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            return
        L_0x008e:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008e }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.e.n():void");
    }
}
