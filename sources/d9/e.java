package d9;

import a9.a;
import com.google.crypto.tink.shaded.protobuf.n;
import com.google.crypto.tink.shaded.protobuf.x;
import i9.y;
import j9.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: KeyTypeManager */
public abstract class e<KeyProtoT extends x> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<KeyProtoT> f8777a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, q<?, KeyProtoT>> f8778b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<?> f8779c;

    /* compiled from: KeyTypeManager */
    public static abstract class a<KeyFormatProtoT extends x, KeyProtoT extends x> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<KeyFormatProtoT> f8780a;

        /* renamed from: d9.e$a$a  reason: collision with other inner class name */
        /* compiled from: KeyTypeManager */
        public static final class C0090a<KeyFormatProtoT> {

            /* renamed from: a  reason: collision with root package name */
            public KeyFormatProtoT f8781a;

            /* renamed from: b  reason: collision with root package name */
            public int f8782b;

            public C0090a(n nVar, int i10) {
                this.f8781a = nVar;
                this.f8782b = i10;
            }
        }

        public a(Class<KeyFormatProtoT> cls) {
            this.f8780a = cls;
        }

        public abstract KeyProtoT a(KeyFormatProtoT keyformatprotot);

        public Map<String, C0090a<KeyFormatProtoT>> b() {
            return Collections.emptyMap();
        }

        public abstract KeyFormatProtoT c(c cVar);

        public abstract void d(KeyFormatProtoT keyformatprotot);
    }

    @SafeVarargs
    public e(Class<KeyProtoT> cls, q<?, KeyProtoT>... qVarArr) {
        this.f8777a = cls;
        HashMap hashMap = new HashMap();
        int length = qVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            q<?, KeyProtoT> qVar = qVarArr[i10];
            if (!hashMap.containsKey(qVar.f8798a)) {
                hashMap.put(qVar.f8798a, qVar);
                i10++;
            } else {
                StringBuilder q10 = android.support.v4.media.a.q("KeyTypeManager constructed with duplicate factories for primitive ");
                q10.append(qVar.f8798a.getCanonicalName());
                throw new IllegalArgumentException(q10.toString());
            }
        }
        if (qVarArr.length > 0) {
            this.f8779c = qVarArr[0].f8798a;
        } else {
            this.f8779c = Void.class;
        }
        this.f8778b = Collections.unmodifiableMap(hashMap);
    }

    public a.C0003a a() {
        return a.C0003a.f116a;
    }

    public abstract String b();

    public final <P> P c(KeyProtoT keyprotot, Class<P> cls) {
        q qVar = this.f8778b.get(cls);
        if (qVar != null) {
            return qVar.a(keyprotot);
        }
        StringBuilder q10 = android.support.v4.media.a.q("Requested primitive class ");
        q10.append(cls.getCanonicalName());
        q10.append(" not supported.");
        throw new IllegalArgumentException(q10.toString());
    }

    public abstract a<?, KeyProtoT> d();

    public abstract y.b e();

    public abstract KeyProtoT f(c cVar);

    public abstract void g(KeyProtoT keyprotot);
}
