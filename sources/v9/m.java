package v9;

import android.app.Application;
import android.content.Context;
import j7.a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import r9.b;
import r9.c;
import y6.j;

/* compiled from: TokenRefreshManager */
public final class m {
    public m(Context context, e eVar, @c Executor executor, @b ScheduledExecutorService scheduledExecutorService) {
        j.f(context);
        j.f(eVar);
        f fVar = new f(eVar, executor, scheduledExecutorService);
        a aVar = new a();
        w6.b.b((Application) context.getApplicationContext());
        w6.b.f16541e.a(new l(this, fVar, aVar));
    }
}
