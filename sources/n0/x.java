package n0;

import al.g0;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ProcessingException;
import c0.p0;
import c0.x0;
import f0.r;
import g0.m;
import i0.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import n0.u;

/* compiled from: SurfaceProcessorNode */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final w f13419a;

    /* renamed from: b  reason: collision with root package name */
    public final r f13420b;

    /* renamed from: c  reason: collision with root package name */
    public c f13421c;

    /* compiled from: SurfaceProcessorNode */
    public class a implements i0.c<x0> {
        public a() {
        }

        public final void a(Throwable th2) {
            p0.h("SurfaceProcessorNode");
        }

        public final void onSuccess(Object obj) {
            x0 x0Var = (x0) obj;
            x0Var.getClass();
            try {
                x.this.f13419a.c(x0Var);
            } catch (ProcessingException unused) {
                p0.c("SurfaceProcessorNode");
            }
        }
    }

    /* compiled from: SurfaceProcessorNode */
    public static abstract class b {
        public abstract List<d> a();

        public abstract u b();
    }

    /* compiled from: SurfaceProcessorNode */
    public static class c extends HashMap<d, u> {
    }

    /* compiled from: SurfaceProcessorNode */
    public static abstract class d {
        public abstract Rect a();

        public abstract int b();

        public abstract boolean c();

        public abstract int d();

        public abstract Size e();

        public abstract int f();

        public abstract UUID g();
    }

    public x(r rVar, w wVar) {
        this.f13420b = rVar;
        this.f13419a = wVar;
    }

    public final void a(u uVar, Map.Entry<d, u> entry) {
        r rVar;
        u value = entry.getValue();
        Size d10 = uVar.f13395f.d();
        int b10 = entry.getKey().b();
        Rect a10 = entry.getKey().a();
        int d11 = entry.getKey().d();
        boolean c10 = entry.getKey().c();
        if (uVar.f13392c) {
            rVar = this.f13420b;
        } else {
            rVar = null;
        }
        r rVar2 = rVar;
        value.getClass();
        m.a();
        value.a();
        g0.E("Consumer can only be linked once.", !value.f13399j);
        value.f13399j = true;
        u.a aVar = value.f13401l;
        v8.a<Surface> c11 = aVar.c();
        t tVar = new t(value, aVar, b10, d10, a10, d11, c10, rVar2);
        h0.b f02 = j7.a.f0();
        i0.b bVar = new i0.b(tVar, c11);
        c11.b(bVar, f02);
        a aVar2 = new a();
        bVar.b(new f.b(bVar, aVar2), j7.a.f0());
    }

    public final void b() {
        this.f13419a.a();
        j7.a.f0().execute(new d.d(this, 15));
    }
}
