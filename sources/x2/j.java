package x2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import d.d;
import d.i;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import v.n;
import x2.e;
import x2.f;
import x2.h;

/* compiled from: MultiInstanceInvalidationClient.kt */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final String f16930a;

    /* renamed from: b  reason: collision with root package name */
    public final h f16931b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f16932c;

    /* renamed from: d  reason: collision with root package name */
    public int f16933d;

    /* renamed from: e  reason: collision with root package name */
    public h.c f16934e;

    /* renamed from: f  reason: collision with root package name */
    public f f16935f;

    /* renamed from: g  reason: collision with root package name */
    public final b f16936g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    public final AtomicBoolean f16937h = new AtomicBoolean(false);

    /* renamed from: i  reason: collision with root package name */
    public final i f16938i;

    /* renamed from: j  reason: collision with root package name */
    public final d f16939j;

    /* compiled from: MultiInstanceInvalidationClient.kt */
    public static final class a extends h.c {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ j f16940b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, String[] strArr) {
            super(strArr);
            this.f16940b = jVar;
        }

        public final void a(Set<String> set) {
            sk.j.f(set, "tables");
            if (!this.f16940b.f16937h.get()) {
                try {
                    j jVar = this.f16940b;
                    f fVar = jVar.f16935f;
                    if (fVar != null) {
                        int i10 = jVar.f16933d;
                        Object[] array = set.toArray(new String[0]);
                        sk.j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        fVar.t(i10, (String[]) array);
                    }
                } catch (RemoteException unused) {
                }
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    public static final class b extends e.a {

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int f16941b = 0;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f16942a;

        public b(j jVar) {
            this.f16942a = jVar;
        }

        public final void e(String[] strArr) {
            sk.j.f(strArr, "tables");
            j jVar = this.f16942a;
            jVar.f16932c.execute(new n(17, jVar, strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.kt */
    public static final class c implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ j f16943a;

        public c(j jVar) {
            this.f16943a = jVar;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f fVar;
            sk.j.f(componentName, "name");
            sk.j.f(iBinder, "service");
            j jVar = this.f16943a;
            int i10 = f.a.f16901a;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof f)) {
                fVar = new f.a.C0223a(iBinder);
            } else {
                fVar = (f) queryLocalInterface;
            }
            jVar.f16935f = fVar;
            j jVar2 = this.f16943a;
            jVar2.f16932c.execute(jVar2.f16938i);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            sk.j.f(componentName, "name");
            j jVar = this.f16943a;
            jVar.f16932c.execute(jVar.f16939j);
            this.f16943a.f16935f = null;
        }
    }

    public j(Context context, String str, Intent intent, h hVar, Executor executor) {
        this.f16930a = str;
        this.f16931b = hVar;
        this.f16932c = executor;
        Context applicationContext = context.getApplicationContext();
        c cVar = new c(this);
        this.f16938i = new i(this, 10);
        this.f16939j = new d(this, 20);
        Object[] array = hVar.f16910d.keySet().toArray(new String[0]);
        sk.j.d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f16934e = new a(this, (String[]) array);
        applicationContext.bindService(intent, cVar, 1);
    }
}
