package ke;

import java.util.LinkedList;

/* compiled from: SelectorProviders */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    public static volatile b f12544b;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<a> f12545a = new LinkedList<>();

    public static b a() {
        if (f12544b == null) {
            synchronized (b.class) {
                if (f12544b == null) {
                    f12544b = new b();
                }
            }
        }
        return f12544b;
    }

    public final a b() {
        if (this.f12545a.size() > 0) {
            return this.f12545a.getLast();
        }
        return new a();
    }
}
