package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R$attr;
import androidx.recyclerview.R$dimen;
import androidx.recyclerview.R$styleable;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.a0;
import androidx.recyclerview.widget.j;
import androidx.recyclerview.widget.u;
import androidx.recyclerview.widget.z;
import f0.b0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import s1.n;
import w1.d0;
import w1.h0;
import w1.q0;
import x1.f;

public class RecyclerView extends ViewGroup implements w1.l {
    public static boolean I0 = false;
    public static boolean J0 = false;
    public static final int[] K0 = {16843830};
    public static final float L0 = ((float) (Math.log(0.78d) / Math.log(0.9d)));
    public static final boolean M0 = true;
    public static final boolean N0 = true;
    public static final boolean O0 = true;
    public static final Class<?>[] P0;
    public static final c Q0 = new c();
    public static final x R0 = new x();
    public boolean A;
    public final int[] A0;
    public boolean B;
    public final int[] B0;
    public boolean C;
    public final ArrayList C0;
    public int D;
    public b D0;
    public boolean E;
    public boolean E0;
    public boolean F;
    public int F0;
    public boolean G;
    public int G0;
    public int H;
    public final d H0;
    public boolean I;
    public final AccessibilityManager J;
    public ArrayList K;
    public boolean L;
    public boolean M;
    public int N;
    public int O;
    public i P;
    public EdgeEffect Q;
    public EdgeEffect R;
    public EdgeEffect S;
    public EdgeEffect T;
    public j U;
    public int V;
    public int W;

    /* renamed from: a  reason: collision with root package name */
    public final float f2961a;

    /* renamed from: a0  reason: collision with root package name */
    public VelocityTracker f2962a0;

    /* renamed from: b  reason: collision with root package name */
    public final u f2963b;

    /* renamed from: b0  reason: collision with root package name */
    public int f2964b0;

    /* renamed from: c  reason: collision with root package name */
    public final s f2965c;

    /* renamed from: c0  reason: collision with root package name */
    public int f2966c0;

    /* renamed from: d  reason: collision with root package name */
    public SavedState f2967d;

    /* renamed from: d0  reason: collision with root package name */
    public int f2968d0;

    /* renamed from: e  reason: collision with root package name */
    public a f2969e;

    /* renamed from: e0  reason: collision with root package name */
    public int f2970e0;

    /* renamed from: f  reason: collision with root package name */
    public b f2971f;

    /* renamed from: f0  reason: collision with root package name */
    public int f2972f0;

    /* renamed from: g0  reason: collision with root package name */
    public o f2973g0;

    /* renamed from: h0  reason: collision with root package name */
    public final int f2974h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f2975i0;

    /* renamed from: j0  reason: collision with root package name */
    public float f2976j0;

    /* renamed from: k0  reason: collision with root package name */
    public float f2977k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f2978l0;

    /* renamed from: m0  reason: collision with root package name */
    public final z f2979m0;

    /* renamed from: n  reason: collision with root package name */
    public final a0 f2980n;

    /* renamed from: n0  reason: collision with root package name */
    public j f2981n0;

    /* renamed from: o  reason: collision with root package name */
    public boolean f2982o;

    /* renamed from: o0  reason: collision with root package name */
    public j.b f2983o0;

    /* renamed from: p  reason: collision with root package name */
    public final a f2984p;

    /* renamed from: p0  reason: collision with root package name */
    public final w f2985p0;

    /* renamed from: q  reason: collision with root package name */
    public final Rect f2986q;

    /* renamed from: q0  reason: collision with root package name */
    public q f2987q0;

    /* renamed from: r  reason: collision with root package name */
    public final Rect f2988r;

    /* renamed from: r0  reason: collision with root package name */
    public ArrayList f2989r0;

    /* renamed from: s  reason: collision with root package name */
    public final RectF f2990s;

    /* renamed from: s0  reason: collision with root package name */
    public boolean f2991s0;

    /* renamed from: t  reason: collision with root package name */
    public e f2992t;

    /* renamed from: t0  reason: collision with root package name */
    public boolean f2993t0;

    /* renamed from: u  reason: collision with root package name */
    public m f2994u;

    /* renamed from: u0  reason: collision with root package name */
    public k f2995u0;

    /* renamed from: v  reason: collision with root package name */
    public t f2996v;

    /* renamed from: v0  reason: collision with root package name */
    public boolean f2997v0;

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList f2998w;

    /* renamed from: w0  reason: collision with root package name */
    public u f2999w0;

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<l> f3000x;

    /* renamed from: x0  reason: collision with root package name */
    public final int[] f3001x0;

    /* renamed from: y  reason: collision with root package name */
    public final ArrayList<p> f3002y;

    /* renamed from: y0  reason: collision with root package name */
    public w1.m f3003y0;

    /* renamed from: z  reason: collision with root package name */
    public p f3004z;

