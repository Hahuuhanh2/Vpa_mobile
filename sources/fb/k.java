package fb;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import v.n;

/* compiled from: FcmLifecycleCallbacks */
public final class k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public final Set<Intent> f10145a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0020  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0014  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Intent r5) {
        /*
            android.os.Bundle r5 = r5.getExtras()     // Catch:{ RuntimeException -> 0x000d }
            if (r5 == 0) goto L_0x000d
            java.lang.String r0 = "gcm.n.analytics_data"
            android.os.Bundle r5 = r5.getBundle(r0)     // Catch:{ RuntimeException -> 0x000d }
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            java.lang.String r0 = "1"
            if (r5 != 0) goto L_0x0014
            r1 = 0
            goto L_0x001e
        L_0x0014:
            java.lang.String r1 = "google.c.a.e"
            java.lang.String r1 = r5.getString(r1)
            boolean r1 = r0.equals(r1)
        L_0x001e:
            if (r1 == 0) goto L_0x0074
            if (r5 != 0) goto L_0x0023
            goto L_0x006f
        L_0x0023:
            java.lang.String r1 = "google.c.a.tc"
            java.lang.String r1 = r5.getString(r1)
            boolean r0 = r0.equals(r1)
            r1 = 3
            java.lang.String r2 = "FirebaseMessaging"
            if (r0 == 0) goto L_0x006c
            m9.d r0 = m9.d.d()
            java.lang.Class<p9.a> r3 = p9.a.class
            java.lang.Object r0 = r0.b(r3)
            p9.a r0 = (p9.a) r0
            android.util.Log.isLoggable(r2, r1)
            if (r0 == 0) goto L_0x006f
            java.lang.String r1 = "google.c.a.c_id"
            java.lang.String r1 = r5.getString(r1)
            r0.g(r1)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "source"
            java.lang.String r4 = "Firebase"
            r2.putString(r3, r4)
            java.lang.String r3 = "medium"
            java.lang.String r4 = "notification"
            r2.putString(r3, r4)
            java.lang.String r3 = "campaign"
            r2.putString(r3, r1)
            java.lang.String r1 = "fcm"
            java.lang.String r3 = "_cmp"
            r0.c(r1, r3, r2)
            goto L_0x006f
        L_0x006c:
            android.util.Log.isLoggable(r2, r1)
        L_0x006f:
            java.lang.String r0 = "_no"
            fb.p.a(r5, r0)
        L_0x0074:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fb.k.a(android.content.Intent):void");
    }

    @SuppressLint({"ThreadPoolCreation"})
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null && this.f10145a.add(intent)) {
            if (Build.VERSION.SDK_INT <= 25) {
                new Handler(Looper.getMainLooper()).post(new n(27, this, intent));
            } else {
                a(intent);
            }
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        if (activity.isFinishing()) {
            this.f10145a.remove(activity.getIntent());
        }
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
