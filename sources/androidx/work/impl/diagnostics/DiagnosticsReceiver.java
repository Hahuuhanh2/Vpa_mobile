package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Collections;
import o3.j;
import o3.l;
import p3.j0;

public class DiagnosticsReceiver extends BroadcastReceiver {
    static {
        j.b("DiagnosticsRcvr");
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            j.a().getClass();
            try {
                j0 b10 = j0.b(context);
                l a10 = l.a();
                b10.getClass();
                b10.a(Collections.singletonList(a10));
            } catch (IllegalStateException unused) {
                j.a().getClass();
            }
        }
    }
}