    /* renamed from: z0  reason: collision with root package name */
    public final int[] f3005z0;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.C && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.A) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.F) {
                    recyclerView2.E = true;
                } else {
                    recyclerView2.p();
                }
            }
        }
    }

    public static abstract class a0 {

        /* renamed from: t  reason: collision with root package name */
        public static final List<Object> f3012t = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f3013a;

        /* renamed from: b  reason: collision with root package name */
        public WeakReference<RecyclerView> f3014b;

        /* renamed from: c  reason: collision with root package name */
        public int f3015c = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f3016d = -1;

        /* renamed from: e  reason: collision with root package name */
        public long f3017e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f3018f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f3019g = -1;

        /* renamed from: h  reason: collision with root package name */
        public a0 f3020h = null;

        /* renamed from: i  reason: collision with root package name */
        public a0 f3021i = null;

        /* renamed from: j  reason: collision with root package name */
        public int f3022j;

        /* renamed from: k  reason: collision with root package name */
        public ArrayList f3023k = null;

        /* renamed from: l  reason: collision with root package name */
        public List<Object> f3024l = null;

        /* renamed from: m  reason: collision with root package name */
        public int f3025m = 0;

        /* renamed from: n  reason: collision with root package name */
        public s f3026n = null;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3027o = false;

        /* renamed from: p  reason: collision with root package name */
        public int f3028p = 0;

        /* renamed from: q  reason: collision with root package name */
        public int f3029q = -1;

        /* renamed from: r  reason: collision with root package name */
        public RecyclerView f3030r;

        /* renamed from: s  reason: collision with root package name */
        public e<? extends a0> f3031s;

        public a0(View view) {
            if (view != null) {
                this.f3013a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        public final void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f3022j) == 0) {
                if (this.f3023k == null) {
                    ArrayList arrayList = new ArrayList();
                    this.f3023k = arrayList;
                    this.f3024l = Collections.unmodifiableList(arrayList);
                }
                this.f3023k.add(obj);
            }
        }

        public final void b(int i10) {
            this.f3022j = i10 | this.f3022j;
        }

        public final int c() {
            RecyclerView recyclerView = this.f3030r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.K(this);
        }

        public final int d() {
            int i10 = this.f3019g;
            if (i10 == -1) {
                return this.f3015c;
            }
            return i10;
        }

        public final List<Object> e() {
            if ((this.f3022j & 1024) != 0) {
                return f3012t;
            }
            ArrayList arrayList = this.f3023k;
            if (arrayList == null || arrayList.size() == 0) {
                return f3012t;
            }
            return this.f3024l;
        }

        public final boolean f() {
            if (this.f3013a.getParent() == null || this.f3013a.getParent() == this.f3030r) {
                return false;
            }
            return true;
        }

        public final boolean g() {
            if ((this.f3022j & 1) != 0) {
                return true;
            }
            return false;
        }

        public final boolean h() {
            if ((this.f3022j & 4) != 0) {
                return true;
            }
            return false;
        }

        public final boolean i() {
            if ((this.f3022j & 16) == 0) {
                View view = this.f3013a;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                if (!d0.d.i(view)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean j() {
            if ((this.f3022j & 8) != 0) {
                return true;
            }
            return false;
        }

        public final boolean k() {
            if (this.f3026n != null) {
                return true;
            }
            return false;
        }

        public final boolean l() {
            if ((this.f3022j & 256) != 0) {
                return true;
            }
            return false;
        }

        public final void m(int i10, boolean z10) {
            if (this.f3016d == -1) {
                this.f3016d = this.f3015c;
            }
            if (this.f3019g == -1) {
                this.f3019g = this.f3015c;
            }
            if (z10) {
                this.f3019g += i10;
            }
            this.f3015c += i10;
            if (this.f3013a.getLayoutParams() != null) {
                ((LayoutParams) this.f3013a.getLayoutParams()).f3008c = true;
            }
        }

        public final void n() {
            if (!RecyclerView.I0 || !l()) {
                this.f3022j = 0;
                this.f3015c = -1;
                this.f3016d = -1;
                this.f3017e = -1;
                this.f3019g = -1;
                this.f3025m = 0;
                this.f3020h = null;
                this.f3021i = null;
                ArrayList arrayList = this.f3023k;
                if (arrayList != null) {
                    arrayList.clear();
                }
                this.f3022j &= -1025;
                this.f3028p = 0;
                this.f3029q = -1;
                RecyclerView.l(this);
                return;
            }
            throw new IllegalStateException("Attempting to reset temp-detached ViewHolder: " + this + ". ViewHolders should be fully detached before resetting.");
        }

        public final void o(boolean z10) {
            int i10;
            int i11 = this.f3025m;
            if (z10) {
                i10 = i11 - 1;
            } else {
                i10 = i11 + 1;
            }
            this.f3025m = i10;
            if (i10 < 0) {
                this.f3025m = 0;
                if (!RecyclerView.I0) {
                    toString();
                } else {
                    throw new RuntimeException("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                }
            } else if (!z10 && i10 == 1) {
                this.f3022j |= 16;
            } else if (z10 && i10 == 0) {
                this.f3022j &= -17;
            }
            if (RecyclerView.J0) {
                toString();
            }
        }

        public final boolean p() {
            if ((this.f3022j & 128) != 0) {
                return true;
            }
            return false;
        }

        public final boolean q() {
            if ((this.f3022j & 32) != 0) {
                return true;
            }
            return false;
        }

        public final String toString() {
            String str;
            boolean z10;
            String str2;
            if (getClass().isAnonymousClass()) {
                str = "ViewHolder";
            } else {
                str = getClass().getSimpleName();
            }
            StringBuilder v2 = b0.v(str, "{");
            v2.append(Integer.toHexString(hashCode()));
            v2.append(" position=");
            v2.append(this.f3015c);
            v2.append(" id=");
            v2.append(this.f3017e);
            v2.append(", oldPos=");
            v2.append(this.f3016d);
            v2.append(", pLpos:");
            v2.append(this.f3019g);
            StringBuilder sb2 = new StringBuilder(v2.toString());
            if (k()) {
                sb2.append(" scrap ");
                if (this.f3027o) {
                    str2 = "[changeScrap]";
                } else {
                    str2 = "[attachedScrap]";
                }
                sb2.append(str2);
            }
            if (h()) {
                sb2.append(" invalid");
            }
            if (!g()) {
                sb2.append(" unbound");
            }
            boolean z11 = true;
            if ((this.f3022j & 2) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                sb2.append(" update");
            }
            if (j()) {
                sb2.append(" removed");
            }
            if (p()) {
                sb2.append(" ignored");
            }
            if (l()) {
                sb2.append(" tmpDetached");
            }
            if (!i()) {
                StringBuilder q10 = android.support.v4.media.a.q(" not recyclable(");
                q10.append(this.f3025m);
                q10.append(")");
                sb2.append(q10.toString());
            }
            if ((this.f3022j & 512) == 0 && !h()) {
                z11 = false;
            }
            if (z11) {
                sb2.append(" undefined adapter position");
            }
            if (this.f3013a.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public final void run() {
            j jVar = RecyclerView.this.U;
            if (jVar != null) {
                jVar.n();
            }
            RecyclerView.this.f2997v0 = false;
        }
    }

    public class c implements Interpolator {
        public final float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    public class d {
        public d() {
        }
    }

    public static abstract class e<VH extends a0> {

        /* renamed from: a  reason: collision with root package name */
        public final f f3034a = new f();

        /* renamed from: b  reason: collision with root package name */
        public boolean f3035b = false;

        /* renamed from: c  reason: collision with root package name */
        public int f3036c = 1;

        public abstract int c();

        public long d(int i10) {
            return -1;
        }

        public int e(int i10) {
            return 0;
        }

        public final void f() {
            this.f3034a.b();
        }

        public final void g(int i10) {
            this.f3034a.c(i10, 1);
        }

        public void h(RecyclerView recyclerView) {
        }

        public abstract void i(VH vh2, int i10);

        public void j(VH vh2, int i10, List<Object> list) {
            i(vh2, i10);
        }

        public abstract a0 k(RecyclerView recyclerView, int i10);

        public void l(RecyclerView recyclerView) {
        }

        public boolean m(VH vh2) {
            return false;
        }

        public void n(VH vh2) {
        }

        public void o(VH vh2) {
        }

        public void p(VH vh2) {
        }

        public void q(g gVar) {
            this.f3034a.registerObserver(gVar);
        }

        public final void r() {
            if (!this.f3034a.a()) {
                this.f3035b = true;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void s(g gVar) {
            this.f3034a.unregisterObserver(gVar);
        }
    }

    public static class f extends Observable<g> {
        public final boolean a() {
            return !this.mObservers.isEmpty();
        }

        public final void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).a();
            }
        }

        public final void c(int i10, int i11) {
            int size = this.mObservers.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((g) this.mObservers.get(size)).c(i10, i11);
                } else {
                    return;
                }
            }
        }

        public final void d(int i10, int i11) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((g) this.mObservers.get(size)).d(i10, i11);
            }
        }
    }

    public static abstract class g {
        public void a() {
        }

        public void b() {
        }

        public void c(int i10, int i11) {
            b();
        }

        public void d(int i10, int i11) {
        }
    }

    public interface h {
        int a();
    }

    public static class i {
    }

    public static abstract class j {

        /* renamed from: a  reason: collision with root package name */
        public b f3037a = null;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a> f3038b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        public long f3039c = 120;

        /* renamed from: d  reason: collision with root package name */
        public long f3040d = 120;

        /* renamed from: e  reason: collision with root package name */
        public long f3041e = 250;

        /* renamed from: f  reason: collision with root package name */
        public long f3042f = 250;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f3043a;

            /* renamed from: b  reason: collision with root package name */
            public int f3044b;

            public final void a(a0 a0Var) {
                View view = a0Var.f3013a;
                this.f3043a = view.getLeft();
                this.f3044b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        public static void e(a0 a0Var) {
            int i10 = a0Var.f3022j & 14;
            if (!a0Var.h() && (i10 & 4) == 0) {
                a0Var.c();
            }
        }

        public abstract boolean a(a0 a0Var, c cVar, c cVar2);

        public abstract boolean b(a0 a0Var, a0 a0Var2, c cVar, c cVar2);

        public abstract boolean c(a0 a0Var, c cVar, c cVar2);

        public abstract boolean d(a0 a0Var, c cVar, c cVar2);

        public abstract boolean f(a0 a0Var);

        public boolean g(a0 a0Var, List<Object> list) {
            return f(a0Var);
        }

        public final void h(a0 a0Var) {
            boolean z10;
            b bVar = this.f3037a;
            if (bVar != null) {
                k kVar = (k) bVar;
                boolean z11 = true;
                a0Var.o(true);
                if (a0Var.f3020h != null && a0Var.f3021i == null) {
                    a0Var.f3020h = null;
                }
                a0Var.f3021i = null;
                if ((a0Var.f3022j & 16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    RecyclerView recyclerView = RecyclerView.this;
                    View view = a0Var.f3013a;
                    recyclerView.o0();
                    b bVar2 = recyclerView.f2971f;
                    int indexOfChild = ((s) bVar2.f3168a).f3296a.indexOfChild(view);
                    if (indexOfChild == -1) {
                        bVar2.m(view);
                    } else if (bVar2.f3169b.d(indexOfChild)) {
                        bVar2.f3169b.f(indexOfChild);
                        bVar2.m(view);
                        ((s) bVar2.f3168a).b(indexOfChild);
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        a0 O = RecyclerView.O(view);
                        recyclerView.f2965c.m(O);
                        recyclerView.f2965c.j(O);
                        if (RecyclerView.J0) {
                            Objects.toString(view);
                            recyclerView.toString();
                        }
                    }
                    recyclerView.p0(!z11);
                    if (!z11 && a0Var.l()) {
                        RecyclerView.this.removeDetachedView(a0Var.f3013a, false);
                    }
                }
            }
        }

        public final void i() {
            int size = this.f3038b.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f3038b.get(i10).a();
            }
            this.f3038b.clear();
        }

        public abstract void j(a0 a0Var);

        public abstract void k();

        public abstract boolean l();

        public final boolean m(a aVar) {
            boolean l10 = l();
            if (aVar != null) {
                if (!l10) {
                    aVar.a();
                } else {
                    this.f3038b.add(aVar);
                }
            }
            return l10;
        }

        public abstract void n();
    }

    public class k implements j.b {
        public k() {
        }
    }

    public static abstract class l {
        public void d(Rect rect, View view, RecyclerView recyclerView, w wVar) {
            ((LayoutParams) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void e(Canvas canvas, RecyclerView recyclerView) {
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }
    }

    public static abstract class m {

        /* renamed from: a  reason: collision with root package name */
        public b f3046a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f3047b;

        /* renamed from: c  reason: collision with root package name */
        public z f3048c;

        /* renamed from: d  reason: collision with root package name */
        public z f3049d;

        /* renamed from: e  reason: collision with root package name */
        public v f3050e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3051f = false;

        /* renamed from: n  reason: collision with root package name */
        public boolean f3052n = false;

        /* renamed from: o  reason: collision with root package name */
        public boolean f3053o = false;

        /* renamed from: p  reason: collision with root package name */
        public boolean f3054p = true;

        /* renamed from: q  reason: collision with root package name */
        public boolean f3055q = true;

        /* renamed from: r  reason: collision with root package name */
        public int f3056r;

        /* renamed from: s  reason: collision with root package name */
        public boolean f3057s;

        /* renamed from: t  reason: collision with root package name */
        public int f3058t;

        /* renamed from: u  reason: collision with root package name */
        public int f3059u;

        /* renamed from: v  reason: collision with root package name */
        public int f3060v;

        /* renamed from: w  reason: collision with root package name */
        public int f3061w;

        public class a implements z.b {
            public a() {
            }

            public final int a(View view) {
                m.this.getClass();
                return (view.getLeft() - m.N(view)) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            public final int b() {
                return m.this.getPaddingLeft();
            }

            public final int c() {
                m mVar = m.this;
                return mVar.f3060v - mVar.getPaddingRight();
            }

            public final View d(int i10) {
                return m.this.G(i10);
            }

            public final int e(View view) {
                m.this.getClass();
                return m.Q(view) + view.getRight() + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements z.b {
            public b() {
            }

            public final int a(View view) {
                m.this.getClass();
                return (view.getTop() - m.S(view)) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            public final int b() {
                return m.this.getPaddingTop();
            }

            public final int c() {
                m mVar = m.this;
                return mVar.f3061w - mVar.getPaddingBottom();
            }

            public final View d(int i10) {
                return m.this.G(i10);
            }

            public final int e(View view) {
                m.this.getClass();
                return m.F(view) + view.getBottom() + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f3064a;

            /* renamed from: b  reason: collision with root package name */
            public int f3065b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f3066c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f3067d;
        }

        public m() {
            a aVar = new a();
            b bVar = new b();
            this.f3048c = new z(aVar);
            this.f3049d = new z(bVar);
        }

        public static int F(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3007b.bottom;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int I(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.I(int, int, int, int, boolean):int");
        }

        public static int N(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3007b.left;
        }

        public static int O(View view) {
            return ((LayoutParams) view.getLayoutParams()).a();
        }

        public static d P(Context context, AttributeSet attributeSet, int i10, int i11) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.RecyclerView, i10, i11);
            dVar.f3064a = obtainStyledAttributes.getInt(R$styleable.RecyclerView_android_orientation, 1);
            dVar.f3065b = obtainStyledAttributes.getInt(R$styleable.RecyclerView_spanCount, 1);
            dVar.f3066c = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_reverseLayout, false);
            dVar.f3067d = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int Q(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3007b.right;
        }

        public static int S(View view) {
            return ((LayoutParams) view.getLayoutParams()).f3007b.top;
        }

        public static boolean V(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i11);
            int size = View.MeasureSpec.getSize(i11);
            if (i12 > 0 && i10 != i12) {
                return false;
            }
            if (mode != Integer.MIN_VALUE) {
                if (mode == 0) {
                    return true;
                }
                if (mode == 1073741824 && size == i10) {
                    return true;
                }
                return false;
            } else if (size >= i10) {
                return true;
            } else {
                return false;
            }
        }

        public static void W(View view, int i10, int i11, int i12, int i13) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.f3007b;
            view.layout(i10 + rect.left + layoutParams.leftMargin, i11 + rect.top + layoutParams.topMargin, (i12 - rect.right) - layoutParams.rightMargin, (i13 - rect.bottom) - layoutParams.bottomMargin);
        }

        public static int r(int i10, int i11, int i12) {
            int mode = View.MeasureSpec.getMode(i10);
            int size = View.MeasureSpec.getSize(i10);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i11, i12));
            }
            if (mode != 1073741824) {
                return Math.max(i11, i12);
            }
            return size;
        }

        public final void A(s sVar) {
            int H = H();
            while (true) {
                H--;
                if (H >= 0) {
                    View G = G(H);
                    a0 O = RecyclerView.O(G);
                    if (O.p()) {
                        if (RecyclerView.J0) {
                            O.toString();
                        }
                    } else if (!O.h() || O.j() || this.f3047b.f2992t.f3035b) {
                        G(H);
                        this.f3046a.c(H);
                        sVar.k(G);
                        this.f3047b.f2980n.d(O);
                    } else {
                        if (G(H) != null) {
                            this.f3046a.l(H);
                        }
                        sVar.j(O);
                    }
                } else {
                    return;
                }
            }
        }

        public final void A0() {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public View B(int i10) {
            int H = H();
            for (int i11 = 0; i11 < H; i11++) {
                View G = G(i11);
                a0 O = RecyclerView.O(G);
                if (O != null && O.d() == i10 && !O.p() && (this.f3047b.f2985p0.f3103g || !O.j())) {
                    return G;
                }
            }
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public int B0(int i10, s sVar, w wVar) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public abstract LayoutParams C();

        public void C0(int i10) {
            boolean z10 = RecyclerView.I0;
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams D(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        @SuppressLint({"UnknownNullness"})
        public int D0(int i10, s sVar, w wVar) {
            return 0;
        }

        @SuppressLint({"UnknownNullness"})
        public LayoutParams E(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        public final void E0(RecyclerView recyclerView) {
            F0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void F0(int i10, int i11) {
            this.f3060v = View.MeasureSpec.getSize(i10);
            int mode = View.MeasureSpec.getMode(i10);
            this.f3058t = mode;
            if (mode == 0 && !RecyclerView.M0) {
                this.f3060v = 0;
            }
            this.f3061w = View.MeasureSpec.getSize(i11);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f3059u = mode2;
            if (mode2 == 0 && !RecyclerView.M0) {
                this.f3061w = 0;
            }
        }

        public final View G(int i10) {
            b bVar = this.f3046a;
            if (bVar != null) {
                return bVar.d(i10);
            }
            return null;
        }

        public void G0(Rect rect, int i10, int i11) {
            int paddingRight = getPaddingRight() + getPaddingLeft() + rect.width();
            int paddingBottom = getPaddingBottom() + getPaddingTop() + rect.height();
            RecyclerView recyclerView = this.f3047b;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            this.f3047b.setMeasuredDimension(r(i10, paddingRight, d0.d.e(recyclerView)), r(i11, paddingBottom, d0.d.d(this.f3047b)));
        }

        public final int H() {
            b bVar = this.f3046a;
            if (bVar != null) {
                return bVar.e();
            }
            return 0;
        }

        public final void H0(int i10, int i11) {
            int H = H();
            if (H == 0) {
                this.f3047b.q(i10, i11);
                return;
            }
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MAX_VALUE;
            int i14 = Integer.MAX_VALUE;
            int i15 = Integer.MIN_VALUE;
            for (int i16 = 0; i16 < H; i16++) {
                View G = G(i16);
                Rect rect = this.f3047b.f2986q;
                K(G, rect);
                int i17 = rect.left;
                if (i17 < i13) {
                    i13 = i17;
                }
                int i18 = rect.right;
                if (i18 > i12) {
                    i12 = i18;
                }
                int i19 = rect.top;
                if (i19 < i14) {
                    i14 = i19;
                }
                int i20 = rect.bottom;
                if (i20 > i15) {
                    i15 = i20;
                }
            }
            this.f3047b.f2986q.set(i13, i14, i12, i15);
            G0(this.f3047b.f2986q, i10, i11);
        }

        public final void I0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f3047b = null;
                this.f3046a = null;
                this.f3060v = 0;
                this.f3061w = 0;
            } else {
                this.f3047b = recyclerView;
                this.f3046a = recyclerView.f2971f;
                this.f3060v = recyclerView.getWidth();
                this.f3061w = recyclerView.getHeight();
            }
            this.f3058t = 1073741824;
            this.f3059u = 1073741824;
        }

        public int J(s sVar, w wVar) {
            return -1;
        }

        public final boolean J0(View view, int i10, int i11, LayoutParams layoutParams) {
            if (view.isLayoutRequested() || !this.f3054p || !V(view.getWidth(), i10, layoutParams.width) || !V(view.getHeight(), i11, layoutParams.height)) {
                return true;
            }
            return false;
        }

        public void K(View view, Rect rect) {
            boolean z10 = RecyclerView.I0;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect2 = layoutParams.f3007b;
            rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
        }

        public boolean K0() {
            return false;
        }

        public final int L() {
            e eVar;
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView != null) {
                eVar = recyclerView.getAdapter();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                return eVar.c();
            }
            return 0;
        }

        public final boolean L0(View view, int i10, int i11, LayoutParams layoutParams) {
            if (!this.f3054p || !V(view.getMeasuredWidth(), i10, layoutParams.width) || !V(view.getMeasuredHeight(), i11, layoutParams.height)) {
                return true;
            }
            return false;
        }

        public final int M() {
            RecyclerView recyclerView = this.f3047b;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            return d0.e.d(recyclerView);
        }

        @SuppressLint({"UnknownNullness"})
        public void M0(RecyclerView recyclerView, w wVar, int i10) {
        }

        @SuppressLint({"UnknownNullness"})
        public final void N0(v vVar) {
            v vVar2 = this.f3050e;
            if (!(vVar2 == null || vVar == vVar2 || !vVar2.f3088e)) {
                vVar2.g();
            }
            this.f3050e = vVar;
            RecyclerView recyclerView = this.f3047b;
            z zVar = recyclerView.f2979m0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f3113c.abortAnimation();
            vVar.f3085b = recyclerView;
            vVar.f3086c = this;
            int i10 = vVar.f3084a;
            if (i10 != -1) {
                recyclerView.f2985p0.f3097a = i10;
                vVar.f3088e = true;
                vVar.f3087d = true;
                vVar.f3089f = recyclerView.f2994u.B(i10);
                vVar.d();
                vVar.f3085b.f2979m0.b();
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public boolean O0() {
            return false;
        }

        public int R(s sVar, w wVar) {
            return -1;
        }

        public final void T(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).f3007b;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (!(this.f3047b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f3047b.f2990s;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public boolean U() {
            return this.f3053o;
        }

        public void X(View view, int i10, int i11) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect P = this.f3047b.P(view);
            int i12 = P.left + P.right + i10;
            int i13 = P.top + P.bottom + i11;
            int I = I(this.f3060v, this.f3058t, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin + i12, layoutParams.width, o());
            int I2 = I(this.f3061w, this.f3059u, getPaddingBottom() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + i13, layoutParams.height, p());
            if (J0(view, I, I2, layoutParams)) {
                view.measure(I, I2);
            }
        }

        public void Y(int i10) {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView != null) {
                int e10 = recyclerView.f2971f.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f2971f.d(i11).offsetLeftAndRight(i10);
                }
            }
        }

        public void Z(int i10) {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView != null) {
                int e10 = recyclerView.f2971f.e();
                for (int i11 = 0; i11 < e10; i11++) {
                    recyclerView.f2971f.d(i11).offsetTopAndBottom(i10);
                }
            }
        }

        public void a0() {
        }

        public void b0(RecyclerView recyclerView) {
        }

        @SuppressLint({"UnknownNullness"})
        public void c0(RecyclerView recyclerView) {
        }

        public View d0(View view, int i10, s sVar, w wVar) {
            return null;
        }

        public void e0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3047b;
            s sVar = recyclerView.f2965c;
            w wVar = recyclerView.f2985p0;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView.canScrollVertically(1) && !this.f3047b.canScrollVertically(-1) && !this.f3047b.canScrollHorizontally(-1) && !this.f3047b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                e eVar = this.f3047b.f2992t;
                if (eVar != null) {
                    accessibilityEvent.setItemCount(eVar.c());
                }
            }
        }

        public void f0(s sVar, w wVar, x1.f fVar) {
            if (this.f3047b.canScrollVertically(-1) || this.f3047b.canScrollHorizontally(-1)) {
                fVar.a(8192);
                fVar.m(true);
            }
            if (this.f3047b.canScrollVertically(1) || this.f3047b.canScrollHorizontally(1)) {
                fVar.a(4096);
                fVar.m(true);
            }
            fVar.f16862a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) f.C0220f.a(R(sVar, wVar), J(sVar, wVar), 0).f16880a);
        }

        public final void g0(View view, x1.f fVar) {
            a0 O = RecyclerView.O(view);
            if (O != null && !O.j() && !this.f3046a.k(O.f3013a)) {
                RecyclerView recyclerView = this.f3047b;
                h0(recyclerView.f2965c, recyclerView.f2985p0, view, fVar);
            }
        }

        public final int getPaddingBottom() {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public final int getPaddingEnd() {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            return d0.e.e(recyclerView);
        }

        public final int getPaddingLeft() {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public final int getPaddingRight() {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public final int getPaddingStart() {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView == null) {
                return 0;
            }
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            return d0.e.f(recyclerView);
        }

        public final int getPaddingTop() {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public void h0(s sVar, w wVar, View view, x1.f fVar) {
        }

        public void i0(int i10, int i11) {
        }

        public void j0() {
        }

        public void k0(int i10, int i11) {
        }

        public final void l(View view, int i10, boolean z10) {
            a0 O = RecyclerView.O(view);
            if (z10 || O.j()) {
                a0 a0Var = this.f3047b.f2980n;
                a0.a orDefault = a0Var.f3162a.getOrDefault(O, null);
                if (orDefault == null) {
                    orDefault = a0.a.a();
                    a0Var.f3162a.put(O, orDefault);
                }
                orDefault.f3165a |= 1;
            } else {
                this.f3047b.f2980n.d(O);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (O.q() || O.k()) {
                if (O.k()) {
                    O.f3026n.m(O);
                } else {
                    O.f3022j &= -33;
                }
                this.f3046a.b(view, i10, view.getLayoutParams(), false);
            } else {
                int i11 = -1;
                if (view.getParent() == this.f3047b) {
                    int j10 = this.f3046a.j(view);
                    if (i10 == -1) {
                        i10 = this.f3046a.e();
                    }
                    if (j10 == -1) {
                        StringBuilder q10 = android.support.v4.media.a.q("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                        q10.append(this.f3047b.indexOfChild(view));
                        throw new IllegalStateException(android.support.v4.media.a.l(this.f3047b, q10));
                    } else if (j10 != i10) {
                        m mVar = this.f3047b.f2994u;
                        View G = mVar.G(j10);
                        if (G != null) {
                            mVar.G(j10);
                            mVar.f3046a.c(j10);
                            LayoutParams layoutParams2 = (LayoutParams) G.getLayoutParams();
                            a0 O2 = RecyclerView.O(G);
                            if (O2.j()) {
                                a0 a0Var2 = mVar.f3047b.f2980n;
                                a0.a orDefault2 = a0Var2.f3162a.getOrDefault(O2, null);
                                if (orDefault2 == null) {
                                    orDefault2 = a0.a.a();
                                    a0Var2.f3162a.put(O2, orDefault2);
                                }
                                orDefault2.f3165a = 1 | orDefault2.f3165a;
                            } else {
                                mVar.f3047b.f2980n.d(O2);
                            }
                            mVar.f3046a.b(G, i10, layoutParams2, O2.j());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j10 + mVar.f3047b.toString());
                        }
                    }
                } else {
                    this.f3046a.a(view, i10, false);
                    layoutParams.f3008c = true;
                    v vVar = this.f3050e;
                    if (vVar != null && vVar.f3088e) {
                        vVar.f3085b.getClass();
                        a0 O3 = RecyclerView.O(view);
                        if (O3 != null) {
                            i11 = O3.d();
                        }
                        if (i11 == vVar.f3084a) {
                            vVar.f3089f = view;
                        }
                    }
                }
            }
            if (layoutParams.f3009d) {
                if (RecyclerView.J0) {
                    Objects.toString(layoutParams.f3006a);
                }
                O.f3013a.invalidate();
                layoutParams.f3009d = false;
            }
        }

        public void l0(int i10, int i11) {
        }

        @SuppressLint({"UnknownNullness"})
        public void m(String str) {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView != null) {
                recyclerView.k(str);
            }
        }

        public void m0(int i10) {
        }

        public final void n(View view, Rect rect) {
            RecyclerView recyclerView = this.f3047b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.P(view));
            }
        }

        public void n0(RecyclerView recyclerView, int i10, int i11) {
            m0(i10);
        }

        public boolean o() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void o0(s sVar, w wVar) {
        }

        public boolean p() {
            return false;
        }

        @SuppressLint({"UnknownNullness"})
        public void p0(w wVar) {
        }

        public boolean q(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public void q0(s sVar, w wVar, int i10, int i11) {
            this.f3047b.q(i10, i11);
        }

        @SuppressLint({"UnknownNullness"})
        public void r0(Parcelable parcelable) {
        }

        @SuppressLint({"UnknownNullness"})
        public void s(int i10, int i11, w wVar, c cVar) {
        }

        public Parcelable s0() {
            return null;
        }

        @SuppressLint({"UnknownNullness"})
        public void t(int i10, c cVar) {
        }

        public void t0(int i10) {
        }

        public int u(w wVar) {
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x008c A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean u0(androidx.recyclerview.widget.RecyclerView.s r3, androidx.recyclerview.widget.RecyclerView.w r4, int r5, android.os.Bundle r6) {
            /*
                r2 = this;
                androidx.recyclerview.widget.RecyclerView r3 = r2.f3047b
                r4 = 0
                if (r3 != 0) goto L_0x0006
                return r4
            L_0x0006:
                int r3 = r2.f3061w
                int r6 = r2.f3060v
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                androidx.recyclerview.widget.RecyclerView r1 = r2.f3047b
                android.graphics.Matrix r1 = r1.getMatrix()
                boolean r1 = r1.isIdentity()
                if (r1 == 0) goto L_0x002b
                androidx.recyclerview.widget.RecyclerView r1 = r2.f3047b
                boolean r1 = r1.getGlobalVisibleRect(r0)
                if (r1 == 0) goto L_0x002b
                int r3 = r0.height()
                int r6 = r0.width()
            L_0x002b:
                r0 = 4096(0x1000, float:5.74E-42)
                r1 = 1
                if (r5 == r0) goto L_0x0061
                r0 = 8192(0x2000, float:1.14794E-41)
                if (r5 == r0) goto L_0x0037
                r3 = r4
                r5 = r3
                goto L_0x008a
            L_0x0037:
                androidx.recyclerview.widget.RecyclerView r5 = r2.f3047b
                r0 = -1
                boolean r5 = r5.canScrollVertically(r0)
                if (r5 == 0) goto L_0x004c
                int r5 = r2.getPaddingTop()
                int r3 = r3 - r5
                int r5 = r2.getPaddingBottom()
                int r3 = r3 - r5
                int r3 = -r3
                goto L_0x004d
            L_0x004c:
                r3 = r4
            L_0x004d:
                androidx.recyclerview.widget.RecyclerView r5 = r2.f3047b
                boolean r5 = r5.canScrollHorizontally(r0)
                if (r5 == 0) goto L_0x0089
                int r5 = r2.getPaddingLeft()
                int r6 = r6 - r5
                int r5 = r2.getPaddingRight()
                int r6 = r6 - r5
                int r5 = -r6
                goto L_0x008a
            L_0x0061:
                androidx.recyclerview.widget.RecyclerView r5 = r2.f3047b
                boolean r5 = r5.canScrollVertically(r1)
                if (r5 == 0) goto L_0x0074
                int r5 = r2.getPaddingTop()
                int r3 = r3 - r5
                int r5 = r2.getPaddingBottom()
                int r3 = r3 - r5
                goto L_0x0075
            L_0x0074:
                r3 = r4
            L_0x0075:
                androidx.recyclerview.widget.RecyclerView r5 = r2.f3047b
                boolean r5 = r5.canScrollHorizontally(r1)
                if (r5 == 0) goto L_0x0089
                int r5 = r2.getPaddingLeft()
                int r6 = r6 - r5
                int r5 = r2.getPaddingRight()
                int r5 = r6 - r5
                goto L_0x008a
            L_0x0089:
                r5 = r4
            L_0x008a:
                if (r3 != 0) goto L_0x008f
                if (r5 != 0) goto L_0x008f
                return r4
            L_0x008f:
                androidx.recyclerview.widget.RecyclerView r4 = r2.f3047b
                r4.m0(r5, r3, r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.u0(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$w, int, android.os.Bundle):boolean");
        }

        public int v(w wVar) {
            return 0;
        }

        public final void v0() {
            int H = H();
            while (true) {
                H--;
                if (H >= 0) {
                    this.f3046a.l(H);
                } else {
                    return;
                }
            }
        }

        public int w(w wVar) {
            return 0;
        }

        public final void w0(s sVar) {
            int H = H();
            while (true) {
                H--;
                if (H < 0) {
                    return;
                }
                if (!RecyclerView.O(G(H)).p()) {
                    View G = G(H);
                    if (G(H) != null) {
                        this.f3046a.l(H);
                    }
                    sVar.i(G);
                }
            }
        }

        public int x(w wVar) {
            return 0;
        }

        public final void x0(s sVar) {
            int size = sVar.f3075a.size();
            for (int i10 = size - 1; i10 >= 0; i10--) {
                View view = sVar.f3075a.get(i10).f3013a;
                a0 O = RecyclerView.O(view);
                if (!O.p()) {
                    O.o(false);
                    if (O.l()) {
                        this.f3047b.removeDetachedView(view, false);
                    }
                    j jVar = this.f3047b.U;
                    if (jVar != null) {
                        jVar.j(O);
                    }
                    O.o(true);
                    a0 O2 = RecyclerView.O(view);
                    O2.f3026n = null;
                    O2.f3027o = false;
                    O2.f3022j &= -33;
                    sVar.j(O2);
                }
            }
            sVar.f3075a.clear();
            ArrayList<a0> arrayList = sVar.f3076b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f3047b.invalidate();
            }
        }

        public int y(w wVar) {
            return 0;
        }

        public final void y0(View view, s sVar) {
            b bVar = this.f3046a;
            int indexOfChild = ((s) bVar.f3168a).f3296a.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (bVar.f3169b.f(indexOfChild)) {
                    bVar.m(view);
                }
                ((s) bVar.f3168a).b(indexOfChild);
            }
            sVar.i(view);
        }

        public int z(w wVar) {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
            if (r10 == false) goto L_0x00b0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean z0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.getPaddingLeft()
                int r1 = r8.getPaddingTop()
                int r2 = r8.f3060v
                int r3 = r8.getPaddingRight()
                int r2 = r2 - r3
                int r3 = r8.f3061w
                int r4 = r8.getPaddingBottom()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.M()
                r7 = 1
                if (r3 != r7) goto L_0x005c
                if (r2 == 0) goto L_0x0057
                goto L_0x0064
            L_0x0057:
                int r2 = java.lang.Math.max(r6, r10)
                goto L_0x0064
            L_0x005c:
                if (r6 == 0) goto L_0x005f
                goto L_0x0063
            L_0x005f:
                int r6 = java.lang.Math.min(r4, r2)
            L_0x0063:
                r2 = r6
            L_0x0064:
                if (r1 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0067:
                int r1 = java.lang.Math.min(r5, r11)
            L_0x006b:
                if (r13 == 0) goto L_0x00ab
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L_0x0074
                goto L_0x00a8
            L_0x0074:
                int r11 = r8.getPaddingLeft()
                int r13 = r8.getPaddingTop()
                int r3 = r8.f3060v
                int r4 = r8.getPaddingRight()
                int r3 = r3 - r4
                int r4 = r8.f3061w
                int r5 = r8.getPaddingBottom()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f3047b
                android.graphics.Rect r5 = r5.f2986q
                r8.K(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto L_0x00a8
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto L_0x00a8
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto L_0x00a8
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto L_0x00a6
                goto L_0x00a8
            L_0x00a6:
                r10 = r7
                goto L_0x00a9
            L_0x00a8:
                r10 = r0
            L_0x00a9:
                if (r10 == 0) goto L_0x00b0
            L_0x00ab:
                if (r2 != 0) goto L_0x00b1
                if (r1 == 0) goto L_0x00b0
                goto L_0x00b1
            L_0x00b0:
                return r0
            L_0x00b1:
                if (r12 == 0) goto L_0x00b7
                r9.scrollBy(r2, r1)
                goto L_0x00ba
            L_0x00b7:
                r9.m0(r2, r1, r0)
            L_0x00ba:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.m.z0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }
    }

    public interface n {
        void a(View view);

        void b(View view);
    }

    public static abstract class o {
    }

    public interface p {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z10);
    }

    public static abstract class q {
        public void a(int i10, RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i10, int i11) {
        }
    }

    public static class r {

        /* renamed from: a  reason: collision with root package name */
        public SparseArray<a> f3068a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        public int f3069b = 0;

        /* renamed from: c  reason: collision with root package name */
        public Set<e<?>> f3070c = Collections.newSetFromMap(new IdentityHashMap());

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public final ArrayList<a0> f3071a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            public int f3072b = 5;

            /* renamed from: c  reason: collision with root package name */
            public long f3073c = 0;

            /* renamed from: d  reason: collision with root package name */
            public long f3074d = 0;
        }

        public final a a(int i10) {
            a aVar = this.f3068a.get(i10);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3068a.put(i10, aVar2);
            return aVar2;
        }
    }

    public final class s {

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<a0> f3075a;

        /* renamed from: b  reason: collision with root package name */
        public ArrayList<a0> f3076b = null;

        /* renamed from: c  reason: collision with root package name */
        public final ArrayList<a0> f3077c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        public final List<a0> f3078d;

        /* renamed from: e  reason: collision with root package name */
        public int f3079e;

        /* renamed from: f  reason: collision with root package name */
        public int f3080f;

        /* renamed from: g  reason: collision with root package name */
        public r f3081g;

        public s() {
            ArrayList<a0> arrayList = new ArrayList<>();
            this.f3075a = arrayList;
            this.f3078d = Collections.unmodifiableList(arrayList);
            this.f3079e = 2;
            this.f3080f = 2;
        }

        public final void a(a0 a0Var, boolean z10) {
            w1.a aVar;
            RecyclerView.l(a0Var);
            View view = a0Var.f3013a;
            u uVar = RecyclerView.this.f2999w0;
            if (uVar != null) {
                u.a aVar2 = uVar.f3299e;
                if (aVar2 instanceof u.a) {
                    aVar = (w1.a) aVar2.f3301e.remove(view);
                } else {
                    aVar = null;
                }
                d0.o(view, aVar);
            }
            if (z10) {
                t tVar = RecyclerView.this.f2996v;
                if (tVar != null) {
                    tVar.a();
                }
                int size = RecyclerView.this.f2998w.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((t) RecyclerView.this.f2998w.get(i10)).a();
                }
                e eVar = RecyclerView.this.f2992t;
                if (eVar != null) {
                    eVar.p(a0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2985p0 != null) {
                    recyclerView.f2980n.e(a0Var);
                }
                if (RecyclerView.J0) {
                    Objects.toString(a0Var);
                }
            }
            a0Var.f3031s = null;
            a0Var.f3030r = null;
            r c10 = c();
            c10.getClass();
            int i11 = a0Var.f3018f;
            ArrayList<a0> arrayList = c10.a(i11).f3071a;
            if (c10.f3068a.get(i11).f3072b <= arrayList.size()) {
                b2.a.a(a0Var.f3013a);
            } else if (!RecyclerView.I0 || !arrayList.contains(a0Var)) {
                a0Var.n();
                arrayList.add(a0Var);
            } else {
                throw new IllegalArgumentException("this scrap item already exists");
            }
        }

        public final int b(int i10) {
            if (i10 < 0 || i10 >= RecyclerView.this.f2985p0.b()) {
                StringBuilder l10 = n0.l.l("invalid position ", i10, ". State item count is ");
                l10.append(RecyclerView.this.f2985p0.b());
                throw new IndexOutOfBoundsException(android.support.v4.media.a.l(RecyclerView.this, l10));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f2985p0.f3103g) {
                return i10;
            }
            return recyclerView.f2969e.f(i10, 0);
        }

        public final r c() {
            if (this.f3081g == null) {
                this.f3081g = new r();
                e();
            }
            return this.f3081g;
        }

        public final View d(int i10) {
            return l(i10, Long.MAX_VALUE).f3013a;
        }

        public final void e() {
            if (this.f3081g != null) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.f2992t != null && recyclerView.isAttachedToWindow()) {
                    r rVar = this.f3081g;
                    rVar.f3070c.add(RecyclerView.this.f2992t);
                }
            }
        }

        public final void f(e<?> eVar, boolean z10) {
            r rVar = this.f3081g;
            if (rVar != null) {
                rVar.f3070c.remove(eVar);
                if (rVar.f3070c.size() == 0 && !z10) {
                    for (int i10 = 0; i10 < rVar.f3068a.size(); i10++) {
                        SparseArray<r.a> sparseArray = rVar.f3068a;
                        ArrayList<a0> arrayList = sparseArray.get(sparseArray.keyAt(i10)).f3071a;
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            b2.a.a(arrayList.get(i11).f3013a);
                        }
                    }
                }
            }
        }

        public final void g() {
            for (int size = this.f3077c.size() - 1; size >= 0; size--) {
                h(size);
            }
            this.f3077c.clear();
            if (RecyclerView.O0) {
                j.b bVar = RecyclerView.this.f2983o0;
                int[] iArr = bVar.f3263c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f3264d = 0;
            }
        }

        public final void h(int i10) {
            boolean z10 = RecyclerView.I0;
            a0 a0Var = this.f3077c.get(i10);
            if (RecyclerView.J0) {
                Objects.toString(a0Var);
            }
            a(a0Var, true);
            this.f3077c.remove(i10);
        }

        public final void i(View view) {
            a0 O = RecyclerView.O(view);
            if (O.l()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (O.k()) {
                O.f3026n.m(O);
            } else if (O.q()) {
                O.f3022j &= -33;
            }
            j(O);
            if (RecyclerView.this.U != null && !O.i()) {
                RecyclerView.this.U.j(O);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x00c2 A[LOOP:1: B:58:0x00c2->B:69:0x00eb, LOOP_START, PHI: r3 
          PHI: (r3v18 int) = (r3v15 int), (r3v19 int) binds: [B:57:0x00c0, B:69:0x00eb] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x00f8  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x00fc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void j(androidx.recyclerview.widget.RecyclerView.a0 r10) {
            /*
                r9 = this;
                boolean r0 = r10.k()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0141
                android.view.View r0 = r10.f3013a
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x0141
            L_0x0012:
                boolean r0 = r10.l()
                if (r0 != 0) goto L_0x0128
                boolean r0 = r10.p()
                if (r0 != 0) goto L_0x0116
                int r0 = r10.f3022j
                r0 = r0 & 16
                if (r0 != 0) goto L_0x0030
                android.view.View r0 = r10.f3013a
                java.util.WeakHashMap<android.view.View, w1.q0> r3 = w1.d0.f16298a
                boolean r0 = w1.d0.d.i(r0)
                if (r0 == 0) goto L_0x0030
                r0 = r1
                goto L_0x0031
            L_0x0030:
                r0 = r2
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r3 = r3.f2992t
                if (r3 == 0) goto L_0x0041
                if (r0 == 0) goto L_0x0041
                boolean r3 = r3.m(r10)
                if (r3 == 0) goto L_0x0041
                r3 = r1
                goto L_0x0042
            L_0x0041:
                r3 = r2
            L_0x0042:
                boolean r4 = androidx.recyclerview.widget.RecyclerView.I0
                if (r4 == 0) goto L_0x0068
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r4 = r9.f3077c
                boolean r4 = r4.contains(r10)
                if (r4 != 0) goto L_0x004f
                goto L_0x0068
            L_0x004f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "cached view received recycle internal? "
                r1.append(r2)
                r1.append(r10)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r10 = android.support.v4.media.a.l(r10, r1)
                r0.<init>(r10)
                throw r0
            L_0x0068:
                if (r3 != 0) goto L_0x007d
                boolean r3 = r10.i()
                if (r3 == 0) goto L_0x0071
                goto L_0x007d
            L_0x0071:
                boolean r1 = androidx.recyclerview.widget.RecyclerView.J0
                if (r1 == 0) goto L_0x007a
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.C()
            L_0x007a:
                r1 = r2
                goto L_0x00fe
            L_0x007d:
                int r3 = r9.f3080f
                if (r3 <= 0) goto L_0x00f5
                int r3 = r10.f3022j
                r3 = r3 & 526(0x20e, float:7.37E-43)
                if (r3 == 0) goto L_0x0089
                r3 = r1
                goto L_0x008a
            L_0x0089:
                r3 = r2
            L_0x008a:
                if (r3 != 0) goto L_0x00f5
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r9.f3077c
                int r3 = r3.size()
                int r4 = r9.f3080f
                if (r3 < r4) goto L_0x009d
                if (r3 <= 0) goto L_0x009d
                r9.h(r2)
                int r3 = r3 + -1
            L_0x009d:
                boolean r4 = androidx.recyclerview.widget.RecyclerView.O0
                if (r4 == 0) goto L_0x00ee
                if (r3 <= 0) goto L_0x00ee
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.j$b r4 = r4.f2983o0
                int r5 = r10.f3015c
                int[] r6 = r4.f3263c
                if (r6 == 0) goto L_0x00bf
                int r6 = r4.f3264d
                int r6 = r6 * 2
                r7 = r2
            L_0x00b2:
                if (r7 >= r6) goto L_0x00bf
                int[] r8 = r4.f3263c
                r8 = r8[r7]
                if (r8 != r5) goto L_0x00bc
                r4 = r1
                goto L_0x00c0
            L_0x00bc:
                int r7 = r7 + 2
                goto L_0x00b2
            L_0x00bf:
                r4 = r2
            L_0x00c0:
                if (r4 != 0) goto L_0x00ee
            L_0x00c2:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x00ed
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r4 = r9.f3077c
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$a0 r4 = (androidx.recyclerview.widget.RecyclerView.a0) r4
                int r4 = r4.f3015c
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.j$b r5 = r5.f2983o0
                int[] r6 = r5.f3263c
                if (r6 == 0) goto L_0x00ea
                int r6 = r5.f3264d
                int r6 = r6 * 2
                r7 = r2
            L_0x00dd:
                if (r7 >= r6) goto L_0x00ea
                int[] r8 = r5.f3263c
                r8 = r8[r7]
                if (r8 != r4) goto L_0x00e7
                r4 = r1
                goto L_0x00eb
            L_0x00e7:
                int r7 = r7 + 2
                goto L_0x00dd
            L_0x00ea:
                r4 = r2
            L_0x00eb:
                if (r4 != 0) goto L_0x00c2
            L_0x00ed:
                int r3 = r3 + r1
            L_0x00ee:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r4 = r9.f3077c
                r4.add(r3, r10)
                r3 = r1
                goto L_0x00f6
            L_0x00f5:
                r3 = r2
            L_0x00f6:
                if (r3 != 0) goto L_0x00fc
                r9.a(r10, r1)
                goto L_0x00fd
            L_0x00fc:
                r1 = r2
            L_0x00fd:
                r2 = r3
            L_0x00fe:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a0 r3 = r3.f2980n
                r3.e(r10)
                if (r2 != 0) goto L_0x0115
                if (r1 != 0) goto L_0x0115
                if (r0 == 0) goto L_0x0115
                android.view.View r0 = r10.f3013a
                b2.a.a(r0)
                r0 = 0
                r10.f3031s = r0
                r10.f3030r = r0
            L_0x0115:
                return
            L_0x0116:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = android.support.v4.media.a.q(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = android.support.v4.media.a.l(r1, r0)
                r10.<init>(r0)
                throw r10
            L_0x0128:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r10)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r10 = android.support.v4.media.a.l(r10, r1)
                r0.<init>(r10)
                throw r0
            L_0x0141:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r3 = android.support.v4.media.a.q(r3)
                boolean r4 = r10.k()
                r3.append(r4)
                java.lang.String r4 = " isAttached:"
                r3.append(r4)
                android.view.View r10 = r10.f3013a
                android.view.ViewParent r10 = r10.getParent()
                if (r10 == 0) goto L_0x015e
                goto L_0x015f
            L_0x015e:
                r1 = r2
            L_0x015f:
                r3.append(r1)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r10 = android.support.v4.media.a.l(r10, r3)
                r0.<init>(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.j(androidx.recyclerview.widget.RecyclerView$a0):void");
        }

        public final void k(View view) {
            boolean z10;
            boolean z11;
            boolean z12;
            a0 O = RecyclerView.O(view);
            int i10 = O.f3022j;
            if ((i10 & 12) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                if ((i10 & 2) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    j jVar = RecyclerView.this.U;
                    if (jVar == null || jVar.g(O, O.e())) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (!z12) {
                        if (this.f3076b == null) {
                            this.f3076b = new ArrayList<>();
                        }
                        O.f3026n = this;
                        O.f3027o = true;
                        this.f3076b.add(O);
                        return;
                    }
                }
            }
            if (!O.h() || O.j() || RecyclerView.this.f2992t.f3035b) {
                O.f3026n = this;
                O.f3027o = false;
                this.f3075a.add(O);
                return;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.l(RecyclerView.this, android.support.v4.media.a.q("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }

        /* JADX WARNING: Code restructure failed: missing block: B:160:0x0321, code lost:
            r7 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x0478, code lost:
            if (r7.h() == false) goto L_0x04d4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:250:0x04d2, code lost:
            if (r6 == false) goto L_0x04d4;
         */
        /* JADX WARNING: Removed duplicated region for block: B:127:0x026d  */
        /* JADX WARNING: Removed duplicated region for block: B:212:0x041b  */
        /* JADX WARNING: Removed duplicated region for block: B:226:0x045f  */
        /* JADX WARNING: Removed duplicated region for block: B:227:0x0463  */
        /* JADX WARNING: Removed duplicated region for block: B:325:0x064c  */
        /* JADX WARNING: Removed duplicated region for block: B:326:0x065a  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0089  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.a0 l(int r20, long r21) {
            /*
                r19 = this;
                r1 = r19
                r0 = r20
                if (r0 < 0) goto L_0x067c
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f2985p0
                int r2 = r2.b()
                if (r0 >= r2) goto L_0x067c
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r2 = r2.f2985p0
                boolean r2 = r2.f3103g
                r3 = 32
                r4 = 0
                r5 = 0
                if (r2 == 0) goto L_0x008b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r2 = r1.f3076b
                if (r2 == 0) goto L_0x0086
                int r2 = r2.size()
                if (r2 != 0) goto L_0x0027
                goto L_0x0086
            L_0x0027:
                r6 = r5
            L_0x0028:
                if (r6 >= r2) goto L_0x0045
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f3076b
                java.lang.Object r7 = r7.get(r6)
                androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.a0) r7
                boolean r8 = r7.q()
                if (r8 != 0) goto L_0x0042
                int r8 = r7.d()
                if (r8 != r0) goto L_0x0042
                r7.b(r3)
                goto L_0x0087
            L_0x0042:
                int r6 = r6 + 1
                goto L_0x0028
            L_0x0045:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r7 = r6.f2992t
                boolean r7 = r7.f3035b
                if (r7 == 0) goto L_0x0086
                androidx.recyclerview.widget.a r6 = r6.f2969e
                int r6 = r6.f(r0, r5)
                if (r6 <= 0) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r7 = r7.f2992t
                int r7 = r7.c()
                if (r6 >= r7) goto L_0x0086
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r7 = r7.f2992t
                long r6 = r7.d(r6)
                r8 = r5
            L_0x0068:
                if (r8 >= r2) goto L_0x0086
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r1.f3076b
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.a0) r9
                boolean r10 = r9.q()
                if (r10 != 0) goto L_0x0083
                long r10 = r9.f3017e
                int r10 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r10 != 0) goto L_0x0083
                r9.b(r3)
                r7 = r9
                goto L_0x0087
            L_0x0083:
                int r8 = r8 + 1
                goto L_0x0068
            L_0x0086:
                r7 = r4
            L_0x0087:
                if (r7 == 0) goto L_0x008c
                r2 = 1
                goto L_0x008d
            L_0x008b:
                r7 = r4
            L_0x008c:
                r2 = r5
            L_0x008d:
                r6 = -1
                if (r7 != 0) goto L_0x026b
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f3075a
                int r7 = r7.size()
                r8 = r5
            L_0x0097:
                if (r8 >= r7) goto L_0x00c9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r1.f3075a
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.a0) r9
                boolean r10 = r9.q()
                if (r10 != 0) goto L_0x00c6
                int r10 = r9.d()
                if (r10 != r0) goto L_0x00c6
                boolean r10 = r9.h()
                if (r10 != 0) goto L_0x00c6
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r10 = r10.f2985p0
                boolean r10 = r10.f3103g
                if (r10 != 0) goto L_0x00c1
                boolean r10 = r9.j()
                if (r10 != 0) goto L_0x00c6
            L_0x00c1:
                r9.b(r3)
                goto L_0x01b7
            L_0x00c6:
                int r8 = r8 + 1
                goto L_0x0097
            L_0x00c9:
                androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r7 = r7.f2971f
                java.util.ArrayList r8 = r7.f3170c
                int r8 = r8.size()
                r9 = r5
            L_0x00d4:
                if (r9 >= r8) goto L_0x00ff
                java.util.ArrayList r10 = r7.f3170c
                java.lang.Object r10 = r10.get(r9)
                android.view.View r10 = (android.view.View) r10
                androidx.recyclerview.widget.b$b r11 = r7.f3168a
                androidx.recyclerview.widget.s r11 = (androidx.recyclerview.widget.s) r11
                r11.getClass()
                androidx.recyclerview.widget.RecyclerView$a0 r11 = androidx.recyclerview.widget.RecyclerView.O(r10)
                int r12 = r11.d()
                if (r12 != r0) goto L_0x00fc
                boolean r12 = r11.h()
                if (r12 != 0) goto L_0x00fc
                boolean r11 = r11.j()
                if (r11 != 0) goto L_0x00fc
                goto L_0x0100
            L_0x00fc:
                int r9 = r9 + 1
                goto L_0x00d4
            L_0x00ff:
                r10 = r4
            L_0x0100:
                if (r10 == 0) goto L_0x0188
                androidx.recyclerview.widget.RecyclerView$a0 r7 = androidx.recyclerview.widget.RecyclerView.O(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r8 = r8.f2971f
                androidx.recyclerview.widget.b$b r9 = r8.f3168a
                androidx.recyclerview.widget.s r9 = (androidx.recyclerview.widget.s) r9
                androidx.recyclerview.widget.RecyclerView r9 = r9.f3296a
                int r9 = r9.indexOfChild(r10)
                if (r9 < 0) goto L_0x0171
                androidx.recyclerview.widget.b$a r11 = r8.f3169b
                boolean r11 = r11.d(r9)
                if (r11 == 0) goto L_0x015a
                androidx.recyclerview.widget.b$a r11 = r8.f3169b
                r11.a(r9)
                r8.m(r10)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r8 = r8.f2971f
                int r8 = r8.j(r10)
                if (r8 == r6) goto L_0x0141
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.b r9 = r9.f2971f
                r9.c(r8)
                r1.k(r10)
                r8 = 8224(0x2020, float:1.1524E-41)
                r7.b(r8)
                goto L_0x01bd
            L_0x0141:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "layout index should not be -1 after unhiding a view:"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = android.support.v4.media.a.l(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x015a:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "trying to unhide a view that was not hidden"
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0171:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "view is not a child, cannot hide "
                r2.append(r3)
                r2.append(r10)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0188:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f3077c
                int r7 = r7.size()
                r8 = r5
            L_0x018f:
                if (r8 >= r7) goto L_0x01bc
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r9 = r1.f3077c
                java.lang.Object r9 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$a0 r9 = (androidx.recyclerview.widget.RecyclerView.a0) r9
                boolean r10 = r9.h()
                if (r10 != 0) goto L_0x01b9
                int r10 = r9.d()
                if (r10 != r0) goto L_0x01b9
                boolean r10 = r9.f()
                if (r10 != 0) goto L_0x01b9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f3077c
                r7.remove(r8)
                boolean r7 = androidx.recyclerview.widget.RecyclerView.J0
                if (r7 == 0) goto L_0x01b7
                r9.toString()
            L_0x01b7:
                r7 = r9
                goto L_0x01bd
            L_0x01b9:
                int r8 = r8 + 1
                goto L_0x018f
            L_0x01bc:
                r7 = r4
            L_0x01bd:
                if (r7 == 0) goto L_0x026b
                boolean r8 = r7.j()
                if (r8 == 0) goto L_0x01eb
                boolean r8 = androidx.recyclerview.widget.RecyclerView.I0
                if (r8 == 0) goto L_0x01e4
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r8 = r8.f2985p0
                boolean r8 = r8.f3103g
                if (r8 == 0) goto L_0x01d2
                goto L_0x01e4
            L_0x01d2:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "should not receive a removed view unless it is pre layout"
                java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = android.support.v4.media.a.l(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x01e4:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r8 = r8.f2985p0
                boolean r8 = r8.f3103g
                goto L_0x0226
            L_0x01eb:
                int r8 = r7.f3015c
                if (r8 < 0) goto L_0x0252
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r9 = r9.f2992t
                int r9 = r9.c()
                if (r8 >= r9) goto L_0x0252
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r9 = r8.f2985p0
                boolean r9 = r9.f3103g
                if (r9 != 0) goto L_0x020e
                androidx.recyclerview.widget.RecyclerView$e r8 = r8.f2992t
                int r9 = r7.f3015c
                int r8 = r8.e(r9)
                int r9 = r7.f3018f
                if (r8 == r9) goto L_0x020e
                goto L_0x0223
            L_0x020e:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r8 = r8.f2992t
                boolean r9 = r8.f3035b
                if (r9 == 0) goto L_0x0225
                long r9 = r7.f3017e
                int r11 = r7.f3015c
                long r11 = r8.d(r11)
                int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r8 != 0) goto L_0x0223
                goto L_0x0225
            L_0x0223:
                r8 = r5
                goto L_0x0226
            L_0x0225:
                r8 = 1
            L_0x0226:
                if (r8 != 0) goto L_0x0250
                r8 = 4
                r7.b(r8)
                boolean r8 = r7.k()
                if (r8 == 0) goto L_0x023f
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r7.f3013a
                r8.removeDetachedView(r9, r5)
                androidx.recyclerview.widget.RecyclerView$s r8 = r7.f3026n
                r8.m(r7)
                goto L_0x024b
            L_0x023f:
                boolean r8 = r7.q()
                if (r8 == 0) goto L_0x024b
                int r8 = r7.f3022j
                r8 = r8 & -33
                r7.f3022j = r8
            L_0x024b:
                r1.j(r7)
                r7 = r4
                goto L_0x026b
            L_0x0250:
                r2 = 1
                goto L_0x026b
            L_0x0252:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Inconsistency detected. Invalid view holder adapter position"
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = android.support.v4.media.a.l(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x026b:
                if (r7 != 0) goto L_0x0419
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r10 = r10.f2969e
                int r10 = r10.f(r0, r5)
                if (r10 < 0) goto L_0x03f8
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r11 = r11.f2992t
                int r11 = r11.c()
                if (r10 >= r11) goto L_0x03f8
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r11 = r11.f2992t
                int r11 = r11.e(r10)
                androidx.recyclerview.widget.RecyclerView r12 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r12 = r12.f2992t
                boolean r13 = r12.f3035b
                if (r13 == 0) goto L_0x0327
                long r12 = r12.d(r10)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f3075a
                int r7 = r7.size()
                int r7 = r7 + r6
            L_0x029c:
                if (r7 < 0) goto L_0x02f3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r14 = r1.f3075a
                java.lang.Object r14 = r14.get(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r14 = (androidx.recyclerview.widget.RecyclerView.a0) r14
                long r8 = r14.f3017e
                int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r8 != 0) goto L_0x02f0
                boolean r8 = r14.q()
                if (r8 != 0) goto L_0x02f0
                int r8 = r14.f3018f
                if (r11 != r8) goto L_0x02d1
                r14.b(r3)
                boolean r3 = r14.j()
                if (r3 == 0) goto L_0x02cf
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f2985p0
                boolean r3 = r3.f3103g
                if (r3 != 0) goto L_0x02cf
                int r3 = r14.f3022j
                r3 = r3 & -15
                r3 = r3 | 2
                r14.f3022j = r3
            L_0x02cf:
                r7 = r14
                goto L_0x0322
            L_0x02d1:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r8 = r1.f3075a
                r8.remove(r7)
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r9 = r14.f3013a
                r8.removeDetachedView(r9, r5)
                android.view.View r8 = r14.f3013a
                androidx.recyclerview.widget.RecyclerView$a0 r8 = androidx.recyclerview.widget.RecyclerView.O(r8)
                r8.f3026n = r4
                r8.f3027o = r5
                int r9 = r8.f3022j
                r9 = r9 & -33
                r8.f3022j = r9
                r1.j(r8)
            L_0x02f0:
                int r7 = r7 + -1
                goto L_0x029c
            L_0x02f3:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r1.f3077c
                int r3 = r3.size()
                int r3 = r3 + r6
            L_0x02fa:
                if (r3 < 0) goto L_0x0321
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r1.f3077c
                java.lang.Object r7 = r7.get(r3)
                androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.a0) r7
                long r8 = r7.f3017e
                int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r8 != 0) goto L_0x031e
                boolean r8 = r7.f()
                if (r8 != 0) goto L_0x031e
                int r8 = r7.f3018f
                if (r11 != r8) goto L_0x031a
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r8 = r1.f3077c
                r8.remove(r3)
                goto L_0x0322
            L_0x031a:
                r1.h(r3)
                goto L_0x0321
            L_0x031e:
                int r3 = r3 + -1
                goto L_0x02fa
            L_0x0321:
                r7 = r4
            L_0x0322:
                if (r7 == 0) goto L_0x0327
                r7.f3015c = r10
                r2 = 1
            L_0x0327:
                if (r7 != 0) goto L_0x0369
                boolean r3 = androidx.recyclerview.widget.RecyclerView.I0
                androidx.recyclerview.widget.RecyclerView$r r3 = r19.c()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$r$a> r3 = r3.f3068a
                java.lang.Object r3 = r3.get(r11)
                androidx.recyclerview.widget.RecyclerView$r$a r3 = (androidx.recyclerview.widget.RecyclerView.r.a) r3
                if (r3 == 0) goto L_0x0360
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r7 = r3.f3071a
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L_0x0360
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r3 = r3.f3071a
                int r7 = r3.size()
                int r7 = r7 + r6
            L_0x0348:
                if (r7 < 0) goto L_0x0360
                java.lang.Object r6 = r3.get(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r6 = (androidx.recyclerview.widget.RecyclerView.a0) r6
                boolean r6 = r6.f()
                if (r6 != 0) goto L_0x035d
                java.lang.Object r3 = r3.remove(r7)
                androidx.recyclerview.widget.RecyclerView$a0 r3 = (androidx.recyclerview.widget.RecyclerView.a0) r3
                goto L_0x0361
            L_0x035d:
                int r7 = r7 + -1
                goto L_0x0348
            L_0x0360:
                r3 = r4
            L_0x0361:
                if (r3 == 0) goto L_0x0368
                r3.n()
                boolean r6 = androidx.recyclerview.widget.RecyclerView.I0
            L_0x0368:
                r7 = r3
            L_0x0369:
                if (r7 != 0) goto L_0x0419
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r6 = r3.getNanoTime()
                r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r3 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
                if (r3 == 0) goto L_0x0394
                androidx.recyclerview.widget.RecyclerView$r r3 = r1.f3081g
                androidx.recyclerview.widget.RecyclerView$r$a r3 = r3.a(r11)
                long r8 = r3.f3073c
                r12 = 0
                int r3 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r3 == 0) goto L_0x0390
                long r8 = r8 + r6
                int r3 = (r8 > r21 ? 1 : (r8 == r21 ? 0 : -1))
                if (r3 >= 0) goto L_0x038e
                goto L_0x0390
            L_0x038e:
                r3 = r5
                goto L_0x0391
            L_0x0390:
                r3 = 1
            L_0x0391:
                if (r3 != 0) goto L_0x0394
                return r4
            L_0x0394:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r8 = r3.f2992t
                r8.getClass()
                java.lang.String r9 = "RV CreateView"
                int r10 = s1.n.f14600a     // Catch:{ all -> 0x03f1 }
                s1.n.a.a(r9)     // Catch:{ all -> 0x03f1 }
                androidx.recyclerview.widget.RecyclerView$a0 r3 = r8.k(r3, r11)     // Catch:{ all -> 0x03f1 }
                android.view.View r8 = r3.f3013a     // Catch:{ all -> 0x03f1 }
                android.view.ViewParent r8 = r8.getParent()     // Catch:{ all -> 0x03f1 }
                if (r8 != 0) goto L_0x03e9
                r3.f3018f = r11     // Catch:{ all -> 0x03f1 }
                s1.n.a.b()
                boolean r8 = androidx.recyclerview.widget.RecyclerView.O0
                if (r8 == 0) goto L_0x03c6
                android.view.View r8 = r3.f3013a
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.H(r8)
                if (r8 == 0) goto L_0x03c6
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r8)
                r3.f3014b = r9
            L_0x03c6:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                long r8 = r8.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$r r10 = r1.f3081g
                long r8 = r8 - r6
                androidx.recyclerview.widget.RecyclerView$r$a r6 = r10.a(r11)
                long r10 = r6.f3073c
                r12 = 0
                int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r7 != 0) goto L_0x03dc
                goto L_0x03e5
            L_0x03dc:
                r12 = 4
                long r10 = r10 / r12
                r17 = 3
                long r10 = r10 * r17
                long r8 = r8 / r12
                long r8 = r8 + r10
            L_0x03e5:
                r6.f3073c = r8
                r7 = r3
                goto L_0x0419
            L_0x03e9:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x03f1 }
                java.lang.String r2 = "ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"
                r0.<init>(r2)     // Catch:{ all -> 0x03f1 }
                throw r0     // Catch:{ all -> 0x03f1 }
            L_0x03f1:
                r0 = move-exception
                int r2 = s1.n.f14600a
                s1.n.a.b()
                throw r0
            L_0x03f8:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.String r3 = "Inconsistency detected. Invalid item position "
                java.lang.String r4 = "(offset:"
                java.lang.String r5 = ").state:"
                java.lang.StringBuilder r0 = f0.b0.u(r3, r0, r4, r10, r5)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f2985p0
                int r3 = r3.b()
                r0.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = android.support.v4.media.a.l(r3, r0)
                r2.<init>(r0)
                throw r2
            L_0x0419:
                if (r2 == 0) goto L_0x0451
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f2985p0
                boolean r6 = r3.f3103g
                if (r6 != 0) goto L_0x0451
                int r6 = r7.f3022j
                r8 = r6 & 8192(0x2000, float:1.14794E-41)
                if (r8 == 0) goto L_0x042b
                r8 = 1
                goto L_0x042c
            L_0x042b:
                r8 = r5
            L_0x042c:
                if (r8 == 0) goto L_0x0451
                r6 = r6 & -8193(0xffffffffffffdfff, float:NaN)
                r6 = r6 | r5
                r7.f3022j = r6
                boolean r3 = r3.f3106j
                if (r3 == 0) goto L_0x0451
                androidx.recyclerview.widget.RecyclerView.j.e(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$j r3 = r3.U
                r7.e()
                r3.getClass()
                androidx.recyclerview.widget.RecyclerView$j$c r3 = new androidx.recyclerview.widget.RecyclerView$j$c
                r3.<init>()
                r3.a(r7)
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r6.c0(r7, r3)
            L_0x0451:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f2985p0
                boolean r3 = r3.f3103g
                if (r3 == 0) goto L_0x0463
                boolean r3 = r7.g()
                if (r3 == 0) goto L_0x0463
                r7.f3019g = r0
                goto L_0x04d4
            L_0x0463:
                boolean r3 = r7.g()
                if (r3 == 0) goto L_0x047a
                int r3 = r7.f3022j
                r3 = r3 & 2
                if (r3 == 0) goto L_0x0471
                r3 = 1
                goto L_0x0472
            L_0x0471:
                r3 = r5
            L_0x0472:
                if (r3 != 0) goto L_0x047a
                boolean r3 = r7.h()
                if (r3 == 0) goto L_0x04d4
            L_0x047a:
                boolean r3 = androidx.recyclerview.widget.RecyclerView.I0
                if (r3 == 0) goto L_0x049e
                boolean r3 = r7.j()
                if (r3 != 0) goto L_0x0485
                goto L_0x049e
            L_0x0485:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Removed holder should be bound and it should come here only in pre-layout. Holder: "
                r2.append(r3)
                r2.append(r7)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r2 = android.support.v4.media.a.l(r3, r2)
                r0.<init>(r2)
                throw r0
            L_0x049e:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r3 = r3.f2969e
                int r3 = r3.f(r0, r5)
                r7.f3031s = r4
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                r7.f3030r = r6
                int r8 = r7.f3018f
                long r9 = r6.getNanoTime()
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r6 = (r21 > r11 ? 1 : (r21 == r11 ? 0 : -1))
                if (r6 == 0) goto L_0x04d8
                androidx.recyclerview.widget.RecyclerView$r r6 = r1.f3081g
                androidx.recyclerview.widget.RecyclerView$r$a r6 = r6.a(r8)
                long r11 = r6.f3074d
                r13 = 0
                int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r6 == 0) goto L_0x04d1
                long r11 = r11 + r9
                int r6 = (r11 > r21 ? 1 : (r11 == r21 ? 0 : -1))
                if (r6 >= 0) goto L_0x04cf
                goto L_0x04d1
            L_0x04cf:
                r6 = r5
                goto L_0x04d2
            L_0x04d1:
                r6 = 1
            L_0x04d2:
                if (r6 != 0) goto L_0x04d8
            L_0x04d4:
                r0 = 1
                r3 = r5
                goto L_0x0644
            L_0x04d8:
                boolean r6 = r7.l()
                if (r6 == 0) goto L_0x04f1
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r8 = r7.f3013a
                int r11 = r6.getChildCount()
                android.view.View r12 = r7.f3013a
                android.view.ViewGroup$LayoutParams r12 = r12.getLayoutParams()
                r6.attachViewToParent(r8, r11, r12)
                r6 = 1
                goto L_0x04f2
            L_0x04f1:
                r6 = r5
            L_0x04f2:
                androidx.recyclerview.widget.RecyclerView r8 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$e r8 = r8.f2992t
                r8.getClass()
                androidx.recyclerview.widget.RecyclerView$e<? extends androidx.recyclerview.widget.RecyclerView$a0> r11 = r7.f3031s
                if (r11 != 0) goto L_0x04ff
                r11 = 1
                goto L_0x0500
            L_0x04ff:
                r11 = r5
            L_0x0500:
                if (r11 == 0) goto L_0x051d
                r7.f3015c = r3
                boolean r12 = r8.f3035b
                if (r12 == 0) goto L_0x050e
                long r12 = r8.d(r3)
                r7.f3017e = r12
            L_0x050e:
                int r12 = r7.f3022j
                r12 = r12 & -520(0xfffffffffffffdf8, float:NaN)
                r12 = r12 | 1
                r7.f3022j = r12
                int r12 = s1.n.f14600a
                java.lang.String r12 = "RV OnBindView"
                s1.n.a.a(r12)
            L_0x051d:
                r7.f3031s = r8
                boolean r12 = androidx.recyclerview.widget.RecyclerView.I0
                if (r12 == 0) goto L_0x0591
                android.view.View r12 = r7.f3013a
                android.view.ViewParent r12 = r12.getParent()
                if (r12 != 0) goto L_0x0567
                android.view.View r12 = r7.f3013a
                java.util.WeakHashMap<android.view.View, w1.q0> r13 = w1.d0.f16298a
                boolean r12 = w1.d0.g.b(r12)
                boolean r13 = r7.l()
                if (r12 != r13) goto L_0x053a
                goto L_0x0567
            L_0x053a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "Temp-detached state out of sync with reality. holder.isTmpDetached(): "
                java.lang.StringBuilder r2 = android.support.v4.media.a.q(r2)
                boolean r3 = r7.l()
                r2.append(r3)
                java.lang.String r3 = ", attached to window: "
                r2.append(r3)
                android.view.View r3 = r7.f3013a
                boolean r3 = w1.d0.g.b(r3)
                r2.append(r3)
                java.lang.String r3 = ", holder: "
                r2.append(r3)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0567:
                android.view.View r12 = r7.f3013a
                android.view.ViewParent r12 = r12.getParent()
                if (r12 != 0) goto L_0x0591
                android.view.View r12 = r7.f3013a
                java.util.WeakHashMap<android.view.View, w1.q0> r13 = w1.d0.f16298a
                boolean r12 = w1.d0.g.b(r12)
                if (r12 != 0) goto L_0x057a
                goto L_0x0591
            L_0x057a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Attempting to bind attached holder with no parent (AKA temp detached): "
                r2.append(r3)
                r2.append(r7)
                java.lang.String r2 = r2.toString()
                r0.<init>(r2)
                throw r0
            L_0x0591:
                java.util.List r12 = r7.e()
                r8.j(r7, r3, r12)
                if (r11 == 0) goto L_0x05bb
                java.util.ArrayList r3 = r7.f3023k
                if (r3 == 0) goto L_0x05a1
                r3.clear()
            L_0x05a1:
                int r3 = r7.f3022j
                r3 = r3 & -1025(0xfffffffffffffbff, float:NaN)
                r7.f3022j = r3
                android.view.View r3 = r7.f3013a
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                boolean r8 = r3 instanceof androidx.recyclerview.widget.RecyclerView.LayoutParams
                if (r8 == 0) goto L_0x05b6
                androidx.recyclerview.widget.RecyclerView$LayoutParams r3 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r3
                r8 = 1
                r3.f3008c = r8
            L_0x05b6:
                int r3 = s1.n.f14600a
                s1.n.a.b()
            L_0x05bb:
                if (r6 == 0) goto L_0x05c4
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r6 = r7.f3013a
                r3.detachViewFromParent(r6)
            L_0x05c4:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                long r11 = r3.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$r r3 = r1.f3081g
                int r6 = r7.f3018f
                long r11 = r11 - r9
                androidx.recyclerview.widget.RecyclerView$r$a r3 = r3.a(r6)
                long r8 = r3.f3074d
                r13 = 0
                int r6 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r6 != 0) goto L_0x05dc
                goto L_0x05e4
            L_0x05dc:
                r13 = 4
                long r8 = r8 / r13
                r15 = 3
                long r8 = r8 * r15
                long r11 = r11 / r13
                long r11 = r11 + r8
            L_0x05e4:
                r3.f3074d = r11
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                android.view.accessibility.AccessibilityManager r3 = r3.J
                if (r3 == 0) goto L_0x05f4
                boolean r3 = r3.isEnabled()
                if (r3 == 0) goto L_0x05f4
                r3 = 1
                goto L_0x05f5
            L_0x05f4:
                r3 = r5
            L_0x05f5:
                if (r3 == 0) goto L_0x0638
                android.view.View r3 = r7.f3013a
                java.util.WeakHashMap<android.view.View, w1.q0> r6 = w1.d0.f16298a
                int r6 = w1.d0.d.c(r3)
                r8 = 1
                if (r6 != 0) goto L_0x0605
                w1.d0.d.s(r3, r8)
            L_0x0605:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.u r6 = r6.f2999w0
                if (r6 != 0) goto L_0x060c
                goto L_0x0636
            L_0x060c:
                androidx.recyclerview.widget.u$a r6 = r6.f3299e
                boolean r9 = r6 instanceof androidx.recyclerview.widget.u.a
                if (r9 == 0) goto L_0x0633
                r6.getClass()
                android.view.View$AccessibilityDelegate r9 = w1.d0.d(r3)
                if (r9 != 0) goto L_0x061c
                goto L_0x062a
            L_0x061c:
                boolean r4 = r9 instanceof w1.a.C0209a
                if (r4 == 0) goto L_0x0625
                w1.a$a r9 = (w1.a.C0209a) r9
                w1.a r4 = r9.f16282a
                goto L_0x062a
            L_0x0625:
                w1.a r4 = new w1.a
                r4.<init>(r9)
            L_0x062a:
                if (r4 == 0) goto L_0x0633
                if (r4 == r6) goto L_0x0633
                java.util.WeakHashMap r9 = r6.f3301e
                r9.put(r3, r4)
            L_0x0633:
                w1.d0.o(r3, r6)
            L_0x0636:
                r3 = r8
                goto L_0x0639
            L_0x0638:
                r3 = 1
            L_0x0639:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r4 = r4.f2985p0
                boolean r4 = r4.f3103g
                if (r4 == 0) goto L_0x0643
                r7.f3019g = r0
            L_0x0643:
                r0 = r3
            L_0x0644:
                android.view.View r4 = r7.f3013a
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                if (r4 != 0) goto L_0x065a
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r4.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
                android.view.View r6 = r7.f3013a
                r6.setLayoutParams(r4)
                goto L_0x0672
            L_0x065a:
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                boolean r6 = r6.checkLayoutParams(r4)
                if (r6 != 0) goto L_0x0670
                androidx.recyclerview.widget.RecyclerView r6 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r4 = r6.generateLayoutParams((android.view.ViewGroup.LayoutParams) r4)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
                android.view.View r6 = r7.f3013a
                r6.setLayoutParams(r4)
                goto L_0x0672
            L_0x0670:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r4 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r4
            L_0x0672:
                r4.f3006a = r7
                if (r2 == 0) goto L_0x0679
                if (r3 == 0) goto L_0x0679
                r5 = r0
            L_0x0679:
                r4.f3009d = r5
                return r7
            L_0x067c:
                java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
                java.lang.String r3 = "Invalid item position "
                java.lang.String r4 = "("
                java.lang.String r5 = "). Item count:"
                java.lang.StringBuilder r0 = f0.b0.u(r3, r0, r4, r0, r5)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$w r3 = r3.f2985p0
                int r3 = r3.b()
                r0.append(r3)
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = android.support.v4.media.a.l(r3, r0)
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s.l(int, long):androidx.recyclerview.widget.RecyclerView$a0");
        }

        public final void m(a0 a0Var) {
            if (a0Var.f3027o) {
                this.f3076b.remove(a0Var);
            } else {
                this.f3075a.remove(a0Var);
            }
            a0Var.f3026n = null;
            a0Var.f3027o = false;
            a0Var.f3022j &= -33;
        }

        public final void n() {
            int i10;
            m mVar = RecyclerView.this.f2994u;
            if (mVar != null) {
                i10 = mVar.f3056r;
            } else {
                i10 = 0;
            }
            this.f3080f = this.f3079e + i10;
            for (int size = this.f3077c.size() - 1; size >= 0 && this.f3077c.size() > this.f3080f; size--) {
                h(size);
            }
        }
    }

    public interface t {
        void a();
    }

    public class u extends g {
        public u() {
        }

        public final void a() {
            RecyclerView.this.k((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f2985p0.f3102f = true;
            recyclerView.b0(true);
            if (!RecyclerView.this.f2969e.g()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
            if (r0.f3153b.size() == 1) goto L_0x002a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.k(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f2969e
                r2 = 1
                if (r7 >= r2) goto L_0x0011
                r0.getClass()
                goto L_0x0029
            L_0x0011:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f3153b
                r4 = 4
                androidx.recyclerview.widget.a$b r6 = r0.h(r1, r4, r6, r7)
                r3.add(r6)
                int r6 = r0.f3157f
                r6 = r6 | r4
                r0.f3157f = r6
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r0.f3153b
                int r6 = r6.size()
                if (r6 != r2) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                if (r2 == 0) goto L_0x002f
                r5.e()
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.c(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0025, code lost:
            if (r0.f3153b.size() == 1) goto L_0x0029;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void d(int r5, int r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.k(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.f2969e
                r2 = 1
                if (r6 >= r2) goto L_0x0011
                r0.getClass()
                goto L_0x0028
            L_0x0011:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f3153b
                androidx.recyclerview.widget.a$b r5 = r0.h(r1, r2, r5, r6)
                r3.add(r5)
                int r5 = r0.f3157f
                r5 = r5 | r2
                r0.f3157f = r5
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r0.f3153b
                int r5 = r5.size()
                if (r5 != r2) goto L_0x0028
                goto L_0x0029
            L_0x0028:
                r2 = 0
            L_0x0029:
                if (r2 == 0) goto L_0x002e
                r4.e()
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.d(int, int):void");
        }

        public final void e() {
            if (RecyclerView.N0) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.B && recyclerView.A) {
                    a aVar = recyclerView.f2984p;
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.m(recyclerView, aVar);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.I = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class v {

        /* renamed from: a  reason: collision with root package name */
        public int f3084a = -1;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView f3085b;

        /* renamed from: c  reason: collision with root package name */
        public m f3086c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3087d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3088e;

        /* renamed from: f  reason: collision with root package name */
        public View f3089f;

        /* renamed from: g  reason: collision with root package name */
        public final a f3090g = new a();

        public static class a {

            /* renamed from: a  reason: collision with root package name */
            public int f3091a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f3092b = 0;

            /* renamed from: c  reason: collision with root package name */
            public int f3093c = Integer.MIN_VALUE;

            /* renamed from: d  reason: collision with root package name */
            public int f3094d = -1;

            /* renamed from: e  reason: collision with root package name */
            public Interpolator f3095e = null;

            /* renamed from: f  reason: collision with root package name */
            public boolean f3096f = false;

            public final void a(RecyclerView recyclerView) {
                int i10 = this.f3094d;
                if (i10 >= 0) {
                    this.f3094d = -1;
                    recyclerView.R(i10);
                    this.f3096f = false;
                } else if (this.f3096f) {
                    Interpolator interpolator = this.f3095e;
                    if (interpolator == null || this.f3093c >= 1) {
                        int i11 = this.f3093c;
                        if (i11 >= 1) {
                            recyclerView.f2979m0.c(this.f3091a, this.f3092b, i11, interpolator);
                            this.f3096f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
            }
        }

        public interface b {
            PointF a(int i10);
        }

        public PointF a(int i10) {
            m mVar = this.f3086c;
            if (mVar instanceof b) {
                return ((b) mVar).a(i10);
            }
            return null;
        }

        public final void b(int i10, int i11) {
            PointF a10;
            RecyclerView recyclerView = this.f3085b;
            int i12 = -1;
            if (this.f3084a == -1 || recyclerView == null) {
                g();
            }
            if (this.f3087d && this.f3089f == null && this.f3086c != null && (a10 = a(this.f3084a)) != null) {
                float f10 = a10.x;
                if (!(f10 == 0.0f && a10.y == 0.0f)) {
                    recyclerView.j0((int) Math.signum(f10), (int) Math.signum(a10.y), (int[]) null);
                }
            }
            boolean z10 = false;
            this.f3087d = false;
            View view = this.f3089f;
            if (view != null) {
                this.f3085b.getClass();
                a0 O = RecyclerView.O(view);
                if (O != null) {
                    i12 = O.d();
                }
                if (i12 == this.f3084a) {
                    View view2 = this.f3089f;
                    w wVar = recyclerView.f2985p0;
                    f(view2, this.f3090g);
                    this.f3090g.a(recyclerView);
                    g();
                } else {
                    this.f3089f = null;
                }
            }
            if (this.f3088e) {
                w wVar2 = recyclerView.f2985p0;
                c(i10, i11, this.f3090g);
                a aVar = this.f3090g;
                if (aVar.f3094d >= 0) {
                    z10 = true;
                }
                aVar.a(recyclerView);
                if (z10 && this.f3088e) {
                    this.f3087d = true;
                    recyclerView.f2979m0.b();
                }
            }
        }

        public abstract void c(int i10, int i11, a aVar);

        public abstract void d();

        public abstract void e();

        public abstract void f(View view, a aVar);

        public final void g() {
            if (this.f3088e) {
                this.f3088e = false;
                e();
                this.f3085b.f2985p0.f3097a = -1;
                this.f3089f = null;
                this.f3084a = -1;
                this.f3087d = false;
                m mVar = this.f3086c;
                if (mVar.f3050e == this) {
                    mVar.f3050e = null;
                }
                this.f3086c = null;
                this.f3085b = null;
            }
        }
    }

    public static class w {

        /* renamed from: a  reason: collision with root package name */
        public int f3097a = -1;

        /* renamed from: b  reason: collision with root package name */
        public int f3098b = 0;

        /* renamed from: c  reason: collision with root package name */
        public int f3099c = 0;

        /* renamed from: d  reason: collision with root package name */
        public int f3100d = 1;

        /* renamed from: e  reason: collision with root package name */
        public int f3101e = 0;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3102f = false;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3103g = false;

        /* renamed from: h  reason: collision with root package name */
        public boolean f3104h = false;

        /* renamed from: i  reason: collision with root package name */
        public boolean f3105i = false;

        /* renamed from: j  reason: collision with root package name */
        public boolean f3106j = false;

        /* renamed from: k  reason: collision with root package name */
        public boolean f3107k = false;

        /* renamed from: l  reason: collision with root package name */
        public int f3108l;

        /* renamed from: m  reason: collision with root package name */
        public long f3109m;

        /* renamed from: n  reason: collision with root package name */
        public int f3110n;

        public final void a(int i10) {
            if ((this.f3100d & i10) == 0) {
                StringBuilder q10 = android.support.v4.media.a.q("Layout state should be one of ");
                q10.append(Integer.toBinaryString(i10));
                q10.append(" but it is ");
                q10.append(Integer.toBinaryString(this.f3100d));
                throw new IllegalStateException(q10.toString());
            }
        }

        public final int b() {
            if (this.f3103g) {
                return this.f3098b - this.f3099c;
            }
            return this.f3101e;
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("State{mTargetPosition=");
            q10.append(this.f3097a);
            q10.append(", mData=");
            q10.append((Object) null);
            q10.append(", mItemCount=");
            q10.append(this.f3101e);
            q10.append(", mIsMeasuring=");
            q10.append(this.f3105i);
            q10.append(", mPreviousLayoutItemCount=");
            q10.append(this.f3098b);
            q10.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            q10.append(this.f3099c);
            q10.append(", mStructureChanged=");
            q10.append(this.f3102f);
            q10.append(", mInPreLayout=");
            q10.append(this.f3103g);
            q10.append(", mRunSimpleAnimations=");
            q10.append(this.f3106j);
            q10.append(", mRunPredictiveAnimations=");
            q10.append(this.f3107k);
            q10.append('}');
            return q10.toString();
        }
    }

    public static class x extends i {
    }

    public static abstract class y {
    }

    public class z implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public int f3111a;

        /* renamed from: b  reason: collision with root package name */
        public int f3112b;

        /* renamed from: c  reason: collision with root package name */
        public OverScroller f3113c;

        /* renamed from: d  reason: collision with root package name */
        public Interpolator f3114d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3115e = false;

        /* renamed from: f  reason: collision with root package name */
        public boolean f3116f = false;

        public z() {
            c cVar = RecyclerView.Q0;
            this.f3114d = cVar;
            this.f3113c = new OverScroller(RecyclerView.this.getContext(), cVar);
        }

        public final void a(int i10, int i11) {
            RecyclerView.this.setScrollState(2);
            this.f3112b = 0;
            this.f3111a = 0;
            Interpolator interpolator = this.f3114d;
            c cVar = RecyclerView.Q0;
            if (interpolator != cVar) {
                this.f3114d = cVar;
                this.f3113c = new OverScroller(RecyclerView.this.getContext(), cVar);
            }
            this.f3113c.fling(0, 0, i10, i11, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            b();
        }

        public final void b() {
            if (this.f3115e) {
                this.f3116f = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.m(recyclerView, this);
        }

        public final void c(int i10, int i11, int i12, Interpolator interpolator) {
            boolean z10;
            int i13;
            if (i12 == Integer.MIN_VALUE) {
                int abs = Math.abs(i10);
                int abs2 = Math.abs(i11);
                if (abs > abs2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (z10) {
                    i13 = recyclerView.getWidth();
                } else {
                    i13 = recyclerView.getHeight();
                }
                if (!z10) {
                    abs = abs2;
                }
                i12 = Math.min((int) (((((float) abs) / ((float) i13)) + 1.0f) * 300.0f), 2000);
            }
            int i14 = i12;
            if (interpolator == null) {
                interpolator = RecyclerView.Q0;
            }
            if (this.f3114d != interpolator) {
                this.f3114d = interpolator;
                this.f3113c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3112b = 0;
            this.f3111a = 0;
            RecyclerView.this.setScrollState(2);
            this.f3113c.startScroll(0, 0, i10, i11, i14);
            b();
        }

        public final void run() {
            int i10;
            int i11;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            int i12;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f2994u == null) {
                recyclerView.removeCallbacks(this);
                this.f3113c.abortAnimation();
                return;
            }
            this.f3116f = false;
            this.f3115e = true;
            recyclerView.p();
            OverScroller overScroller = this.f3113c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i13 = currX - this.f3111a;
                int i14 = currY - this.f3112b;
                this.f3111a = currX;
                this.f3112b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int o10 = RecyclerView.o(i13, recyclerView2.Q, recyclerView2.S, recyclerView2.getWidth());
                RecyclerView recyclerView3 = RecyclerView.this;
                int o11 = RecyclerView.o(i14, recyclerView3.R, recyclerView3.T, recyclerView3.getHeight());
                RecyclerView recyclerView4 = RecyclerView.this;
                int[] iArr = recyclerView4.B0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView4.v(o10, o11, 1, iArr, (int[]) null)) {
                    int[] iArr2 = RecyclerView.this.B0;
                    o10 -= iArr2[0];
                    o11 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.n(o10, o11);
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                if (recyclerView5.f2992t != null) {
                    int[] iArr3 = recyclerView5.B0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView5.j0(o10, o11, iArr3);
                    RecyclerView recyclerView6 = RecyclerView.this;
                    int[] iArr4 = recyclerView6.B0;
                    i10 = iArr4[0];
                    i11 = iArr4[1];
                    o10 -= i10;
                    o11 -= i11;
                    v vVar = recyclerView6.f2994u.f3050e;
                    if (vVar != null && !vVar.f3087d && vVar.f3088e) {
                        int b10 = recyclerView6.f2985p0.b();
                        if (b10 == 0) {
                            vVar.g();
                        } else if (vVar.f3084a >= b10) {
                            vVar.f3084a = b10 - 1;
                            vVar.b(i10, i11);
                        } else {
                            vVar.b(i10, i11);
                        }
                    }
                } else {
                    i11 = 0;
                    i10 = 0;
                }
                if (!RecyclerView.this.f3000x.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView7 = RecyclerView.this;
                int[] iArr5 = recyclerView7.B0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView7.w(i10, i11, o10, o11, (int[]) null, 1, iArr5);
                RecyclerView recyclerView8 = RecyclerView.this;
                int[] iArr6 = recyclerView8.B0;
                int i15 = o10 - iArr6[0];
                int i16 = o11 - iArr6[1];
                if (!(i10 == 0 && i11 == 0)) {
                    recyclerView8.x(i10, i11);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                if (overScroller.getCurrX() == overScroller.getFinalX()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (overScroller.getCurrY() == overScroller.getFinalY()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (overScroller.isFinished() || ((z10 || i15 != 0) && (z11 || i16 != 0))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                RecyclerView recyclerView9 = RecyclerView.this;
                v vVar2 = recyclerView9.f2994u.f3050e;
                if (vVar2 == null || !vVar2.f3087d) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                if (z13 || !z12) {
                    b();
                    RecyclerView recyclerView10 = RecyclerView.this;
                    j jVar = recyclerView10.f2981n0;
                    if (jVar != null) {
                        jVar.a(recyclerView10, i10, i11);
                    }
                } else {
                    if (recyclerView9.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        if (i15 < 0) {
                            i12 = -currVelocity;
                        } else if (i15 > 0) {
                            i12 = currVelocity;
                        } else {
                            i12 = 0;
                        }
                        if (i16 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i16 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView recyclerView11 = RecyclerView.this;
                        if (i12 < 0) {
                            recyclerView11.z();
                            if (recyclerView11.Q.isFinished()) {
                                recyclerView11.Q.onAbsorb(-i12);
                            }
                        } else if (i12 > 0) {
                            recyclerView11.A();
                            if (recyclerView11.S.isFinished()) {
                                recyclerView11.S.onAbsorb(i12);
                            }
                        }
                        if (currVelocity < 0) {
                            recyclerView11.B();
                            if (recyclerView11.R.isFinished()) {
                                recyclerView11.R.onAbsorb(-currVelocity);
                            }
                        } else if (currVelocity > 0) {
                            recyclerView11.y();
                            if (recyclerView11.T.isFinished()) {
                                recyclerView11.T.onAbsorb(currVelocity);
                            }
                        } else {
                            recyclerView11.getClass();
                        }
                        if (!(i12 == 0 && currVelocity == 0)) {
                            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                            d0.d.k(recyclerView11);
                        }
                    }
                    if (RecyclerView.O0) {
                        j.b bVar = RecyclerView.this.f2983o0;
                        int[] iArr7 = bVar.f3263c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f3264d = 0;
                    }
                }
            }
            v vVar3 = RecyclerView.this.f2994u.f3050e;
            if (vVar3 != null && vVar3.f3087d) {
                vVar3.b(0, 0);
            }
            this.f3115e = false;
            if (this.f3116f) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView12 = RecyclerView.this;
                WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
                d0.d.m(recyclerView12, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.q0(1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r3 = 16843830(0x1010436, float:2.369658E-38)
            r1[r2] = r3
            K0 = r1
            r3 = 4605200834963974390(0x3fe8f5c28f5c28f6, double:0.78)
            double r3 = java.lang.Math.log(r3)
            r5 = 4606281698874543309(0x3feccccccccccccd, double:0.9)
            double r5 = java.lang.Math.log(r5)
            double r3 = r3 / r5
            float r1 = (float) r3
            L0 = r1
            M0 = r0
            N0 = r0
            O0 = r0
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r1[r2] = r3
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            java.lang.Class r0 = java.lang.Integer.TYPE
            r2 = 2
            r1[r2] = r0
            r2 = 3
            r1[r2] = r0
            P0 = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            Q0 = r0
            androidx.recyclerview.widget.RecyclerView$x r0 = new androidx.recyclerview.widget.RecyclerView$x
            r0.<init>()
            R0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView H2 = H(viewGroup.getChildAt(i10));
            if (H2 != null) {
                return H2;
            }
        }
        return null;
    }

    public static int M(View view) {
        a0 O2 = O(view);
        if (O2 != null) {
            return O2.c();
        }
        return -1;
    }

    public static a0 O(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).f3006a;
    }

    private int e0(int i10, float f10) {
        float width = f10 / ((float) getWidth());
        float height = ((float) i10) / ((float) getHeight());
        EdgeEffect edgeEffect = this.R;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.T;
            if (!(edgeEffect2 == null || androidx.core.widget.d.a(edgeEffect2) == 0.0f)) {
                if (canScrollVertically(1)) {
                    this.T.onRelease();
                } else {
                    float b10 = androidx.core.widget.d.b(this.T, height, 1.0f - width);
                    if (androidx.core.widget.d.a(this.T) == 0.0f) {
                        this.T.onRelease();
                    }
                    f11 = b10;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.R.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.b(this.R, -height, width);
                if (androidx.core.widget.d.a(this.R) == 0.0f) {
                    this.R.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * ((float) getHeight()));
    }

    private w1.m getScrollingChildHelper() {
        if (this.f3003y0 == null) {
            this.f3003y0 = new w1.m(this);
        }
        return this.f3003y0;
    }

    public static void l(a0 a0Var) {
        WeakReference<RecyclerView> weakReference = a0Var.f3014b;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != a0Var.f3013a) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                } else {
                    return;
                }
            }
            a0Var.f3014b = null;
        }
    }

    public static int o(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && androidx.core.widget.d.a(edgeEffect) != 0.0f) {
            int round = Math.round(androidx.core.widget.d.b(edgeEffect, (((float) (-i10)) * 4.0f) / ((float) i11), 0.5f) * (((float) (-i11)) / 4.0f));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        } else if (i10 >= 0 || edgeEffect2 == null || androidx.core.widget.d.a(edgeEffect2) == 0.0f) {
            return i10;
        } else {
            float f10 = (float) i11;
            int round2 = Math.round(androidx.core.widget.d.b(edgeEffect2, (((float) i10) * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
            if (round2 != i10) {
                edgeEffect2.finish();
            }
            return i10 - round2;
        }
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        I0 = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        J0 = z10;
    }

    public final void A() {
        if (this.S == null) {
            ((x) this.P).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.S = edgeEffect;
            if (this.f2982o) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public final void B() {
        if (this.R == null) {
            ((x) this.P).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.R = edgeEffect;
            if (this.f2982o) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final String C() {
        StringBuilder q10 = android.support.v4.media.a.q(" ");
        q10.append(super.toString());
        q10.append(", adapter:");
        q10.append(this.f2992t);
        q10.append(", layout:");
        q10.append(this.f2994u);
        q10.append(", context:");
        q10.append(getContext());
        return q10.toString();
    }

    public final void D(w wVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.f2979m0.f3113c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            wVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        wVar.getClass();
    }

    public final View E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public final boolean F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3002y.size();
        int i10 = 0;
        while (i10 < size) {
            p pVar = this.f3002y.get(i10);
            if (!pVar.b(this, motionEvent) || action == 3) {
                i10++;
            } else {
                this.f3004z = pVar;
                return true;
            }
        }
        return false;
    }

    public final void G(int[] iArr) {
        int e10 = this.f2971f.e();
        if (e10 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e10; i12++) {
            a0 O2 = O(this.f2971f.d(i12));
            if (!O2.p()) {
                int d10 = O2.d();
                if (d10 < i10) {
                    i10 = d10;
                }
                if (d10 > i11) {
                    i11 = d10;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    public final a0 I(int i10) {
        a0 a0Var = null;
        if (this.L) {
            return null;
        }
        int h10 = this.f2971f.h();
        for (int i11 = 0; i11 < h10; i11++) {
            a0 O2 = O(this.f2971f.g(i11));
            if (O2 != null && !O2.j() && K(O2) == i10) {
                if (!this.f2971f.k(O2.f3013a)) {
                    return O2;
                }
                a0Var = O2;
            }
        }
        return a0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0140 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean J(int r10, int r11) {
        /*
            r9 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r9.f2994u
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r9.F
            if (r2 == 0) goto L_0x000b
            return r1
        L_0x000b:
            boolean r0 = r0.o()
            androidx.recyclerview.widget.RecyclerView$m r2 = r9.f2994u
            boolean r2 = r2.p()
            if (r0 == 0) goto L_0x001f
            int r3 = java.lang.Math.abs(r10)
            int r4 = r9.f2974h0
            if (r3 >= r4) goto L_0x0020
        L_0x001f:
            r10 = r1
        L_0x0020:
            if (r2 == 0) goto L_0x002a
            int r3 = java.lang.Math.abs(r11)
            int r4 = r9.f2974h0
            if (r3 >= r4) goto L_0x002b
        L_0x002a:
            r11 = r1
        L_0x002b:
            if (r10 != 0) goto L_0x0030
            if (r11 != 0) goto L_0x0030
            return r1
        L_0x0030:
            r3 = 0
            if (r10 == 0) goto L_0x0072
            android.widget.EdgeEffect r4 = r9.Q
            if (r4 == 0) goto L_0x0052
            float r4 = androidx.core.widget.d.a(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0052
            android.widget.EdgeEffect r4 = r9.Q
            int r5 = -r10
            int r6 = r9.getWidth()
            boolean r4 = r9.l0(r4, r5, r6)
            if (r4 == 0) goto L_0x0070
            android.widget.EdgeEffect r10 = r9.Q
            r10.onAbsorb(r5)
            goto L_0x006f
        L_0x0052:
            android.widget.EdgeEffect r4 = r9.S
            if (r4 == 0) goto L_0x0072
            float r4 = androidx.core.widget.d.a(r4)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 == 0) goto L_0x0072
            android.widget.EdgeEffect r4 = r9.S
            int r5 = r9.getWidth()
            boolean r4 = r9.l0(r4, r10, r5)
            if (r4 == 0) goto L_0x0070
            android.widget.EdgeEffect r4 = r9.S
            r4.onAbsorb(r10)
        L_0x006f:
            r10 = r1
        L_0x0070:
            r4 = r1
            goto L_0x0074
        L_0x0072:
            r4 = r10
            r10 = r1
        L_0x0074:
            if (r11 == 0) goto L_0x00b5
            android.widget.EdgeEffect r5 = r9.R
            if (r5 == 0) goto L_0x0095
            float r5 = androidx.core.widget.d.a(r5)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x0095
            android.widget.EdgeEffect r3 = r9.R
            int r5 = -r11
            int r6 = r9.getHeight()
            boolean r3 = r9.l0(r3, r5, r6)
            if (r3 == 0) goto L_0x00b3
            android.widget.EdgeEffect r11 = r9.R
            r11.onAbsorb(r5)
            goto L_0x00b2
        L_0x0095:
            android.widget.EdgeEffect r5 = r9.T
            if (r5 == 0) goto L_0x00b5
            float r5 = androidx.core.widget.d.a(r5)
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00b5
            android.widget.EdgeEffect r3 = r9.T
            int r5 = r9.getHeight()
            boolean r3 = r9.l0(r3, r11, r5)
            if (r3 == 0) goto L_0x00b3
            android.widget.EdgeEffect r3 = r9.T
            r3.onAbsorb(r11)
        L_0x00b2:
            r11 = r1
        L_0x00b3:
            r3 = r1
            goto L_0x00b7
        L_0x00b5:
            r3 = r11
            r11 = r1
        L_0x00b7:
            if (r10 != 0) goto L_0x00bb
            if (r11 == 0) goto L_0x00d6
        L_0x00bb:
            int r5 = r9.f2975i0
            int r6 = -r5
            int r10 = java.lang.Math.min(r10, r5)
            int r10 = java.lang.Math.max(r6, r10)
            int r5 = r9.f2975i0
            int r6 = -r5
            int r11 = java.lang.Math.min(r11, r5)
            int r11 = java.lang.Math.max(r6, r11)
            androidx.recyclerview.widget.RecyclerView$z r5 = r9.f2979m0
            r5.a(r10, r11)
        L_0x00d6:
            r5 = 1
            if (r4 != 0) goto L_0x00e1
            if (r3 != 0) goto L_0x00e1
            if (r10 != 0) goto L_0x00df
            if (r11 == 0) goto L_0x00e0
        L_0x00df:
            r1 = r5
        L_0x00e0:
            return r1
        L_0x00e1:
            float r10 = (float) r4
            float r11 = (float) r3
            boolean r6 = r9.dispatchNestedPreFling(r10, r11)
            if (r6 != 0) goto L_0x016a
            if (r0 != 0) goto L_0x00f0
            if (r2 == 0) goto L_0x00ee
            goto L_0x00f0
        L_0x00ee:
            r6 = r1
            goto L_0x00f1
        L_0x00f0:
            r6 = r5
        L_0x00f1:
            r9.dispatchNestedFling(r10, r11, r6)
            androidx.recyclerview.widget.RecyclerView$o r10 = r9.f2973g0
            if (r10 == 0) goto L_0x0141
            androidx.recyclerview.widget.x r10 = (androidx.recyclerview.widget.x) r10
            androidx.recyclerview.widget.RecyclerView r11 = r10.f3303a
            androidx.recyclerview.widget.RecyclerView$m r11 = r11.getLayoutManager()
            if (r11 != 0) goto L_0x0103
            goto L_0x013d
        L_0x0103:
            androidx.recyclerview.widget.RecyclerView r7 = r10.f3303a
            androidx.recyclerview.widget.RecyclerView$e r7 = r7.getAdapter()
            if (r7 != 0) goto L_0x010c
            goto L_0x013d
        L_0x010c:
            androidx.recyclerview.widget.RecyclerView r7 = r10.f3303a
            int r7 = r7.getMinFlingVelocity()
            int r8 = java.lang.Math.abs(r3)
            if (r8 > r7) goto L_0x011e
            int r8 = java.lang.Math.abs(r4)
            if (r8 <= r7) goto L_0x013d
        L_0x011e:
            boolean r7 = r11 instanceof androidx.recyclerview.widget.RecyclerView.v.b
            if (r7 != 0) goto L_0x0123
            goto L_0x0131
        L_0x0123:
            androidx.recyclerview.widget.RecyclerView$v r7 = r10.c(r11)
            if (r7 != 0) goto L_0x012a
            goto L_0x0131
        L_0x012a:
            int r10 = r10.e(r11, r4, r3)
            r8 = -1
            if (r10 != r8) goto L_0x0133
        L_0x0131:
            r10 = r1
            goto L_0x0139
        L_0x0133:
            r7.f3084a = r10
            r11.N0(r7)
            r10 = r5
        L_0x0139:
            if (r10 == 0) goto L_0x013d
            r10 = r5
            goto L_0x013e
        L_0x013d:
            r10 = r1
        L_0x013e:
            if (r10 == 0) goto L_0x0141
            return r5
        L_0x0141:
            if (r6 == 0) goto L_0x016a
            if (r2 == 0) goto L_0x0147
            r0 = r0 | 2
        L_0x0147:
            w1.m r10 = r9.getScrollingChildHelper()
            r10.g(r0, r5)
            int r10 = r9.f2975i0
            int r11 = -r10
            int r10 = java.lang.Math.min(r4, r10)
            int r10 = java.lang.Math.max(r11, r10)
            int r11 = r9.f2975i0
            int r0 = -r11
            int r11 = java.lang.Math.min(r3, r11)
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView$z r0 = r9.f2979m0
            r0.a(r10, r11)
            return r5
        L_0x016a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.J(int, int):boolean");
    }

    public final int K(a0 a0Var) {
        boolean z10;
        if ((a0Var.f3022j & 524) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && a0Var.g()) {
            a aVar = this.f2969e;
            int i10 = a0Var.f3015c;
            int size = aVar.f3153b.size();
            for (int i11 = 0; i11 < size; i11++) {
                a.b bVar = aVar.f3153b.get(i11);
                int i12 = bVar.f3158a;
                if (i12 != 1) {
                    if (i12 == 2) {
                        int i13 = bVar.f3159b;
                        if (i13 <= i10) {
                            int i14 = bVar.f3161d;
                            if (i13 + i14 <= i10) {
                                i10 -= i14;
                            }
                        } else {
                            continue;
                        }
                    } else if (i12 == 8) {
                        int i15 = bVar.f3159b;
                        if (i15 == i10) {
                            i10 = bVar.f3161d;
                        } else {
                            if (i15 < i10) {
                                i10--;
                            }
                            if (bVar.f3161d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else if (bVar.f3159b <= i10) {
                    i10 += bVar.f3161d;
                }
            }
            return i10;
        }
        return -1;
    }

    public final long L(a0 a0Var) {
        if (this.f2992t.f3035b) {
            return a0Var.f3017e;
        }
        return (long) a0Var.f3015c;
    }

    public final a0 N(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return O(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect P(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.f3008c) {
            return layoutParams.f3007b;
        }
        if (this.f2985p0.f3103g && (layoutParams.d() || layoutParams.f3006a.h())) {
            return layoutParams.f3007b;
        }
        Rect rect = layoutParams.f3007b;
        rect.set(0, 0, 0, 0);
        int size = this.f3000x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f2986q.set(0, 0, 0, 0);
            this.f3000x.get(i10).d(this.f2986q, view, this, this.f2985p0);
            int i11 = rect.left;
            Rect rect2 = this.f2986q;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.f3008c = false;
        return rect;
    }

    public final boolean Q() {
        if (this.N > 0) {
            return true;
        }
        return false;
    }

    public final void R(int i10) {
        if (this.f2994u != null) {
            setScrollState(2);
            this.f2994u.C0(i10);
            awakenScrollBars();
        }
    }

    public final void S() {
        int h10 = this.f2971f.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((LayoutParams) this.f2971f.g(i10).getLayoutParams()).f3008c = true;
        }
        s sVar = this.f2965c;
        int size = sVar.f3077c.size();
        for (int i11 = 0; i11 < size; i11++) {
            LayoutParams layoutParams = (LayoutParams) sVar.f3077c.get(i11).f3013a.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.f3008c = true;
            }
        }
    }

    public final void T(boolean z10, int i10, int i11) {
        int i12 = i10 + i11;
        int h10 = this.f2971f.h();
        for (int i13 = 0; i13 < h10; i13++) {
            a0 O2 = O(this.f2971f.g(i13));
            if (O2 != null && !O2.p()) {
                int i14 = O2.f3015c;
                if (i14 >= i12) {
                    if (J0) {
                        O2.toString();
                    }
                    O2.m(-i11, z10);
                    this.f2985p0.f3102f = true;
                } else if (i14 >= i10) {
                    if (J0) {
                        O2.toString();
                    }
                    O2.b(8);
                    O2.m(-i11, z10);
                    O2.f3015c = i10 - 1;
                    this.f2985p0.f3102f = true;
                }
            }
        }
        s sVar = this.f2965c;
        int size = sVar.f3077c.size();
        while (true) {
            size--;
            if (size >= 0) {
                a0 a0Var = sVar.f3077c.get(size);
                if (a0Var != null) {
                    int i15 = a0Var.f3015c;
                    if (i15 >= i12) {
                        if (J0) {
                            a0Var.toString();
                        }
                        a0Var.m(-i11, z10);
                    } else if (i15 >= i10) {
                        a0Var.b(8);
                        sVar.h(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void U() {
        this.N++;
    }

    public final void V(boolean z10) {
        int i10;
        boolean z11 = true;
        int i11 = this.N - 1;
        this.N = i11;
        if (i11 >= 1) {
            return;
        }
        if (!I0 || i11 >= 0) {
            this.N = 0;
            if (z10) {
                int i12 = this.H;
                this.H = 0;
                if (i12 != 0) {
                    AccessibilityManager accessibilityManager = this.J;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z11 = false;
                    }
                    if (z11) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        x1.b.b(obtain, i12);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                for (int size = this.C0.size() - 1; size >= 0; size--) {
                    a0 a0Var = (a0) this.C0.get(size);
                    if (a0Var.f3013a.getParent() == this && !a0Var.p() && (i10 = a0Var.f3029q) != -1) {
                        View view = a0Var.f3013a;
                        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                        d0.d.s(view, i10);
                        a0Var.f3029q = -1;
                    }
                }
                this.C0.clear();
                return;
            }
            return;
        }
        throw new IllegalStateException(android.support.v4.media.a.l(this, android.support.v4.media.a.q("layout or scroll counter cannot go below zero.Some calls are not matching")));
    }

    public final void W(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.W) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.W = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.f2968d0 = x10;
            this.f2964b0 = x10;
            int y10 = (int) (motionEvent.getY(i10) + 0.5f);
            this.f2970e0 = y10;
            this.f2966c0 = y10;
        }
    }

    public void X(int i10) {
    }

    public void Y(int i10) {
    }

    public final void Z() {
        if (!this.f2997v0 && this.A) {
            b bVar = this.D0;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.m(this, bVar);
            this.f2997v0 = true;
        }
    }

    public final void a0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (this.L) {
            a aVar = this.f2969e;
            aVar.l(aVar.f3153b);
            aVar.l(aVar.f3154c);
            aVar.f3157f = 0;
            if (this.M) {
                this.f2994u.j0();
            }
        }
        if (this.U == null || !this.f2994u.O0()) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            this.f2969e.j();
        } else {
            this.f2969e.c();
        }
        if (this.f2991s0 || this.f2993t0) {
            z11 = true;
        } else {
            z11 = false;
        }
        w wVar = this.f2985p0;
        if (!this.C || this.U == null || ((!(z14 = this.L) && !z11 && !this.f2994u.f3051f) || (z14 && !this.f2992t.f3035b))) {
            z12 = false;
        } else {
            z12 = true;
        }
        wVar.f3106j = z12;
        if (z12 && z11 && !this.L) {
            if (this.U == null || !this.f2994u.O0()) {
                z13 = false;
            } else {
                z13 = true;
            }
            if (z13) {
                z15 = true;
            }
        }
        wVar.f3107k = z15;
    }

    public final void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        m mVar = this.f2994u;
        if (mVar != null) {
            mVar.getClass();
        }
        super.addFocusables(arrayList, i10, i11);
    }

    public final void b0(boolean z10) {
        this.M = z10 | this.M;
        this.L = true;
        int h10 = this.f2971f.h();
        for (int i10 = 0; i10 < h10; i10++) {
            a0 O2 = O(this.f2971f.g(i10));
            if (O2 != null && !O2.p()) {
                O2.b(6);
            }
        }
        S();
        s sVar = this.f2965c;
        int size = sVar.f3077c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a0 a0Var = sVar.f3077c.get(i11);
            if (a0Var != null) {
                a0Var.b(6);
                a0Var.a((Object) null);
            }
        }
        e eVar = RecyclerView.this.f2992t;
        if (eVar == null || !eVar.f3035b) {
            sVar.g();
        }
    }

    public final void c0(a0 a0Var, j.c cVar) {
        boolean z10 = false;
        int i10 = (a0Var.f3022j & -8193) | 0;
        a0Var.f3022j = i10;
        if (this.f2985p0.f3104h) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if (z10 && !a0Var.j() && !a0Var.p()) {
                this.f2980n.f3163b.j(a0Var, L(a0Var));
            }
        }
        this.f2980n.b(a0Var, cVar);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof LayoutParams) || !this.f2994u.q((LayoutParams) layoutParams)) {
            return false;
        }
        return true;
    }

    public final int computeHorizontalScrollExtent() {
        m mVar = this.f2994u;
        if (mVar != null && mVar.o()) {
            return this.f2994u.u(this.f2985p0);
        }
        return 0;
    }

    public final int computeHorizontalScrollOffset() {
        m mVar = this.f2994u;
        if (mVar != null && mVar.o()) {
            return this.f2994u.v(this.f2985p0);
        }
        return 0;
    }

    public final int computeHorizontalScrollRange() {
        m mVar = this.f2994u;
        if (mVar != null && mVar.o()) {
            return this.f2994u.w(this.f2985p0);
        }
        return 0;
    }

    public final int computeVerticalScrollExtent() {
        m mVar = this.f2994u;
        if (mVar != null && mVar.p()) {
            return this.f2994u.x(this.f2985p0);
        }
        return 0;
    }

    public final int computeVerticalScrollOffset() {
        m mVar = this.f2994u;
        if (mVar != null && mVar.p()) {
            return this.f2994u.y(this.f2985p0);
        }
        return 0;
    }

    public final int computeVerticalScrollRange() {
        m mVar = this.f2994u;
        if (mVar != null && mVar.p()) {
            return this.f2994u.z(this.f2985p0);
        }
        return 0;
    }

    public final int d0(int i10, float f10) {
        float height = f10 / ((float) getHeight());
        float width = ((float) i10) / ((float) getWidth());
        EdgeEffect edgeEffect = this.Q;
        float f11 = 0.0f;
        if (edgeEffect == null || androidx.core.widget.d.a(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.S;
            if (!(edgeEffect2 == null || androidx.core.widget.d.a(edgeEffect2) == 0.0f)) {
                if (canScrollHorizontally(1)) {
                    this.S.onRelease();
                } else {
                    float b10 = androidx.core.widget.d.b(this.S, width, height);
                    if (androidx.core.widget.d.a(this.S) == 0.0f) {
                        this.S.onRelease();
                    }
                    f11 = b10;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.Q.onRelease();
            } else {
                float f12 = -androidx.core.widget.d.b(this.Q, -width, 1.0f - height);
                if (androidx.core.widget.d.a(this.Q) == 0.0f) {
                    this.Q.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * ((float) getWidth()));
    }

    public final boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    public final boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, 0, iArr, iArr2);
    }

    public final boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, (int[]) null);
    }

    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public final void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public final void draw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        int size = this.f3000x.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            this.f3000x.get(i12).f(canvas, this);
        }
        EdgeEffect edgeEffect = this.Q;
        boolean z14 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z10 = false;
        } else {
            int save = canvas.save();
            if (this.f2982o) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + i11), 0.0f);
            EdgeEffect edgeEffect2 = this.Q;
            if (edgeEffect2 == null || !edgeEffect2.draw(canvas)) {
                z10 = false;
            } else {
                z10 = true;
            }
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.R;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f2982o) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.R;
            if (edgeEffect4 == null || !edgeEffect4.draw(canvas)) {
                z12 = false;
            } else {
                z12 = true;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.S;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.f2982o) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate((float) i10, (float) (-width));
            EdgeEffect edgeEffect6 = this.S;
            if (edgeEffect6 == null || !edgeEffect6.draw(canvas)) {
                z11 = false;
            } else {
                z11 = true;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.T;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f2982o) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.T;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.U == null || this.f3000x.size() <= 0 || !this.U.l()) {
            z14 = z10;
        }
        if (z14) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(this);
        }
    }

    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void f0() {
        j jVar = this.U;
        if (jVar != null) {
            jVar.k();
        }
        m mVar = this.f2994u;
        if (mVar != null) {
            mVar.w0(this.f2965c);
            this.f2994u.x0(this.f2965c);
        }
        s sVar = this.f2965c;
        sVar.f3075a.clear();
        sVar.g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0166, code lost:
        if (r3 > 0) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0180, code lost:
        if (r6 > 0) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0183, code lost:
        if (r3 < 0) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0186, code lost:
        if (r6 < 0) goto L_0x019a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x018e, code lost:
        if ((r6 * r2) <= 0) goto L_0x0199;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0196, code lost:
        if ((r6 * r2) >= 0) goto L_0x0199;
     */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2994u
            r0.getClass()
            androidx.recyclerview.widget.RecyclerView$e r0 = r13.f2992t
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2994u
            if (r0 == 0) goto L_0x001b
            boolean r0 = r13.Q()
            if (r0 != 0) goto L_0x001b
            boolean r0 = r13.F
            if (r0 != 0) goto L_0x001b
            r0 = r1
            goto L_0x001c
        L_0x001b:
            r0 = r2
        L_0x001c:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            r4 = 33
            r5 = 17
            r6 = 0
            r7 = 2
            if (r0 == 0) goto L_0x008d
            if (r15 == r7) goto L_0x002c
            if (r15 != r1) goto L_0x008d
        L_0x002c:
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2994u
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x0042
            if (r15 != r7) goto L_0x0039
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x003a
        L_0x0039:
            r0 = r4
        L_0x003a:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x0042
            r0 = r1
            goto L_0x0043
        L_0x0042:
            r0 = r2
        L_0x0043:
            if (r0 != 0) goto L_0x006d
            androidx.recyclerview.widget.RecyclerView$m r8 = r13.f2994u
            boolean r8 = r8.o()
            if (r8 == 0) goto L_0x006d
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2994u
            int r0 = r0.M()
            if (r0 != r1) goto L_0x0057
            r0 = r1
            goto L_0x0058
        L_0x0057:
            r0 = r2
        L_0x0058:
            if (r15 != r7) goto L_0x005c
            r8 = r1
            goto L_0x005d
        L_0x005c:
            r8 = r2
        L_0x005d:
            r0 = r0 ^ r8
            if (r0 == 0) goto L_0x0063
            r0 = 66
            goto L_0x0064
        L_0x0063:
            r0 = r5
        L_0x0064:
            android.view.View r0 = r3.findNextFocus(r13, r14, r0)
            if (r0 != 0) goto L_0x006c
            r0 = r1
            goto L_0x006d
        L_0x006c:
            r0 = r2
        L_0x006d:
            if (r0 == 0) goto L_0x0088
            r13.p()
            android.view.View r0 = r13.E(r14)
            if (r0 != 0) goto L_0x0079
            return r6
        L_0x0079:
            r13.o0()
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2994u
            androidx.recyclerview.widget.RecyclerView$s r8 = r13.f2965c
            androidx.recyclerview.widget.RecyclerView$w r9 = r13.f2985p0
            r0.d0(r14, r15, r8, r9)
            r13.p0(r2)
        L_0x0088:
            android.view.View r0 = r3.findNextFocus(r13, r14, r15)
            goto L_0x00b1
        L_0x008d:
            android.view.View r3 = r3.findNextFocus(r13, r14, r15)
            if (r3 != 0) goto L_0x00b0
            if (r0 == 0) goto L_0x00b0
            r13.p()
            android.view.View r0 = r13.E(r14)
            if (r0 != 0) goto L_0x009f
            return r6
        L_0x009f:
            r13.o0()
            androidx.recyclerview.widget.RecyclerView$m r0 = r13.f2994u
            androidx.recyclerview.widget.RecyclerView$s r3 = r13.f2965c
            androidx.recyclerview.widget.RecyclerView$w r8 = r13.f2985p0
            android.view.View r0 = r0.d0(r14, r15, r3, r8)
            r13.p0(r2)
            goto L_0x00b1
        L_0x00b0:
            r0 = r3
        L_0x00b1:
            if (r0 == 0) goto L_0x00c8
            boolean r3 = r0.hasFocusable()
            if (r3 != 0) goto L_0x00c8
            android.view.View r1 = r13.getFocusedChild()
            if (r1 != 0) goto L_0x00c4
            android.view.View r14 = super.focusSearch(r14, r15)
            return r14
        L_0x00c4:
            r13.g0(r0, r6)
            return r14
        L_0x00c8:
            if (r0 == 0) goto L_0x0199
            if (r0 == r13) goto L_0x0199
            if (r0 != r14) goto L_0x00d0
            goto L_0x0199
        L_0x00d0:
            android.view.View r3 = r13.E(r0)
            if (r3 != 0) goto L_0x00d9
            r1 = r2
            goto L_0x019a
        L_0x00d9:
            if (r14 != 0) goto L_0x00dd
            goto L_0x019a
        L_0x00dd:
            android.view.View r3 = r13.E(r14)
            if (r3 != 0) goto L_0x00e5
            goto L_0x019a
        L_0x00e5:
            android.graphics.Rect r3 = r13.f2986q
            int r6 = r14.getWidth()
            int r8 = r14.getHeight()
            r3.set(r2, r2, r6, r8)
            android.graphics.Rect r3 = r13.f2988r
            int r6 = r0.getWidth()
            int r8 = r0.getHeight()
            r3.set(r2, r2, r6, r8)
            android.graphics.Rect r2 = r13.f2986q
            r13.offsetDescendantRectToMyCoords(r14, r2)
            android.graphics.Rect r2 = r13.f2988r
            r13.offsetDescendantRectToMyCoords(r0, r2)
            androidx.recyclerview.widget.RecyclerView$m r2 = r13.f2994u
            int r2 = r2.M()
            if (r2 != r1) goto L_0x0113
            r2 = -1
            goto L_0x0114
        L_0x0113:
            r2 = r1
        L_0x0114:
            android.graphics.Rect r3 = r13.f2986q
            int r6 = r3.left
            android.graphics.Rect r8 = r13.f2988r
            int r9 = r8.left
            if (r6 < r9) goto L_0x0122
            int r10 = r3.right
            if (r10 > r9) goto L_0x012a
        L_0x0122:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 >= r11) goto L_0x012a
            r6 = r1
            goto L_0x0137
        L_0x012a:
            int r10 = r3.right
            int r11 = r8.right
            if (r10 > r11) goto L_0x0132
            if (r6 < r11) goto L_0x0136
        L_0x0132:
            if (r6 <= r9) goto L_0x0136
            r6 = -1
            goto L_0x0137
        L_0x0136:
            r6 = 0
        L_0x0137:
            int r9 = r3.top
            int r10 = r8.top
            if (r9 < r10) goto L_0x0141
            int r11 = r3.bottom
            if (r11 > r10) goto L_0x0149
        L_0x0141:
            int r11 = r3.bottom
            int r12 = r8.bottom
            if (r11 >= r12) goto L_0x0149
            r3 = r1
            goto L_0x0156
        L_0x0149:
            int r3 = r3.bottom
            int r8 = r8.bottom
            if (r3 > r8) goto L_0x0151
            if (r9 < r8) goto L_0x0155
        L_0x0151:
            if (r9 <= r10) goto L_0x0155
            r3 = -1
            goto L_0x0156
        L_0x0155:
            r3 = 0
        L_0x0156:
            if (r15 == r1) goto L_0x0191
            if (r15 == r7) goto L_0x0189
            if (r15 == r5) goto L_0x0186
            if (r15 == r4) goto L_0x0183
            r2 = 66
            if (r15 == r2) goto L_0x0180
            r2 = 130(0x82, float:1.82E-43)
            if (r15 != r2) goto L_0x0169
            if (r3 <= 0) goto L_0x0199
            goto L_0x019a
        L_0x0169:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid direction: "
            r0.append(r1)
            r0.append(r15)
            java.lang.String r15 = android.support.v4.media.a.l(r13, r0)
            r14.<init>(r15)
            throw r14
        L_0x0180:
            if (r6 <= 0) goto L_0x0199
            goto L_0x019a
        L_0x0183:
            if (r3 >= 0) goto L_0x0199
            goto L_0x019a
        L_0x0186:
            if (r6 >= 0) goto L_0x0199
            goto L_0x019a
        L_0x0189:
            if (r3 > 0) goto L_0x019a
            if (r3 != 0) goto L_0x0199
            int r6 = r6 * r2
            if (r6 <= 0) goto L_0x0199
            goto L_0x019a
        L_0x0191:
            if (r3 < 0) goto L_0x019a
            if (r3 != 0) goto L_0x0199
            int r6 = r6 * r2
            if (r6 >= 0) goto L_0x0199
            goto L_0x019a
        L_0x0199:
            r1 = 0
        L_0x019a:
            if (r1 == 0) goto L_0x019d
            goto L_0x01a1
        L_0x019d:
            android.view.View r0 = super.focusSearch(r14, r15)
        L_0x01a1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final void g0(View view, View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.f2986q.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.f3008c) {
                Rect rect = layoutParams2.f3007b;
                Rect rect2 = this.f2986q;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f2986q);
            offsetRectIntoDescendantCoords(view, this.f2986q);
        }
        m mVar = this.f2994u;
        Rect rect3 = this.f2986q;
        boolean z11 = !this.C;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        mVar.z0(this, view, rect3, z11, z10);
    }

    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        m mVar = this.f2994u;
        if (mVar != null) {
            return mVar.C();
        }
        throw new IllegalStateException(android.support.v4.media.a.l(this, android.support.v4.media.a.q("RecyclerView has no LayoutManager")));
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        m mVar = this.f2994u;
        if (mVar != null) {
            return mVar.D(getContext(), attributeSet);
        }
        throw new IllegalStateException(android.support.v4.media.a.l(this, android.support.v4.media.a.q("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public e getAdapter() {
        return this.f2992t;
    }

    public int getBaseline() {
        m mVar = this.f2994u;
        if (mVar == null) {
            return super.getBaseline();
        }
        mVar.getClass();
        return -1;
    }

    public final int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public boolean getClipToPadding() {
        return this.f2982o;
    }

    public u getCompatAccessibilityDelegate() {
        return this.f2999w0;
    }

    public i getEdgeEffectFactory() {
        return this.P;
    }

    public j getItemAnimator() {
        return this.U;
    }

    public int getItemDecorationCount() {
        return this.f3000x.size();
    }

    public m getLayoutManager() {
        return this.f2994u;
    }

    public int getMaxFlingVelocity() {
        return this.f2975i0;
    }

    public int getMinFlingVelocity() {
        return this.f2974h0;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (O0) {
            return System.nanoTime();
        }
        return 0;
    }

    public o getOnFlingListener() {
        return this.f2973g0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f2978l0;
    }

    public r getRecycledViewPool() {
        return this.f2965c.c();
    }

    public int getScrollState() {
        return this.V;
    }

    public final void h(a0 a0Var) {
        boolean z10;
        View view = a0Var.f3013a;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2965c.m(N(view));
        if (a0Var.l()) {
            this.f2971f.b(view, -1, view.getLayoutParams(), true);
        } else if (!z10) {
            this.f2971f.a(view, -1, true);
        } else {
            b bVar = this.f2971f;
            int indexOfChild = ((s) bVar.f3168a).f3296a.indexOfChild(view);
            if (indexOfChild >= 0) {
                bVar.f3169b.h(indexOfChild);
                bVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0() {
        VelocityTracker velocityTracker = this.f2962a0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z10 = false;
        q0(0);
        EdgeEffect edgeEffect = this.Q;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.Q.isFinished();
        }
        EdgeEffect edgeEffect2 = this.R;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.R.isFinished();
        }
        EdgeEffect edgeEffect3 = this.S;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.S.isFinished();
        }
        EdgeEffect edgeEffect4 = this.T;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.T.isFinished();
        }
        if (z10) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(this);
        }
    }

    public final boolean hasNestedScrollingParent() {
        if (getScrollingChildHelper().f(0) != null) {
            return true;
        }
        return false;
    }

    public final void i(l lVar) {
        m mVar = this.f2994u;
        if (mVar != null) {
            mVar.m("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3000x.isEmpty()) {
            setWillNotDraw(false);
        }
        this.f3000x.add(lVar);
        S();
        requestLayout();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ef  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean i0(int r18, int r19, android.view.MotionEvent r20, int r21) {
        /*
            r17 = this;
            r8 = r17
            r9 = r18
            r10 = r19
            r17.p()
            androidx.recyclerview.widget.RecyclerView$e r0 = r8.f2992t
            r11 = 0
            r12 = 1
            if (r0 == 0) goto L_0x0028
            int[] r0 = r8.B0
            r0[r11] = r11
            r0[r12] = r11
            r8.j0(r9, r10, r0)
            int[] r0 = r8.B0
            r1 = r0[r11]
            r0 = r0[r12]
            int r2 = r9 - r1
            int r3 = r10 - r0
            r13 = r0
            r14 = r1
            r15 = r2
            r16 = r3
            goto L_0x002d
        L_0x0028:
            r13 = r11
            r14 = r13
            r15 = r14
            r16 = r15
        L_0x002d:
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$l> r0 = r8.f3000x
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0038
            r17.invalidate()
        L_0x0038:
            int[] r7 = r8.B0
            r7[r11] = r11
            r7[r12] = r11
            int[] r5 = r8.f3005z0
            r0 = r17
            r1 = r14
            r2 = r13
            r3 = r15
            r4 = r16
            r6 = r21
            r0.w(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r8.B0
            r1 = r0[r11]
            int r15 = r15 - r1
            r0 = r0[r12]
            int r2 = r16 - r0
            if (r1 != 0) goto L_0x005c
            if (r0 == 0) goto L_0x005a
            goto L_0x005c
        L_0x005a:
            r0 = r11
            goto L_0x005d
        L_0x005c:
            r0 = r12
        L_0x005d:
            int r1 = r8.f2968d0
            int[] r3 = r8.f3005z0
            r4 = r3[r11]
            int r1 = r1 - r4
            r8.f2968d0 = r1
            int r1 = r8.f2970e0
            r3 = r3[r12]
            int r1 = r1 - r3
            r8.f2970e0 = r1
            int[] r1 = r8.A0
            r5 = r1[r11]
            int r5 = r5 + r4
            r1[r11] = r5
            r4 = r1[r12]
            int r4 = r4 + r3
            r1[r12] = r4
            int r1 = r17.getOverScrollMode()
            r3 = 2
            if (r1 == r3) goto L_0x011c
            if (r20 == 0) goto L_0x0119
            r1 = 8194(0x2002, float:1.1482E-41)
            int r3 = r20.getSource()
            r3 = r3 & r1
            if (r3 != r1) goto L_0x008d
            r1 = r12
            goto L_0x008e
        L_0x008d:
            r1 = r11
        L_0x008e:
            if (r1 != 0) goto L_0x0119
            float r1 = r20.getX()
            float r3 = (float) r15
            float r4 = r20.getY()
            float r2 = (float) r2
            r5 = 0
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r6 >= 0) goto L_0x00b9
            r17.z()
            android.widget.EdgeEffect r6 = r8.Q
            float r15 = -r3
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r15 = r15 / r11
            int r11 = r17.getHeight()
            float r11 = (float) r11
            float r4 = r4 / r11
            float r4 = r7 - r4
            androidx.core.widget.d.b(r6, r15, r4)
            goto L_0x00d2
        L_0x00b9:
            int r6 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d4
            r17.A()
            android.widget.EdgeEffect r6 = r8.S
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r11 = r3 / r11
            int r15 = r17.getHeight()
            float r15 = (float) r15
            float r4 = r4 / r15
            androidx.core.widget.d.b(r6, r11, r4)
        L_0x00d2:
            r4 = r12
            goto L_0x00d5
        L_0x00d4:
            r4 = 0
        L_0x00d5:
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 >= 0) goto L_0x00ef
            r17.B()
            android.widget.EdgeEffect r4 = r8.R
            float r6 = -r2
            int r7 = r17.getHeight()
            float r7 = (float) r7
            float r6 = r6 / r7
            int r7 = r17.getWidth()
            float r7 = (float) r7
            float r1 = r1 / r7
            androidx.core.widget.d.b(r4, r6, r1)
            goto L_0x0109
        L_0x00ef:
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r6 <= 0) goto L_0x010a
            r17.y()
            android.widget.EdgeEffect r4 = r8.T
            int r6 = r17.getHeight()
            float r6 = (float) r6
            float r6 = r2 / r6
            int r11 = r17.getWidth()
            float r11 = (float) r11
            float r1 = r1 / r11
            float r7 = r7 - r1
            androidx.core.widget.d.b(r4, r6, r7)
        L_0x0109:
            r4 = r12
        L_0x010a:
            if (r4 != 0) goto L_0x0114
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0114
            int r1 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0119
        L_0x0114:
            java.util.WeakHashMap<android.view.View, w1.q0> r1 = w1.d0.f16298a
            w1.d0.d.k(r17)
        L_0x0119:
            r17.n(r18, r19)
        L_0x011c:
            if (r14 != 0) goto L_0x0120
            if (r13 == 0) goto L_0x0123
        L_0x0120:
            r8.x(r14, r13)
        L_0x0123:
            boolean r1 = r17.awakenScrollBars()
            if (r1 != 0) goto L_0x012c
            r17.invalidate()
        L_0x012c:
            if (r0 != 0) goto L_0x0135
            if (r14 != 0) goto L_0x0135
            if (r13 == 0) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r11 = 0
            goto L_0x0136
        L_0x0135:
            r11 = r12
        L_0x0136:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.i0(int, int, android.view.MotionEvent, int):boolean");
    }

    public final boolean isAttachedToWindow() {
        return this.A;
    }

    public final boolean isLayoutSuppressed() {
        return this.F;
    }

    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f16339d;
    }

    public final void j(q qVar) {
        if (this.f2989r0 == null) {
            this.f2989r0 = new ArrayList();
        }
        this.f2989r0.add(qVar);
    }

    public final void j0(int i10, int i11, int[] iArr) {
        int i12;
        int i13;
        a0 a0Var;
        o0();
        U();
        int i14 = s1.n.f14600a;
        n.a.a("RV Scroll");
        D(this.f2985p0);
        if (i10 != 0) {
            i12 = this.f2994u.B0(i10, this.f2965c, this.f2985p0);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.f2994u.D0(i11, this.f2965c, this.f2985p0);
        } else {
            i13 = 0;
        }
        n.a.b();
        int e10 = this.f2971f.e();
        for (int i15 = 0; i15 < e10; i15++) {
            View d10 = this.f2971f.d(i15);
            a0 N2 = N(d10);
            if (!(N2 == null || (a0Var = N2.f3021i) == null)) {
                View view = a0Var.f3013a;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        V(true);
        p0(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    public final void k(String str) {
        if (Q()) {
            if (str == null) {
                throw new IllegalStateException(android.support.v4.media.a.l(this, android.support.v4.media.a.q("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.O > 0) {
            new IllegalStateException(android.support.v4.media.a.l(this, android.support.v4.media.a.q("")));
        }
    }

    public final void k0(int i10) {
        v vVar;
        if (!this.F) {
            setScrollState(0);
            z zVar = this.f2979m0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f3113c.abortAnimation();
            m mVar = this.f2994u;
            if (!(mVar == null || (vVar = mVar.f3050e) == null)) {
                vVar.g();
            }
            m mVar2 = this.f2994u;
            if (mVar2 != null) {
                mVar2.C0(i10);
                awakenScrollBars();
            }
        }
    }

    public final boolean l0(EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        float a10 = androidx.core.widget.d.a(edgeEffect) * ((float) i11);
        double log = Math.log((double) ((((float) Math.abs(-i10)) * 0.35f) / (this.f2961a * 0.015f)));
        double d10 = (double) L0;
        if (((float) (Math.exp((d10 / (d10 - 1.0d)) * log) * ((double) (this.f2961a * 0.015f)))) < a10) {
            return true;
        }
        return false;
    }

    public final void m() {
        int h10 = this.f2971f.h();
        for (int i10 = 0; i10 < h10; i10++) {
            a0 O2 = O(this.f2971f.g(i10));
            if (!O2.p()) {
                O2.f3016d = -1;
                O2.f3019g = -1;
            }
        }
        s sVar = this.f2965c;
        int size = sVar.f3077c.size();
        for (int i11 = 0; i11 < size; i11++) {
            a0 a0Var = sVar.f3077c.get(i11);
            a0Var.f3016d = -1;
            a0Var.f3019g = -1;
        }
        int size2 = sVar.f3075a.size();
        for (int i12 = 0; i12 < size2; i12++) {
            a0 a0Var2 = sVar.f3075a.get(i12);
            a0Var2.f3016d = -1;
            a0Var2.f3019g = -1;
        }
        ArrayList<a0> arrayList = sVar.f3076b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                a0 a0Var3 = sVar.f3076b.get(i13);
                a0Var3.f3016d = -1;
                a0Var3.f3019g = -1;
            }
        }
    }

    public final void m0(int i10, int i11, boolean z10) {
        m mVar = this.f2994u;
        if (mVar != null && !this.F) {
            int i12 = 0;
            if (!mVar.o()) {
                i10 = 0;
            }
            if (!this.f2994u.p()) {
                i11 = 0;
            }
            if (i10 != 0 || i11 != 0) {
                if (z10) {
                    if (i10 != 0) {
                        i12 = 1;
                    }
                    if (i11 != 0) {
                        i12 |= 2;
                    }
                    getScrollingChildHelper().g(i12, 1);
                }
                this.f2979m0.c(i10, i11, Integer.MIN_VALUE, (Interpolator) null);
            }
        }
    }

    public final void n(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.Q;
        if (edgeEffect == null || edgeEffect.isFinished() || i10 <= 0) {
            z10 = false;
        } else {
            this.Q.onRelease();
            z10 = this.Q.isFinished();
        }
        EdgeEffect edgeEffect2 = this.S;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.S.onRelease();
            z10 |= this.S.isFinished();
        }
        EdgeEffect edgeEffect3 = this.R;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.R.onRelease();
            z10 |= this.R.isFinished();
        }
        EdgeEffect edgeEffect4 = this.T;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.T.onRelease();
            z10 |= this.T.isFinished();
        }
        if (z10) {
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.d.k(this);
        }
    }

    public final void n0(int i10) {
        m mVar;
        if (!this.F && (mVar = this.f2994u) != null) {
            mVar.M0(this, this.f2985p0, i10);
        }
    }

    public final void o0() {
        int i10 = this.D + 1;
        this.D = i10;
        if (i10 == 1 && !this.F) {
            this.E = false;
        }
    }

    public final void onAttachedToWindow() {
        boolean z10;
        super.onAttachedToWindow();
        this.N = 0;
        this.A = true;
        if (!this.C || isLayoutRequested()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.C = z10;
        this.f2965c.e();
        m mVar = this.f2994u;
        if (mVar != null) {
            mVar.f3052n = true;
            mVar.b0(this);
        }
        this.f2997v0 = false;
        if (O0) {
            ThreadLocal<j> threadLocal = j.f3255e;
            j jVar = threadLocal.get();
            this.f2981n0 = jVar;
            if (jVar == null) {
                this.f2981n0 = new j();
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                Display b10 = d0.e.b(this);
                float f10 = 60.0f;
                if (!isInEditMode() && b10 != null) {
                    float refreshRate = b10.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f10 = refreshRate;
                    }
                }
                j jVar2 = this.f2981n0;
                jVar2.f3259c = (long) (1.0E9f / f10);
                threadLocal.set(jVar2);
            }
            j jVar3 = this.f2981n0;
            jVar3.getClass();
            if (!I0 || !jVar3.f3257a.contains(this)) {
                jVar3.f3257a.add(this);
                return;
            }
            throw new IllegalStateException("RecyclerView already present in worker list!");
        }
    }

    public final void onDetachedFromWindow() {
        boolean z10;
        j jVar;
        v vVar;
        super.onDetachedFromWindow();
        j jVar2 = this.U;
        if (jVar2 != null) {
            jVar2.k();
        }
        setScrollState(0);
        z zVar = this.f2979m0;
        RecyclerView.this.removeCallbacks(zVar);
        zVar.f3113c.abortAnimation();
        m mVar = this.f2994u;
        if (!(mVar == null || (vVar = mVar.f3050e) == null)) {
            vVar.g();
        }
        this.A = false;
        m mVar2 = this.f2994u;
        if (mVar2 != null) {
            mVar2.f3052n = false;
            mVar2.c0(this);
        }
        this.C0.clear();
        removeCallbacks(this.D0);
        this.f2980n.getClass();
        do {
        } while (a0.a.f3164d.b() != null);
        s sVar = this.f2965c;
        for (int i10 = 0; i10 < sVar.f3077c.size(); i10++) {
            b2.a.a(sVar.f3077c.get(i10).f3013a);
        }
        sVar.f(RecyclerView.this.f2992t, false);
        int i11 = b2.a.f3983a;
        int i12 = 0;
        while (true) {
            if (i12 < getChildCount()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                int i13 = i12 + 1;
                View childAt = getChildAt(i12);
                if (childAt != null) {
                    int i14 = b2.a.f3983a;
                    b2.c cVar = (b2.c) childAt.getTag(i14);
                    if (cVar == null) {
                        cVar = new b2.c();
                        childAt.setTag(i14, cVar);
                    }
                    for (int I2 = j7.a.I(cVar.f3985a); -1 < I2; I2--) {
                        cVar.f3985a.get(I2).a();
                    }
                    i12 = i13;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else if (O0 && (jVar = this.f2981n0) != null) {
                boolean remove = jVar.f3257a.remove(this);
                if (!I0 || remove) {
                    this.f2981n0 = null;
                    return;
                }
                throw new IllegalStateException("RecyclerView removal failed!");
            } else {
                return;
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3000x.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3000x.get(i10).e(canvas, this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            androidx.recyclerview.widget.RecyclerView$m r0 = r14.f2994u
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = r14.F
            if (r0 == 0) goto L_0x000b
            return r1
        L_0x000b:
            int r0 = r15.getAction()
            r2 = 8
            if (r0 != r2) goto L_0x00e7
            int r0 = r15.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L_0x003c
            androidx.recyclerview.widget.RecyclerView$m r0 = r14.f2994u
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x002c
            r0 = 9
            float r0 = r15.getAxisValue(r0)
            float r0 = -r0
            goto L_0x002d
        L_0x002c:
            r0 = r2
        L_0x002d:
            androidx.recyclerview.widget.RecyclerView$m r3 = r14.f2994u
            boolean r3 = r3.o()
            if (r3 == 0) goto L_0x0054
            r3 = 10
            float r3 = r15.getAxisValue(r3)
            goto L_0x0062
        L_0x003c:
            int r0 = r15.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L_0x0060
            r0 = 26
            float r3 = r15.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$m r0 = r14.f2994u
            boolean r0 = r0.p()
            if (r0 == 0) goto L_0x0056
            float r0 = -r3
        L_0x0054:
            r3 = r2
            goto L_0x0062
        L_0x0056:
            androidx.recyclerview.widget.RecyclerView$m r0 = r14.f2994u
            boolean r0 = r0.o()
            if (r0 == 0) goto L_0x0060
            r0 = r2
            goto L_0x0062
        L_0x0060:
            r0 = r2
            r3 = r0
        L_0x0062:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x006a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00e7
        L_0x006a:
            float r2 = r14.f2976j0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r14.f2977k0
            float r0 = r0 * r3
            int r0 = (int) r0
            androidx.recyclerview.widget.RecyclerView$m r3 = r14.f2994u
            if (r3 != 0) goto L_0x0078
            goto L_0x00e7
        L_0x0078:
            boolean r4 = r14.F
            if (r4 == 0) goto L_0x007e
            goto L_0x00e7
        L_0x007e:
            int[] r4 = r14.B0
            r4[r1] = r1
            r5 = 1
            r4[r5] = r1
            boolean r3 = r3.o()
            androidx.recyclerview.widget.RecyclerView$m r4 = r14.f2994u
            boolean r4 = r4.p()
            if (r4 == 0) goto L_0x0094
            r6 = r3 | 2
            goto L_0x0095
        L_0x0094:
            r6 = r3
        L_0x0095:
            float r7 = r15.getY()
            float r8 = r15.getX()
            int r7 = r14.d0(r2, r7)
            int r2 = r2 - r7
            int r7 = r14.e0(r0, r8)
            int r0 = r0 - r7
            w1.m r7 = r14.getScrollingChildHelper()
            r7.g(r6, r5)
            if (r3 == 0) goto L_0x00b2
            r9 = r2
            goto L_0x00b3
        L_0x00b2:
            r9 = r1
        L_0x00b3:
            if (r4 == 0) goto L_0x00b7
            r10 = r0
            goto L_0x00b8
        L_0x00b7:
            r10 = r1
        L_0x00b8:
            int[] r12 = r14.B0
            int[] r13 = r14.f3005z0
            r11 = 1
            r8 = r14
            boolean r6 = r8.v(r9, r10, r11, r12, r13)
            if (r6 == 0) goto L_0x00cc
            int[] r6 = r14.B0
            r7 = r6[r1]
            int r2 = r2 - r7
            r6 = r6[r5]
            int r0 = r0 - r6
        L_0x00cc:
            if (r3 == 0) goto L_0x00d0
            r3 = r2
            goto L_0x00d1
        L_0x00d0:
            r3 = r1
        L_0x00d1:
            if (r4 == 0) goto L_0x00d5
            r4 = r0
            goto L_0x00d6
        L_0x00d5:
            r4 = r1
        L_0x00d6:
            r14.i0(r3, r4, r15, r5)
            androidx.recyclerview.widget.j r15 = r14.f2981n0
            if (r15 == 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00e1
            if (r0 == 0) goto L_0x00e4
        L_0x00e1:
            r15.a(r14, r2, r0)
        L_0x00e4:
            r14.q0(r5)
        L_0x00e7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        if (this.F) {
            return false;
        }
        this.f3004z = null;
        if (F(motionEvent)) {
            h0();
            setScrollState(0);
            return true;
        }
        m mVar = this.f2994u;
        if (mVar == null) {
            return false;
        }
        boolean o10 = mVar.o();
        boolean p10 = this.f2994u.p();
        if (this.f2962a0 == null) {
            this.f2962a0 = VelocityTracker.obtain();
        }
        this.f2962a0.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.G) {
                this.G = false;
            }
            this.W = motionEvent.getPointerId(0);
            int x10 = (int) (motionEvent.getX() + 0.5f);
            this.f2968d0 = x10;
            this.f2964b0 = x10;
            int y10 = (int) (motionEvent.getY() + 0.5f);
            this.f2970e0 = y10;
            this.f2966c0 = y10;
            EdgeEffect edgeEffect = this.Q;
            if (edgeEffect == null || androidx.core.widget.d.a(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                z10 = false;
            } else {
                androidx.core.widget.d.b(this.Q, 0.0f, 1.0f - (motionEvent.getY() / ((float) getHeight())));
                z10 = true;
            }
            EdgeEffect edgeEffect2 = this.S;
            if (!(edgeEffect2 == null || androidx.core.widget.d.a(edgeEffect2) == 0.0f || canScrollHorizontally(1))) {
                androidx.core.widget.d.b(this.S, 0.0f, motionEvent.getY() / ((float) getHeight()));
                z10 = true;
            }
            EdgeEffect edgeEffect3 = this.R;
            if (!(edgeEffect3 == null || androidx.core.widget.d.a(edgeEffect3) == 0.0f || canScrollVertically(-1))) {
                androidx.core.widget.d.b(this.R, 0.0f, motionEvent.getX() / ((float) getWidth()));
                z10 = true;
            }
            EdgeEffect edgeEffect4 = this.T;
            if (!(edgeEffect4 == null || androidx.core.widget.d.a(edgeEffect4) == 0.0f || canScrollVertically(1))) {
                androidx.core.widget.d.b(this.T, 0.0f, 1.0f - (motionEvent.getX() / ((float) getWidth())));
                z10 = true;
            }
            if (z10 || this.V == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                q0(1);
            }
            int[] iArr = this.A0;
            iArr[1] = 0;
            iArr[0] = 0;
            if (p10) {
                o10 |= true;
            }
            getScrollingChildHelper().g(o10 ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.f2962a0.clear();
            q0(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.W);
            if (findPointerIndex < 0) {
                return false;
            }
            int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y11 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.V != 1) {
                int i10 = x11 - this.f2964b0;
                int i11 = y11 - this.f2966c0;
                if (!o10 || Math.abs(i10) <= this.f2972f0) {
                    z11 = false;
                } else {
                    this.f2968d0 = x11;
                    z11 = true;
                }
                if (p10 && Math.abs(i11) > this.f2972f0) {
                    this.f2970e0 = y11;
                    z11 = true;
                }
                if (z11) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            h0();
            setScrollState(0);
        } else if (actionMasked == 5) {
            this.W = motionEvent.getPointerId(actionIndex);
            int x12 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f2968d0 = x12;
            this.f2964b0 = x12;
            int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f2970e0 = y12;
            this.f2966c0 = y12;
        } else if (actionMasked == 6) {
            W(motionEvent);
        }
        if (this.V == 1) {
            return true;
        }
        return false;
    }

    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = s1.n.f14600a;
        n.a.a("RV OnLayout");
        s();
        n.a.b();
        this.C = true;
    }

    public final void onMeasure(int i10, int i11) {
        m mVar = this.f2994u;
        if (mVar == null) {
            q(i10, i11);
            return;
        }
        boolean z10 = false;
        if (mVar.U()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.f2994u.q0(this.f2965c, this.f2985p0, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.E0 = z10;
            if (!z10 && this.f2992t != null) {
                if (this.f2985p0.f3100d == 1) {
                    t();
                }
                this.f2994u.F0(i10, i11);
                this.f2985p0.f3105i = true;
                u();
                this.f2994u.H0(i10, i11);
                if (this.f2994u.K0()) {
                    this.f2994u.F0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.f2985p0.f3105i = true;
                    u();
                    this.f2994u.H0(i10, i11);
                }
                this.F0 = getMeasuredWidth();
                this.G0 = getMeasuredHeight();
            }
        } else if (this.B) {
            this.f2994u.q0(this.f2965c, this.f2985p0, i10, i11);
        } else {
            if (this.I) {
                o0();
                U();
                a0();
                V(true);
                w wVar = this.f2985p0;
                if (wVar.f3107k) {
                    wVar.f3103g = true;
                } else {
                    this.f2969e.c();
                    this.f2985p0.f3103g = false;
                }
                this.I = false;
                p0(false);
            } else if (this.f2985p0.f3107k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            e eVar = this.f2992t;
            if (eVar != null) {
                this.f2985p0.f3101e = eVar.c();
            } else {
                this.f2985p0.f3101e = 0;
            }
            o0();
            this.f2994u.q0(this.f2965c, this.f2985p0, i10, i11);
            p0(false);
            this.f2985p0.f3103g = false;
        }
    }

    public final boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (Q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.f2967d = savedState;
        super.onRestoreInstanceState(savedState.f2188a);
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.f2967d;
        if (savedState2 != null) {
            savedState.f3010c = savedState2.f3010c;
        } else {
            m mVar = this.f2994u;
            if (mVar != null) {
                savedState.f3010c = mVar.s0();
            } else {
                savedState.f3010c = null;
            }
        }
        return savedState;
    }

    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            this.T = null;
            this.R = null;
            this.S = null;
            this.Q = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.F
            r8 = 0
            if (r0 != 0) goto L_0x01fb
            boolean r0 = r6.G
            if (r0 == 0) goto L_0x000f
            goto L_0x01fb
        L_0x000f:
            androidx.recyclerview.widget.RecyclerView$p r0 = r6.f3004z
            r1 = 3
            r9 = 1
            if (r0 != 0) goto L_0x0022
            int r0 = r18.getAction()
            if (r0 != 0) goto L_0x001d
            r0 = r8
            goto L_0x0031
        L_0x001d:
            boolean r0 = r17.F(r18)
            goto L_0x0031
        L_0x0022:
            r0.a(r6, r7)
            int r0 = r18.getAction()
            if (r0 == r1) goto L_0x002d
            if (r0 != r9) goto L_0x0030
        L_0x002d:
            r0 = 0
            r6.f3004z = r0
        L_0x0030:
            r0 = r9
        L_0x0031:
            if (r0 == 0) goto L_0x003a
            r17.h0()
            r6.setScrollState(r8)
            return r9
        L_0x003a:
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.f2994u
            if (r0 != 0) goto L_0x003f
            return r8
        L_0x003f:
            boolean r10 = r0.o()
            androidx.recyclerview.widget.RecyclerView$m r0 = r6.f2994u
            boolean r11 = r0.p()
            android.view.VelocityTracker r0 = r6.f2962a0
            if (r0 != 0) goto L_0x0053
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.f2962a0 = r0
        L_0x0053:
            int r0 = r18.getActionMasked()
            int r2 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0063
            int[] r3 = r6.A0
            r3[r9] = r8
            r3[r8] = r8
        L_0x0063:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r3 = r6.A0
            r4 = r3[r8]
            float r4 = (float) r4
            r3 = r3[r9]
            float r3 = (float) r3
            r12.offsetLocation(r4, r3)
            r3 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01cb
            if (r0 == r9) goto L_0x0189
            r4 = 2
            if (r0 == r4) goto L_0x00ae
            if (r0 == r1) goto L_0x00a6
            r1 = 5
            if (r0 == r1) goto L_0x008a
            r1 = 6
            if (r0 == r1) goto L_0x0085
            goto L_0x01f0
        L_0x0085:
            r17.W(r18)
            goto L_0x01f0
        L_0x008a:
            int r0 = r7.getPointerId(r2)
            r6.W = r0
            float r0 = r7.getX(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.f2968d0 = r0
            r6.f2964b0 = r0
            float r0 = r7.getY(r2)
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.f2970e0 = r0
            r6.f2966c0 = r0
            goto L_0x01f0
        L_0x00a6:
            r17.h0()
            r6.setScrollState(r8)
            goto L_0x01f0
        L_0x00ae:
            int r0 = r6.W
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00b7
            return r8
        L_0x00b7:
            float r1 = r7.getX(r0)
            float r1 = r1 + r3
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r3
            int r14 = (int) r0
            int r0 = r6.f2968d0
            int r0 = r0 - r13
            int r1 = r6.f2970e0
            int r1 = r1 - r14
            int r2 = r6.V
            if (r2 == r9) goto L_0x0100
            if (r10 == 0) goto L_0x00e4
            if (r0 <= 0) goto L_0x00d9
            int r2 = r6.f2972f0
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00e0
        L_0x00d9:
            int r2 = r6.f2972f0
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00e0:
            if (r0 == 0) goto L_0x00e4
            r2 = r9
            goto L_0x00e5
        L_0x00e4:
            r2 = r8
        L_0x00e5:
            if (r11 == 0) goto L_0x00fb
            if (r1 <= 0) goto L_0x00f1
            int r3 = r6.f2972f0
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00f8
        L_0x00f1:
            int r3 = r6.f2972f0
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00f8:
            if (r1 == 0) goto L_0x00fb
            r2 = r9
        L_0x00fb:
            if (r2 == 0) goto L_0x0100
            r6.setScrollState(r9)
        L_0x0100:
            int r2 = r6.V
            if (r2 != r9) goto L_0x01f0
            int[] r2 = r6.B0
            r2[r8] = r8
            r2[r9] = r8
            float r2 = r18.getY()
            int r2 = r6.d0(r0, r2)
            int r15 = r0 - r2
            float r0 = r18.getX()
            int r0 = r6.e0(r1, r0)
            int r16 = r1 - r0
            if (r10 == 0) goto L_0x0122
            r1 = r15
            goto L_0x0123
        L_0x0122:
            r1 = r8
        L_0x0123:
            if (r11 == 0) goto L_0x0128
            r2 = r16
            goto L_0x0129
        L_0x0128:
            r2 = r8
        L_0x0129:
            int[] r4 = r6.B0
            int[] r5 = r6.f3005z0
            r3 = 0
            r0 = r17
            boolean r0 = r0.v(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x0158
            int[] r0 = r6.B0
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.A0
            r1 = r0[r8]
            int[] r2 = r6.f3005z0
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x0158:
            r0 = r16
            int[] r1 = r6.f3005z0
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.f2968d0 = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.f2970e0 = r14
            if (r10 == 0) goto L_0x016a
            r1 = r15
            goto L_0x016b
        L_0x016a:
            r1 = r8
        L_0x016b:
            if (r11 == 0) goto L_0x016f
            r2 = r0
            goto L_0x0170
        L_0x016f:
            r2 = r8
        L_0x0170:
            boolean r1 = r6.i0(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x017d
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x017d:
            androidx.recyclerview.widget.j r1 = r6.f2981n0
            if (r1 == 0) goto L_0x01f0
            if (r15 != 0) goto L_0x0185
            if (r0 == 0) goto L_0x01f0
        L_0x0185:
            r1.a(r6, r15, r0)
            goto L_0x01f0
        L_0x0189:
            android.view.VelocityTracker r0 = r6.f2962a0
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.f2962a0
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.f2975i0
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x01a5
            android.view.VelocityTracker r1 = r6.f2962a0
            int r2 = r6.W
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x01a6
        L_0x01a5:
            r1 = r0
        L_0x01a6:
            if (r11 == 0) goto L_0x01b2
            android.view.VelocityTracker r2 = r6.f2962a0
            int r3 = r6.W
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x01b3
        L_0x01b2:
            r2 = r0
        L_0x01b3:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x01bb
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01c3
        L_0x01bb:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.J(r0, r1)
            if (r0 != 0) goto L_0x01c6
        L_0x01c3:
            r6.setScrollState(r8)
        L_0x01c6:
            r17.h0()
            r8 = r9
            goto L_0x01f0
        L_0x01cb:
            int r0 = r7.getPointerId(r8)
            r6.W = r0
            float r0 = r18.getX()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.f2968d0 = r0
            r6.f2964b0 = r0
            float r0 = r18.getY()
            float r0 = r0 + r3
            int r0 = (int) r0
            r6.f2970e0 = r0
            r6.f2966c0 = r0
            if (r11 == 0) goto L_0x01e9
            r10 = r10 | 2
        L_0x01e9:
            w1.m r0 = r17.getScrollingChildHelper()
            r0.g(r10, r8)
        L_0x01f0:
            if (r8 != 0) goto L_0x01f7
            android.view.VelocityTracker r0 = r6.f2962a0
            r0.addMovement(r12)
        L_0x01f7:
            r12.recycle()
            return r9
        L_0x01fb:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        boolean z10;
        boolean z11;
        boolean z12;
        if (!this.C || this.L) {
            int i10 = s1.n.f14600a;
            n.a.a("RV FullInvalidate");
            s();
            n.a.b();
        } else if (this.f2969e.g()) {
            a aVar = this.f2969e;
            int i11 = aVar.f3157f;
            boolean z13 = false;
            if ((4 & i11) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if ((11 & i11) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    int i12 = s1.n.f14600a;
                    n.a.a("RV PartialInvalidate");
                    o0();
                    U();
                    this.f2969e.j();
                    if (!this.E) {
                        int e10 = this.f2971f.e();
                        int i13 = 0;
                        while (true) {
                            if (i13 >= e10) {
                                break;
                            }
                            a0 O2 = O(this.f2971f.d(i13));
                            if (O2 != null && !O2.p()) {
                                if ((O2.f3022j & 2) != 0) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    z13 = true;
                                    break;
                                }
                            }
                            i13++;
                        }
                        if (z13) {
                            s();
                        } else {
                            this.f2969e.b();
                        }
                    }
                    p0(true);
                    V(true);
                    n.a.b();
                    return;
                }
            }
            if (aVar.g()) {
                int i14 = s1.n.f14600a;
                n.a.a("RV FullInvalidate");
                s();
                n.a.b();
            }
        }
    }

    public final void p0(boolean z10) {
        if (this.D < 1) {
            if (!I0) {
                this.D = 1;
            } else {
                throw new IllegalStateException(android.support.v4.media.a.l(this, android.support.v4.media.a.q("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z10 && !this.F) {
            this.E = false;
        }
        if (this.D == 1) {
            if (z10 && this.E && !this.F && this.f2994u != null && this.f2992t != null) {
                s();
            }
            if (!this.F) {
                this.E = false;
            }
        }
        this.D--;
    }

    public final void q(int i10, int i11) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        setMeasuredDimension(m.r(i10, paddingRight, d0.d.e(this)), m.r(i11, getPaddingBottom() + getPaddingTop(), d0.d.d(this)));
    }

    public final void q0(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public final void r(View view) {
        a0 O2 = O(view);
        e eVar = this.f2992t;
        if (!(eVar == null || O2 == null)) {
            eVar.o(O2);
        }
        ArrayList arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((n) this.K.get(size)).a(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void removeDetachedView(View view, boolean z10) {
        a0 O2 = O(view);
        if (O2 != null) {
            if (O2.l()) {
                O2.f3022j &= -257;
            } else if (!O2.p()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(O2);
                throw new IllegalArgumentException(android.support.v4.media.a.l(this, sb2));
            }
        } else if (I0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(android.support.v4.media.a.l(this, sb3));
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z10);
    }

    public final void requestChildFocus(View view, View view2) {
        boolean z10;
        v vVar = this.f2994u.f3050e;
        boolean z11 = true;
        if (vVar == null || !vVar.f3088e) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10 && !Q()) {
            z11 = false;
        }
        if (!z11 && view2 != null) {
            g0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.f2994u.z0(this, view, rect, z10, false);
    }

    public final void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.f3002y.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f3002y.get(i10).c(z10);
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    public final void requestLayout() {
        if (this.D != 0 || this.F) {
            this.E = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0352, code lost:
        if (r15.f2971f.k(getFocusedChild()) == false) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03da, code lost:
        r4 = r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s() {
        /*
            r15 = this;
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f2992t
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2994u
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f2985p0
            r1 = 0
            r0.f3105i = r1
            boolean r0 = r15.E0
            r2 = 1
            if (r0 == 0) goto L_0x0026
            int r0 = r15.F0
            int r3 = r15.getWidth()
            if (r0 != r3) goto L_0x0024
            int r0 = r15.G0
            int r3 = r15.getHeight()
            if (r0 == r3) goto L_0x0026
        L_0x0024:
            r0 = r2
            goto L_0x0027
        L_0x0026:
            r0 = r1
        L_0x0027:
            r15.F0 = r1
            r15.G0 = r1
            r15.E0 = r1
            androidx.recyclerview.widget.RecyclerView$w r3 = r15.f2985p0
            int r3 = r3.f3100d
            if (r3 != r2) goto L_0x003f
            r15.t()
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2994u
            r0.E0(r15)
            r15.u()
            goto L_0x007b
        L_0x003f:
            androidx.recyclerview.widget.a r3 = r15.f2969e
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r4 = r3.f3154c
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0053
            java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r3.f3153b
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0053
            r3 = r2
            goto L_0x0054
        L_0x0053:
            r3 = r1
        L_0x0054:
            if (r3 != 0) goto L_0x0073
            if (r0 != 0) goto L_0x0073
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2994u
            int r0 = r0.f3060v
            int r3 = r15.getWidth()
            if (r0 != r3) goto L_0x0073
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2994u
            int r0 = r0.f3061w
            int r3 = r15.getHeight()
            if (r0 == r3) goto L_0x006d
            goto L_0x0073
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2994u
            r0.E0(r15)
            goto L_0x007b
        L_0x0073:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2994u
            r0.E0(r15)
            r15.u()
        L_0x007b:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f2985p0
            r3 = 4
            r0.a(r3)
            r15.o0()
            r15.U()
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f2985p0
            r0.f3100d = r2
            boolean r0 = r0.f3106j
            r4 = 0
            r5 = -1
            if (r0 == 0) goto L_0x02b6
            androidx.recyclerview.widget.b r0 = r15.f2971f
            int r0 = r0.e()
            int r0 = r0 - r2
        L_0x0098:
            if (r0 < 0) goto L_0x01b9
            androidx.recyclerview.widget.b r6 = r15.f2971f
            android.view.View r6 = r6.d(r0)
            androidx.recyclerview.widget.RecyclerView$a0 r6 = O(r6)
            boolean r7 = r6.p()
            if (r7 == 0) goto L_0x00ac
            goto L_0x01b5
        L_0x00ac:
            long r7 = r15.L(r6)
            androidx.recyclerview.widget.RecyclerView$j r9 = r15.U
            r9.getClass()
            androidx.recyclerview.widget.RecyclerView$j$c r9 = new androidx.recyclerview.widget.RecyclerView$j$c
            r9.<init>()
            r9.a(r6)
            androidx.recyclerview.widget.a0 r10 = r15.f2980n
            v0.e<androidx.recyclerview.widget.RecyclerView$a0> r10 = r10.f3163b
            java.lang.Object r10 = r10.f(r4, r7)
            androidx.recyclerview.widget.RecyclerView$a0 r10 = (androidx.recyclerview.widget.RecyclerView.a0) r10
            if (r10 == 0) goto L_0x01b0
            boolean r11 = r10.p()
            if (r11 != 0) goto L_0x01b0
            androidx.recyclerview.widget.a0 r11 = r15.f2980n
            v0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.a0$a> r11 = r11.f3162a
            java.lang.Object r11 = r11.getOrDefault(r10, r4)
            androidx.recyclerview.widget.a0$a r11 = (androidx.recyclerview.widget.a0.a) r11
            if (r11 == 0) goto L_0x00e2
            int r11 = r11.f3165a
            r11 = r11 & r2
            if (r11 == 0) goto L_0x00e2
            r11 = r2
            goto L_0x00e3
        L_0x00e2:
            r11 = r1
        L_0x00e3:
            androidx.recyclerview.widget.a0 r12 = r15.f2980n
            v0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.a0$a> r12 = r12.f3162a
            java.lang.Object r12 = r12.getOrDefault(r6, r4)
            androidx.recyclerview.widget.a0$a r12 = (androidx.recyclerview.widget.a0.a) r12
            if (r12 == 0) goto L_0x00f6
            int r12 = r12.f3165a
            r12 = r12 & r2
            if (r12 == 0) goto L_0x00f6
            r12 = r2
            goto L_0x00f7
        L_0x00f6:
            r12 = r1
        L_0x00f7:
            if (r11 == 0) goto L_0x0102
            if (r10 != r6) goto L_0x0102
            androidx.recyclerview.widget.a0 r7 = r15.f2980n
            r7.a(r6, r9)
            goto L_0x01b5
        L_0x0102:
            androidx.recyclerview.widget.a0 r13 = r15.f2980n
            androidx.recyclerview.widget.RecyclerView$j$c r13 = r13.c(r10, r3)
            androidx.recyclerview.widget.a0 r14 = r15.f2980n
            r14.a(r6, r9)
            androidx.recyclerview.widget.a0 r9 = r15.f2980n
            r14 = 8
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r9.c(r6, r14)
            if (r13 != 0) goto L_0x0186
            androidx.recyclerview.widget.b r9 = r15.f2971f
            int r9 = r9.e()
            r11 = r1
        L_0x011e:
            if (r11 >= r9) goto L_0x017c
            androidx.recyclerview.widget.b r12 = r15.f2971f
            android.view.View r12 = r12.d(r11)
            androidx.recyclerview.widget.RecyclerView$a0 r12 = O(r12)
            if (r12 != r6) goto L_0x012d
            goto L_0x0179
        L_0x012d:
            long r13 = r15.L(r12)
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r13 != 0) goto L_0x0179
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f2992t
            java.lang.String r1 = " \n View Holder 2:"
            if (r0 == 0) goto L_0x015c
            boolean r0 = r0.f3035b
            if (r0 == 0) goto L_0x015c
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r12)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = android.support.v4.media.a.l(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x015c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"
            r2.append(r3)
            r2.append(r12)
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = android.support.v4.media.a.l(r15, r2)
            r0.<init>(r1)
            throw r0
        L_0x0179:
            int r11 = r11 + 1
            goto L_0x011e
        L_0x017c:
            java.util.Objects.toString(r10)
            java.util.Objects.toString(r6)
            r15.C()
            goto L_0x01b5
        L_0x0186:
            r10.o(r1)
            if (r11 == 0) goto L_0x018e
            r15.h(r10)
        L_0x018e:
            if (r10 == r6) goto L_0x01a4
            if (r12 == 0) goto L_0x0195
            r15.h(r6)
        L_0x0195:
            r10.f3020h = r6
            r15.h(r10)
            androidx.recyclerview.widget.RecyclerView$s r7 = r15.f2965c
            r7.m(r10)
            r6.o(r1)
            r6.f3021i = r10
        L_0x01a4:
            androidx.recyclerview.widget.RecyclerView$j r7 = r15.U
            boolean r6 = r7.b(r10, r6, r13, r9)
            if (r6 == 0) goto L_0x01b5
            r15.Z()
            goto L_0x01b5
        L_0x01b0:
            androidx.recyclerview.widget.a0 r7 = r15.f2980n
            r7.a(r6, r9)
        L_0x01b5:
            int r0 = r0 + -1
            goto L_0x0098
        L_0x01b9:
            androidx.recyclerview.widget.a0 r0 = r15.f2980n
            androidx.recyclerview.widget.RecyclerView$d r3 = r15.H0
            v0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.a0$a> r6 = r0.f3162a
            int r6 = r6.f16007c
            int r6 = r6 + r5
        L_0x01c2:
            if (r6 < 0) goto L_0x02b6
            v0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.a0$a> r7 = r0.f3162a
            java.lang.Object r7 = r7.i(r6)
            androidx.recyclerview.widget.RecyclerView$a0 r7 = (androidx.recyclerview.widget.RecyclerView.a0) r7
            v0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.a0$a> r8 = r0.f3162a
            java.lang.Object r8 = r8.k(r6)
            androidx.recyclerview.widget.a0$a r8 = (androidx.recyclerview.widget.a0.a) r8
            int r9 = r8.f3165a
            r10 = r9 & 3
            r11 = 3
            if (r10 != r11) goto L_0x01e8
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$m r10 = r9.f2994u
            android.view.View r7 = r7.f3013a
            androidx.recyclerview.widget.RecyclerView$s r9 = r9.f2965c
            r10.y0(r7, r9)
            goto L_0x02a7
        L_0x01e8:
            r10 = r9 & 1
            if (r10 == 0) goto L_0x021b
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r8.f3166b
            if (r9 != 0) goto L_0x01fd
            androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$m r10 = r9.f2994u
            android.view.View r7 = r7.f3013a
            androidx.recyclerview.widget.RecyclerView$s r9 = r9.f2965c
            r10.y0(r7, r9)
            goto L_0x02a7
        L_0x01fd:
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r8.f3167c
            androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$s r11 = r11.f2965c
            r11.m(r7)
            androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
            r11.h(r7)
            r7.o(r1)
            androidx.recyclerview.widget.RecyclerView$j r12 = r11.U
            boolean r7 = r12.c(r7, r9, r10)
            if (r7 == 0) goto L_0x02a7
            r11.Z()
            goto L_0x02a7
        L_0x021b:
            r10 = r9 & 14
            r11 = 14
            if (r10 != r11) goto L_0x0239
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r8.f3166b
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r8.f3167c
            androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
            r11.getClass()
            r7.o(r1)
            androidx.recyclerview.widget.RecyclerView$j r12 = r11.U
            boolean r7 = r12.a(r7, r9, r10)
            if (r7 == 0) goto L_0x02a7
            r11.Z()
            goto L_0x02a7
        L_0x0239:
            r10 = r9 & 12
            r11 = 12
            if (r10 != r11) goto L_0x026b
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r8.f3166b
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r8.f3167c
            r3.getClass()
            r7.o(r1)
            androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
            boolean r12 = r11.L
            if (r12 == 0) goto L_0x025d
            androidx.recyclerview.widget.RecyclerView$j r11 = r11.U
            boolean r7 = r11.b(r7, r7, r9, r10)
            if (r7 == 0) goto L_0x02a7
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            r7.Z()
            goto L_0x02a7
        L_0x025d:
            androidx.recyclerview.widget.RecyclerView$j r11 = r11.U
            boolean r7 = r11.d(r7, r9, r10)
            if (r7 == 0) goto L_0x02a7
            androidx.recyclerview.widget.RecyclerView r7 = androidx.recyclerview.widget.RecyclerView.this
            r7.Z()
            goto L_0x02a7
        L_0x026b:
            r10 = r9 & 4
            if (r10 == 0) goto L_0x028c
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r8.f3166b
            androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$s r10 = r10.f2965c
            r10.m(r7)
            androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
            r10.h(r7)
            r7.o(r1)
            androidx.recyclerview.widget.RecyclerView$j r11 = r10.U
            boolean r7 = r11.c(r7, r9, r4)
            if (r7 == 0) goto L_0x02a7
            r10.Z()
            goto L_0x02a7
        L_0x028c:
            r9 = r9 & 8
            if (r9 == 0) goto L_0x02a7
            androidx.recyclerview.widget.RecyclerView$j$c r9 = r8.f3166b
            androidx.recyclerview.widget.RecyclerView$j$c r10 = r8.f3167c
            androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
            r11.getClass()
            r7.o(r1)
            androidx.recyclerview.widget.RecyclerView$j r12 = r11.U
            boolean r7 = r12.a(r7, r9, r10)
            if (r7 == 0) goto L_0x02a7
            r11.Z()
        L_0x02a7:
            r8.f3165a = r1
            r8.f3166b = r4
            r8.f3167c = r4
            a1.e r7 = androidx.recyclerview.widget.a0.a.f3164d
            r7.a(r8)
            int r6 = r6 + -1
            goto L_0x01c2
        L_0x02b6:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2994u
            androidx.recyclerview.widget.RecyclerView$s r3 = r15.f2965c
            r0.x0(r3)
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f2985p0
            int r3 = r0.f3101e
            r0.f3098b = r3
            r15.L = r1
            r15.M = r1
            r0.f3106j = r1
            r0.f3107k = r1
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2994u
            r0.f3051f = r1
            androidx.recyclerview.widget.RecyclerView$s r0 = r15.f2965c
            java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$a0> r0 = r0.f3076b
            if (r0 == 0) goto L_0x02d8
            r0.clear()
        L_0x02d8:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2994u
            boolean r3 = r0.f3057s
            if (r3 == 0) goto L_0x02e7
            r0.f3056r = r1
            r0.f3057s = r1
            androidx.recyclerview.widget.RecyclerView$s r0 = r15.f2965c
            r0.n()
        L_0x02e7:
            androidx.recyclerview.widget.RecyclerView$m r0 = r15.f2994u
            androidx.recyclerview.widget.RecyclerView$w r3 = r15.f2985p0
            r0.p0(r3)
            r15.V(r2)
            r15.p0(r1)
            androidx.recyclerview.widget.a0 r0 = r15.f2980n
            v0.h<androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.a0$a> r3 = r0.f3162a
            r3.clear()
            v0.e<androidx.recyclerview.widget.RecyclerView$a0> r0 = r0.f3163b
            r0.b()
            int[] r0 = r15.f3001x0
            r3 = r0[r1]
            r6 = r0[r2]
            r15.G(r0)
            int[] r0 = r15.f3001x0
            r7 = r0[r1]
            if (r7 != r3) goto L_0x0315
            r0 = r0[r2]
            if (r0 == r6) goto L_0x0314
            goto L_0x0315
        L_0x0314:
            r2 = r1
        L_0x0315:
            if (r2 == 0) goto L_0x031a
            r15.x(r1, r1)
        L_0x031a:
            boolean r0 = r15.f2978l0
            r2 = -1
            if (r0 == 0) goto L_0x0416
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f2992t
            if (r0 == 0) goto L_0x0416
            boolean r0 = r15.hasFocus()
            if (r0 == 0) goto L_0x0416
            int r0 = r15.getDescendantFocusability()
            r6 = 393216(0x60000, float:5.51013E-40)
            if (r0 == r6) goto L_0x0416
            int r0 = r15.getDescendantFocusability()
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r0 != r6) goto L_0x0342
            boolean r0 = r15.isFocused()
            if (r0 == 0) goto L_0x0342
            goto L_0x0416
        L_0x0342:
            boolean r0 = r15.isFocused()
            if (r0 != 0) goto L_0x0356
            android.view.View r0 = r15.getFocusedChild()
            androidx.recyclerview.widget.b r6 = r15.f2971f
            boolean r0 = r6.k(r0)
            if (r0 != 0) goto L_0x0356
            goto L_0x0416
        L_0x0356:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f2985p0
            long r6 = r0.f3109m
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x039a
            androidx.recyclerview.widget.RecyclerView$e r0 = r15.f2992t
            boolean r0 = r0.f3035b
            if (r0 == 0) goto L_0x039a
            if (r0 != 0) goto L_0x0368
            r9 = r4
            goto L_0x0398
        L_0x0368:
            androidx.recyclerview.widget.b r0 = r15.f2971f
            int r0 = r0.h()
            r8 = r1
            r9 = r4
        L_0x0370:
            if (r8 >= r0) goto L_0x0398
            androidx.recyclerview.widget.b r10 = r15.f2971f
            android.view.View r10 = r10.g(r8)
            androidx.recyclerview.widget.RecyclerView$a0 r10 = O(r10)
            if (r10 == 0) goto L_0x0395
            boolean r11 = r10.j()
            if (r11 != 0) goto L_0x0395
            long r11 = r10.f3017e
            int r11 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r11 != 0) goto L_0x0395
            androidx.recyclerview.widget.b r9 = r15.f2971f
            android.view.View r11 = r10.f3013a
            boolean r9 = r9.k(r11)
            if (r9 == 0) goto L_0x039b
            r9 = r10
        L_0x0395:
            int r8 = r8 + 1
            goto L_0x0370
        L_0x0398:
            r10 = r9
            goto L_0x039b
        L_0x039a:
            r10 = r4
        L_0x039b:
            if (r10 == 0) goto L_0x03b3
            androidx.recyclerview.widget.b r0 = r15.f2971f
            android.view.View r6 = r10.f3013a
            boolean r0 = r0.k(r6)
            if (r0 != 0) goto L_0x03b3
            android.view.View r0 = r10.f3013a
            boolean r0 = r0.hasFocusable()
            if (r0 != 0) goto L_0x03b0
            goto L_0x03b3
        L_0x03b0:
            android.view.View r4 = r10.f3013a
            goto L_0x03fb
        L_0x03b3:
            androidx.recyclerview.widget.b r0 = r15.f2971f
            int r0 = r0.e()
            if (r0 <= 0) goto L_0x03fb
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f2985p0
            int r6 = r0.f3108l
            if (r6 == r5) goto L_0x03c2
            r1 = r6
        L_0x03c2:
            int r0 = r0.b()
            r6 = r1
        L_0x03c7:
            if (r6 >= r0) goto L_0x03df
            androidx.recyclerview.widget.RecyclerView$a0 r7 = r15.I(r6)
            if (r7 != 0) goto L_0x03d0
            goto L_0x03df
        L_0x03d0:
            android.view.View r8 = r7.f3013a
            boolean r8 = r8.hasFocusable()
            if (r8 == 0) goto L_0x03dc
            android.view.View r0 = r7.f3013a
        L_0x03da:
            r4 = r0
            goto L_0x03fb
        L_0x03dc:
            int r6 = r6 + 1
            goto L_0x03c7
        L_0x03df:
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 + r5
        L_0x03e4:
            if (r0 < 0) goto L_0x03fb
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r15.I(r0)
            if (r1 != 0) goto L_0x03ed
            goto L_0x03fb
        L_0x03ed:
            android.view.View r6 = r1.f3013a
            boolean r6 = r6.hasFocusable()
            if (r6 == 0) goto L_0x03f8
            android.view.View r0 = r1.f3013a
            goto L_0x03da
        L_0x03f8:
            int r0 = r0 + -1
            goto L_0x03e4
        L_0x03fb:
            if (r4 == 0) goto L_0x0416
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f2985p0
            int r0 = r0.f3110n
            long r6 = (long) r0
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0413
            android.view.View r0 = r4.findViewById(r0)
            if (r0 == 0) goto L_0x0413
            boolean r1 = r0.isFocusable()
            if (r1 == 0) goto L_0x0413
            r4 = r0
        L_0x0413:
            r4.requestFocus()
        L_0x0416:
            androidx.recyclerview.widget.RecyclerView$w r0 = r15.f2985p0
            r0.f3109m = r2
            r0.f3108l = r5
            r0.f3110n = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.s():void");
    }

    public final void scrollBy(int i10, int i11) {
        m mVar = this.f2994u;
        if (mVar != null && !this.F) {
            boolean o10 = mVar.o();
            boolean p10 = this.f2994u.p();
            if (o10 || p10) {
                if (!o10) {
                    i10 = 0;
                }
                if (!p10) {
                    i11 = 0;
                }
                i0(i10, i11, (MotionEvent) null, 0);
            }
        }
    }

    public final void scrollTo(int i10, int i11) {
    }

    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (Q()) {
            if (accessibilityEvent != null) {
                i10 = x1.b.a(accessibilityEvent);
            } else {
                i10 = 0;
            }
            if (i10 != 0) {
                i11 = i10;
            }
            this.H |= i11;
            i11 = 1;
        }
        if (i11 == 0) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(u uVar) {
        this.f2999w0 = uVar;
        d0.o(this, uVar);
    }

    public void setAdapter(e eVar) {
        setLayoutFrozen(false);
        e eVar2 = this.f2992t;
        if (eVar2 != null) {
            eVar2.s(this.f2963b);
            this.f2992t.l(this);
        }
        f0();
        a aVar = this.f2969e;
        aVar.l(aVar.f3153b);
        aVar.l(aVar.f3154c);
        aVar.f3157f = 0;
        e eVar3 = this.f2992t;
        this.f2992t = eVar;
        if (eVar != null) {
            eVar.q(this.f2963b);
            eVar.h(this);
        }
        m mVar = this.f2994u;
        if (mVar != null) {
            mVar.a0();
        }
        s sVar = this.f2965c;
        e eVar4 = this.f2992t;
        sVar.f3075a.clear();
        sVar.g();
        sVar.f(eVar3, true);
        r c10 = sVar.c();
        if (eVar3 != null) {
            c10.f3069b--;
        }
        if (c10.f3069b == 0) {
            for (int i10 = 0; i10 < c10.f3068a.size(); i10++) {
                r.a valueAt = c10.f3068a.valueAt(i10);
                Iterator<a0> it = valueAt.f3071a.iterator();
                while (it.hasNext()) {
                    b2.a.a(it.next().f3013a);
                }
                valueAt.f3071a.clear();
            }
        }
        if (eVar4 != null) {
            c10.f3069b++;
        }
        sVar.e();
        this.f2985p0.f3102f = true;
        b0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(h hVar) {
        boolean z10;
        if (hVar != null) {
            if (hVar != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            setChildrenDrawingOrderEnabled(z10);
        }
    }

    public void setClipToPadding(boolean z10) {
        if (z10 != this.f2982o) {
            this.T = null;
            this.R = null;
            this.S = null;
            this.Q = null;
        }
        this.f2982o = z10;
        super.setClipToPadding(z10);
        if (this.C) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(i iVar) {
        iVar.getClass();
        this.P = iVar;
        this.T = null;
        this.R = null;
        this.S = null;
        this.Q = null;
    }

    public void setHasFixedSize(boolean z10) {
        this.B = z10;
    }

    public void setItemAnimator(j jVar) {
        j jVar2 = this.U;
        if (jVar2 != null) {
            jVar2.k();
            this.U.f3037a = null;
        }
        this.U = jVar;
        if (jVar != null) {
            jVar.f3037a = this.f2995u0;
        }
    }

    public void setItemViewCacheSize(int i10) {
        s sVar = this.f2965c;
        sVar.f3079e = i10;
        sVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(m mVar) {
        v vVar;
        if (mVar != this.f2994u) {
            setScrollState(0);
            z zVar = this.f2979m0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f3113c.abortAnimation();
            m mVar2 = this.f2994u;
            if (!(mVar2 == null || (vVar = mVar2.f3050e) == null)) {
                vVar.g();
            }
            if (this.f2994u != null) {
                j jVar = this.U;
                if (jVar != null) {
                    jVar.k();
                }
                this.f2994u.w0(this.f2965c);
                this.f2994u.x0(this.f2965c);
                s sVar = this.f2965c;
                sVar.f3075a.clear();
                sVar.g();
                if (this.A) {
                    m mVar3 = this.f2994u;
                    mVar3.f3052n = false;
                    mVar3.c0(this);
                }
                this.f2994u.I0((RecyclerView) null);
                this.f2994u = null;
            } else {
                s sVar2 = this.f2965c;
                sVar2.f3075a.clear();
                sVar2.g();
            }
            b bVar = this.f2971f;
            bVar.f3169b.g();
            int size = bVar.f3170c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                s sVar3 = (s) bVar.f3168a;
                sVar3.getClass();
                a0 O2 = O((View) bVar.f3170c.get(size));
                if (O2 != null) {
                    RecyclerView recyclerView = sVar3.f3296a;
                    int i10 = O2.f3028p;
                    if (recyclerView.Q()) {
                        O2.f3029q = i10;
                        recyclerView.C0.add(O2);
                    } else {
                        View view = O2.f3013a;
                        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                        d0.d.s(view, i10);
                    }
                    O2.f3028p = 0;
                }
                bVar.f3170c.remove(size);
            }
            s sVar4 = (s) bVar.f3168a;
            int a10 = sVar4.a();
            for (int i11 = 0; i11 < a10; i11++) {
                View childAt = sVar4.f3296a.getChildAt(i11);
                sVar4.f3296a.r(childAt);
                childAt.clearAnimation();
            }
            sVar4.f3296a.removeAllViews();
            this.f2994u = mVar;
            if (mVar != null) {
                if (mVar.f3047b == null) {
                    mVar.I0(this);
                    if (this.A) {
                        m mVar4 = this.f2994u;
                        mVar4.f3052n = true;
                        mVar4.b0(this);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("LayoutManager ");
                    sb2.append(mVar);
                    sb2.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(android.support.v4.media.a.l(mVar.f3047b, sb2));
                }
            }
            this.f2965c.n();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z10) {
        w1.m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f16339d) {
            View view = scrollingChildHelper.f16338c;
            WeakHashMap<View, q0> weakHashMap = d0.f16298a;
            d0.i.z(view);
        }
        scrollingChildHelper.f16339d = z10;
    }

    public void setOnFlingListener(o oVar) {
        this.f2973g0 = oVar;
    }

    @Deprecated
    public void setOnScrollListener(q qVar) {
        this.f2987q0 = qVar;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.f2978l0 = z10;
    }

    public void setRecycledViewPool(r rVar) {
        s sVar = this.f2965c;
        sVar.f(RecyclerView.this.f2992t, false);
        r rVar2 = sVar.f3081g;
        if (rVar2 != null) {
            rVar2.f3069b--;
        }
        sVar.f3081g = rVar;
        if (!(rVar == null || RecyclerView.this.getAdapter() == null)) {
            sVar.f3081g.f3069b++;
        }
        sVar.e();
    }

    @Deprecated
    public void setRecyclerListener(t tVar) {
        this.f2996v = tVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i10) {
        v vVar;
        if (i10 != this.V) {
            if (J0) {
                new Exception();
            }
            this.V = i10;
            if (i10 != 2) {
                z zVar = this.f2979m0;
                RecyclerView.this.removeCallbacks(zVar);
                zVar.f3113c.abortAnimation();
                m mVar = this.f2994u;
                if (!(mVar == null || (vVar = mVar.f3050e) == null)) {
                    vVar.g();
                }
            }
            m mVar2 = this.f2994u;
            if (mVar2 != null) {
                mVar2.t0(i10);
            }
            X(i10);
            q qVar = this.f2987q0;
            if (qVar != null) {
                qVar.a(i10, this);
            }
            ArrayList arrayList = this.f2989r0;
            if (arrayList != null) {
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        ((q) this.f2989r0.get(size)).a(i10, this);
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 == 0 || i10 != 1) {
            this.f2972f0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.f2972f0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(y yVar) {
        this.f2965c.getClass();
    }

    public final boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public final void suppressLayout(boolean z10) {
        v vVar;
        if (z10 != this.F) {
            k("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.F = false;
                if (!(!this.E || this.f2994u == null || this.f2992t == null)) {
                    requestLayout();
                }
                this.E = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.F = true;
            this.G = true;
            setScrollState(0);
            z zVar = this.f2979m0;
            RecyclerView.this.removeCallbacks(zVar);
            zVar.f3113c.abortAnimation();
            m mVar = this.f2994u;
            if (mVar != null && (vVar = mVar.f3050e) != null) {
                vVar.g();
            }
        }
    }

    public final void t() {
        View view;
        a0 a0Var;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i10;
        View E2;
        this.f2985p0.a(1);
        D(this.f2985p0);
        this.f2985p0.f3105i = false;
        o0();
        a0 a0Var2 = this.f2980n;
        a0Var2.f3162a.clear();
        a0Var2.f3163b.b();
        U();
        a0();
        if (!this.f2978l0 || !hasFocus() || this.f2992t == null) {
            view = null;
        } else {
            view = getFocusedChild();
        }
        if (view == null || (E2 = E(view)) == null) {
            a0Var = null;
        } else {
            a0Var = N(E2);
        }
        long j10 = -1;
        if (a0Var == null) {
            w wVar = this.f2985p0;
            wVar.f3109m = -1;
            wVar.f3108l = -1;
            wVar.f3110n = -1;
        } else {
            w wVar2 = this.f2985p0;
            if (this.f2992t.f3035b) {
                j10 = a0Var.f3017e;
            }
            wVar2.f3109m = j10;
            if (this.L) {
                i10 = -1;
            } else if (a0Var.j()) {
                i10 = a0Var.f3016d;
            } else {
                i10 = a0Var.c();
            }
            wVar2.f3108l = i10;
            w wVar3 = this.f2985p0;
            View view2 = a0Var.f3013a;
            int id2 = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id2 = view2.getId();
                }
            }
            wVar3.f3110n = id2;
        }
        w wVar4 = this.f2985p0;
        if (!wVar4.f3106j || !this.f2993t0) {
            z10 = false;
        } else {
            z10 = true;
        }
        wVar4.f3104h = z10;
        this.f2993t0 = false;
        this.f2991s0 = false;
        wVar4.f3103g = wVar4.f3107k;
        wVar4.f3101e = this.f2992t.c();
        G(this.f3001x0);
        if (this.f2985p0.f3106j) {
            int e10 = this.f2971f.e();
            for (int i11 = 0; i11 < e10; i11++) {
                a0 O2 = O(this.f2971f.d(i11));
                if (!O2.p() && (!O2.h() || this.f2992t.f3035b)) {
                    j jVar = this.U;
                    j.e(O2);
                    O2.e();
                    jVar.getClass();
                    j.c cVar = new j.c();
                    cVar.a(O2);
                    this.f2980n.b(O2, cVar);
                    if (this.f2985p0.f3104h) {
                        if ((O2.f3022j & 2) != 0) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (z13 && !O2.j() && !O2.p() && !O2.h()) {
                            this.f2980n.f3163b.j(O2, L(O2));
                        }
                    }
                }
            }
        }
        if (this.f2985p0.f3107k) {
            int h10 = this.f2971f.h();
            int i12 = 0;
            while (i12 < h10) {
                a0 O3 = O(this.f2971f.g(i12));
                if (!I0 || O3.f3015c != -1 || O3.j()) {
                    if (!O3.p() && O3.f3016d == -1) {
                        O3.f3016d = O3.f3015c;
                    }
                    i12++;
                } else {
                    throw new IllegalStateException(android.support.v4.media.a.l(this, android.support.v4.media.a.q("view holder cannot have position -1 unless it is removed")));
                }
            }
            w wVar5 = this.f2985p0;
            boolean z14 = wVar5.f3102f;
            wVar5.f3102f = false;
            this.f2994u.o0(this.f2965c, wVar5);
            this.f2985p0.f3102f = z14;
            for (int i13 = 0; i13 < this.f2971f.e(); i13++) {
                a0 O4 = O(this.f2971f.d(i13));
                if (!O4.p()) {
                    a0.a orDefault = this.f2980n.f3162a.getOrDefault(O4, null);
                    if (orDefault == null || (orDefault.f3165a & 4) == 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        j.e(O4);
                        if ((O4.f3022j & 8192) != 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        j jVar2 = this.U;
                        O4.e();
                        jVar2.getClass();
                        j.c cVar2 = new j.c();
                        cVar2.a(O4);
                        if (z12) {
                            c0(O4, cVar2);
                        } else {
                            a0 a0Var3 = this.f2980n;
                            a0.a orDefault2 = a0Var3.f3162a.getOrDefault(O4, null);
                            if (orDefault2 == null) {
                                orDefault2 = a0.a.a();
                                a0Var3.f3162a.put(O4, orDefault2);
                            }
                            orDefault2.f3165a |= 2;
                            orDefault2.f3166b = cVar2;
                        }
                    }
                }
            }
            m();
        } else {
            m();
        }
        V(true);
        p0(false);
        this.f2985p0.f3100d = 2;
    }

    public final void u() {
        boolean z10;
        boolean z11;
        o0();
        U();
        this.f2985p0.a(6);
        this.f2969e.c();
        this.f2985p0.f3101e = this.f2992t.c();
        this.f2985p0.f3099c = 0;
        if (this.f2967d != null) {
            e eVar = this.f2992t;
            int g2 = v.v.g(eVar.f3036c);
            if (g2 == 1 ? eVar.c() <= 0 : g2 == 2) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                Parcelable parcelable = this.f2967d.f3010c;
                if (parcelable != null) {
                    this.f2994u.r0(parcelable);
                }
                this.f2967d = null;
            }
        }
        w wVar = this.f2985p0;
        wVar.f3103g = false;
        this.f2994u.o0(this.f2965c, wVar);
        w wVar2 = this.f2985p0;
        wVar2.f3102f = false;
        if (!wVar2.f3106j || this.U == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        wVar2.f3106j = z10;
        wVar2.f3100d = 4;
        V(true);
        p0(false);
    }

    public final boolean v(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, i12, iArr, iArr2);
    }

    public final void w(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public final void x(int i10, int i11) {
        this.O++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        Y(i11);
        q qVar = this.f2987q0;
        if (qVar != null) {
            qVar.b(this, i10, i11);
        }
        ArrayList arrayList = this.f2989r0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((q) this.f2989r0.get(size)).b(this, i10, i11);
            }
        }
        this.O--;
    }

    public final void y() {
        if (this.T == null) {
            ((x) this.P).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.T = edgeEffect;
            if (this.f2982o) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public final void z() {
        if (this.Q == null) {
            ((x) this.P).getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.Q = edgeEffect;
            if (this.f2982o) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R$attr.recyclerViewStyle);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public Parcelable f3010c;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i10) {
                return new SavedState[i10];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3010c = parcel.readParcelable(classLoader == null ? m.class.getClassLoader() : classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeParcelable(this.f2188a, i10);
            parcel.writeParcelable(this.f3010c, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        float f10;
        float f11;
        TypedArray typedArray;
        char c10;
        ClassLoader classLoader;
        Object[] objArr;
        Constructor<? extends U> constructor;
        NoSuchMethodException noSuchMethodException;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i11 = i10;
        this.f2963b = new u();
        this.f2965c = new s();
        this.f2980n = new a0();
        this.f2984p = new a();
        this.f2986q = new Rect();
        this.f2988r = new Rect();
        this.f2990s = new RectF();
        this.f2998w = new ArrayList();
        this.f3000x = new ArrayList<>();
        this.f3002y = new ArrayList<>();
        this.D = 0;
        this.L = false;
        this.M = false;
        this.N = 0;
        this.O = 0;
        this.P = R0;
        this.U = new c();
        this.V = 0;
        this.W = -1;
        this.f2976j0 = Float.MIN_VALUE;
        this.f2977k0 = Float.MIN_VALUE;
        this.f2978l0 = true;
        this.f2979m0 = new z();
        this.f2983o0 = O0 ? new j.b() : null;
        this.f2985p0 = new w();
        this.f2991s0 = false;
        this.f2993t0 = false;
        this.f2995u0 = new k();
        this.f2997v0 = false;
        this.f3001x0 = new int[2];
        this.f3005z0 = new int[2];
        this.A0 = new int[2];
        this.B0 = new int[2];
        this.C0 = new ArrayList();
        this.D0 = new b();
        this.F0 = 0;
        this.G0 = 0;
        this.H0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f2972f0 = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = h0.f16322a;
            f10 = h0.a.a(viewConfiguration);
        } else {
            f10 = h0.a(viewConfiguration, context2);
        }
        this.f2976j0 = f10;
        if (i12 >= 26) {
            f11 = h0.a.b(viewConfiguration);
        } else {
            f11 = h0.a(viewConfiguration, context2);
        }
        this.f2977k0 = f11;
        this.f2974h0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f2975i0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f2961a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.U.f3037a = this.f2995u0;
        this.f2969e = new a(new t(this));
        this.f2971f = new b(new s(this));
        WeakHashMap<View, q0> weakHashMap = d0.f16298a;
        if ((i12 >= 26 ? d0.l.c(this) : 0) == 0 && i12 >= 26) {
            d0.l.m(this, 8);
        }
        if (d0.d.c(this) == 0) {
            d0.d.s(this, 1);
        }
        this.J = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new u(this));
        int[] iArr = R$styleable.RecyclerView;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i11, 0);
        d0.n(this, context, iArr, attributeSet, obtainStyledAttributes, i10);
        String string = obtainStyledAttributes.getString(R$styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(R$styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f2982o = obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_android_clipToPadding, true);
        if (obtainStyledAttributes.getBoolean(R$styleable.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(R$styleable.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(android.support.v4.media.a.l(this, android.support.v4.media.a.q("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            typedArray = obtainStyledAttributes;
            c10 = 2;
            new i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R$dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R$dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R$dimen.fastscroll_margin));
        } else {
            typedArray = obtainStyledAttributes;
            c10 = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(m.class);
                    try {
                        constructor = asSubclass.getConstructor(P0);
                        objArr = new Object[4];
                        objArr[0] = context2;
                        objArr[1] = attributeSet2;
                        objArr[c10] = Integer.valueOf(i10);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e10) {
                        noSuchMethodException = e10;
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((m) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e11) {
                    e11.initCause(noSuchMethodException);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e12);
                } catch (InvocationTargetException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                } catch (IllegalAccessException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e15);
                } catch (ClassCastException e16) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e16);
                }
            }
        }
        int[] iArr2 = K0;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i11, 0);
        d0.n(this, context, iArr2, attributeSet, obtainStyledAttributes2, i10);
        boolean z10 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z10);
        setTag(b2.a.f3984b, Boolean.TRUE);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public a0 f3006a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f3007b = new Rect();

        /* renamed from: c  reason: collision with root package name */
        public boolean f3008c = true;

        /* renamed from: d  reason: collision with root package name */
        public boolean f3009d = false;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int a() {
            return this.f3006a.d();
        }

        public final boolean d() {
            if ((this.f3006a.f3022j & 2) != 0) {
                return true;
            }
            return false;
        }

        public final boolean e() {
            return this.f3006a.j();
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        m mVar = this.f2994u;
        if (mVar != null) {
            return mVar.E(layoutParams);
        }
        throw new IllegalStateException(android.support.v4.media.a.l(this, android.support.v4.media.a.q("RecyclerView has no LayoutManager")));
    }
}
