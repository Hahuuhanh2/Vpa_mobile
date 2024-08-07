package p0;

import androidx.camera.core.impl.c;
import androidx.camera.core.impl.p;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.x;
import j0.h;
import java.util.UUID;

/* compiled from: StreamSharingBuilder */
public final class b implements x.a<a, c, b> {

    /* renamed from: a  reason: collision with root package name */
    public final q f13889a;

    public b(q qVar) {
        Object obj;
        Class<a> cls = a.class;
        this.f13889a = qVar;
        Object obj2 = null;
        try {
            obj = qVar.a(h.B);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        Class cls2 = (Class) obj;
        if (cls2 == null || cls2.equals(cls)) {
            this.f13889a.O(h.B, cls);
            q qVar2 = this.f13889a;
            c cVar = h.A;
            qVar2.getClass();
            try {
                obj2 = qVar2.a(cVar);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.f13889a.O(h.A, cls.getCanonicalName() + "-" + UUID.randomUUID());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
    }

    public final p a() {
        return this.f13889a;
    }

    public final x b() {
        return new c(r.K(this.f13889a));
    }
}
