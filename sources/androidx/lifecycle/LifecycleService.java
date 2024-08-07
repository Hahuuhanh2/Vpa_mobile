package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.i;
import r2.l;
import sk.j;

/* compiled from: LifecycleService.kt */
public class LifecycleService extends Service implements l {

    /* renamed from: a  reason: collision with root package name */
    public final b0 f2725a = new b0(this);

    public final o B() {
        return this.f2725a.f2740a;
    }

    public final IBinder onBind(Intent intent) {
        j.f(intent, "intent");
        this.f2725a.a(i.a.ON_START);
        return null;
    }

    public void onCreate() {
        this.f2725a.a(i.a.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        b0 b0Var = this.f2725a;
        b0Var.a(i.a.ON_STOP);
        b0Var.a(i.a.ON_DESTROY);
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i10) {
        this.f2725a.a(i.a.ON_START);
        super.onStart(intent, i10);
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
