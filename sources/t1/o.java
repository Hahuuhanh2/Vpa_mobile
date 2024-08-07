package t1;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: RequestExecutor */
public final class o<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Callable<T> f14794a;

    /* renamed from: b  reason: collision with root package name */
    public v1.a<T> f14795b;

    /* renamed from: c  reason: collision with root package name */
    public Handler f14796c;

    /* compiled from: RequestExecutor */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v1.a f14797a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Object f14798b;

        public a(v1.a aVar, Object obj) {
            this.f14797a = aVar;
            this.f14798b = obj;
        }

        public final void run() {
            this.f14797a.accept(this.f14798b);
        }
    }

    public o(Handler handler, i iVar, j jVar) {
        this.f14794a = iVar;
        this.f14795b = jVar;
        this.f14796c = handler;
    }

    public final void run() {
        T t10;
        try {
            t10 = this.f14794a.call();
        } catch (Exception unused) {
            t10 = null;
        }
        this.f14796c.post(new a(this.f14795b, t10));
    }
}
