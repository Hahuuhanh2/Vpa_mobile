package s8;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
public final class e {

    /* renamed from: o  reason: collision with root package name */
    public static final HashMap f14668o = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f14669a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f14670b;

    /* renamed from: c  reason: collision with root package name */
    public final String f14671c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f14672d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f14673e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f14674f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public boolean f14675g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f14676h;

    /* renamed from: i  reason: collision with root package name */
    public final g0 f14677i;

    /* renamed from: j  reason: collision with root package name */
    public final WeakReference f14678j;

    /* renamed from: k  reason: collision with root package name */
    public final c0 f14679k = new c0(this);

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f14680l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    public d f14681m;

    /* renamed from: n  reason: collision with root package name */
    public IInterface f14682n;

    public e(Context context, a0 a0Var, String str, Intent intent, g0 g0Var) {
        this.f14669a = context;
        this.f14670b = a0Var;
        this.f14671c = str;
        this.f14676h = intent;
        this.f14677i = g0Var;
        this.f14678j = new WeakReference((Object) null);
    }

    public static /* bridge */ /* synthetic */ void b(e eVar, b0 b0Var) {
        if (eVar.f14682n == null && !eVar.f14675g) {
            eVar.f14670b.b("Initiate binding to the service.", new Object[0]);
            eVar.f14672d.add(b0Var);
            d dVar = new d(eVar);
            eVar.f14681m = dVar;
            eVar.f14675g = true;
            if (!eVar.f14669a.bindService(eVar.f14676h, dVar, 1)) {
                eVar.f14670b.b("Failed to bind to the service.", new Object[0]);
                eVar.f14675g = false;
                Iterator it = eVar.f14672d.iterator();
                while (it.hasNext()) {
                    ((b0) it.next()).a(new af());
                }
                eVar.f14672d.clear();
            }
        } else if (eVar.f14675g) {
            eVar.f14670b.b("Waiting to bind to the service.", new Object[0]);
            eVar.f14672d.add(b0Var);
        } else {
            b0Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f14668o;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f14671c)) {
                HandlerThread handlerThread = new HandlerThread(this.f14671c, 10);
                handlerThread.start();
                hashMap.put(this.f14671c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f14671c);
        }
        return handler;
    }

    public final void c(b0 b0Var, TaskCompletionSource taskCompletionSource) {
        a().post(new e0(this, b0Var.c(), taskCompletionSource, b0Var));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f14674f) {
            this.f14673e.remove(taskCompletionSource);
        }
        a().post(new c(this, 1));
    }

    public final void e() {
        Iterator it = this.f14673e.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f14671c).concat(" : Binder has died.")));
        }
        this.f14673e.clear();
    }
}
