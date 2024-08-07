package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.view.Surface;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.i;
import androidx.camera.core.impl.u;
import c0.p0;
import i0.a;
import i0.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import u.b;
import u.c;
import v.b2;
import v.u1;
import x.e;
import x.f;
import x.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class x0 implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ y0 f15921a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u f15922b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ CameraDevice f15923c;

    public /* synthetic */ x0(y0 y0Var, u uVar, CameraDevice cameraDevice) {
        this.f15921a = y0Var;
        this.f15922b = uVar;
        this.f15923c = cameraDevice;
    }

    public final v8.a apply(Object obj) {
        v8.a<Void> aVar;
        InputConfiguration inputConfiguration;
        y0 y0Var = this.f15921a;
        u uVar = this.f15922b;
        CameraDevice cameraDevice = this.f15923c;
        List list = (List) obj;
        synchronized (y0Var.f15940a) {
            try {
                int g2 = v.g(y0Var.f15951l);
                if (!(g2 == 0 || g2 == 1)) {
                    if (g2 == 2) {
                        y0Var.f15949j.clear();
                        for (int i10 = 0; i10 < list.size(); i10++) {
                            y0Var.f15949j.put(y0Var.f15950k.get(i10), (Surface) list.get(i10));
                        }
                        y0Var.f15951l = 4;
                        p0.a("CaptureSession");
                        b2 b2Var = new b2(Arrays.asList(new u1.a[]{y0Var.f15943d, new b2.a(uVar.f1393c)}));
                        i iVar = uVar.f1396f.f1358b;
                        u.a aVar2 = new u.a(iVar);
                        c cVar = (c) iVar.e(u.a.K, new c(new b[0]));
                        y0Var.f15948i = cVar;
                        cVar.getClass();
                        List<b> unmodifiableList = Collections.unmodifiableList(new ArrayList(cVar.f9547a));
                        ArrayList arrayList = new ArrayList();
                        for (b add : unmodifiableList) {
                            arrayList.add(add);
                        }
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((b) it.next()).getClass();
                        }
                        g.a aVar3 = new g.a(uVar.f1396f);
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            aVar3.c(((g) it2.next()).f1358b);
                        }
                        ArrayList arrayList3 = new ArrayList();
                        CaptureRequest captureRequest = null;
                        String str = (String) aVar2.E.e(u.a.M, null);
                        for (u.e next : uVar.f1391a) {
                            f k10 = y0Var.k(next, y0Var.f15949j, str);
                            if (y0Var.f15954o.containsKey(next.e())) {
                                k10.f16828a.a(y0Var.f15954o.get(next.e()).longValue());
                            }
                            arrayList3.add(k10);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            f fVar = (f) it3.next();
                            if (!arrayList4.contains(fVar.f16828a.getSurface())) {
                                arrayList4.add(fVar.f16828a.getSurface());
                                arrayList5.add(fVar);
                            }
                        }
                        x1 x1Var = (x1) y0Var.f15944e.f15575a;
                        x1Var.f15929f = b2Var;
                        l lVar = new l(arrayList5, x1Var.f15927d, new y1(x1Var));
                        if (uVar.f1396f.f1359c == 5 && (inputConfiguration = uVar.f1397g) != null) {
                            lVar.f16846a.h(e.a(inputConfiguration));
                        }
                        g d10 = aVar3.d();
                        if (cameraDevice != null) {
                            CaptureRequest.Builder createCaptureRequest = cameraDevice.createCaptureRequest(d10.f1359c);
                            i0.a(createCaptureRequest, d10.f1358b);
                            captureRequest = createCaptureRequest.build();
                        }
                        if (captureRequest != null) {
                            lVar.f16846a.g(captureRequest);
                        }
                        aVar = y0Var.f15944e.f15575a.e(cameraDevice, lVar, y0Var.f15950k);
                    } else if (g2 != 4) {
                        aVar = new i.a<>(new CancellationException("openCaptureSession() not execute in state: " + v.i(y0Var.f15951l)));
                    }
                }
                aVar = new i.a<>(new IllegalStateException("openCaptureSession() should not be possible in state: " + v.i(y0Var.f15951l)));
            } catch (CameraAccessException e10) {
                aVar = new i.a<>(e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }
}
