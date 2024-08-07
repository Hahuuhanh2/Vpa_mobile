package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.s;
import r2.e;
import sk.j;

/* compiled from: ProcessLifecycleOwner.kt */
public final class t extends e {
    public final /* synthetic */ s this$0;

    /* compiled from: ProcessLifecycleOwner.kt */
    public static final class a extends e {
        public final /* synthetic */ s this$0;

        public a(s sVar) {
            this.this$0 = sVar;
        }

        public void onActivityPostResumed(Activity activity) {
            j.f(activity, "activity");
            this.this$0.a();
        }

        public void onActivityPostStarted(Activity activity) {
            j.f(activity, "activity");
            s sVar = this.this$0;
            int i10 = sVar.f2818a + 1;
            sVar.f2818a = i10;
            if (i10 == 1 && sVar.f2821d) {
                sVar.f2823f.f(i.a.ON_START);
                sVar.f2821d = false;
            }
        }
    }

    public t(s sVar) {
        this.this$0 = sVar;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = ReportFragment.f2726b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            j.d(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((ReportFragment) findFragmentByTag).f2727a = this.this$0.f2825o;
        }
    }

    public void onActivityPaused(Activity activity) {
        j.f(activity, "activity");
        s sVar = this.this$0;
        int i10 = sVar.f2819b - 1;
        sVar.f2819b = i10;
        if (i10 == 0) {
            Handler handler = sVar.f2822e;
            j.c(handler);
            handler.postDelayed(sVar.f2824n, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        j.f(activity, "activity");
        s.a.a(activity, new a(this.this$0));
    }

    public void onActivityStopped(Activity activity) {
        j.f(activity, "activity");
        s sVar = this.this$0;
        int i10 = sVar.f2818a - 1;
        sVar.f2818a = i10;
        if (i10 == 0 && sVar.f2820c) {
            sVar.f2823f.f(i.a.ON_STOP);
            sVar.f2821d = true;
        }
    }
}
