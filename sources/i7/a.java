package i7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import t6.i;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final String f11188a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f11189b = Executors.defaultThreadFactory();

    public a(String str) {
        this.f11188a = str;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f11189b.newThread(new i(runnable));
        newThread.setName(this.f11188a);
        return newThread;
    }
}
