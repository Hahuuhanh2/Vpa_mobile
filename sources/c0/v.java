package c0;

import android.os.Handler;
import androidx.camera.core.impl.c;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.y;
import b0.e;
import f0.b0;
import f0.o;
import f0.p;
import j0.h;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: CameraXConfig */
public final class v implements h<u> {
    public static final c F = i.a.a(p.a.class, "camerax.core.appConfig.cameraFactoryProvider");
    public static final c G = i.a.a(o.a.class, "camerax.core.appConfig.deviceSurfaceManagerProvider");
    public static final c H = i.a.a(y.c.class, "camerax.core.appConfig.useCaseConfigFactoryProvider");
    public static final c I = i.a.a(Executor.class, "camerax.core.appConfig.cameraExecutor");
    public static final c J = i.a.a(Handler.class, "camerax.core.appConfig.schedulerHandler");
    public static final c K = i.a.a(Integer.TYPE, "camerax.core.appConfig.minimumLoggingLevel");
    public static final c L = i.a.a(p.class, "camerax.core.appConfig.availableCamerasLimiter");
    public final r E;

    /* compiled from: CameraXConfig */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final q f4359a;

        public a() {
            Object obj;
            q L = q.L();
            Class<u> cls = u.class;
            this.f4359a = L;
            Object obj2 = null;
            try {
                obj = L.a(h.B);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls2 = (Class) obj;
            if (cls2 == null || cls2.equals(cls)) {
                this.f4359a.O(h.B, cls);
                q qVar = this.f4359a;
                c cVar = h.A;
                qVar.getClass();
                try {
                    obj2 = qVar.a(cVar);
                } catch (IllegalArgumentException unused2) {
                }
                if (obj2 == null) {
                    this.f4359a.O(h.A, cls.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
        }
    }

    /* compiled from: CameraXConfig */
    public interface b {
        v getCameraXConfig();
    }

    public v(r rVar) {
        this.E = rVar;
    }

    public final /* synthetic */ String D() {
        throw null;
    }

    public final p K() {
        Object obj;
        r rVar = this.E;
        c cVar = L;
        rVar.getClass();
        try {
            obj = rVar.a(cVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (p) obj;
    }

    public final p.a L() {
        Object obj;
        r rVar = this.E;
        c cVar = F;
        rVar.getClass();
        try {
            obj = rVar.a(cVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (p.a) obj;
    }

    public final o.a M() {
        Object obj;
        r rVar = this.E;
        c cVar = G;
        rVar.getClass();
        try {
            obj = rVar.a(cVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (o.a) obj;
    }

    public final y.c N() {
        Object obj;
        r rVar = this.E;
        c cVar = H;
        rVar.getClass();
        try {
            obj = rVar.a(cVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        return (y.c) obj;
    }

    public final Object a(i.a aVar) {
        return ((r) b()).a(aVar);
    }

    public final i b() {
        return this.E;
    }

    public final boolean c(i.a aVar) {
        return ((r) b()).c(aVar);
    }

    public final Set d() {
        return ((r) b()).d();
    }

    public final Object e(i.a aVar, Object obj) {
        return ((r) b()).e(aVar, obj);
    }

    public final /* synthetic */ void f(e eVar) {
        b0.b(this, eVar);
    }

    public final Object n(i.a aVar, i.b bVar) {
        return ((r) b()).n(aVar, bVar);
    }

    public final /* synthetic */ String t(String str) {
        throw null;
    }

    public final i.b v(i.a aVar) {
        return ((r) b()).v(aVar);
    }

    public final Set w(i.a aVar) {
        return ((r) b()).w(aVar);
    }
}
