package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.layout.d;
import e0.b0;
import ek.i;
import fk.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import sk.j;
import v.n;

/* compiled from: SidecarWindowBackend.kt */
public final class t implements u {

    /* renamed from: c  reason: collision with root package name */
    public static volatile t f3702c;

    /* renamed from: d  reason: collision with root package name */
    public static final ReentrantLock f3703d = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    public d f3704a;

    /* renamed from: b  reason: collision with root package name */
    public final CopyOnWriteArrayList<b> f3705b = new CopyOnWriteArrayList<>();

    /* compiled from: SidecarWindowBackend.kt */
    public final class a implements d.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ t f3706a;

        public a(t tVar) {
            j.f(tVar, "this$0");
            this.f3706a = tVar;
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void a(Activity activity, z zVar) {
            j.f(activity, "activity");
            Iterator<b> it = this.f3706a.f3705b.iterator();
            while (it.hasNext()) {
                b next = it.next();
                if (j.a(next.f3707a, activity)) {
                    next.f3710d = zVar;
                    next.f3708b.execute(new n(20, next, zVar));
                }
            }
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f3707a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f3708b;

        /* renamed from: c  reason: collision with root package name */
        public final v1.a<z> f3709c;

        /* renamed from: d  reason: collision with root package name */
        public z f3710d;

        public b(Activity activity, n.a aVar, b0 b0Var) {
            j.f(activity, "activity");
            this.f3707a = activity;
            this.f3708b = aVar;
            this.f3709c = b0Var;
        }
    }

    public t(SidecarCompat sidecarCompat) {
        this.f3704a = sidecarCompat;
        d dVar = this.f3704a;
        if (dVar != null) {
            dVar.b(new a(this));
        }
    }

    public final void a(Activity activity, n.a aVar, b0 b0Var) {
        z zVar;
        b bVar;
        j.f(activity, "activity");
        ReentrantLock reentrantLock = f3703d;
        reentrantLock.lock();
        try {
            d dVar = this.f3704a;
            if (dVar == null) {
                b0Var.accept(new z(r.f20213a));
                reentrantLock.unlock();
                return;
            }
            CopyOnWriteArrayList<b> copyOnWriteArrayList = this.f3705b;
            boolean z10 = false;
            if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                Iterator<b> it = copyOnWriteArrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (j.a(it.next().f3707a, activity)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            b bVar2 = new b(activity, aVar, b0Var);
            this.f3705b.add(bVar2);
            if (!z10) {
                dVar.a(activity);
            } else {
                Iterator<b> it2 = this.f3705b.iterator();
                while (true) {
                    zVar = null;
                    if (!it2.hasNext()) {
                        bVar = null;
                        break;
                    }
                    bVar = it2.next();
                    if (j.a(activity, bVar.f3707a)) {
                        break;
                    }
                }
                b bVar3 = bVar;
                if (bVar3 != null) {
                    zVar = bVar3.f3710d;
                }
                if (zVar != null) {
                    bVar2.f3710d = zVar;
                    bVar2.f3708b.execute(new n(20, bVar2, zVar));
                }
            }
            i iVar = i.f20112a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void b(v1.a<z> aVar) {
        j.f(aVar, "callback");
        synchronized (f3703d) {
            if (this.f3704a != null) {
                ArrayList<b> arrayList = new ArrayList<>();
                Iterator<b> it = this.f3705b.iterator();
                while (it.hasNext()) {
                    b next = it.next();
                    if (next.f3709c == aVar) {
                        arrayList.add(next);
                    }
                }
                this.f3705b.removeAll(arrayList);
                for (b bVar : arrayList) {
                    Activity activity = bVar.f3707a;
                    CopyOnWriteArrayList<b> copyOnWriteArrayList = this.f3705b;
                    boolean z10 = false;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<b> it2 = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (j.a(it2.next().f3707a, activity)) {
                                    z10 = true;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (!z10) {
                        d dVar = this.f3704a;
                        if (dVar != null) {
                            dVar.c(activity);
                        }
                    }
                }
                i iVar = i.f20112a;
            }
        }
    }
}
