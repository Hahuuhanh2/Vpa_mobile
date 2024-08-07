package ba;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final e0 f4108a = new e0();

    public static void a(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String remove : sharedPreferences.getAll().keySet()) {
            edit.remove(remove);
        }
        edit.apply();
    }

    public static final SharedPreferences b(Context context, String str) {
        return context.getSharedPreferences(String.format("com.google.firebase.auth.internal.browserSignInSessionStore.%s", new Object[]{str}), 0);
    }
}
