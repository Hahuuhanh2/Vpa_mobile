package y6;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static k f17565b;

    /* renamed from: c  reason: collision with root package name */
    public static final RootTelemetryConfiguration f17566c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    public RootTelemetryConfiguration f17567a;

    public static synchronized k a() {
        k kVar;
        synchronized (k.class) {
            if (f17565b == null) {
                f17565b = new k();
            }
            kVar = f17565b;
        }
        return kVar;
    }
}
