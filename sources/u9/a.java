package u9;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import m9.d;
import r9.c;
import v.n;
import v9.h;
import v9.i;
import y6.j;
import za.b;

/* compiled from: DebugAppCheckProvider */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f15399d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final h f15400a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f15401b;

    /* renamed from: c  reason: collision with root package name */
    public final i f15402c = new i();

    public a(d dVar, b<t9.b> bVar, @c Executor executor, @r9.a Executor executor2, @r9.b Executor executor3) {
        String str;
        j.f(dVar);
        this.f15400a = new h(dVar);
        this.f15401b = executor3;
        if (bVar.get() != null) {
            str = bVar.get().a();
        } else {
            str = null;
        }
        if (str == null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            executor2.execute(new n(23, dVar, taskCompletionSource));
            taskCompletionSource.getTask();
            return;
        }
        Tasks.forResult(str);
    }
}
