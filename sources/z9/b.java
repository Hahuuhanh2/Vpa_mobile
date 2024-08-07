package z9;

import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import java.util.concurrent.Executor;
import m9.d;
import r9.c;
import v9.h;
import v9.i;

/* compiled from: PlayIntegrityAppCheckProvider */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final IntegrityManager f17899a;

    /* renamed from: b  reason: collision with root package name */
    public final h f17900b;

    /* renamed from: c  reason: collision with root package name */
    public final i f17901c;

    public b(d dVar, @c Executor executor, @r9.b Executor executor2) {
        dVar.a();
        String str = dVar.f13220c.f13235e;
        dVar.a();
        IntegrityManager create = IntegrityManagerFactory.create(dVar.f13218a);
        h hVar = new h(dVar);
        i iVar = new i();
        this.f17899a = create;
        this.f17900b = hVar;
        this.f17901c = iVar;
    }
}
