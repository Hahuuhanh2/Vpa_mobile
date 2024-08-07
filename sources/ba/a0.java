package ba;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.common.api.Status;
import y6.j;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class a0 {

    /* renamed from: b  reason: collision with root package name */
    public static final a0 f4099b = new a0();

    /* renamed from: a  reason: collision with root package name */
    public final p f4100a;

    public a0() {
        p pVar = p.f4123b;
        if (k.f4117a == null) {
            k.f4117a = new k();
        }
        this.f4100a = pVar;
    }

    public static void b(Context context, Status status) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
        edit.putInt("statusCode", status.f5345a);
        edit.putString("statusMessage", status.f5346b);
        edit.putLong("timestamp", System.currentTimeMillis());
        edit.commit();
    }

    public final void a(Context context) {
        this.f4100a.getClass();
        j.f(context);
        p.a(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
    }
}
