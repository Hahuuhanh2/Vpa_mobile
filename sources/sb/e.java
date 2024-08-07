package sb;

import java.util.NoSuchElementException;

/* compiled from: Optional */
public final class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f14710a;

    public e() {
        this.f14710a = null;
    }

    public final T a() {
        T t10 = this.f14710a;
        if (t10 != null) {
            return t10;
        }
        throw new NoSuchElementException("No value present");
    }

    public final boolean b() {
        if (this.f14710a != null) {
            return true;
        }
        return false;
    }

    public e(T t10) {
        if (t10 != null) {
            this.f14710a = t10;
            return;
        }
        throw new NullPointerException("value for optional is empty.");
    }
}
