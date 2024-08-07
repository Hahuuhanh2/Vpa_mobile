package dc;

import java.lang.reflect.Method;

/* compiled from: UnsafeAllocator */
public final class t extends w {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Method f8940b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f8941c;

    public t(int i10, Method method) {
        this.f8940b = method;
        this.f8941c = i10;
    }

    public final <T> T b(Class<T> cls) {
        w.a(cls);
        return this.f8940b.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f8941c)});
    }
}
