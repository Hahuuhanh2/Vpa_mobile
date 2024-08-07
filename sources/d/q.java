package d;

import android.app.Activity;
import androidx.lifecycle.n;
import java.lang.reflect.Field;

/* compiled from: ImmLeaksCleaner */
public final class q implements n {

    /* renamed from: b  reason: collision with root package name */
    public static int f8445b;

    /* renamed from: c  reason: collision with root package name */
    public static Field f8446c;

    /* renamed from: d  reason: collision with root package name */
    public static Field f8447d;

    /* renamed from: e  reason: collision with root package name */
    public static Field f8448e;

    /* renamed from: a  reason: collision with root package name */
    public Activity f8449a;

    public q(Activity activity) {
        this.f8449a = activity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(r2.l r3, androidx.lifecycle.i.a r4) {
        /*
            r2 = this;
            androidx.lifecycle.i$a r3 = androidx.lifecycle.i.a.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f8445b
            r4 = 1
            if (r3 != 0) goto L_0x0036
            r3 = 2
            f8445b = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mServedView"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0036 }
            f8447d = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0036 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mNextServedView"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0036 }
            f8448e = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0036 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0036 }
            f8446c = r3     // Catch:{ NoSuchFieldException -> 0x0036 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0036 }
            f8445b = r4     // Catch:{ NoSuchFieldException -> 0x0036 }
        L_0x0036:
            int r3 = f8445b
            if (r3 != r4) goto L_0x0077
            android.app.Activity r3 = r2.f8449a
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = f8446c     // Catch:{ IllegalAccessException -> 0x0077 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x0077 }
            if (r4 != 0) goto L_0x004d
            return
        L_0x004d:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = f8447d     // Catch:{ IllegalAccessException -> 0x0073, ClassCastException -> 0x0071 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x0073, ClassCastException -> 0x0071 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x0073, ClassCastException -> 0x0071 }
            if (r0 != 0) goto L_0x005a
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x005a:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0062
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x0062:
            java.lang.reflect.Field r0 = f8448e     // Catch:{ IllegalAccessException -> 0x006d }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x006d }
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            r3.isActive()
            goto L_0x0077
        L_0x006d:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x006f:
            r3 = move-exception
            goto L_0x0075
        L_0x0071:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x0073:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            return
        L_0x0075:
            monitor-exit(r4)     // Catch:{ all -> 0x006f }
            throw r3
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.q.q(r2.l, androidx.lifecycle.i$a):void");
    }
}
