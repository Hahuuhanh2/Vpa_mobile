package ba;

import android.content.SharedPreferences;
import com.google.android.gms.internal.p001firebaseauthapi.zzam;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public static final zzam f4122a = zzam.zzj("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp");

    /* renamed from: b  reason: collision with root package name */
    public static final p f4123b = new p();

    public static final void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        zzam zzam = f4122a;
        int size = zzam.size();
        for (int i10 = 0; i10 < size; i10++) {
            edit.remove((String) zzam.get(i10));
        }
        edit.commit();
    }
}
