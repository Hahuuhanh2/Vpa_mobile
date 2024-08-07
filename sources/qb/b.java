package qb;

import android.app.ActivityManager;
import android.content.Context;
import lb.a;

/* compiled from: GaugeMetadataManager */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Runtime f14396a = Runtime.getRuntime();

    /* renamed from: b  reason: collision with root package name */
    public final ActivityManager f14397b;

    /* renamed from: c  reason: collision with root package name */
    public final ActivityManager.MemoryInfo f14398c;

    static {
        a.d();
    }

    public b(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f14397b = activityManager;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.f14398c = memoryInfo;
        activityManager.getMemoryInfo(memoryInfo);
    }
}
