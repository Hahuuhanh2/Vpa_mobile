package f2;

import al.d0;
import al.g0;
import al.r;
import al.s;
import dl.t;
import dl.z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import p3.l0;
import sk.j;
import sk.q;
import zb.i;

/* compiled from: SingleProcessDataStore.kt */
public final class p<T> implements h<T> {

    /* renamed from: k  reason: collision with root package name */
    public static final LinkedHashSet f9807k = new LinkedHashSet();

    /* renamed from: l  reason: collision with root package name */
    public static final Object f9808l = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final rk.a<File> f9809a;

    /* renamed from: b  reason: collision with root package name */
    public final l<T> f9810b;

    /* renamed from: c  reason: collision with root package name */
    public final a<T> f9811c;

    /* renamed from: d  reason: collision with root package name */
    public final d0 f9812d;

    /* renamed from: e  reason: collision with root package name */
    public final t f9813e = new t(new t(this, (ik.d<? super t>) null));

    /* renamed from: f  reason: collision with root package name */
    public final String f9814f = ".tmp";

    /* renamed from: g  reason: collision with root package name */
    public final ek.g f9815g = j7.a.b0(new v(this));

    /* renamed from: h  reason: collision with root package name */
    public final z f9816h;

    /* renamed from: i  reason: collision with root package name */
    public List<? extends rk.p<? super j<T>, ? super ik.d<? super ek.i>, ? extends Object>> f9817i;

    /* renamed from: j  reason: collision with root package name */
    public final o<a<T>> f9818j;

    /* compiled from: SingleProcessDataStore.kt */
    public static abstract class a<T> {

        /* renamed from: f2.p$a$a  reason: collision with other inner class name */
        /* compiled from: SingleProcessDataStore.kt */
        public static final class C0104a<T> extends a<T> {

            /* renamed from: a  reason: collision with root package name */
            public final a0<T> f9819a;

            public C0104a(a0<T> a0Var) {
                this.f9819a = a0Var;
            }
        }

        /* compiled from: SingleProcessDataStore.kt */
        public static final class b<T> extends a<T> {

            /* renamed from: a  reason: collision with root package name */
            public final rk.p<T, ik.d<? super T>, Object> f9820a;

            /* renamed from: b  reason: collision with root package name */
            public final r<T> f9821b;

            /* renamed from: c  reason: collision with root package name */
            public final a0<T> f9822c;

            /* renamed from: d  reason: collision with root package name */
            public final ik.f f9823d;

            public b(rk.p pVar, s sVar, a0 a0Var, ik.f fVar) {
                j.f(fVar, "callerContext");
                this.f9820a = pVar;
                this.f9821b = sVar;
                this.f9822c = a0Var;
                this.f9823d = fVar;
            }
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    public static final class b extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        public final FileOutputStream f9824a;

        public b(FileOutputStream fileOutputStream) {
            this.f9824a = fileOutputStream;
        }

        public final void close() {
        }

        public final void flush() {
            this.f9824a.flush();
        }

        public final void write(int i10) {
            this.f9824a.write(i10);
        }

        public final void write(byte[] bArr) {
            j.f(bArr, "b");
            this.f9824a.write(bArr);
        }

        public final void write(byte[] bArr, int i10, int i11) {
            j.f(bArr, "bytes");
            this.f9824a.write(bArr, i10, i11);
        }
    }

    @kk.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {322, 348, 505}, m = "readAndInit")
    /* compiled from: SingleProcessDataStore.kt */
    public static final class c extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public p f9825a;

        /* renamed from: b  reason: collision with root package name */
        public Object f9826b;

        /* renamed from: c  reason: collision with root package name */
        public Serializable f9827c;

        /* renamed from: d  reason: collision with root package name */
        public Object f9828d;

        /* renamed from: e  reason: collision with root package name */
        public d f9829e;

        /* renamed from: f  reason: collision with root package name */
        public Iterator f9830f;

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f9831n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ p<T> f9832o;

