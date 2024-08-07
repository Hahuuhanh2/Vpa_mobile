package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Looper;
import androidx.lifecycle.i;
import dl.z;
import f0.b0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.b;
import r2.c;
import r2.k;
import r2.l;
import r2.n;
import sk.j;

/* compiled from: LifecycleRegistry.kt */
public final class o extends i {

    /* renamed from: b  reason: collision with root package name */
    public final boolean f2783b = true;

    /* renamed from: c  reason: collision with root package name */
    public o.a<k, a> f2784c = new o.a<>();

    /* renamed from: d  reason: collision with root package name */
    public i.b f2785d;

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<l> f2786e;

    /* renamed from: f  reason: collision with root package name */
    public int f2787f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2788g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2789h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList<i.b> f2790i;

    /* renamed from: j  reason: collision with root package name */
    public final z f2791j;

    /* compiled from: LifecycleRegistry.kt */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public i.b f2792a;

        /* renamed from: b  reason: collision with root package name */
        public n f2793b;

        public a(k kVar, i.b bVar) {
            n nVar;
            j.c(kVar);
            HashMap hashMap = n.f14482a;
            boolean z10 = kVar instanceof n;
            boolean z11 = kVar instanceof c;
            if (z10 && z11) {
                nVar = new d((c) kVar, (n) kVar);
            } else if (z11) {
                nVar = new d((c) kVar, (n) null);
            } else if (z10) {
                nVar = (n) kVar;
            } else {
                Class<?> cls = kVar.getClass();
                if (n.c(cls) == 2) {
                    Object obj = n.f14483b.get(cls);
                    j.c(obj);
                    List list = (List) obj;
                    if (list.size() == 1) {
                        nVar = new c0(n.a((Constructor) list.get(0), kVar));
                    } else {
                        int size = list.size();
                        e[] eVarArr = new e[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            HashMap hashMap2 = n.f14482a;
                            eVarArr[i10] = n.a((Constructor) list.get(i10), kVar);
                        }
                        nVar = new c(eVarArr);
                    }
                } else {
                    nVar = new u(kVar);
                }
            }
            this.f2793b = nVar;
            this.f2792a = bVar;
        }

