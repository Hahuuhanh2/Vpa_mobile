package ia;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;
import pa.e;
import pa.g;

/* compiled from: CrashlyticsCore */
public final class z implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f11394a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b0 f11395b;

    public z(b0 b0Var, e eVar) {
        this.f11395b = b0Var;
        this.f11394a = eVar;
    }

    public final Object call() {
        return b0.a(this.f11395b, this.f11394a);
    }
}
