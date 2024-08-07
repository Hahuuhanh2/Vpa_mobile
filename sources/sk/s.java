package sk;

import wk.b;

/* compiled from: Reflection */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final t f22932a;

    /* renamed from: b  reason: collision with root package name */
    public static final b[] f22933b = new b[0];

    static {
        t tVar = null;
        try {
            tVar = (t) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (tVar == null) {
            tVar = new t();
        }
        f22932a = tVar;
    }

    public static d a(Class cls) {
        f22932a.getClass();
        return new d(cls);
    }
}
