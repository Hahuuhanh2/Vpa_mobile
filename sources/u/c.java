package u;

import f0.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* compiled from: CameraEventCallbacks */
public final class c extends h0<b> {
    public c(b... bVarArr) {
        this.f9547a.addAll(Arrays.asList(bVarArr));
    }

    /* renamed from: a */
    public final c clone() {
        c cVar = new c(new b[0]);
        cVar.f9547a.addAll(Collections.unmodifiableList(new ArrayList(this.f9547a)));
        return cVar;
    }
}
