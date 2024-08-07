package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.l;
import java.util.Map;

/* compiled from: SmallSortedMap */
public final class h0 extends i0<Object, Object> {
    public h0(int i10) {
        super(i10);
    }

    public final void h() {
        if (!this.f2280d) {
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
        return put((l.a) obj, obj2);
    }
}