        /* renamed from: p  reason: collision with root package name */
        public int f9833p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(p<T> pVar, ik.d<? super c> dVar) {
            super(dVar);
            this.f9832o = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9831n = obj;
            this.f9833p |= Integer.MIN_VALUE;
            p<T> pVar = this.f9832o;
            LinkedHashSet linkedHashSet = p.f9807k;
            return pVar.e(this);
        }
    }

    /* compiled from: SingleProcessDataStore.kt */
    public static final class d implements j<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ il.a f9834a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ q f9835b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ sk.r<T> f9836c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ p<T> f9837d;

        public d(il.a aVar, q qVar, sk.r<T> rVar, p<T> pVar) {
            this.f9834a = aVar;
            this.f9835b = qVar;
            this.f9836c = rVar;
            this.f9837d = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0093 A[Catch:{ all -> 0x00d4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00b3 A[Catch:{ all -> 0x0054 }] */
        /* JADX WARNING: Removed duplicated region for block: B:42:0x00c9 A[Catch:{ all -> 0x0039 }] */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00d6 A[SYNTHETIC, Splitter:B:49:0x00d6] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object a(f2.f r11, ik.d r12) {
            /*
                r10 = this;
                boolean r0 = r12 instanceof f2.x
                if (r0 == 0) goto L_0x0013
                r0 = r12
                f2.x r0 = (f2.x) r0
                int r1 = r0.f9891o
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f9891o = r1
                goto L_0x0018
            L_0x0013:
                f2.x r0 = new f2.x
                r0.<init>(r10, r12)
            L_0x0018:
                java.lang.Object r12 = r0.f9889f
                jk.a r1 = jk.a.COROUTINE_SUSPENDED
                int r2 = r0.f9891o
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L_0x006c
                if (r2 == r5) goto L_0x0057
                if (r2 == r4) goto L_0x0044
                if (r2 != r3) goto L_0x003c
                java.lang.Object r11 = r0.f9886c
                java.lang.Object r1 = r0.f9885b
                sk.r r1 = (sk.r) r1
                java.lang.Object r0 = r0.f9884a
                il.a r0 = (il.a) r0
                p3.l0.Q0(r12)     // Catch:{ all -> 0x0039 }
                goto L_0x00c5
            L_0x0039:
                r11 = move-exception
                goto L_0x00d0
            L_0x003c:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r12)
                throw r11
            L_0x0044:
                java.lang.Object r11 = r0.f9886c
                f2.p r11 = (f2.p) r11
                java.lang.Object r2 = r0.f9885b
                sk.r r2 = (sk.r) r2
                java.lang.Object r4 = r0.f9884a
                il.a r4 = (il.a) r4
                p3.l0.Q0(r12)     // Catch:{ all -> 0x0054 }
                goto L_0x00ab
            L_0x0054:
                r11 = move-exception
                goto L_0x00d2
            L_0x0057:
                f2.p r11 = r0.f9888e
                sk.r r2 = r0.f9887d
                java.lang.Object r5 = r0.f9886c
                sk.q r5 = (sk.q) r5
                java.lang.Object r7 = r0.f9885b
                il.a r7 = (il.a) r7
                java.lang.Object r8 = r0.f9884a
                rk.p r8 = (rk.p) r8
                p3.l0.Q0(r12)
                r12 = r7
                goto L_0x008f
            L_0x006c:
                p3.l0.Q0(r12)
                il.a r12 = r10.f9834a
                sk.q r2 = r10.f9835b
                sk.r<T> r7 = r10.f9836c
                f2.p<T> r8 = r10.f9837d
                r0.f9884a = r11
                r0.f9885b = r12
                r0.f9886c = r2
                r0.f9887d = r7
                r0.f9888e = r8
                r0.f9891o = r5
                java.lang.Object r5 = r12.a(r0)
                if (r5 != r1) goto L_0x008a
                return r1
            L_0x008a:
                r5 = r2
                r2 = r7
                r9 = r8
                r8 = r11
                r11 = r9
            L_0x008f:
                boolean r5 = r5.f22930a     // Catch:{ all -> 0x00d4 }
                if (r5 != 0) goto L_0x00d6
                T r5 = r2.f22931a     // Catch:{ all -> 0x00d4 }
                r0.f9884a = r12     // Catch:{ all -> 0x00d4 }
                r0.f9885b = r2     // Catch:{ all -> 0x00d4 }
                r0.f9886c = r11     // Catch:{ all -> 0x00d4 }
                r0.f9887d = r6     // Catch:{ all -> 0x00d4 }
                r0.f9888e = r6     // Catch:{ all -> 0x00d4 }
                r0.f9891o = r4     // Catch:{ all -> 0x00d4 }
                java.lang.Object r4 = r8.invoke(r5, r0)     // Catch:{ all -> 0x00d4 }
                if (r4 != r1) goto L_0x00a8
                return r1
            L_0x00a8:
                r9 = r4
                r4 = r12
                r12 = r9
            L_0x00ab:
                T r5 = r2.f22931a     // Catch:{ all -> 0x0054 }
                boolean r5 = sk.j.a(r12, r5)     // Catch:{ all -> 0x0054 }
                if (r5 != 0) goto L_0x00c9
                r0.f9884a = r4     // Catch:{ all -> 0x0054 }
                r0.f9885b = r2     // Catch:{ all -> 0x0054 }
                r0.f9886c = r12     // Catch:{ all -> 0x0054 }
                r0.f9891o = r3     // Catch:{ all -> 0x0054 }
                java.lang.Object r11 = r11.k(r12, r0)     // Catch:{ all -> 0x0054 }
                if (r11 != r1) goto L_0x00c2
                return r1
            L_0x00c2:
                r11 = r12
                r1 = r2
                r0 = r4
            L_0x00c5:
                r1.f22931a = r11     // Catch:{ all -> 0x0039 }
                r2 = r1
                goto L_0x00ca
            L_0x00c9:
                r0 = r4
            L_0x00ca:
                T r11 = r2.f22931a     // Catch:{ all -> 0x0039 }
                r0.b(r6)
                return r11
            L_0x00d0:
                r12 = r0
                goto L_0x00de
            L_0x00d2:
                r12 = r4
                goto L_0x00de
            L_0x00d4:
                r11 = move-exception
                goto L_0x00de
            L_0x00d6:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00d4 }
                java.lang.String r0 = "InitializerApi.updateData should not be called after initialization is complete."
                r11.<init>(r0)     // Catch:{ all -> 0x00d4 }
                throw r11     // Catch:{ all -> 0x00d4 }
            L_0x00de:
                r12.b(r6)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: f2.p.d.a(f2.f, ik.d):java.lang.Object");
        }
    }

    @kk.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {302}, m = "readAndInitOrPropagateAndThrowFailure")
    /* compiled from: SingleProcessDataStore.kt */
    public static final class e extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public p f9838a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f9839b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p<T> f9840c;

        /* renamed from: d  reason: collision with root package name */
        public int f9841d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(p<T> pVar, ik.d<? super e> dVar) {
            super(dVar);
            this.f9840c = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9839b = obj;
            this.f9841d |= Integer.MIN_VALUE;
            p<T> pVar = this.f9840c;
            LinkedHashSet linkedHashSet = p.f9807k;
            return pVar.f(this);
        }
    }

    @kk.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {311}, m = "readAndInitOrPropagateFailure")
    /* compiled from: SingleProcessDataStore.kt */
    public static final class f extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public p f9842a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f9843b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ p<T> f9844c;

        /* renamed from: d  reason: collision with root package name */
        public int f9845d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(p<T> pVar, ik.d<? super f> dVar) {
            super(dVar);
            this.f9844c = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9843b = obj;
            this.f9845d |= Integer.MIN_VALUE;
            p<T> pVar = this.f9844c;
            LinkedHashSet linkedHashSet = p.f9807k;
            return pVar.g(this);
        }
    }

    @kk.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {381}, m = "readData")
    /* compiled from: SingleProcessDataStore.kt */
    public static final class g extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public p f9846a;

        /* renamed from: b  reason: collision with root package name */
        public FileInputStream f9847b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f9848c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ p<T> f9849d;

        /* renamed from: e  reason: collision with root package name */
        public int f9850e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(p<T> pVar, ik.d<? super g> dVar) {
            super(dVar);
            this.f9849d = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9848c = obj;
            this.f9850e |= Integer.MIN_VALUE;
            p<T> pVar = this.f9849d;
            LinkedHashSet linkedHashSet = p.f9807k;
            return pVar.h(this);
        }
    }

    @kk.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {359, 362, 365}, m = "readDataOrHandleCorruption")
    /* compiled from: SingleProcessDataStore.kt */
    public static final class h extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public Object f9851a;

        /* renamed from: b  reason: collision with root package name */
        public Object f9852b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f9853c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ p<T> f9854d;

        /* renamed from: e  reason: collision with root package name */
        public int f9855e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(p<T> pVar, ik.d<? super h> dVar) {
            super(dVar);
            this.f9854d = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9853c = obj;
            this.f9855e |= Integer.MIN_VALUE;
            p<T> pVar = this.f9854d;
            LinkedHashSet linkedHashSet = p.f9807k;
            return pVar.i(this);
        }
    }

    @kk.e(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", l = {426}, m = "writeData$datastore_core")
    /* compiled from: SingleProcessDataStore.kt */
    public static final class i extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public p f9856a;

        /* renamed from: b  reason: collision with root package name */
        public File f9857b;

        /* renamed from: c  reason: collision with root package name */
        public FileOutputStream f9858c;

        /* renamed from: d  reason: collision with root package name */
        public FileOutputStream f9859d;

        /* renamed from: e  reason: collision with root package name */
        public /* synthetic */ Object f9860e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ p<T> f9861f;

        /* renamed from: n  reason: collision with root package name */
        public int f9862n;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(p<T> pVar, ik.d<? super i> dVar) {
            super(dVar);
            this.f9861f = pVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f9860e = obj;
            this.f9862n |= Integer.MIN_VALUE;
            return this.f9861f.k(null, this);
        }
    }

    public p(i2.d dVar, List list, g0 g0Var, d0 d0Var) {
        i2.g gVar = i2.g.f11028a;
        this.f9809a = dVar;
        this.f9810b = gVar;
        this.f9811c = g0Var;
        this.f9812d = d0Var;
        Object obj = b0.f9776a;
        this.f9816h = new z(obj == null ? g0.f19020c : obj);
        this.f9817i = fk.p.Z0(list);
        this.f9818j = new o<>(d0Var, new q(this), r.f9864a, new s(this, (ik.d<? super s>) null));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object c(f2.p r8, f2.p.a.b r9, ik.d r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof f2.w
            if (r0 == 0) goto L_0x0016
            r0 = r10
            f2.w r0 = (f2.w) r0
            int r1 = r0.f9883f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.f9883f = r1
            goto L_0x001b
        L_0x0016:
            f2.w r0 = new f2.w
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.f9881d
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f9883f
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004d
            if (r2 == r5) goto L_0x0041
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            goto L_0x0041
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0035:
            al.r r8 = r0.f9880c
            f2.p r9 = r0.f9879b
            java.lang.Object r2 = r0.f9878a
            f2.p$a$b r2 = (f2.p.a.b) r2
            p3.l0.Q0(r10)     // Catch:{ all -> 0x004a }
            goto L_0x0091
        L_0x0041:
            java.lang.Object r8 = r0.f9878a
            al.r r8 = (al.r) r8
            p3.l0.Q0(r10)     // Catch:{ all -> 0x004a }
            goto L_0x00c3
        L_0x004a:
            r9 = move-exception
            goto L_0x00bf
        L_0x004d:
            p3.l0.Q0(r10)
            al.r<T> r10 = r9.f9821b
            dl.z r2 = r8.f9816h     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r2.h()     // Catch:{ all -> 0x00bc }
            f2.a0 r2 = (f2.a0) r2     // Catch:{ all -> 0x00bc }
            boolean r6 = r2 instanceof f2.b     // Catch:{ all -> 0x00bc }
            if (r6 == 0) goto L_0x0072
            rk.p<T, ik.d<? super T>, java.lang.Object> r2 = r9.f9820a     // Catch:{ all -> 0x00bc }
            ik.f r9 = r9.f9823d     // Catch:{ all -> 0x00bc }
            r0.f9878a = r10     // Catch:{ all -> 0x00bc }
            r0.f9883f = r5     // Catch:{ all -> 0x00bc }
            java.lang.Object r8 = r8.j(r0, r9, r2)     // Catch:{ all -> 0x00bc }
            if (r8 != r1) goto L_0x006e
            goto L_0x00d2
        L_0x006e:
            r7 = r10
            r10 = r8
            r8 = r7
            goto L_0x00c3
        L_0x0072:
            boolean r6 = r2 instanceof f2.k     // Catch:{ all -> 0x00bc }
            if (r6 == 0) goto L_0x0077
            goto L_0x0079
        L_0x0077:
            boolean r5 = r2 instanceof f2.b0     // Catch:{ all -> 0x00bc }
        L_0x0079:
            if (r5 == 0) goto L_0x00ad
            f2.a0<T> r5 = r9.f9822c     // Catch:{ all -> 0x00bc }
            if (r2 != r5) goto L_0x00a8
            r0.f9878a = r9     // Catch:{ all -> 0x00bc }
            r0.f9879b = r8     // Catch:{ all -> 0x00bc }
            r0.f9880c = r10     // Catch:{ all -> 0x00bc }
            r0.f9883f = r4     // Catch:{ all -> 0x00bc }
            java.lang.Object r2 = r8.f(r0)     // Catch:{ all -> 0x00bc }
            if (r2 != r1) goto L_0x008e
            goto L_0x00d2
        L_0x008e:
            r2 = r9
            r9 = r8
            r8 = r10
        L_0x0091:
            rk.p<T, ik.d<? super T>, java.lang.Object> r10 = r2.f9820a     // Catch:{ all -> 0x00a5 }
            ik.f r2 = r2.f9823d     // Catch:{ all -> 0x00a5 }
            r0.f9878a = r8     // Catch:{ all -> 0x00a5 }
            r4 = 0
            r0.f9879b = r4     // Catch:{ all -> 0x00a5 }
            r0.f9880c = r4     // Catch:{ all -> 0x00a5 }
            r0.f9883f = r3     // Catch:{ all -> 0x00a5 }
            java.lang.Object r10 = r9.j(r0, r2, r10)     // Catch:{ all -> 0x00a5 }
            if (r10 != r1) goto L_0x00c3
            goto L_0x00d2
        L_0x00a5:
            r9 = move-exception
            r10 = r8
            goto L_0x00be
        L_0x00a8:
            f2.k r2 = (f2.k) r2     // Catch:{ all -> 0x00bc }
            java.lang.Throwable r8 = r2.f9796a     // Catch:{ all -> 0x00bc }
            throw r8     // Catch:{ all -> 0x00bc }
        L_0x00ad:
            boolean r8 = r2 instanceof f2.i     // Catch:{ all -> 0x00bc }
            if (r8 == 0) goto L_0x00b6
            f2.i r2 = (f2.i) r2     // Catch:{ all -> 0x00bc }
            java.lang.Throwable r8 = r2.f9795a     // Catch:{ all -> 0x00bc }
            throw r8     // Catch:{ all -> 0x00bc }
        L_0x00b6:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x00bc }
            r8.<init>()     // Catch:{ all -> 0x00bc }
            throw r8     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r8 = move-exception
            r9 = r8
        L_0x00be:
            r8 = r10
        L_0x00bf:
            ek.f$a r10 = p3.l0.A(r9)
        L_0x00c3:
            java.lang.Throwable r9 = ek.f.a(r10)
            if (r9 != 0) goto L_0x00cd
            r8.B(r10)
            goto L_0x00d0
        L_0x00cd:
            r8.z(r9)
        L_0x00d0:
            ek.i r1 = ek.i.f20112a
        L_0x00d2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.p.c(f2.p, f2.p$a$b, ik.d):java.lang.Object");
    }

    public final dl.e<T> a() {
        return this.f9813e;
    }

    public final Object b(rk.p pVar, i.a aVar) {
        s c10 = l0.c();
        this.f9818j.a(new a.b(pVar, c10, (a0) this.f9816h.h(), aVar.getContext()));
        return c10.await(aVar);
    }

    public final File d() {
        return (File) this.f9815g.getValue();
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ff A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(ik.d<? super ek.i> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof f2.p.c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            f2.p$c r0 = (f2.p.c) r0
            int r1 = r0.f9833p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9833p = r1
            goto L_0x0018
        L_0x0013:
            f2.p$c r0 = new f2.p$c
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f9831n
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f9833p
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r2 == 0) goto L_0x0072
            if (r2 == r5) goto L_0x005d
            if (r2 == r4) goto L_0x0046
            if (r2 != r3) goto L_0x003e
            java.lang.Object r1 = r0.f9828d
            il.a r1 = (il.a) r1
            java.io.Serializable r2 = r0.f9827c
            sk.q r2 = (sk.q) r2
            java.lang.Object r3 = r0.f9826b
            sk.r r3 = (sk.r) r3
            f2.p r0 = r0.f9825a
            p3.l0.Q0(r14)
            goto L_0x0103
        L_0x003e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x0046:
            java.util.Iterator r2 = r0.f9830f
            f2.p$d r8 = r0.f9829e
            java.lang.Object r9 = r0.f9828d
            sk.q r9 = (sk.q) r9
            java.io.Serializable r10 = r0.f9827c
            sk.r r10 = (sk.r) r10
            java.lang.Object r11 = r0.f9826b
            il.a r11 = (il.a) r11
            f2.p r12 = r0.f9825a
            p3.l0.Q0(r14)
            goto L_0x00c8
        L_0x005d:
            java.lang.Object r2 = r0.f9828d
            sk.r r2 = (sk.r) r2
            java.io.Serializable r8 = r0.f9827c
            sk.r r8 = (sk.r) r8
            java.lang.Object r9 = r0.f9826b
            il.a r9 = (il.a) r9
            f2.p r10 = r0.f9825a
            p3.l0.Q0(r14)
            r11 = r9
            r12 = r10
            r10 = r8
            goto L_0x00b2
        L_0x0072:
            p3.l0.Q0(r14)
            dl.z r14 = r13.f9816h
            java.lang.Object r14 = r14.h()
            f2.b0 r2 = f2.b0.f9776a
            boolean r14 = sk.j.a(r14, r2)
            if (r14 != 0) goto L_0x0090
            dl.z r14 = r13.f9816h
            java.lang.Object r14 = r14.h()
            boolean r14 = r14 instanceof f2.k
            if (r14 == 0) goto L_0x008e
            goto L_0x0090
        L_0x008e:
            r14 = r7
            goto L_0x0091
        L_0x0090:
            r14 = r5
        L_0x0091:
            if (r14 == 0) goto L_0x0124
            il.d r14 = new il.d
            r14.<init>(r7)
            sk.r r2 = new sk.r
            r2.<init>()
            r0.f9825a = r13
            r0.f9826b = r14
            r0.f9827c = r2
            r0.f9828d = r2
            r0.f9833p = r5
            java.lang.Object r8 = r13.i(r0)
            if (r8 != r1) goto L_0x00ae
            return r1
        L_0x00ae:
            r12 = r13
            r11 = r14
            r10 = r2
            r14 = r8
        L_0x00b2:
            r2.f22931a = r14
            sk.q r9 = new sk.q
            r9.<init>()
            f2.p$d r8 = new f2.p$d
            r8.<init>(r11, r9, r10, r12)
            java.util.List<? extends rk.p<? super f2.j<T>, ? super ik.d<? super ek.i>, ? extends java.lang.Object>> r14 = r12.f9817i
            if (r14 != 0) goto L_0x00c4
        L_0x00c2:
            r2 = r9
            goto L_0x00e9
        L_0x00c4:
            java.util.Iterator r2 = r14.iterator()
        L_0x00c8:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00c2
            java.lang.Object r14 = r2.next()
            rk.p r14 = (rk.p) r14
            r0.f9825a = r12
            r0.f9826b = r11
            r0.f9827c = r10
            r0.f9828d = r9
            r0.f9829e = r8
            r0.f9830f = r2
            r0.f9833p = r4
            java.lang.Object r14 = r14.invoke(r8, r0)
            if (r14 != r1) goto L_0x00c8
            return r1
        L_0x00e9:
            r12.f9817i = r6
            r0.f9825a = r12
            r0.f9826b = r10
            r0.f9827c = r2
            r0.f9828d = r11
            r0.f9829e = r6
            r0.f9830f = r6
            r0.f9833p = r3
            java.lang.Object r14 = r11.a(r0)
            if (r14 != r1) goto L_0x0100
            return r1
        L_0x0100:
            r3 = r10
            r1 = r11
            r0 = r12
        L_0x0103:
            r2.f22930a = r5     // Catch:{ all -> 0x011f }
            ek.i r14 = ek.i.f20112a     // Catch:{ all -> 0x011f }
            r1.b(r6)
            dl.z r14 = r0.f9816h
            f2.b r0 = new f2.b
            T r1 = r3.f22931a
            if (r1 == 0) goto L_0x0116
            int r7 = r1.hashCode()
        L_0x0116:
            r0.<init>(r1, r7)
            r14.setValue(r0)
            ek.i r14 = ek.i.f20112a
            return r14
        L_0x011f:
            r14 = move-exception
            r1.b(r6)
            throw r14
        L_0x0124:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.p.e(ik.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(ik.d<? super ek.i> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof f2.p.e
            if (r0 == 0) goto L_0x0013
            r0 = r5
            f2.p$e r0 = (f2.p.e) r0
            int r1 = r0.f9841d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9841d = r1
            goto L_0x0018
        L_0x0013:
            f2.p$e r0 = new f2.p$e
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f9839b
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f9841d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            f2.p r0 = r0.f9838a
            p3.l0.Q0(r5)     // Catch:{ all -> 0x0029 }
            goto L_0x0041
        L_0x0029:
            r5 = move-exception
            goto L_0x0046
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            p3.l0.Q0(r5)
            r0.f9838a = r4     // Catch:{ all -> 0x0044 }
            r0.f9841d = r3     // Catch:{ all -> 0x0044 }
            java.lang.Object r5 = r4.e(r0)     // Catch:{ all -> 0x0044 }
            if (r5 != r1) goto L_0x0041
            return r1
        L_0x0041:
            ek.i r5 = ek.i.f20112a
            return r5
        L_0x0044:
            r5 = move-exception
            r0 = r4
        L_0x0046:
            dl.z r0 = r0.f9816h
            f2.k r1 = new f2.k
            r1.<init>(r5)
            r0.setValue(r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.p.f(ik.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object g(ik.d<? super ek.i> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof f2.p.f
            if (r0 == 0) goto L_0x0013
            r0 = r5
            f2.p$f r0 = (f2.p.f) r0
            int r1 = r0.f9845d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9845d = r1
            goto L_0x0018
        L_0x0013:
            f2.p$f r0 = new f2.p$f
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f9843b
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f9845d
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            f2.p r0 = r0.f9842a
            p3.l0.Q0(r5)     // Catch:{ all -> 0x0029 }
            goto L_0x004d
        L_0x0029:
            r5 = move-exception
            goto L_0x0043
        L_0x002b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0033:
            p3.l0.Q0(r5)
            r0.f9842a = r4     // Catch:{ all -> 0x0041 }
            r0.f9845d = r3     // Catch:{ all -> 0x0041 }
            java.lang.Object r5 = r4.e(r0)     // Catch:{ all -> 0x0041 }
            if (r5 != r1) goto L_0x004d
            return r1
        L_0x0041:
            r5 = move-exception
            r0 = r4
        L_0x0043:
            dl.z r0 = r0.f9816h
            f2.k r1 = new f2.k
            r1.<init>(r5)
            r0.setValue(r1)
        L_0x004d:
            ek.i r5 = ek.i.f20112a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.p.g(ik.d):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0058, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        p3.l0.u(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0063, code lost:
        throw r2;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:24:0x0054, B:30:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(ik.d<? super T> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof f2.p.g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            f2.p$g r0 = (f2.p.g) r0
            int r1 = r0.f9850e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9850e = r1
            goto L_0x0018
        L_0x0013:
            f2.p$g r0 = new f2.p$g
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f9848c
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f9850e
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.io.FileInputStream r1 = r0.f9847b
            f2.p r0 = r0.f9846a
            p3.l0.Q0(r5)     // Catch:{ all -> 0x002b }
            goto L_0x0053
        L_0x002b:
            r5 = move-exception
            goto L_0x005e
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            p3.l0.Q0(r5)
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0064 }
            java.io.File r2 = r4.d()     // Catch:{ FileNotFoundException -> 0x0064 }
            r5.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0064 }
            f2.l<T> r2 = r4.f9810b     // Catch:{ all -> 0x005a }
            r0.f9846a = r4     // Catch:{ all -> 0x005a }
            r0.f9847b = r5     // Catch:{ all -> 0x005a }
            r0.f9850e = r3     // Catch:{ all -> 0x005a }
            i2.a r0 = r2.b(r5)     // Catch:{ all -> 0x005a }
            if (r0 != r1) goto L_0x0050
            return r1
        L_0x0050:
            r1 = r5
            r5 = r0
            r0 = r4
        L_0x0053:
            r2 = 0
            p3.l0.u(r1, r2)     // Catch:{ FileNotFoundException -> 0x0058 }
            return r5
        L_0x0058:
            r5 = move-exception
            goto L_0x0066
        L_0x005a:
            r0 = move-exception
            r1 = r5
            r5 = r0
            r0 = r4
        L_0x005e:
            throw r5     // Catch:{ all -> 0x005f }
        L_0x005f:
            r2 = move-exception
            p3.l0.u(r1, r5)     // Catch:{ FileNotFoundException -> 0x0058 }
            throw r2     // Catch:{ FileNotFoundException -> 0x0058 }
        L_0x0064:
            r5 = move-exception
            r0 = r4
        L_0x0066:
            java.io.File r1 = r0.d()
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0077
            f2.l<T> r5 = r0.f9810b
            i2.a r5 = r5.a()
            return r5
        L_0x0077:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.p.h(ik.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(ik.d<? super T> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof f2.p.h
            if (r0 == 0) goto L_0x0013
            r0 = r8
            f2.p$h r0 = (f2.p.h) r0
            int r1 = r0.f9855e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9855e = r1
            goto L_0x0018
        L_0x0013:
            f2.p$h r0 = new f2.p$h
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f9853c
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f9855e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0049
            if (r2 == r4) goto L_0x003d
            if (r2 != r3) goto L_0x0035
            java.lang.Object r1 = r0.f9852b
            java.lang.Object r0 = r0.f9851a
            androidx.datastore.core.CorruptionException r0 = (androidx.datastore.core.CorruptionException) r0
            p3.l0.Q0(r8)     // Catch:{ IOException -> 0x0033 }
            goto L_0x0085
        L_0x0033:
            r8 = move-exception
            goto L_0x0088
        L_0x0035:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003d:
            java.lang.Object r2 = r0.f9852b
            androidx.datastore.core.CorruptionException r2 = (androidx.datastore.core.CorruptionException) r2
            java.lang.Object r4 = r0.f9851a
            f2.p r4 = (f2.p) r4
            p3.l0.Q0(r8)
            goto L_0x0077
        L_0x0049:
            java.lang.Object r2 = r0.f9851a
            f2.p r2 = (f2.p) r2
            p3.l0.Q0(r8)     // Catch:{ CorruptionException -> 0x0051 }
            goto L_0x0061
        L_0x0051:
            r8 = move-exception
            goto L_0x0064
        L_0x0053:
            p3.l0.Q0(r8)
            r0.f9851a = r7     // Catch:{ CorruptionException -> 0x0062 }
            r0.f9855e = r5     // Catch:{ CorruptionException -> 0x0062 }
            java.lang.Object r8 = r7.h(r0)     // Catch:{ CorruptionException -> 0x0062 }
            if (r8 != r1) goto L_0x0061
            return r1
        L_0x0061:
            return r8
        L_0x0062:
            r8 = move-exception
            r2 = r7
        L_0x0064:
            f2.a<T> r5 = r2.f9811c
            r0.f9851a = r2
            r0.f9852b = r8
            r0.f9855e = r4
            java.lang.Object r4 = r5.c(r8)
            if (r4 != r1) goto L_0x0073
            return r1
        L_0x0073:
            r6 = r2
            r2 = r8
            r8 = r4
            r4 = r6
        L_0x0077:
            r0.f9851a = r2     // Catch:{ IOException -> 0x0086 }
            r0.f9852b = r8     // Catch:{ IOException -> 0x0086 }
            r0.f9855e = r3     // Catch:{ IOException -> 0x0086 }
            java.lang.Object r0 = r4.k(r8, r0)     // Catch:{ IOException -> 0x0086 }
            if (r0 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r1 = r8
        L_0x0085:
            return r1
        L_0x0086:
            r8 = move-exception
            r0 = r2
        L_0x0088:
            al.g0.s(r0, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.p.i(ik.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object j(ik.d r8, ik.f r9, rk.p r10) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof f2.y
            if (r0 == 0) goto L_0x0013
            r0 = r8
            f2.y r0 = (f2.y) r0
            int r1 = r0.f9897f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9897f = r1
            goto L_0x0018
        L_0x0013:
            f2.y r0 = new f2.y
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f9895d
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f9897f
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0043
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            java.lang.Object r9 = r0.f9893b
            f2.p r10 = r0.f9892a
            p3.l0.Q0(r8)
            goto L_0x0086
        L_0x002f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0037:
            java.lang.Object r9 = r0.f9894c
            java.lang.Object r10 = r0.f9893b
            f2.b r10 = (f2.b) r10
            f2.p r2 = r0.f9892a
            p3.l0.Q0(r8)
            goto L_0x006b
        L_0x0043:
            p3.l0.Q0(r8)
            dl.z r8 = r7.f9816h
            java.lang.Object r8 = r8.h()
            f2.b r8 = (f2.b) r8
            r8.a()
            T r2 = r8.f9774a
            f2.z r6 = new f2.z
            r6.<init>(r2, r3, r10)
            r0.f9892a = r7
            r0.f9893b = r8
            r0.f9894c = r2
            r0.f9897f = r5
            java.lang.Object r9 = p3.l0.V0(r0, r9, r6)
            if (r9 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r10 = r8
            r8 = r9
            r9 = r2
            r2 = r7
        L_0x006b:
            r10.a()
            boolean r10 = sk.j.a(r9, r8)
            if (r10 == 0) goto L_0x0075
            goto L_0x0098
        L_0x0075:
            r0.f9892a = r2
            r0.f9893b = r8
            r0.f9894c = r3
            r0.f9897f = r4
            java.lang.Object r9 = r2.k(r8, r0)
            if (r9 != r1) goto L_0x0084
            return r1
        L_0x0084:
            r9 = r8
            r10 = r2
        L_0x0086:
            dl.z r8 = r10.f9816h
            f2.b r10 = new f2.b
            if (r9 == 0) goto L_0x0091
            int r0 = r9.hashCode()
            goto L_0x0092
        L_0x0091:
            r0 = 0
        L_0x0092:
            r10.<init>(r9, r0)
            r8.setValue(r10)
        L_0x0098:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.p.j(ik.d, ik.f, rk.p):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a2 A[SYNTHETIC, Splitter:B:35:0x00a2] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object k(T r7, ik.d<? super ek.i> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof f2.p.i
            if (r0 == 0) goto L_0x0013
            r0 = r8
            f2.p$i r0 = (f2.p.i) r0
            int r1 = r0.f9862n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f9862n = r1
            goto L_0x0018
        L_0x0013:
            f2.p$i r0 = new f2.p$i
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f9860e
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f9862n
            r3 = 1
            if (r2 == 0) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.io.FileOutputStream r7 = r0.f9859d
            java.io.FileOutputStream r1 = r0.f9858c
            java.io.File r2 = r0.f9857b
            f2.p r0 = r0.f9856a
            p3.l0.Q0(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0088
        L_0x002f:
            r7 = move-exception
            goto L_0x00c0
        L_0x0032:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003a:
            p3.l0.Q0(r8)
            java.io.File r8 = r6.d()
            java.io.File r2 = r8.getCanonicalFile()
            java.io.File r2 = r2.getParentFile()
            if (r2 != 0) goto L_0x004c
            goto L_0x0055
        L_0x004c:
            r2.mkdirs()
            boolean r2 = r2.isDirectory()
            if (r2 == 0) goto L_0x00d3
        L_0x0055:
            java.io.File r2 = new java.io.File
            java.io.File r8 = r6.d()
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.String r4 = r6.f9814f
            java.lang.String r8 = sk.j.k(r4, r8)
            r2.<init>(r8)
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x00be }
            r8.<init>(r2)     // Catch:{ IOException -> 0x00be }
            f2.l<T> r4 = r6.f9810b     // Catch:{ all -> 0x00c2 }
            f2.p$b r5 = new f2.p$b     // Catch:{ all -> 0x00c2 }
            r5.<init>(r8)     // Catch:{ all -> 0x00c2 }
            r0.f9856a = r6     // Catch:{ all -> 0x00c2 }
            r0.f9857b = r2     // Catch:{ all -> 0x00c2 }
            r0.f9858c = r8     // Catch:{ all -> 0x00c2 }
            r0.f9859d = r8     // Catch:{ all -> 0x00c2 }
            r0.f9862n = r3     // Catch:{ all -> 0x00c2 }
            ek.i r7 = r4.c(r7, r5)     // Catch:{ all -> 0x00c2 }
            if (r7 != r1) goto L_0x0085
            return r1
        L_0x0085:
            r0 = r6
            r7 = r8
            r1 = r7
        L_0x0088:
            r8 = 0
            java.io.FileDescriptor r7 = r7.getFD()     // Catch:{ all -> 0x002f }
            r7.sync()     // Catch:{ all -> 0x002f }
            ek.i r7 = ek.i.f20112a     // Catch:{ all -> 0x002f }
            p3.l0.u(r1, r8)     // Catch:{ IOException -> 0x00be }
            java.io.File r7 = r0.d()     // Catch:{ IOException -> 0x00be }
            boolean r7 = r2.renameTo(r7)     // Catch:{ IOException -> 0x00be }
            if (r7 == 0) goto L_0x00a2
            ek.i r7 = ek.i.f20112a
            return r7
        L_0x00a2:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ IOException -> 0x00be }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00be }
            r8.<init>()     // Catch:{ IOException -> 0x00be }
            java.lang.String r0 = "Unable to rename "
            r8.append(r0)     // Catch:{ IOException -> 0x00be }
            r8.append(r2)     // Catch:{ IOException -> 0x00be }
            java.lang.String r0 = ".This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file."
            r8.append(r0)     // Catch:{ IOException -> 0x00be }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x00be }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00be }
            throw r7     // Catch:{ IOException -> 0x00be }
        L_0x00be:
            r7 = move-exception
            goto L_0x00c9
        L_0x00c0:
            r8 = r1
            goto L_0x00c3
        L_0x00c2:
            r7 = move-exception
        L_0x00c3:
            throw r7     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r0 = move-exception
            p3.l0.u(r8, r7)     // Catch:{ IOException -> 0x00be }
            throw r0     // Catch:{ IOException -> 0x00be }
        L_0x00c9:
            boolean r8 = r2.exists()
            if (r8 == 0) goto L_0x00d2
            r2.delete()
        L_0x00d2:
            throw r7
        L_0x00d3:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r0 = "Unable to create parent directories of "
            java.lang.String r8 = sk.j.k(r8, r0)
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.p.k(java.lang.Object, ik.d):java.lang.Object");
    }
}
