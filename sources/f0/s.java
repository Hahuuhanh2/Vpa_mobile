package f0;

import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import c0.p0;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* compiled from: CameraRepository */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9582a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f9583b = new LinkedHashMap();

    public s() {
        new HashSet();
    }

    public final LinkedHashSet<r> a() {
        LinkedHashSet<r> linkedHashSet;
        synchronized (this.f9582a) {
            linkedHashSet = new LinkedHashSet<>(this.f9583b.values());
        }
        return linkedHashSet;
    }

    public final void b(p pVar) {
        synchronized (this.f9582a) {
            try {
                for (String str : pVar.a()) {
                    p0.a("CameraRepository");
                    this.f9583b.put(str, pVar.c(str));
                }
            } catch (CameraUnavailableException e10) {
                throw new InitializationException(e10);
            }
        }
    }
}
