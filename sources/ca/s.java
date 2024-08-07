package ca;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import wa.c;
import za.b;

/* compiled from: RestrictedComponentContainer */
public final class s implements c {

    /* renamed from: a  reason: collision with root package name */
    public final Set<r<?>> f4661a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<r<?>> f4662b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<r<?>> f4663c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<r<?>> f4664d;

    /* renamed from: e  reason: collision with root package name */
    public final c f4665e;

    /* compiled from: RestrictedComponentContainer */
    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final c f4666a;

        public a(c cVar) {
            this.f4666a = cVar;
        }
    }

    public s(b bVar, k kVar) {
        boolean z10;
        boolean z11;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (m next : bVar.f4609c) {
            int i10 = next.f4646c;
            boolean z12 = true;
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (next.f4645b != 2 ? false : z12) {
                    hashSet4.add(next.f4644a);
                } else {
                    hashSet.add(next.f4644a);
                }
            } else {
                if (i10 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    hashSet3.add(next.f4644a);
                } else {
                    if (next.f4645b != 2 ? false : z12) {
                        hashSet5.add(next.f4644a);
                    } else {
                        hashSet2.add(next.f4644a);
                    }
                }
            }
        }
        if (!bVar.f4613g.isEmpty()) {
            hashSet.add(r.a(c.class));
        }
        this.f4661a = Collections.unmodifiableSet(hashSet);
        this.f4662b = Collections.unmodifiableSet(hashSet2);
        this.f4663c = Collections.unmodifiableSet(hashSet3);
        this.f4664d = Collections.unmodifiableSet(hashSet4);
        Collections.unmodifiableSet(hashSet5);
        Set<Class<?>> set = bVar.f4613g;
        this.f4665e = kVar;
    }

    public final <T> T a(Class<T> cls) {
        if (this.f4661a.contains(r.a(cls))) {
            T a10 = this.f4665e.a(cls);
            if (!cls.equals(c.class)) {
                return a10;
            }
            return new a((c) a10);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public final <T> b<T> b(r<T> rVar) {
        if (this.f4662b.contains(rVar)) {
            return this.f4665e.b(rVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{rVar}));
    }

    public final <T> b<T> c(Class<T> cls) {
        return b(r.a(cls));
    }

    public final <T> T d(r<T> rVar) {
        if (this.f4661a.contains(rVar)) {
            return this.f4665e.d(rVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{rVar}));
    }

    public final <T> Set<T> e(r<T> rVar) {
        if (this.f4664d.contains(rVar)) {
            return this.f4665e.e(rVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{rVar}));
    }

    public final <T> za.a<T> f(r<T> rVar) {
        if (this.f4663c.contains(rVar)) {
            return this.f4665e.f(rVar);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{rVar}));
    }

    public final <T> za.a<T> g(Class<T> cls) {
        return f(r.a(cls));
    }

    public final Set h(Class cls) {
        return e(r.a(cls));
    }
}
