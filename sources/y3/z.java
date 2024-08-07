package y3;

import java.util.HashMap;
import java.util.Objects;
import o3.j;
import o3.n;
import p3.c;
import x3.l;

/* compiled from: WorkTimer */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public final n f17438a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f17439b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f17440c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Object f17441d = new Object();

    /* compiled from: WorkTimer */
    public interface a {
        void a(l lVar);
    }

    /* compiled from: WorkTimer */
    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final z f17442a;

        /* renamed from: b  reason: collision with root package name */
        public final l f17443b;

        public b(z zVar, l lVar) {
            this.f17442a = zVar;
            this.f17443b = lVar;
        }

        public final void run() {
            synchronized (this.f17442a.f17441d) {
                if (((b) this.f17442a.f17439b.remove(this.f17443b)) != null) {
                    a aVar = (a) this.f17442a.f17440c.remove(this.f17443b);
                    if (aVar != null) {
                        aVar.a(this.f17443b);
                    }
                } else {
                    j a10 = j.a();
                    String.format("Timer with %s is already marked as complete.", new Object[]{this.f17443b});
                    a10.getClass();
                }
            }
        }
    }

    static {
        j.b("WorkTimer");
    }

    public z(c cVar) {
        this.f17438a = cVar;
    }

    public final void a(l lVar) {
        synchronized (this.f17441d) {
            if (((b) this.f17439b.remove(lVar)) != null) {
                j a10 = j.a();
                Objects.toString(lVar);
                a10.getClass();
                this.f17440c.remove(lVar);
            }
        }
    }
}
