package ng;

import dj.d;

/* compiled from: DaggerApp_HiltComponents_SingletonC */
public final class l extends c {

    /* renamed from: a  reason: collision with root package name */
    public final p f21578a;

    /* renamed from: b  reason: collision with root package name */
    public final l f21579b = this;

    /* renamed from: c  reason: collision with root package name */
    public dk.a<zi.a> f21580c;

    /* compiled from: DaggerApp_HiltComponents_SingletonC */
    public static final class a<T> implements dk.a<T> {
        public final T get() {
            return new d();
        }
    }

    public l(p pVar) {
        this.f21578a = pVar;
        this.f21580c = ij.a.a(new a());
    }

    public final zi.a a() {
        return this.f21580c.get();
    }

    public final i b() {
        return new i(this.f21578a, this.f21579b);
    }
}
