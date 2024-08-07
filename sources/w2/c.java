package w2;

import android.view.Choreographer;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f16439a;

    public /* synthetic */ c(Runnable runnable) {
        this.f16439a = runnable;
    }

    public final void doFrame(long j10) {
        this.f16439a.run();
    }
}
