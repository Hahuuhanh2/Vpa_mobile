package tk;

import java.util.Random;

/* compiled from: PlatformRandom.kt */
public abstract class a extends c {
    public final int a(int i10) {
        return ((-i10) >> 31) & (d().nextInt() >>> (32 - i10));
    }

    public final int b() {
        return d().nextInt();
    }

    public abstract Random d();
}
