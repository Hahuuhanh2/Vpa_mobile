package androidx.window.layout;

import java.lang.reflect.Method;
import rk.a;
import sk.k;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
public final class j extends k implements a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClassLoader f3689a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(ClassLoader classLoader) {
        super(0);
        this.f3689a = classLoader;
    }

    public final Object invoke() {
        m mVar = m.f3692a;
        ClassLoader classLoader = this.f3689a;
        mVar.getClass();
        boolean z10 = false;
        Method method = classLoader.loadClass("androidx.window.extensions.WindowExtensions").getMethod("getWindowLayoutComponent", new Class[0]);
        Class<?> loadClass = this.f3689a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        sk.j.e(method, "getWindowLayoutComponentMethod");
        if (m.b(mVar, method)) {
            sk.j.e(loadClass, "windowLayoutComponentClass");
            if (method.getReturnType().equals(loadClass)) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
