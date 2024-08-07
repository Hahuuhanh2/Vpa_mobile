package v4;

import android.util.Log;
import h4.i;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: LruArrayPool */
public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    public final f<a, Object> f16041a = new f<>();

    /* renamed from: b  reason: collision with root package name */
    public final b f16042b = new b();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f16043c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f16044d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final int f16045e;

    /* renamed from: f  reason: collision with root package name */
    public int f16046f;

    /* compiled from: LruArrayPool */
    public static final class a implements k {

        /* renamed from: a  reason: collision with root package name */
        public final b f16047a;

        /* renamed from: b  reason: collision with root package name */
        public int f16048b;

        /* renamed from: c  reason: collision with root package name */
        public Class<?> f16049c;

        public a(b bVar) {
            this.f16047a = bVar;
        }

        public final void a() {
            this.f16047a.i(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f16048b == aVar.f16048b && this.f16049c == aVar.f16049c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i10;
            int i11 = this.f16048b * 31;
            Class<?> cls = this.f16049c;
            if (cls != null) {
                i10 = cls.hashCode();
            } else {
                i10 = 0;
            }
            return i11 + i10;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Key{size=");
            q10.append(this.f16048b);
            q10.append("array=");
            q10.append(this.f16049c);
            q10.append('}');
            return q10.toString();
        }
    }

    /* compiled from: LruArrayPool */
    public static final class b extends i {
        public final k d() {
            return new a(this);
        }
    }

    public h(int i10) {
        this.f16045e = i10;
    }

    public final synchronized void a(int i10) {
        if (i10 >= 40) {
            try {
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        } else if (i10 >= 20 || i10 == 15) {
            f(this.f16045e / 2);
        }
    }

    public final synchronized void b() {
        f(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized <T> T c(int r6, java.lang.Class<T> r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.util.NavigableMap r0 = r5.i(r7)     // Catch:{ all -> 0x0053 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.ceilingKey(r1)     // Catch:{ all -> 0x0053 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x0053 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x002c
            int r3 = r5.f16046f     // Catch:{ all -> 0x0053 }
            if (r3 == 0) goto L_0x0020
            int r4 = r5.f16045e     // Catch:{ all -> 0x0053 }
            int r4 = r4 / r3
            r3 = 2
            if (r4 < r3) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            r3 = r2
            goto L_0x0021
        L_0x0020:
            r3 = r1
        L_0x0021:
            if (r3 != 0) goto L_0x002d
            int r3 = r0.intValue()     // Catch:{ all -> 0x0053 }
            int r4 = r6 * 8
            if (r3 > r4) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r1 = r2
        L_0x002d:
            if (r1 == 0) goto L_0x0040
            v4.h$b r6 = r5.f16042b     // Catch:{ all -> 0x0053 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0053 }
            v4.k r6 = r6.f()     // Catch:{ all -> 0x0053 }
            v4.h$a r6 = (v4.h.a) r6     // Catch:{ all -> 0x0053 }
            r6.f16048b = r0     // Catch:{ all -> 0x0053 }
            r6.f16049c = r7     // Catch:{ all -> 0x0053 }
            goto L_0x004d
        L_0x0040:
            v4.h$b r0 = r5.f16042b     // Catch:{ all -> 0x0053 }
            v4.k r0 = r0.f()     // Catch:{ all -> 0x0053 }
            v4.h$a r0 = (v4.h.a) r0     // Catch:{ all -> 0x0053 }
            r0.f16048b = r6     // Catch:{ all -> 0x0053 }
            r0.f16049c = r7     // Catch:{ all -> 0x0053 }
            r6 = r0
        L_0x004d:
            java.lang.Object r6 = r5.h(r6, r7)     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)
            return r6
        L_0x0053:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.h.c(int, java.lang.Class):java.lang.Object");
    }

    public final synchronized Object d() {
        Object h10;
        Class cls = byte[].class;
        synchronized (this) {
            a aVar = (a) this.f16042b.f();
            aVar.f16048b = 8;
            aVar.f16049c = cls;
            h10 = h(aVar, cls);
        }
        return h10;
    }

    public final void e(int i10, Class<?> cls) {
        NavigableMap<Integer, Integer> i11 = i(cls);
        Integer num = i11.get(Integer.valueOf(i10));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
        } else if (num.intValue() == 1) {
            i11.remove(Integer.valueOf(i10));
        } else {
            i11.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
        }
    }

    public final void f(int i10) {
        while (this.f16046f > i10) {
            Object c10 = this.f16041a.c();
            j7.a.r(c10);
            a<?> g2 = g(c10.getClass());
            this.f16046f -= g2.b() * g2.c(c10);
            e(g2.c(c10), c10.getClass());
            if (Log.isLoggable(g2.a(), 2)) {
                g2.a();
                g2.c(c10);
            }
        }
    }

    public final <T> a<T> g(Class<T> cls) {
        a<T> aVar = (a) this.f16044d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new g();
            } else if (cls.equals(byte[].class)) {
                aVar = new e();
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("No array pool found for: ");
                q10.append(cls.getSimpleName());
                throw new IllegalArgumentException(q10.toString());
            }
            this.f16044d.put(cls, aVar);
        }
        return aVar;
    }

    public final <T> T h(a aVar, Class<T> cls) {
        a<T> g2 = g(cls);
        T a10 = this.f16041a.a(aVar);
        if (a10 != null) {
            this.f16046f -= g2.b() * g2.c(a10);
            e(g2.c(a10), cls);
        }
        if (a10 != null) {
            return a10;
        }
        if (Log.isLoggable(g2.a(), 2)) {
            g2.a();
        }
        return g2.newArray(aVar.f16048b);
    }

    public final NavigableMap<Integer, Integer> i(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f16043c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f16043c.put(cls, treeMap);
        return treeMap;
    }

    public final synchronized <T> void put(T t10) {
        boolean z10;
        Class<?> cls = t10.getClass();
        a<?> g2 = g(cls);
        int c10 = g2.c(t10);
        int b10 = g2.b() * c10;
        int i10 = 1;
        if (b10 <= this.f16045e / 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            a aVar = (a) this.f16042b.f();
            aVar.f16048b = c10;
            aVar.f16049c = cls;
            this.f16041a.b(aVar, t10);
            NavigableMap<Integer, Integer> i11 = i(cls);
            Integer num = i11.get(Integer.valueOf(aVar.f16048b));
            Integer valueOf = Integer.valueOf(aVar.f16048b);
            if (num != null) {
                i10 = 1 + num.intValue();
            }
            i11.put(valueOf, Integer.valueOf(i10));
            this.f16046f += b10;
            f(this.f16045e);
        }
    }
}
