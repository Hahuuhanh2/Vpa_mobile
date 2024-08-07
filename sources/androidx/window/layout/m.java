package androidx.window.layout;

import android.os.Build;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import ek.g;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import sk.k;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final m f3692a = new m();

    /* renamed from: b  reason: collision with root package name */
    public static final g f3693b = j7.a.b0(a.f3694a);

    /* compiled from: SafeWindowLayoutComponentProvider.kt */
    public static final class a extends k implements rk.a<WindowLayoutComponent> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3694a = new a();

        public a() {
            super(0);
        }

        public static WindowLayoutComponent a() {
            ClassLoader classLoader = m.class.getClassLoader();
            if (classLoader == null || !m.a(m.f3692a, classLoader)) {
                WindowLayoutComponent windowLayoutComponent = null;
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                WindowLayoutComponent windowLayoutComponent2 = null;
                return null;
            }
        }

        public final /* bridge */ /* synthetic */ Object invoke() {
            return a();
        }
    }

    public static final boolean a(m mVar, ClassLoader classLoader) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        mVar.getClass();
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        try {
            z10 = ((Boolean) new l(classLoader).invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            z10 = false;
        }
        if (!z10) {
            return false;
        }
        try {
            z11 = ((Boolean) new j(classLoader).invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused2) {
            z11 = false;
        }
        if (!z11) {
            return false;
        }
        try {
            z12 = ((Boolean) new k(classLoader).invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused3) {
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        try {
            z13 = ((Boolean) new i(classLoader).invoke()).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused4) {
            z13 = false;
        }
        if (z13) {
            return true;
        }
        return false;
    }

    public static final boolean b(m mVar, Method method) {
        mVar.getClass();
        return Modifier.isPublic(method.getModifiers());
    }

    public static WindowLayoutComponent c() {
        return (WindowLayoutComponent) f3693b.getValue();
    }
}
