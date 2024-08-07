package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.b;
import com.bumptech.glide.l;
import h5.k;
import java.util.HashSet;

@Deprecated
public class RequestManagerFragment extends Fragment {

    /* renamed from: a  reason: collision with root package name */
    public final h5.a f5005a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5006b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final HashSet f5007c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public l f5008d;

    /* renamed from: e  reason: collision with root package name */
    public RequestManagerFragment f5009e;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f5010f;

    public class a implements h5.l {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + RequestManagerFragment.this + "}";
        }
    }

    public RequestManagerFragment() {
        h5.a aVar = new h5.a();
        this.f5005a = aVar;
    }

    public final void a(Activity activity) {
        RequestManagerFragment requestManagerFragment = this.f5009e;
        if (requestManagerFragment != null) {
            requestManagerFragment.f5007c.remove(this);
            this.f5009e = null;
        }
        k kVar = b.b(activity).f4921f;
        kVar.getClass();
        RequestManagerFragment h10 = kVar.h(activity.getFragmentManager(), (Fragment) null);
        this.f5009e = h10;
        if (!equals(h10)) {
            this.f5009e.f5007c.add(this);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException unused) {
            Log.isLoggable("RMFragment", 5);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f5005a.b();
        RequestManagerFragment requestManagerFragment = this.f5009e;
        if (requestManagerFragment != null) {
            requestManagerFragment.f5007c.remove(this);
            this.f5009e = null;
        }
    }

    public final void onDetach() {
        super.onDetach();
        RequestManagerFragment requestManagerFragment = this.f5009e;
        if (requestManagerFragment != null) {
            requestManagerFragment.f5007c.remove(this);
            this.f5009e = null;
        }
    }

    public final void onStart() {
        super.onStart();
        this.f5005a.c();
    }

    public final void onStop() {
        super.onStop();
        this.f5005a.e();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f5010f;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
