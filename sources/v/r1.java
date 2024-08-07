package v;

import al.g0;
import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.j;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.u;
import b0.f;
import c0.q0;
import c0.t0;
import f0.p0;
import i0.c;
import i0.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: ProcessingCaptureSession */
public final class r1 implements a1 {

    /* renamed from: l  reason: collision with root package name */
    public static ArrayList f15815l = new ArrayList();

    /* renamed from: m  reason: collision with root package name */
    public static int f15816m = 0;

    /* renamed from: a  reason: collision with root package name */
    public final p0 f15817a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f15818b;

    /* renamed from: c  reason: collision with root package name */
    public final ScheduledExecutorService f15819c;

    /* renamed from: d  reason: collision with root package name */
    public final y0 f15820d;

    /* renamed from: e  reason: collision with root package name */
    public List<DeferrableSurface> f15821e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public u f15822f;

    /* renamed from: g  reason: collision with root package name */
    public u f15823g;

    /* renamed from: h  reason: collision with root package name */
    public int f15824h;

    /* renamed from: i  reason: collision with root package name */
    public volatile List<g> f15825i = null;

    /* renamed from: j  reason: collision with root package name */
    public f f15826j = new f(r.K(q.L()));

    /* renamed from: k  reason: collision with root package name */
    public f f15827k = new f(r.K(q.L()));

    /* compiled from: ProcessingCaptureSession */
    public class a implements c<Void> {
        public a() {
        }

