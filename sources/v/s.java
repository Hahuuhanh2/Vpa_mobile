package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.core.impl.u;
import androidx.camera.core.impl.x;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import c6.h;
import f6.n;
import g6.m;
import java.util.List;
import java.util.logging.Logger;
import p3.t;
import p3.v;
import w.f;
import x3.l;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15829a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f15830b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f15831c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Object f15832d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ Object f15833e;

    public /* synthetic */ s(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f15829a = i10;
        this.f15830b = obj;
        this.f15831c = obj2;
        this.f15832d = obj3;
        this.f15833e = obj4;
    }

    public final void run() {
        switch (this.f15829a) {
            case 0:
                u uVar = (u) this.f15830b;
                String str = (String) this.f15831c;
                uVar.getClass();
                uVar.s("Use case " + str + " RESET");
                uVar.f15863a.f(str, (u) this.f15832d, (x) this.f15833e);
                uVar.p();
                uVar.D();
                uVar.K();
                if (uVar.f15867e == 4) {
                    uVar.A();
                    return;
                }
                return;
            case 1:
                ((f.b) this.f15830b).f16205a.onCaptureCompleted((CameraCaptureSession) this.f15831c, (CaptureRequest) this.f15832d, (TotalCaptureResult) this.f15833e);
                return;
            case 2:
                List<t> list = (List) this.f15830b;
                l lVar = (l) this.f15831c;
                a aVar = (a) this.f15832d;
                WorkDatabase workDatabase = (WorkDatabase) this.f15833e;
                int i10 = v.f14027a;
                for (t b10 : list) {
                    b10.b(lVar.f17010a);
                }
                v.b(aVar, workDatabase, list);
                return;
            default:
                k6.a aVar2 = (k6.a) this.f15830b;
                f6.s sVar = (f6.s) this.f15831c;
                h hVar = (h) this.f15832d;
                n nVar = (n) this.f15833e;
                Logger logger = k6.a.f12033f;
                aVar2.getClass();
                try {
                    m a10 = aVar2.f12036c.a(sVar.b());
                    if (a10 == null) {
                        String format = String.format("Transport backend '%s' is not registered", new Object[]{sVar.b()});
                        k6.a.f12033f.warning(format);
                        hVar.a(new IllegalArgumentException(format));
                        return;
                    }
                    aVar2.f12038e.h(new n0.f(3, aVar2, sVar, a10.b(nVar)));
                    hVar.a((Exception) null);
                    return;
                } catch (Exception e10) {
                    Logger logger2 = k6.a.f12033f;
                    StringBuilder q10 = android.support.v4.media.a.q("Error scheduling event ");
                    q10.append(e10.getMessage());
                    logger2.warning(q10.toString());
                    hVar.a(e10);
                    return;
                }
        }
    }
}
