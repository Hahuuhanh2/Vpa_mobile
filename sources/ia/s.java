package ia;

import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ia.t;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import na.b;
import na.c;

/* compiled from: CrashlyticsController */
public final class s implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Boolean f11360a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t.a f11361b;

    public s(t.a aVar, Boolean bool) {
        this.f11361b = aVar;
        this.f11360a = bool;
    }

    public final Object call() {
        if (!this.f11360a.booleanValue()) {
            Log.isLoggable("FirebaseCrashlytics", 2);
            c cVar = t.this.f11369g;
            for (File delete : c.e(cVar.f13552b.listFiles(t.f11362r))) {
                delete.delete();
            }
            b bVar = t.this.f11375m.f11339b;
            b.a(c.e(bVar.f13548b.f13554d.listFiles()));
            b.a(c.e(bVar.f13548b.f13555e.listFiles()));
            b.a(c.e(bVar.f13548b.f13556f.listFiles()));
            t.this.f11379q.trySetResult(null);
            return Tasks.forResult(null);
        }
        Log.isLoggable("FirebaseCrashlytics", 3);
        boolean booleanValue = this.f11360a.booleanValue();
        g0 g0Var = t.this.f11364b;
        if (booleanValue) {
            g0Var.f11304f.trySetResult(null);
            t.a aVar = this.f11361b;
            Executor executor = t.this.f11367e.f11332a;
            return aVar.f11380a.onSuccessTask(executor, new r(this, executor));
        }
        g0Var.getClass();
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}
