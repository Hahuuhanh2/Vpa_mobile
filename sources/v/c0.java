package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.q;
import c0.p0;
import c0.q0;
import f0.h;
import f0.i;
import f0.j;
import f0.u0;
import i0.i;
import i0.m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import v.o;
import w.t;
import z.l;
import z.r;
import z0.b;

/* compiled from: Camera2CapturePipeline */
public final class c0 {

    /* renamed from: h  reason: collision with root package name */
    public static final Set<i> f15602h = Collections.unmodifiableSet(EnumSet.of(i.PASSIVE_FOCUSED, i.PASSIVE_NOT_FOCUSED, i.LOCKED_FOCUSED, i.LOCKED_NOT_FOCUSED));

    /* renamed from: i  reason: collision with root package name */
    public static final Set<j> f15603i = Collections.unmodifiableSet(EnumSet.of(j.CONVERGED, j.UNKNOWN));

    /* renamed from: j  reason: collision with root package name */
    public static final Set<h> f15604j;

    /* renamed from: k  reason: collision with root package name */
    public static final Set<h> f15605k;

    /* renamed from: a  reason: collision with root package name */
    public final o f15606a;

    /* renamed from: b  reason: collision with root package name */
    public final r f15607b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f15608c;

    /* renamed from: d  reason: collision with root package name */
    public final z.d f15609d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f15610e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f15611f;

    /* renamed from: g  reason: collision with root package name */
    public int f15612g = 1;

    /* compiled from: Camera2CapturePipeline */
    public static class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final o f15613a;

        /* renamed from: b  reason: collision with root package name */
        public final l f15614b;

        /* renamed from: c  reason: collision with root package name */
        public final int f15615c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f15616d = false;

        public a(o oVar, int i10, l lVar) {
            this.f15613a = oVar;
            this.f15615c = i10;
            this.f15614b = lVar;
        }

