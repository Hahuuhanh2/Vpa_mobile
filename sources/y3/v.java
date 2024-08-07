package y3;

import a4.b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import androidx.appcompat.app.p;
import androidx.work.d;
import java.util.UUID;
import o3.e;
import o3.j;
import x3.s;
import z3.a;
import z3.c;

/* compiled from: WorkForegroundRunnable */
public final class v implements Runnable {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f17421n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final c<Void> f17422a = new c<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f17423b;

    /* renamed from: c  reason: collision with root package name */
    public final s f17424c;

    /* renamed from: d  reason: collision with root package name */
    public final d f17425d;

    /* renamed from: e  reason: collision with root package name */
    public final e f17426e;

    /* renamed from: f  reason: collision with root package name */
    public final b f17427f;

    /* compiled from: WorkForegroundRunnable */
    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f17428a;

        public a(c cVar) {
            this.f17428a = cVar;
        }

        public final void run() {
            if (!(v.this.f17422a.f17841a instanceof a.b)) {
                try {
                    o3.d dVar = (o3.d) this.f17428a.get();
                    if (dVar != null) {
                        j a10 = j.a();
                        int i10 = v.f17421n;
                        String str = v.this.f17424c.f17021c;
                        a10.getClass();
                        v vVar = v.this;
                        c<Void> cVar = vVar.f17422a;
                        e eVar = vVar.f17426e;
                        Context context = vVar.f17423b;
                        UUID uuid = vVar.f17425d.f3757b.f3733a;
                        x xVar = (x) eVar;
                        xVar.getClass();
                        c cVar2 = new c();
                        xVar.f17435a.d(new w(xVar, cVar2, uuid, dVar, context));
                        cVar.k(cVar2);
                        return;
                    }
                    throw new IllegalStateException("Worker was marked important (" + v.this.f17424c.f17021c + ") but did not provide ForegroundInfo");
                } catch (Throwable th2) {
                    v.this.f17422a.j(th2);
                }
            }
        }
    }

    static {
        j.b("WorkForegroundRunnable");
    }

    @SuppressLint({"LambdaLast"})
    public v(Context context, s sVar, d dVar, e eVar, b bVar) {
        this.f17423b = context;
        this.f17424c = sVar;
        this.f17425d = dVar;
        this.f17426e = eVar;
        this.f17427f = bVar;
    }

    @SuppressLint({"UnsafeExperimentalUsageError"})
    public final void run() {
        if (!this.f17424c.f17035q || Build.VERSION.SDK_INT >= 31) {
            this.f17422a.i(null);
            return;
        }
        c cVar = new c();
        this.f17427f.b().execute(new p(24, this, cVar));
        cVar.b(new a(cVar), this.f17427f.b());
    }
}
