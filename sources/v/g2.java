package v;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.Range;
import c0.p0;
import r2.p;
import u.a;
import v.o;
import w.t;

/* compiled from: ZoomControl */
public final class g2 {

    /* renamed from: a  reason: collision with root package name */
    public final o f15688a;

    /* renamed from: b  reason: collision with root package name */
    public final h2 f15689b;

    /* renamed from: c  reason: collision with root package name */
    public final p<Object> f15690c;

    /* renamed from: d  reason: collision with root package name */
    public final b f15691d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f15692e = false;

    /* renamed from: f  reason: collision with root package name */
    public a f15693f = new a();

    /* compiled from: ZoomControl */
    public class a implements o.c {
        public a() {
        }

        public final boolean a(TotalCaptureResult totalCaptureResult) {
            g2.this.f15691d.a(totalCaptureResult);
            return false;
        }
    }

    /* compiled from: ZoomControl */
    public interface b {
        void a(TotalCaptureResult totalCaptureResult);

        float b();

        float c();

        void d(a.C0199a aVar);

        void e();
    }

    public g2(o oVar, t tVar) {
        b bVar;
        Range range;
        boolean z10 = false;
        this.f15688a = oVar;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                range = (Range) tVar.a(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
            } catch (AssertionError unused) {
                p0.h("ZoomControl");
                range = null;
            }
            if (range != null) {
                z10 = true;
            }
        }
        if (z10) {
            bVar = new a(tVar);
        } else {
            bVar = new c1(tVar);
        }
        this.f15691d = bVar;
        float b10 = bVar.b();
        float c10 = bVar.c();
        h2 h2Var = new h2(b10, c10);
        this.f15689b = h2Var;
        h2Var.a();
        this.f15690c = new p<>(new j0.a(h2Var.f15700a, b10, c10, h2Var.f15703d));
        oVar.i(this.f15693f);
    }
}
