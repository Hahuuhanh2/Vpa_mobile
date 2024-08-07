package d9;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: SerializationRegistry */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8811a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8812b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f8813c;

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f8814d;

    /* compiled from: SerializationRegistry */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Class<? extends u> f8819a;

        /* renamed from: b  reason: collision with root package name */
        public final l9.a f8820b;

        public b(Class cls, l9.a aVar) {
            this.f8819a = cls;
            this.f8820b = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.f8819a.equals(this.f8819a) || !bVar.f8820b.equals(this.f8820b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{this.f8819a, this.f8820b});
        }

        public final String toString() {
            return this.f8819a.getSimpleName() + ", object identifier: " + this.f8820b;
        }
    }

    /* compiled from: SerializationRegistry */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f8821a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<? extends u> f8822b;

        public c() {
            throw null;
        }

        public c(Class cls, Class cls2) {
            this.f8821a = cls;
            this.f8822b = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (!cVar.f8821a.equals(this.f8821a) || !cVar.f8822b.equals(this.f8822b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{this.f8821a, this.f8822b});
        }

        public final String toString() {
            return this.f8821a.getSimpleName() + " with serialization type: " + this.f8822b.getSimpleName();
        }
    }

    public v(a aVar) {
        this.f8811a = new HashMap(aVar.f8815a);
        this.f8812b = new HashMap(aVar.f8816b);
        this.f8813c = new HashMap(aVar.f8817c);
        this.f8814d = new HashMap(aVar.f8818d);
    }

    /* compiled from: SerializationRegistry */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f8815a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f8816b;

        /* renamed from: c  reason: collision with root package name */
        public final HashMap f8817c;

        /* renamed from: d  reason: collision with root package name */
        public final HashMap f8818d;

        public a() {
            this.f8815a = new HashMap();
            this.f8816b = new HashMap();
            this.f8817c = new HashMap();
            this.f8818d = new HashMap();
        }

        public final void a(a aVar) {
            b bVar = new b(aVar.f8774b, aVar.f8773a);
            if (this.f8816b.containsKey(bVar)) {
                b bVar2 = (b) this.f8816b.get(bVar);
                if (!bVar2.equals(aVar) || !aVar.equals(bVar2)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + bVar);
                }
                return;
            }
            this.f8816b.put(bVar, aVar);
        }

        public final void b(c cVar) {
            c cVar2 = new c(cVar.f8775a, cVar.f8776b);
            if (this.f8815a.containsKey(cVar2)) {
                d dVar = (d) this.f8815a.get(cVar2);
                if (!dVar.equals(cVar) || !cVar.equals(dVar)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + cVar2);
                }
                return;
            }
            this.f8815a.put(cVar2, cVar);
        }

        public final void c(k kVar) {
            b bVar = new b(kVar.f8792b, kVar.f8791a);
            if (this.f8818d.containsKey(bVar)) {
                l lVar = (l) this.f8818d.get(bVar);
                if (!lVar.equals(kVar) || !kVar.equals(lVar)) {
                    throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + bVar);
                }
                return;
            }
            this.f8818d.put(bVar, kVar);
        }

        public final void d(m mVar) {
            c cVar = new c(mVar.f8793a, mVar.f8794b);
            if (this.f8817c.containsKey(cVar)) {
                n nVar = (n) this.f8817c.get(cVar);
                if (!nVar.equals(mVar) || !mVar.equals(nVar)) {
                    throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + cVar);
                }
                return;
            }
            this.f8817c.put(cVar, mVar);
        }

        public a(v vVar) {
            this.f8815a = new HashMap(vVar.f8811a);
            this.f8816b = new HashMap(vVar.f8812b);
            this.f8817c = new HashMap(vVar.f8813c);
            this.f8818d = new HashMap(vVar.f8814d);
        }
    }
}
