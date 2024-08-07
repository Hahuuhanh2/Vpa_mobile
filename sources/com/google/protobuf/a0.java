package com.google.protobuf;

import com.google.protobuf.h;
import java.util.Map;

/* compiled from: SmallSortedMap */
public final class a0 extends b0<Object, Object> {
    public a0(int i10) {
        super(i10);
    }

    public final void h() {
        if (!this.f7874d) {
            for (int i10 = 0; i10 < e(); i10++) {
                ((h.a) d(i10).getKey()).d();
            }
            for (Map.Entry key : f()) {
                ((h.a) key.getKey()).d();
            }
        }
        super.h();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
