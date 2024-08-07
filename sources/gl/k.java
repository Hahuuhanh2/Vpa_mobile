package gl;

import fl.u;
import java.util.concurrent.TimeUnit;
import p3.l0;

/* compiled from: Tasks.kt */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final String f20489a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f20490b = l0.N0("kotlinx.coroutines.scheduler.resolution.ns", 100000, 1, Long.MAX_VALUE);

    /* renamed from: c  reason: collision with root package name */
    public static final int f20491c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f20492d = l0.O0("kotlinx.coroutines.scheduler.max.pool.size", 2097150, 0, 2097150, 4);

    /* renamed from: e  reason: collision with root package name */
    public static final long f20493e = TimeUnit.SECONDS.toNanos(l0.N0("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));

    /* renamed from: f  reason: collision with root package name */
    public static e f20494f = e.f20483b;

    /* renamed from: g  reason: collision with root package name */
    public static final i f20495g = new i(0);

    /* renamed from: h  reason: collision with root package name */
    public static final i f20496h = new i(1);

    static {
        String str;
        int i10 = u.f20263a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        f20489a = str;
        int i11 = u.f20263a;
        if (i11 < 2) {
            i11 = 2;
        }
        f20491c = l0.O0("kotlinx.coroutines.scheduler.core.pool.size", i11, 1, 0, 8);
    }
}
