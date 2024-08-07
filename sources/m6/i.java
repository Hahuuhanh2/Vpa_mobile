package m6;

import h6.b;

/* compiled from: EventStoreModule_StoreConfigFactory */
public final class i implements b<e> {

    /* compiled from: EventStoreModule_StoreConfigFactory */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final i f13154a = new i();
    }

    public final Object get() {
        a aVar = e.f13150a;
        if (aVar != null) {
            return aVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
