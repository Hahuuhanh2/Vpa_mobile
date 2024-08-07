package p3;

import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.Executor;
import v.s;
import x3.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class u implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f14023a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f14024b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f14025c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ WorkDatabase f14026d;

    public /* synthetic */ u(a4.a aVar, List list, a aVar2, WorkDatabase workDatabase) {
        this.f14023a = aVar;
        this.f14024b = list;
        this.f14025c = aVar2;
        this.f14026d = workDatabase;
    }

    public final void c(l lVar, boolean z10) {
        this.f14023a.execute(new s(this.f14024b, lVar, this.f14025c, this.f14026d, 2));
    }
}
