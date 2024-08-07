package androidx.window.layout;

import java.lang.reflect.Method;
import rk.a;
import sk.j;
import sk.k;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
public final class l extends k implements a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClassLoader f3691a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(ClassLoader classLoader) {
        super(0);
        this.f3691a = classLoader;
    }

    public final Object invoke() {
        m mVar = m.f3692a;
        ClassLoader classLoader = this.f3691a;
        mVar.getClass();
        boolean z10 = false;
        Method declaredMethod = classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", new Class[0]);
        Class<?> loadClass = this.f3691a.loadClass("androidx.window.extensions.WindowExtensions");
        j.e(declaredMethod, "getWindowExtensionsMethod");
        j.e(loadClass, "windowExtensionsClass");
        if (declaredMethod.getReturnType().equals(loadClass) && m.b(mVar, declaredMethod)) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }
}
