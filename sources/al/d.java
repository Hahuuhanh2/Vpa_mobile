package al;

import al.c;
import ek.i;
import fk.r;
import java.util.List;
import kk.c;
import kk.e;

/* compiled from: Await.kt */
public final class d {

    @e(c = "kotlinx.coroutines.AwaitKt", f = "Await.kt", l = {54}, m = "joinAll")
    /* compiled from: Await.kt */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public Object[] f19003a;

        /* renamed from: b  reason: collision with root package name */
        public int f19004b;

        /* renamed from: c  reason: collision with root package name */
        public int f19005c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f19006d;

        /* renamed from: e  reason: collision with root package name */
        public int f19007e;

        public a(ik.d<? super a> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19006d = obj;
            this.f19007e |= Integer.MIN_VALUE;
            return d.c((i1[]) null, this);
        }
    }

    public static final <T> Object a(j0<? extends T>[] j0VarArr, ik.d<? super List<? extends T>> dVar) {
        boolean z10;
        if (j0VarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return r.f20213a;
        }
        c cVar = new c(j0VarArr);
        l lVar = new l(1, g0.b0(dVar));
        lVar.t();
        int length = j0VarArr.length;
        c.a[] aVarArr = new c.a[length];
        for (int i10 = 0; i10 < length; i10++) {
            j0<T> j0Var = cVar.f18995a[i10];
            j0Var.start();
            c.a aVar = new c.a(lVar);
            aVar.f18998f = j0Var.invokeOnCompletion(aVar);
            i iVar = i.f20112a;
            aVarArr[i10] = aVar;
        }
        c.b bVar = new c.b(aVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c.a aVar2 = aVarArr[i11];
            aVar2.getClass();
            c.a.f18996o.set(aVar2, bVar);
        }
        if (!(l.f19048n.get(lVar) instanceof t1)) {
            bVar.i();
        } else {
            lVar.v(bVar);
        }
        Object s10 = lVar.s();
        jk.a aVar3 = jk.a.COROUTINE_SUSPENDED;
        return s10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(java.util.List r4, ik.d r5) {
        /*
            boolean r0 = r5 instanceof al.e
            if (r0 == 0) goto L_0x0013
            r0 = r5
            al.e r0 = (al.e) r0
            int r1 = r0.f19012c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19012c = r1
            goto L_0x0018
        L_0x0013:
            al.e r0 = new al.e
            r0.<init>(r5)
        L_0x0018:
            java.lang.Object r5 = r0.f19011b
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f19012c
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            java.util.Iterator r4 = r0.f19010a
            p3.l0.Q0(r5)
            goto L_0x0038
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            p3.l0.Q0(r5)
            java.util.Iterator r4 = r4.iterator()
        L_0x0038:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004f
            java.lang.Object r5 = r4.next()
            al.i1 r5 = (al.i1) r5
            r0.f19010a = r4
            r0.f19012c = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L_0x0038
            return r1
        L_0x004f:
            ek.i r4 = ek.i.f20112a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.b(java.util.List, ik.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(al.i1[] r6, ik.d<? super ek.i> r7) {
        /*
            boolean r0 = r7 instanceof al.d.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            al.d$a r0 = (al.d.a) r0
            int r1 = r0.f19007e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19007e = r1
            goto L_0x0018
        L_0x0013:
            al.d$a r0 = new al.d$a
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f19006d
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f19007e
            r3 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            int r6 = r0.f19005c
            int r2 = r0.f19004b
            java.lang.Object[] r4 = r0.f19003a
            al.i1[] r4 = (al.i1[]) r4
            p3.l0.Q0(r7)
            r7 = r4
            goto L_0x0054
        L_0x0030:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0038:
            p3.l0.Q0(r7)
            r7 = 0
            int r2 = r6.length
            r5 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L_0x0041:
            if (r2 >= r6) goto L_0x0056
            r4 = r7[r2]
            r0.f19003a = r7
            r0.f19004b = r2
            r0.f19005c = r6
            r0.f19007e = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L_0x0054
            return r1
        L_0x0054:
            int r2 = r2 + r3
            goto L_0x0041
        L_0x0056:
            ek.i r6 = ek.i.f20112a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: al.d.c(al.i1[], ik.d):java.lang.Object");
    }
}
