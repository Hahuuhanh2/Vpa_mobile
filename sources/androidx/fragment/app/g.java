package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.viewmodel.R$id;
import d.j;
import java.util.Objects;
import p3.l0;
import r2.l;
import r2.q;

/* compiled from: DialogFragment */
public class g extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: e0  reason: collision with root package name */
    public Handler f2619e0;

    /* renamed from: f0  reason: collision with root package name */
    public a f2620f0 = new a();

    /* renamed from: g0  reason: collision with root package name */
    public b f2621g0 = new b();

    /* renamed from: h0  reason: collision with root package name */
    public c f2622h0 = new c();

    /* renamed from: i0  reason: collision with root package name */
    public int f2623i0 = 0;

    /* renamed from: j0  reason: collision with root package name */
    public int f2624j0 = 0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f2625k0 = true;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f2626l0 = true;

    /* renamed from: m0  reason: collision with root package name */
    public int f2627m0 = -1;

    /* renamed from: n0  reason: collision with root package name */
    public boolean f2628n0;

    /* renamed from: o0  reason: collision with root package name */
    public d f2629o0 = new d();

    /* renamed from: p0  reason: collision with root package name */
    public Dialog f2630p0;

    /* renamed from: q0  reason: collision with root package name */
    public boolean f2631q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f2632r0;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f2633s0;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f2634t0 = false;

    /* compiled from: DialogFragment */
    public class a implements Runnable {
        public a() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void run() {
            g gVar = g.this;
            gVar.f2622h0.onDismiss(gVar.f2630p0);
        }
    }

    /* compiled from: DialogFragment */
    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void onCancel(DialogInterface dialogInterface) {
            g gVar = g.this;
            Dialog dialog = gVar.f2630p0;
            if (dialog != null) {
                gVar.onCancel(dialog);
            }
        }
    }

    /* compiled from: DialogFragment */
    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void onDismiss(DialogInterface dialogInterface) {
            g gVar = g.this;
            Dialog dialog = gVar.f2630p0;
            if (dialog != null) {
                gVar.onDismiss(dialog);
            }
        }
    }

    /* compiled from: DialogFragment */
    public class d implements q<l> {
        public d() {
        }

        @SuppressLint({"SyntheticAccessor"})
        public final void b(Object obj) {
            if (((l) obj) != null) {
                g gVar = g.this;
                if (gVar.f2626l0) {
                    View e02 = gVar.e0();
                    if (e02.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    } else if (g.this.f2630p0 != null) {
                        if (FragmentManager.J(3)) {
                            Objects.toString(g.this.f2630p0);
                        }
                        g.this.f2630p0.setContentView(e02);
                    }
                }
            }
        }
    }

    /* compiled from: DialogFragment */
    public class e extends o {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ o f2639b;

        public e(Fragment.c cVar) {
            this.f2639b = cVar;
        }

        public final boolean F() {
            if (this.f2639b.F() || g.this.f2634t0) {
                return true;
            }
            return false;
        }

        public final View z(int i10) {
            if (this.f2639b.F()) {
                return this.f2639b.z(i10);
            }
            Dialog dialog = g.this.f2630p0;
            if (dialog != null) {
                return dialog.findViewById(i10);
            }
            return null;
        }
    }

    @Deprecated
    public final void F() {
        this.J = true;
    }

    public void I(Context context) {
        super.I(context);
        this.W.f(this.f2629o0);
        if (!this.f2633s0) {
            this.f2632r0 = false;
        }
    }

    public void J(Bundle bundle) {
        boolean z10;
        super.J(bundle);
        this.f2619e0 = new Handler();
        if (this.D == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2626l0 = z10;
        if (bundle != null) {
            this.f2623i0 = bundle.getInt("android:style", 0);
            this.f2624j0 = bundle.getInt("android:theme", 0);
            this.f2625k0 = bundle.getBoolean("android:cancelable", true);
            this.f2626l0 = bundle.getBoolean("android:showsDialog", this.f2626l0);
            this.f2627m0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public final void N() {
        this.J = true;
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            this.f2631q0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f2630p0.dismiss();
            if (!this.f2632r0) {
                onDismiss(this.f2630p0);
            }
            this.f2630p0 = null;
            this.f2634t0 = false;
        }
    }

    public final void O() {
        this.J = true;
        if (!this.f2633s0 && !this.f2632r0) {
            this.f2632r0 = true;
        }
        this.W.i(this.f2629o0);
    }

    /* JADX INFO: finally extract failed */
    public LayoutInflater P(Bundle bundle) {
        LayoutInflater P = super.P(bundle);
        boolean z10 = this.f2626l0;
        if (!z10 || this.f2628n0) {
            if (FragmentManager.J(2)) {
                toString();
            }
            return P;
        }
        if (z10 && !this.f2634t0) {
            try {
                this.f2628n0 = true;
                Dialog k02 = k0();
                this.f2630p0 = k02;
                if (this.f2626l0) {
                    m0(k02, this.f2623i0);
                    Context r10 = r();
                    if (r10 instanceof Activity) {
                        this.f2630p0.setOwnerActivity((Activity) r10);
                    }
                    this.f2630p0.setCancelable(this.f2625k0);
                    this.f2630p0.setOnCancelListener(this.f2621g0);
                    this.f2630p0.setOnDismissListener(this.f2622h0);
                    this.f2634t0 = true;
                } else {
                    this.f2630p0 = null;
                }
                this.f2628n0 = false;
            } catch (Throwable th2) {
                this.f2628n0 = false;
                throw th2;
            }
        }
        if (FragmentManager.J(2)) {
            toString();
        }
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            return P.cloneInContext(dialog.getContext());
        }
        return P;
    }

    public void T(Bundle bundle) {
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i10 = this.f2623i0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f2624j0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z10 = this.f2625k0;
        if (!z10) {
            bundle.putBoolean("android:cancelable", z10);
        }
        boolean z11 = this.f2626l0;
        if (!z11) {
            bundle.putBoolean("android:showsDialog", z11);
        }
        int i12 = this.f2627m0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    public void U() {
        this.J = true;
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            this.f2631q0 = false;
            dialog.show();
            View decorView = this.f2630p0.getWindow().getDecorView();
            j7.a.s0(decorView, this);
            decorView.setTag(R$id.view_tree_view_model_store_owner, this);
            l0.F0(decorView, this);
        }
    }

    public void V() {
        this.J = true;
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public final void X(Bundle bundle) {
        Bundle bundle2;
        this.J = true;
        if (this.f2630p0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2630p0.onRestoreInstanceState(bundle2);
        }
    }

    public final void Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.Y(layoutInflater, viewGroup, bundle);
        if (this.L == null && this.f2630p0 != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.f2630p0.onRestoreInstanceState(bundle2);
        }
    }

    public final void i0() {
        j0(true, false);
    }

    public final o j() {
        return new e(new Fragment.c());
    }

    public final void j0(boolean z10, boolean z11) {
        if (!this.f2632r0) {
            this.f2632r0 = true;
            this.f2633s0 = false;
            Dialog dialog = this.f2630p0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f2630p0.dismiss();
                if (!z11) {
                    if (Looper.myLooper() == this.f2619e0.getLooper()) {
                        onDismiss(this.f2630p0);
                    } else {
                        this.f2619e0.post(this.f2620f0);
                    }
                }
            }
            this.f2631q0 = true;
            if (this.f2627m0 >= 0) {
                FragmentManager v2 = v();
                int i10 = this.f2627m0;
                if (i10 >= 0) {
                    v2.w(new FragmentManager.m(i10, 1), z10);
                    this.f2627m0 = -1;
                    return;
                }
                throw new IllegalArgumentException(android.support.v4.media.a.m("Bad id: ", i10));
            }
            a aVar = new a(v());
            aVar.f2570p = true;
            aVar.i(this);
            if (z10) {
                aVar.d();
            } else {
                aVar.e(false);
            }
        }
    }

    public Dialog k0() {
        if (FragmentManager.J(3)) {
            toString();
        }
        return new j(d0(), this.f2624j0);
    }

    public final Dialog l0() {
        Dialog dialog = this.f2630p0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void m0(Dialog dialog, int i10) {
        if (!(i10 == 1 || i10 == 2)) {
            if (i10 == 3) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void n0(FragmentManager fragmentManager, String str) {
        this.f2632r0 = false;
        this.f2633s0 = true;
        fragmentManager.getClass();
        a aVar = new a(fragmentManager);
        aVar.f2570p = true;
        aVar.g(0, this, str, 1);
        aVar.e(false);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f2631q0) {
            if (FragmentManager.J(3)) {
                toString();
            }
            j0(true, true);
        }
    }
}
