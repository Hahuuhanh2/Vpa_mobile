package xa;

import android.content.Context;
import com.airbnb.lottie.k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;
import s1.o;
import ub.g;
import v9.j;

/* compiled from: DefaultHeartBeatController */
public final class b implements d, e {

    /* renamed from: a  reason: collision with root package name */
    public final za.b<f> f17166a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f17167b;

    /* renamed from: c  reason: collision with root package name */
    public final za.b<g> f17168c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<c> f17169d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f17170e;

    public b() {
        throw null;
    }

    public b(Context context, String str, Set<c> set, za.b<g> bVar, Executor executor) {
        this.f17166a = new j(1, context, str);
        this.f17169d = set;
        this.f17170e = executor;
        this.f17168c = bVar;
        this.f17167b = context;
    }

    public final Task<String> a() {
        if (!o.a(this.f17167b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f17170e, new k(this, 1));
    }

    public final synchronized int b() {
        boolean g2;
        long currentTimeMillis = System.currentTimeMillis();
        f fVar = this.f17166a.get();
        synchronized (fVar) {
            g2 = fVar.g(currentTimeMillis);
        }
        if (!g2) {
            return 1;
        }
        synchronized (fVar) {
            String d10 = fVar.d(System.currentTimeMillis());
            fVar.f17171a.edit().putString("last-used-date", d10).commit();
            fVar.f(d10);
        }
        return 3;
    }

    public final void c() {
        if (this.f17169d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!o.a(this.f17167b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f17170e, new y3.g(this, 1));
        }
    }
}
