package v;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.InputConfiguration;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.appcompat.app.p;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.d;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import androidx.camera.core.impl.w;
import androidx.camera.core.impl.x;
import androidx.camera.core.impl.y;
import c0.f1;
import c0.o;
import c0.q0;
import c0.t0;
import f0.e0;
import f0.g0;
import f0.i0;
import f0.j0;
import f0.n;
import f0.p0;
import f0.q;
import f0.r;
import f0.t;
import f0.u0;
import h0.g;
import i0.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import p3.l0;
import v.a2;
import v.o1;
import w.z;
import y.k;

/* compiled from: Camera2CameraImpl */
public final class u implements r {
    public final b1 A;
    public final a2.a B;
    public final HashSet C;
    public n.a D;
    public final Object E;
    public p0 F;
    public boolean G;
    public final d1 H;
    public final x.b I;

    /* renamed from: a  reason: collision with root package name */
    public final w f15863a;

    /* renamed from: b  reason: collision with root package name */
    public final z f15864b;

    /* renamed from: c  reason: collision with root package name */
    public final g f15865c;

    /* renamed from: d  reason: collision with root package name */
    public final h0.b f15866d;

    /* renamed from: e  reason: collision with root package name */
    public volatile int f15867e = 1;

    /* renamed from: f  reason: collision with root package name */
    public final g0<r.a> f15868f;

    /* renamed from: n  reason: collision with root package name */
    public final t0 f15869n;

    /* renamed from: o  reason: collision with root package name */
    public final o f15870o;

    /* renamed from: p  reason: collision with root package name */
    public final e f15871p;

    /* renamed from: q  reason: collision with root package name */
    public final x f15872q;

    /* renamed from: r  reason: collision with root package name */
    public CameraDevice f15873r;

    /* renamed from: s  reason: collision with root package name */
    public int f15874s;

    /* renamed from: t  reason: collision with root package name */
    public a1 f15875t;

    /* renamed from: u  reason: collision with root package name */
    public final LinkedHashMap f15876u;

    /* renamed from: v  reason: collision with root package name */
    public final b f15877v;

    /* renamed from: w  reason: collision with root package name */
    public final d0.a f15878w;

    /* renamed from: x  reason: collision with root package name */
    public final t f15879x;

    /* renamed from: y  reason: collision with root package name */
    public final HashSet f15880y;

    /* renamed from: z  reason: collision with root package name */
    public o1 f15881z;

    /* compiled from: Camera2CameraImpl */
    public class a implements i0.c<Void> {
        public a() {
        }

