package ja;

/* compiled from: LogFileManager */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    public static final a f11801c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final na.c f11802a;

    /* renamed from: b  reason: collision with root package name */
    public a f11803b;

    /* compiled from: LogFileManager */
    public static final class a implements a {
        public final void a() {
        }

        public final String b() {
            return null;
        }

        public final void c(long j10, String str) {
        }
    }

    public c(na.c cVar) {
        this.f11802a = cVar;
        this.f11803b = f11801c;
    }

    public final void a(String str) {
        this.f11803b.a();
        this.f11803b = f11801c;
        if (str != null) {
            this.f11803b = new f(this.f11802a.b(str, "userlog"));
        }
    }

    public c(na.c cVar, String str) {
        this(cVar);
        a(str);
    }
}
