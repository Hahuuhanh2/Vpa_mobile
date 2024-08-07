package f0;

import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;

/* compiled from: TagBundle */
public class u0 {

    /* renamed from: b  reason: collision with root package name */
    public static final u0 f9604b = new u0(new ArrayMap());

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Object> f9605a;

    public u0(ArrayMap arrayMap) {
        this.f9605a = arrayMap;
    }

    public final Object a(String str) {
        return this.f9605a.get(str);
    }

    public final Set<String> b() {
        return this.f9605a.keySet();
    }

    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}
