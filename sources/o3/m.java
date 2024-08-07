package o3;

/* compiled from: Operation */
public interface m {

    /* renamed from: a  reason: collision with root package name */
    public static final a.c f13686a = new a.c();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b f13687b = new a.b();

    /* compiled from: Operation */
    public static abstract class a {

        /* renamed from: o3.m$a$a  reason: collision with other inner class name */
        /* compiled from: Operation */
        public static final class C0169a extends a {

            /* renamed from: a  reason: collision with root package name */
            public final Throwable f13688a;

            public C0169a(Throwable th2) {
                this.f13688a = th2;
            }

            public final String toString() {
                StringBuilder q10 = android.support.v4.media.a.q("FAILURE (");
                q10.append(this.f13688a.getMessage());
                q10.append(")");
                return q10.toString();
            }
        }

        /* compiled from: Operation */
        public static final class b extends a {
            public final String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation */
        public static final class c extends a {
            public final String toString() {
                return "SUCCESS";
            }
        }
    }
}
