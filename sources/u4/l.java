package u4;

/* compiled from: DiskCacheStrategy */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    public static final a f15172a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f15173b = new b();

    /* renamed from: c  reason: collision with root package name */
    public static final c f15174c = new c();

    /* renamed from: d  reason: collision with root package name */
    public static final e f15175d = new e();

    /* compiled from: DiskCacheStrategy */
    public class a extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(s4.a aVar) {
            if (aVar == s4.a.REMOTE) {
                return true;
            }
            return false;
        }

        public final boolean d(boolean z10, s4.a aVar, s4.c cVar) {
            if (aVar == s4.a.RESOURCE_DISK_CACHE || aVar == s4.a.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: DiskCacheStrategy */
    public class b extends l {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(s4.a aVar) {
            return false;
        }

        public final boolean d(boolean z10, s4.a aVar, s4.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy */
    public class c extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return false;
        }

        public final boolean c(s4.a aVar) {
            if (aVar == s4.a.DATA_DISK_CACHE || aVar == s4.a.MEMORY_CACHE) {
                return false;
            }
            return true;
        }

        public final boolean d(boolean z10, s4.a aVar, s4.c cVar) {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy */
    public class d extends l {
        public final boolean a() {
            return false;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(s4.a aVar) {
            return false;
        }

        public final boolean d(boolean z10, s4.a aVar, s4.c cVar) {
            if (aVar == s4.a.RESOURCE_DISK_CACHE || aVar == s4.a.MEMORY_CACHE) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: DiskCacheStrategy */
    public class e extends l {
        public final boolean a() {
            return true;
        }

        public final boolean b() {
            return true;
        }

        public final boolean c(s4.a aVar) {
            if (aVar == s4.a.REMOTE) {
                return true;
            }
            return false;
        }

        public final boolean d(boolean z10, s4.a aVar, s4.c cVar) {
            if (((!z10 || aVar != s4.a.DATA_DISK_CACHE) && aVar != s4.a.LOCAL) || cVar != s4.c.TRANSFORMED) {
                return false;
            }
            return true;
        }
    }

    static {
        new d();
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract boolean c(s4.a aVar);

    public abstract boolean d(boolean z10, s4.a aVar, s4.c cVar);
}