        public final void a(Throwable th2) {
            c0.p0.c("ProcessingCaptureSession");
            r1.this.close();
            r1.this.a();
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* compiled from: ProcessingCaptureSession */
    public static class b {
    }

    public r1(p0 p0Var, x xVar, x.b bVar, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f15820d = new y0(bVar);
        this.f15817a = p0Var;
        this.f15818b = executor;
        this.f15819c = scheduledExecutorService;
        this.f15824h = 1;
        new b();
        f15816m++;
        c0.p0.a("ProcessingCaptureSession");
    }

    public static void i(List<g> list) {
        for (g gVar : list) {
            for (f0.f a10 : gVar.f1361e) {
                a10.a();
            }
        }
    }

    public final v8.a a() {
        c0.p0.a("ProcessingCaptureSession");
        v8.a a10 = this.f15820d.a();
        int g2 = v.g(this.f15824h);
        if (g2 == 1 || g2 == 3) {
            a10.b(new p1(this, 0), j7.a.x());
        }
        this.f15824h = 5;
        return a10;
    }

    public final void b() {
        c0.p0.a("ProcessingCaptureSession");
        if (this.f15825i != null) {
            for (g gVar : this.f15825i) {
                for (f0.f a10 : gVar.f1361e) {
                    a10.a();
                }
            }
            this.f15825i = null;
        }
    }

    public final void c(HashMap hashMap) {
    }

    public final void close() {
        c0.p0.a("ProcessingCaptureSession");
        if (this.f15824h == 3) {
            c0.p0.a("ProcessingCaptureSession");
            this.f15817a.c();
            this.f15824h = 4;
        }
        this.f15820d.close();
    }

    public final v8.a<Void> d(u uVar, CameraDevice cameraDevice, a2 a2Var) {
        boolean z10;
        if (this.f15824h == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder q10 = android.support.v4.media.a.q("Invalid state state:");
        q10.append(v.j(this.f15824h));
        g0.y(q10.toString(), z10);
        g0.y("SessionConfig contains no surfaces", !uVar.b().isEmpty());
        c0.p0.a("ProcessingCaptureSession");
        List<DeferrableSurface> b10 = uVar.b();
        this.f15821e = b10;
        return i0.f.f(d.a(j.c(b10, this.f15818b, this.f15819c)).d(new q1(this, uVar, cameraDevice, a2Var), this.f15818b), new q0(this, 2), this.f15818b);
    }

    public final List<g> e() {
        if (this.f15825i != null) {
            return this.f15825i;
        }
        return Collections.emptyList();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.util.List<androidx.camera.core.impl.g> r9) {
        /*
            r8 = this;
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.String r0 = "ProcessingCaptureSession"
            c0.p0.a(r0)
            int r1 = r8.f15824h
            int r1 = v.v.g(r1)
            if (r1 == 0) goto L_0x00ec
            r2 = 1
            if (r1 == r2) goto L_0x00ec
            r3 = 2
            if (r1 == r3) goto L_0x002a
            r2 = 3
            if (r1 == r2) goto L_0x0022
            r2 = 4
            if (r1 == r2) goto L_0x0022
            goto L_0x00ee
        L_0x0022:
            c0.p0.a(r0)
            i(r9)
            goto L_0x00ee
        L_0x002a:
            java.util.Iterator r9 = r9.iterator()
        L_0x002e:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r1 = r9.next()
            androidx.camera.core.impl.g r1 = (androidx.camera.core.impl.g) r1
            int r4 = r1.f1359c
            if (r4 != r3) goto L_0x0097
            androidx.camera.core.impl.i r4 = r1.f1358b
            b0.f$a r4 = b0.f.a.d(r4)
            androidx.camera.core.impl.i r5 = r1.f1358b
            androidx.camera.core.impl.c r6 = androidx.camera.core.impl.g.f1355i
            boolean r5 = r5.c(r6)
            if (r5 == 0) goto L_0x0061
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.JPEG_ORIENTATION
            androidx.camera.core.impl.i r7 = r1.f1358b
            java.lang.Object r6 = r7.a(r6)
            java.lang.Integer r6 = (java.lang.Integer) r6
            androidx.camera.core.impl.c r5 = u.a.K(r5)
            androidx.camera.core.impl.q r7 = r4.f3874a
            r7.O(r5, r6)
        L_0x0061:
            androidx.camera.core.impl.i r5 = r1.f1358b
            androidx.camera.core.impl.c r6 = androidx.camera.core.impl.g.f1356j
            boolean r5 = r5.c(r6)
            if (r5 == 0) goto L_0x0086
            android.hardware.camera2.CaptureRequest$Key r5 = android.hardware.camera2.CaptureRequest.JPEG_QUALITY
            androidx.camera.core.impl.i r1 = r1.f1358b
            java.lang.Object r1 = r1.a(r6)
            java.lang.Integer r1 = (java.lang.Integer) r1
            byte r1 = r1.byteValue()
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            androidx.camera.core.impl.c r5 = u.a.K(r5)
            androidx.camera.core.impl.q r6 = r4.f3874a
            r6.O(r5, r1)
        L_0x0086:
            b0.f r1 = r4.c()
            r8.f15827k = r1
            b0.f r4 = r8.f15826j
            r8.j(r4, r1)
            f0.p0 r1 = r8.f15817a
            r1.b()
            goto L_0x002e
        L_0x0097:
            c0.p0.a(r0)
            androidx.camera.core.impl.i r4 = r1.f1358b
            b0.f$a r4 = b0.f.a.d(r4)
            b0.f r4 = r4.c()
            androidx.camera.core.impl.i r4 = r4.b()
            java.util.Set r4 = r4.d()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b0:
            boolean r5 = r4.hasNext()
            r6 = 0
            if (r5 == 0) goto L_0x00d5
            java.lang.Object r5 = r4.next()
            androidx.camera.core.impl.i$a r5 = (androidx.camera.core.impl.i.a) r5
            java.lang.Object r5 = r5.c()
            android.hardware.camera2.CaptureRequest$Key r5 = (android.hardware.camera2.CaptureRequest.Key) r5
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            boolean r7 = r5.equals(r7)
            if (r7 != 0) goto L_0x00d3
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x00b0
        L_0x00d3:
            r4 = r2
            goto L_0x00d6
        L_0x00d5:
            r4 = r6
        L_0x00d6:
            if (r4 != 0) goto L_0x00e5
            androidx.camera.core.impl.g[] r4 = new androidx.camera.core.impl.g[r2]
            r4[r6] = r1
            java.util.List r1 = java.util.Arrays.asList(r4)
            i(r1)
            goto L_0x002e
        L_0x00e5:
            f0.p0 r1 = r8.f15817a
            r1.j()
            goto L_0x002e
        L_0x00ec:
            r8.f15825i = r9
        L_0x00ee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.r1.f(java.util.List):void");
    }

    public final u g() {
        return this.f15822f;
    }

    public final void h(u uVar) {
        boolean z10;
        c0.p0.a("ProcessingCaptureSession");
        this.f15822f = uVar;
        if (uVar != null && this.f15824h == 3) {
            f c10 = f.a.d(uVar.f1396f.f1358b).c();
            this.f15826j = c10;
            j(c10, this.f15827k);
            Iterator<DeferrableSurface> it = uVar.f1396f.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Objects.equals(it.next().f1322j, t0.class)) {
                        z10 = true;
                        break;
                    }
                } else {
                    z10 = false;
                    break;
                }
            }
            if (!z10) {
                this.f15817a.a();
            } else {
                this.f15817a.h();
            }
        }
    }

    public final void j(f fVar, f fVar2) {
        q L = q.L();
        for (i.a aVar : fVar.d()) {
            L.O(aVar, fVar.a(aVar));
        }
        for (i.a aVar2 : fVar2.d()) {
            L.O(aVar2, fVar2.a(aVar2));
        }
        p0 p0Var = this.f15817a;
        r.K(L);
        p0Var.g();
    }
}
