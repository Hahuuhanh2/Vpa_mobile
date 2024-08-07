package u4;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.util.ArrayList;
import s4.a;
import s4.e;
import u4.h;
import y4.n;

/* compiled from: SourceGenerator */
public final class z implements h, h.a {

    /* renamed from: a  reason: collision with root package name */
    public final i<?> f15274a;

    /* renamed from: b  reason: collision with root package name */
    public final h.a f15275b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f15276c;

    /* renamed from: d  reason: collision with root package name */
    public volatile e f15277d;

    /* renamed from: e  reason: collision with root package name */
    public volatile Object f15278e;

    /* renamed from: f  reason: collision with root package name */
    public volatile n.a<?> f15279f;

    /* renamed from: n  reason: collision with root package name */
    public volatile f f15280n;

    public z(i<?> iVar, h.a aVar) {
        this.f15274a = iVar;
        this.f15275b = aVar;
    }

    public final boolean a() {
        boolean z10;
        boolean z11;
        if (this.f15278e != null) {
            Object obj = this.f15278e;
            this.f15278e = null;
            try {
                if (!d(obj)) {
                    return true;
                }
            } catch (IOException unused) {
                Log.isLoggable("SourceGenerator", 3);
            }
        }
        if (this.f15277d != null && this.f15277d.a()) {
            return true;
        }
        this.f15277d = null;
        this.f15279f = null;
        boolean z12 = false;
        while (!z12) {
            if (this.f15276c < this.f15274a.b().size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            ArrayList b10 = this.f15274a.b();
            int i10 = this.f15276c;
            this.f15276c = i10 + 1;
            this.f15279f = (n.a) b10.get(i10);
            if (this.f15279f != null) {
                if (!this.f15274a.f15130p.c(this.f15279f.f17487c.d())) {
                    if (this.f15274a.c(this.f15279f.f17487c.a()) != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                    }
                }
                this.f15279f.f17487c.e(this.f15274a.f15129o, new y(this, this.f15279f));
                z12 = true;
            }
        }
        return z12;
    }

    public final void b() {
        throw new UnsupportedOperationException();
    }

    public final void c(e eVar, Exception exc, d<?> dVar, a aVar) {
        this.f15275b.c(eVar, exc, dVar, this.f15279f.f17487c.d());
    }

    public final void cancel() {
        n.a<?> aVar = this.f15279f;
        if (aVar != null) {
            aVar.f17487c.cancel();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r0 = "SourceGenerator"
            int r1 = o5.h.f13744a
            android.os.SystemClock.elapsedRealtimeNanos()
            r1 = 1
            r2 = 0
            u4.i<?> r3 = r10.f15274a     // Catch:{ all -> 0x00a2 }
            com.bumptech.glide.h r3 = r3.f15117c     // Catch:{ all -> 0x00a2 }
            com.bumptech.glide.Registry r3 = r3.f4926b     // Catch:{ all -> 0x00a2 }
            com.bumptech.glide.load.data.e r3 = r3.f(r11)     // Catch:{ all -> 0x00a2 }
            java.lang.Object r4 = r3.a()     // Catch:{ all -> 0x00a2 }
            u4.i<?> r5 = r10.f15274a     // Catch:{ all -> 0x00a2 }
            s4.d r5 = r5.e(r4)     // Catch:{ all -> 0x00a2 }
            u4.g r6 = new u4.g     // Catch:{ all -> 0x00a2 }
            u4.i<?> r7 = r10.f15274a     // Catch:{ all -> 0x00a2 }
            s4.h r7 = r7.f15123i     // Catch:{ all -> 0x00a2 }
            r6.<init>(r5, r4, r7)     // Catch:{ all -> 0x00a2 }
            u4.f r4 = new u4.f     // Catch:{ all -> 0x00a2 }
            y4.n$a<?> r7 = r10.f15279f     // Catch:{ all -> 0x00a2 }
            s4.e r7 = r7.f17485a     // Catch:{ all -> 0x00a2 }
            u4.i<?> r8 = r10.f15274a     // Catch:{ all -> 0x00a2 }
            s4.e r9 = r8.f15128n     // Catch:{ all -> 0x00a2 }
            r4.<init>(r7, r9)     // Catch:{ all -> 0x00a2 }
            u4.j$d r7 = r8.f15122h     // Catch:{ all -> 0x00a2 }
            u4.m$c r7 = (u4.m.c) r7     // Catch:{ all -> 0x00a2 }
            w4.a r7 = r7.a()     // Catch:{ all -> 0x00a2 }
            r7.o(r4, r6)     // Catch:{ all -> 0x00a2 }
            r6 = 2
            boolean r6 = android.util.Log.isLoggable(r0, r6)     // Catch:{ all -> 0x00a2 }
            if (r6 == 0) goto L_0x0051
            r4.toString()     // Catch:{ all -> 0x00a2 }
            r11.toString()     // Catch:{ all -> 0x00a2 }
            r5.toString()     // Catch:{ all -> 0x00a2 }
            android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00a2 }
        L_0x0051:
            java.io.File r5 = r7.q(r4)     // Catch:{ all -> 0x00a2 }
            if (r5 == 0) goto L_0x0072
            r10.f15280n = r4     // Catch:{ all -> 0x00a2 }
            u4.e r11 = new u4.e     // Catch:{ all -> 0x00a2 }
            y4.n$a<?> r0 = r10.f15279f     // Catch:{ all -> 0x00a2 }
            s4.e r0 = r0.f17485a     // Catch:{ all -> 0x00a2 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x00a2 }
            u4.i<?> r3 = r10.f15274a     // Catch:{ all -> 0x00a2 }
            r11.<init>(r0, r3, r10)     // Catch:{ all -> 0x00a2 }
            r10.f15277d = r11     // Catch:{ all -> 0x00a2 }
            y4.n$a<?> r11 = r10.f15279f
            com.bumptech.glide.load.data.d<Data> r11 = r11.f17487c
            r11.b()
            return r1
        L_0x0072:
            r4 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00a2 }
            if (r0 == 0) goto L_0x0081
            u4.f r0 = r10.f15280n     // Catch:{ all -> 0x00a2 }
            java.util.Objects.toString(r0)     // Catch:{ all -> 0x00a2 }
            r11.toString()     // Catch:{ all -> 0x00a2 }
        L_0x0081:
            u4.h$a r11 = r10.f15275b     // Catch:{ all -> 0x00a0 }
            y4.n$a<?> r0 = r10.f15279f     // Catch:{ all -> 0x00a0 }
            s4.e r4 = r0.f17485a     // Catch:{ all -> 0x00a0 }
            java.lang.Object r5 = r3.a()     // Catch:{ all -> 0x00a0 }
            y4.n$a<?> r0 = r10.f15279f     // Catch:{ all -> 0x00a0 }
            com.bumptech.glide.load.data.d<Data> r6 = r0.f17487c     // Catch:{ all -> 0x00a0 }
            y4.n$a<?> r0 = r10.f15279f     // Catch:{ all -> 0x00a0 }
            com.bumptech.glide.load.data.d<Data> r0 = r0.f17487c     // Catch:{ all -> 0x00a0 }
            s4.a r7 = r0.d()     // Catch:{ all -> 0x00a0 }
            y4.n$a<?> r0 = r10.f15279f     // Catch:{ all -> 0x00a0 }
            s4.e r8 = r0.f17485a     // Catch:{ all -> 0x00a0 }
            r3 = r11
            r3.i(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a0 }
            return r2
        L_0x00a0:
            r11 = move-exception
            goto L_0x00a4
        L_0x00a2:
            r11 = move-exception
            r1 = r2
        L_0x00a4:
            if (r1 != 0) goto L_0x00ad
            y4.n$a<?> r0 = r10.f15279f
            com.bumptech.glide.load.data.d<Data> r0 = r0.f17487c
            r0.b()
        L_0x00ad:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u4.z.d(java.lang.Object):boolean");
    }

    public final void i(e eVar, Object obj, d<?> dVar, a aVar, e eVar2) {
        this.f15275b.i(eVar, obj, dVar, this.f15279f.f17487c.d(), eVar);
    }
}
