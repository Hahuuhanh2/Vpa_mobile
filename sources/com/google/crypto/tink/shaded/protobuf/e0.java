package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.l;
import java.util.Map;

/* compiled from: SmallSortedMap */
public final class e0 extends f0<Object, Object> {
    public e0(int i10) {
        super(i10);
    }

    public final void h() {
        if (!this.f7367d) {
            for (int i10 = 0; i10 < e(); i10++) {
                ((l.a) d(i10).getKey()).d();
            }
            for (Map.Entry key : f()) {
                ((l.a) key.getKey()).d();
            }
        }
        super.h();
    }

    public final /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((Comparable) obj, obj2);
    }
}
