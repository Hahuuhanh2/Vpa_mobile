package k6;

import c6.h;
import f6.j;
import f6.w;
import g6.e;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import l6.n;
import m6.d;
import v.s;

/* compiled from: DefaultScheduler */
public final class a implements c {

    /* renamed from: f  reason: collision with root package name */
    public static final Logger f12033f = Logger.getLogger(w.class.getName());

    /* renamed from: a  reason: collision with root package name */
    public final n f12034a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f12035b;

    /* renamed from: c  reason: collision with root package name */
    public final e f12036c;

    /* renamed from: d  reason: collision with root package name */
    public final d f12037d;

    /* renamed from: e  reason: collision with root package name */
    public final n6.a f12038e;

    public a(Executor executor, e eVar, n nVar, d dVar, n6.a aVar) {
        this.f12035b = executor;
        this.f12036c = eVar;
        this.f12034a = nVar;
        this.f12037d = dVar;
        this.f12038e = aVar;
    }

    public final void a(h hVar, f6.h hVar2, j jVar) {
        this.f12035b.execute(new s(this, jVar, hVar, hVar2, 3));
    }
}
