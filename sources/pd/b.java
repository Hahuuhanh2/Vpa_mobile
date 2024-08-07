package pd;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BarcodeValue */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f14145a = new HashMap();

    public final int[] a() {
        ArrayList arrayList = new ArrayList();
        int i10 = -1;
        for (Map.Entry entry : this.f14145a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > i10) {
                i10 = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (((Integer) entry.getValue()).intValue() == i10) {
                arrayList.add(entry.getKey());
            }
        }
        return m9.b.c0(arrayList);
    }

    public final void b(int i10) {
        Integer num = (Integer) this.f14145a.get(Integer.valueOf(i10));
        if (num == null) {
            num = 0;
        }
        this.f14145a.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() + 1));
    }
}
