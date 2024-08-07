package n;

import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13294a;

    public /* synthetic */ a(int i10) {
        this.f13294a = i10;
    }

    public final void execute(Runnable runnable) {
        switch (this.f13294a) {
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            case 3:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
