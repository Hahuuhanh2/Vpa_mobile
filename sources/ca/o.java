package ca;

import za.b;

/* compiled from: Lazy */
public final class o<T> implements b<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f4650c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f4651a = f4650c;

    /* renamed from: b  reason: collision with root package name */
    public volatile b<T> f4652b;

    public o(b<T> bVar) {
        this.f4652b = bVar;
    }

    public final T get() {
        T t10 = this.f4651a;
        T t11 = f4650c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f4651a;
                if (t10 == t11) {
                    t10 = this.f4652b.get();
                    this.f4651a = t10;
                    this.f4652b = null;
                }
            }
        }
        return t10;
    }
}
