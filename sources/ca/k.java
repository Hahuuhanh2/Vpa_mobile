package ca;

import androidx.appcompat.app.p;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import ra.a;
import v.f;
import v.g0;
import za.b;

/* compiled from: ComponentRuntime */
public final class k implements c, a {

    /* renamed from: h  reason: collision with root package name */
    public static final i f4631h = new i(0);

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f4632a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f4633b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f4634c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public HashSet f4635d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public final n f4636e;

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<Boolean> f4637f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    public final g f4638g;

    /* JADX WARNING: Can't wrap try/catch for region: R(3:21|22|65) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r9.remove();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x00ad */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public k(java.util.concurrent.Executor r7, java.util.ArrayList r8, java.util.ArrayList r9, ca.g r10) {
        /*
            r6 = this;
            r6.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.f4632a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.f4633b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.f4634c = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r6.f4635d = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r6.f4637f = r0
            ca.n r0 = new ca.n
            r0.<init>(r7)
            r6.f4636e = r0
            r6.f4638g = r10
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.Class<ca.n> r10 = ca.n.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<wa.d> r2 = wa.d.class
            r3 = 0
            r1[r3] = r2
            java.lang.Class<wa.c> r2 = wa.c.class
            r4 = 1
            r1[r4] = r2
            ca.b r10 = ca.b.c(r0, r10, r1)
            r7.add(r10)
            java.lang.Class<ra.a> r10 = ra.a.class
            java.lang.Class[] r0 = new java.lang.Class[r3]
            ca.b r10 = ca.b.c(r6, r10, r0)
            r7.add(r10)
            java.util.Iterator r9 = r9.iterator()
        L_0x0059:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x006b
            java.lang.Object r10 = r9.next()
            ca.b r10 = (ca.b) r10
            if (r10 == 0) goto L_0x0059
            r7.add(r10)
            goto L_0x0059
        L_0x006b:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0074:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x0082
            java.lang.Object r10 = r8.next()
            r9.add(r10)
            goto L_0x0074
        L_0x0082:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            monitor-enter(r6)
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x016c }
        L_0x008c:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x016c }
            if (r10 == 0) goto L_0x00b1
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x016c }
            za.b r10 = (za.b) r10     // Catch:{ all -> 0x016c }
            java.lang.Object r10 = r10.get()     // Catch:{ InvalidRegistrarException -> 0x00ad }
            com.google.firebase.components.ComponentRegistrar r10 = (com.google.firebase.components.ComponentRegistrar) r10     // Catch:{ InvalidRegistrarException -> 0x00ad }
            if (r10 == 0) goto L_0x008c
            ca.g r0 = r6.f4638g     // Catch:{ InvalidRegistrarException -> 0x00ad }
            java.util.List r10 = r0.a(r10)     // Catch:{ InvalidRegistrarException -> 0x00ad }
            r7.addAll(r10)     // Catch:{ InvalidRegistrarException -> 0x00ad }
            r9.remove()     // Catch:{ InvalidRegistrarException -> 0x00ad }
            goto L_0x008c
        L_0x00ad:
            r9.remove()     // Catch:{ all -> 0x016c }
            goto L_0x008c
        L_0x00b1:
            java.util.Iterator r9 = r7.iterator()     // Catch:{ all -> 0x016c }
        L_0x00b5:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x016c }
            if (r10 == 0) goto L_0x00f5
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x016c }
            ca.b r10 = (ca.b) r10     // Catch:{ all -> 0x016c }
            java.util.Set<ca.r<? super T>> r10 = r10.f4608b     // Catch:{ all -> 0x016c }
            java.lang.Object[] r10 = r10.toArray()     // Catch:{ all -> 0x016c }
            int r0 = r10.length     // Catch:{ all -> 0x016c }
            r1 = r3
        L_0x00c9:
            if (r1 >= r0) goto L_0x00b5
            r2 = r10[r1]     // Catch:{ all -> 0x016c }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x016c }
            java.lang.String r5 = "kotlinx.coroutines.CoroutineDispatcher"
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x016c }
            if (r4 == 0) goto L_0x00f2
            java.util.HashSet r4 = r6.f4635d     // Catch:{ all -> 0x016c }
            java.lang.String r5 = r2.toString()     // Catch:{ all -> 0x016c }
            boolean r4 = r4.contains(r5)     // Catch:{ all -> 0x016c }
            if (r4 == 0) goto L_0x00e9
            r9.remove()     // Catch:{ all -> 0x016c }
            goto L_0x00b5
        L_0x00e9:
            java.util.HashSet r4 = r6.f4635d     // Catch:{ all -> 0x016c }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x016c }
            r4.add(r2)     // Catch:{ all -> 0x016c }
        L_0x00f2:
            int r1 = r1 + 1
            goto L_0x00c9
        L_0x00f5:
            java.util.HashMap r9 = r6.f4632a     // Catch:{ all -> 0x016c }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x016c }
            if (r9 == 0) goto L_0x0101
            ca.l.a(r7)     // Catch:{ all -> 0x016c }
            goto L_0x0112
        L_0x0101:
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x016c }
            java.util.HashMap r10 = r6.f4632a     // Catch:{ all -> 0x016c }
            java.util.Set r10 = r10.keySet()     // Catch:{ all -> 0x016c }
            r9.<init>(r10)     // Catch:{ all -> 0x016c }
            r9.addAll(r7)     // Catch:{ all -> 0x016c }
            ca.l.a(r9)     // Catch:{ all -> 0x016c }
        L_0x0112:
            java.util.Iterator r9 = r7.iterator()     // Catch:{ all -> 0x016c }
        L_0x0116:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x016c }
            if (r10 == 0) goto L_0x0132
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x016c }
            ca.b r10 = (ca.b) r10     // Catch:{ all -> 0x016c }
            ca.o r0 = new ca.o     // Catch:{ all -> 0x016c }
            ca.h r1 = new ca.h     // Catch:{ all -> 0x016c }
            r1.<init>(r6, r10)     // Catch:{ all -> 0x016c }
            r0.<init>(r1)     // Catch:{ all -> 0x016c }
            java.util.HashMap r1 = r6.f4632a     // Catch:{ all -> 0x016c }
            r1.put(r10, r0)     // Catch:{ all -> 0x016c }
            goto L_0x0116
        L_0x0132:
            java.util.ArrayList r7 = r6.j(r7)     // Catch:{ all -> 0x016c }
            r8.addAll(r7)     // Catch:{ all -> 0x016c }
            java.util.ArrayList r7 = r6.k()     // Catch:{ all -> 0x016c }
            r8.addAll(r7)     // Catch:{ all -> 0x016c }
            r6.i()     // Catch:{ all -> 0x016c }
            monitor-exit(r6)     // Catch:{ all -> 0x016c }
            java.util.Iterator r7 = r8.iterator()
        L_0x0148:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0158
            java.lang.Object r8 = r7.next()
            java.lang.Runnable r8 = (java.lang.Runnable) r8
            r8.run()
            goto L_0x0148
        L_0x0158:
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r7 = r6.f4637f
            java.lang.Object r7 = r7.get()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x016b
            java.util.HashMap r8 = r6.f4632a
            boolean r7 = r7.booleanValue()
            r6.g(r8, r7)
        L_0x016b:
            return
        L_0x016c:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x016c }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.k.<init>(java.util.concurrent.Executor, java.util.ArrayList, java.util.ArrayList, ca.g):void");
    }

    public final Object a(Class cls) {
        return d(r.a(cls));
    }

    public final synchronized <T> b<T> b(r<T> rVar) {
        if (rVar != null) {
        } else {
            throw new NullPointerException("Null interface requested.");
        }
        return (b) this.f4633b.get(rVar);
    }

    public final b c(Class cls) {
        return b(r.a(cls));
    }

    public final Object d(r rVar) {
        b b10 = b(rVar);
        if (b10 == null) {
            return null;
        }
        return b10.get();
    }

    public final Set e(r rVar) {
        return (Set) l(rVar).get();
    }

    public final <T> za.a<T> f(r<T> rVar) {
        b<T> b10 = b(rVar);
        if (b10 == null) {
            return new q(q.f4655c, q.f4656d);
        }
        if (b10 instanceof q) {
            return (q) b10;
        }
        return new q((g0) null, b10);
    }

    public final void g(Map<b<?>, b<?>> map, boolean z10) {
        ArrayDeque<wa.a> arrayDeque;
        Set<Map.Entry> set;
        boolean z11;
        for (Map.Entry next : map.entrySet()) {
            b bVar = (b) next.getValue();
            int i10 = ((b) next.getKey()).f4610d;
            boolean z12 = false;
            if (i10 == 1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (i10 == 2) {
                    z12 = true;
                }
                if (z12) {
                    if (!z10) {
                    }
                }
            }
            bVar.get();
        }
        n nVar = this.f4636e;
        synchronized (nVar) {
            try {
                arrayDeque = nVar.f4648b;
                if (arrayDeque != null) {
                    nVar.f4648b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        if (arrayDeque != null) {
            for (wa.a aVar : arrayDeque) {
                aVar.getClass();
                synchronized (nVar) {
                    ArrayDeque arrayDeque2 = nVar.f4648b;
                    if (arrayDeque2 != null) {
                        arrayDeque2.add(aVar);
                    } else {
                        synchronized (nVar) {
                            Map map2 = (Map) nVar.f4647a.get((Object) null);
                            if (map2 == null) {
                                set = Collections.emptySet();
                            } else {
                                set = map2.entrySet();
                            }
                        }
                        for (Map.Entry entry : set) {
                            ((Executor) entry.getValue()).execute(new p(28, entry, aVar));
                        }
                    }
                }
            }
        }
    }

    public final void h(boolean z10) {
        boolean z11;
        HashMap hashMap;
        AtomicReference<Boolean> atomicReference = this.f4637f;
        Boolean valueOf = Boolean.valueOf(z10);
        while (true) {
            if (!atomicReference.compareAndSet((Object) null, valueOf)) {
                if (atomicReference.get() != null) {
                    z11 = false;
                    break;
                }
            } else {
                z11 = true;
                break;
            }
        }
        if (z11) {
            synchronized (this) {
                hashMap = new HashMap(this.f4632a);
            }
            g(hashMap, z10);
        }
    }

    public final void i() {
        boolean z10;
        boolean z11;
        for (b bVar : this.f4632a.keySet()) {
            Iterator<m> it = bVar.f4609c.iterator();
            while (true) {
                if (it.hasNext()) {
                    m next = it.next();
                    boolean z12 = true;
                    if (next.f4645b == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10 && !this.f4634c.containsKey(next.f4644a)) {
                        this.f4634c.put(next.f4644a, new p(Collections.emptySet()));
                    } else if (this.f4633b.containsKey(next.f4644a)) {
                        continue;
                    } else {
                        int i10 = next.f4645b;
                        if (i10 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            if (i10 != 2) {
                                z12 = false;
                            }
                            if (!z12) {
                                this.f4633b.put(next.f4644a, new q(q.f4655c, q.f4656d));
                            }
                        } else {
                            throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{bVar, next.f4644a}));
                        }
                    }
                }
            }
        }
    }

    public final ArrayList j(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f4611e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                b bVar2 = (b) this.f4632a.get(bVar);
                for (r next : bVar.f4608b) {
                    if (!this.f4633b.containsKey(next)) {
                        this.f4633b.put(next, bVar2);
                    } else {
                        arrayList2.add(new p(27, (q) ((b) this.f4633b.get(next)), bVar2));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList k() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f4632a.entrySet()) {
            b bVar = (b) entry.getKey();
            if (bVar.f4611e == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                b bVar2 = (b) entry.getValue();
                for (r next : bVar.f4608b) {
                    if (!hashMap.containsKey(next)) {
                        hashMap.put(next, new HashSet());
                    }
                    ((Set) hashMap.get(next)).add(bVar2);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f4634c.containsKey(entry2.getKey())) {
                this.f4634c.put((r) entry2.getKey(), new p((Set) ((Collection) entry2.getValue())));
            } else {
                p pVar = (p) this.f4634c.get(entry2.getKey());
                for (b fVar : (Set) entry2.getValue()) {
                    arrayList.add(new f(23, pVar, fVar));
                }
            }
        }
        return arrayList;
    }

    public final synchronized <T> b<Set<T>> l(r<T> rVar) {
        p pVar = (p) this.f4634c.get(rVar);
        if (pVar != null) {
            return pVar;
        }
        return f4631h;
    }
}
