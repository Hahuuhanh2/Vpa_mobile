package v3;

import a4.b;
import android.content.Context;
import android.os.Build;
import sk.j;
import t3.c;

/* compiled from: Trackers.kt */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final f<Boolean> f16031a;

    /* renamed from: b  reason: collision with root package name */
    public final c f16032b;

    /* renamed from: c  reason: collision with root package name */
    public final f<c> f16033c;

    /* renamed from: d  reason: collision with root package name */
    public final f<Boolean> f16034d;

    public l(Context context, b bVar) {
        f<c> fVar;
        Context applicationContext = context.getApplicationContext();
        j.e(applicationContext, "context.applicationContext");
        a aVar = new a(applicationContext, bVar);
        Context applicationContext2 = context.getApplicationContext();
        j.e(applicationContext2, "context.applicationContext");
        c cVar = new c(applicationContext2, bVar, 0);
        Context applicationContext3 = context.getApplicationContext();
        j.e(applicationContext3, "context.applicationContext");
        int i10 = i.f16028a;
        j.f(bVar, "taskExecutor");
        if (Build.VERSION.SDK_INT >= 24) {
            fVar = new h(applicationContext3, bVar);
        } else {
            fVar = new j(applicationContext3, bVar);
        }
        Context applicationContext4 = context.getApplicationContext();
        j.e(applicationContext4, "context.applicationContext");
        c cVar2 = new c(applicationContext4, bVar, 1);
        j.f(bVar, "taskExecutor");
        this.f16031a = aVar;
        this.f16032b = cVar;
        this.f16033c = fVar;
        this.f16034d = cVar2;
    }
}
