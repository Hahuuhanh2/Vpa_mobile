package da;

import da.g;
import java.util.concurrent.Callable;
import v.n;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f8843a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Callable f8844b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g.b f8845c;

    public /* synthetic */ e(f fVar, Callable callable, g.a aVar) {
        this.f8843a = fVar;
        this.f8844b = callable;
        this.f8845c = aVar;
    }

    public final Object call() {
        return this.f8843a.f8846a.submit(new n(25, this.f8844b, this.f8845c));
    }
}
