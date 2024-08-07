package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.i;
import r2.l;
import r2.m;
import sk.j;

/* compiled from: ReportFragment.kt */
public class ReportFragment extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2726b = 0;

    /* renamed from: a  reason: collision with root package name */
    public a f2727a;

    /* compiled from: ReportFragment.kt */
    public interface a {
        void a();

        void b();

        void c();
    }

    /* compiled from: ReportFragment.kt */
    public static final class b {
        public static void a(Activity activity, i.a aVar) {
            j.f(activity, "activity");
            j.f(aVar, "event");
            if (activity instanceof m) {
                ((m) activity).t().f(aVar);
            } else if (activity instanceof l) {
                o B = ((l) activity).B();
                if (B instanceof o) {
                    B.f(aVar);
                }
            }
        }

        public static void b(Activity activity) {
            j.f(activity, "activity");
            if (Build.VERSION.SDK_INT >= 29) {
                c.Companion.getClass();
                activity.registerActivityLifecycleCallbacks(new c());
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }
    }

    /* compiled from: ReportFragment.kt */
    public static final class c implements Application.ActivityLifecycleCallbacks {
        public static final a Companion = new a();

        /* compiled from: ReportFragment.kt */
        public static final class a {
        }

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            j.f(activity, "activity");
            activity.registerActivityLifecycleCallbacks(new c());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            j.f(activity, "activity");
        }

        public void onActivityDestroyed(Activity activity) {
            j.f(activity, "activity");
        }

        public void onActivityPaused(Activity activity) {
            j.f(activity, "activity");
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            j.f(activity, "activity");
            int i10 = ReportFragment.f2726b;
            b.a(activity, i.a.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            j.f(activity, "activity");
            int i10 = ReportFragment.f2726b;
            b.a(activity, i.a.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            j.f(activity, "activity");
            int i10 = ReportFragment.f2726b;
            b.a(activity, i.a.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            j.f(activity, "activity");
            int i10 = ReportFragment.f2726b;
            b.a(activity, i.a.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            j.f(activity, "activity");
            int i10 = ReportFragment.f2726b;
            b.a(activity, i.a.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            j.f(activity, "activity");
            int i10 = ReportFragment.f2726b;
            b.a(activity, i.a.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
            j.f(activity, "activity");
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            j.f(activity, "activity");
            j.f(bundle, "bundle");
        }

        public void onActivityStarted(Activity activity) {
            j.f(activity, "activity");
        }

        public void onActivityStopped(Activity activity) {
            j.f(activity, "activity");
        }
    }

    public final void a(i.a aVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            j.e(activity, "activity");
            b.a(activity, aVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a aVar = this.f2727a;
        if (aVar != null) {
            aVar.a();
        }
        a(i.a.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(i.a.ON_DESTROY);
        this.f2727a = null;
    }

    public final void onPause() {
        super.onPause();
        a(i.a.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        a aVar = this.f2727a;
        if (aVar != null) {
            aVar.c();
        }
        a(i.a.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        a aVar = this.f2727a;
        if (aVar != null) {
            aVar.b();
        }
        a(i.a.ON_START);
    }

    public final void onStop() {
        super.onStop();
        a(i.a.ON_STOP);
    }
}
