package v3;

import a4.b;
import android.content.Context;
import ek.i;
import fk.p;
import java.util.LinkedHashSet;
import sk.j;
import t3.a;

/* compiled from: ConstraintTracker.kt */
public abstract class f<T> {

    /* renamed from: a  reason: collision with root package name */
    public final b f16019a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f16020b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f16021c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashSet<a<T>> f16022d = new LinkedHashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public T f16023e;

    public f(Context context, b bVar) {
        j.f(bVar, "taskExecutor");
        this.f16019a = bVar;
        Context applicationContext = context.getApplicationContext();
        j.e(applicationContext, "context.applicationContext");
        this.f16020b = applicationContext;
    }

    public abstract T a();

    public final void b(T t10) {
        synchronized (this.f16021c) {
            T t11 = this.f16023e;
            if (t11 == null || !j.a(t11, t10)) {
                this.f16023e = t10;
                this.f16019a.b().execute(new v.f(20, p.Z0(this.f16022d), this));
                i iVar = i.f20112a;
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
