package u9;

import android.content.Context;
import android.content.SharedPreferences;
import y6.j;

/* compiled from: StorageHelper */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f15405a;

    public c(Context context, String str) {
        j.f(context);
        j.c(str);
        this.f15405a = context.getSharedPreferences(String.format("com.google.firebase.appcheck.debug.store.%s", new Object[]{str}), 0);
    }
}
