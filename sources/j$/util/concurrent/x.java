package j$.util.concurrent;

final class x extends ThreadLocal {
    x() {
    }

    /* access modifiers changed from: protected */
    public final Object initialValue() {
        return new ThreadLocalRandom(0);
    }
}
