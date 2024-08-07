package ze;

import sk.j;

/* compiled from: State.kt */
public abstract class f<T> {

    /* compiled from: State.kt */
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f18004a;

        public a(Throwable th2) {
            this.f18004a = th2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && j.a(this.f18004a, ((a) obj).f18004a);
        }

        public final int hashCode() {
            return this.f18004a.hashCode();
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Error(throwable=");
            q10.append(this.f18004a);
            q10.append(')');
            return q10.toString();
        }
    }

    /* compiled from: State.kt */
    public static final class b extends f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f18005a = new b();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return true;
        }

        public final int hashCode() {
            return -699811950;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: State.kt */
    public static final class c<T> extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f18006a;

        public c(T t10) {
            j.f(t10, "data");
            this.f18006a = t10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && j.a(this.f18006a, ((c) obj).f18006a);
        }

        public final int hashCode() {
            return this.f18006a.hashCode();
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Success(data=");
            q10.append(this.f18006a);
            q10.append(')');
            return q10.toString();
        }
    }
}
