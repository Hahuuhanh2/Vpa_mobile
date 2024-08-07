package d2;

import android.view.Choreographer;

/* compiled from: ViewDataBinding */
public final class m implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ l f8566a;

    public m(l lVar) {
        this.f8566a = lVar;
    }

    public final void doFrame(long j10) {
        this.f8566a.f8551b.run();
    }
}
