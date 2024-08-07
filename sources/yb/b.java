package yb;

import n0.l;
import sk.j;

/* compiled from: SessionSubscriber.kt */
public interface b {

    /* compiled from: SessionSubscriber.kt */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE
    }

    /* renamed from: yb.b$b  reason: collision with other inner class name */
    /* compiled from: SessionSubscriber.kt */
    public static final class C0236b {

        /* renamed from: a  reason: collision with root package name */
        public final String f17644a;

        public C0236b(String str) {
            j.f(str, "sessionId");
            this.f17644a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0236b) && j.a(this.f17644a, ((C0236b) obj).f17644a);
        }

        public final int hashCode() {
            return this.f17644a.hashCode();
        }

        public final String toString() {
            return l.k(android.support.v4.media.a.q("SessionDetails(sessionId="), this.f17644a, ')');
        }
    }

    boolean a();

    a b();

    void c(C0236b bVar);
}
