package dc;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator */
public final class u extends w {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f8942b;

    public u(Method method) {
        this.f8942b = method;
    }

    public final <T> T b(Class<T> cls) {
        w.a(cls);
        return this.f8942b.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
