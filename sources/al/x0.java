package al;

import fk.g;

/* compiled from: EventLoop.common.kt */
public abstract class x0 extends a0 {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f19102f = 0;

    /* renamed from: c  reason: collision with root package name */
    public long f19103c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f19104d;

    /* renamed from: e  reason: collision with root package name */
    public g<p0<?>> f19105e;

    public final void a0(boolean z10) {
        long j10;
        long j11 = this.f19103c;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        long j12 = j11 - j10;
        this.f19103c = j12;
        if (j12 <= 0 && this.f19104d) {
            shutdown();
        }
    }

    public final void c0(p0<?> p0Var) {
        g<p0<?>> gVar = this.f19105e;
        if (gVar == null) {
            gVar = new g<>();
            this.f19105e = gVar;
        }
        gVar.addLast(p0Var);
    }

    public final void d0(boolean z10) {
        long j10;
        long j11 = this.f19103c;
        if (z10) {
            j10 = 4294967296L;
        } else {
            j10 = 1;
        }
        this.f19103c = j10 + j11;
        if (!z10) {
            this.f19104d = true;
        }
    }

    public final boolean e0() {
        if (this.f19103c >= 4294967296L) {
            return true;
        }
        return false;
    }

    public long g0() {
        if (!j0()) {
            return Long.MAX_VALUE;
        }
        return 0;
    }

    public final boolean j0() {
        p0<?> p0Var;
        g<p0<?>> gVar = this.f19105e;
        if (gVar == null) {
            return false;
        }
        if (gVar.isEmpty()) {
            p0Var = null;
        } else {
            p0Var = gVar.removeFirst();
        }
        p0 p0Var2 = p0Var;
        if (p0Var2 == null) {
            return false;
        }
        p0Var2.run();
        return true;
    }

    public void shutdown() {
    }
}
