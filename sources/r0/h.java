package r0;

import android.view.PixelCopy;
import c0.p0;
import java.util.concurrent.Semaphore;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements PixelCopy.OnPixelCopyFinishedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Semaphore f14465a;

    public /* synthetic */ h(Semaphore semaphore) {
        this.f14465a = semaphore;
    }

    public final void onPixelCopyFinished(int i10) {
        Semaphore semaphore = this.f14465a;
        if (i10 == 0) {
            p0.a("SurfaceViewImpl");
        } else {
            p0.b("SurfaceViewImpl");
        }
        semaphore.release();
    }
}
