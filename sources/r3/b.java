package r3;

import androidx.work.impl.background.systemalarm.c;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14502a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f14503b;

    public /* synthetic */ b(c cVar, int i10) {
        this.f14502a = i10;
        this.f14503b = cVar;
    }

    public final void run() {
        switch (this.f14502a) {
            case 0:
                c.c(this.f14503b);
                return;
            default:
                c.b(this.f14503b);
                return;
        }
    }
}
