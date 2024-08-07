package ll;

import java.util.concurrent.TimeUnit;
import sk.j;

/* compiled from: ForwardingTimeout.kt */
public final class n extends d0 {

    /* renamed from: e  reason: collision with root package name */
    public d0 f20888e;

    public n(d0 d0Var) {
        j.f(d0Var, "delegate");
        this.f20888e = d0Var;
    }

    public final d0 a() {
        return this.f20888e.a();
    }

    public final d0 b() {
        return this.f20888e.b();
    }

    public final long c() {
        return this.f20888e.c();
    }

    public final d0 d(long j10) {
        return this.f20888e.d(j10);
    }

    public final boolean e() {
        return this.f20888e.e();
    }

    public final void f() {
        this.f20888e.f();
    }

    public final d0 g(long j10, TimeUnit timeUnit) {
        j.f(timeUnit, "unit");
        return this.f20888e.g(j10, timeUnit);
    }
}
