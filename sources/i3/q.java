package i3;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.Method;

/* compiled from: ViewGroupUtils */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f11065a = true;

    /* renamed from: b  reason: collision with root package name */
    public static Method f11066b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f11067c;

    public static void a(ViewGroup viewGroup, boolean z10) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z10);
        } else if (f11065a) {
            try {
                viewGroup.suppressLayout(z10);
            } catch (NoSuchMethodError unused) {
                f11065a = false;
            }
        }
    }
}