        public final void a(Throwable th2) {
            androidx.camera.core.impl.u uVar;
            if (th2 instanceof DeferrableSurface.SurfaceClosedException) {
                u uVar2 = u.this;
                DeferrableSurface deferrableSurface = ((DeferrableSurface.SurfaceClosedException) th2).f1323a;
                Iterator<androidx.camera.core.impl.u> it = uVar2.f15863a.b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        uVar = null;
                        break;
                    }
                    uVar = it.next();
                    if (uVar.b().contains(deferrableSurface)) {
                        break;
                    }
                }
                if (uVar != null) {
                    u uVar3 = u.this;
                    uVar3.getClass();
                    h0.b f02 = j7.a.f0();
                    List<u.c> list = uVar.f1395e;
                    if (!list.isEmpty()) {
                        new Throwable();
                        uVar3.s("Posting surface closed");
                        f02.execute(new p(6, list.get(0), uVar));
                    }
                }
            } else if (th2 instanceof CancellationException) {
                u.this.s("Unable to configure camera cancelled");
            } else {
                if (u.this.f15867e == 4) {
                    u.this.F(4, new c0.e(4, th2), true);
                }
                if (th2 instanceof CameraAccessException) {
                    u uVar4 = u.this;
                    StringBuilder q10 = android.support.v4.media.a.q("Unable to configure camera due to ");
                    q10.append(th2.getMessage());
                    uVar4.s(q10.toString());
                } else if (th2 instanceof TimeoutException) {
                    String str = u.this.f15872q.f15910a;
                    c0.p0.b("Camera2CameraImpl");
                }
            }
        }

        public final void onSuccess(Object obj) {
            Void voidR = (Void) obj;
            u uVar = u.this;
            if (((a0.a) uVar.f15878w).f8e == 2 && uVar.f15867e == 4) {
                u.this.E(5);
            }
        }
    }

    /* compiled from: Camera2CameraImpl */
    public final class b extends CameraManager.AvailabilityCallback implements t.c {

        /* renamed from: a  reason: collision with root package name */
        public final String f15883a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f15884b = true;

        public b(String str) {
            this.f15883a = str;
        }

        public final void onCameraAvailable(String str) {
            if (this.f15883a.equals(str)) {
                this.f15884b = true;
                if (u.this.f15867e == 2) {
                    u.this.J(false);
                }
            }
        }

        public final void onCameraUnavailable(String str) {
            if (this.f15883a.equals(str)) {
                this.f15884b = false;
            }
        }
    }

    /* compiled from: Camera2CameraImpl */
    public final class c implements t.b {
        public c() {
        }
    }

    /* compiled from: Camera2CameraImpl */
    public final class d implements CameraControlInternal.b {
        public d() {
        }
    }

    /* compiled from: Camera2CameraImpl */
    public final class e extends CameraDevice.StateCallback {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f15888a;

        /* renamed from: b  reason: collision with root package name */
        public final ScheduledExecutorService f15889b;

        /* renamed from: c  reason: collision with root package name */
        public b f15890c;

        /* renamed from: d  reason: collision with root package name */
        public ScheduledFuture<?> f15891d;

        /* renamed from: e  reason: collision with root package name */
        public final a f15892e = new a();

        /* compiled from: Camera2CameraImpl */
        public class a {

            /* renamed from: a  reason: collision with root package name */
            public long f15894a = -1;

            public a() {
            }

            public final int a() {
                if (!e.this.c()) {
                    return 700;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f15894a == -1) {
                    this.f15894a = uptimeMillis;
                }
                long j10 = uptimeMillis - this.f15894a;
                if (j10 <= 120000) {
                    return 1000;
                }
                if (j10 <= 300000) {
                    return 2000;
                }
                return 4000;
            }
        }

        /* compiled from: Camera2CameraImpl */
        public class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public Executor f15896a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f15897b = false;

            public b(Executor executor) {
                this.f15896a = executor;
            }

            public final void run() {
                this.f15896a.execute(new d.d(this, 5));
            }
        }

        public e(g gVar, h0.b bVar) {
            this.f15888a = gVar;
            this.f15889b = bVar;
        }

        public final boolean a() {
            if (this.f15891d == null) {
                return false;
            }
            u uVar = u.this;
            StringBuilder q10 = android.support.v4.media.a.q("Cancelling scheduled re-open: ");
            q10.append(this.f15890c);
            uVar.s(q10.toString());
            this.f15890c.f15897b = true;
            this.f15890c = null;
            this.f15891d.cancel(false);
            this.f15891d = null;
            return true;
        }

        public final void b() {
            boolean z10;
            boolean z11;
            int i10;
            boolean z12;
            boolean z13 = true;
            if (this.f15890c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            al.g0.E((String) null, z10);
            if (this.f15891d == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            al.g0.E((String) null, z11);
            a aVar = this.f15892e;
            aVar.getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (aVar.f15894a == -1) {
                aVar.f15894a = uptimeMillis;
            }
            long j10 = uptimeMillis - aVar.f15894a;
            if (!e.this.c()) {
                i10 = 10000;
            } else {
                i10 = 1800000;
            }
            if (j10 >= ((long) i10)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                aVar.f15894a = -1;
                z13 = false;
            }
            if (z13) {
                this.f15890c = new b(this.f15888a);
                u uVar = u.this;
                StringBuilder q10 = android.support.v4.media.a.q("Attempting camera re-open in ");
                q10.append(this.f15892e.a());
                q10.append("ms: ");
                q10.append(this.f15890c);
                q10.append(" activeResuming = ");
                q10.append(u.this.G);
                uVar.s(q10.toString());
                this.f15891d = this.f15889b.schedule(this.f15890c, (long) this.f15892e.a(), TimeUnit.MILLISECONDS);
                return;
            }
            e.this.c();
            c0.p0.b("Camera2CameraImpl");
            u.this.F(2, (c0.e) null, false);
        }

        public final boolean c() {
            int i10;
            u uVar = u.this;
            if (!uVar.G || ((i10 = uVar.f15874s) != 1 && i10 != 2)) {
                return false;
            }
            return true;
        }

        public final void onClosed(CameraDevice cameraDevice) {
            boolean z10;
            u.this.s("CameraDevice.onClosed()");
            if (u.this.f15873r == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            al.g0.E("Unexpected onClose callback on camera device: " + cameraDevice, z10);
            int g2 = v.g(u.this.f15867e);
            if (g2 != 5) {
                if (g2 == 6) {
                    u uVar = u.this;
                    if (uVar.f15874s != 0) {
                        StringBuilder q10 = android.support.v4.media.a.q("Camera closed due to error: ");
                        q10.append(u.u(u.this.f15874s));
                        uVar.s(q10.toString());
                        b();
                        return;
                    }
                    uVar.J(false);
                    return;
                } else if (g2 != 7) {
                    StringBuilder q11 = android.support.v4.media.a.q("Camera closed while in state: ");
                    q11.append(v.h(u.this.f15867e));
                    throw new IllegalStateException(q11.toString());
                }
            }
            al.g0.E((String) null, u.this.x());
            u.this.t();
        }

        public final void onDisconnected(CameraDevice cameraDevice) {
            u.this.s("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        public final void onError(CameraDevice cameraDevice, int i10) {
            boolean z10;
            u uVar = u.this;
            uVar.f15873r = cameraDevice;
            uVar.f15874s = i10;
            int i11 = 3;
            boolean z11 = false;
            switch (v.g(uVar.f15867e)) {
                case 2:
                case 3:
                case 4:
                case 6:
                    String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", new Object[]{cameraDevice.getId(), u.u(i10), v.f(u.this.f15867e)});
                    c0.p0.a("Camera2CameraImpl");
                    int i12 = 5;
                    if (u.this.f15867e == 3 || u.this.f15867e == 4 || u.this.f15867e == 5 || u.this.f15867e == 7) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    StringBuilder q10 = android.support.v4.media.a.q("Attempt to handle open error from non open state: ");
                    q10.append(v.h(u.this.f15867e));
                    al.g0.E(q10.toString(), z10);
                    if (i10 == 1 || i10 == 2 || i10 == 4) {
                        String.format("Attempt to reopen camera[%s] after error[%s]", new Object[]{cameraDevice.getId(), u.u(i10)});
                        c0.p0.a("Camera2CameraImpl");
                        if (u.this.f15874s != 0) {
                            z11 = true;
                        }
                        al.g0.E("Can only reopen camera device after error if the camera device is actually in an error state.", z11);
                        if (i10 == 1) {
                            i11 = 2;
                        } else if (i10 == 2) {
                            i11 = 1;
                        }
                        u.this.F(7, new c0.e(i11, (Throwable) null), true);
                        u.this.q();
                        return;
                    }
                    cameraDevice.getId();
                    c0.p0.b("Camera2CameraImpl");
                    if (i10 != 3) {
                        i12 = 6;
                    }
                    u.this.F(6, new c0.e(i12, (Throwable) null), true);
                    u.this.q();
                    return;
                case 5:
                case 7:
                    String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", new Object[]{cameraDevice.getId(), u.u(i10), v.f(u.this.f15867e)});
                    c0.p0.b("Camera2CameraImpl");
                    u.this.q();
                    return;
                default:
                    StringBuilder q11 = android.support.v4.media.a.q("onError() should not be possible from state: ");
                    q11.append(v.h(u.this.f15867e));
                    throw new IllegalStateException(q11.toString());
            }
        }

        public final void onOpened(CameraDevice cameraDevice) {
            u.this.s("CameraDevice.onOpened()");
            u uVar = u.this;
            uVar.f15873r = cameraDevice;
            uVar.f15874s = 0;
            this.f15892e.f15894a = -1;
            int g2 = v.g(uVar.f15867e);
            if (g2 != 2) {
                if (g2 != 5) {
                    if (g2 != 6) {
                        if (g2 != 7) {
                            StringBuilder q10 = android.support.v4.media.a.q("onOpened() should not be possible from state: ");
                            q10.append(v.h(u.this.f15867e));
                            throw new IllegalStateException(q10.toString());
                        }
                    }
                }
                al.g0.E((String) null, u.this.x());
                u.this.f15873r.close();
                u.this.f15873r = null;
                return;
            }
            u.this.E(4);
            t tVar = u.this.f15879x;
            String id2 = cameraDevice.getId();
            u uVar2 = u.this;
            if (tVar.e(id2, ((a0.a) uVar2.f15878w).a(uVar2.f15873r.getId()))) {
                u.this.A();
            }
        }
    }

    /* compiled from: Camera2CameraImpl */
    public static abstract class f {
        public abstract androidx.camera.core.impl.u a();

        public abstract Size b();

        public abstract x<?> c();

        public abstract String d();

        public abstract Class<?> e();
    }

    public u(z zVar, String str, x xVar, a0.a aVar, t tVar, Executor executor, Handler handler, d1 d1Var) {
        z zVar2 = zVar;
        String str2 = str;
        x xVar2 = xVar;
        t tVar2 = tVar;
        boolean z10 = true;
        g0<r.a> g0Var = new g0<>();
        this.f15868f = g0Var;
        this.f15874s = 0;
        new AtomicInteger(0);
        this.f15876u = new LinkedHashMap();
        this.f15880y = new HashSet();
        this.C = new HashSet();
        this.D = n.f9564a;
        this.E = new Object();
        this.G = false;
        this.f15864b = zVar2;
        this.f15878w = aVar;
        this.f15879x = tVar2;
        h0.b bVar = new h0.b(handler);
        this.f15866d = bVar;
        g gVar = new g(executor);
        this.f15865c = gVar;
        this.f15871p = new e(gVar, bVar);
        this.f15863a = new w(str2);
        g0Var.f9533a.k(new g0.b(r.a.CLOSED));
        t0 t0Var = new t0(tVar2);
        this.f15869n = t0Var;
        b1 b1Var = new b1(gVar);
        this.A = b1Var;
        this.H = d1Var;
        try {
            w.t b10 = zVar.b(str);
            o oVar = new o(b10, gVar, new d(), xVar2.f15918i);
            this.f15870o = oVar;
            this.f15872q = xVar2;
            xVar2.o(oVar);
            xVar2.f15916g.l(t0Var.f15840b);
            this.I = x.b.a(b10);
            this.f15875t = y();
            this.B = new a2.a(handler, b1Var, xVar2.f15918i, k.f17339a, gVar, bVar);
            b bVar2 = new b(str2);
            this.f15877v = bVar2;
            c cVar = new c();
            synchronized (tVar2.f9595b) {
                if (tVar2.f9598e.containsKey(this)) {
                    z10 = false;
                }
                al.g0.E("Camera is already registered: " + this, z10);
                tVar2.f9598e.put(this, new t.a(gVar, cVar, bVar2));
            }
            zVar2.f16259a.c(gVar, bVar2);
        } catch (CameraAccessExceptionCompat e10) {
            throw l0.B(e10);
        }
    }

    public static ArrayList G(ArrayList arrayList) {
        Size size;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            String w9 = w(f1Var);
            Class<?> cls = f1Var.getClass();
            androidx.camera.core.impl.u uVar = f1Var.f4266m;
            x<?> xVar = f1Var.f4259f;
            v vVar = f1Var.f4260g;
            if (vVar != null) {
                size = vVar.d();
            } else {
                size = null;
            }
            arrayList2.add(new b(w9, cls, uVar, xVar, size));
        }
        return arrayList2;
    }

    public static String u(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String v(o1 o1Var) {
        StringBuilder sb2 = new StringBuilder();
        o1Var.getClass();
        sb2.append("MeteringRepeating");
        sb2.append(o1Var.hashCode());
        return sb2.toString();
    }

    public static String w(f1 f1Var) {
        return f1Var.g() + f1Var.hashCode();
    }

    public final void A() {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (this.f15867e == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        al.g0.E((String) null, z10);
        u.f a10 = this.f15863a.a();
        if (!a10.f1408j || !a10.f1407i) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            s("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f15879x.e(this.f15873r.getId(), ((a0.a) this.f15878w).a(this.f15873r.getId()))) {
            StringBuilder q10 = android.support.v4.media.a.q("Unable to create capture session in camera operating mode = ");
            q10.append(((a0.a) this.f15878w).f8e);
            s(q10.toString());
            return;
        }
        HashMap hashMap = new HashMap();
        Collection<androidx.camera.core.impl.u> b10 = this.f15863a.b();
        Collection<x<?>> c10 = this.f15863a.c();
        androidx.camera.core.impl.c cVar = s1.f15834a;
        ArrayList arrayList = new ArrayList(c10);
        Iterator<androidx.camera.core.impl.u> it = b10.iterator();
        while (true) {
            if (!it.hasNext()) {
                z12 = false;
                break;
            }
            androidx.camera.core.impl.u next = it.next();
            i iVar = next.f1396f.f1358b;
            androidx.camera.core.impl.c cVar2 = s1.f15834a;
            if (!iVar.c(cVar2) || next.b().size() == 1) {
                if (next.f1396f.f1358b.c(cVar2)) {
                    break;
                }
            } else {
                String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", new Object[]{Integer.valueOf(next.b().size())});
                c0.p0.b("Camera2CameraImpl");
                break;
            }
        }
        if (z12) {
            int i10 = 0;
            for (androidx.camera.core.impl.u next2 : b10) {
                if (((x) arrayList.get(i10)).z() == y.b.METERING_REPEATING) {
                    hashMap.put(next2.b().get(0), 1L);
                } else {
                    i iVar2 = next2.f1396f.f1358b;
                    androidx.camera.core.impl.c cVar3 = s1.f15834a;
                    if (iVar2.c(cVar3)) {
                        hashMap.put(next2.b().get(0), (Long) next2.f1396f.f1358b.a(cVar3));
                    }
                }
                i10++;
            }
        }
        this.f15875t.c(hashMap);
        a1 a1Var = this.f15875t;
        androidx.camera.core.impl.u b11 = a10.b();
        CameraDevice cameraDevice = this.f15873r;
        cameraDevice.getClass();
        v8.a<Void> d10 = a1Var.d(b11, cameraDevice, this.B.a());
        d10.b(new f.b(d10, new a()), this.f15865c);
    }

    public final v8.a B(a1 a1Var) {
        a1Var.close();
        v8.a a10 = a1Var.a();
        StringBuilder q10 = android.support.v4.media.a.q("Releasing session in state ");
        q10.append(v.f(this.f15867e));
        s(q10.toString());
        this.f15876u.put(a1Var, a10);
        t tVar = new t(this, a1Var);
        a10.b(new f.b(a10, tVar), j7.a.x());
        return a10;
    }

    public final void C() {
        if (this.f15881z != null) {
            w wVar = this.f15863a;
            StringBuilder sb2 = new StringBuilder();
            this.f15881z.getClass();
            sb2.append("MeteringRepeating");
            sb2.append(this.f15881z.hashCode());
            String sb3 = sb2.toString();
            if (wVar.f1410a.containsKey(sb3)) {
                w.a aVar = (w.a) wVar.f1410a.get(sb3);
                aVar.f1413c = false;
                if (!aVar.f1414d) {
                    wVar.f1410a.remove(sb3);
                }
            }
            w wVar2 = this.f15863a;
            StringBuilder sb4 = new StringBuilder();
            this.f15881z.getClass();
            sb4.append("MeteringRepeating");
            sb4.append(this.f15881z.hashCode());
            wVar2.e(sb4.toString());
            o1 o1Var = this.f15881z;
            o1Var.getClass();
            c0.p0.a("MeteringRepeating");
            e0 e0Var = o1Var.f15785a;
            if (e0Var != null) {
                e0Var.a();
            }
            o1Var.f15785a = null;
            this.f15881z = null;
        }
    }

    public final void D() {
        boolean z10;
        if (this.f15875t != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        al.g0.E((String) null, z10);
        s("Resetting Capture Session");
        a1 a1Var = this.f15875t;
        androidx.camera.core.impl.u g2 = a1Var.g();
        List<androidx.camera.core.impl.g> e10 = a1Var.e();
        a1 y10 = y();
        this.f15875t = y10;
        y10.h(g2);
        this.f15875t.f(e10);
        B(a1Var);
    }

    public final void E(int i10) {
        F(i10, (c0.e) null, true);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(int r13, c0.e r14, boolean r15) {
        /*
            r12 = this;
            f0.r$a r0 = f0.r.a.RELEASED
            f0.r$a r1 = f0.r.a.OPENING
            f0.r$a r2 = f0.r.a.CONFIGURED
            f0.r$a r3 = f0.r.a.CLOSING
            f0.r$a r4 = f0.r.a.PENDING_OPEN
            java.lang.String r5 = "Transitioning camera internal state: "
            java.lang.StringBuilder r5 = android.support.v4.media.a.q(r5)
            int r6 = r12.f15867e
            java.lang.String r6 = v.v.h(r6)
            r5.append(r6)
            java.lang.String r6 = " --> "
            r5.append(r6)
            java.lang.String r6 = v.v.h(r13)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r12.s(r5)
            r12.f15867e = r13
            r5 = 0
            if (r13 == 0) goto L_0x0220
            int r6 = r13 + -1
            switch(r6) {
                case 0: goto L_0x005d;
                case 1: goto L_0x005b;
                case 2: goto L_0x0059;
                case 3: goto L_0x0056;
                case 4: goto L_0x0054;
                case 5: goto L_0x0052;
                case 6: goto L_0x0059;
                case 7: goto L_0x004f;
                case 8: goto L_0x004d;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "Unknown state: "
            java.lang.StringBuilder r15 = android.support.v4.media.a.q(r15)
            java.lang.String r13 = v.v.h(r13)
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            r14.<init>(r13)
            throw r14
        L_0x004d:
            r13 = r0
            goto L_0x005f
        L_0x004f:
            f0.r$a r13 = f0.r.a.RELEASING
            goto L_0x005f
        L_0x0052:
            r13 = r3
            goto L_0x005f
        L_0x0054:
            r13 = r2
            goto L_0x005f
        L_0x0056:
            f0.r$a r13 = f0.r.a.OPEN
            goto L_0x005f
        L_0x0059:
            r13 = r1
            goto L_0x005f
        L_0x005b:
            r13 = r4
            goto L_0x005f
        L_0x005d:
            f0.r$a r13 = f0.r.a.CLOSED
        L_0x005f:
            f0.t r6 = r12.f15879x
            java.lang.Object r7 = r6.f9595b
            monitor-enter(r7)
            int r8 = r6.f9599f     // Catch:{ all -> 0x021d }
            r9 = 0
            r10 = 1
            if (r13 != r0) goto L_0x007c
            java.util.HashMap r0 = r6.f9598e     // Catch:{ all -> 0x021d }
            java.lang.Object r0 = r0.remove(r12)     // Catch:{ all -> 0x021d }
            f0.t$a r0 = (f0.t.a) r0     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x007a
            r6.c()     // Catch:{ all -> 0x021d }
            f0.r$a r0 = r0.f9600a     // Catch:{ all -> 0x021d }
            goto L_0x00a4
        L_0x007a:
            r0 = r5
            goto L_0x00a4
        L_0x007c:
            java.util.HashMap r0 = r6.f9598e     // Catch:{ all -> 0x021d }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x021d }
            f0.t$a r0 = (f0.t.a) r0     // Catch:{ all -> 0x021d }
            java.lang.String r11 = "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()"
            al.g0.D(r0, r11)     // Catch:{ all -> 0x021d }
            f0.r$a r11 = r0.f9600a     // Catch:{ all -> 0x021d }
            r0.f9600a = r13     // Catch:{ all -> 0x021d }
            if (r13 != r1) goto L_0x009e
            boolean r0 = r13.f9580a     // Catch:{ all -> 0x021d }
            if (r0 != 0) goto L_0x0098
            if (r11 != r1) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r0 = r9
            goto L_0x0099
        L_0x0098:
            r0 = r10
        L_0x0099:
            java.lang.String r1 = "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()"
            al.g0.E(r1, r0)     // Catch:{ all -> 0x021d }
        L_0x009e:
            if (r11 == r13) goto L_0x00a3
            r6.c()     // Catch:{ all -> 0x021d }
        L_0x00a3:
            r0 = r11
        L_0x00a4:
            r1 = 2
            if (r0 != r13) goto L_0x00aa
            monitor-exit(r7)     // Catch:{ all -> 0x021d }
            goto L_0x016f
        L_0x00aa:
            d0.a r0 = r6.f9597d     // Catch:{ all -> 0x021d }
            a0.a r0 = (a0.a) r0     // Catch:{ all -> 0x021d }
            int r0 = r0.f8e     // Catch:{ all -> 0x021d }
            if (r0 != r1) goto L_0x00cb
            if (r13 != r2) goto L_0x00cb
            f0.q r0 = r12.n()     // Catch:{ all -> 0x021d }
            java.lang.String r0 = r0.b()     // Catch:{ all -> 0x021d }
            d0.a r2 = r6.f9597d     // Catch:{ all -> 0x021d }
            a0.a r2 = (a0.a) r2     // Catch:{ all -> 0x021d }
            java.lang.String r0 = r2.a(r0)     // Catch:{ all -> 0x021d }
            if (r0 == 0) goto L_0x00cb
            f0.t$a r0 = r6.b(r0)     // Catch:{ all -> 0x021d }
            goto L_0x00cc
        L_0x00cb:
            r0 = r5
        L_0x00cc:
            if (r8 >= r10) goto L_0x0107
            int r2 = r6.f9599f     // Catch:{ all -> 0x021d }
            if (r2 <= 0) goto L_0x0107
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x021d }
            r2.<init>()     // Catch:{ all -> 0x021d }
            java.util.HashMap r6 = r6.f9598e     // Catch:{ all -> 0x021d }
            java.util.Set r6 = r6.entrySet()     // Catch:{ all -> 0x021d }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x021d }
        L_0x00e1:
            boolean r8 = r6.hasNext()     // Catch:{ all -> 0x021d }
            if (r8 == 0) goto L_0x011f
            java.lang.Object r8 = r6.next()     // Catch:{ all -> 0x021d }
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch:{ all -> 0x021d }
            java.lang.Object r11 = r8.getValue()     // Catch:{ all -> 0x021d }
            f0.t$a r11 = (f0.t.a) r11     // Catch:{ all -> 0x021d }
            f0.r$a r11 = r11.f9600a     // Catch:{ all -> 0x021d }
            if (r11 != r4) goto L_0x00e1
            java.lang.Object r11 = r8.getKey()     // Catch:{ all -> 0x021d }
            c0.j r11 = (c0.j) r11     // Catch:{ all -> 0x021d }
            java.lang.Object r8 = r8.getValue()     // Catch:{ all -> 0x021d }
            f0.t$a r8 = (f0.t.a) r8     // Catch:{ all -> 0x021d }
            r2.put(r11, r8)     // Catch:{ all -> 0x021d }
            goto L_0x00e1
        L_0x0107:
            if (r13 != r4) goto L_0x011e
            int r2 = r6.f9599f     // Catch:{ all -> 0x021d }
            if (r2 <= 0) goto L_0x011e
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x021d }
            r2.<init>()     // Catch:{ all -> 0x021d }
            java.util.HashMap r4 = r6.f9598e     // Catch:{ all -> 0x021d }
            java.lang.Object r4 = r4.get(r12)     // Catch:{ all -> 0x021d }
            f0.t$a r4 = (f0.t.a) r4     // Catch:{ all -> 0x021d }
            r2.put(r12, r4)     // Catch:{ all -> 0x021d }
            goto L_0x011f
        L_0x011e:
            r2 = r5
        L_0x011f:
            if (r2 == 0) goto L_0x0126
            if (r15 != 0) goto L_0x0126
            r2.remove(r12)     // Catch:{ all -> 0x021d }
        L_0x0126:
            monitor-exit(r7)     // Catch:{ all -> 0x021d }
            r15 = 10
            if (r2 == 0) goto L_0x0158
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0133:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0158
            java.lang.Object r4 = r2.next()
            f0.t$a r4 = (f0.t.a) r4
            r4.getClass()
            java.util.concurrent.Executor r6 = r4.f9601b     // Catch:{ RejectedExecutionException -> 0x0152 }
            f0.t$c r4 = r4.f9603d     // Catch:{ RejectedExecutionException -> 0x0152 }
            java.util.Objects.requireNonNull(r4)     // Catch:{ RejectedExecutionException -> 0x0152 }
            d.d r7 = new d.d     // Catch:{ RejectedExecutionException -> 0x0152 }
            r7.<init>(r4, r15)     // Catch:{ RejectedExecutionException -> 0x0152 }
            r6.execute(r7)     // Catch:{ RejectedExecutionException -> 0x0152 }
            goto L_0x0133
        L_0x0152:
            java.lang.String r4 = "CameraStateRegistry"
            c0.p0.c(r4)
            goto L_0x0133
        L_0x0158:
            if (r0 == 0) goto L_0x016f
            java.util.concurrent.Executor r2 = r0.f9601b     // Catch:{ RejectedExecutionException -> 0x016a }
            f0.t$b r0 = r0.f9602c     // Catch:{ RejectedExecutionException -> 0x016a }
            java.util.Objects.requireNonNull(r0)     // Catch:{ RejectedExecutionException -> 0x016a }
            d.h r4 = new d.h     // Catch:{ RejectedExecutionException -> 0x016a }
            r4.<init>(r0, r15)     // Catch:{ RejectedExecutionException -> 0x016a }
            r2.execute(r4)     // Catch:{ RejectedExecutionException -> 0x016a }
            goto L_0x016f
        L_0x016a:
            java.lang.String r15 = "CameraStateRegistry"
            c0.p0.c(r15)
        L_0x016f:
            f0.g0<f0.r$a> r15 = r12.f15868f
            r2.p<f0.g0$b<T>> r15 = r15.f9533a
            f0.g0$b r0 = new f0.g0$b
            r0.<init>(r13)
            r15.k(r0)
            v.t0 r15 = r12.f15869n
            r15.getClass()
            int r0 = r13.ordinal()
            switch(r0) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x01b3;
                case 2: goto L_0x01ac;
                case 3: goto L_0x01ac;
                case 4: goto L_0x01a5;
                case 5: goto L_0x019e;
                case 6: goto L_0x01a5;
                case 7: goto L_0x019e;
                default: goto L_0x0187;
            }
        L_0x0187:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "Unknown internal camera state: "
            r15.append(r0)
            r15.append(r13)
            java.lang.String r13 = r15.toString()
            r14.<init>(r13)
            throw r14
        L_0x019e:
            r0 = 5
            c0.d r1 = new c0.d
            r1.<init>(r0, r14)
            goto L_0x01f0
        L_0x01a5:
            r0 = 4
            c0.d r1 = new c0.d
            r1.<init>(r0, r14)
            goto L_0x01f0
        L_0x01ac:
            r0 = 3
            c0.d r1 = new c0.d
            r1.<init>(r0, r14)
            goto L_0x01f0
        L_0x01b3:
            c0.d r0 = new c0.d
            r0.<init>(r1, r14)
        L_0x01b8:
            r1 = r0
            goto L_0x01f0
        L_0x01ba:
            f0.t r0 = r15.f15839a
            java.lang.Object r2 = r0.f9595b
            monitor-enter(r2)
            java.util.HashMap r0 = r0.f9598e     // Catch:{ all -> 0x021a }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x021a }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x021a }
        L_0x01c9:
            boolean r4 = r0.hasNext()     // Catch:{ all -> 0x021a }
            if (r4 == 0) goto L_0x01e2
            java.lang.Object r4 = r0.next()     // Catch:{ all -> 0x021a }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x021a }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x021a }
            f0.t$a r4 = (f0.t.a) r4     // Catch:{ all -> 0x021a }
            f0.r$a r4 = r4.f9600a     // Catch:{ all -> 0x021a }
            if (r4 != r3) goto L_0x01c9
            monitor-exit(r2)     // Catch:{ all -> 0x021a }
            r9 = r10
            goto L_0x01e3
        L_0x01e2:
            monitor-exit(r2)     // Catch:{ all -> 0x021a }
        L_0x01e3:
            if (r9 == 0) goto L_0x01eb
            c0.d r0 = new c0.d
            r0.<init>(r1, r5)
            goto L_0x01b8
        L_0x01eb:
            c0.d r1 = new c0.d
            r1.<init>(r10, r5)
        L_0x01f0:
            java.lang.String r0 = "CameraStateMachine"
            r1.toString()
            r13.toString()
            java.util.Objects.toString(r14)
            c0.p0.a(r0)
            r2.p<c0.q> r13 = r15.f15840b
            java.lang.Object r13 = r13.d()
            c0.q r13 = (c0.q) r13
            boolean r13 = java.util.Objects.equals(r13, r1)
            if (r13 != 0) goto L_0x0219
            java.lang.String r13 = "CameraStateMachine"
            r1.toString()
            c0.p0.a(r13)
            r2.p<c0.q> r13 = r15.f15840b
            r13.k(r1)
        L_0x0219:
            return
        L_0x021a:
            r13 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x021a }
            throw r13
        L_0x021d:
            r13 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x021d }
            throw r13
        L_0x0220:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v.u.F(int, c0.e, boolean):void");
    }

    public final void H(List list) {
        boolean z10;
        Size b10;
        boolean isEmpty = this.f15863a.b().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        Rational rational = null;
        while (true) {
            z10 = true;
            if (!it.hasNext()) {
                break;
            }
            f fVar = (f) it.next();
            if (!this.f15863a.d(fVar.d())) {
                w wVar = this.f15863a;
                String d10 = fVar.d();
                androidx.camera.core.impl.u a10 = fVar.a();
                x<?> c10 = fVar.c();
                w.a aVar = (w.a) wVar.f1410a.get(d10);
                if (aVar == null) {
                    aVar = new w.a(a10, c10);
                    wVar.f1410a.put(d10, aVar);
                }
                aVar.f1413c = true;
                arrayList.add(fVar.d());
                if (fVar.e() == t0.class && (b10 = fVar.b()) != null) {
                    rational = new Rational(b10.getWidth(), b10.getHeight());
                }
            }
        }
        if (!arrayList.isEmpty()) {
            StringBuilder q10 = android.support.v4.media.a.q("Use cases [");
            q10.append(TextUtils.join(", ", arrayList));
            q10.append("] now ATTACHED");
            s(q10.toString());
            if (isEmpty) {
                this.f15870o.q(true);
                o oVar = this.f15870o;
                synchronized (oVar.f15758d) {
                    oVar.f15769o++;
                }
            }
            p();
            L();
            K();
            D();
            if (this.f15867e == 4) {
                A();
            } else {
                int g2 = v.g(this.f15867e);
                if (g2 == 0 || g2 == 1) {
                    I(false);
                } else if (g2 != 5) {
                    StringBuilder q11 = android.support.v4.media.a.q("open() ignored due to being in state: ");
                    q11.append(v.h(this.f15867e));
                    s(q11.toString());
                } else {
                    E(7);
                    if (!x() && this.f15874s == 0) {
                        if (this.f15873r == null) {
                            z10 = false;
                        }
                        al.g0.E("Camera Device should be open if session close is not complete", z10);
                        E(4);
                        A();
                    }
                }
            }
            if (rational != null) {
                this.f15870o.f15762h.getClass();
            }
        }
    }

    public final void I(boolean z10) {
        s("Attempting to force open the camera.");
        if (!this.f15879x.d(this)) {
            s("No cameras available. Waiting for available camera before opening camera.");
            E(2);
            return;
        }
        z(z10);
    }

    public final void J(boolean z10) {
        boolean z11;
        s("Attempting to open the camera.");
        if (!this.f15877v.f15884b || !this.f15879x.d(this)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!z11) {
            s("No cameras available. Waiting for available camera before opening camera.");
            E(2);
            return;
        }
        z(z10);
    }

    public final void K() {
        boolean z10;
        w wVar = this.f15863a;
        wVar.getClass();
        u.f fVar = new u.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : wVar.f1410a.entrySet()) {
            w.a aVar = (w.a) entry.getValue();
            if (aVar.f1414d && aVar.f1413c) {
                fVar.a(aVar.f1411a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        c0.p0.a("UseCaseAttachState");
        if (!fVar.f1408j || !fVar.f1407i) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            androidx.camera.core.impl.u b10 = fVar.b();
            o oVar = this.f15870o;
            int i10 = b10.f1396f.f1359c;
            oVar.f15776v = i10;
            oVar.f15762h.f15726c = i10;
            oVar.f15768n.f15612g = i10;
            fVar.a(oVar.l());
            this.f15875t.h(fVar.b());
            return;
        }
        o oVar2 = this.f15870o;
        oVar2.f15776v = 1;
        oVar2.f15762h.f15726c = 1;
        oVar2.f15768n.f15612g = 1;
        this.f15875t.h(oVar2.l());
    }

    public final void L() {
        boolean z10 = false;
        for (x<?> I2 : this.f15863a.c()) {
            z10 |= I2.I();
        }
        this.f15870o.f15766l.f15738c = z10;
    }

    public final o a() {
        return n();
    }

    public final void b(f1 f1Var) {
        f1Var.getClass();
        this.f15865c.execute(new r(this, w(f1Var), f1Var.f4266m, f1Var.f4259f, 0));
    }

    public final CameraControl c() {
        return this.f15870o;
    }

    public final void d(f1 f1Var) {
        f1Var.getClass();
        androidx.camera.core.impl.u uVar = f1Var.f4266m;
        x<?> xVar = f1Var.f4259f;
        this.f15865c.execute(new s(this, w(f1Var), uVar, xVar, 0));
    }

    public final boolean e() {
        if (((x) a()).f() == 0) {
            return true;
        }
        return false;
    }

    public final void f(androidx.camera.core.impl.f fVar) {
        if (fVar == null) {
            fVar = n.f9564a;
        }
        n.a aVar = (n.a) fVar;
        p0 p0Var = (p0) ((androidx.camera.core.impl.r) aVar.b()).e(androidx.camera.core.impl.f.f1354c, null);
        this.D = aVar;
        synchronized (this.E) {
            this.F = p0Var;
        }
    }

    public final j0<r.a> g() {
        return this.f15868f;
    }

    public final CameraControlInternal h() {
        return this.f15870o;
    }

    public final androidx.camera.core.impl.f i() {
        return this.D;
    }

    public final void j(boolean z10) {
        this.f15865c.execute(new q(0, this, z10));
    }

    public final void k(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(G(arrayList2));
            Iterator it = new ArrayList(arrayList2).iterator();
            while (it.hasNext()) {
                f1 f1Var = (f1) it.next();
                String w9 = w(f1Var);
                if (this.C.contains(w9)) {
                    f1Var.u();
                    this.C.remove(w9);
                }
            }
            this.f15865c.execute(new n(2, this, arrayList3));
        }
    }

    public final void l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!arrayList2.isEmpty()) {
            o oVar = this.f15870o;
            synchronized (oVar.f15758d) {
                oVar.f15769o++;
            }
            Iterator it = new ArrayList(arrayList2).iterator();
            while (it.hasNext()) {
                f1 f1Var = (f1) it.next();
                String w9 = w(f1Var);
                if (!this.C.contains(w9)) {
                    this.C.add(w9);
                    f1Var.t();
                    f1Var.r();
                }
            }
            try {
                this.f15865c.execute(new p(7, this, new ArrayList(G(arrayList2))));
            } catch (RejectedExecutionException unused) {
                s("Unable to attach use cases.");
                this.f15870o.j();
            }
        }
    }

    public final /* synthetic */ boolean m() {
        return true;
    }

    public final q n() {
        return this.f15872q;
    }

    public final void o(f1 f1Var) {
        f1Var.getClass();
        this.f15865c.execute(new p(5, this, w(f1Var)));
    }

    public final void p() {
        androidx.camera.core.impl.u b10 = this.f15863a.a().b();
        androidx.camera.core.impl.g gVar = b10.f1396f;
        int size = gVar.a().size();
        int size2 = b10.b().size();
        if (b10.b().isEmpty()) {
            return;
        }
        if (gVar.a().isEmpty()) {
            if (this.f15881z == null) {
                this.f15881z = new o1(this.f15872q.f15911b, this.H, new q0(this, 1));
            }
            o1 o1Var = this.f15881z;
            if (o1Var != null) {
                String v2 = v(o1Var);
                w wVar = this.f15863a;
                o1 o1Var2 = this.f15881z;
                androidx.camera.core.impl.u uVar = o1Var2.f15786b;
                o1.b bVar = o1Var2.f15787c;
                w.a aVar = (w.a) wVar.f1410a.get(v2);
                if (aVar == null) {
                    aVar = new w.a(uVar, bVar);
                    wVar.f1410a.put(v2, aVar);
                }
                aVar.f1413c = true;
                w wVar2 = this.f15863a;
                o1 o1Var3 = this.f15881z;
                androidx.camera.core.impl.u uVar2 = o1Var3.f15786b;
                o1.b bVar2 = o1Var3.f15787c;
                w.a aVar2 = (w.a) wVar2.f1410a.get(v2);
                if (aVar2 == null) {
                    aVar2 = new w.a(uVar2, bVar2);
                    wVar2.f1410a.put(v2, aVar2);
                }
                aVar2.f1414d = true;
            }
        } else if (size2 == 1 && size == 1) {
            C();
        } else if (size >= 2) {
            C();
        } else {
            c0.p0.a("Camera2CameraImpl");
        }
    }

    public final void q() {
        boolean z10;
        boolean z11;
        if (this.f15867e == 6 || this.f15867e == 8 || (this.f15867e == 7 && this.f15874s != 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        StringBuilder q10 = android.support.v4.media.a.q("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: ");
        q10.append(v.h(this.f15867e));
        q10.append(" (error: ");
        q10.append(u(this.f15874s));
        q10.append(")");
        al.g0.E(q10.toString(), z10);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 23 && i10 < 29) {
            if (this.f15872q.n() == 2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 && this.f15874s == 0) {
                y0 y0Var = new y0(this.I);
                this.f15880y.add(y0Var);
                D();
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                f fVar = new f(1, surface, surfaceTexture);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                androidx.camera.core.impl.q L = androidx.camera.core.impl.q.L();
                Range<Integer> range = v.f1409a;
                ArrayList arrayList = new ArrayList();
                i0 c10 = i0.c();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                e0 e0Var = new e0(surface);
                c0.x xVar = c0.x.f4367d;
                d.a a10 = u.e.a(e0Var);
                a10.b(xVar);
                linkedHashSet.add(a10.a());
                s("Start configAndClose.");
                ArrayList arrayList6 = new ArrayList(linkedHashSet);
                ArrayList arrayList7 = new ArrayList(arrayList2);
                ArrayList arrayList8 = new ArrayList(arrayList3);
                ArrayList arrayList9 = new ArrayList(arrayList5);
                ArrayList arrayList10 = new ArrayList(arrayList4);
                ArrayList arrayList11 = new ArrayList(hashSet);
                androidx.camera.core.impl.r K = androidx.camera.core.impl.r.K(L);
                ArrayList arrayList12 = new ArrayList(arrayList);
                u0 u0Var = u0.f9604b;
                ArrayMap arrayMap = new ArrayMap();
                for (String next : c10.b()) {
                    ArrayList arrayList13 = arrayList8;
                    arrayMap.put(next, c10.a(next));
                    arrayList9 = arrayList9;
                    arrayList8 = arrayList13;
                }
                ArrayList arrayList14 = arrayList8;
                androidx.camera.core.impl.r rVar = K;
                androidx.camera.core.impl.u uVar = new androidx.camera.core.impl.u(arrayList6, arrayList7, arrayList14, arrayList9, arrayList10, new androidx.camera.core.impl.g(arrayList11, rVar, 1, range, arrayList12, false, new u0(arrayMap), (f0.k) null), (InputConfiguration) null);
                CameraDevice cameraDevice = this.f15873r;
                cameraDevice.getClass();
                y0Var.d(uVar, cameraDevice, this.B.a()).b(new r(this, y0Var, e0Var, fVar, 1), this.f15865c);
                this.f15875t.b();
            }
        }
        D();
        this.f15875t.b();
    }

    public final CameraDevice.StateCallback r() {
        ArrayList arrayList = new ArrayList(this.f15863a.a().b().f1392b);
        arrayList.add(this.A.f15595f);
        arrayList.add(this.f15871p);
        if (arrayList.isEmpty()) {
            return new r0();
        }
        if (arrayList.size() == 1) {
            return (CameraDevice.StateCallback) arrayList.get(0);
        }
        return new q0(arrayList);
    }

    public final void s(String str) {
        String.format("{%s} %s", new Object[]{toString(), str});
        c0.p0.e(3, c0.p0.f("Camera2CameraImpl"));
    }

    public final void t() {
        boolean z10;
        if (this.f15867e == 8 || this.f15867e == 6) {
            z10 = true;
        } else {
            z10 = false;
        }
        al.g0.E((String) null, z10);
        al.g0.E((String) null, this.f15876u.isEmpty());
        this.f15873r = null;
        if (this.f15867e == 6) {
            E(1);
            return;
        }
        this.f15864b.f16259a.a(this.f15877v);
        E(9);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.f15872q.f15910a});
    }

    public final boolean x() {
        if (!this.f15876u.isEmpty() || !this.f15880y.isEmpty()) {
            return false;
        }
        return true;
    }

    public final a1 y() {
        synchronized (this.E) {
            if (this.F == null) {
                y0 y0Var = new y0(this.I);
                return y0Var;
            }
            r1 r1Var = new r1(this.F, this.f15872q, this.I, this.f15865c, this.f15866d);
            return r1Var;
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void z(boolean z10) {
        if (!z10) {
            this.f15871p.f15892e.f15894a = -1;
        }
        this.f15871p.a();
        s("Opening camera.");
        E(3);
        try {
            z zVar = this.f15864b;
            zVar.f16259a.b(this.f15872q.f15910a, this.f15865c, r());
        } catch (CameraAccessExceptionCompat e10) {
            StringBuilder q10 = android.support.v4.media.a.q("Unable to open camera due to ");
            q10.append(e10.getMessage());
            s(q10.toString());
            if (e10.f1276a == 10001) {
                F(1, new c0.e(7, e10), true);
            }
        } catch (SecurityException e11) {
            StringBuilder q11 = android.support.v4.media.a.q("Unable to open camera due to ");
            q11.append(e11.getMessage());
            s(q11.toString());
            E(7);
            this.f15871p.b();
        }
    }
}
