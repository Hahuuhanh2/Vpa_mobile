package lf;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: HandlerAction.kt */
public interface g {

    /* renamed from: l  reason: collision with root package name */
    public static final a f12998l = a.f12999a;

    /* compiled from: HandlerAction.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f12999a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final Handler f13000b = new Handler(Looper.getMainLooper());
    }

    /* compiled from: HandlerAction.kt */
    public static final class b {
        public static boolean a(g gVar, Runnable runnable, long j10) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (j10 < 0) {
                j10 = 0;
            }
            return gVar.p(runnable, uptimeMillis + j10);
        }
    }

    boolean p(Runnable runnable, long j10);
}
