package h4;

import cd.b;
import cd.f;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import o4.a;
import o5.l;
import uc.d;
import v4.k;

/* compiled from: BaseAnimatableValue */
public abstract class i implements h {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10559a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f10560b;

    public /* synthetic */ i(Object obj, int i10) {
        this.f10559a = i10;
        this.f10560b = obj;
    }

    public final List b() {
        return (List) this.f10560b;
    }

    public final boolean c() {
        if (((List) this.f10560b).isEmpty() || (((List) this.f10560b).size() == 1 && ((a) ((List) this.f10560b).get(0)).c())) {
            return true;
        }
        return false;
    }

    public abstract k d();

    public abstract f e(d dVar);

    public final k f() {
        k kVar = (k) ((Queue) this.f10560b).poll();
        if (kVar == null) {
            return d();
        }
        return kVar;
    }

    public abstract b g();

    public abstract cd.a h(int i10, cd.a aVar);

    public final void i(k kVar) {
        if (((Queue) this.f10560b).size() < 20) {
            ((Queue) this.f10560b).offer(kVar);
        }
    }

    public final String toString() {
        switch (this.f10559a) {
            case 0:
                StringBuilder sb2 = new StringBuilder();
                if (!((List) this.f10560b).isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(((List) this.f10560b).toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public i() {
        this.f10559a = 1;
        char[] cArr = l.f13754a;
        this.f10560b = new ArrayDeque(20);
    }
}
