package p3;

import android.os.Handler;
import android.os.Looper;
import o3.n;
import s1.i;

/* compiled from: DefaultRunnableScheduler */
public final class c implements n {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f13921a = i.a(Looper.getMainLooper());

    public final void a(Runnable runnable, long j10) {
        this.f13921a.postDelayed(runnable, j10);
    }

    public final void b(Runnable runnable) {
        this.f13921a.removeCallbacks(runnable);
    }
}
