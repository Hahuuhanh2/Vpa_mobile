package q0;

import android.os.Build;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.f;
import androidx.camera.core.impl.r;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.lifecycle.i;
import androidx.lifecycle.q;
import c0.f1;
import c0.j;
import c0.o;
import f0.n;
import f0.n0;
import f0.p0;
import io.github.g00fy2.quickie.QRScannerActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import r2.k;
import r2.l;

/* compiled from: LifecycleCamera */
public final class b implements k, j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14265a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final l f14266b;

    /* renamed from: c  reason: collision with root package name */
    public final CameraUseCaseAdapter f14267c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f14268d;

    public b(QRScannerActivity qRScannerActivity, CameraUseCaseAdapter cameraUseCaseAdapter) {
        boolean z10 = false;
        this.f14268d = false;
        this.f14266b = qRScannerActivity;
        this.f14267c = cameraUseCaseAdapter;
        if (qRScannerActivity.f270d.f2785d.compareTo(i.b.STARTED) >= 0 ? true : z10) {
            cameraUseCaseAdapter.b();
        } else {
            cameraUseCaseAdapter.s();
        }
        qRScannerActivity.f270d.a(this);
    }

    public final o a() {
        return this.f14267c.f1449x;
    }

    public final void b(List list) {
        synchronized (this.f14265a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f14267c;
            synchronized (cameraUseCaseAdapter.f1443r) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(cameraUseCaseAdapter.f1437e);
                linkedHashSet.addAll(list);
                try {
                    cameraUseCaseAdapter.z(linkedHashSet, false);
                } catch (IllegalArgumentException e10) {
                    throw new CameraUseCaseAdapter.CameraException(e10.getMessage());
                }
            }
        }
    }

    public final CameraControl c() {
        return this.f14267c.f1448w;
    }

    public final List<f1> d() {
        List<f1> unmodifiableList;
        synchronized (this.f14265a) {
            unmodifiableList = Collections.unmodifiableList(this.f14267c.v());
        }
        return unmodifiableList;
    }

    public final void f(f fVar) {
        CameraUseCaseAdapter cameraUseCaseAdapter = this.f14267c;
        synchronized (cameraUseCaseAdapter.f1443r) {
            if (fVar == null) {
                fVar = n.f9564a;
            }
            if (!cameraUseCaseAdapter.f1437e.isEmpty()) {
                if (!((n.a) cameraUseCaseAdapter.f1442q).E.equals(((n.a) fVar).E)) {
                    throw new IllegalStateException("Need to unbind all use cases before binding with extension enabled");
                }
            }
            cameraUseCaseAdapter.f1442q = fVar;
            p0 p0Var = (p0) ((r) ((n.a) fVar).b()).e(f.f1354c, null);
            if (p0Var != null) {
                Set<Integer> e10 = p0Var.e();
                n0 n0Var = cameraUseCaseAdapter.f1448w;
                n0Var.f9566d = true;
                n0Var.f9567e = e10;
            } else {
                n0 n0Var2 = cameraUseCaseAdapter.f1448w;
                n0Var2.f9566d = false;
                n0Var2.f9567e = null;
            }
            cameraUseCaseAdapter.f1433a.f(cameraUseCaseAdapter.f1442q);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f14265a
            monitor-enter(r0)
            boolean r1 = r4.f14268d     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0009:
            r1 = 0
            r4.f14268d = r1     // Catch:{ all -> 0x0026 }
            r2.l r2 = r4.f14266b     // Catch:{ all -> 0x0026 }
            androidx.lifecycle.o r2 = r2.B()     // Catch:{ all -> 0x0026 }
            androidx.lifecycle.i$b r2 = r2.f2785d     // Catch:{ all -> 0x0026 }
            androidx.lifecycle.i$b r3 = androidx.lifecycle.i.b.STARTED     // Catch:{ all -> 0x0026 }
            int r2 = r2.compareTo(r3)     // Catch:{ all -> 0x0026 }
            if (r2 < 0) goto L_0x001d
            r1 = 1
        L_0x001d:
            if (r1 == 0) goto L_0x0024
            r2.l r1 = r4.f14266b     // Catch:{ all -> 0x0026 }
            r4.onStart(r1)     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.b.o():void");
    }

    @q(i.a.ON_DESTROY)
    public void onDestroy(l lVar) {
        synchronized (this.f14265a) {
            CameraUseCaseAdapter cameraUseCaseAdapter = this.f14267c;
            ArrayList arrayList = (ArrayList) cameraUseCaseAdapter.v();
            synchronized (cameraUseCaseAdapter.f1443r) {
                LinkedHashSet linkedHashSet = new LinkedHashSet(cameraUseCaseAdapter.f1437e);
                linkedHashSet.removeAll(arrayList);
                cameraUseCaseAdapter.z(linkedHashSet, false);
            }
        }
    }

    @q(i.a.ON_PAUSE)
    public void onPause(l lVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f14267c.f1433a.j(false);
        }
    }

    @q(i.a.ON_RESUME)
    public void onResume(l lVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f14267c.f1433a.j(true);
        }
    }

    @q(i.a.ON_START)
    public void onStart(l lVar) {
        synchronized (this.f14265a) {
            if (!this.f14268d) {
                this.f14267c.b();
            }
        }
    }

    @q(i.a.ON_STOP)
    public void onStop(l lVar) {
        synchronized (this.f14265a) {
            if (!this.f14268d) {
                this.f14267c.s();
            }
        }
    }
}