        public final v8.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (!c0.b(this.f15615c, totalCaptureResult)) {
                return i0.f.c(Boolean.FALSE);
            }
            p0.a("Camera2CapturePipeline");
            this.f15616d = true;
            i0.d a10 = i0.d.a(z0.b.a(new ea.c(this, 1)));
            kh.h hVar = new kh.h(0);
            h0.a x10 = j7.a.x();
            a10.getClass();
            return i0.f.f(a10, hVar, x10);
        }

        public final boolean b() {
            if (this.f15615c == 0) {
                return true;
            }
            return false;
        }

        public final void c() {
            if (this.f15616d) {
                p0.a("Camera2CapturePipeline");
                this.f15613a.f15762h.a(false, true);
                this.f15614b.f17758b = false;
            }
        }
    }

    /* compiled from: Camera2CapturePipeline */
    public static class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final o f15617a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15618b = false;

        public b(o oVar) {
            this.f15617a = oVar;
        }

        public final v8.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            i.c c10 = i0.f.c(Boolean.TRUE);
            if (totalCaptureResult == null || (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) == null) {
                return c10;
            }
            int intValue = num.intValue();
            if (intValue == 1 || intValue == 2) {
                p0.a("Camera2CapturePipeline");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    p0.a("Camera2CapturePipeline");
                    this.f15618b = true;
                    k1 k1Var = this.f15617a.f15762h;
                    if (k1Var.f15725b) {
                        g.a aVar = new g.a();
                        aVar.f1367c = k1Var.f15726c;
                        aVar.f1370f = true;
                        q L = q.L();
                        L.O(u.a.K(CaptureRequest.CONTROL_AF_TRIGGER), 1);
                        aVar.c(new u.a(androidx.camera.core.impl.r.K(L)));
                        aVar.b(new i1());
                        k1Var.f15724a.r(Collections.singletonList(aVar.d()));
                    }
                }
            }
            return c10;
        }

        public final boolean b() {
            return true;
        }

        public final void c() {
            if (this.f15618b) {
                p0.a("Camera2CapturePipeline");
                this.f15617a.f15762h.a(true, false);
            }
        }
    }

    /* compiled from: Camera2CapturePipeline */
    public static class c {

        /* renamed from: i  reason: collision with root package name */
        public static final long f15619i;

        /* renamed from: j  reason: collision with root package name */
        public static final long f15620j;

        /* renamed from: k  reason: collision with root package name */
        public static final /* synthetic */ int f15621k = 0;

        /* renamed from: a  reason: collision with root package name */
        public final int f15622a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f15623b;

        /* renamed from: c  reason: collision with root package name */
        public final o f15624c;

        /* renamed from: d  reason: collision with root package name */
        public final l f15625d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f15626e;

        /* renamed from: f  reason: collision with root package name */
        public long f15627f = f15619i;

        /* renamed from: g  reason: collision with root package name */
        public final ArrayList f15628g = new ArrayList();

        /* renamed from: h  reason: collision with root package name */
        public final a f15629h = new a();

        /* compiled from: Camera2CapturePipeline */
        public class a implements d {
            public a() {
            }

            public final v8.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = c.this.f15628g.iterator();
                while (it.hasNext()) {
                    arrayList.add(((d) it.next()).a(totalCaptureResult));
                }
                return i0.f.f(new m(new ArrayList(arrayList), true, j7.a.x()), new g0(0), j7.a.x());
            }

            public final boolean b() {
                Iterator it = c.this.f15628g.iterator();
                while (it.hasNext()) {
                    if (((d) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            public final void c() {
                Iterator it = c.this.f15628g.iterator();
                while (it.hasNext()) {
                    ((d) it.next()).c();
                }
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f15619i = timeUnit.toNanos(1);
            f15620j = timeUnit.toNanos(5);
        }

        public c(int i10, Executor executor, o oVar, boolean z10, l lVar) {
            this.f15622a = i10;
            this.f15623b = executor;
            this.f15624c = oVar;
            this.f15626e = z10;
            this.f15625d = lVar;
        }
    }

    /* compiled from: Camera2CapturePipeline */
    public interface d {
        v8.a<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* compiled from: Camera2CapturePipeline */
    public static class e implements o.c {

        /* renamed from: a  reason: collision with root package name */
        public b.a<TotalCaptureResult> f15631a;

        /* renamed from: b  reason: collision with root package name */
        public final b.d f15632b = z0.b.a(new ea.c(this, 2));

        /* renamed from: c  reason: collision with root package name */
        public final long f15633c;

        /* renamed from: d  reason: collision with root package name */
        public final a f15634d;

        /* renamed from: e  reason: collision with root package name */
        public volatile Long f15635e = null;

        /* compiled from: Camera2CapturePipeline */
        public interface a {
        }

        public e(long j10, kh.h hVar) {
            this.f15633c = j10;
            this.f15634d = hVar;
        }

        public final boolean a(TotalCaptureResult totalCaptureResult) {
            boolean z10;
            Long l10 = (Long) totalCaptureResult.get(CaptureResult.SENSOR_TIMESTAMP);
            if (l10 != null && this.f15635e == null) {
                this.f15635e = l10;
            }
            Long l11 = this.f15635e;
            if (0 == this.f15633c || l11 == null || l10 == null || l10.longValue() - l11.longValue() <= this.f15633c) {
                a aVar = this.f15634d;
                if (aVar != null) {
                    switch (((kh.h) aVar).f20819a) {
                        case 1:
                            int i10 = c.f15621k;
                            z10 = c0.a(totalCaptureResult, false);
                            break;
                        default:
                            int i11 = f.f15637f;
                            z10 = c0.a(totalCaptureResult, true);
                            break;
                    }
                    if (!z10) {
                        return false;
                    }
                }
                this.f15631a.a(totalCaptureResult);
                return true;
            }
            this.f15631a.a(null);
            p0.a("Camera2CapturePipeline");
            return true;
        }
    }

    /* compiled from: Camera2CapturePipeline */
    public static class f implements d {

        /* renamed from: e  reason: collision with root package name */
        public static final long f15636e = TimeUnit.SECONDS.toNanos(2);

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int f15637f = 0;

        /* renamed from: a  reason: collision with root package name */
        public final o f15638a;

        /* renamed from: b  reason: collision with root package name */
        public final int f15639b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15640c = false;

        /* renamed from: d  reason: collision with root package name */
        public final Executor f15641d;

        public f(o oVar, int i10, Executor executor) {
            this.f15638a = oVar;
            this.f15639b = i10;
            this.f15641d = executor;
        }

        public final v8.a<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (c0.b(this.f15639b, totalCaptureResult)) {
                if (this.f15638a.f15770p) {
                    p0.a("Camera2CapturePipeline");
                } else {
                    p0.a("Camera2CapturePipeline");
                    this.f15640c = true;
                    return i0.f.f(i0.d.a(z0.b.a(new ca.a(this, 1))).d(new q0(this, 1), this.f15641d), new kh.h(3), j7.a.x());
                }
            }
            return i0.f.c(Boolean.FALSE);
        }

        public final boolean b() {
            if (this.f15639b == 0) {
                return true;
            }
            return false;
        }

        public final void c() {
            if (this.f15640c) {
                this.f15638a.f15764j.a((b.a<Void>) null, false);
                p0.a("Camera2CapturePipeline");
            }
        }
    }

    static {
        h hVar = h.CONVERGED;
        h hVar2 = h.FLASH_REQUIRED;
        h hVar3 = h.UNKNOWN;
        Set<h> unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(hVar, hVar2, hVar3));
        f15604j = unmodifiableSet;
        EnumSet<h> copyOf = EnumSet.copyOf(unmodifiableSet);
        copyOf.remove(hVar2);
        copyOf.remove(hVar3);
        f15605k = Collections.unmodifiableSet(copyOf);
    }

    public c0(o oVar, t tVar, z.d dVar, h0.g gVar) {
        boolean z10 = true;
        this.f15606a = oVar;
        Integer num = (Integer) tVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f15611f = (num == null || num.intValue() != 2) ? false : z10;
        this.f15610e = gVar;
        this.f15609d = dVar;
        this.f15607b = new r(dVar);
        this.f15608c = z.e.a(new b0(tVar, 0));
    }

    public static boolean a(TotalCaptureResult totalCaptureResult, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        if (totalCaptureResult == null) {
            return false;
        }
        e eVar = new e(u0.f9604b, totalCaptureResult);
        if (eVar.i() == 2 || eVar.i() == 1 || f15602h.contains(eVar.h())) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z10 ? z12 || f15604j.contains(eVar.f()) : z12 || f15605k.contains(eVar.f())) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AWB_MODE)).intValue() == 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14 || f15603i.contains(eVar.d())) {
            z15 = true;
        } else {
            z15 = false;
        }
        eVar.f().toString();
        eVar.h().toString();
        eVar.d().toString();
        p0.a("Camera2CapturePipeline");
        if (!z11 || !z13 || !z15) {
            return false;
        }
        return true;
    }

    public static boolean b(int i10, TotalCaptureResult totalCaptureResult) {
        Integer num;
        if (i10 == 0) {
            if (totalCaptureResult != null) {
                num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
            } else {
                num = null;
            }
            if (num == null || num.intValue() != 4) {
                return false;
            }
            return true;
        } else if (i10 == 1) {
            return true;
        } else {
            if (i10 == 2) {
                return false;
            }
            throw new AssertionError(i10);
        }
    }
}
