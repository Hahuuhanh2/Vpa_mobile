package da;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import v.n;

/* compiled from: CustomThreadFactory */
public final class a implements ThreadFactory {

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadFactory f8824e = Executors.defaultThreadFactory();

    /* renamed from: a  reason: collision with root package name */
    public final AtomicLong f8825a = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public final String f8826b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8827c;

    /* renamed from: d  reason: collision with root package name */
    public final StrictMode.ThreadPolicy f8828d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f8826b = str;
        this.f8827c = i10;
        this.f8828d = threadPolicy;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = f8824e.newThread(new n(24, this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", new Object[]{this.f8826b, Long.valueOf(this.f8825a.getAndIncrement())}));
        return newThread;
    }
}
