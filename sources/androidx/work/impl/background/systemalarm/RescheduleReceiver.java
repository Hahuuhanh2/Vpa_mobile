package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;
import o3.j;
import p3.j0;

public class RescheduleReceiver extends BroadcastReceiver {
    static {
        j.b("RescheduleReceiver");
    }

    public final void onReceive(Context context, Intent intent) {
        j a10 = j.a();
        Objects.toString(intent);
        a10.getClass();
        try {
            j0 b10 = j0.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            b10.getClass();
            synchronized (j0.f13936m) {
                BroadcastReceiver.PendingResult pendingResult = b10.f13945i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                b10.f13945i = goAsync;
                if (b10.f13944h) {
                    goAsync.finish();
                    b10.f13945i = null;
                }
            }
        } catch (IllegalStateException unused) {
            j.a().getClass();
        }
    }
}
