package v9;

import android.content.Context;
import android.content.SharedPreferences;
import ca.o;
import m9.b;
import y6.j;

/* compiled from: StorageHelper */
public final class k {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f16115b = 0;

    /* renamed from: a  reason: collision with root package name */
    public o<SharedPreferences> f16116a;

    static {
        new b(k.class.getSimpleName());
    }

    public k(Context context, String str) {
        j.f(context);
        j.c(str);
        this.f16116a = new o<>(new j(0, context, String.format("com.google.firebase.appcheck.store.%s", new Object[]{str})));
    }
}
