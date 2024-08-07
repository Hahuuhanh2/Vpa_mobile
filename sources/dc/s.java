package dc;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator */
public final class s extends w {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f8938b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f8939c;

    public s(Method method, Object obj) {
        this.f8938b = method;
        this.f8939c = obj;
    }

    public final <T> T b(Class<T> cls) {
        w.a(cls);
        return this.f8938b.invoke(this.f8939c, new Object[]{cls});
    }
}
