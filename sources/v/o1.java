package v;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.n;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import b0.e;
import c0.f1;
import c0.p;
import c0.p0;
import c0.q0;
import f0.b0;
import f0.e0;
import i0.f;
import j0.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import w.t;

/* compiled from: MeteringRepeatingSession */
public final class o1 {

    /* renamed from: a  reason: collision with root package name */
    public e0 f15785a;

    /* renamed from: b  reason: collision with root package name */
    public u f15786b;

    /* renamed from: c  reason: collision with root package name */
    public final b f15787c = new b();

    /* renamed from: d  reason: collision with root package name */
    public final Size f15788d;

    /* renamed from: e  reason: collision with root package name */
    public final c f15789e;

    /* compiled from: MeteringRepeatingSession */
    public class a implements i0.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Surface f15790a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f15791b;

        public a(Surface surface, SurfaceTexture surfaceTexture) {
            this.f15790a = surface;
            this.f15791b = surfaceTexture;
        }

        public final void a(Throwable th2) {
            throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }

        public final void onSuccess(Object obj) {
            Void voidR = (Void) obj;
            this.f15790a.release();
            this.f15791b.release();
        }
    }

    /* compiled from: MeteringRepeatingSession */
    public static class b implements x<f1> {
        public final q E;

        public b() {
            q L = q.L();
            L.O(x.f1417r, new l0());
            this.E = L;
        }

        public final p A() {
            return (p) e(x.f1420u, (Object) null);
        }

        public final /* synthetic */ boolean B() {
            return b0.i(this);
        }

        public final g C() {
            return (g) e(x.f1416q, (Object) null);
        }

        public final /* synthetic */ String D() {
            return b0.g(this);
        }

        public final /* synthetic */ int G() {
            return b0.f(this);
        }

        public final /* synthetic */ boolean I() {
            return b0.j(this);
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

        public final void f(e eVar) {
            this.E.f(eVar);
        }

        public final f1.a g() {
            return (f1.a) e(j.D, null);
        }

        public final /* synthetic */ c0.x h() {
            return b0.d(this);
        }

        public final Range k() {
            return (Range) e(x.f1421v, (Object) null);
        }

        public final int l() {
            return ((Integer) a(n.f1379d)).intValue();
        }

        public final Object n(i.a aVar, i.b bVar) {
            return ((r) b()).n(aVar, bVar);
        }

        public final u o() {
            return (u) e(x.f1415p, (Object) null);
        }

        public final /* synthetic */ int p() {
            return b0.e(this);
        }

        public final u.d q() {
            return (u.d) e(x.f1417r, (Object) null);
        }

        public final /* synthetic */ String t(String str) {
            return b0.h(this, str);
        }

        public final i.b v(i.a aVar) {
            return ((r) b()).v(aVar);
        }

        public final Set w(i.a aVar) {
            return ((r) b()).w(aVar);
        }

        public final y.b z() {
            return y.b.METERING_REPEATING;
        }
    }

    /* compiled from: MeteringRepeatingSession */
    public interface c {
    }

    public o1(t tVar, d1 d1Var, q0 q0Var) {
        Size size;
        boolean z10;
        z.p pVar = new z.p();
        this.f15789e = q0Var;
        Size[] a10 = tVar.b().a(34);
        if (a10 == null) {
            p0.b("MeteringRepeating");
            size = new Size(0, 0);
        } else {
            if (pVar.f17764a != null) {
                if (!"Huawei".equalsIgnoreCase(Build.BRAND) || !"mha-l29".equalsIgnoreCase(Build.MODEL)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    ArrayList arrayList = new ArrayList();
                    for (Size size2 : a10) {
                        if (z.p.f17763c.compare(size2, z.p.f17762b) >= 0) {
                            arrayList.add(size2);
                        }
                    }
                    a10 = (Size[]) arrayList.toArray(new Size[0]);
                }
            }
            List asList = Arrays.asList(a10);
            Collections.sort(asList, new n1(0));
            Size e10 = d1Var.e();
            long min = Math.min(((long) e10.getWidth()) * ((long) e10.getHeight()), 307200);
            Size size3 = null;
            int length = a10.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                Size size4 = a10[i10];
                int i11 = ((((long) size4.getWidth()) * ((long) size4.getHeight())) > min ? 1 : ((((long) size4.getWidth()) * ((long) size4.getHeight())) == min ? 0 : -1));
                if (i11 == 0) {
                    size = size4;
                    break;
                } else if (i11 <= 0) {
                    i10++;
                    size3 = size4;
                } else if (size3 != null) {
                    size = size3;
                }
            }
            size = (Size) asList.get(0);
        }
        this.f15788d = size;
        Objects.toString(size);
        p0.a("MeteringRepeating");
        this.f15786b = a();
    }

    public final u a() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(this.f15788d.getWidth(), this.f15788d.getHeight());
        Surface surface = new Surface(surfaceTexture);
        u.b d10 = u.b.d(this.f15787c, this.f15788d);
        d10.f1399b.f1367c = 1;
        e0 e0Var = new e0(surface);
        this.f15785a = e0Var;
        v8.a<Void> d11 = e0Var.d();
        a aVar = new a(surface, surfaceTexture);
        d11.b(new f.b(d11, aVar), j7.a.x());
        d10.b(this.f15785a, c0.x.f4367d);
        d10.f1402e.add(new m1(this));
        return d10.c();
    }
}
