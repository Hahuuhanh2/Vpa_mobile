package ca;

import c0.q0;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: Component */
public final class b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final String f4607a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<r<? super T>> f4608b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<m> f4609c;

    /* renamed from: d  reason: collision with root package name */
    public final int f4610d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4611e;

    /* renamed from: f  reason: collision with root package name */
    public final f<T> f4612f;

    /* renamed from: g  reason: collision with root package name */
    public final Set<Class<?>> f4613g;

    public b(String str, Set<r<? super T>> set, Set<m> set2, int i10, int i11, f<T> fVar, Set<Class<?>> set3) {
        this.f4607a = str;
        this.f4608b = Collections.unmodifiableSet(set);
        this.f4609c = Collections.unmodifiableSet(set2);
        this.f4610d = i10;
        this.f4611e = i11;
        this.f4612f = fVar;
        this.f4613g = Collections.unmodifiableSet(set3);
    }

    public static <T> a<T> a(r<T> rVar) {
        return new a<>((r) rVar, new r[0]);
    }

    public static <T> a<T> b(Class<T> cls) {
        return new a<>((Class) cls, new Class[0]);
    }

    @SafeVarargs
    public static <T> b<T> c(T t10, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(r.a(cls));
        int length = clsArr.length;
        int i10 = 0;
        while (i10 < length) {
            Class<? super T> cls2 = clsArr[i10];
            if (cls2 != null) {
                hashSet.add(r.a(cls2));
                i10++;
            } else {
                throw new NullPointerException("Null interface");
            }
        }
        return new b((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new q0(t10, 0), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f4608b.toArray()) + ">{" + this.f4610d + ", type=" + this.f4611e + ", deps=" + Arrays.toString(this.f4609c.toArray()) + "}";
    }

    /* compiled from: Component */
    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public String f4614a = null;

        /* renamed from: b  reason: collision with root package name */
        public final HashSet f4615b;

        /* renamed from: c  reason: collision with root package name */
        public final HashSet f4616c;

        /* renamed from: d  reason: collision with root package name */
        public int f4617d;

        /* renamed from: e  reason: collision with root package name */
        public int f4618e;

        /* renamed from: f  reason: collision with root package name */
        public f<T> f4619f;

        /* renamed from: g  reason: collision with root package name */
        public final HashSet f4620g;

        public a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f4615b = hashSet;
            this.f4616c = new HashSet();
            int i10 = 0;
            this.f4617d = 0;
            this.f4618e = 0;
            this.f4620g = new HashSet();
            hashSet.add(r.a(cls));
            int length = clsArr.length;
            while (i10 < length) {
                Class cls2 = clsArr[i10];
                if (cls2 != null) {
                    this.f4615b.add(r.a(cls2));
                    i10++;
                } else {
                    throw new NullPointerException("Null interface");
                }
            }
        }

        public final void a(m mVar) {
            if (!this.f4615b.contains(mVar.f4644a)) {
                this.f4616c.add(mVar);
                return;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final b<T> b() {
            boolean z10;
            if (this.f4619f != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                return new b(this.f4614a, new HashSet(this.f4615b), new HashSet(this.f4616c), this.f4617d, this.f4618e, this.f4619f, this.f4620g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final void c(int i10) {
            boolean z10;
            if (this.f4617d == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f4617d = i10;
                return;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }

        public a(r rVar, r[] rVarArr) {
            HashSet hashSet = new HashSet();
            this.f4615b = hashSet;
            this.f4616c = new HashSet();
            int i10 = 0;
            this.f4617d = 0;
            this.f4618e = 0;
            this.f4620g = new HashSet();
            hashSet.add(rVar);
            int length = rVarArr.length;
            while (i10 < length) {
                if (rVarArr[i10] != null) {
                    i10++;
                } else {
                    throw new NullPointerException("Null interface");
                }
            }
            Collections.addAll(this.f4615b, rVarArr);
        }
    }
}
