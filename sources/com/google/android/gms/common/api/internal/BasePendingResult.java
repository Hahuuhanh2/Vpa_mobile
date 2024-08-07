package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.base.zau;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import v6.c;
import v6.d;
import v6.e;
import v6.f;
import v6.g;
import v6.h;
import w6.k1;
import w6.l1;
import w6.y0;
import w6.z0;
import y6.j;

@KeepName
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class BasePendingResult<R extends e> extends c<R> {
    public static final ThreadLocal zaa = new k1();
    public static final /* synthetic */ int zad = 0;
    @KeepName
    private l1 mResultGuardian;
    public final a zab;
    public final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;
    private f zah;
    private final AtomicReference zai;
    /* access modifiers changed from: private */
    public e zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private y6.f zao;
    private volatile y0 zap;
    private boolean zaq;

    @VisibleForTesting
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class a<R extends e> extends zau {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(f fVar, e eVar) {
            ThreadLocal threadLocal = BasePendingResult.zaa;
            j.f(fVar);
            sendMessage(obtainMessage(1, new Pair(fVar, eVar)));
        }

        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 1) {
                Pair pair = (Pair) message.obj;
                f fVar = (f) pair.first;
                e eVar = (e) pair.second;
                try {
                    fVar.a(eVar);
                } catch (RuntimeException e10) {
                    BasePendingResult.zal(eVar);
                    throw e10;
                }
            } else if (i10 != 2) {
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f5343o);
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(Looper.getMainLooper());
        this.zac = new WeakReference((Object) null);
    }

    private final e zaa() {
        e eVar;
        synchronized (this.zae) {
            j.h("Result has already been consumed.", !this.zal);
            j.h("Result is not ready.", isReady());
            eVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        if (((z0) this.zai.getAndSet((Object) null)) == null) {
            j.f(eVar);
            return eVar;
        }
        throw null;
    }

    private final void zab(e eVar) {
        this.zaj = eVar;
        this.zak = eVar.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            f fVar = this.zah;
            if (fVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(fVar, zaa());
            } else if (this.zaj instanceof d) {
                this.mResultGuardian = new l1(this);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c.a) arrayList.get(i10)).a();
        }
        this.zag.clear();
    }

    public static void zal(e eVar) {
        if (eVar instanceof d) {
            try {
                ((d) eVar).a();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(eVar));
            }
        }
    }

    public final void addStatusListener(c.a aVar) {
        boolean z10;
        if (aVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        j.a("Callback cannot be null.", z10);
        synchronized (this.zae) {
            if (isReady()) {
                aVar.a();
            } else {
                this.zag.add(aVar);
            }
        }
    }

    public final R await() {
        boolean z10 = true;
        if (!(Looper.getMainLooper() == Looper.myLooper())) {
            j.h("Result has already been consumed", !this.zal);
            if (this.zap != null) {
                z10 = false;
            }
            j.h("Cannot await if then() has been called.", z10);
            try {
                this.zaf.await();
            } catch (InterruptedException unused) {
                forceFailureUnlessReady(Status.f5341f);
            }
            j.h("Result is not ready.", isReady());
            return zaa();
        }
        throw new IllegalStateException("await must not be called on the UI thread");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:8|(2:10|11)|12|13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void cancel() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.zae
            monitor-enter(r0)
            boolean r1 = r2.zam     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0026
            boolean r1 = r2.zal     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x000c
            goto L_0x0026
        L_0x000c:
            y6.f r1 = r2.zao     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0013
            r1.cancel()     // Catch:{ RemoteException -> 0x0013 }
        L_0x0013:
            v6.e r1 = r2.zaj     // Catch:{ all -> 0x0028 }
            zal(r1)     // Catch:{ all -> 0x0028 }
            r1 = 1
            r2.zam = r1     // Catch:{ all -> 0x0028 }
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f5344p     // Catch:{ all -> 0x0028 }
            v6.e r1 = r2.createFailedResult(r1)     // Catch:{ all -> 0x0028 }
            r2.zab(r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0026:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.cancel():void");
    }

    public abstract R createFailedResult(Status status);

    @Deprecated
    public final void forceFailureUnlessReady(Status status) {
        synchronized (this.zae) {
            if (!isReady()) {
                setResult(createFailedResult(status));
                this.zan = true;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        if (this.zaf.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void setCancelToken(y6.f fVar) {
        synchronized (this.zae) {
            this.zao = fVar;
        }
    }

    public final void setResult(R r10) {
        synchronized (this.zae) {
            if (this.zan || this.zam) {
                zal(r10);
                return;
            }
            isReady();
            j.h("Results have already been set", !isReady());
            j.h("Result has already been consumed", !this.zal);
            zab(r10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(v6.f<? super R> r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.zah = r5     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x000a:
            boolean r1 = r4.zal     // Catch:{ all -> 0x003a }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            y6.j.h(r3, r1)     // Catch:{ all -> 0x003a }
            w6.y0 r1 = r4.zap     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            y6.j.h(r1, r2)     // Catch:{ all -> 0x003a }
            boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x0026:
            boolean r1 = r4.isReady()     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$a r1 = r4.zab     // Catch:{ all -> 0x003a }
            v6.e r2 = r4.zaa()     // Catch:{ all -> 0x003a }
            r1.a(r5, r2)     // Catch:{ all -> 0x003a }
            goto L_0x0038
        L_0x0036:
            r4.zah = r5     // Catch:{ all -> 0x003a }
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(v6.f):void");
    }

    public final <S extends e> h<S> then(g<? super R, ? extends S> gVar) {
        boolean z10;
        y0 y0Var;
        j.h("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            boolean z11 = false;
            if (this.zap == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            j.h("Cannot call then() twice.", z10);
            if (this.zah == null) {
                z11 = true;
            }
            j.h("Cannot call then() if callbacks are set.", z11);
            j.h("Cannot call then() if result was canceled.", !this.zam);
            this.zaq = true;
            this.zap = new y0(this.zac);
            y0 y0Var2 = this.zap;
            synchronized (y0Var2.f16678c) {
                y0Var2.getClass();
                j.h("Cannot call then() twice.", true);
                y0Var2.getClass();
                y0Var = new y0(y0Var2.f16680e);
                y0Var2.f16676a = y0Var;
                y0Var2.c();
            }
            if (isReady()) {
                this.zab.a(this.zap, zaa());
            } else {
                this.zah = this.zap;
            }
        }
        return y0Var;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            if (((com.google.android.gms.common.api.c) this.zac.get()) == null || !this.zaq) {
                cancel();
            }
            isCanceled = isCanceled();
        }
        return isCanceled;
    }

    public final void zan(z0 z0Var) {
        this.zai.set(z0Var);
    }

    @Deprecated
    public BasePendingResult(Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(looper);
        this.zac = new WeakReference((Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setResultCallback(v6.f<? super R> r5, long r6, java.util.concurrent.TimeUnit r8) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.zae
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000a
            r5 = 0
            r4.zah = r5     // Catch:{ all -> 0x0048 }
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x000a:
            boolean r1 = r4.zal     // Catch:{ all -> 0x0048 }
            r2 = 1
            r1 = r1 ^ r2
            java.lang.String r3 = "Result has already been consumed."
            y6.j.h(r3, r1)     // Catch:{ all -> 0x0048 }
            w6.y0 r1 = r4.zap     // Catch:{ all -> 0x0048 }
            if (r1 != 0) goto L_0x0018
            goto L_0x0019
        L_0x0018:
            r2 = 0
        L_0x0019:
            java.lang.String r1 = "Cannot set callbacks if then() has been called."
            y6.j.h(r1, r2)     // Catch:{ all -> 0x0048 }
            boolean r1 = r4.isCanceled()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0026
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0026:
            boolean r1 = r4.isReady()     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0036
            com.google.android.gms.common.api.internal.BasePendingResult$a r6 = r4.zab     // Catch:{ all -> 0x0048 }
            v6.e r7 = r4.zaa()     // Catch:{ all -> 0x0048 }
            r6.a(r5, r7)     // Catch:{ all -> 0x0048 }
            goto L_0x0046
        L_0x0036:
            r4.zah = r5     // Catch:{ all -> 0x0048 }
            com.google.android.gms.common.api.internal.BasePendingResult$a r5 = r4.zab     // Catch:{ all -> 0x0048 }
            long r6 = r8.toMillis(r6)     // Catch:{ all -> 0x0048 }
            r8 = 2
            android.os.Message r8 = r5.obtainMessage(r8, r4)     // Catch:{ all -> 0x0048 }
            r5.sendMessageDelayed(r8, r6)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            return
        L_0x0048:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.BasePendingResult.setResultCallback(v6.f, long, java.util.concurrent.TimeUnit):void");
    }

    public BasePendingResult(com.google.android.gms.common.api.c cVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(cVar != null ? cVar.b() : Looper.getMainLooper());
        this.zac = new WeakReference(cVar);
    }

    public final R await(long j10, TimeUnit timeUnit) {
        boolean z10 = false;
        if (j10 > 0) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IllegalStateException("await must not be called on the UI thread when time is greater than zero.");
            }
        }
        j.h("Result has already been consumed.", !this.zal);
        if (this.zap == null) {
            z10 = true;
        }
        j.h("Cannot await if then() has been called.", z10);
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f5343o);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f5341f);
        }
        j.h("Result is not ready.", isReady());
        return zaa();
    }

    @VisibleForTesting
    public BasePendingResult(a<R> aVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        if (aVar != null) {
            this.zab = aVar;
            this.zac = new WeakReference((Object) null);
            return;
        }
        throw new NullPointerException("CallbackHandler must not be null");
    }
}
