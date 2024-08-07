package uk;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import sk.j;

/* compiled from: PlatformThreadLocalRandom.kt */
public final class a extends tk.a {
    public final int c(int i10, int i11) {
        return ThreadLocalRandom.current().nextInt(i10, i11);
    }

    public final Random d() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        j.e(current, "current()");
        return current;
    }
}
