package y3;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import xa.b;
import z.j;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class g implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f17399a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f17400b;

    public /* synthetic */ g(Object obj, int i10) {
        this.f17399a = i10;
        this.f17400b = obj;
    }

    public final Object call() {
        switch (this.f17399a) {
            case 0:
                j jVar = (j) this.f17400b;
                sk.j.f(jVar, "this$0");
                return Integer.valueOf(i.a((WorkDatabase) jVar.f17753b, "next_alarm_manager_id"));
            default:
                b bVar = (b) this.f17400b;
                synchronized (bVar) {
                    bVar.f17166a.get().h(System.currentTimeMillis(), bVar.f17168c.get().a());
                }
                return null;
        }
    }
}
