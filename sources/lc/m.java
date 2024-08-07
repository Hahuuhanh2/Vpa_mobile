package lc;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import ca.b;
import java.util.UUID;

/* compiled from: com.google.mlkit:common@@18.7.0 */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final b<?> f12927b;

    /* renamed from: a  reason: collision with root package name */
    public final Context f12928a;

    static {
        b.a<m> b10 = b.b(m.class);
        b10.a(ca.m.b(h.class));
        b10.a(ca.m.b(Context.class));
        b10.f4619f = w.f12950a;
        f12927b = b10.b();
    }

    public m(Context context) {
        this.f12928a = context;
    }

    public final synchronized String a() {
        String string = c().getString("ml_sdk_instance_id", (String) null);
        if (string != null) {
            return string;
        }
        String uuid = UUID.randomUUID().toString();
        c().edit().putString("ml_sdk_instance_id", uuid).apply();
        return uuid;
    }

    public final synchronized long b(kc.b bVar) {
        SharedPreferences c10;
        c10 = c();
        bVar.getClass();
        return c10.getLong(String.format("downloading_begin_time_%s", new Object[]{kc.b.a()}), 0);
    }

    public final SharedPreferences c() {
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.f12928a.getSystemService("device_policy");
        if (devicePolicyManager == null || Build.VERSION.SDK_INT < 24) {
            return this.f12928a.getSharedPreferences("com.google.mlkit.internal", 0);
        }
        int storageEncryptionStatus = devicePolicyManager.getStorageEncryptionStatus();
        if (storageEncryptionStatus != 3 && storageEncryptionStatus != 5) {
            return this.f12928a.getSharedPreferences("com.google.mlkit.internal", 0);
        }
        Context k10 = this.f12928a.createDeviceProtectedStorageContext();
        k10.moveSharedPreferencesFrom(this.f12928a, "com.google.mlkit.internal");
        return k10.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
