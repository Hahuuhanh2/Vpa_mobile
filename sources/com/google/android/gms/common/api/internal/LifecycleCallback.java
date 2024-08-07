package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.a;
import androidx.fragment.app.w;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import w6.f;
import w6.g;
import w6.o1;
import y6.j;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public class LifecycleCallback {
    public final g mLifecycleFragment;

    public LifecycleCallback(g gVar) {
        this.mLifecycleFragment = gVar;
    }

    @Keep
    private static g getChimeraLifecycleFragmentImpl(f fVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static g getFragment(Activity activity) {
        return getFragment(new f(activity));
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public Activity getActivity() {
        Activity h10 = this.mLifecycleFragment.h();
        j.f(h10);
        return h10;
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public static g getFragment(f fVar) {
        zzb zzb;
        o1 o1Var;
        Activity activity = fVar.f16594a;
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            WeakHashMap weakHashMap = o1.f16644h0;
            WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
            if (weakReference == null || (o1Var = (o1) weakReference.get()) == null) {
                try {
                    o1Var = (o1) fragmentActivity.G().D("SupportLifecycleFragmentImpl");
                    if (o1Var == null || o1Var.f2454s) {
                        o1Var = new o1();
                        w G = fragmentActivity.G();
                        G.getClass();
                        a aVar = new a(G);
                        aVar.g(0, o1Var, "SupportLifecycleFragmentImpl", 1);
                        aVar.d();
                    }
                    weakHashMap.put(fragmentActivity, new WeakReference(o1Var));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
                }
            }
            return o1Var;
        } else if (activity instanceof Activity) {
            WeakHashMap weakHashMap2 = zzb.f5359d;
            WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
            if (weakReference2 == null || (zzb = (zzb) weakReference2.get()) == null) {
                try {
                    zzb = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                    if (zzb == null || zzb.isRemoving()) {
                        zzb = new zzb();
                        activity.getFragmentManager().beginTransaction().add(zzb, "LifecycleFragmentImpl").commitAllowingStateLoss();
                    }
                    weakHashMap2.put(activity, new WeakReference(zzb));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e11);
                }
            }
            return zzb;
        } else {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
    }

    public static g getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
