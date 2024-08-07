package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.ReportFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.e;
import sk.j;

/* compiled from: LifecycleDispatcher.kt */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f2782a = new AtomicBoolean(false);

    /* compiled from: LifecycleDispatcher.kt */
    public static final class a extends e {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            j.f(activity, "activity");
            int i10 = ReportFragment.f2726b;
            ReportFragment.b.b(activity);
        }
    }
}
