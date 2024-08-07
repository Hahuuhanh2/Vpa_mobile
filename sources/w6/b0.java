package w6;

import android.app.PendingIntent;
import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import q7.f;
import t6.h;
import w6.h;
import y6.a;
import y6.i;
import y6.j;
import z6.d;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class b0 implements c.a, c.b {

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList f16546a = new LinkedList();

    /* renamed from: b  reason: collision with root package name */
    public final a.f f16547b;

    /* renamed from: c  reason: collision with root package name */
    public final a f16548c;

    /* renamed from: d  reason: collision with root package name */
    public final s f16549d;

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f16550e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final HashMap f16551f = new HashMap();

    /* renamed from: j  reason: collision with root package name */
    public final int f16552j;

    /* renamed from: k  reason: collision with root package name */
    public final u0 f16553k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f16554l;

    /* renamed from: m  reason: collision with root package name */
    public final ArrayList f16555m = new ArrayList();

    /* renamed from: n  reason: collision with root package name */
    public ConnectionResult f16556n = null;

    /* renamed from: o  reason: collision with root package name */
    public int f16557o = 0;

    /* renamed from: p  reason: collision with root package name */
    public final /* synthetic */ d f16558p;

    public b0(d dVar, b bVar) {
        this.f16558p = dVar;
        a.f zab = bVar.zab(dVar.f16582n.getLooper(), this);
        this.f16547b = zab;
        this.f16548c = bVar.getApiKey();
        this.f16549d = new s();
        this.f16552j = bVar.zaa();
        if (zab.requiresSignIn()) {
            this.f16553k = bVar.zac(dVar.f16573e, dVar.f16582n);
        } else {
            this.f16553k = null;
        }
    }

    public final Feature a(Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] availableFeatures = this.f16547b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new Feature[0];
            }
            v0.b bVar = new v0.b(r3);
            for (Feature feature : availableFeatures) {
                bVar.put(feature.f5327a, Long.valueOf(feature.P0()));
            }
            for (Feature feature2 : featureArr) {
                Long l10 = (Long) bVar.getOrDefault(feature2.f5327a, null);
                if (l10 == null || l10.longValue() < feature2.P0()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    public final void b(ConnectionResult connectionResult) {
        Iterator it = this.f16550e.iterator();
        if (it.hasNext()) {
            f1 f1Var = (f1) it.next();
            if (i.a(connectionResult, ConnectionResult.f5319e)) {
                this.f16547b.getEndpointPackageName();
            }
            f1Var.getClass();
            throw null;
        }
        this.f16550e.clear();
    }

    public final void c(Status status) {
        j.b(this.f16558p.f16582n);
        d(status, (RuntimeException) null, false);
    }

    public final void d(Status status, RuntimeException runtimeException, boolean z10) {
        boolean z11;
        j.b(this.f16558p.f16582n);
        boolean z12 = false;
        if (status != null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (runtimeException == null) {
            z12 = true;
        }
        if (z11 != z12) {
            Iterator it = this.f16546a.iterator();
            while (it.hasNext()) {
                e1 e1Var = (e1) it.next();
                if (!z10 || e1Var.f16593a == 2) {
                    if (status != null) {
                        e1Var.a(status);
                    } else {
                        e1Var.b(runtimeException);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public final void e() {
        ArrayList arrayList = new ArrayList(this.f16546a);
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            e1 e1Var = (e1) arrayList.get(i10);
            if (this.f16547b.isConnected()) {
                if (j(e1Var)) {
                    this.f16546a.remove(e1Var);
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public final void f() {
        j.b(this.f16558p.f16582n);
        this.f16556n = null;
        b(ConnectionResult.f5319e);
        i();
        Iterator it = this.f16551f.values().iterator();
        if (!it.hasNext()) {
            e();
            h();
            return;
        }
        ((n0) it.next()).getClass();
        throw null;
    }

    public final void g(int i10) {
        j.b(this.f16558p.f16582n);
        this.f16556n = null;
        this.f16554l = true;
        s sVar = this.f16549d;
        String lastDisconnectMessage = this.f16547b.getLastDisconnectMessage();
        sVar.getClass();
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(lastDisconnectMessage);
        }
        sVar.a(new Status(20, sb2.toString(), (PendingIntent) null, (ConnectionResult) null), true);
        zau zau = this.f16558p.f16582n;
        Message obtain = Message.obtain(zau, 9, this.f16548c);
        this.f16558p.getClass();
        zau.sendMessageDelayed(obtain, 5000);
        zau zau2 = this.f16558p.f16582n;
        Message obtain2 = Message.obtain(zau2, 11, this.f16548c);
        this.f16558p.getClass();
        zau2.sendMessageDelayed(obtain2, 120000);
        this.f16558p.f16575g.f17602a.clear();
        for (n0 n0Var : this.f16551f.values()) {
            n0Var.f16632a.run();
        }
    }

    public final void h() {
        this.f16558p.f16582n.removeMessages(12, this.f16548c);
        zau zau = this.f16558p.f16582n;
        zau.sendMessageDelayed(zau.obtainMessage(12, this.f16548c), this.f16558p.f16569a);
    }

    public final void i() {
        if (this.f16554l) {
            this.f16558p.f16582n.removeMessages(11, this.f16548c);
            this.f16558p.f16582n.removeMessages(9, this.f16548c);
            this.f16554l = false;
        }
    }

    public final boolean j(e1 e1Var) {
        if (!(e1Var instanceof h0)) {
            e1Var.d(this.f16549d, this.f16547b.requiresSignIn());
            try {
                e1Var.c(this);
            } catch (DeadObjectException unused) {
                m(1);
                this.f16547b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        h0 h0Var = (h0) e1Var;
        Feature a10 = a(h0Var.g(this));
        if (a10 == null) {
            e1Var.d(this.f16549d, this.f16547b.requiresSignIn());
            try {
                e1Var.c(this);
            } catch (DeadObjectException unused2) {
                m(1);
                this.f16547b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        this.f16547b.getClass();
        if (!this.f16558p.f16583o || !h0Var.f(this)) {
            h0Var.b(new UnsupportedApiCallException(a10));
            return true;
        }
        c0 c0Var = new c0(this.f16548c, a10);
        int indexOf = this.f16555m.indexOf(c0Var);
        if (indexOf >= 0) {
            c0 c0Var2 = (c0) this.f16555m.get(indexOf);
            this.f16558p.f16582n.removeMessages(15, c0Var2);
            zau zau = this.f16558p.f16582n;
            Message obtain = Message.obtain(zau, 15, c0Var2);
            this.f16558p.getClass();
            zau.sendMessageDelayed(obtain, 5000);
            return false;
        }
        this.f16555m.add(c0Var);
        zau zau2 = this.f16558p.f16582n;
        Message obtain2 = Message.obtain(zau2, 15, c0Var);
        this.f16558p.getClass();
        zau2.sendMessageDelayed(obtain2, 5000);
        zau zau3 = this.f16558p.f16582n;
        Message obtain3 = Message.obtain(zau3, 16, c0Var);
        this.f16558p.getClass();
        zau3.sendMessageDelayed(obtain3, 120000);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (k(connectionResult)) {
            return false;
        }
        this.f16558p.c(connectionResult, this.f16552j);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean k(com.google.android.gms.common.ConnectionResult r8) {
        /*
            r7 = this;
            java.lang.Object r0 = w6.d.f16567r
            monitor-enter(r0)
            w6.d r1 = r7.f16558p     // Catch:{ all -> 0x0042 }
            w6.t r2 = r1.f16579k     // Catch:{ all -> 0x0042 }
            r3 = 0
            if (r2 == 0) goto L_0x004c
            v0.d r1 = r1.f16580l     // Catch:{ all -> 0x0042 }
            w6.a r2 = r7.f16548c     // Catch:{ all -> 0x0042 }
            boolean r1 = r1.contains(r2)     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x004c
            w6.d r1 = r7.f16558p     // Catch:{ all -> 0x0042 }
            w6.t r1 = r1.f16579k     // Catch:{ all -> 0x0042 }
            int r2 = r7.f16552j     // Catch:{ all -> 0x0042 }
            r1.getClass()     // Catch:{ all -> 0x0042 }
            w6.g1 r4 = new w6.g1     // Catch:{ all -> 0x0042 }
            r4.<init>(r8, r2)     // Catch:{ all -> 0x0042 }
            java.util.concurrent.atomic.AtomicReference r8 = r1.f16615b     // Catch:{ all -> 0x0042 }
        L_0x0024:
            r2 = 0
        L_0x0025:
            boolean r5 = r8.compareAndSet(r2, r4)     // Catch:{ all -> 0x0042 }
            r6 = 1
            if (r5 == 0) goto L_0x002e
            r2 = r6
            goto L_0x0035
        L_0x002e:
            java.lang.Object r5 = r8.get()     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x0025
            r2 = r3
        L_0x0035:
            if (r2 == 0) goto L_0x0044
            com.google.android.gms.internal.base.zau r8 = r1.f16616c     // Catch:{ all -> 0x0042 }
            w6.i1 r2 = new w6.i1     // Catch:{ all -> 0x0042 }
            r2.<init>(r1, r4)     // Catch:{ all -> 0x0042 }
            r8.post(r2)     // Catch:{ all -> 0x0042 }
            goto L_0x004a
        L_0x0042:
            r8 = move-exception
            goto L_0x004e
        L_0x0044:
            java.lang.Object r2 = r8.get()     // Catch:{ all -> 0x0042 }
            if (r2 == 0) goto L_0x0024
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return r6
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            return r3
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0042 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.b0.k(com.google.android.gms.common.ConnectionResult):boolean");
    }

    public final boolean l(boolean z10) {
        boolean z11;
        j.b(this.f16558p.f16582n);
        if (!this.f16547b.isConnected() || this.f16551f.size() != 0) {
            return false;
        }
        s sVar = this.f16549d;
        if (!sVar.f16654a.isEmpty() || !sVar.f16655b.isEmpty()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            if (z10) {
                h();
            }
            return false;
        }
        this.f16547b.disconnect("Timing out service connection.");
        return true;
    }

    public final void m(int i10) {
        if (Looper.myLooper() == this.f16558p.f16582n.getLooper()) {
            g(i10);
        } else {
            this.f16558p.f16582n.post(new y(this, i10));
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [com.google.android.gms.common.api.a$f, q7.f] */
    public final void n() {
        j.b(this.f16558p.f16582n);
        if (!this.f16547b.isConnected() && !this.f16547b.isConnecting()) {
            try {
                d dVar = this.f16558p;
                int a10 = dVar.f16575g.a(dVar.f16573e, this.f16547b);
                if (a10 != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(a10, (PendingIntent) null);
                    this.f16547b.getClass();
                    connectionResult.toString();
                    q(connectionResult, (RuntimeException) null);
                    return;
                }
                d dVar2 = this.f16558p;
                a.f fVar = this.f16547b;
                e0 e0Var = new e0(dVar2, fVar, this.f16548c);
                if (fVar.requiresSignIn()) {
                    u0 u0Var = this.f16553k;
                    j.f(u0Var);
                    f fVar2 = u0Var.f16666f;
                    if (fVar2 != null) {
                        ((y6.a) fVar2).disconnect();
                    }
                    u0Var.f16665e.f17541h = Integer.valueOf(System.identityHashCode(u0Var));
                    q7.b bVar = u0Var.f16663c;
                    Context context = u0Var.f16661a;
                    Looper looper = u0Var.f16662b.getLooper();
                    y6.b bVar2 = u0Var.f16665e;
                    u0Var.f16666f = bVar.buildClient(context, looper, bVar2, bVar2.f17540g, u0Var, u0Var);
                    u0Var.f16667j = e0Var;
                    Set set = u0Var.f16664d;
                    if (set == null || set.isEmpty()) {
                        u0Var.f16662b.post(new t6.j(u0Var, 1));
                    } else {
                        r7.a aVar = (r7.a) u0Var.f16666f;
                        aVar.getClass();
                        aVar.connect(new a.d());
                    }
                }
                try {
                    this.f16547b.connect(e0Var);
                } catch (SecurityException e10) {
                    q(new ConnectionResult(10), e10);
                }
            } catch (IllegalStateException e11) {
                q(new ConnectionResult(10), e11);
            }
        }
    }

    public final void o() {
        if (Looper.myLooper() == this.f16558p.f16582n.getLooper()) {
            f();
        } else {
            this.f16558p.f16582n.post(new h(this, 2));
        }
    }

    public final void p(e1 e1Var) {
        boolean z10;
        j.b(this.f16558p.f16582n);
        if (!this.f16547b.isConnected()) {
            this.f16546a.add(e1Var);
            ConnectionResult connectionResult = this.f16556n;
            if (connectionResult != null) {
                if (connectionResult.f5321b == 0 || connectionResult.f5322c == null) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                if (z10) {
                    q(connectionResult, (RuntimeException) null);
                    return;
                }
            }
            n();
        } else if (j(e1Var)) {
            h();
        } else {
            this.f16546a.add(e1Var);
        }
    }

    public final void q(ConnectionResult connectionResult, RuntimeException runtimeException) {
        f fVar;
        j.b(this.f16558p.f16582n);
        u0 u0Var = this.f16553k;
        if (!(u0Var == null || (fVar = u0Var.f16666f) == null)) {
            ((y6.a) fVar).disconnect();
        }
        j.b(this.f16558p.f16582n);
        this.f16556n = null;
        this.f16558p.f16575g.f17602a.clear();
        b(connectionResult);
        if ((this.f16547b instanceof d) && connectionResult.f5321b != 24) {
            d dVar = this.f16558p;
            dVar.f16570b = true;
            zau zau = dVar.f16582n;
            zau.sendMessageDelayed(zau.obtainMessage(19), 300000);
        }
        if (connectionResult.f5321b == 4) {
            c(d.f16566q);
        } else if (this.f16546a.isEmpty()) {
            this.f16556n = connectionResult;
        } else if (runtimeException != null) {
            j.b(this.f16558p.f16582n);
            d((Status) null, runtimeException, false);
        } else if (this.f16558p.f16583o) {
            d(d.d(this.f16548c, connectionResult), (RuntimeException) null, true);
            if (!this.f16546a.isEmpty() && !k(connectionResult) && !this.f16558p.c(connectionResult, this.f16552j)) {
                if (connectionResult.f5321b == 18) {
                    this.f16554l = true;
                }
                if (this.f16554l) {
                    zau zau2 = this.f16558p.f16582n;
                    Message obtain = Message.obtain(zau2, 9, this.f16548c);
                    this.f16558p.getClass();
                    zau2.sendMessageDelayed(obtain, 5000);
                    return;
                }
                c(d.d(this.f16548c, connectionResult));
            }
        } else {
            c(d.d(this.f16548c, connectionResult));
        }
    }

    public final void r(ConnectionResult connectionResult) {
        q(connectionResult, (RuntimeException) null);
    }

    public final void s() {
        j.b(this.f16558p.f16582n);
        Status status = d.f16565p;
        c(status);
        s sVar = this.f16549d;
        sVar.getClass();
        sVar.a(status, false);
        for (h.a d1Var : (h.a[]) this.f16551f.keySet().toArray(new h.a[0])) {
            p(new d1(d1Var, new TaskCompletionSource()));
        }
        b(new ConnectionResult(4));
        if (this.f16547b.isConnected()) {
            this.f16547b.onUserSignOut(new a0(this));
        }
    }
}
