package j$.util.concurrent;

import j$.util.stream.C0462l0;
import j$.util.stream.C0501v0;
import j$.util.stream.E;
import j$.util.stream.IntStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamField;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class ThreadLocalRandom extends Random {

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicInteger f18410d = new AtomicInteger();

    /* renamed from: e  reason: collision with root package name */
    private static final AtomicLong f18411e;

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal f18412f = new ThreadLocal();

    /* renamed from: g  reason: collision with root package name */
    private static final ThreadLocal f18413g = new x();
    private static final long serialVersionUID = -5851777807851030925L;

    /* renamed from: a  reason: collision with root package name */
    long f18414a;

    /* renamed from: b  reason: collision with root package name */
    int f18415b;

    /* renamed from: c  reason: collision with root package name */
    boolean f18416c;

    static {
        long j10;
        if (((Boolean) AccessController.doPrivileged(new w())).booleanValue()) {
            byte[] seed = SecureRandom.getSeed(8);
            j10 = ((long) seed[0]) & 255;
            for (int i10 = 1; i10 < 8; i10++) {
                j10 = (j10 << 8) | (((long) seed[i10]) & 255);
            }
        } else {
            j10 = h(System.nanoTime()) ^ h(System.currentTimeMillis());
        }
        f18411e = new AtomicLong(j10);
        new ObjectStreamField("rnd", Long.TYPE);
        new ObjectStreamField("initialized", Boolean.TYPE);
    }

    private ThreadLocalRandom() {
        this.f18416c = true;
    }

    /* synthetic */ ThreadLocalRandom(int i10) {
        this();
    }

    static final int a(int i10) {
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >>> 17);
        int i13 = i12 ^ (i12 << 5);
        ((ThreadLocalRandom) f18413g.get()).f18415b = i13;
        return i13;
    }

    static final int b() {
        return ((ThreadLocalRandom) f18413g.get()).f18415b;
    }

    public static ThreadLocalRandom current() {
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f18413g.get();
        if (threadLocalRandom.f18415b == 0) {
            f();
        }
        return threadLocalRandom;
    }

    static final void f() {
        int addAndGet = f18410d.addAndGet(-1640531527);
        if (addAndGet == 0) {
            addAndGet = 1;
        }
        long h10 = h(f18411e.getAndAdd(-4942790177534073029L));
        ThreadLocalRandom threadLocalRandom = (ThreadLocalRandom) f18413g.get();
        threadLocalRandom.f18414a = h10;
        threadLocalRandom.f18415b = addAndGet;
    }

    private static int g(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * -49064778989728563L;
        return (int) (((j11 ^ (j11 >>> 33)) * -4265267296055464877L) >>> 32);
    }

    private static long h(long j10) {
        long j11 = (j10 ^ (j10 >>> 33)) * -49064778989728563L;
        long j12 = (j11 ^ (j11 >>> 33)) * -4265267296055464877L;
        return j12 ^ (j12 >>> 33);
    }

    private Object readResolve() {
        return current();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        ObjectOutputStream.PutField putFields = objectOutputStream.putFields();
        putFields.put("rnd", this.f18414a);
        putFields.put("initialized", true);
        objectOutputStream.writeFields();
    }

    /* access modifiers changed from: package-private */
    public final double c(double d10, double d11) {
        double nextLong = ((double) (nextLong() >>> 11)) * 1.1102230246251565E-16d;
        if (d10 >= d11) {
            return nextLong;
        }
        double d12 = ((d11 - d10) * nextLong) + d10;
        return d12 >= d11 ? Double.longBitsToDouble(Double.doubleToLongBits(d11) - 1) : d12;
    }

    /* access modifiers changed from: package-private */
    public final int d(int i10, int i11) {
        int i12;
        int g2 = g(i());
        if (i10 >= i11) {
            return g2;
        }
        int i13 = i11 - i10;
        int i14 = i13 - 1;
        if ((i13 & i14) == 0) {
            i12 = g2 & i14;
        } else if (i13 > 0) {
            int i15 = g2 >>> 1;
            while (true) {
                int i16 = i15 + i14;
                i12 = i15 % i13;
                if (i16 - i12 >= 0) {
                    break;
                }
                i15 = g(i()) >>> 1;
            }
        } else {
            while (true) {
                if (g2 >= i10 && g2 < i11) {
                    return g2;
                }
                g2 = g(i());
            }
        }
        return i12 + i10;
    }

    public final DoubleStream doubles() {
        return E.w(C0501v0.W0(new y(0, Long.MAX_VALUE, Double.MAX_VALUE, 0.0d)));
    }

    public final DoubleStream doubles(double d10, double d11) {
        if (d10 < d11) {
            return E.w(C0501v0.W0(new y(0, Long.MAX_VALUE, d10, d11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final DoubleStream doubles(long j10) {
        if (j10 >= 0) {
            return E.w(C0501v0.W0(new y(0, j10, Double.MAX_VALUE, 0.0d)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    public final DoubleStream doubles(long j10, double d10, double d11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (d10 < d11) {
            return E.w(C0501v0.W0(new y(0, j10, d10, d11)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    /* access modifiers changed from: package-private */
    public final long e(long j10, long j11) {
        long h10 = h(i());
        if (j10 >= j11) {
            return h10;
        }
        long j12 = j11 - j10;
        long j13 = j12 - 1;
        if ((j12 & j13) == 0) {
            return (h10 & j13) + j10;
        }
        if (j12 > 0) {
            while (true) {
                long j14 = h10 >>> 1;
                long j15 = j14 + j13;
                long j16 = j14 % j12;
                if (j15 - j16 >= 0) {
                    return j16 + j10;
                }
                h10 = h(i());
            }
        } else {
            while (true) {
                if (h10 >= j10 && h10 < j11) {
                    return h10;
                }
                h10 = h(i());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final long i() {
        long j10 = this.f18414a - 7046029254386353131L;
        this.f18414a = j10;
        return j10;
    }

    public final IntStream ints() {
        return IntStream.Wrapper.convert(C0501v0.g1(new z(0, Long.MAX_VALUE, Integer.MAX_VALUE, 0)));
    }

    public final java.util.stream.IntStream ints(int i10, int i11) {
        if (i10 < i11) {
            return IntStream.Wrapper.convert(C0501v0.g1(new z(0, Long.MAX_VALUE, i10, i11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final java.util.stream.IntStream ints(long j10) {
        if (j10 >= 0) {
            return IntStream.Wrapper.convert(C0501v0.g1(new z(0, j10, Integer.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    public final java.util.stream.IntStream ints(long j10, int i10, int i11) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (i10 < i11) {
            return IntStream.Wrapper.convert(C0501v0.g1(new z(0, j10, i10, i11)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    public final LongStream longs() {
        return C0462l0.w(C0501v0.i1(new A(0, Long.MAX_VALUE, Long.MAX_VALUE, 0)));
    }

    public final LongStream longs(long j10) {
        if (j10 >= 0) {
            return C0462l0.w(C0501v0.i1(new A(0, j10, Long.MAX_VALUE, 0)));
        }
        throw new IllegalArgumentException("size must be non-negative");
    }

    public final LongStream longs(long j10, long j11) {
        if (j10 < j11) {
            return C0462l0.w(C0501v0.i1(new A(0, Long.MAX_VALUE, j10, j11)));
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final LongStream longs(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IllegalArgumentException("size must be non-negative");
        } else if (j11 < j12) {
            return C0462l0.w(C0501v0.i1(new A(0, j10, j11, j12)));
        } else {
            throw new IllegalArgumentException("bound must be greater than origin");
        }
    }

    /* access modifiers changed from: protected */
    public final int next(int i10) {
        return (int) (h(i()) >>> (64 - i10));
    }

    public final boolean nextBoolean() {
        return g(i()) < 0;
    }

    public final double nextDouble() {
        return ((double) (h(i()) >>> 11)) * 1.1102230246251565E-16d;
    }

    public final float nextFloat() {
        return ((float) (g(i()) >>> 8)) * 5.9604645E-8f;
    }

    public final double nextGaussian() {
        ThreadLocal threadLocal = f18412f;
        Double d10 = (Double) threadLocal.get();
        if (d10 != null) {
            threadLocal.set((Object) null);
            return d10.doubleValue();
        }
        while (true) {
            double nextDouble = (nextDouble() * 2.0d) - 1.0d;
            double nextDouble2 = (nextDouble() * 2.0d) - 1.0d;
            double d11 = (nextDouble2 * nextDouble2) + (nextDouble * nextDouble);
            if (d11 < 1.0d && d11 != 0.0d) {
                double sqrt = StrictMath.sqrt((StrictMath.log(d11) * -2.0d) / d11);
                f18412f.set(new Double(nextDouble2 * sqrt));
                return nextDouble * sqrt;
            }
        }
    }

    public final int nextInt() {
        return g(i());
    }

    public final int nextInt(int i10) {
        if (i10 > 0) {
            int g2 = g(i());
            int i11 = i10 - 1;
            if ((i10 & i11) == 0) {
                return g2 & i11;
            }
            while (true) {
                int i12 = g2 >>> 1;
                int i13 = i12 + i11;
                int i14 = i12 % i10;
                if (i13 - i14 >= 0) {
                    return i14;
                }
                g2 = g(i());
            }
        } else {
            throw new IllegalArgumentException("bound must be positive");
        }
    }

    public int nextInt(int i10, int i11) {
        if (i10 < i11) {
            return d(i10, i11);
        }
        throw new IllegalArgumentException("bound must be greater than origin");
    }

    public final long nextLong() {
        return h(i());
    }

    public final void setSeed(long j10) {
        if (this.f18416c) {
            throw new UnsupportedOperationException();
        }
    }
}
