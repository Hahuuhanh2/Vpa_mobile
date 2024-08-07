package y0;

import ek.i;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import nd.o;
import rk.l;
import sk.j;
import sk.k;
import vl.d;

/* compiled from: Snapshot.kt */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final d f17378a = new d(2);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f17379b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static f f17380c;

    /* renamed from: d  reason: collision with root package name */
    public static int f17381d;

    /* renamed from: e  reason: collision with root package name */
    public static final e f17382e = new e();

    /* renamed from: f  reason: collision with root package name */
    public static final ArrayList f17383f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReference<b> f17384g;

    /* compiled from: Snapshot.kt */
    public static final class a extends k implements l<f, i> {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int f17385a = 0;

        static {
            new a();
        }

        public a() {
            super(1);
        }

        public final Object invoke(Object obj) {
            j.f((f) obj, "it");
            return i.f20112a;
        }
    }

    static {
        int i10 = a.f17385a;
        f17380c = f.f17367e;
        f17381d = 1;
        new ArrayList();
        int i11 = f17381d;
        f17381d = i11 + 1;
        b bVar = new b(i11);
        f17380c = f17380c.i(bVar.f17361b);
        AtomicReference<b> atomicReference = new AtomicReference<>(bVar);
        f17384g = atomicReference;
        b bVar2 = atomicReference.get();
        j.e(bVar2, "currentGlobalSnapshot.get()");
        d dVar = bVar2;
        new z.d
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0054: CONSTRUCTOR  (r0v11 ? I:z.d) =  call: z.d.<init>():void type: CONSTRUCTOR in method: y0.g.<clinit>():void, dex: classes.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.util.ArrayList.forEach(ArrayList.java:1259)
            	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
            	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
            	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v11 ?
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 29 more
            */
        /*
            int r0 = y0.g.a.f17385a
            vl.d r0 = new vl.d
            r1 = 2
            r0.<init>((int) r1)
            f17378a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f17379b = r0
            y0.f r0 = y0.f.f17367e
            f17380c = r0
            r0 = 1
            f17381d = r0
            y0.e r0 = new y0.e
            r0.<init>()
            f17382e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            f17383f = r0
            y0.b r0 = new y0.b
            int r1 = f17381d
            int r2 = r1 + 1
            f17381d = r2
            r0.<init>(r1)
            y0.f r1 = f17380c
            int r2 = r0.f17361b
            y0.f r1 = r1.i(r2)
            f17380c = r1
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r1.<init>(r0)
            f17384g = r1
            java.lang.Object r0 = r1.get()
            java.lang.String r1 = "currentGlobalSnapshot.get()"
            sk.j.e(r0, r1)
            y0.d r0 = (y0.d) r0
            z.d r0 = new z.d
            r0.<init>()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.g.<clinit>():void");
    }

    public static final <T extends o> T a(T t10) {
        T c10;
        j.f(t10, "r");
        d b10 = b();
        T c11 = c(t10, b10.f17361b, b10.f17360a);
        if (c11 != null) {
            return c11;
        }
        synchronized (f17379b) {
            d b11 = b();
            c10 = c(t10, b11.f17361b, b11.f17360a);
        }
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: y0.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final y0.d b() {
        /*
            vl.d r0 = f17378a
            java.lang.Object r0 = r0.f23362b
            java.util.concurrent.atomic.AtomicReference r0 = (java.util.concurrent.atomic.AtomicReference) r0
            java.lang.Object r0 = r0.get()
            x0.a r0 = (x0.a) r0
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            long r1 = r1.getId()
            int r3 = r0.f16854a
            r4 = -1
            int r3 = r3 + r4
            if (r3 == r4) goto L_0x0047
            r5 = 0
            if (r3 == 0) goto L_0x003a
        L_0x001d:
            if (r5 > r3) goto L_0x0036
            int r4 = r5 + r3
            int r4 = r4 >>> 1
            long[] r6 = r0.f16855b
            r7 = r6[r4]
            long r7 = r7 - r1
            r9 = 0
            int r6 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x0031
            int r5 = r4 + 1
            goto L_0x001d
        L_0x0031:
            if (r6 <= 0) goto L_0x0047
            int r3 = r4 + -1
            goto L_0x001d
        L_0x0036:
            int r5 = r5 + 1
            int r4 = -r5
            goto L_0x0047
        L_0x003a:
            long[] r3 = r0.f16855b
            r6 = r3[r5]
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0044
            r4 = r5
            goto L_0x0047
        L_0x0044:
            if (r1 <= 0) goto L_0x0047
            r4 = -2
        L_0x0047:
            if (r4 < 0) goto L_0x004e
            java.lang.Object[] r0 = r0.f16856c
            r0 = r0[r4]
            goto L_0x004f
        L_0x004e:
            r0 = 0
        L_0x004f:
            y0.d r0 = (y0.d) r0
            if (r0 != 0) goto L_0x0060
            java.util.concurrent.atomic.AtomicReference<y0.b> r0 = f17384g
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = "currentGlobalSnapshot.get()"
            sk.j.e(r0, r1)
            y0.d r0 = (y0.d) r0
        L_0x0060:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.g.b():y0.d");
    }

    public static final <T extends o> T c(T t10, int i10, f fVar) {
        boolean z10;
        T t11 = null;
        while (t10 != null) {
            int i11 = t10.f13582a;
            if (i11 == 0 || i11 > i10 || fVar.g(i11)) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (z10) {
                if (t11 != null && t11.f13582a >= t10.f13582a) {
                    t10 = t11;
                }
                t11 = t10;
            }
            t10 = null;
        }
        if (t11 != null) {
            return t11;
        }
        return null;
    }

    public static final <T extends o> T d(T t10, i iVar) {
        T c10;
        j.f(t10, "<this>");
        j.f(iVar, "state");
        d b10 = b();
        l<Object, i> a10 = b10.a();
        if (a10 != null) {
            a10.invoke(iVar);
        }
        T c11 = c(t10, b10.f17361b, b10.f17360a);
        if (c11 != null) {
            return c11;
        }
        synchronized (f17379b) {
            d b11 = b();
            o a11 = iVar.a();
            j.d(a11, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            c10 = c(a11, b11.f17361b, b11.f17360a);
            if (c10 == null) {
                throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
            }
        }
        return c10;
    }
}
