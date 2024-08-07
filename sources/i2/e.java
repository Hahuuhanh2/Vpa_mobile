package i2;

import java.util.Map;
import sk.j;

/* compiled from: Preferences.kt */
public abstract class e {

    /* compiled from: Preferences.kt */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final String f11024a;

        public a(String str) {
            this.f11024a = str;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return j.a(this.f11024a, ((a) obj).f11024a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f11024a.hashCode();
        }

        public final String toString() {
            return this.f11024a;
        }
    }

    /* compiled from: Preferences.kt */
    public static final class b<T> {
    }

    public abstract Map<a<?>, Object> a();
}
