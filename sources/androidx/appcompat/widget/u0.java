package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: ViewUtils */
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    public static Method f1235a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f1236b;

    static {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 27) {
            z10 = true;
        } else {
            z10 = false;
        }
        f1236b = z10;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", new Class[]{Rect.class, Rect.class});
            f1235a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                f1235a.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
        }
    }

    public static boolean a(View view) {
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if (d0.e.d(view) == 1) {
            return true;
        }
        return false;
    }
}
