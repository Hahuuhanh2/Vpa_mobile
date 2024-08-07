package l6;

import c6.d;
import java.util.Map;
import java.util.Set;

/* compiled from: SchedulerConfig */
public abstract class e {

    /* compiled from: SchedulerConfig */
    public static abstract class a {

        /* renamed from: l6.e$a$a  reason: collision with other inner class name */
        /* compiled from: SchedulerConfig */
        public static abstract class C0156a {
        }

        public abstract long a();

        public abstract Set<b> b();

        public abstract long c();
    }

    /* compiled from: SchedulerConfig */
    public enum b {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    public abstract o6.a a();

    public final long b(d dVar, long j10, int i10) {
        long j11;
        long a10 = j10 - a().a();
        a aVar = c().get(dVar);
        long a11 = aVar.a();
        int i11 = i10 - 1;
        if (a11 > 1) {
            j11 = a11;
        } else {
            j11 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, (double) i11) * ((double) a11) * Math.max(1.0d, Math.log(10000.0d) / Math.log((double) (j11 * ((long) i11))))), a10), aVar.c());
    }

    public abstract Map<d, a> c();
}
