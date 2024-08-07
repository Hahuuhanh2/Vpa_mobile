package androidx.work;

import android.content.Context;
import androidx.work.d;
import z3.c;

public abstract class Worker extends d {

    /* renamed from: e  reason: collision with root package name */
    public c<d.a> f3730e;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f3731a;

        public a(c cVar) {
            this.f3731a = cVar;
        }

        public final void run() {
            try {
                Worker.this.getClass();
                throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for \n `getForegroundInfo()`");
            } catch (Throwable th2) {
                this.f3731a.j(th2);
            }
        }
    }

    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final v8.a<o3.d> a() {
        c cVar = new c();
        this.f3757b.f3735c.execute(new a(cVar));
        return cVar;
    }

    public final c c() {
        this.f3730e = new c<>();
        this.f3757b.f3735c.execute(new e(this));
        return this.f3730e;
    }

    public abstract d.a.c f();
}
