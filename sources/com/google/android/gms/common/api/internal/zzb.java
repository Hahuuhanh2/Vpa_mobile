package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import f0.b0;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
import v0.b;
import w6.g;
import w6.m1;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class zzb extends Fragment implements g {

    /* renamed from: d  reason: collision with root package name */
    public static final WeakHashMap f5359d = new WeakHashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Map f5360a = DesugarCollections.synchronizedMap(new b());

    /* renamed from: b  reason: collision with root package name */
    public int f5361b = 0;

    /* renamed from: c  reason: collision with root package name */
    public Bundle f5362c;

    public final void c(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f5360a.containsKey(str)) {
            this.f5360a.put(str, lifecycleCallback);
            if (this.f5361b > 0) {
                new zzi(Looper.getMainLooper()).post(new m1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(b0.s("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f5360a.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final LifecycleCallback e(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f5360a.get(str));
    }

    public final Activity h() {
        return getActivity();
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        for (LifecycleCallback onActivityResult : this.f5360a.values()) {
            onActivityResult.onActivityResult(i10, i11, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        super.onCreate(bundle);
        this.f5361b = 1;
        this.f5362c = bundle;
        for (Map.Entry entry : this.f5360a.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f5361b = 5;
        for (LifecycleCallback onDestroy : this.f5360a.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void onResume() {
        super.onResume();
        this.f5361b = 3;
        for (LifecycleCallback onResume : this.f5360a.values()) {
            onResume.onResume();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.f5360a.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    public final void onStart() {
        super.onStart();
        this.f5361b = 2;
        for (LifecycleCallback onStart : this.f5360a.values()) {
            onStart.onStart();
        }
    }

    public final void onStop() {
        super.onStop();
        this.f5361b = 4;
        for (LifecycleCallback onStop : this.f5360a.values()) {
            onStop.onStop();
        }
    }
}
