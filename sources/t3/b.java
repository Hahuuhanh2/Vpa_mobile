package t3;

/* compiled from: WorkConstraintsTracker.kt */
public abstract class b {

    /* compiled from: WorkConstraintsTracker.kt */
    public static final class a extends b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f14803a = new a();
    }

    /* renamed from: t3.b$b  reason: collision with other inner class name */
    /* compiled from: WorkConstraintsTracker.kt */
    public static final class C0193b extends b {

        /* renamed from: a  reason: collision with root package name */
        public final int f14804a;

        public C0193b(int i10) {
            this.f14804a = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0193b) && this.f14804a == ((C0193b) obj).f14804a;
        }

        public final int hashCode() {
            return this.f14804a;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("ConstraintsNotMet(reason=");
            q10.append(this.f14804a);
            q10.append(')');
            return q10.toString();
        }
    }
}
