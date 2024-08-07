package r5;

import n0.l;
import sk.j;

/* compiled from: PermissionStatus.kt */
public abstract class a {

    /* renamed from: r5.a$a  reason: collision with other inner class name */
    /* compiled from: PermissionStatus.kt */
    public static abstract class C0187a extends a {

        /* renamed from: r5.a$a$a  reason: collision with other inner class name */
        /* compiled from: PermissionStatus.kt */
        public static final class C0188a extends C0187a {

            /* renamed from: a  reason: collision with root package name */
            public final String f14512a;

            public C0188a(String str) {
                j.f(str, "permission");
                this.f14512a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof C0188a) && j.a(this.f14512a, ((C0188a) obj).f14512a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f14512a.hashCode();
            }

            public final String toString() {
                return l.k(android.support.v4.media.a.q("Permanently(permission="), this.f14512a, ')');
            }
        }

        /* renamed from: r5.a$a$b */
        /* compiled from: PermissionStatus.kt */
        public static final class b extends C0187a {

            /* renamed from: a  reason: collision with root package name */
            public final String f14513a;

            public b(String str) {
                j.f(str, "permission");
                this.f14513a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof b) && j.a(this.f14513a, ((b) obj).f14513a)) {
                    return true;
                }
                return false;
            }

            public final int hashCode() {
                return this.f14513a.hashCode();
            }

            public final String toString() {
                return l.k(android.support.v4.media.a.q("ShouldShowRationale(permission="), this.f14513a, ')');
            }
        }
    }

    /* compiled from: PermissionStatus.kt */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final String f14514a;

        public b(String str) {
            j.f(str, "permission");
            this.f14514a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof b) && j.a(this.f14514a, ((b) obj).f14514a)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f14514a.hashCode();
        }

        public final String toString() {
            return l.k(android.support.v4.media.a.q("Granted(permission="), this.f14514a, ')');
        }
    }
}
