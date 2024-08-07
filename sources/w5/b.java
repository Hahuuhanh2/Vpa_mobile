package w5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/* compiled from: CacheManager */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final PriorityQueue<y5.a> f16494a;

    /* renamed from: b  reason: collision with root package name */
    public final PriorityQueue<y5.a> f16495b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f16496c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f16497d = new Object();

    /* compiled from: CacheManager */
    public class a implements Comparator<y5.a> {
        public final int compare(Object obj, Object obj2) {
            int i10 = ((y5.a) obj).f17532f;
            int i11 = ((y5.a) obj2).f17532f;
            if (i10 == i11) {
                return 0;
            }
            if (i10 > i11) {
                return 1;
            }
            return -1;
        }
    }

    public b() {
        a aVar = new a();
        this.f16495b = new PriorityQueue<>(120, aVar);
        this.f16494a = new PriorityQueue<>(120, aVar);
        this.f16496c = new ArrayList();
    }

    public final void a() {
        synchronized (this.f16497d) {
            while (this.f16495b.size() + this.f16494a.size() >= 120 && !this.f16494a.isEmpty()) {
                this.f16494a.poll().f17529c.recycle();
            }
            while (this.f16495b.size() + this.f16494a.size() >= 120 && !this.f16495b.isEmpty()) {
                this.f16495b.poll().f17529c.recycle();
            }
        }
    }
}
