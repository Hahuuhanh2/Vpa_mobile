package bc;

import hc.a;
import hc.b;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLongArray;

/* compiled from: Gson */
public final class g extends u<AtomicLongArray> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u f4143a;

    public g(u uVar) {
        this.f4143a = uVar;
    }

    public final Object a(a aVar) {
        ArrayList arrayList = new ArrayList();
        aVar.d();
        while (aVar.K()) {
            arrayList.add(Long.valueOf(((Number) this.f4143a.a(aVar)).longValue()));
        }
        aVar.s();
        int size = arrayList.size();
        AtomicLongArray atomicLongArray = new AtomicLongArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
        }
        return atomicLongArray;
    }

    public final void b(b bVar, Object obj) {
        AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
        bVar.h();
        int length = atomicLongArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            this.f4143a.b(bVar, Long.valueOf(atomicLongArray.get(i10)));
        }
        bVar.s();
    }
}
