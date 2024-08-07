package n;

import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13295a;

    public /* synthetic */ b(int i10) {
        this.f13295a = i10;
    }

    public final void execute(Runnable runnable) {
        switch (this.f13295a) {
            case 0:
                c.J().f13298b.f13300c.execute(runnable);
                return;
            case 1:
                runnable.run();
                return;
            case 2:
                runnable.run();
                return;
            default:
                runnable.run();
                return;
        }
    }
}
