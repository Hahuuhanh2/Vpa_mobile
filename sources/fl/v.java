package fl;

import al.z1;
import ik.f;
import rk.p;
import sk.j;
import sk.k;

/* compiled from: ThreadContext.kt */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    public static final u9.b f20264a = new u9.b("NO_THREAD_ELEMENTS", 1);

    /* renamed from: b  reason: collision with root package name */
    public static final a f20265b = a.f20268a;

    /* renamed from: c  reason: collision with root package name */
    public static final b f20266c = b.f20269a;

    /* renamed from: d  reason: collision with root package name */
    public static final c f20267d = c.f20270a;

    /* compiled from: ThreadContext.kt */
    public static final class a extends k implements p<Object, f.b, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f20268a = new a();

        public a() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            Integer num;
            int i10;
            f.b bVar = (f.b) obj2;
            if (!(bVar instanceof z1)) {
                return obj;
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
            } else {
                num = null;
            }
            if (num != null) {
                i10 = num.intValue();
            } else {
                i10 = 1;
            }
            if (i10 == 0) {
                return bVar;
            }
            return Integer.valueOf(i10 + 1);
        }
    }

    /* compiled from: ThreadContext.kt */
    public static final class b extends k implements p<z1<?>, f.b, z1<?>> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f20269a = new b();

        public b() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            z1 z1Var = (z1) obj;
            f.b bVar = (f.b) obj2;
            if (z1Var != null) {
                return z1Var;
            }
            if (bVar instanceof z1) {
                return (z1) bVar;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    public static final class c extends k implements p<y, f.b, y> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f20270a = new c();

        public c() {
            super(2);
        }

        public final Object invoke(Object obj, Object obj2) {
            y yVar = (y) obj;
            f.b bVar = (f.b) obj2;
            if (bVar instanceof z1) {
                z1<Object> z1Var = (z1) bVar;
                String E = z1Var.E(yVar.f20273a);
                Object[] objArr = yVar.f20274b;
                int i10 = yVar.f20276d;
                objArr[i10] = E;
                z1<Object>[] z1VarArr = yVar.f20275c;
                yVar.f20276d = i10 + 1;
                z1VarArr[i10] = z1Var;
            }
            return yVar;
        }
    }

    public static final void a(f fVar, Object obj) {
        if (obj != f20264a) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                int length = yVar.f20275c.length - 1;
                if (length >= 0) {
                    while (true) {
                        int i10 = length - 1;
                        z1<Object> z1Var = yVar.f20275c[length];
                        j.c(z1Var);
                        z1Var.K(yVar.f20274b[length]);
                        if (i10 >= 0) {
                            length = i10;
                        } else {
                            return;
                        }
                    }
                }
            } else {
                Object fold = fVar.fold(null, f20266c);
                j.d(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
                ((z1) fold).K(obj);
            }
        }
    }

    public static final Object b(f fVar, Object obj) {
        if (obj == null) {
            obj = fVar.fold(0, f20265b);
            j.c(obj);
        }
        if (obj == 0) {
            return f20264a;
        }
        if (obj instanceof Integer) {
            return fVar.fold(new y(fVar, ((Number) obj).intValue()), f20267d);
        }
        return ((z1) obj).E(fVar);
    }
}
