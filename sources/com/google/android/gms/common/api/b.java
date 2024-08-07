package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.reflect.InvocationTargetException;
import v6.e;
import w6.a1;
import w6.b0;
import w6.c1;
import w6.d1;
import w6.f0;
import w6.g;
import w6.h;
import w6.i;
import w6.k;
import w6.l;
import w6.m0;
import w6.n;
import w6.o;
import w6.p;
import w6.t;
import w6.u;
import w6.u0;
import y6.b;
import y6.j;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class b<O extends a.d> {
    public final w6.d zaa;
    private final Context zab;
    private final String zac;
    private final a zad;
    private final a.d zae;
    private final w6.a zaf;
    private final Looper zag;
    private final int zah;
    private final c zai;
    private final n zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f5354c = new a(new a.a(), Looper.getMainLooper());

        /* renamed from: a  reason: collision with root package name */
        public final n f5355a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f5356b;

        public a(n nVar, Looper looper) {
            this.f5355a = nVar;
            this.f5356b = looper;
        }
    }

    public b(Activity activity, a<O> aVar, O o10, a aVar2) {
        this((Context) activity, activity, (a) aVar, (a.d) o10, aVar2);
    }

    private final com.google.android.gms.common.api.internal.a zad(int i10, com.google.android.gms.common.api.internal.a aVar) {
        aVar.zak();
        w6.d dVar = this.zaa;
        dVar.getClass();
        a1 a1Var = new a1(i10, aVar);
        zau zau = dVar.f16582n;
        zau.sendMessage(zau.obtainMessage(4, new m0(a1Var, dVar.f16577i.get(), this)));
        return aVar;
    }

    private final Task zae(int i10, o oVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        w6.d dVar = this.zaa;
        n nVar = this.zaj;
        dVar.getClass();
        dVar.f(taskCompletionSource, oVar.f16638c, this);
        c1 c1Var = new c1(i10, oVar, taskCompletionSource, nVar);
        zau zau = dVar.f16582n;
        zau.sendMessage(zau.obtainMessage(4, new m0(c1Var, dVar.f16577i.get(), this)));
        return taskCompletionSource.getTask();
    }

    public c asGoogleApiClient() {
        return this.zai;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y6.b.a createClientSettingsBuilder() {
        /*
            r4 = this;
            y6.b$a r0 = new y6.b$a
            r0.<init>()
            com.google.android.gms.common.api.a$d r1 = r4.zae
            boolean r2 = r1 instanceof com.google.android.gms.common.api.a.d.b
            if (r2 == 0) goto L_0x0020
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.a.d.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.U()
            if (r1 == 0) goto L_0x0020
            java.lang.String r1 = r1.f5292d
            if (r1 != 0) goto L_0x0018
            goto L_0x002d
        L_0x0018:
            android.accounts.Account r2 = new android.accounts.Account
            java.lang.String r3 = "com.google"
            r2.<init>(r1, r3)
            goto L_0x002e
        L_0x0020:
            com.google.android.gms.common.api.a$d r1 = r4.zae
            boolean r2 = r1 instanceof com.google.android.gms.common.api.a.d.C0059a
            if (r2 == 0) goto L_0x002d
            com.google.android.gms.common.api.a$d$a r1 = (com.google.android.gms.common.api.a.d.C0059a) r1
            android.accounts.Account r2 = r1.e0()
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            r0.f17542a = r2
            com.google.android.gms.common.api.a$d r1 = r4.zae
            boolean r2 = r1 instanceof com.google.android.gms.common.api.a.d.b
            if (r2 == 0) goto L_0x0048
            com.google.android.gms.common.api.a$d$b r1 = (com.google.android.gms.common.api.a.d.b) r1
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r1 = r1.U()
            if (r1 != 0) goto L_0x0043
            java.util.Set r1 = java.util.Collections.emptySet()
            goto L_0x004c
        L_0x0043:
            java.util.HashSet r1 = r1.P0()
            goto L_0x004c
        L_0x0048:
            java.util.Set r1 = java.util.Collections.emptySet()
        L_0x004c:
            v0.d r2 = r0.f17543b
            if (r2 != 0) goto L_0x0057
            v0.d r2 = new v0.d
            r2.<init>()
            r0.f17543b = r2
        L_0x0057:
            v0.d r2 = r0.f17543b
            r2.addAll(r1)
            android.content.Context r1 = r4.zab
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.f17545d = r1
            android.content.Context r1 = r4.zab
            java.lang.String r1 = r1.getPackageName()
            r0.f17544c = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.b.createClientSettingsBuilder():y6.b$a");
    }

    public Task<Boolean> disconnectService() {
        w6.d dVar = this.zaa;
        dVar.getClass();
        u uVar = new u(getApiKey());
        zau zau = dVar.f16582n;
        zau.sendMessage(zau.obtainMessage(14, uVar));
        return uVar.f16659b.getTask();
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends e, A>> T doBestEffortWrite(T t10) {
        zad(2, t10);
        return t10;
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends e, A>> T doRead(T t10) {
        zad(0, t10);
        return t10;
    }

    @Deprecated
    public <A extends a.b, T extends k<A, ?>, U extends p<A, ?>> Task<Void> doRegisterEventListener(T t10, U u10) {
        j.f(t10);
        j.f(u10);
        t10.getClass();
        throw null;
    }

    public Task<Boolean> doUnregisterEventListener(h.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends a.b, T extends com.google.android.gms.common.api.internal.a<? extends e, A>> T doWrite(T t10) {
        zad(1, t10);
        return t10;
    }

    public final w6.a<O> getApiKey() {
        return this.zaf;
    }

    public O getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    public String getContextAttributionTag() {
        return this.zac;
    }

    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> h<L> registerListener(L l10, String str) {
        Looper looper = this.zag;
        if (l10 != null) {
            j.g(looper, "Looper must not be null");
            if (str != null) {
                return new h<>(looper, l10, str);
            }
            throw new NullPointerException("Listener type must not be null");
        }
        throw new NullPointerException("Listener must not be null");
    }

    public final int zaa() {
        return this.zah;
    }

    public final a.f zab(Looper looper, b0 b0Var) {
        b.a createClientSettingsBuilder = createClientSettingsBuilder();
        y6.b bVar = new y6.b(createClientSettingsBuilder.f17542a, createClientSettingsBuilder.f17543b, createClientSettingsBuilder.f17544c, createClientSettingsBuilder.f17545d);
        a.C0058a aVar = this.zad.f5350a;
        j.f(aVar);
        a.f buildClient = aVar.buildClient(this.zab, looper, bVar, this.zae, (c.a) b0Var, (c.b) b0Var);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof y6.a)) {
            ((y6.a) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag != null && (buildClient instanceof i)) {
            ((i) buildClient).getClass();
        }
        return buildClient;
    }

    public final u0 zac(Context context, Handler handler) {
        b.a createClientSettingsBuilder = createClientSettingsBuilder();
        return new u0(context, handler, new y6.b(createClientSettingsBuilder.f17542a, createClientSettingsBuilder.f17543b, createClientSettingsBuilder.f17544c, createClientSettingsBuilder.f17545d));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.app.Activity r3, com.google.android.gms.common.api.a<O> r4, O r5, w6.n r6) {
        /*
            r2 = this;
            if (r6 == 0) goto L_0x0014
            android.os.Looper r0 = r3.getMainLooper()
            java.lang.String r1 = "Looper must not be null."
            y6.j.g(r0, r1)
            com.google.android.gms.common.api.b$a r1 = new com.google.android.gms.common.api.b$a
            r1.<init>(r6, r0)
            r2.<init>((android.app.Activity) r3, r4, r5, (com.google.android.gms.common.api.b.a) r1)
            return
        L_0x0014:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "StatusExceptionMapper must not be null."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.b.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, w6.n):void");
    }

    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(o<A, TResult> oVar) {
        return zae(2, oVar);
    }

    public <TResult, A extends a.b> Task<TResult> doRead(o<A, TResult> oVar) {
        return zae(0, oVar);
    }

    public Task<Boolean> doUnregisterEventListener(h.a<?> aVar, int i10) {
        if (aVar != null) {
            w6.d dVar = this.zaa;
            dVar.getClass();
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            dVar.f(taskCompletionSource, i10, this);
            d1 d1Var = new d1(aVar, taskCompletionSource);
            zau zau = dVar.f16582n;
            zau.sendMessage(zau.obtainMessage(13, new m0(d1Var, dVar.f16577i.get(), this)));
            return taskCompletionSource.getTask();
        }
        throw new NullPointerException("Listener key cannot be null.");
    }

    public <TResult, A extends a.b> Task<TResult> doWrite(o<A, TResult> oVar) {
        return zae(1, oVar);
    }

    public <A extends a.b> Task<Void> doRegisterEventListener(l<A, ?> lVar) {
        j.f(lVar);
        lVar.getClass();
        throw null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public b(Context context, a<O> aVar, O o10, n nVar) {
        this(context, aVar, o10, new a(nVar, Looper.getMainLooper()));
        if (nVar != null) {
            return;
        }
        throw new NullPointerException("StatusExceptionMapper must not be null.");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated
    public b(Context context, a<O> aVar, O o10, Looper looper, n nVar) {
        this(context, aVar, o10, new a(nVar, looper));
        if (looper == null) {
            throw new NullPointerException("Looper must not be null.");
        } else if (nVar != null) {
        } else {
            throw new NullPointerException("StatusExceptionMapper must not be null.");
        }
    }

    private b(Context context, Activity activity, a aVar, a.d dVar, a aVar2) {
        if (context == null) {
            throw new NullPointerException("Null context is not permitted.");
        } else if (aVar == null) {
            throw new NullPointerException("Api must not be null.");
        } else if (aVar2 != null) {
            this.zab = context.getApplicationContext();
            String str = null;
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    str = (String) Context.class.getMethod("getAttributionTag", new Class[0]).invoke(context, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            this.zac = str;
            this.zad = aVar;
            this.zae = dVar;
            this.zag = aVar2.f5356b;
            w6.a aVar3 = new w6.a(aVar, dVar, str);
            this.zaf = aVar3;
            this.zai = new f0(this);
            w6.d g2 = w6.d.g(this.zab);
            this.zaa = g2;
            this.zah = g2.f16576h.getAndIncrement();
            this.zaj = aVar2.f5355a;
            if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
                g fragment = LifecycleCallback.getFragment(activity);
                t tVar = (t) fragment.e(t.class, "ConnectionlessLifecycleHelper");
                if (tVar == null) {
                    Object obj = u6.a.f15287c;
                    tVar = new t(fragment, g2);
                }
                tVar.f16656e.add(aVar3);
                g2.a(tVar);
            }
            zau zau = g2.f16582n;
            zau.sendMessage(zau.obtainMessage(7, this));
        } else {
            throw new NullPointerException("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        }
    }

    public b(Context context, a<O> aVar, O o10, a aVar2) {
        this(context, (Activity) null, (a) aVar, (a.d) o10, aVar2);
    }
}
