package sb;

import java.util.concurrent.TimeUnit;

/* compiled from: Rate */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public long f14715a;

    /* renamed from: b  reason: collision with root package name */
    public long f14716b;

    /* renamed from: c  reason: collision with root package name */
    public TimeUnit f14717c;

    /* compiled from: Rate */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14718a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14718a = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14718a     // Catch:{ NoSuchFieldError -> 0x001d }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14718a     // Catch:{ NoSuchFieldError -> 0x0028 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sb.g.a.<clinit>():void");
        }
    }

    public g(long j10, long j11, TimeUnit timeUnit) {
        this.f14715a = j10;
        this.f14716b = j11;
        this.f14717c = timeUnit;
    }

    public final double a() {
        int i10 = a.f14718a[this.f14717c.ordinal()];
        if (i10 == 1) {
            return (((double) this.f14715a) / ((double) this.f14716b)) * ((double) TimeUnit.SECONDS.toNanos(1));
        }
        if (i10 == 2) {
            return (((double) this.f14715a) / ((double) this.f14716b)) * ((double) TimeUnit.SECONDS.toMicros(1));
        }
        if (i10 != 3) {
            return ((double) this.f14715a) / ((double) this.f14717c.toSeconds(this.f14716b));
        }
        return (((double) this.f14715a) / ((double) this.f14716b)) * ((double) TimeUnit.SECONDS.toMillis(1));
    }
}
