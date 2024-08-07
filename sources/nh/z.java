package nh;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import com.vpa.daugia.module.home.ui.HomeFragment;
import d2.l;
import dj.a;
import ef.g;
import ej.f;
import ej.h;
import hj.b;
import p3.l0;

/* compiled from: Hilt_HomeFragment */
public abstract class z<DB extends l> extends g<DB> implements b {

    /* renamed from: h0  reason: collision with root package name */
    public h.a f21709h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f21710i0;

    /* renamed from: j0  reason: collision with root package name */
    public volatile f f21711j0;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f21712k0 = new Object();

    /* renamed from: l0  reason: collision with root package name */
    public boolean f21713l0 = false;

    public final void H(Activity activity) {
        boolean z10;
        this.J = true;
        h.a aVar = this.f21709h0;
        if (aVar == null || f.b(aVar) == activity) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0.q(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        l0();
        if (!this.f21713l0) {
            this.f21713l0 = true;
            ((s0) d()).l((HomeFragment) this);
        }
    }

    public final void I(Context context) {
        super.I(context);
        l0();
        if (!this.f21713l0) {
            this.f21713l0 = true;
            ((s0) d()).l((HomeFragment) this);
        }
    }

    public final LayoutInflater P(Bundle bundle) {
        LayoutInflater P = super.P(bundle);
        return P.cloneInContext(new h.a(P, (Fragment) this));
    }

    public final Object d() {
        if (this.f21711j0 == null) {
            synchronized (this.f21712k0) {
                if (this.f21711j0 == null) {
                    this.f21711j0 = new f(this);
                }
            }
        }
        return this.f21711j0.d();
    }

    public final f0.b f() {
        return a.b(this, super.f());
    }

    public final void l0() {
        if (this.f21709h0 == null) {
            this.f21709h0 = new h.a(super.r(), (Fragment) this);
            this.f21710i0 = bj.a.a(super.r());
        }
    }

    public final Context r() {
        if (super.r() == null && !this.f21710i0) {
            return null;
        }
        l0();
        return this.f21709h0;
    }
}
