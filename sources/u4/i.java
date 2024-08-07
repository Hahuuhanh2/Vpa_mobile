package u4;

import com.bumptech.glide.Registry;
import com.bumptech.glide.h;
import g5.b;
import g5.c;
import j5.a;
import j5.c;
import j7.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o5.k;
import s4.d;
import s4.e;
import s4.l;
import u4.j;
import y4.n;
import y4.p;

/* compiled from: DecodeHelper */
public final class i<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f15115a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15116b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public h f15117c;

    /* renamed from: d  reason: collision with root package name */
    public Object f15118d;

    /* renamed from: e  reason: collision with root package name */
    public int f15119e;

    /* renamed from: f  reason: collision with root package name */
    public int f15120f;

    /* renamed from: g  reason: collision with root package name */
    public Class<?> f15121g;

    /* renamed from: h  reason: collision with root package name */
    public j.d f15122h;

    /* renamed from: i  reason: collision with root package name */
    public s4.h f15123i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, l<?>> f15124j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f15125k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f15126l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f15127m;

    /* renamed from: n  reason: collision with root package name */
    public e f15128n;

    /* renamed from: o  reason: collision with root package name */
    public com.bumptech.glide.j f15129o;

    /* renamed from: p  reason: collision with root package name */
    public l f15130p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f15131q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f15132r;

    public final ArrayList a() {
        if (!this.f15127m) {
            this.f15127m = true;
            this.f15116b.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a aVar = (n.a) b10.get(i10);
                if (!this.f15116b.contains(aVar.f17485a)) {
                    this.f15116b.add(aVar.f17485a);
                }
                for (int i11 = 0; i11 < aVar.f17486b.size(); i11++) {
                    if (!this.f15116b.contains(aVar.f17486b.get(i11))) {
                        this.f15116b.add(aVar.f17486b.get(i11));
                    }
                }
            }
        }
        return this.f15116b;
    }

    public final ArrayList b() {
        if (!this.f15126l) {
            this.f15126l = true;
            this.f15115a.clear();
            List e10 = this.f15117c.f4926b.e(this.f15118d);
            int size = e10.size();
            for (int i10 = 0; i10 < size; i10++) {
                n.a b10 = ((n) e10.get(i10)).b(this.f15118d, this.f15119e, this.f15120f, this.f15123i);
                if (b10 != null) {
                    this.f15115a.add(b10);
                }
            }
        }
        return this.f15115a;
    }

    public final <Data> s<Data, ?, Transcode> c(Class<Data> cls) {
        s<Data, ?, Transcode> orDefault;
        s<Data, ?, Transcode> sVar;
        s<?, ?, ?> sVar2;
        ArrayList arrayList;
        boolean z10;
        b bVar;
        boolean z11;
        Class<Data> cls2 = cls;
        Registry registry = this.f15117c.f4926b;
        Class<?> cls3 = this.f15121g;
        Class<Transcode> cls4 = this.f15125k;
        j5.b bVar2 = registry.f4912i;
        k andSet = bVar2.f11691b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new k();
        }
        andSet.f13751a = cls2;
        andSet.f13752b = cls3;
        andSet.f13753c = cls4;
        synchronized (bVar2.f11690a) {
            orDefault = bVar2.f11690a.getOrDefault(andSet, null);
        }
        bVar2.f11691b.set(andSet);
        registry.f4912i.getClass();
        if (j5.b.f11689c.equals(orDefault)) {
            return null;
        }
        if (orDefault != null) {
            return orDefault;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = registry.f4906c.b(cls2, cls3).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = registry.f4909f.a(cls5, cls4).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    c cVar = registry.f4906c;
                    synchronized (cVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = cVar.f11692a.iterator();
                        while (it3.hasNext()) {
                            List<c.a> list = (List) cVar.f11693b.get((String) it3.next());
                            if (list != null) {
                                for (c.a aVar : list) {
                                    if (!aVar.f11694a.isAssignableFrom(cls2) || !cls5.isAssignableFrom(aVar.f11695b)) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        arrayList.add(aVar.f11696c);
                                    }
                                }
                            }
                        }
                    }
                    g5.c cVar2 = registry.f4909f;
                    synchronized (cVar2) {
                        if (cls6.isAssignableFrom(cls5)) {
                            bVar = a.f11707o;
                        } else {
                            Iterator it4 = cVar2.f10369a.iterator();
                            while (it4.hasNext()) {
                                c.a aVar2 = (c.a) it4.next();
                                if (!aVar2.f10370a.isAssignableFrom(cls5) || !cls6.isAssignableFrom(aVar2.f10371b)) {
                                    z10 = false;
                                    continue;
                                } else {
                                    z10 = true;
                                    continue;
                                }
                                if (z10) {
                                    bVar = aVar2.f10372c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                    }
                    b bVar3 = bVar;
                    k kVar = r2;
                    k kVar2 = new k(cls, cls5, cls6, arrayList, bVar3, registry.f4913j);
                    arrayList2.add(kVar);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            sVar = null;
        } else {
            sVar = new s<>(cls, cls3, cls4, arrayList2, registry.f4913j);
        }
        j5.b bVar4 = registry.f4912i;
        synchronized (bVar4.f11690a) {
            v0.b<k, s<?, ?, ?>> bVar5 = bVar4.f11690a;
            k kVar3 = new k(cls2, cls3, cls4);
            if (sVar != null) {
                sVar2 = sVar;
            } else {
                sVar2 = j5.b.f11689c;
            }
            bVar5.put(kVar3, sVar2);
        }
        return sVar;
    }

    public final List<Class<?>> d() {
        List<Class<?>> list;
        ArrayList d10;
        Registry registry = this.f15117c.f4926b;
        Class<?> cls = this.f15118d.getClass();
        Class<?> cls2 = this.f15121g;
        Class<Transcode> cls3 = this.f15125k;
        y0.h hVar = registry.f4911h;
        k kVar = (k) ((AtomicReference) hVar.f17386a).getAndSet((Object) null);
        if (kVar == null) {
            kVar = new k(cls, cls2, cls3);
        } else {
            kVar.f13751a = cls;
            kVar.f13752b = cls2;
            kVar.f13753c = cls3;
        }
        synchronized (((v0.b) hVar.f17387b)) {
            list = (List) ((v0.b) hVar.f17387b).getOrDefault(kVar, null);
        }
        ((AtomicReference) hVar.f17386a).set(kVar);
        ArrayList arrayList = list;
        if (list == null) {
            ArrayList arrayList2 = new ArrayList();
            p pVar = registry.f4904a;
            synchronized (pVar) {
                d10 = pVar.f17488a.d(cls);
            }
            Iterator it = d10.iterator();
            while (it.hasNext()) {
                Iterator it2 = registry.f4906c.b((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!registry.f4909f.a(cls4, cls3).isEmpty() && !arrayList2.contains(cls4)) {
                        arrayList2.add(cls4);
                    }
                }
            }
            y0.h hVar2 = registry.f4911h;
            List unmodifiableList = Collections.unmodifiableList(arrayList2);
            synchronized (((v0.b) hVar2.f17387b)) {
                ((v0.b) hVar2.f17387b).put(new k(cls, cls2, cls3), unmodifiableList);
            }
            arrayList = arrayList2;
        }
        return arrayList;
    }

    public final <X> d<X> e(X x10) {
        d<T> dVar;
        j5.a aVar = this.f15117c.f4926b.f4905b;
        Class<?> cls = x10.getClass();
        synchronized (aVar) {
            Iterator it = aVar.f11686a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                a.C0128a aVar2 = (a.C0128a) it.next();
                if (aVar2.f11687a.isAssignableFrom(cls)) {
                    dVar = aVar2.f11688b;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new Registry.NoSourceEncoderAvailableException(x10.getClass());
    }

    public final <Z> l<Z> f(Class<Z> cls) {
        l<Z> lVar = this.f15124j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, l<?>>> it = this.f15124j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f15124j.isEmpty() || !this.f15131q) {
            return a5.b.f103b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
