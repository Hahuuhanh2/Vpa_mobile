package v;

import androidx.camera.core.ImageCaptureException;
import f0.f;
import f0.k;
import j7.a;
import z0.b;

/* compiled from: Camera2CapturePipeline */
public final class h0 extends f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f15696a;

    public h0(b.a aVar) {
        this.f15696a = aVar;
    }

    public final void a() {
        this.f15696a.b(new ImageCaptureException("Capture request is cancelled because camera is closed", (Throwable) null));
    }

    public final void b(k kVar) {
        this.f15696a.a(null);
    }

    public final void c(a aVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Capture request failed with reason ");
        aVar.getClass();
        sb2.append(android.support.v4.media.a.F(1));
        this.f15696a.b(new ImageCaptureException(sb2.toString(), (Throwable) null));
    }
}
