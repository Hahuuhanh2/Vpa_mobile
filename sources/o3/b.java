package o3;

import android.support.v4.media.a;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import sk.j;

/* compiled from: Configuration.kt */
public final class b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f13663a = new AtomicInteger(0);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f13664b;

    public b(boolean z10) {
        this.f13664b = z10;
    }

    public final Thread newThread(Runnable runnable) {
        String str;
        j.f(runnable, "runnable");
        if (this.f13664b) {
            str = "WM.task-";
        } else {
            str = "androidx.work-";
        }
        StringBuilder q10 = a.q(str);
        q10.append(this.f13663a.incrementAndGet());
        return new Thread(runnable, q10.toString());
    }
}
