package j$.util;

import java.util.NoSuchElementException;

public final class Optional<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final Optional f18348b = new Optional();

    /* renamed from: a  reason: collision with root package name */
    private final Object f18349a;

    private Optional() {
        this.f18349a = null;
    }

    private Optional(Object obj) {
        obj.getClass();
        this.f18349a = obj;
    }

    public static Optional a() {
        return f18348b;
    }

    public static Optional d(Object obj) {
        return new Optional(obj);
    }

    public static <T> Optional<T> ofNullable(T t10) {
        return t10 == null ? f18348b : new Optional<>(t10);
    }

    public final Object b() {
        Object obj = this.f18349a;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean c() {
        return this.f18349a != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Optional)) {
            return false;
        }
        return C0407m.p(this.f18349a, ((Optional) obj).f18349a);
    }

    public final int hashCode() {
        Object obj = this.f18349a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f18349a;
        if (obj == null) {
            return "Optional.empty";
        }
        return String.format("Optional[%s]", new Object[]{obj});
    }
}
