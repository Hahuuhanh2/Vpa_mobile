package v;

import al.g0;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Range;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.v;
import c0.p0;
import c0.x;
import f0.f;
import f0.i0;
import f0.k;
import f0.u0;
import i0.d;
import i0.f;
import i0.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import v.u1;
import z.o;
import z.q;
import z0.b;

/* compiled from: CaptureSession */
public final class y0 implements a1 {

    /* renamed from: a  reason: collision with root package name */
    public final Object f15940a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15941b;

    /* renamed from: c  reason: collision with root package name */
    public final a f15942c;

    /* renamed from: d  reason: collision with root package name */
    public final c f15943d;

    /* renamed from: e  reason: collision with root package name */
    public a2 f15944e;

    /* renamed from: f  reason: collision with root package name */
    public u1 f15945f;

    /* renamed from: g  reason: collision with root package name */
    public u f15946g;

    /* renamed from: h  reason: collision with root package name */
    public r f15947h;

    /* renamed from: i  reason: collision with root package name */
    public u.c f15948i;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f15949j;

    /* renamed from: k  reason: collision with root package name */
    public List<DeferrableSurface> f15950k;

    /* renamed from: l  reason: collision with root package name */
    public int f15951l;

    /* renamed from: m  reason: collision with root package name */
    public b.d f15952m;

    /* renamed from: n  reason: collision with root package name */
    public b.a<Void> f15953n;

    /* renamed from: o  reason: collision with root package name */
    public Map<DeferrableSurface, Long> f15954o;

    /* renamed from: p  reason: collision with root package name */
    public final o f15955p;

    /* renamed from: q  reason: collision with root package name */
    public final q f15956q;

    /* renamed from: r  reason: collision with root package name */
    public final x.b f15957r;

