package nl;

import java.io.Serializable;

/* compiled from: Clock */
public abstract class a {

    /* renamed from: nl.a$a  reason: collision with other inner class name */
    /* compiled from: Clock */
    public static final class C0293a extends a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final j f21741a;

        public C0293a(j jVar) {
            this.f21741a = jVar;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C0293a) {
                return this.f21741a.equals(((C0293a) obj).f21741a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f21741a.hashCode() + 1;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("SystemClock[");
            q10.append(this.f21741a);
            q10.append("]");
            return q10.toString();
        }
    }
}
