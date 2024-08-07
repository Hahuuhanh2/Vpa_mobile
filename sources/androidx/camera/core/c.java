package androidx.camera.core;

import c0.e0;
import c0.g0;
import f0.d0;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: ImageAnalysisNonBlockingAnalyzer */
public final class c extends e0 {
    public final Executor A;
    public final Object B = new Object();
    public d C;
    public b D;

    /* compiled from: ImageAnalysisNonBlockingAnalyzer */
    public class a implements i0.c<Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f1285a;

        public a(b bVar) {
            this.f1285a = bVar;
        }

        public final void a(Throwable th2) {
            this.f1285a.close();
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
            Void voidR = (Void) obj;
        }
    }

    /* compiled from: ImageAnalysisNonBlockingAnalyzer */
    public static class b extends b {

        /* renamed from: d  reason: collision with root package name */
        public final WeakReference<c> f1286d;

        public b(d dVar, c cVar) {
            super(dVar);
            this.f1286d = new WeakReference<>(cVar);
            d(new g0(this, 0));
        }
    }

    public c(Executor executor) {
        this.A = executor;
    }

    public final d a(d0 d0Var) {
        return d0Var.d();
    }

    public final void c() {
        synchronized (this.B) {
            d dVar = this.C;
            if (dVar != null) {
                dVar.close();
                this.C = null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(androidx.camera.core.d r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.B
            monitor-enter(r0)
            boolean r1 = r5.f4247z     // Catch:{ all -> 0x0053 }
            if (r1 != 0) goto L_0x000c
            r6.close()     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return
        L_0x000c:
            androidx.camera.core.c$b r1 = r5.D     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0035
            c0.k0 r1 = r6.f0()     // Catch:{ all -> 0x0053 }
            long r1 = r1.c()     // Catch:{ all -> 0x0053 }
            androidx.camera.core.c$b r3 = r5.D     // Catch:{ all -> 0x0053 }
            c0.k0 r3 = r3.f0()     // Catch:{ all -> 0x0053 }
            long r3 = r3.c()     // Catch:{ all -> 0x0053 }
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 > 0) goto L_0x002a
            r6.close()     // Catch:{ all -> 0x0053 }
            goto L_0x0033
        L_0x002a:
            androidx.camera.core.d r1 = r5.C     // Catch:{ all -> 0x0053 }
            if (r1 == 0) goto L_0x0031
            r1.close()     // Catch:{ all -> 0x0053 }
        L_0x0031:
            r5.C = r6     // Catch:{ all -> 0x0053 }
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return
        L_0x0035:
            androidx.camera.core.c$b r1 = new androidx.camera.core.c$b     // Catch:{ all -> 0x0053 }
            r1.<init>(r6, r5)     // Catch:{ all -> 0x0053 }
            r5.D = r1     // Catch:{ all -> 0x0053 }
            v8.a r6 = r5.b(r1)     // Catch:{ all -> 0x0053 }
            androidx.camera.core.c$a r2 = new androidx.camera.core.c$a     // Catch:{ all -> 0x0053 }
            r2.<init>(r1)     // Catch:{ all -> 0x0053 }
            h0.a r1 = j7.a.x()     // Catch:{ all -> 0x0053 }
            i0.f$b r3 = new i0.f$b     // Catch:{ all -> 0x0053 }
            r3.<init>(r6, r2)     // Catch:{ all -> 0x0053 }
            r6.b(r3, r1)     // Catch:{ all -> 0x0053 }
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            return
        L_0x0053:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0053 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.c.e(androidx.camera.core.d):void");
    }
}
