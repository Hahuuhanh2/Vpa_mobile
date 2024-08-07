package c0;

import al.g0;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.v;
import f0.r;
import i0.f;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import n0.q;
import v.f0;
import v.n;
import z0.b;

/* compiled from: SurfaceRequest */
public final class d1 {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f4212m = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Object f4213a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final Size f4214b;

    /* renamed from: c  reason: collision with root package name */
    public final r f4215c;

    /* renamed from: d  reason: collision with root package name */
    public final b.d f4216d;

    /* renamed from: e  reason: collision with root package name */
    public final b.a<Surface> f4217e;

    /* renamed from: f  reason: collision with root package name */
    public final b.d f4218f;

    /* renamed from: g  reason: collision with root package name */
    public final b.a<Void> f4219g;

    /* renamed from: h  reason: collision with root package name */
    public final b.a<Void> f4220h;

    /* renamed from: i  reason: collision with root package name */
    public final b1 f4221i;

    /* renamed from: j  reason: collision with root package name */
    public d f4222j;

    /* renamed from: k  reason: collision with root package name */
    public e f4223k;

    /* renamed from: l  reason: collision with root package name */
    public Executor f4224l;

    /* compiled from: SurfaceRequest */
    public class a implements i0.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ v1.a f4225a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Surface f4226b;

        public a(v1.a aVar, Surface surface) {
            this.f4225a = aVar;
            this.f4226b = surface;
        }

        public final void a(Throwable th2) {
            g0.E("Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th2, th2 instanceof b);
            this.f4225a.accept(new h(1, this.f4226b));
        }

        public final void onSuccess(Object obj) {
            Void voidR = (Void) obj;
            this.f4225a.accept(new h(0, this.f4226b));
        }
    }

    /* compiled from: SurfaceRequest */
    public static final class b extends RuntimeException {
        public b(String str, Throwable th2) {
            super(str, th2);
        }
    }

    /* compiled from: SurfaceRequest */
    public static abstract class c {
        public abstract int a();

        public abstract Surface b();
    }

    /* compiled from: SurfaceRequest */
    public static abstract class d {
        public abstract Rect a();

        public abstract boolean b();

        public abstract int c();

        public abstract Matrix d();

        public abstract int e();

        public abstract boolean f();
    }

    /* compiled from: SurfaceRequest */
    public interface e {
        void c(d dVar);
    }

    static {
        Range<Integer> range = v.f1409a;
    }

    public d1(Size size, r rVar, q qVar) {
        this.f4214b = size;
        this.f4215c = rVar;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference((Object) null);
        b.d a10 = z0.b.a(new b0.e(1, atomicReference, str));
        b.a<Void> aVar = (b.a) atomicReference.get();
        aVar.getClass();
        this.f4220h = aVar;
        AtomicReference atomicReference2 = new AtomicReference((Object) null);
        b.d a11 = z0.b.a(new r(1, atomicReference2, str));
        this.f4218f = a11;
        a11.b(new f.b(a11, new a1(aVar, a10)), j7.a.x());
        b.a aVar2 = (b.a) atomicReference2.get();
        aVar2.getClass();
        AtomicReference atomicReference3 = new AtomicReference((Object) null);
        b.d a12 = z0.b.a(new f0(1, atomicReference3, str));
        this.f4216d = a12;
        b.a<Surface> aVar3 = (b.a) atomicReference3.get();
        aVar3.getClass();
        this.f4217e = aVar3;
        b1 b1Var = new b1(this, size);
        this.f4221i = b1Var;
        v8.a<Void> d10 = b1Var.d();
        a12.b(new f.b(a12, new c1(d10, aVar2, str)), j7.a.x());
        d10.b(new z0(this, 0), j7.a.x());
        h0.a x10 = j7.a.x();
        AtomicReference atomicReference4 = new AtomicReference((Object) null);
        b.d a13 = z0.b.a(new b0.e(2, this, atomicReference4));
        a13.b(new f.b(a13, new e1(qVar)), x10);
        b.a<Void> aVar4 = (b.a) atomicReference4.get();
        aVar4.getClass();
        this.f4219g = aVar4;
    }

    public final void a(Surface surface, Executor executor, v1.a<c> aVar) {
        if (this.f4217e.a(surface) || this.f4216d.isCancelled()) {
            b.d dVar = this.f4218f;
            dVar.b(new f.b(dVar, new a(aVar, surface)), executor);
            return;
        }
        g0.E((String) null, this.f4216d.isDone());
        try {
            this.f4216d.get();
            executor.execute(new v.f(8, aVar, surface));
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new n(10, aVar, surface));
        }
    }

    public final void b() {
        this.f4217e.b(new DeferrableSurface.SurfaceUnavailableException());
    }
}
