package v;

import f0.f;
import f0.g;
import java.util.ArrayList;

/* compiled from: CaptureCallbackConverter */
public final class w0 {
    public static void a(f fVar, ArrayList arrayList) {
        if (fVar instanceof g) {
            ((g) fVar).getClass();
            throw null;
        } else if (fVar instanceof v0) {
            arrayList.add(((v0) fVar).f15901a);
        } else {
            arrayList.add(new u0(fVar));
        }
    }
}
