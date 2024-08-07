package fb;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.c;
import h7.g;
import kh.h;
import s7.a;
import w2.b;

/* compiled from: FcmBroadcastProcessor */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f10141c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public static c f10142d;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10143a;

    /* renamed from: b  reason: collision with root package name */
    public final b f10144b = new b(3);

    public j(Context context) {
        this.f10143a = context;
    }

    public static Task<Integer> a(Context context, Intent intent, boolean z10) {
        c cVar;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (f10141c) {
            if (f10142d == null) {
                f10142d = new c(context);
            }
            cVar = f10142d;
        }
        if (!z10) {
            return cVar.b(intent).continueWith(new n.b(2), new h(28));
        }
        if (v.a().c(context)) {
            synchronized (e0.f10130b) {
                if (e0.f10131c == null) {
                    a aVar = new a(context);
                    e0.f10131c = aVar;
                    synchronized (aVar.f14642a) {
                        aVar.f14648g = true;
                    }
                }
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                if (!booleanExtra) {
                    e0.f10131c.a(e0.f10129a);
                }
                cVar.b(intent).addOnCompleteListener(new d0(intent));
            }
        } else {
            cVar.b(intent);
        }
        return Tasks.forResult(-1);
    }

    public final Task<Integer> b(Intent intent) {
        boolean z10;
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z11 = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.f10143a;
        if (!g.a() || context.getApplicationInfo().targetSdkVersion < 26) {
            z10 = false;
        } else {
            z10 = true;
        }
        if ((intent.getFlags() & 268435456) != 0) {
            z11 = true;
        }
        if (!z10 || z11) {
            return Tasks.call(this.f10144b, new com.airbnb.lottie.j(1, context, intent)).continueWithTask(this.f10144b, new i(context, intent, z11));
        }
        return a(context, intent, z11);
    }
}
