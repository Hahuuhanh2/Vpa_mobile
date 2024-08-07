package ek;

import java.io.Serializable;
import sk.j;

/* compiled from: Result.kt */
public final class f<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final Object f20104a;

    /* compiled from: Result.kt */
    public static final class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f20105a;

        public a(Throwable th2) {
            j.f(th2, "exception");
            this.f20105a = th2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a) || !j.a(this.f20105a, ((a) obj).f20105a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f20105a.hashCode();
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Failure(");
            q10.append(this.f20105a);
            q10.append(')');
            return q10.toString();
        }
    }

    public /* synthetic */ f(Object obj) {
        this.f20104a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f20105a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        Object obj2 = this.f20104a;
        if ((obj instanceof f) && j.a(obj2, ((f) obj).f20104a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f20104a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f20104a;
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
