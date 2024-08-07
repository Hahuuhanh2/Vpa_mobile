package f2;

import ik.d;
import java.util.Iterator;
import java.util.List;
import kk.e;
import kk.i;
import p3.l0;
import rk.l;
import rk.p;

@e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2", f = "DataMigrationInitializer.kt", l = {44, 46}, m = "invokeSuspend")
/* compiled from: DataMigrationInitializer.kt */
public final class f extends i implements p<Object, d<Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public Iterator f9785a;

    /* renamed from: b  reason: collision with root package name */
    public c f9786b;

    /* renamed from: c  reason: collision with root package name */
    public Object f9787c;

    /* renamed from: d  reason: collision with root package name */
    public int f9788d;

    /* renamed from: e  reason: collision with root package name */
    public /* synthetic */ Object f9789e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ List<c<Object>> f9790f;

    /* renamed from: n  reason: collision with root package name */
    public final /* synthetic */ List<l<d<? super ek.i>, Object>> f9791n;

    @e(c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", f = "DataMigrationInitializer.kt", l = {45}, m = "invokeSuspend")
    /* compiled from: DataMigrationInitializer.kt */
    public static final class a extends i implements l<d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f9792a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c<Object> f9793b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c<Object> cVar, d<? super a> dVar) {
            super(1, dVar);
            this.f9793b = cVar;
        }

        public final d<ek.i> create(d<?> dVar) {
            return new a(this.f9793b, dVar);
        }

        public final Object invoke(Object obj) {
            return ((a) create((d) obj)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            int i10 = this.f9792a;
            if (i10 == 0) {
                l0.Q0(obj);
                c<Object> cVar = this.f9793b;
                this.f9792a = 1;
                if (cVar.e() == aVar) {
                    return aVar;
                }
            } else if (i10 == 1) {
                l0.Q0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return ek.i.f20112a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(List<? extends c<Object>> list, List<l<d<? super ek.i>, Object>> list2, d<? super f> dVar) {
        super(2, dVar);
        this.f9790f = list;
        this.f9791n = list2;
    }

    public final d<ek.i> create(Object obj, d<?> dVar) {
        f fVar = new f(this.f9790f, this.f9791n, dVar);
        fVar.f9789e = obj;
        return fVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((f) create(obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            jk.a r0 = jk.a.COROUTINE_SUSPENDED
            int r1 = r10.f9788d
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x002d
            if (r1 == r2) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            java.util.Iterator r1 = r10.f9785a
            java.lang.Object r4 = r10.f9789e
            java.util.List r4 = (java.util.List) r4
            p3.l0.Q0(r11)
            goto L_0x003a
        L_0x0016:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001e:
            java.lang.Object r1 = r10.f9787c
            f2.c r4 = r10.f9786b
            java.util.Iterator r5 = r10.f9785a
            java.lang.Object r6 = r10.f9789e
            java.util.List r6 = (java.util.List) r6
            p3.l0.Q0(r11)
            r7 = r10
            goto L_0x0060
        L_0x002d:
            p3.l0.Q0(r11)
            java.lang.Object r11 = r10.f9789e
            java.util.List<f2.c<java.lang.Object>> r1 = r10.f9790f
            java.util.List<rk.l<ik.d<? super ek.i>, java.lang.Object>> r4 = r10.f9791n
            java.util.Iterator r1 = r1.iterator()
        L_0x003a:
            r5 = r10
        L_0x003b:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0087
            java.lang.Object r6 = r1.next()
            f2.c r6 = (f2.c) r6
            r5.f9789e = r4
            r5.f9785a = r1
            r5.f9786b = r6
            r5.f9787c = r11
            r5.f9788d = r2
            java.lang.Object r7 = r6.g()
            if (r7 != r0) goto L_0x0058
            return r0
        L_0x0058:
            r8 = r1
            r1 = r11
            r11 = r7
            r7 = r5
            r5 = r8
            r9 = r6
            r6 = r4
            r4 = r9
        L_0x0060:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 == 0) goto L_0x0082
            f2.f$a r11 = new f2.f$a
            r1 = 0
            r11.<init>(r4, r1)
            r6.add(r11)
            r7.f9789e = r6
            r7.f9785a = r5
            r7.f9786b = r1
            r7.f9787c = r1
            r7.f9788d = r3
            java.lang.Object r11 = r4.f()
            if (r11 != r0) goto L_0x0083
            return r0
        L_0x0082:
            r11 = r1
        L_0x0083:
            r1 = r5
            r4 = r6
            r5 = r7
            goto L_0x003b
        L_0x0087:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
