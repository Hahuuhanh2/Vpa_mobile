package gh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import d2.l;
import ef.g;
import ej.f;
import ej.h;
import hj.b;
import p3.l0;

/* compiled from: Hilt_PaidCartFragment */
public abstract class a<DB extends l> extends g<DB> implements b {

    /* renamed from: h0  reason: collision with root package name */
    public h.a f20280h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f20281i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile f f20282j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f20283k0 = new Object();

    /* renamed from: l0  reason: collision with root package name */
    public boolean f20284l0 = false;

    public final void H(Activity activity) {
        boolean z10;
        this.J = true;
        h.a aVar = this.f20280h0;
        if (aVar == null || f.b(aVar) == activity) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0.q(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        l0();
        if (!this.f20284l0) {
            this.f20284l0 = true;
            h hVar = (h) this;
            ((i) d()).m();
        }
    }

    public final void I(Context context) {
        super.I(context);
        l0();
        if (!this.f20284l0) {
            this.f20284l0 = true;
            h hVar = (h) this;
            ((i) d()).m();
        }
    }

    public final LayoutInflater P(Bundle bundle) {
        LayoutInflater P = super.P(bundle);
        return P.cloneInContext(new h.a(P, (Fragment) this));
    }

    public final Object d() {
        if (this.f20282j0 == null) {
            synchronized (this.f20283k0) {
                if (this.f20282j0 == null) {
                    this.f20282j0 = new f(this);
                }
            }
        }
        return this.f20282j0.d();
    }

    public final f0.b f() {
        return dj.a.b(this, super.f());
    }

    public final void l0() {
        if (this.f20280h0 == null) {
            this.f20280h0 = new h.a(super.r(), (Fragment) this);
            this.f20281i0 = bj.a.a(super.r());
        }
    }

    public final Context r() {
        if (super.r() == null && !this.f20281i0) {
            return null;
        }
        l0();
        return this.f20280h0;
    }
}
