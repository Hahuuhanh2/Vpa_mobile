package androidx.window.layout;

import android.graphics.Rect;
import java.lang.reflect.Method;
import rk.a;
import sk.j;
import sk.k;
import sk.s;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
public final class i extends k implements a<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ClassLoader f3688a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(ClassLoader classLoader) {
        super(0);
        this.f3688a = classLoader;
    }

    public final Object invoke() {
        m mVar = m.f3692a;
        ClassLoader classLoader = this.f3688a;
        mVar.getClass();
        Class<?> loadClass = classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
        boolean z10 = false;
        Method method = loadClass.getMethod("getBounds", new Class[0]);
        Method method2 = loadClass.getMethod("getType", new Class[0]);
        Method method3 = loadClass.getMethod("getState", new Class[0]);
        j.e(method, "getBoundsMethod");
        Class<?> a10 = s.a(Rect.class).a();
        j.d(a10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        if (method.getReturnType().equals(a10) && m.b(mVar, method)) {
            j.e(method2, "getTypeMethod");
            Class cls = Integer.TYPE;
            Class<?> a11 = s.a(cls).a();
            j.d(a11, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            if (method2.getReturnType().equals(a11) && m.b(mVar, method2)) {
                j.e(method3, "getStateMethod");
                Class<?> a12 = s.a(cls).a();
                j.d(a12, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                if (method3.getReturnType().equals(a12) && m.b(mVar, method3)) {
                    z10 = true;
                }
            }
        }
        return Boolean.valueOf(z10);
    }
}
