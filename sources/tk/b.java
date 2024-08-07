package tk;

import java.util.Random;
import sk.j;

/* compiled from: PlatformRandom.kt */
public final class b extends a {

    /* renamed from: c  reason: collision with root package name */
    public final a f23023c = new a();

    /* compiled from: PlatformRandom.kt */
    public static final class a extends ThreadLocal<Random> {
        public final Object initialValue() {
            return new Random();
        }
    }

    public final Random d() {
        Object obj = this.f23023c.get();
        j.e(obj, "implStorage.get()");
        return (Random) obj;
    }
}
