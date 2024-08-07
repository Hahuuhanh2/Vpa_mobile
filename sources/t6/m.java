package t6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.internal.cloudmessaging.zzf;
import g7.a;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import x2.g;
import y6.j;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.0.0 */
public final class m implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public int f14863a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final Messenger f14864b = new Messenger(new zzf(Looper.getMainLooper(), new g(this)));

    /* renamed from: c  reason: collision with root package name */
    public g f14865c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayDeque f14866d = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    public final SparseArray<o<?>> f14867e = new SparseArray<>();

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q f14868f;

    public /* synthetic */ m(q qVar) {
        this.f14868f = qVar;
    }

    public final synchronized void a(int i10, String str) {
        b(i10, str, (SecurityException) null);
    }

    public final synchronized void b(int i10, String str, SecurityException securityException) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Disconnected: ".concat(valueOf);
            }
        }
        int i11 = this.f14863a;
        if (i11 == 0) {
            throw new IllegalStateException();
        } else if (i11 == 1 || i11 == 2) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.f14863a = 4;
            a.a().b(this.f14868f.f14874a, this);
            zzq zzq = new zzq(str, securityException);
            Iterator it = this.f14866d.iterator();
            while (it.hasNext()) {
                ((o) it.next()).c(zzq);
            }
            this.f14866d.clear();
            for (int i12 = 0; i12 < this.f14867e.size(); i12++) {
                this.f14867e.valueAt(i12).c(zzq);
            }
            this.f14867e.clear();
        } else if (i11 == 3) {
            this.f14863a = 4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f14863a     // Catch:{ all -> 0x002d }
            r1 = 2
            if (r0 != r1) goto L_0x002b
            java.util.ArrayDeque r0 = r2.f14866d     // Catch:{ all -> 0x002d }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x002b
            android.util.SparseArray<t6.o<?>> r0 = r2.f14867e     // Catch:{ all -> 0x002d }
            int r0 = r0.size()     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x002b
            java.lang.String r0 = "MessengerIpcClient"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x002d }
            r0 = 3
            r2.f14863a = r0     // Catch:{ all -> 0x002d }
            g7.a r0 = g7.a.a()     // Catch:{ all -> 0x002d }
            t6.q r1 = r2.f14868f     // Catch:{ all -> 0x002d }
            android.content.Context r1 = r1.f14874a     // Catch:{ all -> 0x002d }
            r0.b(r1, r2)     // Catch:{ all -> 0x002d }
            monitor-exit(r2)
            return
        L_0x002b:
            monitor-exit(r2)
            return
        L_0x002d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.m.c():void");
    }

    public final synchronized boolean d(o<?> oVar) {
        boolean z10;
        int i10 = this.f14863a;
        if (i10 == 0) {
            this.f14866d.add(oVar);
            if (this.f14863a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            j.i(z10);
            Log.isLoggable("MessengerIpcClient", 2);
            this.f14863a = 1;
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            try {
                a a10 = a.a();
                Context context = this.f14868f.f14874a;
                if (!a10.c(context, context.getClass().getName(), intent, this, 1, (Executor) null)) {
                    a(0, "Unable to bind to service");
                } else {
                    this.f14868f.f14875b.schedule(new j(this, 0), 30, TimeUnit.SECONDS);
                }
            } catch (SecurityException e10) {
                b(0, "Unable to bind to service", e10);
            }
        } else if (i10 == 1) {
            this.f14866d.add(oVar);
            return true;
        } else if (i10 != 2) {
            return false;
        } else {
            this.f14866d.add(oVar);
            this.f14868f.f14875b.execute(new i((ServiceConnection) this));
            return true;
        }
        return true;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f14868f.f14875b.execute(new k(0, this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        this.f14868f.f14875b.execute(new h(this, 0));
    }
}
