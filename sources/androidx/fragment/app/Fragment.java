package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.a0;
import androidx.lifecycle.e0;
import androidx.lifecycle.f;
import androidx.lifecycle.f0;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.viewmodel.R$id;
import androidx.lifecycle.y;
import f0.b0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p3.l0;
import r2.l;
import r2.p;
import r2.w;
import r2.x;
import sk.j;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, l, x, f, a3.e {

    /* renamed from: d0  reason: collision with root package name */
    public static final Object f2439d0 = new Object();
    public w A;
    public Fragment B;
    public int C;
    public int D;
    public String E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public ViewGroup K;
    public View L;
    public boolean M;
    public boolean N;
    public d O;
    public boolean P;
    public LayoutInflater Q;
    public boolean R;
    public String S;
    public i.b T;
    public o U;
    public i0 V;
    public p<l> W;
    public a0 X;
    public a3.d Y;
    public int Z;

    /* renamed from: a  reason: collision with root package name */
    public int f2440a;

    /* renamed from: a0  reason: collision with root package name */
    public final AtomicInteger f2441a0;

    /* renamed from: b  reason: collision with root package name */
    public Bundle f2442b;

    /* renamed from: b0  reason: collision with root package name */
    public final ArrayList<e> f2443b0;

    /* renamed from: c  reason: collision with root package name */
    public SparseArray<Parcelable> f2444c;

    /* renamed from: c0  reason: collision with root package name */
    public final b f2445c0;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f2446d;

    /* renamed from: e  reason: collision with root package name */
    public String f2447e;

    /* renamed from: f  reason: collision with root package name */
    public Bundle f2448f;

    /* renamed from: n  reason: collision with root package name */
    public Fragment f2449n;

    /* renamed from: o  reason: collision with root package name */
    public String f2450o;

    /* renamed from: p  reason: collision with root package name */
    public int f2451p;

    /* renamed from: q  reason: collision with root package name */
    public Boolean f2452q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f2453r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f2454s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f2455t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f2456u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f2457v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f2458w;

    /* renamed from: x  reason: collision with root package name */
    public int f2459x;

    /* renamed from: y  reason: collision with root package name */
    public FragmentManager f2460y;

    /* renamed from: z  reason: collision with root package name */
    public r<?> f2461z;

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            Fragment fragment = Fragment.this;
            if (fragment.O != null) {
                fragment.l().getClass();
            }
        }
    }

    public class b extends e {
        public b() {
        }

        public final void a() {
            Bundle bundle;
            Fragment.this.Y.a();
            y.b(Fragment.this);
            Bundle bundle2 = Fragment.this.f2442b;
            if (bundle2 != null) {
                bundle = bundle2.getBundle("registryState");
            } else {
                bundle = null;
            }
            Fragment.this.Y.b(bundle);
        }
    }

    public class c extends o {
        public c() {
        }

        public final boolean F() {
            if (Fragment.this.L != null) {
                return true;
            }
            return false;
        }

        public final View z(int i10) {
            View view = Fragment.this.L;
            if (view != null) {
                return view.findViewById(i10);
            }
            StringBuilder q10 = android.support.v4.media.a.q("Fragment ");
            q10.append(Fragment.this);
            q10.append(" does not have a view");
            throw new IllegalStateException(q10.toString());
        }
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f2466a;

        /* renamed from: b  reason: collision with root package name */
        public int f2467b;

        /* renamed from: c  reason: collision with root package name */
        public int f2468c;

        /* renamed from: d  reason: collision with root package name */
        public int f2469d;

        /* renamed from: e  reason: collision with root package name */
        public int f2470e;

        /* renamed from: f  reason: collision with root package name */
        public int f2471f;

        /* renamed from: g  reason: collision with root package name */
        public ArrayList<String> f2472g;

        /* renamed from: h  reason: collision with root package name */
        public ArrayList<String> f2473h;

        /* renamed from: i  reason: collision with root package name */
        public Object f2474i;

        /* renamed from: j  reason: collision with root package name */
        public Object f2475j;

        /* renamed from: k  reason: collision with root package name */
        public Object f2476k;

        /* renamed from: l  reason: collision with root package name */
        public float f2477l = 1.0f;

        /* renamed from: m  reason: collision with root package name */
        public View f2478m = null;

        public d() {
            Object obj = Fragment.f2439d0;
            this.f2474i = obj;
            this.f2475j = obj;
            this.f2476k = obj;
        }
    }

    public static abstract class e {
        public abstract void a();
    }

    public Fragment() {
        this.f2440a = -1;
        this.f2447e = UUID.randomUUID().toString();
        this.f2450o = null;
        this.f2452q = null;
        this.A = new w();
        this.I = true;
        this.N = true;
        new a();
        this.T = i.b.RESUMED;
        this.W = new p<>();
        this.f2441a0 = new AtomicInteger();
        this.f2443b0 = new ArrayList<>();
        this.f2445c0 = new b();
        z();
    }

    public final void A() {
        z();
        this.S = this.f2447e;
        this.f2447e = UUID.randomUUID().toString();
        this.f2453r = false;
        this.f2454s = false;
        this.f2455t = false;
        this.f2456u = false;
        this.f2457v = false;
        this.f2459x = 0;
        this.f2460y = null;
        this.A = new w();
        this.f2461z = null;
        this.C = 0;
        this.D = 0;
        this.E = null;
        this.F = false;
        this.G = false;
    }

    public final o B() {
        return this.U;
    }

    public final boolean C() {
        if (this.f2461z == null || !this.f2453r) {
            return false;
        }
        return true;
    }

    public final boolean D() {
        boolean z10;
        if (!this.F) {
            FragmentManager fragmentManager = this.f2460y;
            if (fragmentManager == null) {
                return false;
            }
            Fragment fragment = this.B;
            fragmentManager.getClass();
            if (fragment == null) {
                z10 = false;
            } else {
                z10 = fragment.D();
            }
            if (z10) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean E() {
        if (this.f2459x > 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public void F() {
        this.J = true;
    }

    @Deprecated
    public void G(int i10, int i11, Intent intent) {
        if (FragmentManager.J(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    @Deprecated
    public void H(Activity activity) {
        this.J = true;
    }

    public void I(Context context) {
        Activity activity;
        this.J = true;
        r<?> rVar = this.f2461z;
        if (rVar == null) {
            activity = null;
        } else {
            activity = rVar.f2697b;
        }
        if (activity != null) {
            this.J = false;
            H(activity);
        }
    }

    public void J(Bundle bundle) {
        boolean z10;
        Bundle bundle2;
        this.J = true;
        Bundle bundle3 = this.f2442b;
        if (!(bundle3 == null || (bundle2 = bundle3.getBundle("childFragmentManager")) == null)) {
            this.A.W(bundle2);
            w wVar = this.A;
            wVar.F = false;
            wVar.G = false;
            wVar.M.f2718i = false;
            wVar.t(1);
        }
        w wVar2 = this.A;
        if (wVar2.f2503t >= 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            wVar2.F = false;
            wVar2.G = false;
            wVar2.M.f2718i = false;
            wVar2.t(1);
        }
    }

    public Animation K(boolean z10, int i10, int i11) {
        return null;
    }

    public View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i10 = this.Z;
        if (i10 != 0) {
            return layoutInflater.inflate(i10, viewGroup, false);
        }
        return null;
    }

    public void M() {
        this.J = true;
    }

    public void N() {
        this.J = true;
    }

    public void O() {
        this.J = true;
    }

    public LayoutInflater P(Bundle bundle) {
        r<?> rVar = this.f2461z;
        if (rVar != null) {
            LayoutInflater L2 = rVar.L();
            L2.setFactory2(this.A.f2489f);
            return L2;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void Q() {
        this.J = true;
    }

    @Deprecated
    public void R(int i10, String[] strArr, int[] iArr) {
    }

    public void S() {
        this.J = true;
    }

    public void T(Bundle bundle) {
    }

    public void U() {
        this.J = true;
    }

    public void V() {
        this.J = true;
    }

    public void W(View view, Bundle bundle) {
    }

    public void X(Bundle bundle) {
        this.J = true;
    }

    public void Y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.A.Q();
        boolean z10 = true;
        this.f2458w = true;
        this.V = new i0(this, n(), new d.d(this, 18));
        View L2 = L(layoutInflater, viewGroup, bundle);
        this.L = L2;
        if (L2 != null) {
            this.V.c();
            if (FragmentManager.J(3)) {
                Objects.toString(this.L);
                toString();
            }
            j7.a.s0(this.L, this.V);
            View view = this.L;
            i0 i0Var = this.V;
            j.f(view, "<this>");
            view.setTag(R$id.view_tree_view_model_store_owner, i0Var);
            l0.F0(this.L, this.V);
            this.W.j(this.V);
            return;
        }
        if (this.V.f2652e == null) {
            z10 = false;
        }
        if (!z10) {
            this.V = null;
            return;
        }
        throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
    }

    public final f.b Z(f.a aVar, g.a aVar2) {
        j jVar = new j(this);
        if (this.f2440a <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            a0(new k(this, jVar, atomicReference, aVar2, aVar));
            return new h(atomicReference);
        }
        throw new IllegalStateException(android.support.v4.media.a.n("Fragment ", this, " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate())."));
    }

    public final void a0(e eVar) {
        if (this.f2440a >= 0) {
            eVar.a();
        } else {
            this.f2443b0.add(eVar);
        }
    }

    @Deprecated
    public final void b0(String[] strArr) {
        if (this.f2461z != null) {
            FragmentManager v2 = v();
            if (v2.C != null) {
                v2.D.addLast(new FragmentManager.LaunchedFragmentInfo(this.f2447e, 10086));
                v2.C.a(strArr);
                return;
            }
            v2.f2504u.getClass();
            return;
        }
        throw new IllegalStateException(android.support.v4.media.a.n("Fragment ", this, " not attached to Activity"));
    }

    public final FragmentActivity c0() {
        FragmentActivity m10 = m();
        if (m10 != null) {
            return m10;
        }
        throw new IllegalStateException(android.support.v4.media.a.n("Fragment ", this, " not attached to an activity."));
    }

    public final Context d0() {
        Context r10 = r();
        if (r10 != null) {
            return r10;
        }
        throw new IllegalStateException(android.support.v4.media.a.n("Fragment ", this, " not attached to a context."));
    }

    public final View e0() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException(android.support.v4.media.a.n("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public f0.b f() {
        if (this.f2460y != null) {
            if (this.X == null) {
                Application application = null;
                Context context = d0().getApplicationContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Application) {
                        application = (Application) context;
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.J(3)) {
                    Objects.toString(d0().getApplicationContext());
                }
                this.X = new a0(application, this, this.f2448f);
            }
            return this.X;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final void f0(int i10, int i11, int i12, int i13) {
        if (this.O != null || i10 != 0 || i11 != 0 || i12 != 0 || i13 != 0) {
            l().f2467b = i10;
            l().f2468c = i11;
            l().f2469d = i12;
            l().f2470e = i13;
        }
    }

    public final s2.b g() {
        Application application;
        Context applicationContext = d0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.J(3)) {
            Objects.toString(d0().getApplicationContext());
        }
        s2.b bVar = new s2.b();
        if (application != null) {
            bVar.f14601a.put(e0.f2756a, application);
        }
        bVar.f14601a.put(y.f2839a, this);
        bVar.f14601a.put(y.f2840b, this);
        Bundle bundle = this.f2448f;
        if (bundle != null) {
            bVar.f14601a.put(y.f2841c, bundle);
        }
        return bVar;
    }

    public final void g0(Bundle bundle) {
        boolean z10;
        FragmentManager fragmentManager = this.f2460y;
        if (fragmentManager != null) {
            if (fragmentManager == null) {
                z10 = false;
            } else {
                z10 = fragmentManager.O();
            }
            if (z10) {
                throw new IllegalStateException("Fragment already added and state has been saved");
            }
        }
        this.f2448f = bundle;
    }

    public final void h0(Intent intent) {
        r<?> rVar = this.f2461z;
        if (rVar != null) {
            k1.a.startActivity(rVar.f2698c, intent, (Bundle) null);
            return;
        }
        throw new IllegalStateException(android.support.v4.media.a.n("Fragment ", this, " not attached to Activity"));
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public o j() {
        return new c();
    }

    public void k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.C));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.D));
        printWriter.print(" mTag=");
        printWriter.println(this.E);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f2440a);
        printWriter.print(" mWho=");
        printWriter.print(this.f2447e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.f2459x);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.f2453r);
        printWriter.print(" mRemoving=");
        printWriter.print(this.f2454s);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.f2455t);
        printWriter.print(" mInLayout=");
        printWriter.println(this.f2456u);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.F);
        printWriter.print(" mDetached=");
        printWriter.print(this.G);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.I);
        printWriter.print(" mHasMenu=");
        int i17 = 0;
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.H);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.N);
        if (this.f2460y != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.f2460y);
        }
        if (this.f2461z != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.f2461z);
        }
        if (this.B != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.B);
        }
        if (this.f2448f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f2448f);
        }
        if (this.f2442b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f2442b);
        }
        if (this.f2444c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f2444c);
        }
        if (this.f2446d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f2446d);
        }
        Fragment fragment = this.f2449n;
        if (fragment == null) {
            FragmentManager fragmentManager = this.f2460y;
            if (fragmentManager == null || (str2 = this.f2450o) == null) {
                fragment = null;
            } else {
                fragment = fragmentManager.B(str2);
            }
        }
        if (fragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(fragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.f2451p);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        d dVar = this.O;
        if (dVar == null) {
            z10 = false;
        } else {
            z10 = dVar.f2466a;
        }
        printWriter.println(z10);
        d dVar2 = this.O;
        if (dVar2 == null) {
            i10 = 0;
        } else {
            i10 = dVar2.f2467b;
        }
        if (i10 != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            d dVar3 = this.O;
            if (dVar3 == null) {
                i16 = 0;
            } else {
                i16 = dVar3.f2467b;
            }
            printWriter.println(i16);
        }
        d dVar4 = this.O;
        if (dVar4 == null) {
            i11 = 0;
        } else {
            i11 = dVar4.f2468c;
        }
        if (i11 != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            d dVar5 = this.O;
            if (dVar5 == null) {
                i15 = 0;
            } else {
                i15 = dVar5.f2468c;
            }
            printWriter.println(i15);
        }
        d dVar6 = this.O;
        if (dVar6 == null) {
            i12 = 0;
        } else {
            i12 = dVar6.f2469d;
        }
        if (i12 != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            d dVar7 = this.O;
            if (dVar7 == null) {
                i14 = 0;
            } else {
                i14 = dVar7.f2469d;
            }
            printWriter.println(i14);
        }
        d dVar8 = this.O;
        if (dVar8 == null) {
            i13 = 0;
        } else {
            i13 = dVar8.f2470e;
        }
        if (i13 != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            d dVar9 = this.O;
            if (dVar9 != null) {
                i17 = dVar9.f2470e;
            }
            printWriter.println(i17);
        }
        if (this.K != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.K);
        }
        if (this.L != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.L);
        }
        if (r() != null) {
            new t2.a(this, n()).J(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.A + ":");
        this.A.v(b0.r(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final d l() {
        if (this.O == null) {
            this.O = new d();
        }
        return this.O;
    }

    public final FragmentActivity m() {
        r<?> rVar = this.f2461z;
        if (rVar == null) {
            return null;
        }
        return (FragmentActivity) rVar.f2697b;
    }

    public final w n() {
        if (this.f2460y == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (u() != 1) {
            x xVar = this.f2460y.M;
            w wVar = xVar.f2715f.get(this.f2447e);
            if (wVar != null) {
                return wVar;
            }
            w wVar2 = new w();
            xVar.f2715f.put(this.f2447e, wVar2);
            return wVar2;
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    public final FragmentManager o() {
        if (this.f2461z != null) {
            return this.A;
        }
        throw new IllegalStateException(android.support.v4.media.a.n("Fragment ", this, " has not been attached yet."));
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.J = true;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        c0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public final void onLowMemory() {
        this.J = true;
    }

    public final a3.c q() {
        return this.Y.f89b;
    }

    public Context r() {
        r<?> rVar = this.f2461z;
        if (rVar == null) {
            return null;
        }
        return rVar.f2698c;
    }

    public final Object s() {
        r<?> rVar = this.f2461z;
        if (rVar == null) {
            return null;
        }
        return rVar.K();
    }

    @Deprecated
    public final void startActivityForResult(Intent intent, int i10) {
        if (this.f2461z != null) {
            FragmentManager v2 = v();
            if (v2.A != null) {
                v2.D.addLast(new FragmentManager.LaunchedFragmentInfo(this.f2447e, i10));
                v2.A.a(intent);
                return;
            }
            r<?> rVar = v2.f2504u;
            if (i10 == -1) {
                k1.a.startActivity(rVar.f2698c, intent, (Bundle) null);
            } else {
                rVar.getClass();
                throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
            }
        } else {
            throw new IllegalStateException(android.support.v4.media.a.n("Fragment ", this, " not attached to Activity"));
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.f2447e);
        if (this.C != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.C));
        }
        if (this.E != null) {
            sb2.append(" tag=");
            sb2.append(this.E);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public final int u() {
        i.b bVar = this.T;
        if (bVar == i.b.INITIALIZED || this.B == null) {
            return bVar.ordinal();
        }
        return Math.min(bVar.ordinal(), this.B.u());
    }

    public final FragmentManager v() {
        FragmentManager fragmentManager = this.f2460y;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException(android.support.v4.media.a.n("Fragment ", this, " not associated with a fragment manager."));
    }

    public final Resources w() {
        return d0().getResources();
    }

    public final String x(int i10) {
        return w().getString(i10);
    }

    public final i0 y() {
        i0 i0Var = this.V;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException(android.support.v4.media.a.n("Can't access the Fragment View's LifecycleOwner for ", this, " when getView() is null i.e., before onCreateView() or after onDestroyView()"));
    }

    public final void z() {
        this.U = new o(this);
        this.Y = new a3.d(this);
        this.X = null;
        if (!this.f2443b0.contains(this.f2445c0)) {
            a0(this.f2445c0);
        }
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final Bundle f2462a;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState(Bundle bundle) {
            this.f2462a = bundle;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeBundle(this.f2462a);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f2462a = readBundle;
            if (classLoader != null && readBundle != null) {
                readBundle.setClassLoader(classLoader);
            }
        }
    }

    public Fragment(int i10) {
        this();
        this.Z = i10;
    }
}
