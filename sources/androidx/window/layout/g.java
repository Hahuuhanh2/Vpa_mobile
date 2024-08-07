package androidx.window.layout;

/* compiled from: FoldingFeature.kt */
public interface g extends c {

    /* compiled from: FoldingFeature.kt */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f3676b = new a("VERTICAL");

        /* renamed from: c  reason: collision with root package name */
        public static final a f3677c = new a("HORIZONTAL");

        /* renamed from: a  reason: collision with root package name */
        public final String f3678a;

        public a(String str) {
            this.f3678a = str;
        }

        public final String toString() {
            return this.f3678a;
        }
    }

    /* compiled from: FoldingFeature.kt */
    public static final class b {

        /* renamed from: b  reason: collision with root package name */
        public static final b f3679b = new b("FLAT");

        /* renamed from: c  reason: collision with root package name */
        public static final b f3680c = new b("HALF_OPENED");

        /* renamed from: a  reason: collision with root package name */
        public final String f3681a;

        public b(String str) {
            this.f3681a = str;
        }

        public final String toString() {
            return this.f3681a;
        }
    }

    boolean a();

    a b();
}
