package mf;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.f0;
import com.ots.core.utils.customview.a;
import ej.f;
import ej.h;
import hj.b;
import p3.l0;

/* compiled from: Hilt_BaseBottomSheetSelectDialog */
public abstract class c extends com.google.android.material.bottomsheet.c implements b {

    /* renamed from: u0  reason: collision with root package name */
    public h.a f13287u0;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f13288v0;

    /* renamed from: w0  reason: collision with root package name */
    public volatile f f13289w0;

    /* renamed from: x0  reason: collision with root package name */
    public final Object f13290x0 = new Object();

    /* renamed from: y0  reason: collision with root package name */
    public boolean f13291y0 = false;

    public final void H(Activity activity) {
        boolean z10;
        this.J = true;
        h.a aVar = this.f13287u0;
        if (aVar == null || f.b(aVar) == activity) {
            z10 = true;
        } else {
            z10 = false;
        }
        l0.q(z10, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        p0();
        if (!this.f13291y0) {
            this.f13291y0 = true;
            a aVar2 = (a) this;
            ((a) d()).j();
        }
    }

    public final void I(Context context) {
        super.I(context);
        p0();
        if (!this.f13291y0) {
            this.f13291y0 = true;
            a aVar = (a) this;
            ((a) d()).j();
        }
    }

    public final LayoutInflater P(Bundle bundle) {
        LayoutInflater P = super.P(bundle);
        return P.cloneInContext(new h.a(P, (Fragment) this));
    }

    public final Object d() {
        if (this.f13289w0 == null) {
            synchronized (this.f13290x0) {
                if (this.f13289w0 == null) {
                    this.f13289w0 = new f(this);
                }
            }
        }
        return this.f13289w0.d();
    }

    public final f0.b f() {
        return dj.a.b(this, super.f());
    }

    public final void p0() {
        if (this.f13287u0 == null) {
            this.f13287u0 = new h.a(super.r(), (Fragment) this);
            this.f13288v0 = bj.a.a(super.r());
        }
    }

    public final Context r() {
        if (super.r() == null && !this.f13288v0) {
            return null;
        }
        p0();
        return this.f13287u0;
    }
}
