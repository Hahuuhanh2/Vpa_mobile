package gl;

import al.a0;
import al.b1;
import ik.f;
import ik.g;
import java.util.concurrent.Executor;

/* compiled from: Dispatcher.kt */
public final class b extends b1 implements Executor {

    /* renamed from: c  reason: collision with root package name */
    public static final b f20480c = new b();

    /* renamed from: d  reason: collision with root package name */
    public static final a0 f20481d;

    /* JADX WARNING: type inference failed for: r2v3, types: [fl.g] */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            gl.b r0 = new gl.b
            r0.<init>()
            f20480c = r0
            gl.l r0 = gl.l.f20497c
            int r1 = fl.u.f20263a
            r2 = 64
            if (r2 >= r1) goto L_0x0010
            goto L_0x0011
        L_0x0010:
            r1 = r2
        L_0x0011:
            r2 = 12
            java.lang.String r3 = "kotlinx.coroutines.io.parallelism"
            r4 = 0
            int r1 = p3.l0.O0(r3, r1, r4, r4, r2)
            r0.getClass()
            j7.a.t(r1)
            int r2 = gl.k.f20492d
            if (r1 < r2) goto L_0x0025
            goto L_0x002e
        L_0x0025:
            j7.a.t(r1)
            fl.g r2 = new fl.g
            r2.<init>(r0, r1)
            r0 = r2
        L_0x002e:
            f20481d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.b.<clinit>():void");
    }

    public final void U(f fVar, Runnable runnable) {
        f20481d.U(fVar, runnable);
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void execute(Runnable runnable) {
        s(g.f20653a, runnable);
    }

    public final void s(f fVar, Runnable runnable) {
        f20481d.s(fVar, runnable);
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
