package q0;

import al.g0;
import androidx.camera.core.impl.y;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.i;
import b0.e;
import c0.f1;
import c0.n;
import c0.p;
import c0.u;
import d0.a;
import ea.c;
import f0.o;
import f0.o0;
import f0.r;
import f0.z;
import g0.m;
import i0.i;
import io.github.g00fy2.quickie.QRScannerActivity;
import j7.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import z0.b;

/* compiled from: ProcessCameraProvider */
public final class f {

    /* renamed from: f  reason: collision with root package name */
    public static final f f14279f = new f();

    /* renamed from: a  reason: collision with root package name */
    public final Object f14280a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public b.d f14281b;

    /* renamed from: c  reason: collision with root package name */
    public i.c f14282c = i0.f.c((Object) null);

    /* renamed from: d  reason: collision with root package name */
    public final c f14283d = new c();

    /* renamed from: e  reason: collision with root package name */
    public u f14284e;

    public static i0.b b(QRScannerActivity qRScannerActivity) {
        b.d dVar;
        f fVar = f14279f;
        synchronized (fVar.f14280a) {
            dVar = fVar.f14281b;
            if (dVar == null) {
                dVar = b.a(new e(3, fVar, new u(qRScannerActivity)));
                fVar.f14281b = dVar;
            }
        }
        return i0.f.f(dVar, new c(qRScannerActivity, 9), a.x());
    }

    public final b a(QRScannerActivity qRScannerActivity, p pVar, f1... f1VarArr) {
        int i10;
        b bVar;
        Collection<b> unmodifiableCollection;
        b bVar2;
        boolean contains;
        QRScannerActivity qRScannerActivity2 = qRScannerActivity;
        p pVar2 = pVar;
        f1[] f1VarArr2 = f1VarArr;
        u uVar = this.f14284e;
        if (uVar == null) {
            i10 = 0;
        } else {
            i10 = uVar.a().d().f8e;
        }
        if (i10 != 2) {
            c(1);
            List emptyList = Collections.emptyList();
            m.a();
            LinkedHashSet linkedHashSet = new LinkedHashSet(pVar2.f4313a);
            for (f1 f1Var : f1VarArr2) {
                p A = f1Var.f4259f.A();
                if (A != null) {
                    Iterator<n> it = A.f4313a.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add(it.next());
                    }
                }
            }
            LinkedHashSet<r> a10 = new p(linkedHashSet).a(this.f14284e.f4346a.a());
            if (!a10.isEmpty()) {
                CameraUseCaseAdapter.a aVar = new CameraUseCaseAdapter.a(a10);
                c cVar = this.f14283d;
                synchronized (cVar.f14269a) {
                    bVar = (b) cVar.f14270b.get(new a(qRScannerActivity2, aVar));
                }
                c cVar2 = this.f14283d;
                synchronized (cVar2.f14269a) {
                    unmodifiableCollection = Collections.unmodifiableCollection(cVar2.f14270b.values());
                }
                for (f1 f1Var2 : f1VarArr2) {
                    for (b bVar3 : unmodifiableCollection) {
                        synchronized (bVar3.f14265a) {
                            contains = ((ArrayList) bVar3.f14267c.v()).contains(f1Var2);
                        }
                        if (contains && bVar3 != bVar) {
                            throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", new Object[]{f1Var2}));
                        }
                    }
                }
                boolean z10 = false;
                if (bVar == null) {
                    c cVar3 = this.f14283d;
                    a0.a d10 = this.f14284e.a().d();
                    u uVar2 = this.f14284e;
                    o oVar = uVar2.f4352g;
                    if (oVar != null) {
                        y yVar = uVar2.f4353h;
                        if (yVar != null) {
                            CameraUseCaseAdapter cameraUseCaseAdapter = new CameraUseCaseAdapter(a10, d10, oVar, yVar);
                            synchronized (cVar3.f14269a) {
                                if (cVar3.f14270b.get(new a(qRScannerActivity2, cameraUseCaseAdapter.f1436d)) == null) {
                                    z10 = true;
                                }
                                g0.y("LifecycleCamera already exists for the given LifecycleOwner and set of cameras", z10);
                                if (qRScannerActivity2.f270d.f2785d != i.b.DESTROYED) {
                                    bVar2 = new b(qRScannerActivity2, cameraUseCaseAdapter);
                                    if (((ArrayList) cameraUseCaseAdapter.v()).isEmpty()) {
                                        synchronized (bVar2.f14265a) {
                                            if (!bVar2.f14268d) {
                                                bVar2.onStop(qRScannerActivity2);
                                                bVar2.f14268d = true;
                                            }
                                        }
                                    }
                                    cVar3.d(bVar2);
                                } else {
                                    throw new IllegalArgumentException("Trying to create LifecycleCamera with destroyed lifecycle.");
                                }
                            }
                            bVar = bVar2;
                        } else {
                            throw new IllegalStateException("CameraX not initialized yet.");
                        }
                    } else {
                        throw new IllegalStateException("CameraX not initialized yet.");
                    }
                }
                Iterator<n> it2 = pVar2.f4313a.iterator();
                while (it2.hasNext()) {
                    n next = it2.next();
                    if (next.a() != n.f4310a) {
                        f0.m a11 = z.a(next.a());
                        o0 o0Var = bVar.f14267c.f1449x;
                        a11.b();
                    }
                }
                bVar.f((androidx.camera.core.impl.f) null);
                if (f1VarArr2.length != 0) {
                    this.f14283d.a(bVar, emptyList, Arrays.asList(f1VarArr), this.f14284e.a().d());
                }
                return bVar;
            }
            throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
        }
        throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
    }

    public final void c(int i10) {
        u uVar = this.f14284e;
        if (uVar != null) {
            a0.a d10 = uVar.a().d();
            if (i10 != d10.f8e) {
                Iterator it = d10.f4a.iterator();
                while (it.hasNext()) {
                    ((a.C0084a) it.next()).a(d10.f8e, i10);
                }
            }
            if (d10.f8e == 2 && i10 != 2) {
                d10.f6c.clear();
            }
            d10.f8e = i10;
        }
    }
}