    /* compiled from: CaptureSession */
    public class a extends CameraCaptureSession.CaptureCallback {
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
        }
    }

    /* compiled from: CaptureSession */
    public class b implements i0.c<Void> {
        public b() {
        }

        public final void a(Throwable th2) {
            synchronized (y0.this.f15940a) {
                try {
                    y0.this.f15944e.f15575a.stop();
                    int g2 = v.g(y0.this.f15951l);
                    if (g2 == 3 || g2 == 5 || g2 == 6) {
                        if (!(th2 instanceof CancellationException)) {
                            int i10 = y0.this.f15951l;
                            p0.h("CaptureSession");
                            y0.this.j();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* compiled from: CaptureSession */
    public final class c extends u1.a {
        public c() {
        }

        public final void n(u1 u1Var) {
            synchronized (y0.this.f15940a) {
                try {
                    switch (v.g(y0.this.f15951l)) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                            throw new IllegalStateException("onConfigureFailed() should not be possible in state: " + v.i(y0.this.f15951l));
                        case 3:
                        case 5:
                        case 6:
                            y0.this.j();
                            break;
                        case 7:
                            p0.a("CaptureSession");
                            break;
                    }
                    int i10 = y0.this.f15951l;
                    p0.b("CaptureSession");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void o(x1 x1Var) {
            synchronized (y0.this.f15940a) {
                try {
                    switch (v.g(y0.this.f15951l)) {
                        case 0:
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                            throw new IllegalStateException("onConfigured() should not be possible in state: " + v.i(y0.this.f15951l));
                        case 3:
                            y0 y0Var = y0.this;
                            y0Var.f15951l = 5;
                            y0Var.f15945f = x1Var;
                            if (y0Var.f15946g != null) {
                                u.c cVar = y0Var.f15948i;
                                cVar.getClass();
                                List<u.b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar.f9547a));
                                ArrayList arrayList = new ArrayList();
                                for (u.b add : unmodifiableList) {
                                    arrayList.add(add);
                                }
                                ArrayList arrayList2 = new ArrayList();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    ((u.b) it.next()).getClass();
                                }
                                if (!arrayList2.isEmpty()) {
                                    y0 y0Var2 = y0.this;
                                    y0Var2.l(y0Var2.p(arrayList2));
                                }
                            }
                            p0.a("CaptureSession");
                            y0 y0Var3 = y0.this;
                            y0Var3.n(y0Var3.f15946g);
                            y0.this.m();
                            break;
                        case 5:
                            y0.this.f15945f = x1Var;
                            break;
                        case 6:
                            x1Var.close();
                            break;
                    }
                    int i10 = y0.this.f15951l;
                    p0.a("CaptureSession");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void p(x1 x1Var) {
            synchronized (y0.this.f15940a) {
                try {
                    if (v.g(y0.this.f15951l) != 0) {
                        int i10 = y0.this.f15951l;
                        p0.a("CaptureSession");
                    } else {
                        throw new IllegalStateException("onReady() should not be possible in state: " + v.i(y0.this.f15951l));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void q(u1 u1Var) {
            synchronized (y0.this.f15940a) {
                try {
                    if (y0.this.f15951l != 1) {
                        p0.a("CaptureSession");
                        y0.this.j();
                    } else {
                        throw new IllegalStateException("onSessionFinished() should not be possible in state: " + v.i(y0.this.f15951l));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public y0(x.b bVar) {
        this.f15940a = new Object();
        this.f15941b = new ArrayList();
        this.f15942c = new a();
        this.f15947h = r.G;
        this.f15948i = new u.c(new u.b[0]);
        this.f15949j = new HashMap();
        this.f15950k = Collections.emptyList();
        this.f15951l = 1;
        this.f15954o = new HashMap();
        this.f15955p = new o();
        this.f15956q = new q();
        this.f15951l = 2;
        this.f15957r = bVar;
        this.f15943d = new c();
    }

    public static y i(List list, CameraCaptureSession.CaptureCallback... captureCallbackArr) {
        Object obj;
        ArrayList arrayList = new ArrayList(list.size() + captureCallbackArr.length);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            if (fVar == null) {
                obj = null;
            } else {
                ArrayList arrayList2 = new ArrayList();
                w0.a(fVar, arrayList2);
                if (arrayList2.size() == 1) {
                    obj = (CameraCaptureSession.CaptureCallback) arrayList2.get(0);
                } else {
                    obj = new y(arrayList2);
                }
            }
            arrayList.add(obj);
        }
        Collections.addAll(arrayList, captureCallbackArr);
        return new y(arrayList);
    }

    public static androidx.camera.core.impl.q o(ArrayList arrayList) {
        androidx.camera.core.impl.q L = androidx.camera.core.impl.q.L();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i iVar = ((g) it.next()).f1358b;
            for (i.a next : iVar.d()) {
                Object obj = null;
                Object e10 = iVar.e(next, null);
                if (L.c(next)) {
                    try {
                        obj = L.a(next);
                    } catch (IllegalArgumentException unused) {
                    }
                    if (!Objects.equals(obj, e10)) {
                        next.b();
                        Objects.toString(e10);
                        Objects.toString(obj);
                        p0.a("CaptureSession");
                    }
                } else {
                    L.O(next, e10);
                }
            }
        }
        return L;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        r1 = r4.f15948i;
        r1.getClass();
        r1 = java.util.Collections.unmodifiableList(new java.util.ArrayList(r1.f9547a));
        r2 = new java.util.ArrayList();
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r1.hasNext() == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        r2.add((u.b) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        r1 = r2.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r1.hasNext() == false) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        ((u.b) r1.next()).getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0056, code lost:
        r4.f15951l = 7;
        r1 = r4.f15944e;
        al.g0.D(r1, "The Opener shouldn't null in state:" + v.v.i(r4.f15951l));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007d, code lost:
        if (r4.f15944e.f15575a.stop() == false) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007f, code lost:
        j();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0085, code lost:
        if (r4.f15952m != null) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0087, code lost:
        r4.f15952m = z0.b.a(new ca.a(r4, 2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        r1 = r4.f15952m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ba, code lost:
        r4.f15951l = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e2, code lost:
        return i0.f.c((java.lang.Object) null);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final v8.a a() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f15940a
            monitor-enter(r0)
            int r1 = r4.f15951l     // Catch:{ all -> 0x0016 }
            int r1 = v.v.g(r1)     // Catch:{ all -> 0x0016 }
            switch(r1) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x00ba;
                case 2: goto L_0x0097;
                case 3: goto L_0x0019;
                case 4: goto L_0x000e;
                case 5: goto L_0x000e;
                case 6: goto L_0x0083;
                default: goto L_0x000c;
            }     // Catch:{ all -> 0x0016 }
        L_0x000c:
            goto L_0x00dc
        L_0x000e:
            v.u1 r1 = r4.f15945f     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0019
            r1.close()     // Catch:{ all -> 0x0016 }
            goto L_0x0019
        L_0x0016:
            r1 = move-exception
            goto L_0x00e3
        L_0x0019:
            u.c r1 = r4.f15948i     // Catch:{ all -> 0x0016 }
            r1.getClass()     // Catch:{ all -> 0x0016 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0016 }
            java.util.HashSet r1 = r1.f9547a     // Catch:{ all -> 0x0016 }
            r2.<init>(r1)     // Catch:{ all -> 0x0016 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0016 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0016 }
            r2.<init>()     // Catch:{ all -> 0x0016 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0016 }
        L_0x0032:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0042
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0016 }
            u.b r3 = (u.b) r3     // Catch:{ all -> 0x0016 }
            r2.add(r3)     // Catch:{ all -> 0x0016 }
            goto L_0x0032
        L_0x0042:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x0016 }
        L_0x0046:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0016 }
            if (r2 == 0) goto L_0x0056
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0016 }
            u.b r2 = (u.b) r2     // Catch:{ all -> 0x0016 }
            r2.getClass()     // Catch:{ all -> 0x0016 }
            goto L_0x0046
        L_0x0056:
            r1 = 7
            r4.f15951l = r1     // Catch:{ all -> 0x0016 }
            v.a2 r1 = r4.f15944e     // Catch:{ all -> 0x0016 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r2.<init>()     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = "The Opener shouldn't null in state:"
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            int r3 = r4.f15951l     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = v.v.i(r3)     // Catch:{ all -> 0x0016 }
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            al.g0.D(r1, r2)     // Catch:{ all -> 0x0016 }
            v.a2 r1 = r4.f15944e     // Catch:{ all -> 0x0016 }
            v.a2$b r1 = r1.f15575a     // Catch:{ all -> 0x0016 }
            boolean r1 = r1.stop()     // Catch:{ all -> 0x0016 }
            if (r1 == 0) goto L_0x0083
            r4.j()     // Catch:{ all -> 0x0016 }
            goto L_0x00dc
        L_0x0083:
            z0.b$d r1 = r4.f15952m     // Catch:{ all -> 0x0016 }
            if (r1 != 0) goto L_0x0093
            ca.a r1 = new ca.a     // Catch:{ all -> 0x0016 }
            r2 = 2
            r1.<init>(r4, r2)     // Catch:{ all -> 0x0016 }
            z0.b$d r1 = z0.b.a(r1)     // Catch:{ all -> 0x0016 }
            r4.f15952m = r1     // Catch:{ all -> 0x0016 }
        L_0x0093:
            z0.b$d r1 = r4.f15952m     // Catch:{ all -> 0x0016 }
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            return r1
        L_0x0097:
            v.a2 r1 = r4.f15944e     // Catch:{ all -> 0x0016 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r2.<init>()     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = "The Opener shouldn't null in state:"
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            int r3 = r4.f15951l     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = v.v.i(r3)     // Catch:{ all -> 0x0016 }
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            al.g0.D(r1, r2)     // Catch:{ all -> 0x0016 }
            v.a2 r1 = r4.f15944e     // Catch:{ all -> 0x0016 }
            v.a2$b r1 = r1.f15575a     // Catch:{ all -> 0x0016 }
            r1.stop()     // Catch:{ all -> 0x0016 }
        L_0x00ba:
            r1 = 8
            r4.f15951l = r1     // Catch:{ all -> 0x0016 }
            goto L_0x00dc
        L_0x00bf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0016 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0016 }
            r2.<init>()     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = "release() should not be possible in state: "
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            int r3 = r4.f15951l     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = v.v.i(r3)     // Catch:{ all -> 0x0016 }
            r2.append(r3)     // Catch:{ all -> 0x0016 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0016 }
            r1.<init>(r2)     // Catch:{ all -> 0x0016 }
            throw r1     // Catch:{ all -> 0x0016 }
        L_0x00dc:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            r0 = 0
            i0.i$c r0 = i0.f.c(r0)
            return r0
        L_0x00e3:
            monitor-exit(r0)     // Catch:{ all -> 0x0016 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v.y0.a():v8.a");
    }

    public final void b() {
        ArrayList<g> arrayList;
        synchronized (this.f15940a) {
            if (!this.f15941b.isEmpty()) {
                arrayList = new ArrayList<>(this.f15941b);
                this.f15941b.clear();
            } else {
                arrayList = null;
            }
        }
        if (arrayList != null) {
            for (g gVar : arrayList) {
                for (f a10 : gVar.f1361e) {
                    a10.a();
                }
            }
        }
    }

    public final void c(HashMap hashMap) {
        synchronized (this.f15940a) {
            this.f15954o = hashMap;
        }
    }

    public final void close() {
        synchronized (this.f15940a) {
            try {
                int g2 = v.g(this.f15951l);
                if (g2 != 0) {
                    if (g2 != 1) {
                        if (g2 != 2) {
                            if (g2 != 3) {
                                if (g2 == 4) {
                                    if (this.f15946g != null) {
                                        u.c cVar = this.f15948i;
                                        cVar.getClass();
                                        List<u.b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar.f9547a));
                                        ArrayList arrayList = new ArrayList();
                                        for (u.b add : unmodifiableList) {
                                            arrayList.add(add);
                                        }
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            ((u.b) it.next()).getClass();
                                        }
                                        if (!arrayList2.isEmpty()) {
                                            f(p(arrayList2));
                                        }
                                    }
                                }
                            }
                            a2 a2Var = this.f15944e;
                            g0.D(a2Var, "The Opener shouldn't null in state:" + v.i(this.f15951l));
                            this.f15944e.f15575a.stop();
                            this.f15951l = 6;
                            this.f15946g = null;
                        } else {
                            a2 a2Var2 = this.f15944e;
                            g0.D(a2Var2, "The Opener shouldn't null in state:" + v.i(this.f15951l));
                            this.f15944e.f15575a.stop();
                        }
                    }
                    this.f15951l = 8;
                } else {
                    throw new IllegalStateException("close() should not be possible in state: " + v.i(this.f15951l));
                }
            } catch (IllegalStateException unused) {
                p0.c("CaptureSession");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final v8.a<Void> d(u uVar, CameraDevice cameraDevice, a2 a2Var) {
        synchronized (this.f15940a) {
            try {
                if (v.g(this.f15951l) != 1) {
                    p0.b("CaptureSession");
                    i.a aVar = new i.a(new IllegalStateException("open() should not allow the state: " + v.i(this.f15951l)));
                    return aVar;
                }
                this.f15951l = 3;
                ArrayList arrayList = new ArrayList(uVar.b());
                this.f15950k = arrayList;
                this.f15944e = a2Var;
                d d10 = d.a(a2Var.f15575a.c(arrayList)).d(new x0(this, uVar, cameraDevice), ((x1) this.f15944e.f15575a).f15927d);
                b bVar = new b();
                d10.b(new f.b(d10, bVar), ((x1) this.f15944e.f15575a).f15927d);
                v8.a<Void> d11 = i0.f.d(d10);
                return d11;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final List<g> e() {
        List<g> unmodifiableList;
        synchronized (this.f15940a) {
            unmodifiableList = Collections.unmodifiableList(this.f15941b);
        }
        return unmodifiableList;
    }

    public final void f(List<g> list) {
        synchronized (this.f15940a) {
            try {
                switch (v.g(this.f15951l)) {
                    case 0:
                        throw new IllegalStateException("issueCaptureRequests() should not be possible in state: " + v.i(this.f15951l));
                    case 1:
                    case 2:
                    case 3:
                        this.f15941b.addAll(list);
                        break;
                    case 4:
                        this.f15941b.addAll(list);
                        m();
                        break;
                    case 5:
                    case 6:
                    case 7:
                        throw new IllegalStateException("Cannot issue capture request on a closed/released session.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final u g() {
        u uVar;
        synchronized (this.f15940a) {
            uVar = this.f15946g;
        }
        return uVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0060, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(androidx.camera.core.impl.u r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f15940a
            monitor-enter(r0)
            int r1 = r3.f15951l     // Catch:{ all -> 0x0015 }
            int r1 = v.v.g(r1)     // Catch:{ all -> 0x0015 }
            switch(r1) {
                case 0: goto L_0x0042;
                case 1: goto L_0x003f;
                case 2: goto L_0x003f;
                case 3: goto L_0x003f;
                case 4: goto L_0x0017;
                case 5: goto L_0x000d;
                case 6: goto L_0x000d;
                case 7: goto L_0x000d;
                default: goto L_0x000c;
            }     // Catch:{ all -> 0x0015 }
        L_0x000c:
            goto L_0x005f
        L_0x000d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = "Session configuration cannot be set on a closed/released session."
            r4.<init>(r1)     // Catch:{ all -> 0x0015 }
            throw r4     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r4 = move-exception
            goto L_0x0061
        L_0x0017:
            r3.f15946g = r4     // Catch:{ all -> 0x0015 }
            if (r4 != 0) goto L_0x001d
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x001d:
            java.util.HashMap r1 = r3.f15949j     // Catch:{ all -> 0x0015 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0015 }
            java.util.List r4 = r4.b()     // Catch:{ all -> 0x0015 }
            boolean r4 = r1.containsAll(r4)     // Catch:{ all -> 0x0015 }
            if (r4 != 0) goto L_0x0034
            java.lang.String r4 = "CaptureSession"
            c0.p0.b(r4)     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0034:
            java.lang.String r4 = "CaptureSession"
            c0.p0.a(r4)     // Catch:{ all -> 0x0015 }
            androidx.camera.core.impl.u r4 = r3.f15946g     // Catch:{ all -> 0x0015 }
            r3.n(r4)     // Catch:{ all -> 0x0015 }
            goto L_0x005f
        L_0x003f:
            r3.f15946g = r4     // Catch:{ all -> 0x0015 }
            goto L_0x005f
        L_0x0042:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0015 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0015 }
            r1.<init>()     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = "setSessionConfig() should not be possible in state: "
            r1.append(r2)     // Catch:{ all -> 0x0015 }
            int r2 = r3.f15951l     // Catch:{ all -> 0x0015 }
            java.lang.String r2 = v.v.i(r2)     // Catch:{ all -> 0x0015 }
            r1.append(r2)     // Catch:{ all -> 0x0015 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0015 }
            r4.<init>(r1)     // Catch:{ all -> 0x0015 }
            throw r4     // Catch:{ all -> 0x0015 }
        L_0x005f:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            return
        L_0x0061:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v.y0.h(androidx.camera.core.impl.u):void");
    }

    public final void j() {
        if (this.f15951l == 8) {
            p0.a("CaptureSession");
            return;
        }
        this.f15951l = 8;
        this.f15945f = null;
        b.a<Void> aVar = this.f15953n;
        if (aVar != null) {
            aVar.a(null);
            this.f15953n = null;
        }
    }

    public final x.f k(u.e eVar, HashMap hashMap, String str) {
        boolean z10;
        Surface surface = (Surface) hashMap.get(eVar.e());
        g0.D(surface, "Surface in OutputConfig not found in configuredSurfaceMap.");
        x.f fVar = new x.f(eVar.f(), surface);
        if (str != null) {
            fVar.f16828a.f(str);
        } else {
            fVar.f16828a.f(eVar.c());
        }
        if (!eVar.d().isEmpty()) {
            fVar.f16828a.e();
            for (DeferrableSurface deferrableSurface : eVar.d()) {
                Surface surface2 = (Surface) hashMap.get(deferrableSurface);
                g0.D(surface2, "Surface in OutputConfig not found in configuredSurfaceMap.");
                fVar.f16828a.b(surface2);
            }
        }
        long j10 = 1;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            x.b bVar = this.f15957r;
            bVar.getClass();
            if (i10 >= 33) {
                z10 = true;
            } else {
                z10 = false;
            }
            g0.E("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.", z10);
            DynamicRangeProfiles a10 = bVar.f16822a.a();
            if (a10 != null) {
                x b10 = eVar.b();
                Long a11 = x.a.a(b10, a10);
                if (a11 == null) {
                    Objects.toString(b10);
                    p0.b("CaptureSession");
                } else {
                    j10 = a11.longValue();
                }
            }
        }
        fVar.f16828a.c(j10);
        return fVar;
    }

    public final void l(ArrayList arrayList) {
        boolean z10;
        k kVar;
        synchronized (this.f15940a) {
            if (this.f15951l != 5) {
                p0.a("CaptureSession");
            } else if (!arrayList.isEmpty()) {
                try {
                    n0 n0Var = new n0();
                    ArrayList arrayList2 = new ArrayList();
                    p0.a("CaptureSession");
                    Iterator it = arrayList.iterator();
                    boolean z11 = false;
                    while (it.hasNext()) {
                        g gVar = (g) it.next();
                        if (gVar.a().isEmpty()) {
                            p0.a("CaptureSession");
                        } else {
                            Iterator<DeferrableSurface> it2 = gVar.a().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z10 = true;
                                    break;
                                }
                                DeferrableSurface next = it2.next();
                                if (!this.f15949j.containsKey(next)) {
                                    Objects.toString(next);
                                    p0.a("CaptureSession");
                                    z10 = false;
                                    break;
                                }
                            }
                            if (z10) {
                                if (gVar.f1359c == 2) {
                                    z11 = true;
                                }
                                g.a aVar = new g.a(gVar);
                                if (gVar.f1359c == 5 && (kVar = gVar.f1364h) != null) {
                                    aVar.f1372h = kVar;
                                }
                                u uVar = this.f15946g;
                                if (uVar != null) {
                                    aVar.c(uVar.f1396f.f1358b);
                                }
                                aVar.c(this.f15947h);
                                aVar.c(gVar.f1358b);
                                CaptureRequest b10 = i0.b(aVar.d(), this.f15945f.g(), this.f15949j);
                                if (b10 == null) {
                                    p0.a("CaptureSession");
                                    return;
                                }
                                ArrayList arrayList3 = new ArrayList();
                                for (f0.f a10 : gVar.f1361e) {
                                    w0.a(a10, arrayList3);
                                }
                                n0Var.a(b10, arrayList3);
                                arrayList2.add(b10);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        if (this.f15955p.a(arrayList2, z11)) {
                            this.f15945f.a();
                            n0Var.f15754b = new ea.c(this, 3);
                        }
                        if (this.f15956q.b(arrayList2, z11)) {
                            n0Var.a((CaptureRequest) arrayList2.get(arrayList2.size() - 1), Collections.singletonList(new z0(this)));
                        }
                        this.f15945f.j(arrayList2, n0Var);
                        return;
                    }
                    p0.a("CaptureSession");
                } catch (CameraAccessException e10) {
                    e10.getMessage();
                    p0.b("CaptureSession");
                    Thread.dumpStack();
                }
            }
        }
    }

    public final void m() {
        if (!this.f15941b.isEmpty()) {
            try {
                l(this.f15941b);
            } finally {
                this.f15941b.clear();
            }
        }
    }

    public final void n(u uVar) {
        synchronized (this.f15940a) {
            if (uVar == null) {
                p0.a("CaptureSession");
            } else if (this.f15951l != 5) {
                p0.a("CaptureSession");
            } else {
                g gVar = uVar.f1396f;
                if (gVar.a().isEmpty()) {
                    p0.a("CaptureSession");
                    try {
                        this.f15945f.a();
                    } catch (CameraAccessException e10) {
                        e10.getMessage();
                        p0.b("CaptureSession");
                        Thread.dumpStack();
                    }
                } else {
                    try {
                        p0.a("CaptureSession");
                        g.a aVar = new g.a(gVar);
                        u.c cVar = this.f15948i;
                        cVar.getClass();
                        List<u.b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar.f9547a));
                        ArrayList arrayList = new ArrayList();
                        for (u.b add : unmodifiableList) {
                            arrayList.add(add);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((u.b) it.next()).getClass();
                        }
                        androidx.camera.core.impl.q o10 = o(arrayList2);
                        this.f15947h = o10;
                        aVar.c(o10);
                        CaptureRequest b10 = i0.b(aVar.d(), this.f15945f.g(), this.f15949j);
                        if (b10 == null) {
                            p0.a("CaptureSession");
                            return;
                        }
                        this.f15945f.h(b10, i(gVar.f1361e, this.f15942c));
                    } catch (CameraAccessException e11) {
                        e11.getMessage();
                        p0.b("CaptureSession");
                        Thread.dumpStack();
                    }
                }
            }
        }
    }

    public final ArrayList p(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            HashSet hashSet = new HashSet();
            androidx.camera.core.impl.q.L();
            Range<Integer> range = v.f1409a;
            ArrayList arrayList3 = new ArrayList();
            i0.c();
            hashSet.addAll(gVar.f1357a);
            androidx.camera.core.impl.q M = androidx.camera.core.impl.q.M(gVar.f1358b);
            Range<Integer> range2 = gVar.f1360d;
            arrayList3.addAll(gVar.f1361e);
            boolean z10 = gVar.f1362f;
            u0 u0Var = gVar.f1363g;
            ArrayMap arrayMap = new ArrayMap();
            for (String next : u0Var.b()) {
                arrayMap.put(next, u0Var.a(next));
            }
            i0 i0Var = new i0(arrayMap);
            for (DeferrableSurface add : this.f15946g.f1396f.a()) {
                hashSet.add(add);
            }
            ArrayList arrayList4 = new ArrayList(hashSet);
            r K = r.K(M);
            ArrayList arrayList5 = new ArrayList(arrayList3);
            u0 u0Var2 = u0.f9604b;
            ArrayMap arrayMap2 = new ArrayMap();
            for (String next2 : i0Var.b()) {
                arrayMap2.put(next2, i0Var.a(next2));
            }
            arrayList2.add(new g(arrayList4, K, 1, range2, arrayList5, z10, new u0(arrayMap2), (k) null));
        }
        return arrayList2;
    }
}
