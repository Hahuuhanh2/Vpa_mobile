package m6;

import android.content.Context;
import dk.a;
import h6.b;

/* compiled from: EventStoreModule_PackageNameFactory */
public final class g implements b<String> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f13152a;

    public g(a<Context> aVar) {
        this.f13152a = aVar;
    }

    public final Object get() {
        String packageName = this.f13152a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
