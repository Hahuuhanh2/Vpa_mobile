package ai;

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

/* compiled from: Hilt_TransferPaymentFragment */
public abstract class a<DB extends l> extends g<DB> implements b {

    /* renamed from: h0  reason: collision with root package name */
    public h.a f18967h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f18968i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile f f18969j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f18970k0 = new Object();

    /* renamed from: l0  reason: collision with root package name */
    public boolean f18971l0 = false;

    public final void H(Activity activity) {
        boolean z10;
        this.J = true;
        h.a aVar = this.f18967h0;
        if (aVar == null || f.b(aVar) == activity) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0.q(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        l0();
        if (!this.f18971l0) {
            this.f18971l0 = true;
            j jVar = (j) this;
            ((k) d()).d();
        }
    }

    public final void I(Context context) {
        super.I(context);
        l0();
        if (!this.f18971l0) {
            this.f18971l0 = true;
            j jVar = (j) this;
            ((k) d()).d();
        }
    }

    public final LayoutInflater P(Bundle bundle) {
        LayoutInflater P = super.P(bundle);
        return P.cloneInContext(new h.a(P, (Fragment) this));
    }

    public final Object d() {
        if (this.f18969j0 == null) {
            synchronized (this.f18970k0) {
                if (this.f18969j0 == null) {
                    this.f18969j0 = new f(this);
                }
            }
        }
        return this.f18969j0.d();
    }

    public final f0.b f() {
        return dj.a.b(this, super.f());
    }

    public final void l0() {
        if (this.f18967h0 == null) {
            this.f18967h0 = new h.a(super.r(), (Fragment) this);
            this.f18968i0 = bj.a.a(super.r());
        }
    }

    public final Context r() {
        if (super.r() == null && !this.f18968i0) {
            return null;
        }
        l0();
        return this.f18967h0;
    }
}
