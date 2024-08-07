package w6;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.common.zzi;
import f0.b0;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
import v0.b;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
public final class o1 extends Fragment implements g {

    /* renamed from: h0  reason: collision with root package name */
    public static final WeakHashMap f16644h0 = new WeakHashMap();

    /* renamed from: e0  reason: collision with root package name */
    public final Map f16645e0 = DesugarCollections.synchronizedMap(new b());

    /* renamed from: f0  reason: collision with root package name */
    public int f16646f0 = 0;

    /* renamed from: g0  reason: collision with root package name */
    public Bundle f16647g0;

    public final void G(int i10, int i11, Intent intent) {
        super.G(i10, i11, intent);
        for (LifecycleCallback onActivityResult : this.f16645e0.values()) {
            onActivityResult.onActivityResult(i10, i11, intent);
        }
    }

    public final void J(Bundle bundle) {
        Bundle bundle2;
        super.J(bundle);
        this.f16646f0 = 1;
        this.f16647g0 = bundle;
        for (Map.Entry entry : this.f16645e0.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    public final void M() {
        this.J = true;
        this.f16646f0 = 5;
        for (LifecycleCallback onDestroy : this.f16645e0.values()) {
            onDestroy.onDestroy();
        }
    }

    public final void S() {
        this.J = true;
        this.f16646f0 = 3;
        for (LifecycleCallback onResume : this.f16645e0.values()) {
            onResume.onResume();
        }
    }

    public final void T(Bundle bundle) {
        for (Map.Entry entry : this.f16645e0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void U() {
        this.J = true;
        this.f16646f0 = 2;
        for (LifecycleCallback onStart : this.f16645e0.values()) {
            onStart.onStart();
        }
    }

    public final void V() {
        this.J = true;
        this.f16646f0 = 4;
        for (LifecycleCallback onStop : this.f16645e0.values()) {
            onStop.onStop();
        }
    }

    public final void c(String str, LifecycleCallback lifecycleCallback) {
        if (!this.f16645e0.containsKey(str)) {
            this.f16645e0.put(str, lifecycleCallback);
            if (this.f16646f0 > 0) {
                new zzi(Looper.getMainLooper()).post(new n1(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(b0.s("LifecycleCallback with tag ", str, " already added to this fragment."));
    }

    public final LifecycleCallback e(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f16645e0.get(str));
    }

    public final /* synthetic */ Activity h() {
        return m();
    }

    public final void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.k(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback dump : this.f16645e0.values()) {
            dump.dump(str, fileDescriptor, printWriter, strArr);
        }
    }
}
