package v;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Looper;
import android.util.ArrayMap;
import androidx.appcompat.app.p;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.u;
import b0.f;
import c0.p0;
import c0.q0;
import d.d;
import f0.f;
import f0.k;
import f0.u0;
import h0.g;
import i0.i;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import u.a;
import v.u;
import w.t;
import z0.b;

/* compiled from: Camera2CameraControlImpl */
public final class o implements CameraControlInternal {

    /* renamed from: b  reason: collision with root package name */
    public final b f15756b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f15757c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15758d = new Object();

    /* renamed from: e  reason: collision with root package name */
    public final t f15759e;

    /* renamed from: f  reason: collision with root package name */
    public final CameraControlInternal.b f15760f;

    /* renamed from: g  reason: collision with root package name */
    public final u.b f15761g;

    /* renamed from: h  reason: collision with root package name */
    public final k1 f15762h;

    /* renamed from: i  reason: collision with root package name */
    public final g2 f15763i;

    /* renamed from: j  reason: collision with root package name */
    public final f2 f15764j;

    /* renamed from: k  reason: collision with root package name */
    public final f1 f15765k;

    /* renamed from: l  reason: collision with root package name */
    public l2 f15766l;

    /* renamed from: m  reason: collision with root package name */
    public final b0.c f15767m;

    /* renamed from: n  reason: collision with root package name */
    public final c0 f15768n;

    /* renamed from: o  reason: collision with root package name */
    public int f15769o;

    /* renamed from: p  reason: collision with root package name */
    public volatile boolean f15770p;

    /* renamed from: q  reason: collision with root package name */
    public volatile int f15771q;

    /* renamed from: r  reason: collision with root package name */
    public final z.a f15772r;

    /* renamed from: s  reason: collision with root package name */
    public final z.b f15773s;

    /* renamed from: t  reason: collision with root package name */
    public final AtomicLong f15774t;

    /* renamed from: u  reason: collision with root package name */
    public volatile v8.a<Void> f15775u;

    /* renamed from: v  reason: collision with root package name */
    public int f15776v;

    /* renamed from: w  reason: collision with root package name */
    public long f15777w;

    /* renamed from: x  reason: collision with root package name */
    public final a f15778x;

    /* compiled from: Camera2CameraControlImpl */
    public static final class a extends f {

        /* renamed from: a  reason: collision with root package name */
        public HashSet f15779a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public ArrayMap f15780b = new ArrayMap();

        public final void a() {
            Iterator it = this.f15779a.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                try {
                    ((Executor) this.f15780b.get(fVar)).execute(new d(fVar, 4));
                } catch (RejectedExecutionException unused) {
                    p0.c("Camera2CameraControlImp");
                }
            }
        }

