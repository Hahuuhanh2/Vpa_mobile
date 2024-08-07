package cl;

import sk.j;

/* compiled from: Channel.kt */
public final class i<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f19255b = new b();

    /* renamed from: a  reason: collision with root package name */
    public final Object f19256a;

    /* compiled from: Channel.kt */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f19257a;

        public a(Throwable th2) {
            this.f19257a = th2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a) || !j.a(this.f19257a, ((a) obj).f19257a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            Throwable th2 = this.f19257a;
            if (th2 != null) {
                return th2.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Closed(");
            q10.append(this.f19257a);
            q10.append(')');
            return q10.toString();
        }
    }

    /* compiled from: Channel.kt */
    public static class b {
        public String toString() {
            return "Failed";
        }
    }

    public /* synthetic */ i(Object obj) {
        this.f19256a = obj;
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f19256a;
        if ((obj instanceof i) && j.a(obj2, ((i) obj).f19256a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f19256a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f19256a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
