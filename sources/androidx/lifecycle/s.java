package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.i;
import d.h;
import r2.l;
import sk.j;

/* compiled from: ProcessLifecycleOwner.kt */
public final class s implements l {

    /* renamed from: p  reason: collision with root package name */
    public static final s f2817p = new s();

    /* renamed from: a  reason: collision with root package name */
    public int f2818a;

    /* renamed from: b  reason: collision with root package name */
    public int f2819b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2820c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2821d = true;

    /* renamed from: e  reason: collision with root package name */
    public Handler f2822e;

    /* renamed from: f  reason: collision with root package name */
    public final o f2823f = new o(this);

    /* renamed from: n  reason: collision with root package name */
    public final h f2824n = new h(this, 15);

    /* renamed from: o  reason: collision with root package name */
    public final b f2825o = new b(this);

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a {
        public static final void a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            j.f(activity, "activity");
            j.f(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class b implements ReportFragment.a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s f2826a;

        public b(s sVar) {
            this.f2826a = sVar;
        }

        public final void a() {
        }

        public final void b() {
            s sVar = this.f2826a;
            int i10 = sVar.f2818a + 1;
            sVar.f2818a = i10;
            if (i10 == 1 && sVar.f2821d) {
                sVar.f2823f.f(i.a.ON_START);
                sVar.f2821d = false;
            }
        }

        public final void c() {
            this.f2826a.a();
        }
    }

    public final o B() {
        return this.f2823f;
    }

    public final void a() {
        int i10 = this.f2819b + 1;
        this.f2819b = i10;
        if (i10 != 1) {
            return;
        }
        if (this.f2820c) {
            this.f2823f.f(i.a.ON_RESUME);
            this.f2820c = false;
            return;
        }
        Handler handler = this.f2822e;
        j.c(handler);
        handler.removeCallbacks(this.f2824n);
    }
}
