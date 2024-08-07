package k6;

import android.content.Context;
import dk.a;
import h6.b;
import l6.n;
import m6.d;
import o6.c;

/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class e implements b<n> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f12045a;

    /* renamed from: b  reason: collision with root package name */
    public final a<d> f12046b;

    /* renamed from: c  reason: collision with root package name */
    public final a<l6.e> f12047c;

    /* renamed from: d  reason: collision with root package name */
    public final a<o6.a> f12048d;

    public e(a aVar, a aVar2, d dVar) {
        c cVar = c.a.f13759a;
        this.f12045a = aVar;
        this.f12046b = aVar2;
        this.f12047c = dVar;
        this.f12048d = cVar;
    }

    public final Object get() {
        o6.a aVar = this.f12048d.get();
        return new l6.d(this.f12045a.get(), this.f12046b.get(), this.f12047c.get());
    }
}
