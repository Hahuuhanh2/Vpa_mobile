package tc;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: UnsafeUtil */
public final class b0 {

    /* renamed from: a  reason: collision with root package name */
    public static final Unsafe f14952a;

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f14953b = a.f14944a;

    /* renamed from: c  reason: collision with root package name */
    public static final e f14954c;

    /* renamed from: d  reason: collision with root package name */
    public static final boolean f14955d;

    /* renamed from: e  reason: collision with root package name */
    public static final boolean f14956e;

    /* renamed from: f  reason: collision with root package name */
    public static final long f14957f = ((long) c(byte[].class));

    /* renamed from: g  reason: collision with root package name */
    public static final boolean f14958g;

    /* compiled from: UnsafeUtil */
    public class a implements PrivilegedExceptionAction<Unsafe> {
        public static Unsafe a() {
            Class<Unsafe> cls = Unsafe.class;
            for (Field field : cls.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get((Object) null);
                if (cls.isInstance(obj)) {
                    return cls.cast(obj);
                }
            }
            return null;
        }

        public final /* bridge */ /* synthetic */ Object run() {
            return a();
        }
    }

    /* compiled from: UnsafeUtil */
    public static final class b extends e {
        public b(Unsafe unsafe) {
            super(unsafe);
        }

        public final boolean c(Object obj, long j10) {
            if (b0.f14958g) {
                if (b0.i(obj, j10) != 0) {
                    return true;
                }
                return false;
            } else if (b0.j(obj, j10) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final byte d(Object obj, long j10) {
            if (b0.f14958g) {
                return b0.i(obj, j10);
            }
            return b0.j(obj, j10);
        }

        public final double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public final float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public final void k(Object obj, long j10, boolean z10) {
            if (b0.f14958g) {
                b0.r(obj, j10, z10 ? (byte) 1 : 0);
            } else {
                b0.s(obj, j10, z10 ? (byte) 1 : 0);
            }
        }

        public final void l(Object obj, long j10, byte b10) {
            if (b0.f14958g) {
                b0.r(obj, j10, b10);
            } else {
                b0.s(obj, j10, b10);
            }
        }

        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void n(Object obj, long j10, float f10) {
            o(obj, Float.floatToIntBits(f10), j10);
        }

        public final boolean s() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil */
    public static final class c extends e {
        public c(Unsafe unsafe) {
            super(unsafe);
        }

        public final boolean c(Object obj, long j10) {
            if (b0.f14958g) {
                if (b0.i(obj, j10) != 0) {
                    return true;
                }
                return false;
            } else if (b0.j(obj, j10) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final byte d(Object obj, long j10) {
            if (b0.f14958g) {
                return b0.i(obj, j10);
            }
            return b0.j(obj, j10);
        }

        public final double e(Object obj, long j10) {
            return Double.longBitsToDouble(h(obj, j10));
        }

        public final float f(Object obj, long j10) {
            return Float.intBitsToFloat(g(obj, j10));
        }

        public final void k(Object obj, long j10, boolean z10) {
            if (b0.f14958g) {
                b0.r(obj, j10, z10 ? (byte) 1 : 0);
            } else {
                b0.s(obj, j10, z10 ? (byte) 1 : 0);
            }
        }

        public final void l(Object obj, long j10, byte b10) {
            if (b0.f14958g) {
                b0.r(obj, j10, b10);
            } else {
                b0.s(obj, j10, b10);
            }
        }

        public final void m(Object obj, long j10, double d10) {
            p(obj, j10, Double.doubleToLongBits(d10));
        }

        public final void n(Object obj, long j10, float f10) {
            o(obj, Float.floatToIntBits(f10), j10);
        }

        public final boolean s() {
            return false;
        }
    }

    /* compiled from: UnsafeUtil */
    public static final class d extends e {
        public d(Unsafe unsafe) {
            super(unsafe);
        }

        public final boolean c(Object obj, long j10) {
            return this.f14959a.getBoolean(obj, j10);
        }

        public final byte d(Object obj, long j10) {
            return this.f14959a.getByte(obj, j10);
        }

        public final double e(Object obj, long j10) {
            return this.f14959a.getDouble(obj, j10);
        }

        public final float f(Object obj, long j10) {
            return this.f14959a.getFloat(obj, j10);
        }

        public final void k(Object obj, long j10, boolean z10) {
            this.f14959a.putBoolean(obj, j10, z10);
        }

        public final void l(Object obj, long j10, byte b10) {
            this.f14959a.putByte(obj, j10, b10);
        }

        public final void m(Object obj, long j10, double d10) {
            this.f14959a.putDouble(obj, j10, d10);
        }

        public final void n(Object obj, long j10, float f10) {
            this.f14959a.putFloat(obj, j10, f10);
        }

        public final boolean r() {
            Class<Object> cls = Object.class;
            if (!super.r()) {
                return false;
            }
            try {
                Class<?> cls2 = this.f14959a.getClass();
                Class cls3 = Long.TYPE;
                cls2.getMethod("getByte", new Class[]{cls, cls3});
                cls2.getMethod("putByte", new Class[]{cls, cls3, Byte.TYPE});
                cls2.getMethod("getBoolean", new Class[]{cls, cls3});
                cls2.getMethod("putBoolean", new Class[]{cls, cls3, Boolean.TYPE});
                cls2.getMethod("getFloat", new Class[]{cls, cls3});
                cls2.getMethod("putFloat", new Class[]{cls, cls3, Float.TYPE});
                cls2.getMethod("getDouble", new Class[]{cls, cls3});
                cls2.getMethod("putDouble", new Class[]{cls, cls3, Double.TYPE});
                return true;
            } catch (Throwable th2) {
                b0.a(th2);
                return false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003a A[SYNTHETIC, Splitter:B:11:0x003a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean s() {
            /*
                r11 = this;
                java.lang.String r0 = "copyMemory"
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                sun.misc.Unsafe r2 = r11.f14959a
                java.lang.String r3 = "getLong"
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 != 0) goto L_0x000f
            L_0x000d:
                r2 = r6
                goto L_0x0037
            L_0x000f:
                java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0032 }
                java.lang.String r7 = "objectFieldOffset"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x0032 }
                java.lang.Class<java.lang.reflect.Field> r9 = java.lang.reflect.Field.class
                r8[r6] = r9     // Catch:{ all -> 0x0032 }
                r2.getMethod(r7, r8)     // Catch:{ all -> 0x0032 }
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x0032 }
                r7[r6] = r1     // Catch:{ all -> 0x0032 }
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ all -> 0x0032 }
                r7[r5] = r8     // Catch:{ all -> 0x0032 }
                r2.getMethod(r3, r7)     // Catch:{ all -> 0x0032 }
                java.lang.reflect.Field r2 = tc.b0.e()     // Catch:{ all -> 0x0032 }
                if (r2 != 0) goto L_0x0030
                goto L_0x000d
            L_0x0030:
                r2 = r5
                goto L_0x0037
            L_0x0032:
                r2 = move-exception
                tc.b0.a(r2)
                goto L_0x000d
            L_0x0037:
                if (r2 != 0) goto L_0x003a
                return r6
            L_0x003a:
                sun.misc.Unsafe r2 = r11.f14959a     // Catch:{ all -> 0x009e }
                java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x009e }
                java.lang.String r7 = "getByte"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x009e }
                java.lang.Class r9 = java.lang.Long.TYPE     // Catch:{ all -> 0x009e }
                r8[r6] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r7, r8)     // Catch:{ all -> 0x009e }
                java.lang.String r7 = "putByte"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x009e }
                r8[r6] = r9     // Catch:{ all -> 0x009e }
                java.lang.Class r10 = java.lang.Byte.TYPE     // Catch:{ all -> 0x009e }
                r8[r5] = r10     // Catch:{ all -> 0x009e }
                r2.getMethod(r7, r8)     // Catch:{ all -> 0x009e }
                java.lang.String r7 = "getInt"
                java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch:{ all -> 0x009e }
                r8[r6] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r7, r8)     // Catch:{ all -> 0x009e }
                java.lang.String r7 = "putInt"
                java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch:{ all -> 0x009e }
                r8[r6] = r9     // Catch:{ all -> 0x009e }
                java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x009e }
                r8[r5] = r10     // Catch:{ all -> 0x009e }
                r2.getMethod(r7, r8)     // Catch:{ all -> 0x009e }
                java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch:{ all -> 0x009e }
                r7[r6] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r3, r7)     // Catch:{ all -> 0x009e }
                java.lang.String r3 = "putLong"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x009e }
                r7[r6] = r9     // Catch:{ all -> 0x009e }
                r7[r5] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r3, r7)     // Catch:{ all -> 0x009e }
                r3 = 3
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x009e }
                r7[r6] = r9     // Catch:{ all -> 0x009e }
                r7[r5] = r9     // Catch:{ all -> 0x009e }
                r7[r4] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r0, r7)     // Catch:{ all -> 0x009e }
                r7 = 5
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ all -> 0x009e }
                r7[r6] = r1     // Catch:{ all -> 0x009e }
                r7[r5] = r9     // Catch:{ all -> 0x009e }
                r7[r4] = r1     // Catch:{ all -> 0x009e }
                r7[r3] = r9     // Catch:{ all -> 0x009e }
                r1 = 4
                r7[r1] = r9     // Catch:{ all -> 0x009e }
                r2.getMethod(r0, r7)     // Catch:{ all -> 0x009e }
                return r5
            L_0x009e:
                r0 = move-exception
                tc.b0.a(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: tc.b0.d.s():boolean");
        }
    }

    /* compiled from: UnsafeUtil */
    public static abstract class e {

        /* renamed from: a  reason: collision with root package name */
        public Unsafe f14959a;

        public e(Unsafe unsafe) {
            this.f14959a = unsafe;
        }

        public final int a(Class<?> cls) {
            return this.f14959a.arrayBaseOffset(cls);
        }

        public final int b(Class<?> cls) {
            return this.f14959a.arrayIndexScale(cls);
        }

        public abstract boolean c(Object obj, long j10);

        public abstract byte d(Object obj, long j10);

        public abstract double e(Object obj, long j10);

        public abstract float f(Object obj, long j10);

        public final int g(Object obj, long j10) {
            return this.f14959a.getInt(obj, j10);
        }

        public final long h(Object obj, long j10) {
            return this.f14959a.getLong(obj, j10);
        }

        public final Object i(Object obj, long j10) {
            return this.f14959a.getObject(obj, j10);
        }

        public final long j(Field field) {
            return this.f14959a.objectFieldOffset(field);
        }

        public abstract void k(Object obj, long j10, boolean z10);

        public abstract void l(Object obj, long j10, byte b10);

        public abstract void m(Object obj, long j10, double d10);

        public abstract void n(Object obj, long j10, float f10);

        public final void o(Object obj, int i10, long j10) {
            this.f14959a.putInt(obj, j10, i10);
        }

        public final void p(Object obj, long j10, long j11) {
            this.f14959a.putLong(obj, j10, j11);
        }

        public final void q(Object obj, long j10, Object obj2) {
            this.f14959a.putObject(obj, j10, obj2);
        }

        public boolean r() {
            Class<Object> cls = Object.class;
            Unsafe unsafe = this.f14959a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls2 = unsafe.getClass();
                cls2.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls2.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls2.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls3 = Long.TYPE;
                cls2.getMethod("getInt", new Class[]{cls, cls3});
                cls2.getMethod("putInt", new Class[]{cls, cls3, Integer.TYPE});
                cls2.getMethod("getLong", new Class[]{cls, cls3});
                cls2.getMethod("putLong", new Class[]{cls, cls3, cls3});
                cls2.getMethod("getObject", new Class[]{cls, cls3});
                cls2.getMethod("putObject", new Class[]{cls, cls3, cls});
                return true;
            } catch (Throwable th2) {
                b0.a(th2);
                return false;
            }
        }

        public abstract boolean s();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009a  */
    static {
        /*
            java.lang.Class<java.lang.Object[]> r0 = java.lang.Object[].class
            java.lang.Class<double[]> r1 = double[].class
            java.lang.Class<float[]> r2 = float[].class
            java.lang.Class<long[]> r3 = long[].class
            java.lang.Class<int[]> r4 = int[].class
            java.lang.Class<boolean[]> r5 = boolean[].class
            sun.misc.Unsafe r6 = p()
            f14952a = r6
            java.lang.Class<?> r7 = tc.a.f14944a
            f14953b = r7
            java.lang.Class r7 = java.lang.Long.TYPE
            boolean r7 = f(r7)
            java.lang.Class r8 = java.lang.Integer.TYPE
            boolean r8 = f(r8)
            if (r6 != 0) goto L_0x0025
            goto L_0x003b
        L_0x0025:
            boolean r9 = tc.a.a()
            if (r9 == 0) goto L_0x003d
            if (r7 == 0) goto L_0x0033
            tc.b0$c r7 = new tc.b0$c
            r7.<init>(r6)
            goto L_0x0042
        L_0x0033:
            if (r8 == 0) goto L_0x003b
            tc.b0$b r7 = new tc.b0$b
            r7.<init>(r6)
            goto L_0x0042
        L_0x003b:
            r7 = 0
            goto L_0x0042
        L_0x003d:
            tc.b0$d r7 = new tc.b0$d
            r7.<init>(r6)
        L_0x0042:
            f14954c = r7
            r6 = 0
            if (r7 != 0) goto L_0x0049
            r8 = r6
            goto L_0x004d
        L_0x0049:
            boolean r8 = r7.s()
        L_0x004d:
            f14955d = r8
            if (r7 != 0) goto L_0x0053
            r8 = r6
            goto L_0x0057
        L_0x0053:
            boolean r8 = r7.r()
        L_0x0057:
            f14956e = r8
            java.lang.Class<byte[]> r8 = byte[].class
            int r8 = c(r8)
            long r8 = (long) r8
            f14957f = r8
            c(r5)
            d(r5)
            c(r4)
            d(r4)
            c(r3)
            d(r3)
            c(r2)
            d(r2)
            c(r1)
            d(r1)
            c(r0)
            d(r0)
            java.lang.reflect.Field r0 = e()
            if (r0 == 0) goto L_0x0092
            if (r7 != 0) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r7.j(r0)
        L_0x0092:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            if (r0 != r1) goto L_0x009b
            r6 = 1
        L_0x009b:
            f14958g = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tc.b0.<clinit>():void");
    }

    public static void a(Throwable th2) {
        Logger logger = Logger.getLogger(b0.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th2);
    }

    public static <T> T b(Class<T> cls) {
        try {
            return f14952a.allocateInstance(cls);
        } catch (InstantiationException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static int c(Class<?> cls) {
        if (f14956e) {
            return f14954c.a(cls);
        }
        return -1;
    }

    public static void d(Class cls) {
        if (f14956e) {
            f14954c.b(cls);
        }
    }

    public static Field e() {
        Field field;
        Field field2;
        if (a.a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField("address");
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    public static boolean f(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!a.a()) {
            return false;
        }
        try {
            Class<?> cls3 = f14953b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean g(Object obj, long j10) {
        return f14954c.c(obj, j10);
    }

    public static byte h(byte[] bArr, long j10) {
        return f14954c.d(bArr, f14957f + j10);
    }

    public static byte i(Object obj, long j10) {
        return (byte) ((m(obj, -4 & j10) >>> ((int) (((~j10) & 3) << 3))) & 255);
    }

    public static byte j(Object obj, long j10) {
        return (byte) ((m(obj, -4 & j10) >>> ((int) ((j10 & 3) << 3))) & 255);
    }

    public static double k(Object obj, long j10) {
        return f14954c.e(obj, j10);
    }

    public static float l(Object obj, long j10) {
        return f14954c.f(obj, j10);
    }

    public static int m(Object obj, long j10) {
        return f14954c.g(obj, j10);
    }

    public static long n(Object obj, long j10) {
        return f14954c.h(obj, j10);
    }

    public static Object o(Object obj, long j10) {
        return f14954c.i(obj, j10);
    }

    public static Unsafe p() {
        try {
            return (Unsafe) AccessController.doPrivileged(new a());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void q(byte[] bArr, long j10, byte b10) {
        f14954c.l(bArr, f14957f + j10, b10);
    }

    public static void r(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int m10 = m(obj, j11);
        int i10 = ((~((int) j10)) & 3) << 3;
        t(obj, ((255 & b10) << i10) | (m10 & (~(255 << i10))), j11);
    }

    public static void s(Object obj, long j10, byte b10) {
        long j11 = -4 & j10;
        int i10 = (((int) j10) & 3) << 3;
        t(obj, ((255 & b10) << i10) | (m(obj, j11) & (~(255 << i10))), j11);
    }

    public static void t(Object obj, int i10, long j10) {
        f14954c.o(obj, i10, j10);
    }

    public static void u(Object obj, long j10, long j11) {
        f14954c.p(obj, j10, j11);
    }

    public static void v(Object obj, long j10, Object obj2) {
        f14954c.q(obj, j10, obj2);
    }
}