        public final void b(k kVar) {
            Iterator it = this.f15779a.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                try {
                    ((Executor) this.f15780b.get(fVar)).execute(new n(0, fVar, kVar));
                } catch (RejectedExecutionException unused) {
                    p0.c("Camera2CameraControlImp");
                }
            }
        }

        public final void c(j7.a aVar) {
            Iterator it = this.f15779a.iterator();
            while (it.hasNext()) {
                f fVar = (f) it.next();
                try {
                    ((Executor) this.f15780b.get(fVar)).execute(new p(3, fVar, aVar));
                } catch (RejectedExecutionException unused) {
                    p0.c("Camera2CameraControlImp");
                }
            }
        }
    }

    /* compiled from: Camera2CameraControlImpl */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int f15781c = 0;

        /* renamed from: a  reason: collision with root package name */
        public final HashSet f15782a = new HashSet();

        /* renamed from: b  reason: collision with root package name */
        public final Executor f15783b;

        public b(g gVar) {
            this.f15783b = gVar;
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.f15783b.execute(new p(4, this, totalCaptureResult));
        }
    }

    /* compiled from: Camera2CameraControlImpl */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public o(t tVar, g gVar, u.d dVar, z.d dVar2) {
        u.b bVar = new u.b();
        this.f15761g = bVar;
        this.f15769o = 0;
        this.f15770p = false;
        this.f15771q = 2;
        this.f15774t = new AtomicLong(0);
        this.f15775u = i0.f.c((Object) null);
        this.f15776v = 1;
        this.f15777w = 0;
        a aVar = new a();
        this.f15778x = aVar;
        this.f15759e = tVar;
        this.f15760f = dVar;
        this.f15757c = gVar;
        b bVar2 = new b(gVar);
        this.f15756b = bVar2;
        bVar.f1399b.f1367c = this.f15776v;
        bVar.f1399b.b(new v0(bVar2));
        bVar.f1399b.b(aVar);
        this.f15765k = new f1(this);
        this.f15762h = new k1(this);
        this.f15763i = new g2(this, tVar);
        this.f15764j = new f2(this, tVar, gVar);
        this.f15766l = new l2(tVar);
        this.f15772r = new z.a(dVar2);
        this.f15773s = new z.b(dVar2);
        this.f15767m = new b0.c(this, gVar);
        this.f15768n = new c0(this, tVar, dVar2, gVar);
        gVar.execute(new k(this, 0));
    }

    public static boolean o(int[] iArr, int i10) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean p(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        if (!(tag instanceof u0) || (l10 = (Long) ((u0) tag).a("CameraControlSessionUpdateId")) == null || l10.longValue() < j10) {
            return false;
        }
        return true;
    }

    public final void a(i iVar) {
        b0.c cVar = this.f15767m;
        b0.f c10 = f.a.d(iVar).c();
        synchronized (cVar.f3866e) {
            try {
                for (i.a next : c10.b().d()) {
                    cVar.f3867f.f15025a.O(next, c10.b().a(next));
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        i0.f.d(z0.b.a(new ea.c(cVar, 4))).b(new l(0), j7.a.x());
    }

    public final Rect b() {
        Rect rect = (Rect) this.f15759e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    public final void c(int i10) {
        int i11;
        boolean z10;
        synchronized (this.f15758d) {
            i11 = this.f15769o;
        }
        boolean z11 = true;
        if (i11 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            p0.g("Camera2CameraControlImp");
            return;
        }
        this.f15771q = i10;
        l2 l2Var = this.f15766l;
        if (!(this.f15771q == 1 || this.f15771q == 0)) {
            z11 = false;
        }
        l2Var.f15739d = z11;
        this.f15775u = i0.f.d(z0.b.a(new q0(this, 0)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(androidx.camera.core.impl.u.b r12) {
        /*
            r11 = this;
            v.l2 r0 = r11.f15766l
            m0.b r1 = r0.f15737b
        L_0x0004:
            java.lang.Object r2 = r1.f13043b
            monitor-enter(r2)
            java.util.ArrayDeque<androidx.camera.core.d> r3 = r1.f13042a     // Catch:{ all -> 0x0184 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x0184 }
            monitor-exit(r2)     // Catch:{ all -> 0x0184 }
            if (r3 != 0) goto L_0x0023
            java.lang.Object r2 = r1.f13043b
            monitor-enter(r2)
            java.util.ArrayDeque<androidx.camera.core.d> r3 = r1.f13042a     // Catch:{ all -> 0x0020 }
            java.lang.Object r3 = r3.removeLast()     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.d r3 = (androidx.camera.core.d) r3
            r3.close()
            goto L_0x0004
        L_0x0020:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0020 }
            throw r12
        L_0x0023:
            f0.e0 r1 = r0.f15744i
            r2 = 0
            if (r1 == 0) goto L_0x0044
            androidx.camera.core.f r3 = r0.f15742g
            if (r3 == 0) goto L_0x003f
            v8.a r4 = r1.d()
            d.h r5 = new d.h
            r6 = 6
            r5.<init>(r3, r6)
            h0.b r3 = j7.a.f0()
            r4.b(r5, r3)
            r0.f15742g = r2
        L_0x003f:
            r1.a()
            r0.f15744i = r2
        L_0x0044:
            android.media.ImageWriter r1 = r0.f15745j
            if (r1 == 0) goto L_0x004d
            r1.close()
            r0.f15745j = r2
        L_0x004d:
            boolean r1 = r0.f15738c
            if (r1 == 0) goto L_0x0053
            goto L_0x0183
        L_0x0053:
            boolean r1 = r0.f15741f
            if (r1 == 0) goto L_0x0059
            goto L_0x0183
        L_0x0059:
            w.t r1 = r0.f15736a
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ AssertionError -> 0x0065 }
            java.lang.Object r1 = r1.a(r3)     // Catch:{ AssertionError -> 0x0065 }
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1     // Catch:{ AssertionError -> 0x0065 }
            r2 = r1
            goto L_0x006e
        L_0x0065:
            r1 = move-exception
            r1.getMessage()
            java.lang.String r1 = "ZslControlImpl"
            c0.p0.b(r1)
        L_0x006e:
            r1 = 0
            r3 = 1
            if (r2 == 0) goto L_0x00a2
            int[] r4 = r2.getInputFormats()
            if (r4 != 0) goto L_0x0079
            goto L_0x00a2
        L_0x0079:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            int[] r5 = r2.getInputFormats()
            int r6 = r5.length
            r7 = r1
        L_0x0084:
            if (r7 >= r6) goto L_0x00a7
            r8 = r5[r7]
            android.util.Size[] r9 = r2.getInputSizes(r8)
            if (r9 == 0) goto L_0x009f
            g0.c r10 = new g0.c
            r10.<init>(r3)
            java.util.Arrays.sort(r9, r10)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9 = r9[r1]
            r4.put(r8, r9)
        L_0x009f:
            int r7 = r7 + 1
            goto L_0x0084
        L_0x00a2:
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
        L_0x00a7:
            boolean r2 = r0.f15740e
            if (r2 == 0) goto L_0x0183
            boolean r2 = r4.isEmpty()
            if (r2 != 0) goto L_0x0183
            r2 = 34
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r5 = r4.containsKey(r5)
            if (r5 == 0) goto L_0x0183
            w.t r5 = r0.f15736a
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r5 = r5.a(r6)
            android.hardware.camera2.params.StreamConfigurationMap r5 = (android.hardware.camera2.params.StreamConfigurationMap) r5
            if (r5 != 0) goto L_0x00ca
            goto L_0x00df
        L_0x00ca:
            int[] r5 = r5.getValidOutputFormatsForInput(r2)
            if (r5 != 0) goto L_0x00d1
            goto L_0x00df
        L_0x00d1:
            int r6 = r5.length
            r7 = r1
        L_0x00d3:
            if (r7 >= r6) goto L_0x00df
            r8 = r5[r7]
            r9 = 256(0x100, float:3.59E-43)
            if (r8 != r9) goto L_0x00dc
            goto L_0x00e0
        L_0x00dc:
            int r7 = r7 + 1
            goto L_0x00d3
        L_0x00df:
            r3 = r1
        L_0x00e0:
            if (r3 != 0) goto L_0x00e4
            goto L_0x0183
        L_0x00e4:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r4.get(r3)
            android.util.Size r3 = (android.util.Size) r3
            androidx.camera.core.e r4 = new androidx.camera.core.e
            int r5 = r3.getWidth()
            int r3 = r3.getHeight()
            r6 = 9
            r4.<init>(r5, r3, r2, r6)
            androidx.camera.core.e$a r3 = r4.f1288b
            r0.f15743h = r3
            androidx.camera.core.f r3 = new androidx.camera.core.f
            r3.<init>(r4)
            r0.f15742g = r3
            v.i2 r3 = new v.i2
            r3.<init>(r0)
            h0.e r5 = j7.a.P()
            r4.g(r3, r5)
            f0.e0 r3 = new f0.e0
            androidx.camera.core.f r4 = r0.f15742g
            android.view.Surface r4 = r4.getSurface()
            android.util.Size r5 = new android.util.Size
            androidx.camera.core.f r6 = r0.f15742g
            int r6 = r6.c()
            androidx.camera.core.f r7 = r0.f15742g
            int r7 = r7.b()
            r5.<init>(r6, r7)
            r3.<init>(r4, r5, r2)
            r0.f15744i = r3
            androidx.camera.core.f r2 = r0.f15742g
            v8.a r3 = r3.d()
            java.util.Objects.requireNonNull(r2)
            v.j2 r4 = new v.j2
            r4.<init>(r2, r1)
            h0.b r1 = j7.a.f0()
            r3.b(r4, r1)
            f0.e0 r1 = r0.f15744i
            c0.x r2 = c0.x.f4367d
            r12.b(r1, r2)
            androidx.camera.core.e$a r1 = r0.f15743h
            androidx.camera.core.impl.g$a r2 = r12.f1399b
            r2.b(r1)
            java.util.ArrayList r2 = r12.f1403f
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L_0x0162
            java.util.ArrayList r2 = r12.f1403f
            r2.add(r1)
        L_0x0162:
            v.k2 r1 = new v.k2
            r1.<init>(r0)
            r12.a(r1)
            android.hardware.camera2.params.InputConfiguration r1 = new android.hardware.camera2.params.InputConfiguration
            androidx.camera.core.f r2 = r0.f15742g
            int r2 = r2.c()
            androidx.camera.core.f r3 = r0.f15742g
            int r3 = r3.b()
            androidx.camera.core.f r0 = r0.f15742g
            int r0 = r0.e()
            r1.<init>(r2, r3, r0)
            r12.f1404g = r1
        L_0x0183:
            return
        L_0x0184:
            r12 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0184 }
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: v.o.d(androidx.camera.core.impl.u$b):void");
    }

    public final v8.a e(int i10, int i11, List list) {
        int i12;
        boolean z10;
        synchronized (this.f15758d) {
            i12 = this.f15769o;
        }
        if (i12 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            p0.g("Camera2CameraControlImp");
            return new i.a(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        return i0.d.a(i0.f.d(this.f15775u)).d(new j(this, list, i10, this.f15771q, i11), this.f15757c);
    }

    public final v8.a<Void> f(boolean z10) {
        int i10;
        boolean z11;
        v8.a aVar;
        synchronized (this.f15758d) {
            i10 = this.f15769o;
        }
        if (i10 > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return new i.a(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        f2 f2Var = this.f15764j;
        if (!f2Var.f15678c) {
            p0.a("TorchControl");
            aVar = new i.a(new IllegalStateException("No flash unit"));
        } else {
            f2.b(f2Var.f15677b, Integer.valueOf(z10 ? 1 : 0));
            aVar = z0.b.a(new c2(f2Var, z10));
        }
        return i0.f.d(aVar);
    }

    public final androidx.camera.core.impl.i g() {
        return this.f15767m.a();
    }

    public final void h() {
        b0.c cVar = this.f15767m;
        synchronized (cVar.f3866e) {
            cVar.f3867f = new a.C0199a();
        }
        i0.f.d(z0.b.a(new ca.a(cVar, 5))).b(new h(0), j7.a.x());
    }

    public final void i(c cVar) {
        this.f15756b.f15782a.add(cVar);
    }

    public final void j() {
        synchronized (this.f15758d) {
            int i10 = this.f15769o;
            if (i10 != 0) {
                this.f15769o = i10 - 1;
            } else {
                throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
            }
        }
    }

    public final void k(boolean z10) {
        this.f15770p = z10;
        if (!z10) {
            g.a aVar = new g.a();
            aVar.f1367c = this.f15776v;
            aVar.f1370f = true;
            q L = q.L();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            L.O(u.a.K(key), Integer.valueOf(m(1)));
            L.O(u.a.K(CaptureRequest.FLASH_MODE), 0);
            aVar.c(new u.a(r.K(L)));
            r(Collections.singletonList(aVar.d()));
        }
        s();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final androidx.camera.core.impl.u l() {
        /*
            r8 = this;
            androidx.camera.core.impl.u$b r0 = r8.f15761g
            int r1 = r8.f15776v
            androidx.camera.core.impl.g$a r2 = r0.f1399b
            r2.f1367c = r1
            u.a$a r1 = new u.a$a
            r1.<init>()
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.c(r2, r4)
            v.k1 r2 = r8.f15762h
            r2.getClass()
            int r4 = r2.f15726c
            r5 = 3
            if (r4 == r5) goto L_0x0023
            r4 = 4
            goto L_0x0024
        L_0x0023:
            r4 = r5
        L_0x0024:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            v.o r7 = r2.f15724a
            int r4 = r7.n(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.c(r6, r4)
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.f15728e
            int r6 = r4.length
            if (r6 == 0) goto L_0x003d
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            r1.c(r6, r4)
        L_0x003d:
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.f15729f
            int r6 = r4.length
            if (r6 == 0) goto L_0x0047
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            r1.c(r6, r4)
        L_0x0047:
            android.hardware.camera2.params.MeteringRectangle[] r2 = r2.f15730g
            int r4 = r2.length
            if (r4 == 0) goto L_0x0051
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS
            r1.c(r4, r2)
        L_0x0051:
            z.a r2 = r8.f15772r
            android.util.Range<java.lang.Integer> r2 = r2.f17743a
            if (r2 == 0) goto L_0x005c
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r1.c(r4, r2)
        L_0x005c:
            v.g2 r2 = r8.f15763i
            v.g2$b r2 = r2.f15691d
            r2.d(r1)
            boolean r2 = r8.f15770p
            r4 = 2
            if (r2 == 0) goto L_0x0072
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.c(r2, r4)
            goto L_0x0078
        L_0x0072:
            int r2 = r8.f15771q
            if (r2 == 0) goto L_0x007a
            if (r2 == r3) goto L_0x0086
        L_0x0078:
            r5 = r3
            goto L_0x0086
        L_0x007a:
            z.b r2 = r8.f15773s
            boolean r5 = r2.f17744a
            if (r5 != 0) goto L_0x0078
            boolean r2 = r2.f17745b
            if (r2 == 0) goto L_0x0085
            goto L_0x0078
        L_0x0085:
            r5 = r4
        L_0x0086:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            int r4 = r8.m(r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.c(r2, r4)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            w.t r4 = r8.f15759e
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES
            java.lang.Object r4 = r4.a(r5)
            int[] r4 = (int[]) r4
            r5 = 0
            if (r4 != 0) goto L_0x00a3
            goto L_0x00b1
        L_0x00a3:
            boolean r6 = o(r4, r3)
            if (r6 == 0) goto L_0x00aa
            goto L_0x00b2
        L_0x00aa:
            boolean r4 = o(r4, r3)
            if (r4 == 0) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r3 = r5
        L_0x00b2:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.c(r2, r3)
            v.f1 r2 = r8.f15765k
            r2.getClass()
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            v.g1 r2 = r2.f15674a
            java.lang.Object r4 = r2.f15686a
            monitor-enter(r4)
            int r2 = r2.f15687b     // Catch:{ all -> 0x014f }
            monitor-exit(r4)     // Catch:{ all -> 0x014f }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.c(r3, r2)
            b0.c r2 = r8.f15767m
            u.a r2 = r2.a()
            androidx.camera.core.impl.i r3 = r2.b()
            java.util.Set r3 = r3.d()
            java.util.Iterator r3 = r3.iterator()
        L_0x00e1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00fd
            java.lang.Object r4 = r3.next()
            androidx.camera.core.impl.i$a r4 = (androidx.camera.core.impl.i.a) r4
            androidx.camera.core.impl.q r5 = r1.f15025a
            androidx.camera.core.impl.i$b r6 = androidx.camera.core.impl.i.b.ALWAYS_OVERRIDE
            androidx.camera.core.impl.i r7 = r2.b()
            java.lang.Object r7 = r7.a(r4)
            r5.N(r4, r6, r7)
            goto L_0x00e1
        L_0x00fd:
            u.a r2 = new u.a
            androidx.camera.core.impl.q r1 = r1.f15025a
            androidx.camera.core.impl.r r1 = androidx.camera.core.impl.r.K(r1)
            r2.<init>(r1)
            androidx.camera.core.impl.g$a r0 = r0.f1399b
            r0.getClass()
            androidx.camera.core.impl.q r1 = androidx.camera.core.impl.q.M(r2)
            r0.f1366b = r1
            b0.c r0 = r8.f15767m
            u.a r0 = r0.a()
            r1 = 0
            androidx.camera.core.impl.i r0 = r0.E
            androidx.camera.core.impl.c r2 = u.a.L
            java.lang.Object r0 = r0.e(r2, r1)
            if (r0 == 0) goto L_0x0135
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L_0x0135
            androidx.camera.core.impl.u$b r1 = r8.f15761g
            java.lang.String r2 = "Camera2CameraControl"
            androidx.camera.core.impl.g$a r1 = r1.f1399b
            f0.i0 r1 = r1.f1371g
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f9605a
            r1.put(r2, r0)
        L_0x0135:
            androidx.camera.core.impl.u$b r0 = r8.f15761g
            java.lang.String r1 = "CameraControlSessionUpdateId"
            long r2 = r8.f15777w
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            androidx.camera.core.impl.g$a r0 = r0.f1399b
            f0.i0 r0 = r0.f1371g
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.f9605a
            r0.put(r1, r2)
            androidx.camera.core.impl.u$b r0 = r8.f15761g
            androidx.camera.core.impl.u r0 = r0.c()
            return r0
        L_0x014f:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x014f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v.o.l():androidx.camera.core.impl.u");
    }

    public final int m(int i10) {
        int[] iArr = (int[]) this.f15759e.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (o(iArr, i10)) {
            return i10;
        }
        if (o(iArr, 1)) {
            return 1;
        }
        return 0;
    }

    public final int n(int i10) {
        int[] iArr = (int[]) this.f15759e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (o(iArr, i10)) {
            return i10;
        }
        if (o(iArr, 4)) {
            return 4;
        }
        if (o(iArr, 1)) {
            return 1;
        }
        return 0;
    }

    public final void q(boolean z10) {
        j0.a aVar;
        boolean z11;
        k1 k1Var = this.f15762h;
        if (z10 != k1Var.f15725b) {
            k1Var.f15725b = z10;
            if (!k1Var.f15725b) {
                k1Var.f15724a.f15756b.f15782a.remove(k1Var.f15727d);
                b.a<Void> aVar2 = k1Var.f15731h;
                if (aVar2 != null) {
                    aVar2.b(new CameraControl.OperationCanceledException("Cancelled by another cancelFocusAndMetering()"));
                    k1Var.f15731h = null;
                }
                k1Var.f15724a.f15756b.f15782a.remove((Object) null);
                k1Var.f15731h = null;
                if (k1Var.f15728e.length > 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    k1Var.a(true, false);
                }
                MeteringRectangle[] meteringRectangleArr = k1.f15723i;
                k1Var.f15728e = meteringRectangleArr;
                k1Var.f15729f = meteringRectangleArr;
                k1Var.f15730g = meteringRectangleArr;
                long s10 = k1Var.f15724a.s();
                if (k1Var.f15731h != null) {
                    o oVar = k1Var.f15724a;
                    int i10 = 3;
                    if (k1Var.f15726c != 3) {
                        i10 = 4;
                    }
                    h1 h1Var = new h1(k1Var, oVar.n(i10), s10);
                    k1Var.f15727d = h1Var;
                    k1Var.f15724a.i(h1Var);
                }
            }
        }
        g2 g2Var = this.f15763i;
        if (g2Var.f15692e != z10) {
            g2Var.f15692e = z10;
            if (!z10) {
                synchronized (g2Var.f15689b) {
                    g2Var.f15689b.a();
                    h2 h2Var = g2Var.f15689b;
                    aVar = new j0.a(h2Var.f15700a, h2Var.f15701b, h2Var.f15702c, h2Var.f15703d);
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    g2Var.f15690c.j(aVar);
                } else {
                    g2Var.f15690c.k(aVar);
                }
                g2Var.f15691d.e();
                g2Var.f15688a.s();
            }
        }
        f2 f2Var = this.f15764j;
        if (f2Var.f15680e != z10) {
            f2Var.f15680e = z10;
            if (!z10) {
                if (f2Var.f15682g) {
                    f2Var.f15682g = false;
                    f2Var.f15676a.k(false);
                    f2.b(f2Var.f15677b, 0);
                }
                b.a<Void> aVar3 = f2Var.f15681f;
                if (aVar3 != null) {
                    aVar3.b(new CameraControl.OperationCanceledException("Camera is not active."));
                    f2Var.f15681f = null;
                }
            }
        }
        f1 f1Var = this.f15765k;
        if (z10 != f1Var.f15675b) {
            f1Var.f15675b = z10;
            if (!z10) {
                g1 g1Var = f1Var.f15674a;
                synchronized (g1Var.f15686a) {
                    g1Var.f15687b = 0;
                }
            }
        }
        b0.c cVar = this.f15767m;
        cVar.f3865d.execute(new b0.a(0, cVar, z10));
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0017 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(java.util.List<androidx.camera.core.impl.g> r20) {
        /*
            r19 = this;
            r0 = r19
            androidx.camera.core.impl.CameraControlInternal$b r1 = r0.f15760f
            v.u$d r1 = (v.u.d) r1
            v.u r1 = v.u.this
            r20.getClass()
            r1.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r20.iterator()
        L_0x0017:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0160
            java.lang.Object r4 = r3.next()
            androidx.camera.core.impl.g r4 = (androidx.camera.core.impl.g) r4
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            androidx.camera.core.impl.q.L()
            android.util.Range<java.lang.Integer> r6 = androidx.camera.core.impl.v.f1409a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            f0.i0.c()
            java.util.List<androidx.camera.core.impl.DeferrableSurface> r7 = r4.f1357a
            r5.addAll(r7)
            androidx.camera.core.impl.i r7 = r4.f1358b
            androidx.camera.core.impl.q r7 = androidx.camera.core.impl.q.M(r7)
            int r11 = r4.f1359c
            android.util.Range<java.lang.Integer> r12 = r4.f1360d
            java.util.List<f0.f> r8 = r4.f1361e
            r6.addAll(r8)
            boolean r14 = r4.f1362f
            f0.u0 r8 = r4.f1363g
            android.util.ArrayMap r9 = new android.util.ArrayMap
            r9.<init>()
            java.util.Set r10 = r8.b()
            java.util.Iterator r10 = r10.iterator()
        L_0x005a:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x006e
            java.lang.Object r13 = r10.next()
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r15 = r8.a(r13)
            r9.put(r13, r15)
            goto L_0x005a
        L_0x006e:
            f0.i0 r8 = new f0.i0
            r8.<init>(r9)
            int r9 = r4.f1359c
            r10 = 5
            if (r9 != r10) goto L_0x007d
            f0.k r9 = r4.f1364h
            if (r9 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r9 = 0
        L_0x007e:
            r16 = r9
            java.util.List r9 = r4.a()
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x011f
            boolean r4 = r4.f1362f
            if (r4 == 0) goto L_0x011f
            boolean r4 = r5.isEmpty()
            java.lang.String r9 = "Camera2CameraImpl"
            if (r4 != 0) goto L_0x009b
            c0.p0.g(r9)
            goto L_0x0118
        L_0x009b:
            androidx.camera.core.impl.w r4 = r1.f15863a
            r4.getClass()
            v.g0 r13 = new v.g0
            r15 = 2
            r13.<init>(r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.LinkedHashMap r4 = r4.f1410a
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x00b5:
            boolean r17 = r4.hasNext()
            if (r17 == 0) goto L_0x00db
            java.lang.Object r17 = r4.next()
            java.util.Map$Entry r17 = (java.util.Map.Entry) r17
            java.lang.Object r18 = r17.getValue()
            r10 = r18
            androidx.camera.core.impl.w$a r10 = (androidx.camera.core.impl.w.a) r10
            boolean r10 = r13.a(r10)
            if (r10 == 0) goto L_0x00b5
            java.lang.Object r10 = r17.getValue()
            androidx.camera.core.impl.w$a r10 = (androidx.camera.core.impl.w.a) r10
            androidx.camera.core.impl.u r10 = r10.f1411a
            r15.add(r10)
            goto L_0x00b5
        L_0x00db:
            java.util.Collection r4 = java.util.Collections.unmodifiableCollection(r15)
            java.util.Iterator r4 = r4.iterator()
        L_0x00e3:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x010f
            java.lang.Object r10 = r4.next()
            androidx.camera.core.impl.u r10 = (androidx.camera.core.impl.u) r10
            androidx.camera.core.impl.g r10 = r10.f1396f
            java.util.List r10 = r10.a()
            boolean r13 = r10.isEmpty()
            if (r13 != 0) goto L_0x00e3
            java.util.Iterator r10 = r10.iterator()
        L_0x00ff:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x00e3
            java.lang.Object r13 = r10.next()
            androidx.camera.core.impl.DeferrableSurface r13 = (androidx.camera.core.impl.DeferrableSurface) r13
            r5.add(r13)
            goto L_0x00ff
        L_0x010f:
            boolean r4 = r5.isEmpty()
            if (r4 == 0) goto L_0x011a
            c0.p0.g(r9)
        L_0x0118:
            r10 = 0
            goto L_0x011b
        L_0x011a:
            r10 = 1
        L_0x011b:
            if (r10 != 0) goto L_0x011f
            goto L_0x0017
        L_0x011f:
            androidx.camera.core.impl.g r4 = new androidx.camera.core.impl.g
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
            androidx.camera.core.impl.r r10 = androidx.camera.core.impl.r.K(r7)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r6)
            f0.u0 r5 = f0.u0.f9604b
            android.util.ArrayMap r5 = new android.util.ArrayMap
            r5.<init>()
            java.util.Set r6 = r8.b()
            java.util.Iterator r6 = r6.iterator()
        L_0x013e:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0152
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r15 = r8.a(r7)
            r5.put(r7, r15)
            goto L_0x013e
        L_0x0152:
            f0.u0 r15 = new f0.u0
            r15.<init>(r5)
            r8 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r2.add(r4)
            goto L_0x0017
        L_0x0160:
            java.lang.String r3 = "Issue capture request"
            r1.s(r3)
            v.a1 r1 = r1.f15875t
            r1.f(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v.o.r(java.util.List):void");
    }

    public final long s() {
        this.f15777w = this.f15774t.getAndIncrement();
        u.this.K();
        return this.f15777w;
    }
}
