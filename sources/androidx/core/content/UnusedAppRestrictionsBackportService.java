package androidx.core.content;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import j1.c;

public abstract class UnusedAppRestrictionsBackportService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public a f2117a = new a();

    public class a extends c.a {
        public a() {
        }
    }

    public abstract void a();

    public final IBinder onBind(Intent intent) {
        return this.f2117a;
    }
}
