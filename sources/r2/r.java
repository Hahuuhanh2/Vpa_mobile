package r2;

import al.a0;
import al.q1;
import al.r0;
import androidx.appcompat.app.p;
import fl.m;
import gl.c;
import ik.f;
import sk.j;

/* compiled from: PausingDispatcher.kt */
public final class r extends a0 {

    /* renamed from: c  reason: collision with root package name */
    public final d f14488c = new d();

    public final boolean W(f fVar) {
        boolean z10;
        j.f(fVar, "context");
        c cVar = r0.f19084a;
        if (m.f20254a.a0().W(fVar)) {
            return true;
        }
        d dVar = this.f14488c;
        if (dVar.f14468b || !dVar.f14467a) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    public final void s(f fVar, Runnable runnable) {
        boolean z10;
        j.f(fVar, "context");
        j.f(runnable, "block");
        d dVar = this.f14488c;
        dVar.getClass();
        c cVar = r0.f19084a;
        q1 a02 = m.f20254a.a0();
        if (!a02.W(fVar)) {
            if (dVar.f14468b || !dVar.f14467a) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if (dVar.f14470d.offer(runnable)) {
                    dVar.a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            }
        }
        a02.s(fVar, new p(23, dVar, runnable));
    }
}
