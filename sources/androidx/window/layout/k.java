package androidx.window.layout;

import android.app.Activity;
import j$.util.function.Consumer;
import java.lang.reflect.Method;
import rk.a;
import sk.j;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
public final class k extends sk.k implements a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClassLoader f3690a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(ClassLoader classLoader) {
        super(0);
        this.f3690a = classLoader;
    }

    public final Object invoke() {
        m mVar = m.f3692a;
        ClassLoader classLoader = this.f3690a;
        mVar.getClass();
        Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        boolean z10 = false;
        Method method = loadClass.getMethod("addWindowLayoutInfoListener", new Class[]{Activity.class, Consumer.class});
        Method method2 = loadClass.getMethod("removeWindowLayoutInfoListener", new Class[]{Consumer.class});
        j.e(method, "addListenerMethod");
        if (m.b(mVar, method)) {
            j.e(method2, "removeListenerMethod");
            if (m.b(mVar, method2)) {
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
