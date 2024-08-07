package y3;

import androidx.work.WorkerParameters;
import p3.r;
import p3.w;
import sk.j;

/* compiled from: StartWorkRunnable.kt */
public final class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final r f17411a;

    /* renamed from: b  reason: collision with root package name */
    public final w f17412b;

    /* renamed from: c  reason: collision with root package name */
    public final WorkerParameters.a f17413c;

    public q(r rVar, w wVar, WorkerParameters.a aVar) {
        j.f(rVar, "processor");
        this.f17411a = rVar;
        this.f17412b = wVar;
        this.f17413c = aVar;
    }

    public final void run() {
        this.f17411a.f(this.f17412b, this.f17413c);
    }
}
