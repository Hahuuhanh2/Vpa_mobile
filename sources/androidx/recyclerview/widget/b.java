package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import w1.d0;
import w1.q0;

/* compiled from: ChildHelper */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final C0029b f3168a;

    /* renamed from: b  reason: collision with root package name */
    public final a f3169b = new a();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f3170c = new ArrayList();

    /* compiled from: ChildHelper */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public long f3171a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f3172b;

        public final void a(int i10) {
            if (i10 >= 64) {
                a aVar = this.f3172b;
                if (aVar != null) {
                    aVar.a(i10 - 64);
                    return;
                }
                return;
            }
            this.f3171a &= ~(1 << i10);
        }

        public final int b(int i10) {
            a aVar = this.f3172b;
            if (aVar == null) {
                if (i10 >= 64) {
                    return Long.bitCount(this.f3171a);
                }
                return Long.bitCount(this.f3171a & ((1 << i10) - 1));
            } else if (i10 < 64) {
                return Long.bitCount(this.f3171a & ((1 << i10) - 1));
            } else {
                return Long.bitCount(this.f3171a) + aVar.b(i10 - 64);
            }
        }

        public final void c() {
            if (this.f3172b == null) {
                this.f3172b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 >= 64) {
                c();
                return this.f3172b.d(i10 - 64);
            } else if ((this.f3171a & (1 << i10)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        public final void e(int i10, boolean z10) {
            boolean z11;
            if (i10 >= 64) {
                c();
                this.f3172b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f3171a;
            if ((Long.MIN_VALUE & j10) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            long j11 = (1 << i10) - 1;
            this.f3171a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f3172b != null) {
                c();
                this.f3172b.e(0, z11);
            }
        }

        public final boolean f(int i10) {
            boolean z10;
            if (i10 >= 64) {
                c();
                return this.f3172b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f3171a;
            if ((j11 & j10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            long j12 = j11 & (~j10);
            this.f3171a = j12;
            long j13 = j10 - 1;
            this.f3171a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f3172b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f3172b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f3171a = 0;
            a aVar = this.f3172b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 >= 64) {
                c();
                this.f3172b.h(i10 - 64);
                return;
            }
            this.f3171a |= 1 << i10;
        }

        public final String toString() {
            if (this.f3172b == null) {
                return Long.toBinaryString(this.f3171a);
            }
            return this.f3172b.toString() + "xx" + Long.toBinaryString(this.f3171a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b  reason: collision with other inner class name */
    /* compiled from: ChildHelper */
    public interface C0029b {
    }

    public b(s sVar) {
        this.f3168a = sVar;
    }

    public final void a(View view, int i10, boolean z10) {
        int i11;
        if (i10 < 0) {
            i11 = ((s) this.f3168a).a();
        } else {
            i11 = f(i10);
        }
        this.f3169b.e(i11, z10);
        if (z10) {
            i(view);
        }
        s sVar = (s) this.f3168a;
        sVar.f3296a.addView(view, i11);
        RecyclerView recyclerView = sVar.f3296a;
        recyclerView.getClass();
        RecyclerView.a0 O = RecyclerView.O(view);
        RecyclerView.e eVar = recyclerView.f2992t;
        if (!(eVar == null || O == null)) {
            eVar.n(O);
        }
        ArrayList arrayList = recyclerView.K;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.n) recyclerView.K.get(size)).b(view);
                } else {
                    return;
                }
            }
        }
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int i11;
        if (i10 < 0) {
            i11 = ((s) this.f3168a).a();
        } else {
            i11 = f(i10);
        }
        this.f3169b.e(i11, z10);
        if (z10) {
            i(view);
        }
        s sVar = (s) this.f3168a;
        sVar.getClass();
        RecyclerView.a0 O = RecyclerView.O(view);
        if (O != null) {
            if (O.l() || O.p()) {
                if (RecyclerView.J0) {
                    O.toString();
                }
                O.f3022j &= -257;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Called attach on a child which is not detached: ");
                sb2.append(O);
                throw new IllegalArgumentException(android.support.v4.media.a.l(sVar.f3296a, sb2));
            }
        } else if (RecyclerView.I0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No ViewHolder found for child: ");
            sb3.append(view);
            sb3.append(", index: ");
            sb3.append(i11);
            throw new IllegalArgumentException(android.support.v4.media.a.l(sVar.f3296a, sb3));
        }
        sVar.f3296a.attachViewToParent(view, i11, layoutParams);
    }

    public final void c(int i10) {
        int f10 = f(i10);
        this.f3169b.f(f10);
        s sVar = (s) this.f3168a;
        View childAt = sVar.f3296a.getChildAt(f10);
        if (childAt != null) {
            RecyclerView.a0 O = RecyclerView.O(childAt);
            if (O != null) {
                if (!O.l() || O.p()) {
                    if (RecyclerView.J0) {
                        O.toString();
                    }
                    O.b(256);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("called detach on an already detached child ");
                    sb2.append(O);
                    throw new IllegalArgumentException(android.support.v4.media.a.l(sVar.f3296a, sb2));
                }
            }
        } else if (RecyclerView.I0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No view at offset ");
            sb3.append(f10);
            throw new IllegalArgumentException(android.support.v4.media.a.l(sVar.f3296a, sb3));
        }
        sVar.f3296a.detachViewFromParent(f10);
    }

    public final View d(int i10) {
        return ((s) this.f3168a).f3296a.getChildAt(f(i10));
    }

    public final int e() {
        return ((s) this.f3168a).a() - this.f3170c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int a10 = ((s) this.f3168a).a();
        int i11 = i10;
        while (i11 < a10) {
            int b10 = i10 - (i11 - this.f3169b.b(i11));
            if (b10 == 0) {
                while (this.f3169b.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public final View g(int i10) {
        return ((s) this.f3168a).f3296a.getChildAt(i10);
    }

    public final int h() {
        return ((s) this.f3168a).a();
    }

    public final void i(View view) {
        this.f3170c.add(view);
        s sVar = (s) this.f3168a;
        sVar.getClass();
        RecyclerView.a0 O = RecyclerView.O(view);
        if (O != null) {
            RecyclerView recyclerView = sVar.f3296a;
            int i10 = O.f3029q;
            if (i10 != -1) {
                O.f3028p = i10;
            } else {
                View view2 = O.f3013a;
                WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                O.f3028p = d0.d.c(view2);
            }
            if (recyclerView.Q()) {
                O.f3029q = 4;
                recyclerView.C0.add(O);
                return;
            }
            View view3 = O.f3013a;
            WeakHashMap<View, q0> weakHashMap2 = d0.f16298a;
            d0.d.s(view3, 4);
        }
    }

    public final int j(View view) {
        int indexOfChild = ((s) this.f3168a).f3296a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f3169b.d(indexOfChild)) {
            return indexOfChild - this.f3169b.b(indexOfChild);
        }
        return -1;
    }

    public final boolean k(View view) {
        return this.f3170c.contains(view);
    }

    public final void l(int i10) {
        int f10 = f(i10);
        View childAt = ((s) this.f3168a).f3296a.getChildAt(f10);
        if (childAt != null) {
            if (this.f3169b.f(f10)) {
                m(childAt);
            }
            ((s) this.f3168a).b(f10);
        }
    }

    public final void m(View view) {
        if (this.f3170c.remove(view)) {
            s sVar = (s) this.f3168a;
            sVar.getClass();
            RecyclerView.a0 O = RecyclerView.O(view);
            if (O != null) {
                RecyclerView recyclerView = sVar.f3296a;
                int i10 = O.f3028p;
                if (recyclerView.Q()) {
                    O.f3029q = i10;
                    recyclerView.C0.add(O);
                } else {
                    View view2 = O.f3013a;
                    WeakHashMap<View, q0> weakHashMap = d0.f16298a;
                    d0.d.s(view2, i10);
                }
                O.f3028p = 0;
            }
        }
    }

    public final String toString() {
        return this.f3169b.toString() + ", hidden list:" + this.f3170c.size();
    }
}
