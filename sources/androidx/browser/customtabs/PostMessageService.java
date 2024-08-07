package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import b.c;

public class PostMessageService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public a f1270a = new a();

    public class a extends c {
    }

    public final IBinder onBind(Intent intent) {
        return this.f1270a;
    }
}
