package u4;

import s4.e;

/* compiled from: EngineResource */
public final class q<Z> implements u<Z> {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f15236a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f15237b;

    /* renamed from: c  reason: collision with root package name */
    public final u<Z> f15238c;

    /* renamed from: d  reason: collision with root package name */
    public final a f15239d;

    /* renamed from: e  reason: collision with root package name */
    public final e f15240e;

    /* renamed from: f  reason: collision with root package name */
    public int f15241f;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15242n;

    /* compiled from: EngineResource */
    public interface a {
        void a(e eVar, q<?> qVar);
    }

    public q(u<Z> uVar, boolean z10, boolean z11, e eVar, a aVar) {
        j7.a.r(uVar);
        this.f15238c = uVar;
        this.f15236a = z10;
        this.f15237b = z11;
        this.f15240e = eVar;
        j7.a.r(aVar);
        this.f15239d = aVar;
    }

    public final synchronized void a() {
        if (!this.f15242n) {
            this.f15241f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    public final synchronized void b() {
        if (this.f15241f > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (!this.f15242n) {
            this.f15242n = true;
            if (this.f15237b) {
                this.f15238c.b();
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
    }

    public final Class<Z> c() {
        return this.f15238c.c();
    }

    public final void d() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f15241f;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f15241f = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f15239d.a(this.f15240e, this);
        }
    }

    public final int g() {
        return this.f15238c.g();
    }

    public final Z get() {
        return this.f15238c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f15236a + ", listener=" + this.f15239d + ", key=" + this.f15240e + ", acquired=" + this.f15241f + ", isRecycled=" + this.f15242n + ", resource=" + this.f15238c + '}';
    }
}
