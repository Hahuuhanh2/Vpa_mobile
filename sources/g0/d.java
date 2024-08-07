package g0;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;

/* compiled from: ContextUtil */
public final class d {

    /* compiled from: ContextUtil */
    public static class a {
        public static Context a(Context context, String str) {
            return context.createAttributionContext(str);
        }

        public static String b(Context context) {
            return context.getAttributionTag();
        }
    }

    public static Context a(Context context) {
        String b10;
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT < 30 || (b10 = a.b(context)) == null) {
            return applicationContext;
        }
        return a.a(applicationContext, b10);
    }

    public static Application b(Context context) {
        String b10;
        Context a10 = a(context);
        while (a10 instanceof ContextWrapper) {
            if (a10 instanceof Application) {
                return (Application) a10;
            }
            ContextWrapper contextWrapper = (ContextWrapper) a10;
            Context baseContext = contextWrapper.getBaseContext();
            if (Build.VERSION.SDK_INT < 30 || (b10 = a.b(contextWrapper)) == null) {
                a10 = baseContext;
            } else {
                a10 = a.a(baseContext, b10);
            }
        }
        return null;
    }
}
