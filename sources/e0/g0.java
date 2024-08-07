package e0;

import androidx.camera.core.ImageCaptureException;
import c0.j0;
import g0.m;
import i0.c;

/* compiled from: TakePictureManager */
public final class g0 implements c<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f9003a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h0 f9004b;

    public g0(h0 h0Var, i iVar) {
        this.f9004b = h0Var;
        this.f9003a = iVar;
    }

    public final void a(Throwable th2) {
        if (!((x) this.f9003a.f9012b).f9065g) {
            if (th2 instanceof ImageCaptureException) {
                o oVar = this.f9004b.f9007c;
                oVar.getClass();
                m.a();
                oVar.f9033f.f8982i.accept((ImageCaptureException) th2);
            } else {
                o oVar2 = this.f9004b.f9007c;
                ImageCaptureException imageCaptureException = new ImageCaptureException("Failed to submit capture request", th2);
                oVar2.getClass();
                m.a();
                oVar2.f9033f.f8982i.accept(imageCaptureException);
            }
            ((j0.a) this.f9004b.f9006b).a();
        }
    }

    public final void onSuccess(Object obj) {
        Void voidR = (Void) obj;
        ((j0.a) this.f9004b.f9006b).a();
    }
}
