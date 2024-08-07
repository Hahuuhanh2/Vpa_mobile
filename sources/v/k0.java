package v;

import al.g0;
import android.support.v4.media.a;
import f0.q0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: Camera2RequestProcessor */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    public final List<q0> f15722a;

    public k0(y0 y0Var, ArrayList arrayList) {
        boolean z10;
        if (y0Var.f15951l == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder q10 = a.q("CaptureSession state must be OPENED. Current state:");
        q10.append(v.i(y0Var.f15951l));
        g0.y(q10.toString(), z10);
        this.f15722a = Collections.unmodifiableList(new ArrayList(arrayList));
    }
}
