package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.List;
import w6.g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaeq extends LifecycleCallback {
    private final List zza;

    private zzaeq(g gVar, List list) {
        super(gVar);
        this.mLifecycleFragment.c("PhoneAuthActivityStopCallback", this);
        this.zza = list;
    }

    public static void zza(Activity activity, List list) {
        g fragment = LifecycleCallback.getFragment(activity);
        if (((zzaeq) fragment.e(zzaeq.class, "PhoneAuthActivityStopCallback")) == null) {
            new zzaeq(fragment, list);
        }
    }

    public final void onStop() {
        synchronized (this.zza) {
            this.zza.clear();
        }
    }
}
