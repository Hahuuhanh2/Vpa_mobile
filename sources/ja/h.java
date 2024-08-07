package ja;

import ia.l;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import na.c;

/* compiled from: UserMetadata */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final d f11827a;

    /* renamed from: b  reason: collision with root package name */
    public final l f11828b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11829c;

    /* renamed from: d  reason: collision with root package name */
    public final a f11830d = new a(false);

    /* renamed from: e  reason: collision with root package name */
    public final a f11831e = new a(true);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicMarkableReference<String> f11832f = new AtomicMarkableReference<>((Object) null, false);

    /* compiled from: UserMetadata */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicMarkableReference<b> f11833a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReference<Callable<Void>> f11834b = new AtomicReference<>((Object) null);

        /* renamed from: c  reason: collision with root package name */
        public final boolean f11835c;

        public a(boolean z10) {
            int i10;
            this.f11835c = z10;
            if (z10) {
                i10 = 8192;
            } else {
                i10 = 1024;
            }
            this.f11833a = new AtomicMarkableReference<>(new b(i10), false);
        }
    }

    public h(String str, c cVar, l lVar) {
        this.f11829c = str;
        this.f11827a = new d(cVar);
        this.f11828b = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r2.compareAndSet((java.lang.Object) null, r6) == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        if (r2.get() == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        if (r1 == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r0.f11836d.f11828b.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r6 = new ja.g(r0, 0);
        r2 = r0.f11834b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r6) {
        /*
            r5 = this;
            ja.h$a r0 = r5.f11831e
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicMarkableReference<ja.b> r1 = r0.f11833a     // Catch:{ all -> 0x0041 }
            java.lang.Object r1 = r1.getReference()     // Catch:{ all -> 0x0041 }
            ja.b r1 = (ja.b) r1     // Catch:{ all -> 0x0041 }
            boolean r6 = r1.b(r6)     // Catch:{ all -> 0x0041 }
            r1 = 0
            if (r6 != 0) goto L_0x0014
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            goto L_0x0040
        L_0x0014:
            java.util.concurrent.atomic.AtomicMarkableReference<ja.b> r6 = r0.f11833a     // Catch:{ all -> 0x0041 }
            java.lang.Object r2 = r6.getReference()     // Catch:{ all -> 0x0041 }
            ja.b r2 = (ja.b) r2     // Catch:{ all -> 0x0041 }
            r3 = 1
            r6.set(r2, r3)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            ja.g r6 = new ja.g
            r6.<init>(r0, r1)
            java.util.concurrent.atomic.AtomicReference<java.util.concurrent.Callable<java.lang.Void>> r2 = r0.f11834b
        L_0x0028:
            r4 = 0
            boolean r4 = r2.compareAndSet(r4, r6)
            if (r4 == 0) goto L_0x0031
            r1 = r3
            goto L_0x0037
        L_0x0031:
            java.lang.Object r4 = r2.get()
            if (r4 == 0) goto L_0x0028
        L_0x0037:
            if (r1 == 0) goto L_0x0040
            ja.h r0 = ja.h.this
            ia.l r0 = r0.f11828b
            r0.a(r6)
        L_0x0040:
            return
        L_0x0041:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.h.a(java.lang.String):void");
    }
}
