package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import v0.e;
import v0.h;

/* compiled from: ViewInfoStore */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final h<RecyclerView.a0, a> f3162a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final e<RecyclerView.a0> f3163b = new e<>();

    /* compiled from: ViewInfoStore */
    public static class a {

        /* renamed from: d  reason: collision with root package name */
        public static a1.e f3164d = new a1.e(20, 1);

        /* renamed from: a  reason: collision with root package name */
        public int f3165a;

        /* renamed from: b  reason: collision with root package name */
        public RecyclerView.j.c f3166b;

        /* renamed from: c  reason: collision with root package name */
        public RecyclerView.j.c f3167c;

        public static a a() {
            a aVar = (a) f3164d.b();
            if (aVar == null) {
                return new a();
            }
            return aVar;
        }
    }

    public final void a(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.f3162a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3162a.put(a0Var, orDefault);
        }
        orDefault.f3167c = cVar;
        orDefault.f3165a |= 8;
    }

    public final void b(RecyclerView.a0 a0Var, RecyclerView.j.c cVar) {
        a orDefault = this.f3162a.getOrDefault(a0Var, null);
        if (orDefault == null) {
            orDefault = a.a();
            this.f3162a.put(a0Var, orDefault);
        }
        orDefault.f3166b = cVar;
        orDefault.f3165a |= 4;
    }

    public final RecyclerView.j.c c(RecyclerView.a0 a0Var, int i10) {
        a m10;
        RecyclerView.j.c cVar;
        int f10 = this.f3162a.f(a0Var);
        if (f10 >= 0 && (m10 = this.f3162a.m(f10)) != null) {
            int i11 = m10.f3165a;
            if ((i11 & i10) != 0) {
                int i12 = i11 & (~i10);
                m10.f3165a = i12;
                if (i10 == 4) {
                    cVar = m10.f3166b;
                } else if (i10 == 8) {
                    cVar = m10.f3167c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i12 & 12) == 0) {
                    this.f3162a.k(f10);
                    m10.f3165a = 0;
                    m10.f3166b = null;
                    m10.f3167c = null;
                    a.f3164d.a(m10);
                }
                return cVar;
            }
        }
        return null;
    }

    public final void d(RecyclerView.a0 a0Var) {
        a orDefault = this.f3162a.getOrDefault(a0Var, null);
        if (orDefault != null) {
            orDefault.f3165a &= -2;
        }
    }

    public final void e(RecyclerView.a0 a0Var) {
        int l10 = this.f3163b.l() - 1;
        while (true) {
            if (l10 < 0) {
                break;
            } else if (a0Var == this.f3163b.m(l10)) {
                e<RecyclerView.a0> eVar = this.f3163b;
                Object[] objArr = eVar.f15984c;
                Object obj = objArr[l10];
                Object obj2 = e.f15981e;
                if (obj != obj2) {
                    objArr[l10] = obj2;
                    eVar.f15982a = true;
                }
            } else {
                l10--;
            }
        }
        a remove = this.f3162a.remove(a0Var);
        if (remove != null) {
            remove.f3165a = 0;
            remove.f3166b = null;
            remove.f3167c = null;
            a.f3164d.a(remove);
        }
    }
}
