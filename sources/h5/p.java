package h5;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.b;
import com.bumptech.glide.l;
import java.util.HashSet;

/* compiled from: SupportRequestManagerFragment */
public class p extends Fragment {

    /* renamed from: e0  reason: collision with root package name */
    public final a f10598e0;

    /* renamed from: f0  reason: collision with root package name */
    public final a f10599f0 = new a();

    /* renamed from: g0  reason: collision with root package name */
    public final HashSet f10600g0 = new HashSet();

    /* renamed from: h0  reason: collision with root package name */
    public p f10601h0;

    /* renamed from: i0  reason: collision with root package name */
    public l f10602i0;

    /* renamed from: j0  reason: collision with root package name */
    public Fragment f10603j0;

    /* compiled from: SupportRequestManagerFragment */
    public class a implements l {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + p.this + "}";
        }
    }

    public p() {
        a aVar = new a();
        this.f10598e0 = aVar;
    }

    public final void I(Context context) {
        super.I(context);
        Fragment fragment = this;
        while (true) {
            Fragment fragment2 = fragment.B;
            if (fragment2 == null) {
                break;
            }
            fragment = fragment2;
        }
        FragmentManager fragmentManager = fragment.f2460y;
        if (fragmentManager == null) {
            Log.isLoggable("SupportRMFragment", 5);
            return;
        }
        try {
            i0(r(), fragmentManager);
        } catch (IllegalStateException unused) {
            Log.isLoggable("SupportRMFragment", 5);
        }
    }

    public final void M() {
        this.J = true;
        this.f10598e0.b();
        p pVar = this.f10601h0;
        if (pVar != null) {
            pVar.f10600g0.remove(this);
            this.f10601h0 = null;
        }
    }

    public final void O() {
        this.J = true;
        this.f10603j0 = null;
        p pVar = this.f10601h0;
        if (pVar != null) {
            pVar.f10600g0.remove(this);
            this.f10601h0 = null;
        }
    }

    public final void U() {
        this.J = true;
        this.f10598e0.c();
    }

    public final void V() {
        this.J = true;
        this.f10598e0.e();
    }

    public final void i0(Context context, FragmentManager fragmentManager) {
        p pVar = this.f10601h0;
        if (pVar != null) {
            pVar.f10600g0.remove(this);
            this.f10601h0 = null;
        }
        p i10 = b.b(context).f4921f.i(fragmentManager, (Fragment) null);
        this.f10601h0 = i10;
        if (!equals(i10)) {
            this.f10601h0.f10600g0.add(this);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment fragment = this.B;
        if (fragment == null) {
            fragment = this.f10603j0;
        }
        sb2.append(fragment);
        sb2.append("}");
        return sb2.toString();
    }
}
