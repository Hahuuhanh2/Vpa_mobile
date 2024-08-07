package androidx.window.layout;

import android.annotation.SuppressLint;
import android.app.Activity;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.b0;
import ek.i;
import j$.util.function.Consumer;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.locks.ReentrantLock;
import sk.j;

/* compiled from: ExtensionWindowLayoutInfoBackend.kt */
public final class e implements u {

    /* renamed from: a  reason: collision with root package name */
    public final WindowLayoutComponent f3668a;

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantLock f3669b = new ReentrantLock();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f3670c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final LinkedHashMap f3671d = new LinkedHashMap();

    @SuppressLint({"NewApi"})
    /* compiled from: ExtensionWindowLayoutInfoBackend.kt */
    public static final class a implements Consumer<WindowLayoutInfo> {

        /* renamed from: a  reason: collision with root package name */
        public final Activity f3672a;

        /* renamed from: b  reason: collision with root package name */
        public final ReentrantLock f3673b = new ReentrantLock();

        /* renamed from: c  reason: collision with root package name */
        public z f3674c;

        /* renamed from: d  reason: collision with root package name */
        public final LinkedHashSet f3675d = new LinkedHashSet();

        public a(Activity activity) {
            j.f(activity, "activity");
            this.f3672a = activity;
        }

        public final void a(b0 b0Var) {
            ReentrantLock reentrantLock = this.f3673b;
            reentrantLock.lock();
            try {
                z zVar = this.f3674c;
                if (zVar != null) {
                    b0Var.accept(zVar);
                }
                this.f3675d.add(b0Var);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void accept(Object obj) {
            WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
            j.f(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.f3673b;
            reentrantLock.lock();
            try {
                this.f3674c = f.b(this.f3672a, windowLayoutInfo);
                for (v1.a accept : this.f3675d) {
                    accept.accept(this.f3674c);
                }
                i iVar = i.f20112a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer.CC.$default$andThen(this, consumer);
        }

        public final boolean b() {
            return this.f3675d.isEmpty();
        }

        public final void c(v1.a<z> aVar) {
            j.f(aVar, "listener");
            ReentrantLock reentrantLock = this.f3673b;
            reentrantLock.lock();
            try {
                this.f3675d.remove(aVar);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public e(WindowLayoutComponent windowLayoutComponent) {
        this.f3668a = windowLayoutComponent;
    }

    public final void a(Activity activity, n.a aVar, b0 b0Var) {
        i iVar;
        j.f(activity, "activity");
        ReentrantLock reentrantLock = this.f3669b;
        reentrantLock.lock();
        try {
            a aVar2 = (a) this.f3670c.get(activity);
            if (aVar2 == null) {
                iVar = null;
            } else {
                aVar2.a(b0Var);
                this.f3671d.put(b0Var, activity);
                iVar = i.f20112a;
            }
            if (iVar == null) {
                a aVar3 = new a(activity);
                this.f3670c.put(activity, aVar3);
                this.f3671d.put(b0Var, activity);
                aVar3.a(b0Var);
                this.f3668a.addWindowLayoutInfoListener(activity, aVar3);
            }
            i iVar2 = i.f20112a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(v1.a<z> aVar) {
        j.f(aVar, "callback");
        ReentrantLock reentrantLock = this.f3669b;
        reentrantLock.lock();
        try {
            Activity activity = (Activity) this.f3671d.get(aVar);
            if (activity != null) {
                a aVar2 = (a) this.f3670c.get(activity);
                if (aVar2 == null) {
                    reentrantLock.unlock();
                    return;
                }
                aVar2.c(aVar);
                if (aVar2.b()) {
                    this.f3668a.removeWindowLayoutInfoListener(aVar2);
                }
                i iVar = i.f20112a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
