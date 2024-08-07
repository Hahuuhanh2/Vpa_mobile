package androidx.camera.core.impl;

import b0.e;
import java.util.Set;

/* compiled from: Config */
public interface i {

    /* compiled from: Config */
    public static abstract class a<T> {
        public static c a(Class cls, String str) {
            return new c(str, cls, (Object) null);
        }

        public abstract String b();

        public abstract Object c();

        public abstract Class<T> d();
    }

    /* compiled from: Config */
    public enum b {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    <ValueT> ValueT a(a<ValueT> aVar);

    boolean c(a<?> aVar);

    Set<a<?>> d();

    <ValueT> ValueT e(a<ValueT> aVar, ValueT valuet);

    void f(e eVar);

    <ValueT> ValueT n(a<ValueT> aVar, b bVar);

    b v(a<?> aVar);

    Set<b> w(a<?> aVar);
}
