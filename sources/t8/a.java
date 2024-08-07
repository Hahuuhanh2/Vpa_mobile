package t8;

import java.io.Serializable;

/* compiled from: Equivalence */
public abstract class a<T> {

    /* renamed from: t8.a$a  reason: collision with other inner class name */
    /* compiled from: Equivalence */
    public static final class C0195a extends a<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final C0195a f14904a = new C0195a();

        public final boolean a(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        public final int b(Object obj) {
            return obj.hashCode();
        }
    }

    /* compiled from: Equivalence */
    public static final class b extends a<Object> implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public static final b f14905a = new b();

        public final boolean a(Object obj, Object obj2) {
            return false;
        }

        public final int b(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public abstract boolean a(T t10, T t11);

    public abstract int b(T t10);

    public final boolean c(T t10, T t11) {
        if (t10 == t11) {
            return true;
        }
        if (t10 == null || t11 == null) {
            return false;
        }
        return a(t10, t11);
    }
}
