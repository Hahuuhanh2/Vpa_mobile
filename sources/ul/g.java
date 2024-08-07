package ul;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import ul.h;

/* compiled from: DefaultCallAdapterFactory */
public final class g implements c<Object, b<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f23107a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f23108b;

    public g(Type type, Executor executor) {
        this.f23107a = type;
        this.f23108b = executor;
    }

    public final Type a() {
        return this.f23107a;
    }

    public final Object b(q qVar) {
        Executor executor = this.f23108b;
        if (executor == null) {
            return qVar;
        }
        return new h.a(executor, qVar);
    }
}