        public final void a(l lVar, i.a aVar) {
            i.b b10 = aVar.b();
            i.b bVar = this.f2792a;
            j.f(bVar, "state1");
            if (b10.compareTo(bVar) < 0) {
                bVar = b10;
            }
            this.f2792a = bVar;
            this.f2793b.q(lVar, aVar);
            this.f2792a = b10;
        }
    }

    public o(l lVar) {
        j.f(lVar, "provider");
        i.b bVar = i.b.INITIALIZED;
        this.f2785d = bVar;
        this.f2790i = new ArrayList<>();
        this.f2786e = new WeakReference<>(lVar);
        this.f2791j = new z(bVar);
    }

    public final void a(k kVar) {
        l lVar;
        boolean z10;
        j.f(kVar, "observer");
        e("addObserver");
        i.b bVar = this.f2785d;
        i.b bVar2 = i.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = i.b.INITIALIZED;
        }
        a aVar = new a(kVar, bVar2);
        if (this.f2784c.i(kVar, aVar) == null && (lVar = this.f2786e.get()) != null) {
            if (this.f2787f != 0 || this.f2788g) {
                z10 = true;
            } else {
                z10 = false;
            }
            i.b d10 = d(kVar);
            this.f2787f++;
            while (aVar.f2792a.compareTo(d10) < 0 && this.f2784c.f13599e.containsKey(kVar)) {
                this.f2790i.add(aVar.f2792a);
                i.a.C0026a aVar2 = i.a.Companion;
                i.b bVar3 = aVar.f2792a;
                aVar2.getClass();
                i.a a10 = i.a.C0026a.a(bVar3);
                if (a10 != null) {
                    aVar.a(lVar, a10);
                    ArrayList<i.b> arrayList = this.f2790i;
                    arrayList.remove(arrayList.size() - 1);
                    d10 = d(kVar);
                } else {
                    StringBuilder q10 = android.support.v4.media.a.q("no event up from ");
                    q10.append(aVar.f2792a);
                    throw new IllegalStateException(q10.toString());
                }
            }
            if (!z10) {
                i();
            }
            this.f2787f--;
        }
    }

    public final i.b b() {
        return this.f2785d;
    }

    public final void c(k kVar) {
        j.f(kVar, "observer");
        e("removeObserver");
        this.f2784c.l(kVar);
    }

    public final i.b d(k kVar) {
        b.c<K, V> cVar;
        i.b bVar;
        a aVar;
        o.a<k, a> aVar2 = this.f2784c;
        i.b bVar2 = null;
        if (aVar2.f13599e.containsKey(kVar)) {
            cVar = aVar2.f13599e.get(kVar).f13607d;
        } else {
            cVar = null;
        }
        if (cVar == null || (aVar = (a) cVar.f13605b) == null) {
            bVar = null;
        } else {
            bVar = aVar.f2792a;
        }
        if (!this.f2790i.isEmpty()) {
            ArrayList<i.b> arrayList = this.f2790i;
            bVar2 = arrayList.get(arrayList.size() - 1);
        }
        i.b bVar3 = this.f2785d;
        j.f(bVar3, "state1");
        if (bVar == null || bVar.compareTo(bVar3) >= 0) {
            bVar = bVar3;
        }
        if (bVar2 == null || bVar2.compareTo(bVar) >= 0) {
            return bVar;
        }
        return bVar2;
    }

    @SuppressLint({"RestrictedApi"})
    public final void e(String str) {
        boolean z10;
        if (this.f2783b) {
            n.c.J().f13298b.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalStateException(b0.s("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void f(i.a aVar) {
        j.f(aVar, "event");
        e("handleLifecycleEvent");
        g(aVar.b());
    }

    public final void g(i.b bVar) {
        boolean z10;
        i.b bVar2 = i.b.DESTROYED;
        i.b bVar3 = this.f2785d;
        if (bVar3 != bVar) {
            if (bVar3 == i.b.INITIALIZED && bVar == bVar2) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                this.f2785d = bVar;
                if (this.f2788g || this.f2787f != 0) {
                    this.f2789h = true;
                    return;
                }
                this.f2788g = true;
                i();
                this.f2788g = false;
                if (this.f2785d == bVar2) {
                    this.f2784c = new o.a<>();
                    return;
                }
                return;
            }
            StringBuilder q10 = android.support.v4.media.a.q("no event down from ");
            q10.append(this.f2785d);
            q10.append(" in component ");
            q10.append(this.f2786e.get());
            throw new IllegalStateException(q10.toString().toString());
        }
    }

    public final void h() {
        i.b bVar = i.b.CREATED;
        e("setCurrentState");
        g(bVar);
    }

    public final void i() {
        i.a aVar;
        l lVar = this.f2786e.get();
        if (lVar != null) {
            while (true) {
                o.a<k, a> aVar2 = this.f2784c;
                boolean z10 = true;
                if (aVar2.f13603d != 0) {
                    b.c<K, V> cVar = aVar2.f13600a;
                    j.c(cVar);
                    i.b bVar = ((a) cVar.f13605b).f2792a;
                    b.c<K, V> cVar2 = this.f2784c.f13601b;
                    j.c(cVar2);
                    i.b bVar2 = ((a) cVar2.f13605b).f2792a;
                    if (!(bVar == bVar2 && this.f2785d == bVar2)) {
                        z10 = false;
                    }
                }
                if (!z10) {
                    this.f2789h = false;
                    i.b bVar3 = this.f2785d;
                    b.c<K, V> cVar3 = this.f2784c.f13600a;
                    j.c(cVar3);
                    if (bVar3.compareTo(((a) cVar3.f13605b).f2792a) < 0) {
                        o.a<k, a> aVar3 = this.f2784c;
                        b.C0165b bVar4 = new b.C0165b(aVar3.f13601b, aVar3.f13600a);
                        aVar3.f13602c.put(bVar4, Boolean.FALSE);
                        while (bVar4.hasNext() && !this.f2789h) {
                            Map.Entry entry = (Map.Entry) bVar4.next();
                            j.e(entry, "next()");
                            k kVar = (k) entry.getKey();
                            a aVar4 = (a) entry.getValue();
                            while (aVar4.f2792a.compareTo(this.f2785d) > 0 && !this.f2789h && this.f2784c.f13599e.containsKey(kVar)) {
                                i.a.C0026a aVar5 = i.a.Companion;
                                i.b bVar5 = aVar4.f2792a;
                                aVar5.getClass();
                                j.f(bVar5, "state");
                                int ordinal = bVar5.ordinal();
                                if (ordinal == 2) {
                                    aVar = i.a.ON_DESTROY;
                                } else if (ordinal == 3) {
                                    aVar = i.a.ON_STOP;
                                } else if (ordinal != 4) {
                                    aVar = null;
                                } else {
                                    aVar = i.a.ON_PAUSE;
                                }
                                if (aVar != null) {
                                    this.f2790i.add(aVar.b());
                                    aVar4.a(lVar, aVar);
                                    ArrayList<i.b> arrayList = this.f2790i;
                                    arrayList.remove(arrayList.size() - 1);
                                } else {
                                    StringBuilder q10 = android.support.v4.media.a.q("no event down from ");
                                    q10.append(aVar4.f2792a);
                                    throw new IllegalStateException(q10.toString());
                                }
                            }
                        }
                    }
                    b.c<K, V> cVar4 = this.f2784c.f13601b;
                    if (!this.f2789h && cVar4 != null && this.f2785d.compareTo(((a) cVar4.f13605b).f2792a) > 0) {
                        o.a<k, a> aVar6 = this.f2784c;
                        aVar6.getClass();
                        b.d dVar = new b.d();
                        aVar6.f13602c.put(dVar, Boolean.FALSE);
                        while (dVar.hasNext() && !this.f2789h) {
                            Map.Entry entry2 = (Map.Entry) dVar.next();
                            k kVar2 = (k) entry2.getKey();
                            a aVar7 = (a) entry2.getValue();
                            while (aVar7.f2792a.compareTo(this.f2785d) < 0 && !this.f2789h && this.f2784c.f13599e.containsKey(kVar2)) {
                                this.f2790i.add(aVar7.f2792a);
                                i.a.C0026a aVar8 = i.a.Companion;
                                i.b bVar6 = aVar7.f2792a;
                                aVar8.getClass();
                                i.a a10 = i.a.C0026a.a(bVar6);
                                if (a10 != null) {
                                    aVar7.a(lVar, a10);
                                    ArrayList<i.b> arrayList2 = this.f2790i;
                                    arrayList2.remove(arrayList2.size() - 1);
                                } else {
                                    StringBuilder q11 = android.support.v4.media.a.q("no event up from ");
                                    q11.append(aVar7.f2792a);
                                    throw new IllegalStateException(q11.toString());
                                }
                            }
                        }
                    }
                } else {
                    this.f2789h = false;
                    this.f2791j.setValue(this.f2785d);
                    return;
                }
            }
        } else {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
    }
}
