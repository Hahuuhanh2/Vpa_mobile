package y4;

import java.util.ArrayDeque;
import o5.l;

/* compiled from: ModelCache */
public final class m<A, B> {

    /* renamed from: a  reason: collision with root package name */
    public final l f17480a = new l();

    /* compiled from: ModelCache */
    public static final class a<A> {

        /* renamed from: d  reason: collision with root package name */
        public static final ArrayDeque f17481d = new ArrayDeque(0);

        /* renamed from: a  reason: collision with root package name */
        public int f17482a;

        /* renamed from: b  reason: collision with root package name */
        public int f17483b;

        /* renamed from: c  reason: collision with root package name */
        public A f17484c;

        static {
            char[] cArr = l.f13754a;
        }

        public static a a(Object obj) {
            a aVar;
            ArrayDeque arrayDeque = f17481d;
            synchronized (arrayDeque) {
                aVar = (a) arrayDeque.poll();
            }
            if (aVar == null) {
                aVar = new a();
            }
            aVar.f17484c = obj;
            aVar.f17483b = 0;
            aVar.f17482a = 0;
            return aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f17483b == aVar.f17483b && this.f17482a == aVar.f17482a && this.f17484c.equals(aVar.f17484c)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return this.f17484c.hashCode() + (((this.f17482a * 31) + this.f17483b) * 31);
        }
    }
}
