package v;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.q;
import androidx.camera.core.impl.r;
import java.util.Collections;
import u.a;
import z0.b;

/* compiled from: FocusMeteringControl */
public final class k1 {

    /* renamed from: i  reason: collision with root package name */
    public static final MeteringRectangle[] f15723i = new MeteringRectangle[0];

    /* renamed from: a  reason: collision with root package name */
    public final o f15724a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f15725b = false;

    /* renamed from: c  reason: collision with root package name */
    public int f15726c = 1;

    /* renamed from: d  reason: collision with root package name */
    public h1 f15727d = null;

    /* renamed from: e  reason: collision with root package name */
    public MeteringRectangle[] f15728e;

    /* renamed from: f  reason: collision with root package name */
    public MeteringRectangle[] f15729f;

    /* renamed from: g  reason: collision with root package name */
    public MeteringRectangle[] f15730g;

    /* renamed from: h  reason: collision with root package name */
    public b.a<Void> f15731h;

    public k1(o oVar) {
        MeteringRectangle[] meteringRectangleArr = f15723i;
        this.f15728e = meteringRectangleArr;
        this.f15729f = meteringRectangleArr;
        this.f15730g = meteringRectangleArr;
        this.f15731h = null;
        this.f15724a = oVar;
    }

    public final void a(boolean z10, boolean z11) {
        if (this.f15725b) {
            g.a aVar = new g.a();
            aVar.f1370f = true;
            aVar.f1367c = this.f15726c;
            q L = q.L();
            if (z10) {
                L.O(a.K(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z11) {
                L.O(a.K(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            aVar.c(new a(r.K(L)));
            this.f15724a.r(Collections.singletonList(aVar.d()));
        }
    }
}
