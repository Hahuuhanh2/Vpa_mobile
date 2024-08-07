package d9;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Objects;
import w8.o;

/* compiled from: PrimitiveRegistry */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f8799a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f8800b;

    /* compiled from: PrimitiveRegistry */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final Class<?> f8803a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<?> f8804b;

        public b() {
            throw null;
        }

        public b(Class cls, Class cls2) {
            this.f8803a = cls;
            this.f8804b = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (!bVar.f8803a.equals(this.f8803a) || !bVar.f8804b.equals(this.f8804b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return Objects.hash(new Object[]{this.f8803a, this.f8804b});
        }

        public final String toString() {
            return this.f8803a.getSimpleName() + " with primitive type: " + this.f8804b.getSimpleName();
        }
    }

    public r(a aVar) {
        this.f8799a = new HashMap(aVar.f8801a);
        this.f8800b = new HashMap(aVar.f8802b);
    }

    /* compiled from: PrimitiveRegistry */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final HashMap f8801a;

        /* renamed from: b  reason: collision with root package name */
        public final HashMap f8802b;

        public a() {
            this.f8801a = new HashMap();
            this.f8802b = new HashMap();
        }

        public final void a(o oVar) {
            b bVar = new b(oVar.f8796a, oVar.f8797b);
            if (this.f8801a.containsKey(bVar)) {
                p pVar = (p) this.f8801a.get(bVar);
                if (!pVar.equals(oVar) || !oVar.equals(pVar)) {
                    throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + bVar);
                }
                return;
            }
            this.f8801a.put(bVar, oVar);
        }

        public final void b(o oVar) {
            if (oVar != null) {
                Class b10 = oVar.b();
                if (this.f8802b.containsKey(b10)) {
                    o oVar2 = (o) this.f8802b.get(b10);
                    if (!oVar2.equals(oVar) || !oVar.equals(oVar2)) {
                        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + b10);
                    }
                    return;
                }
                this.f8802b.put(b10, oVar);
                return;
            }
            throw new NullPointerException("wrapper must be non-null");
        }

        public a(r rVar) {
            this.f8801a = new HashMap(rVar.f8799a);
            this.f8802b = new HashMap(rVar.f8800b);
        }
    }
}
