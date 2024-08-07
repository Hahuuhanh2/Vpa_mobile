package j$.util.concurrent;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import sun.misc.Unsafe;

public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, ConcurrentMap<K, V> {

    /* renamed from: g  reason: collision with root package name */
    private static final int f18393g = ((1 << (32 - 16)) - 1);

    /* renamed from: h  reason: collision with root package name */
    private static final int f18394h = (32 - 16);

    /* renamed from: i  reason: collision with root package name */
    static final int f18395i = Runtime.getRuntime().availableProcessors();

    /* renamed from: j  reason: collision with root package name */
    private static final Unsafe f18396j;

    /* renamed from: k  reason: collision with root package name */
    private static final long f18397k;

    /* renamed from: l  reason: collision with root package name */
    private static final long f18398l;

    /* renamed from: m  reason: collision with root package name */
    private static final long f18399m;

    /* renamed from: n  reason: collision with root package name */
    private static final long f18400n;

    /* renamed from: o  reason: collision with root package name */
    private static final long f18401o;

    /* renamed from: p  reason: collision with root package name */
    private static final long f18402p;

    /* renamed from: q  reason: collision with root package name */
    private static final int f18403q;
    private static final ObjectStreamField[] serialPersistentFields;
    private static final long serialVersionUID = 7249069246763182397L;

    /* renamed from: a  reason: collision with root package name */
    volatile transient m[] f18404a;

    /* renamed from: b  reason: collision with root package name */
    private volatile transient m[] f18405b;
    private volatile transient long baseCount;

    /* renamed from: c  reason: collision with root package name */
    private volatile transient d[] f18406c;
    private volatile transient int cellsBusy;

    /* renamed from: d  reason: collision with root package name */
    private transient j f18407d;

    /* renamed from: e  reason: collision with root package name */
    private transient t f18408e;

    /* renamed from: f  reason: collision with root package name */
    private transient f f18409f;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static {
        Class cls = Integer.TYPE;
        serialPersistentFields = new ObjectStreamField[]{new ObjectStreamField("segments", o[].class), new ObjectStreamField("segmentMask", cls), new ObjectStreamField("segmentShift", cls)};
        try {
            Unsafe c10 = v.c();
            f18396j = c10;
            Class<ConcurrentHashMap> cls2 = ConcurrentHashMap.class;
            f18397k = c10.objectFieldOffset(cls2.getDeclaredField("sizeCtl"));
            f18398l = c10.objectFieldOffset(cls2.getDeclaredField("transferIndex"));
            f18399m = c10.objectFieldOffset(cls2.getDeclaredField("baseCount"));
            f18400n = c10.objectFieldOffset(cls2.getDeclaredField("cellsBusy"));
            f18401o = c10.objectFieldOffset(d.class.getDeclaredField("value"));
            Class<m[]> cls3 = m[].class;
            f18402p = (long) c10.arrayBaseOffset(cls3);
            int arrayIndexScale = c10.arrayIndexScale(cls3);
            if (((arrayIndexScale - 1) & arrayIndexScale) == 0) {
                f18403q = 31 - Integer.numberOfLeadingZeros(arrayIndexScale);
                return;
            }
            throw new Error("data type scale not a power of two");
        } catch (Exception e10) {
            throw new Error(e10);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i10) {
        if (i10 >= 0) {
            this.sizeCtl = i10 >= 536870912 ? 1073741824 : n(i10 + (i10 >>> 1) + 1);
            return;
        }
        throw new IllegalArgumentException();
    }

    public ConcurrentHashMap(int i10, float f10, int i11) {
        if (f10 <= 0.0f || i10 < 0 || i11 <= 0) {
            throw new IllegalArgumentException();
        }
        long j10 = (long) (((double) (((float) ((long) (i10 < i11 ? i11 : i10))) / f10)) + 1.0d);
        this.sizeCtl = j10 >= 1073741824 ? 1073741824 : n((int) j10);
    }

    public ConcurrentHashMap(Map<? extends K, ? extends V> map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1.compareAndSwapLong(r11, r3, r5, r9) == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.d[] r0 = r11.f18406c
            if (r0 != 0) goto L_0x0014
            sun.misc.Unsafe r1 = f18396j
            long r3 = f18399m
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L_0x003c
        L_0x0014:
            r1 = 1
            if (r0 == 0) goto L_0x009b
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L_0x009b
            int r3 = j$.util.concurrent.ThreadLocalRandom.b()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L_0x009b
            sun.misc.Unsafe r3 = f18396j
            long r5 = f18401o
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r0 != 0) goto L_0x0035
            r1 = r0
            goto L_0x009b
        L_0x0035:
            if (r14 > r1) goto L_0x0038
            return
        L_0x0038:
            long r9 = r11.l()
        L_0x003c:
            if (r14 < 0) goto L_0x009a
        L_0x003e:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L_0x009a
            j$.util.concurrent.m[] r12 = r11.f18404a
            if (r12 == 0) goto L_0x009a
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L_0x009a
            int r13 = java.lang.Integer.numberOfLeadingZeros(r13)
            r14 = 32768(0x8000, float:4.5918E-41)
            r13 = r13 | r14
            if (r4 >= 0) goto L_0x0081
            int r14 = f18394h
            int r14 = r4 >>> r14
            if (r14 != r13) goto L_0x009a
            int r14 = r13 + 1
            if (r4 == r14) goto L_0x009a
            int r14 = f18393g
            int r13 = r13 + r14
            if (r4 == r13) goto L_0x009a
            j$.util.concurrent.m[] r13 = r11.f18405b
            if (r13 == 0) goto L_0x009a
            int r14 = r11.transferIndex
            if (r14 > 0) goto L_0x0070
            goto L_0x009a
        L_0x0070:
            sun.misc.Unsafe r0 = f18396j
            long r2 = f18397k
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r14 == 0) goto L_0x0095
            r11.o(r12, r13)
            goto L_0x0095
        L_0x0081:
            sun.misc.Unsafe r0 = f18396j
            long r2 = f18397k
            int r14 = f18394h
            int r13 = r13 << r14
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r13 == 0) goto L_0x0095
            r13 = 0
            r11.o(r12, r13)
        L_0x0095:
            long r9 = r11.l()
            goto L_0x003e
        L_0x009a:
            return
        L_0x009b:
            r11.e(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    static final boolean b(m[] mVarArr, int i10, m mVar) {
        return C0358a.a(f18396j, mVarArr, (((long) i10) << f18403q) + f18402p, mVar);
    }

    static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    static int d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009d, code lost:
        if (r9.f18406c != r7) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x009f, code lost:
        r1 = new j$.util.concurrent.d[(r8 << 1)];
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00a4, code lost:
        if (r2 >= r8) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a6, code lost:
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ad, code lost:
        r9.f18406c = r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0102 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x001b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e(long r25, boolean r27) {
        /*
            r24 = this;
            r9 = r24
            r10 = r25
            int r0 = j$.util.concurrent.ThreadLocalRandom.b()
            r12 = 1
            if (r0 != 0) goto L_0x0015
            j$.util.concurrent.ThreadLocalRandom.f()
            int r0 = j$.util.concurrent.ThreadLocalRandom.b()
            r1 = r0
            r0 = r12
            goto L_0x0018
        L_0x0015:
            r1 = r0
            r0 = r27
        L_0x0018:
            r13 = 0
            r14 = r1
        L_0x001a:
            r15 = r13
        L_0x001b:
            j$.util.concurrent.d[] r7 = r9.f18406c
            if (r7 == 0) goto L_0x00be
            int r8 = r7.length
            if (r8 <= 0) goto L_0x00be
            int r1 = r8 + -1
            r1 = r1 & r14
            r1 = r7[r1]
            if (r1 != 0) goto L_0x0063
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x0061
            j$.util.concurrent.d r7 = new j$.util.concurrent.d
            r7.<init>(r10)
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x0061
            sun.misc.Unsafe r1 = f18396j
            long r3 = f18400n
            r5 = 0
            r6 = 1
            r2 = r24
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x0061
            j$.util.concurrent.d[] r1 = r9.f18406c     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0056
            int r2 = r1.length     // Catch:{ all -> 0x005d }
            if (r2 <= 0) goto L_0x0056
            int r2 = r2 + -1
            r2 = r2 & r14
            r3 = r1[r2]     // Catch:{ all -> 0x005d }
            if (r3 != 0) goto L_0x0056
            r1[r2] = r7     // Catch:{ all -> 0x005d }
            r1 = r12
            goto L_0x0057
        L_0x0056:
            r1 = r13
        L_0x0057:
            r9.cellsBusy = r13
            if (r1 == 0) goto L_0x001b
            goto L_0x0102
        L_0x005d:
            r0 = move-exception
            r9.cellsBusy = r13
            throw r0
        L_0x0061:
            r15 = r13
            goto L_0x00b7
        L_0x0063:
            if (r0 != 0) goto L_0x0067
            r0 = r12
            goto L_0x00b7
        L_0x0067:
            sun.misc.Unsafe r2 = f18396j
            long r18 = f18401o
            long r3 = r1.value
            long r22 = r3 + r10
            r16 = r2
            r17 = r1
            r20 = r3
            boolean r1 = r16.compareAndSwapLong(r17, r18, r20, r22)
            if (r1 == 0) goto L_0x007d
            goto L_0x0102
        L_0x007d:
            j$.util.concurrent.d[] r1 = r9.f18406c
            if (r1 != r7) goto L_0x0061
            int r1 = f18395i
            if (r8 < r1) goto L_0x0086
            goto L_0x0061
        L_0x0086:
            if (r15 != 0) goto L_0x008a
            r15 = r12
            goto L_0x00b7
        L_0x008a:
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x00b7
            long r3 = f18400n
            r5 = 0
            r6 = 1
            r1 = r2
            r2 = r24
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x00b7
            j$.util.concurrent.d[] r1 = r9.f18406c     // Catch:{ all -> 0x00b3 }
            if (r1 != r7) goto L_0x00af
            int r1 = r8 << 1
            j$.util.concurrent.d[] r1 = new j$.util.concurrent.d[r1]     // Catch:{ all -> 0x00b3 }
            r2 = r13
        L_0x00a4:
            if (r2 >= r8) goto L_0x00ad
            r3 = r7[r2]     // Catch:{ all -> 0x00b3 }
            r1[r2] = r3     // Catch:{ all -> 0x00b3 }
            int r2 = r2 + 1
            goto L_0x00a4
        L_0x00ad:
            r9.f18406c = r1     // Catch:{ all -> 0x00b3 }
        L_0x00af:
            r9.cellsBusy = r13
            goto L_0x001a
        L_0x00b3:
            r0 = move-exception
            r9.cellsBusy = r13
            throw r0
        L_0x00b7:
            int r1 = j$.util.concurrent.ThreadLocalRandom.a(r14)
            r14 = r1
            goto L_0x001b
        L_0x00be:
            int r1 = r9.cellsBusy
            if (r1 != 0) goto L_0x00f2
            j$.util.concurrent.d[] r1 = r9.f18406c
            if (r1 != r7) goto L_0x00f2
            sun.misc.Unsafe r1 = f18396j
            long r3 = f18400n
            r5 = 0
            r6 = 1
            r2 = r24
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x00f2
            j$.util.concurrent.d[] r1 = r9.f18406c     // Catch:{ all -> 0x00ee }
            if (r1 != r7) goto L_0x00e8
            r1 = 2
            j$.util.concurrent.d[] r1 = new j$.util.concurrent.d[r1]     // Catch:{ all -> 0x00ee }
            r2 = r14 & 1
            j$.util.concurrent.d r3 = new j$.util.concurrent.d     // Catch:{ all -> 0x00ee }
            r3.<init>(r10)     // Catch:{ all -> 0x00ee }
            r1[r2] = r3     // Catch:{ all -> 0x00ee }
            r9.f18406c = r1     // Catch:{ all -> 0x00ee }
            r1 = r12
            goto L_0x00e9
        L_0x00e8:
            r1 = r13
        L_0x00e9:
            r9.cellsBusy = r13
            if (r1 == 0) goto L_0x001b
            goto L_0x0102
        L_0x00ee:
            r0 = move-exception
            r9.cellsBusy = r13
            throw r0
        L_0x00f2:
            sun.misc.Unsafe r1 = f18396j
            long r3 = f18399m
            long r5 = r9.baseCount
            long r7 = r5 + r10
            r2 = r24
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 == 0) goto L_0x001b
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.e(long, boolean):void");
    }

    /* JADX INFO: finally extract failed */
    private final m[] g() {
        while (true) {
            m[] mVarArr = this.f18404a;
            if (mVarArr != null && mVarArr.length != 0) {
                return mVarArr;
            }
            int i10 = this.sizeCtl;
            if (i10 < 0) {
                Thread.yield();
            } else {
                if (f18396j.compareAndSwapInt(this, f18397k, i10, -1)) {
                    try {
                        m[] mVarArr2 = this.f18404a;
                        if (mVarArr2 == null || mVarArr2.length == 0) {
                            int i11 = i10 > 0 ? i10 : 16;
                            m[] mVarArr3 = new m[i11];
                            this.f18404a = mVarArr3;
                            i10 = i11 - (i11 >>> 2);
                            mVarArr2 = mVarArr3;
                        }
                        this.sizeCtl = i10;
                        return mVarArr2;
                    } catch (Throwable th2) {
                        this.sizeCtl = i10;
                        throw th2;
                    }
                }
            }
        }
    }

    static final void j(m[] mVarArr, int i10, m mVar) {
        f18396j.putObjectVolatile(mVarArr, (((long) i10) << f18403q) + f18402p, mVar);
    }

    static final int k(int i10) {
        return (i10 ^ (i10 >>> 16)) & Integer.MAX_VALUE;
    }

    static final m m(m[] mVarArr, int i10) {
        return (m) f18396j.getObjectVolatile(mVarArr, (((long) i10) << f18403q) + f18402p);
    }

    private static final int n(int i10) {
        int i11 = i10 - 1;
        int i12 = i11 | (i11 >>> 1);
        int i13 = i12 | (i12 >>> 2);
        int i14 = i13 | (i13 >>> 4);
        int i15 = i14 | (i14 >>> 8);
        int i16 = i15 | (i15 >>> 16);
        if (i16 < 0) {
            return 1;
        }
        if (i16 >= 1073741824) {
            return 1073741824;
        }
        return 1 + i16;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: j$.util.concurrent.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v3, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v15, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v4, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v5, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v18, resolved type: j$.util.concurrent.s} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v19, resolved type: j$.util.concurrent.s} */
    /* JADX WARNING: type inference failed for: r6v12, types: [j$.util.concurrent.m] */
    /* JADX WARNING: type inference failed for: r15v16, types: [j$.util.concurrent.m] */
    /* JADX WARNING: type inference failed for: r6v17, types: [j$.util.concurrent.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void o(j$.util.concurrent.m[] r30, j$.util.concurrent.m[] r31) {
        /*
            r29 = this;
            r7 = r29
            r0 = r30
            int r8 = r0.length
            int r1 = f18395i
            r9 = 1
            if (r1 <= r9) goto L_0x000e
            int r2 = r8 >>> 3
            int r2 = r2 / r1
            goto L_0x000f
        L_0x000e:
            r2 = r8
        L_0x000f:
            r1 = 16
            if (r2 >= r1) goto L_0x0015
            r10 = r1
            goto L_0x0016
        L_0x0015:
            r10 = r2
        L_0x0016:
            if (r31 != 0) goto L_0x0028
            int r1 = r8 << 1
            j$.util.concurrent.m[] r1 = new j$.util.concurrent.m[r1]     // Catch:{ all -> 0x0022 }
            r7.f18405b = r1
            r7.transferIndex = r8
            r11 = r1
            goto L_0x002a
        L_0x0022:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r7.sizeCtl = r0
            return
        L_0x0028:
            r11 = r31
        L_0x002a:
            int r12 = r11.length
            j$.util.concurrent.h r13 = new j$.util.concurrent.h
            r13.<init>(r11)
            r4 = r0
            r3 = r7
            r15 = r9
            r5 = 0
            r6 = 0
            r16 = 0
        L_0x0037:
            r1 = -1
            if (r15 == 0) goto L_0x008a
            int r5 = r5 + -1
            if (r5 >= r6) goto L_0x007a
            if (r16 == 0) goto L_0x0041
            goto L_0x007a
        L_0x0041:
            int r2 = r3.transferIndex
            if (r2 > 0) goto L_0x004a
            r5 = r1
            r21 = r3
            r14 = r4
            goto L_0x0085
        L_0x004a:
            sun.misc.Unsafe r1 = f18396j
            long r17 = f18398l
            if (r2 <= r10) goto L_0x0053
            int r19 = r2 - r10
            goto L_0x0055
        L_0x0053:
            r19 = 0
        L_0x0055:
            r20 = r2
            r2 = r29
            r21 = r3
            r14 = r4
            r3 = r17
            r17 = r5
            r5 = r20
            r18 = r6
            r6 = r19
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x0072
            int r2 = r20 + -1
            r5 = r2
            r6 = r19
            goto L_0x0085
        L_0x0072:
            r4 = r14
            r5 = r17
            r6 = r18
            r3 = r21
            goto L_0x0037
        L_0x007a:
            r21 = r3
            r14 = r4
            r17 = r5
            r18 = r6
            r5 = r17
            r6 = r18
        L_0x0085:
            r4 = r14
            r3 = r21
            r15 = 0
            goto L_0x0037
        L_0x008a:
            r21 = r3
            r14 = r4
            r18 = r6
            r2 = 0
            if (r5 < 0) goto L_0x01af
            if (r5 >= r8) goto L_0x01af
            int r3 = r5 + r8
            if (r3 < r12) goto L_0x009a
            goto L_0x01af
        L_0x009a:
            j$.util.concurrent.m r4 = m(r14, r5)
            if (r4 != 0) goto L_0x00a5
            boolean r1 = b(r14, r5, r13)
            goto L_0x00aa
        L_0x00a5:
            int r6 = r4.f18429a
            if (r6 != r1) goto L_0x00b7
            r1 = r9
        L_0x00aa:
            r15 = r1
            r19 = r10
            r20 = r12
            r4 = r14
            r3 = r21
            r10 = r9
            r9 = r7
            r7 = r13
            goto L_0x01f6
        L_0x00b7:
            monitor-enter(r4)
            j$.util.concurrent.m r1 = m(r14, r5)     // Catch:{ all -> 0x01ac }
            if (r1 != r4) goto L_0x01a0
            if (r6 < 0) goto L_0x0113
            r1 = r6 & r8
            j$.util.concurrent.m r6 = r4.f18432d     // Catch:{ all -> 0x01ac }
            r15 = r4
        L_0x00c5:
            if (r6 == 0) goto L_0x00d2
            int r9 = r6.f18429a     // Catch:{ all -> 0x01ac }
            r9 = r9 & r8
            if (r9 == r1) goto L_0x00ce
            r15 = r6
            r1 = r9
        L_0x00ce:
            j$.util.concurrent.m r6 = r6.f18432d     // Catch:{ all -> 0x01ac }
            r9 = 1
            goto L_0x00c5
        L_0x00d2:
            if (r1 != 0) goto L_0x00d6
            r1 = r15
            goto L_0x00d8
        L_0x00d6:
            r1 = r2
            r2 = r15
        L_0x00d8:
            r6 = r4
        L_0x00d9:
            if (r6 == r15) goto L_0x0103
            int r9 = r6.f18429a     // Catch:{ all -> 0x01ac }
            r19 = r10
            java.lang.Object r10 = r6.f18430b     // Catch:{ all -> 0x01ac }
            r20 = r12
            java.lang.Object r12 = r6.f18431c     // Catch:{ all -> 0x01ac }
            r21 = r9 & r8
            if (r21 != 0) goto L_0x00f2
            r21 = r15
            j$.util.concurrent.m r15 = new j$.util.concurrent.m     // Catch:{ all -> 0x01ac }
            r15.<init>(r9, r10, r12, r1)     // Catch:{ all -> 0x01ac }
            r1 = r15
            goto L_0x00fa
        L_0x00f2:
            r21 = r15
            j$.util.concurrent.m r15 = new j$.util.concurrent.m     // Catch:{ all -> 0x01ac }
            r15.<init>(r9, r10, r12, r2)     // Catch:{ all -> 0x01ac }
            r2 = r15
        L_0x00fa:
            j$.util.concurrent.m r6 = r6.f18432d     // Catch:{ all -> 0x01ac }
            r10 = r19
            r12 = r20
            r15 = r21
            goto L_0x00d9
        L_0x0103:
            r19 = r10
            r20 = r12
            j(r11, r5, r1)     // Catch:{ all -> 0x01ac }
            j(r11, r3, r2)     // Catch:{ all -> 0x01ac }
            j(r14, r5, r13)     // Catch:{ all -> 0x01ac }
            r7 = r13
            goto L_0x019e
        L_0x0113:
            r19 = r10
            r20 = r12
            boolean r1 = r4 instanceof j$.util.concurrent.r     // Catch:{ all -> 0x01ac }
            if (r1 == 0) goto L_0x01a4
            r1 = r4
            j$.util.concurrent.r r1 = (j$.util.concurrent.r) r1     // Catch:{ all -> 0x01ac }
            j$.util.concurrent.s r6 = r1.f18448f     // Catch:{ all -> 0x01ac }
            r9 = r2
            r10 = r9
            r12 = r6
            r14 = 0
            r15 = 0
            r6 = r10
        L_0x0126:
            if (r12 == 0) goto L_0x0169
            r27 = r1
            int r1 = r12.f18429a     // Catch:{ all -> 0x01ac }
            j$.util.concurrent.s r7 = new j$.util.concurrent.s     // Catch:{ all -> 0x01ac }
            java.lang.Object r0 = r12.f18430b     // Catch:{ all -> 0x01ac }
            r28 = r13
            java.lang.Object r13 = r12.f18431c     // Catch:{ all -> 0x01ac }
            r25 = 0
            r26 = 0
            r21 = r7
            r22 = r1
            r23 = r0
            r24 = r13
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ all -> 0x01ac }
            r0 = r1 & r8
            if (r0 != 0) goto L_0x0153
            r7.f18453h = r10     // Catch:{ all -> 0x01ac }
            if (r10 != 0) goto L_0x014d
            r2 = r7
            goto L_0x014f
        L_0x014d:
            r10.f18432d = r7     // Catch:{ all -> 0x01ac }
        L_0x014f:
            int r14 = r14 + 1
            r10 = r7
            goto L_0x015e
        L_0x0153:
            r7.f18453h = r9     // Catch:{ all -> 0x01ac }
            if (r9 != 0) goto L_0x0159
            r6 = r7
            goto L_0x015b
        L_0x0159:
            r9.f18432d = r7     // Catch:{ all -> 0x01ac }
        L_0x015b:
            int r15 = r15 + 1
            r9 = r7
        L_0x015e:
            j$.util.concurrent.m r12 = r12.f18432d     // Catch:{ all -> 0x01ac }
            r7 = r29
            r0 = r30
            r1 = r27
            r13 = r28
            goto L_0x0126
        L_0x0169:
            r27 = r1
            r28 = r13
            r0 = 6
            if (r14 > r0) goto L_0x0175
            j$.util.concurrent.m r1 = r(r2)     // Catch:{ all -> 0x01ac }
            goto L_0x017f
        L_0x0175:
            if (r15 == 0) goto L_0x017d
            j$.util.concurrent.r r1 = new j$.util.concurrent.r     // Catch:{ all -> 0x01ac }
            r1.<init>(r2)     // Catch:{ all -> 0x01ac }
            goto L_0x017f
        L_0x017d:
            r1 = r27
        L_0x017f:
            if (r15 > r0) goto L_0x0186
            j$.util.concurrent.m r0 = r(r6)     // Catch:{ all -> 0x01ac }
            goto L_0x0190
        L_0x0186:
            if (r14 == 0) goto L_0x018e
            j$.util.concurrent.r r0 = new j$.util.concurrent.r     // Catch:{ all -> 0x01ac }
            r0.<init>(r6)     // Catch:{ all -> 0x01ac }
            goto L_0x0190
        L_0x018e:
            r0 = r27
        L_0x0190:
            j(r11, r5, r1)     // Catch:{ all -> 0x01ac }
            j(r11, r3, r0)     // Catch:{ all -> 0x01ac }
            r0 = r30
            r7 = r28
            j(r0, r5, r7)     // Catch:{ all -> 0x01ac }
            r14 = r0
        L_0x019e:
            r15 = 1
            goto L_0x01a5
        L_0x01a0:
            r19 = r10
            r20 = r12
        L_0x01a4:
            r7 = r13
        L_0x01a5:
            monitor-exit(r4)     // Catch:{ all -> 0x01ac }
            r3 = r29
            r4 = r14
            r10 = 1
            r9 = r3
            goto L_0x01f6
        L_0x01ac:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ac }
            throw r0
        L_0x01af:
            r19 = r10
            r20 = r12
            r7 = r13
            if (r16 == 0) goto L_0x01c5
            r9 = r29
            r9.f18405b = r2
            r9.f18404a = r11
            int r0 = r8 << 1
            r10 = 1
            int r1 = r8 >>> 1
            int r0 = r0 - r1
            r9.sizeCtl = r0
            return
        L_0x01c5:
            r10 = 1
            r9 = r29
            sun.misc.Unsafe r1 = f18396j
            long r3 = f18397k
            int r12 = r9.sizeCtl
            int r6 = r12 + -1
            r2 = r29
            r17 = r5
            r5 = r12
            boolean r1 = r1.compareAndSwapInt(r2, r3, r5, r6)
            if (r1 == 0) goto L_0x01f2
            int r12 = r12 + -2
            int r1 = java.lang.Integer.numberOfLeadingZeros(r8)
            r2 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r2
            int r2 = f18394h
            int r1 = r1 << r2
            if (r12 == r1) goto L_0x01eb
            return
        L_0x01eb:
            r5 = r8
            r3 = r9
            r15 = r10
            r16 = r15
            r4 = r14
            goto L_0x01f6
        L_0x01f2:
            r3 = r9
            r4 = r14
            r5 = r17
        L_0x01f6:
            r13 = r7
            r7 = r9
            r9 = r10
            r6 = r18
            r10 = r19
            r12 = r20
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.o(j$.util.concurrent.m[], j$.util.concurrent.m[]):void");
    }

    private final void p(m[] mVarArr, int i10) {
        int length = mVarArr.length;
        if (length < 64) {
            q(length << 1);
            return;
        }
        m m10 = m(mVarArr, i10);
        if (m10 != null && m10.f18429a >= 0) {
            synchronized (m10) {
                if (m(mVarArr, i10) == m10) {
                    s sVar = null;
                    m mVar = m10;
                    s sVar2 = null;
                    while (mVar != null) {
                        s sVar3 = new s(mVar.f18429a, mVar.f18430b, mVar.f18431c, (s) null, (s) null);
                        sVar3.f18453h = sVar2;
                        if (sVar2 == null) {
                            sVar = sVar3;
                        } else {
                            sVar2.f18432d = sVar3;
                        }
                        mVar = mVar.f18432d;
                        sVar2 = sVar3;
                    }
                    j(mVarArr, i10, new r(sVar));
                }
            }
        }
    }

    private final void q(int i10) {
        int length;
        m[] mVarArr;
        int n10 = i10 >= 536870912 ? 1073741824 : n(i10 + (i10 >>> 1) + 1);
        while (true) {
            int i11 = this.sizeCtl;
            if (i11 >= 0) {
                m[] mVarArr2 = this.f18404a;
                if (mVarArr2 == null || (length = mVarArr2.length) == 0) {
                    int i12 = i11 > n10 ? i11 : n10;
                    if (f18396j.compareAndSwapInt(this, f18397k, i11, -1)) {
                        try {
                            if (this.f18404a == mVarArr2) {
                                this.f18404a = new m[i12];
                                i11 = i12 - (i12 >>> 2);
                            }
                        } finally {
                            this.sizeCtl = i11;
                        }
                    }
                } else if (n10 > i11 && length < 1073741824) {
                    if (mVarArr2 == this.f18404a) {
                        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(length) | 32768;
                        if (i11 >= 0) {
                            if (f18396j.compareAndSwapInt(this, f18397k, i11, (numberOfLeadingZeros << f18394h) + 2)) {
                                o(mVarArr2, (m[]) null);
                            }
                        } else if ((i11 >>> f18394h) == numberOfLeadingZeros && i11 != numberOfLeadingZeros + 1 && i11 != numberOfLeadingZeros + f18393g && (mVarArr = this.f18405b) != null && this.transferIndex > 0) {
                            if (f18396j.compareAndSwapInt(this, f18397k, i11, i11 + 1)) {
                                o(mVarArr2, mVarArr);
                            }
                        } else {
                            return;
                        }
                    } else {
                        continue;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    static m r(s sVar) {
        m mVar = null;
        m mVar2 = null;
        for (m mVar3 = sVar; mVar3 != null; mVar3 = mVar3.f18432d) {
            m mVar4 = new m(mVar3.f18429a, mVar3.f18430b, mVar3.f18431c, (m) null);
            if (mVar2 == null) {
                mVar = mVar4;
            } else {
                mVar2.f18432d = mVar4;
            }
            mVar2 = mVar4;
        }
        return mVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        long j10;
        int i10;
        boolean z10;
        Object obj;
        this.sizeCtl = -1;
        objectInputStream.defaultReadObject();
        long j11 = 0;
        long j12 = 0;
        m mVar = null;
        while (true) {
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            j10 = 1;
            if (readObject != null && readObject2 != null) {
                j12++;
                mVar = new m(k(readObject.hashCode()), readObject, readObject2, mVar);
            }
        }
        if (j12 == 0) {
            this.sizeCtl = 0;
            return;
        }
        boolean z11 = true;
        if (j12 >= 536870912) {
            i10 = 1073741824;
        } else {
            int i11 = (int) j12;
            i10 = n(i11 + (i11 >>> 1) + 1);
        }
        m[] mVarArr = new m[i10];
        int i12 = i10 - 1;
        while (mVar != null) {
            m mVar2 = mVar.f18432d;
            int i13 = mVar.f18429a;
            int i14 = i13 & i12;
            m m10 = m(mVarArr, i14);
            if (m10 == null) {
                z10 = z11;
            } else {
                Object obj2 = mVar.f18430b;
                if (m10.f18429a >= 0) {
                    m mVar3 = m10;
                    int i15 = 0;
                    while (true) {
                        if (mVar3 == null) {
                            z10 = true;
                            break;
                        } else if (mVar3.f18429a != i13 || ((obj = mVar3.f18430b) != obj2 && (obj == null || !obj2.equals(obj)))) {
                            i15++;
                            mVar3 = mVar3.f18432d;
                        }
                    }
                    z10 = false;
                    if (z10 && i15 >= 8) {
                        j11++;
                        mVar.f18432d = m10;
                        m mVar4 = mVar;
                        s sVar = null;
                        s sVar2 = null;
                        while (mVar4 != null) {
                            long j13 = j11;
                            s sVar3 = new s(mVar4.f18429a, mVar4.f18430b, mVar4.f18431c, (s) null, (s) null);
                            sVar3.f18453h = sVar2;
                            if (sVar2 == null) {
                                sVar = sVar3;
                            } else {
                                sVar2.f18432d = sVar3;
                            }
                            mVar4 = mVar4.f18432d;
                            sVar2 = sVar3;
                            j11 = j13;
                        }
                        long j14 = j11;
                        j(mVarArr, i14, new r(sVar));
                    }
                } else if (((r) m10).f(i13, obj2, mVar.f18431c) == null) {
                    j11 += j10;
                }
                z10 = false;
            }
            if (z10) {
                j11++;
                mVar.f18432d = m10;
                j(mVarArr, i14, mVar);
            }
            j10 = 1;
            mVar = mVar2;
            z11 = true;
        }
        this.f18404a = mVarArr;
        this.sizeCtl = i10 - (i10 >>> 2);
        this.baseCount = j11;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int i10 = 1;
        int i11 = 0;
        while (i10 < 16) {
            i11++;
            i10 <<= 1;
        }
        int i12 = 32 - i11;
        int i13 = i10 - 1;
        o[] oVarArr = new o[16];
        for (int i14 = 0; i14 < 16; i14++) {
            oVarArr[i14] = new o();
        }
        objectOutputStream.putFields().put("segments", oVarArr);
        objectOutputStream.putFields().put("segmentShift", i12);
        objectOutputStream.putFields().put("segmentMask", i13);
        objectOutputStream.writeFields();
        m[] mVarArr = this.f18404a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m f10 = qVar.f();
                if (f10 == null) {
                    break;
                }
                objectOutputStream.writeObject(f10.f18430b);
                objectOutputStream.writeObject(f10.f18431c);
            }
        }
        objectOutputStream.writeObject((Object) null);
        objectOutputStream.writeObject((Object) null);
    }

    public final void clear() {
        m[] mVarArr = this.f18404a;
        int i10 = 0;
        long j10 = 0;
        while (mVarArr != null && i10 < mVarArr.length) {
            m m10 = m(mVarArr, i10);
            if (m10 == null) {
                i10++;
            } else {
                int i11 = m10.f18429a;
                if (i11 == -1) {
                    mVarArr = f(mVarArr, m10);
                    i10 = 0;
                } else {
                    synchronized (m10) {
                        if (m(mVarArr, i10) == m10) {
                            for (m mVar = i11 >= 0 ? m10 : m10 instanceof r ? ((r) m10).f18448f : null; mVar != null; mVar = mVar.f18432d) {
                                j10--;
                            }
                            j(mVarArr, i10, (m) null);
                            i10++;
                        }
                    }
                }
            }
        }
        if (j10 != 0) {
            a(j10, -1);
        }
    }

    /* JADX INFO: finally extract failed */
    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj2;
        Object obj3;
        int i10;
        m mVar;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int k10 = k(obj.hashCode());
        m[] mVarArr = this.f18404a;
        int i11 = 0;
        Object obj4 = null;
        int i12 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & k10;
                    m m10 = m(mVarArr, i13);
                    if (m10 == null) {
                        n nVar = new n();
                        synchronized (nVar) {
                            if (b(mVarArr, i13, nVar)) {
                                try {
                                    Object apply = biFunction.apply(obj, (Object) null);
                                    if (apply != null) {
                                        mVar = new m(k10, obj, apply, (m) null);
                                        i10 = 1;
                                    } else {
                                        i10 = i11;
                                        mVar = null;
                                    }
                                    j(mVarArr, i13, mVar);
                                    i11 = i10;
                                    obj4 = apply;
                                    i12 = 1;
                                } catch (Throwable th2) {
                                    j(mVarArr, i13, (m) null);
                                    throw th2;
                                }
                            }
                        }
                        if (i12 != 0) {
                            break;
                        }
                    } else {
                        int i14 = m10.f18429a;
                        if (i14 == -1) {
                            mVarArr = f(mVarArr, m10);
                        } else {
                            synchronized (m10) {
                                try {
                                    if (m(mVarArr, i13) == m10) {
                                        if (i14 >= 0) {
                                            m mVar2 = null;
                                            m mVar3 = m10;
                                            int i15 = 1;
                                            while (true) {
                                                if (mVar3.f18429a != k10 || ((obj3 = mVar3.f18430b) != obj && (obj3 == null || !obj.equals(obj3)))) {
                                                    m mVar4 = mVar3.f18432d;
                                                    if (mVar4 == null) {
                                                        Object apply2 = biFunction.apply(obj, (Object) null);
                                                        if (apply2 != null) {
                                                            mVar3.f18432d = new m(k10, obj, apply2, (m) null);
                                                            i11 = 1;
                                                        }
                                                        obj2 = apply2;
                                                    } else {
                                                        i15++;
                                                        m mVar5 = mVar4;
                                                        mVar2 = mVar3;
                                                        mVar3 = mVar5;
                                                    }
                                                }
                                            }
                                            obj2 = biFunction.apply(obj, mVar3.f18431c);
                                            if (obj2 != null) {
                                                mVar3.f18431c = obj2;
                                            } else {
                                                m mVar6 = mVar3.f18432d;
                                                if (mVar2 != null) {
                                                    mVar2.f18432d = mVar6;
                                                } else {
                                                    j(mVarArr, i13, mVar6);
                                                }
                                                i11 = -1;
                                            }
                                            i12 = i15;
                                            obj4 = obj2;
                                        } else if (m10 instanceof r) {
                                            r rVar = (r) m10;
                                            s sVar = rVar.f18447e;
                                            s b10 = sVar != null ? sVar.b(k10, obj, (Class) null) : null;
                                            Object apply3 = biFunction.apply(obj, b10 == null ? null : b10.f18431c);
                                            if (apply3 != null) {
                                                if (b10 != null) {
                                                    b10.f18431c = apply3;
                                                } else {
                                                    rVar.f(k10, obj, apply3);
                                                    i11 = 1;
                                                }
                                            } else if (b10 != null) {
                                                if (rVar.g(b10)) {
                                                    j(mVarArr, i13, r(rVar.f18448f));
                                                }
                                                i12 = 1;
                                                obj4 = apply3;
                                                i11 = -1;
                                            }
                                            i12 = 1;
                                            obj4 = apply3;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    while (true) {
                                        throw th3;
                                    }
                                }
                            }
                            if (i12 != 0) {
                                if (i12 >= 8) {
                                    p(mVarArr, i13);
                                }
                            }
                        }
                    }
                }
            }
            mVarArr = g();
        }
        if (i11 != 0) {
            a((long) i11, i12);
        }
        return obj4;
    }

    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00c4, code lost:
        if (r5 == null) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00c6, code lost:
        a(1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00cb, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object computeIfAbsent(java.lang.Object r13, j$.util.function.Function r14) {
        /*
            r12 = this;
            r0 = 0
            if (r13 == 0) goto L_0x00d5
            if (r14 == 0) goto L_0x00d5
            int r1 = r13.hashCode()
            int r1 = k(r1)
            j$.util.concurrent.m[] r2 = r12.f18404a
            r3 = 0
            r5 = r0
            r4 = r3
        L_0x0012:
            if (r2 == 0) goto L_0x00cf
            int r6 = r2.length
            if (r6 != 0) goto L_0x0019
            goto L_0x00cf
        L_0x0019:
            int r6 = r6 + -1
            r6 = r6 & r1
            j$.util.concurrent.m r7 = m(r2, r6)
            r8 = 1
            if (r7 != 0) goto L_0x004f
            j$.util.concurrent.n r9 = new j$.util.concurrent.n
            r9.<init>()
            monitor-enter(r9)
            boolean r7 = b(r2, r6, r9)     // Catch:{ all -> 0x004c }
            if (r7 == 0) goto L_0x0047
            java.lang.Object r4 = r14.apply(r13)     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x003b
            j$.util.concurrent.m r5 = new j$.util.concurrent.m     // Catch:{ all -> 0x0042 }
            r5.<init>(r1, r13, r4, r0)     // Catch:{ all -> 0x0042 }
            goto L_0x003c
        L_0x003b:
            r5 = r0
        L_0x003c:
            j(r2, r6, r5)     // Catch:{ all -> 0x004c }
            r5 = r4
            r4 = r8
            goto L_0x0047
        L_0x0042:
            r13 = move-exception
            j(r2, r6, r0)     // Catch:{ all -> 0x004c }
            throw r13     // Catch:{ all -> 0x004c }
        L_0x0047:
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x0012
            goto L_0x00c4
        L_0x004c:
            r13 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004c }
            throw r13
        L_0x004f:
            int r9 = r7.f18429a
            r10 = -1
            if (r9 != r10) goto L_0x0059
            j$.util.concurrent.m[] r2 = r12.f(r2, r7)
            goto L_0x0012
        L_0x0059:
            monitor-enter(r7)
            j$.util.concurrent.m r10 = m(r2, r6)     // Catch:{ all -> 0x00cc }
            if (r10 != r7) goto L_0x00b6
            if (r9 < 0) goto L_0x0094
            r4 = r7
            r5 = r8
        L_0x0064:
            int r9 = r4.f18429a     // Catch:{ all -> 0x00cc }
            if (r9 != r1) goto L_0x0078
            java.lang.Object r9 = r4.f18430b     // Catch:{ all -> 0x00cc }
            if (r9 == r13) goto L_0x0074
            if (r9 == 0) goto L_0x0078
            boolean r9 = r13.equals(r9)     // Catch:{ all -> 0x00cc }
            if (r9 == 0) goto L_0x0078
        L_0x0074:
            java.lang.Object r4 = r4.f18431c     // Catch:{ all -> 0x00cc }
            r8 = r3
            goto L_0x008c
        L_0x0078:
            j$.util.concurrent.m r9 = r4.f18432d     // Catch:{ all -> 0x00cc }
            if (r9 != 0) goto L_0x0090
            java.lang.Object r9 = r14.apply(r13)     // Catch:{ all -> 0x00cc }
            if (r9 == 0) goto L_0x008a
            j$.util.concurrent.m r10 = new j$.util.concurrent.m     // Catch:{ all -> 0x00cc }
            r10.<init>(r1, r13, r9, r0)     // Catch:{ all -> 0x00cc }
            r4.f18432d = r10     // Catch:{ all -> 0x00cc }
            goto L_0x008b
        L_0x008a:
            r8 = r3
        L_0x008b:
            r4 = r9
        L_0x008c:
            r11 = r5
            r5 = r4
            r4 = r11
            goto L_0x00b7
        L_0x0090:
            int r5 = r5 + 1
            r4 = r9
            goto L_0x0064
        L_0x0094:
            boolean r9 = r7 instanceof j$.util.concurrent.r     // Catch:{ all -> 0x00cc }
            if (r9 == 0) goto L_0x00b6
            r4 = 2
            r5 = r7
            j$.util.concurrent.r r5 = (j$.util.concurrent.r) r5     // Catch:{ all -> 0x00cc }
            j$.util.concurrent.s r9 = r5.f18447e     // Catch:{ all -> 0x00cc }
            if (r9 == 0) goto L_0x00a9
            j$.util.concurrent.s r9 = r9.b(r1, r13, r0)     // Catch:{ all -> 0x00cc }
            if (r9 == 0) goto L_0x00a9
            java.lang.Object r5 = r9.f18431c     // Catch:{ all -> 0x00cc }
            goto L_0x00b6
        L_0x00a9:
            java.lang.Object r9 = r14.apply(r13)     // Catch:{ all -> 0x00cc }
            if (r9 == 0) goto L_0x00b3
            r5.f(r1, r13, r9)     // Catch:{ all -> 0x00cc }
            goto L_0x00b4
        L_0x00b3:
            r8 = r3
        L_0x00b4:
            r5 = r9
            goto L_0x00b7
        L_0x00b6:
            r8 = r3
        L_0x00b7:
            monitor-exit(r7)     // Catch:{ all -> 0x00cc }
            if (r4 == 0) goto L_0x0012
            r13 = 8
            if (r4 < r13) goto L_0x00c1
            r12.p(r2, r6)
        L_0x00c1:
            if (r8 != 0) goto L_0x00c4
            return r5
        L_0x00c4:
            if (r5 == 0) goto L_0x00cb
            r13 = 1
            r12.a(r13, r4)
        L_0x00cb:
            return r5
        L_0x00cc:
            r13 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00cc }
            throw r13
        L_0x00cf:
            j$.util.concurrent.m[] r2 = r12.g()
            goto L_0x0012
        L_0x00d5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfAbsent(java.lang.Object, j$.util.function.Function):java.lang.Object");
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004a, code lost:
        r5 = r15.apply(r14, r8.f18431c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        if (r5 == null) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0052, code lost:
        r8.f18431c = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0055, code lost:
        r3 = r8.f18432d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        if (r10 == null) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r10.f18432d = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object computeIfPresent(java.lang.Object r14, j$.util.function.BiFunction r15) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L_0x00a9
            if (r15 == 0) goto L_0x00a9
            int r1 = r14.hashCode()
            int r1 = k(r1)
            j$.util.concurrent.m[] r2 = r13.f18404a
            r3 = 0
            r5 = r0
            r4 = r3
        L_0x0012:
            if (r2 == 0) goto L_0x00a3
            int r6 = r2.length
            if (r6 != 0) goto L_0x0019
            goto L_0x00a3
        L_0x0019:
            int r6 = r6 + -1
            r6 = r6 & r1
            j$.util.concurrent.m r7 = m(r2, r6)
            if (r7 != 0) goto L_0x0024
            goto L_0x009a
        L_0x0024:
            int r8 = r7.f18429a
            r9 = -1
            if (r8 != r9) goto L_0x002e
            j$.util.concurrent.m[] r2 = r13.f(r2, r7)
            goto L_0x0012
        L_0x002e:
            monitor-enter(r7)
            j$.util.concurrent.m r10 = m(r2, r6)     // Catch:{ all -> 0x0094 }
            if (r10 != r7) goto L_0x0097
            if (r8 < 0) goto L_0x0067
            r4 = 1
            r10 = r0
            r8 = r7
        L_0x003a:
            int r11 = r8.f18429a     // Catch:{ all -> 0x0094 }
            if (r11 != r1) goto L_0x005c
            java.lang.Object r11 = r8.f18430b     // Catch:{ all -> 0x0094 }
            if (r11 == r14) goto L_0x004a
            if (r11 == 0) goto L_0x005c
            boolean r11 = r14.equals(r11)     // Catch:{ all -> 0x0094 }
            if (r11 == 0) goto L_0x005c
        L_0x004a:
            java.lang.Object r5 = r8.f18431c     // Catch:{ all -> 0x0094 }
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch:{ all -> 0x0094 }
            if (r5 == 0) goto L_0x0055
            r8.f18431c = r5     // Catch:{ all -> 0x0094 }
            goto L_0x0097
        L_0x0055:
            j$.util.concurrent.m r3 = r8.f18432d     // Catch:{ all -> 0x0094 }
            if (r10 == 0) goto L_0x0090
            r10.f18432d = r3     // Catch:{ all -> 0x0094 }
            goto L_0x0096
        L_0x005c:
            j$.util.concurrent.m r10 = r8.f18432d     // Catch:{ all -> 0x0094 }
            if (r10 != 0) goto L_0x0061
            goto L_0x0097
        L_0x0061:
            int r4 = r4 + 1
            r12 = r10
            r10 = r8
            r8 = r12
            goto L_0x003a
        L_0x0067:
            boolean r8 = r7 instanceof j$.util.concurrent.r     // Catch:{ all -> 0x0094 }
            if (r8 == 0) goto L_0x0097
            r4 = 2
            r8 = r7
            j$.util.concurrent.r r8 = (j$.util.concurrent.r) r8     // Catch:{ all -> 0x0094 }
            j$.util.concurrent.s r10 = r8.f18447e     // Catch:{ all -> 0x0094 }
            if (r10 == 0) goto L_0x0097
            j$.util.concurrent.s r10 = r10.b(r1, r14, r0)     // Catch:{ all -> 0x0094 }
            if (r10 == 0) goto L_0x0097
            java.lang.Object r5 = r10.f18431c     // Catch:{ all -> 0x0094 }
            java.lang.Object r5 = r15.apply(r14, r5)     // Catch:{ all -> 0x0094 }
            if (r5 == 0) goto L_0x0084
            r10.f18431c = r5     // Catch:{ all -> 0x0094 }
            goto L_0x0097
        L_0x0084:
            boolean r3 = r8.g(r10)     // Catch:{ all -> 0x0094 }
            if (r3 == 0) goto L_0x0096
            j$.util.concurrent.s r3 = r8.f18448f     // Catch:{ all -> 0x0094 }
            j$.util.concurrent.m r3 = r(r3)     // Catch:{ all -> 0x0094 }
        L_0x0090:
            j(r2, r6, r3)     // Catch:{ all -> 0x0094 }
            goto L_0x0096
        L_0x0094:
            r14 = move-exception
            goto L_0x00a1
        L_0x0096:
            r3 = r9
        L_0x0097:
            monitor-exit(r7)     // Catch:{ all -> 0x0094 }
            if (r4 == 0) goto L_0x0012
        L_0x009a:
            if (r3 == 0) goto L_0x00a0
            long r14 = (long) r3
            r13.a(r14, r4)
        L_0x00a0:
            return r5
        L_0x00a1:
            monitor-exit(r7)     // Catch:{ all -> 0x0094 }
            throw r14
        L_0x00a3:
            j$.util.concurrent.m[] r2 = r13.g()
            goto L_0x0012
        L_0x00a9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.computeIfPresent(java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public final boolean containsValue(Object obj) {
        obj.getClass();
        m[] mVarArr = this.f18404a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m f10 = qVar.f();
                if (f10 == null) {
                    break;
                }
                Object obj2 = f10.f18431c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        f fVar = this.f18409f;
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = new f(this);
        this.f18409f = fVar2;
        return fVar2;
    }

    public final boolean equals(Object obj) {
        Object value;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        m[] mVarArr = this.f18404a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        q qVar = new q(mVarArr, length, 0, length);
        while (true) {
            m f10 = qVar.f();
            if (f10 != null) {
                Object obj3 = f10.f18431c;
                Object obj4 = map.get(f10.f18430b);
                if (obj4 == null || (obj4 != obj3 && !obj4.equals(obj3))) {
                    return false;
                }
            } else {
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (obj2 = get(key)) == null || (value != obj2 && !value.equals(obj2))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final m[] f(m[] mVarArr, m mVar) {
        m[] mVarArr2;
        int i10;
        if (!(mVar instanceof h) || (mVarArr2 = ((h) mVar).f18422e) == null) {
            return this.f18404a;
        }
        int numberOfLeadingZeros = Integer.numberOfLeadingZeros(mVarArr.length) | 32768;
        while (true) {
            if (mVarArr2 != this.f18405b || this.f18404a != mVarArr || (i10 = this.sizeCtl) >= 0 || (i10 >>> f18394h) != numberOfLeadingZeros || i10 == numberOfLeadingZeros + 1 || i10 == f18393g + numberOfLeadingZeros || this.transferIndex <= 0) {
                break;
            }
            if (f18396j.compareAndSwapInt(this, f18397k, i10, i10 + 1)) {
                o(mVarArr, mVarArr2);
                break;
            }
        }
        return mVarArr2;
    }

    public final void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        m[] mVarArr = this.f18404a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m f10 = qVar.f();
                if (f10 != null) {
                    biConsumer.accept(f10.f18430b, f10.f18431c);
                } else {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return r1.f18431c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            int r0 = k(r0)
            j$.util.concurrent.m[] r1 = r4.f18404a
            r2 = 0
            if (r1 == 0) goto L_0x004e
            int r3 = r1.length
            if (r3 <= 0) goto L_0x004e
            int r3 = r3 + -1
            r3 = r3 & r0
            j$.util.concurrent.m r1 = m(r1, r3)
            if (r1 == 0) goto L_0x004e
            int r3 = r1.f18429a
            if (r3 != r0) goto L_0x002c
            java.lang.Object r3 = r1.f18430b
            if (r3 == r5) goto L_0x0029
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x0029:
            java.lang.Object r5 = r1.f18431c
            return r5
        L_0x002c:
            if (r3 >= 0) goto L_0x0037
            j$.util.concurrent.m r5 = r1.a(r0, r5)
            if (r5 == 0) goto L_0x0036
            java.lang.Object r2 = r5.f18431c
        L_0x0036:
            return r2
        L_0x0037:
            j$.util.concurrent.m r1 = r1.f18432d
            if (r1 == 0) goto L_0x004e
            int r3 = r1.f18429a
            if (r3 != r0) goto L_0x0037
            java.lang.Object r3 = r1.f18430b
            if (r3 == r5) goto L_0x004b
            if (r3 == 0) goto L_0x0037
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L_0x0037
        L_0x004b:
            java.lang.Object r5 = r1.f18431c
            return r5
        L_0x004e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.get(java.lang.Object):java.lang.Object");
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        if (r11 == false) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(java.lang.Object r9, java.lang.Object r10, boolean r11) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0098
            if (r10 == 0) goto L_0x0098
            int r1 = r9.hashCode()
            int r1 = k(r1)
            r2 = 0
            j$.util.concurrent.m[] r3 = r8.f18404a
        L_0x0010:
            if (r3 == 0) goto L_0x0092
            int r4 = r3.length
            if (r4 != 0) goto L_0x0017
            goto L_0x0092
        L_0x0017:
            int r4 = r4 + -1
            r4 = r4 & r1
            j$.util.concurrent.m r5 = m(r3, r4)
            if (r5 != 0) goto L_0x002c
            j$.util.concurrent.m r5 = new j$.util.concurrent.m
            r5.<init>(r1, r9, r10, r0)
            boolean r4 = b(r3, r4, r5)
            if (r4 == 0) goto L_0x0010
            goto L_0x0089
        L_0x002c:
            int r6 = r5.f18429a
            r7 = -1
            if (r6 != r7) goto L_0x0036
            j$.util.concurrent.m[] r3 = r8.f(r3, r5)
            goto L_0x0010
        L_0x0036:
            monitor-enter(r5)
            j$.util.concurrent.m r7 = m(r3, r4)     // Catch:{ all -> 0x008f }
            if (r7 != r5) goto L_0x007b
            if (r6 < 0) goto L_0x0066
            r2 = 1
            r6 = r5
        L_0x0041:
            int r7 = r6.f18429a     // Catch:{ all -> 0x008f }
            if (r7 != r1) goto L_0x0056
            java.lang.Object r7 = r6.f18430b     // Catch:{ all -> 0x008f }
            if (r7 == r9) goto L_0x0051
            if (r7 == 0) goto L_0x0056
            boolean r7 = r9.equals(r7)     // Catch:{ all -> 0x008f }
            if (r7 == 0) goto L_0x0056
        L_0x0051:
            java.lang.Object r7 = r6.f18431c     // Catch:{ all -> 0x008f }
            if (r11 != 0) goto L_0x007c
            goto L_0x0078
        L_0x0056:
            j$.util.concurrent.m r7 = r6.f18432d     // Catch:{ all -> 0x008f }
            if (r7 != 0) goto L_0x0062
            j$.util.concurrent.m r7 = new j$.util.concurrent.m     // Catch:{ all -> 0x008f }
            r7.<init>(r1, r9, r10, r0)     // Catch:{ all -> 0x008f }
            r6.f18432d = r7     // Catch:{ all -> 0x008f }
            goto L_0x007b
        L_0x0062:
            int r2 = r2 + 1
            r6 = r7
            goto L_0x0041
        L_0x0066:
            boolean r6 = r5 instanceof j$.util.concurrent.r     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x007b
            r2 = 2
            r6 = r5
            j$.util.concurrent.r r6 = (j$.util.concurrent.r) r6     // Catch:{ all -> 0x008f }
            j$.util.concurrent.s r6 = r6.f(r1, r9, r10)     // Catch:{ all -> 0x008f }
            if (r6 == 0) goto L_0x007b
            java.lang.Object r7 = r6.f18431c     // Catch:{ all -> 0x008f }
            if (r11 != 0) goto L_0x007c
        L_0x0078:
            r6.f18431c = r10     // Catch:{ all -> 0x008f }
            goto L_0x007c
        L_0x007b:
            r7 = r0
        L_0x007c:
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0010
            r9 = 8
            if (r2 < r9) goto L_0x0086
            r8.p(r3, r4)
        L_0x0086:
            if (r7 == 0) goto L_0x0089
            return r7
        L_0x0089:
            r9 = 1
            r8.a(r9, r2)
            return r0
        L_0x008f:
            r9 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            throw r9
        L_0x0092:
            j$.util.concurrent.m[] r3 = r8.g()
            goto L_0x0010
        L_0x0098:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.h(java.lang.Object, java.lang.Object, boolean):java.lang.Object");
    }

    public final int hashCode() {
        m[] mVarArr = this.f18404a;
        int i10 = 0;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m f10 = qVar.f();
                if (f10 == null) {
                    break;
                }
                i10 += f10.f18431c.hashCode() ^ f10.f18430b.hashCode();
            }
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public final Object i(Object obj, Object obj2, Object obj3) {
        int length;
        int i10;
        m m10;
        Object obj4;
        m mVar;
        s b10;
        Object obj5;
        int k10 = k(obj.hashCode());
        m[] mVarArr = this.f18404a;
        while (true) {
            if (mVarArr == null || (length = mVarArr.length) == 0 || (m10 = m(mVarArr, i10)) == null) {
                break;
            }
            int i11 = m10.f18429a;
            if (i11 == -1) {
                mVarArr = f(mVarArr, m10);
            } else {
                boolean z10 = false;
                synchronized (m10) {
                    try {
                        if (m(mVarArr, (i10 = (length - 1) & k10)) == m10) {
                            if (i11 >= 0) {
                                m mVar2 = null;
                                m mVar3 = m10;
                                while (true) {
                                    if (mVar3.f18429a != k10 || ((obj5 = mVar3.f18430b) != obj && (obj5 == null || !obj.equals(obj5)))) {
                                        m mVar4 = mVar3.f18432d;
                                        if (mVar4 == null) {
                                            break;
                                        }
                                        m mVar5 = mVar4;
                                        mVar2 = mVar3;
                                        mVar3 = mVar5;
                                    }
                                }
                                obj4 = mVar3.f18431c;
                                if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                    if (obj2 != null) {
                                        mVar3.f18431c = obj2;
                                    } else if (mVar2 != null) {
                                        mVar2.f18432d = mVar3.f18432d;
                                    } else {
                                        mVar = mVar3.f18432d;
                                    }
                                    z10 = true;
                                }
                                obj4 = null;
                                z10 = true;
                            } else if (m10 instanceof r) {
                                r rVar = (r) m10;
                                s sVar = rVar.f18447e;
                                if (sVar != null && (b10 = sVar.b(k10, obj, (Class) null)) != null) {
                                    obj4 = b10.f18431c;
                                    if (obj3 == null || obj3 == obj4 || (obj4 != null && obj3.equals(obj4))) {
                                        if (obj2 != null) {
                                            b10.f18431c = obj2;
                                        } else if (rVar.g(b10)) {
                                            mVar = r(rVar.f18448f);
                                        }
                                        z10 = true;
                                    }
                                }
                                obj4 = null;
                                z10 = true;
                            }
                            j(mVarArr, i10, mVar);
                            z10 = true;
                        }
                        obj4 = null;
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
                if (z10) {
                    if (obj4 != null) {
                        if (obj2 == null) {
                            a(-1, -1);
                        }
                        return obj4;
                    }
                }
            }
        }
        return null;
    }

    public boolean isEmpty() {
        return l() <= 0;
    }

    public Set<K> keySet() {
        j jVar = this.f18407d;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this);
        this.f18407d = jVar2;
        return jVar2;
    }

    /* access modifiers changed from: package-private */
    public final long l() {
        d[] dVarArr = this.f18406c;
        long j10 = this.baseCount;
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                if (dVar != null) {
                    j10 += dVar.value;
                }
            }
        }
        return j10;
    }

    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i10;
        Object obj3;
        Object obj4;
        Object obj5 = obj;
        Object obj6 = obj2;
        BiFunction biFunction2 = biFunction;
        if (obj5 == null || obj6 == null || biFunction2 == null) {
            throw null;
        }
        int k10 = k(obj.hashCode());
        m[] mVarArr = this.f18404a;
        int i11 = 0;
        Object obj7 = null;
        int i12 = 0;
        while (true) {
            if (mVarArr != null) {
                int length = mVarArr.length;
                if (length != 0) {
                    int i13 = (length - 1) & k10;
                    m m10 = m(mVarArr, i13);
                    i10 = 1;
                    if (m10 != null) {
                        int i14 = m10.f18429a;
                        if (i14 == -1) {
                            mVarArr = f(mVarArr, m10);
                        } else {
                            synchronized (m10) {
                                try {
                                    if (m(mVarArr, i13) == m10) {
                                        if (i14 >= 0) {
                                            m mVar = null;
                                            m mVar2 = m10;
                                            int i15 = 1;
                                            while (true) {
                                                if (mVar2.f18429a != k10 || ((obj4 = mVar2.f18430b) != obj5 && (obj4 == null || !obj5.equals(obj4)))) {
                                                    m mVar3 = mVar2.f18432d;
                                                    if (mVar3 == null) {
                                                        mVar2.f18432d = new m(k10, obj5, obj6, (m) null);
                                                        i12 = 1;
                                                        obj3 = obj6;
                                                        break;
                                                    }
                                                    i15++;
                                                    m mVar4 = mVar3;
                                                    mVar = mVar2;
                                                    mVar2 = mVar4;
                                                }
                                            }
                                            obj3 = biFunction2.apply(mVar2.f18431c, obj6);
                                            if (obj3 != null) {
                                                mVar2.f18431c = obj3;
                                            } else {
                                                m mVar5 = mVar2.f18432d;
                                                if (mVar != null) {
                                                    mVar.f18432d = mVar5;
                                                } else {
                                                    j(mVarArr, i13, mVar5);
                                                }
                                                i12 = -1;
                                            }
                                            i11 = i15;
                                            obj7 = obj3;
                                        } else if (m10 instanceof r) {
                                            i11 = 2;
                                            r rVar = (r) m10;
                                            s sVar = rVar.f18447e;
                                            s b10 = sVar == null ? null : sVar.b(k10, obj5, (Class) null);
                                            Object apply = b10 == null ? obj6 : biFunction2.apply(b10.f18431c, obj6);
                                            if (apply != null) {
                                                if (b10 != null) {
                                                    b10.f18431c = apply;
                                                } else {
                                                    rVar.f(k10, obj5, apply);
                                                    i12 = 1;
                                                }
                                            } else if (b10 != null) {
                                                if (rVar.g(b10)) {
                                                    j(mVarArr, i13, r(rVar.f18448f));
                                                }
                                                i12 = -1;
                                            }
                                            obj7 = apply;
                                        }
                                    }
                                } catch (Throwable th2) {
                                    while (true) {
                                        throw th2;
                                    }
                                }
                            }
                            if (i11 != 0) {
                                if (i11 >= 8) {
                                    p(mVarArr, i13);
                                }
                                i10 = i12;
                                obj6 = obj7;
                            }
                        }
                    } else if (b(mVarArr, i13, new m(k10, obj5, obj6, (m) null))) {
                        break;
                    }
                }
            }
            mVarArr = g();
        }
        if (i10 != 0) {
            a((long) i10, i11);
        }
        return obj6;
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public V put(K k10, V v2) {
        return h(k10, v2, false);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        q(map.size());
        for (Map.Entry next : map.entrySet()) {
            h(next.getKey(), next.getValue(), false);
        }
    }

    public V putIfAbsent(K k10, V v2) {
        return h(k10, v2, true);
    }

    public V remove(Object obj) {
        return i(obj, (Object) null, (Object) null);
    }

    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || i(obj, (Object) null, obj2) == null) ? false : true;
    }

    public final Object replace(Object obj, Object obj2) {
        if (obj != null && obj2 != null) {
            return i(obj, obj2, (Object) null);
        }
        throw null;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj != null && obj2 != null && obj3 != null) {
            return i(obj, obj3, obj2) != null;
        }
        throw null;
    }

    public final void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        m[] mVarArr = this.f18404a;
        if (mVarArr != null) {
            q qVar = new q(mVarArr, mVarArr.length, 0, mVarArr.length);
            while (true) {
                m f10 = qVar.f();
                if (f10 != null) {
                    Object obj = f10.f18431c;
                    Object obj2 = f10.f18430b;
                    do {
                        Object apply = biFunction.apply(obj2, obj);
                        apply.getClass();
                        if (i(obj2, apply, obj) != null || (obj = get(obj2)) == null) {
                        }
                        Object apply2 = biFunction.apply(obj2, obj);
                        apply2.getClass();
                        break;
                    } while ((obj = get(obj2)) == null);
                } else {
                    return;
                }
            }
        }
    }

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public int size() {
        long l10 = l();
        if (l10 < 0) {
            return 0;
        }
        if (l10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) l10;
    }

    public final String toString() {
        m[] mVarArr = this.f18404a;
        int length = mVarArr == null ? 0 : mVarArr.length;
        q qVar = new q(mVarArr, length, 0, length);
        StringBuilder sb2 = new StringBuilder();
        sb2.append('{');
        m f10 = qVar.f();
        if (f10 != null) {
            while (true) {
                Object obj = f10.f18430b;
                Object obj2 = f10.f18431c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb2.append(obj);
                sb2.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb2.append(obj2);
                f10 = qVar.f();
                if (f10 == null) {
                    break;
                }
                sb2.append(',');
                sb2.append(' ');
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public Collection<V> values() {
        t tVar = this.f18408e;
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(this);
        this.f18408e = tVar2;
        return tVar2;
    }
}
