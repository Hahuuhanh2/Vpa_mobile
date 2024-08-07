package u4;

import p5.a;
import p5.d;

/* compiled from: LockedResource */
public final class t<Z> implements u<Z>, a.d {

    /* renamed from: e  reason: collision with root package name */
    public static final a.c f15246e = p5.a.a(20, new a());

    /* renamed from: a  reason: collision with root package name */
    public final d.a f15247a = new d.a();

    /* renamed from: b  reason: collision with root package name */
    public u<Z> f15248b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15249c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f15250d;

    /* compiled from: LockedResource */
    public class a implements a.b<t<?>> {
        public final Object a() {
            return new t();
        }
    }

    public final synchronized void a() {
        this.f15247a.a();
        if (this.f15249c) {
            this.f15249c = false;
            if (this.f15250d) {
                b();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    public final synchronized void b() {
        this.f15247a.a();
        this.f15250d = true;
        if (!this.f15249c) {
            this.f15248b.b();
            this.f15248b = null;
            f15246e.a(this);
        }
    }

    public final Class<Z> c() {
        return this.f15248b.c();
    }

    public final int g() {
        return this.f15248b.g();
    }

    public final Z get() {
        return this.f15248b.get();
    }

    public final d.a j() {
        return this.f15247a;
    }
}
