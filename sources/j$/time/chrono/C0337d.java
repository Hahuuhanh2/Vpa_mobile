package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.a;
import j$.time.b;
import j$.time.e;
import j$.time.format.F;
import j$.time.k;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.j;
import j$.time.temporal.l;
import j$.time.temporal.m;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.List;

/* renamed from: j$.time.chrono.d  reason: case insensitive filesystem */
public abstract class C0337d implements o {

    /* renamed from: a  reason: collision with root package name */
    private static final ConcurrentHashMap f18064a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap f18065b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f18066c = 0;

    static {
        new C0334a
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0002: CONSTRUCTOR  (r0v0 ? I:j$.time.chrono.a) =  call: j$.time.chrono.a.<init>():void type: CONSTRUCTOR in method: j$.time.chrono.d.<clinit>():void, dex: classes2.dex
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
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v0 ?
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	... 29 more
            */
        /*
            j$.time.chrono.a r0 = new j$.time.chrono.a
            r0.<init>()
            j$.time.chrono.b r0 = new j$.time.chrono.b
            r0.<init>()
            j$.time.chrono.c r0 = new j$.time.chrono.c
            r0.<init>()
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            f18064a = r0
            j$.util.concurrent.ConcurrentHashMap r0 = new j$.util.concurrent.ConcurrentHashMap
            r0.<init>()
            f18065b = r0
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "ja"
            java.lang.String r2 = "JP"
            r0.<init>(r1, r2, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.C0337d.<clinit>():void");
    }

    protected C0337d() {
    }

    static o K(C0337d dVar, String str) {
        String p10;
        o oVar = (o) f18064a.putIfAbsent(str, dVar);
        if (oVar == null && (p10 = dVar.p()) != null) {
            f18065b.putIfAbsent(p10, dVar);
        }
        return oVar;
    }

    static ChronoLocalDate R(ChronoLocalDate chronoLocalDate, long j10, long j11, long j12) {
        long j13;
        ChronoLocalDate d10 = chronoLocalDate.d(j10, ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        ChronoLocalDate d11 = d10.d(j11, chronoUnit);
        if (j12 > 7) {
            j13 = j12 - 1;
            d11 = d11.d(j13 / 7, chronoUnit);
        } else {
            if (j12 < 1) {
                d11 = d11.d(a.h(j12, 7) / 7, chronoUnit);
                j13 = j12 + 6;
            }
            return d11.E(new l(DayOfWeek.R((int) j12).getValue(), 0));
        }
        j12 = (j13 % 7) + 1;
        return d11.E(new l(DayOfWeek.R((int) j12).getValue(), 0));
    }

    static void m(HashMap hashMap, j$.time.temporal.a aVar, long j10) {
        Long l10 = (Long) hashMap.get(aVar);
        if (l10 == null || l10.longValue() == j10) {
            hashMap.put(aVar, Long.valueOf(j10));
            return;
        }
        throw new e("Conflict found: " + aVar + " " + l10 + " differs from " + aVar + " " + j10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static j$.time.chrono.o t(java.lang.String r4) {
        /*
            if (r4 == 0) goto L_0x00bc
        L_0x0002:
            j$.util.concurrent.ConcurrentHashMap r0 = f18064a
            java.lang.Object r1 = r0.get(r4)
            j$.time.chrono.o r1 = (j$.time.chrono.o) r1
            if (r1 != 0) goto L_0x0014
            j$.util.concurrent.ConcurrentHashMap r1 = f18065b
            java.lang.Object r1 = r1.get(r4)
            j$.time.chrono.o r1 = (j$.time.chrono.o) r1
        L_0x0014:
            if (r1 == 0) goto L_0x0017
            return r1
        L_0x0017:
            java.lang.String r1 = "ISO"
            java.lang.Object r0 = r0.get(r1)
            if (r0 != 0) goto L_0x0077
            j$.time.chrono.r r0 = j$.time.chrono.r.f18082o
            java.lang.String r2 = r0.l()
            K(r0, r2)
            j$.time.chrono.y r0 = j$.time.chrono.y.f18103d
            java.lang.String r2 = r0.l()
            K(r0, r2)
            j$.time.chrono.D r0 = j$.time.chrono.D.f18053d
            java.lang.String r2 = r0.l()
            K(r0, r2)
            j$.time.chrono.J r0 = j$.time.chrono.J.f18060d
            java.lang.String r2 = r0.l()
            K(r0, r2)
            java.lang.Class<j$.time.chrono.d> r0 = j$.time.chrono.C0337d.class
            r2 = 0
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x004e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006c
            java.lang.Object r2 = r0.next()
            j$.time.chrono.d r2 = (j$.time.chrono.C0337d) r2
            java.lang.String r3 = r2.l()
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x004e
            java.lang.String r3 = r2.l()
            K(r2, r3)
            goto L_0x004e
        L_0x006c:
            j$.time.chrono.v r0 = j$.time.chrono.v.f18100d
            java.lang.String r1 = r0.l()
            K(r0, r1)
            r0 = 1
            goto L_0x0078
        L_0x0077:
            r0 = 0
        L_0x0078:
            if (r0 != 0) goto L_0x0002
            java.lang.Class<j$.time.chrono.o> r0 = j$.time.chrono.o.class
            java.util.ServiceLoader r0 = java.util.ServiceLoader.load(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x0084:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r0.next()
            j$.time.chrono.o r1 = (j$.time.chrono.o) r1
            java.lang.String r2 = r1.l()
            boolean r2 = r4.equals(r2)
            if (r2 != 0) goto L_0x00a4
            java.lang.String r2 = r1.p()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x0084
        L_0x00a4:
            return r1
        L_0x00a5:
            j$.time.e r0 = new j$.time.e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown chronology: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x00bc:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "id"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.C0337d.t(java.lang.String):j$.time.chrono.o");
    }

    public ChronoLocalDate A(HashMap hashMap, F f10) {
        HashMap hashMap2 = hashMap;
        F f11 = f10;
        j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
        if (hashMap2.containsKey(aVar)) {
            return k(((Long) hashMap2.remove(aVar)).longValue());
        }
        U(hashMap, f10);
        ChronoLocalDate W = W(hashMap, f10);
        if (W != null) {
            return W;
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.YEAR;
        if (!hashMap2.containsKey(aVar2)) {
            return null;
        }
        j$.time.temporal.a aVar3 = j$.time.temporal.a.MONTH_OF_YEAR;
        if (hashMap2.containsKey(aVar3)) {
            if (hashMap2.containsKey(j$.time.temporal.a.DAY_OF_MONTH)) {
                return V(hashMap, f10);
            }
            j$.time.temporal.a aVar4 = j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH;
            if (hashMap2.containsKey(aVar4)) {
                j$.time.temporal.a aVar5 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (hashMap2.containsKey(aVar5)) {
                    int a10 = w(aVar2).a(((Long) hashMap2.remove(aVar2)).longValue(), aVar2);
                    if (f11 == F.LENIENT) {
                        long h10 = a.h(((Long) hashMap2.remove(aVar3)).longValue(), 1);
                        long h11 = a.h(((Long) hashMap2.remove(aVar4)).longValue(), 1);
                        return O(a10, 1, 1).d(h10, ChronoUnit.MONTHS).d(h11, ChronoUnit.WEEKS).d(a.h(((Long) hashMap2.remove(aVar5)).longValue(), 1), ChronoUnit.DAYS);
                    }
                    int a11 = w(aVar3).a(((Long) hashMap2.remove(aVar3)).longValue(), aVar3);
                    int a12 = w(aVar4).a(((Long) hashMap2.remove(aVar4)).longValue(), aVar4);
                    ChronoLocalDate d10 = O(a10, a11, 1).d((long) ((w(aVar5).a(((Long) hashMap2.remove(aVar5)).longValue(), aVar5) - 1) + ((a12 - 1) * 7)), ChronoUnit.DAYS);
                    if (f11 != F.STRICT || d10.m(aVar3) == a11) {
                        return d10;
                    }
                    throw new e("Strict mode rejected resolved date as it is in a different month");
                }
                j$.time.temporal.a aVar6 = j$.time.temporal.a.DAY_OF_WEEK;
                if (hashMap2.containsKey(aVar6)) {
                    int a13 = w(aVar2).a(((Long) hashMap2.remove(aVar2)).longValue(), aVar2);
                    if (f11 == F.LENIENT) {
                        return R(O(a13, 1, 1), a.h(((Long) hashMap2.remove(aVar3)).longValue(), 1), a.h(((Long) hashMap2.remove(aVar4)).longValue(), 1), a.h(((Long) hashMap2.remove(aVar6)).longValue(), 1));
                    }
                    int a14 = w(aVar3).a(((Long) hashMap2.remove(aVar3)).longValue(), aVar3);
                    ChronoLocalDate E = O(a13, a14, 1).d((long) ((w(aVar4).a(((Long) hashMap2.remove(aVar4)).longValue(), aVar4) - 1) * 7), ChronoUnit.DAYS).E(new l(DayOfWeek.R(w(aVar6).a(((Long) hashMap2.remove(aVar6)).longValue(), aVar6)).getValue(), 0));
                    if (f11 != F.STRICT || E.m(aVar3) == a14) {
                        return E;
                    }
                    throw new e("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_YEAR;
        if (hashMap2.containsKey(aVar7)) {
            int a15 = w(aVar2).a(((Long) hashMap2.remove(aVar2)).longValue(), aVar2);
            if (f11 != F.LENIENT) {
                return r(a15, w(aVar7).a(((Long) hashMap2.remove(aVar7)).longValue(), aVar7));
            }
            return r(a15, 1).d(a.h(((Long) hashMap2.remove(aVar7)).longValue(), 1), ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar8 = j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR;
        if (!hashMap2.containsKey(aVar8)) {
            return null;
        }
        j$.time.temporal.a aVar9 = j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (hashMap2.containsKey(aVar9)) {
            int a16 = w(aVar2).a(((Long) hashMap2.remove(aVar2)).longValue(), aVar2);
            if (f11 == F.LENIENT) {
                long h12 = a.h(((Long) hashMap2.remove(aVar8)).longValue(), 1);
                return r(a16, 1).d(h12, ChronoUnit.WEEKS).d(a.h(((Long) hashMap2.remove(aVar9)).longValue(), 1), ChronoUnit.DAYS);
            }
            int a17 = w(aVar8).a(((Long) hashMap2.remove(aVar8)).longValue(), aVar8);
            ChronoLocalDate d11 = r(a16, 1).d((long) ((w(aVar9).a(((Long) hashMap2.remove(aVar9)).longValue(), aVar9) - 1) + ((a17 - 1) * 7)), ChronoUnit.DAYS);
            if (f11 != F.STRICT || d11.m(aVar2) == a16) {
                return d11;
            }
            throw new e("Strict mode rejected resolved date as it is in a different year");
        }
        j$.time.temporal.a aVar10 = j$.time.temporal.a.DAY_OF_WEEK;
        if (!hashMap2.containsKey(aVar10)) {
            return null;
        }
        int a18 = w(aVar2).a(((Long) hashMap2.remove(aVar2)).longValue(), aVar2);
        if (f11 == F.LENIENT) {
            return R(r(a18, 1), 0, a.h(((Long) hashMap2.remove(aVar8)).longValue(), 1), a.h(((Long) hashMap2.remove(aVar10)).longValue(), 1));
        }
        ChronoLocalDate E2 = r(a18, 1).d((long) ((w(aVar8).a(((Long) hashMap2.remove(aVar8)).longValue(), aVar8) - 1) * 7), ChronoUnit.DAYS).E(new l(DayOfWeek.R(w(aVar10).a(((Long) hashMap2.remove(aVar10)).longValue(), aVar10)).getValue(), 0));
        if (f11 != F.STRICT || E2.m(aVar2) == a18) {
            return E2;
        }
        throw new e("Strict mode rejected resolved date as it is in a different year");
    }

    public C0341h L(j jVar) {
        try {
            return G(jVar).J(k.V(jVar));
        } catch (e e10) {
            StringBuilder b10 = b.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ");
            b10.append(jVar.getClass());
            throw new e(b10.toString(), e10);
        }
    }

    /* access modifiers changed from: package-private */
    public void U(HashMap hashMap, F f10) {
        j$.time.temporal.a aVar = j$.time.temporal.a.PROLEPTIC_MONTH;
        Long l10 = (Long) hashMap.remove(aVar);
        if (l10 != null) {
            if (f10 != F.LENIENT) {
                aVar.V(l10.longValue());
            }
            ChronoLocalDate c10 = o().c(1, j$.time.temporal.a.DAY_OF_MONTH).c(l10.longValue(), aVar);
            j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
            m(hashMap, aVar2, (long) c10.m(aVar2));
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            m(hashMap, aVar3, (long) c10.m(aVar3));
        }
    }

    /* access modifiers changed from: package-private */
    public ChronoLocalDate V(HashMap hashMap, F f10) {
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int a10 = w(aVar).a(((Long) hashMap.remove(aVar)).longValue(), aVar);
        if (f10 == F.LENIENT) {
            long h10 = a.h(((Long) hashMap.remove(j$.time.temporal.a.MONTH_OF_YEAR)).longValue(), 1);
            return O(a10, 1, 1).d(h10, ChronoUnit.MONTHS).d(a.h(((Long) hashMap.remove(j$.time.temporal.a.DAY_OF_MONTH)).longValue(), 1), ChronoUnit.DAYS);
        }
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        int a11 = w(aVar2).a(((Long) hashMap.remove(aVar2)).longValue(), aVar2);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        int a12 = w(aVar3).a(((Long) hashMap.remove(aVar3)).longValue(), aVar3);
        if (f10 != F.SMART) {
            return O(a10, a11, a12);
        }
        try {
            return O(a10, a11, a12);
        } catch (e unused) {
            return O(a10, a11, 1).E(new m(0));
        }
    }

    /* access modifiers changed from: package-private */
    public ChronoLocalDate W(HashMap hashMap, F f10) {
        long j10;
        p pVar;
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR_OF_ERA;
        Long l10 = (Long) hashMap.remove(aVar);
        if (l10 != null) {
            j$.time.temporal.a aVar2 = j$.time.temporal.a.ERA;
            Long l11 = (Long) hashMap.remove(aVar2);
            int a10 = f10 != F.LENIENT ? w(aVar).a(l10.longValue(), aVar) : a.c(l10.longValue());
            if (l11 != null) {
                m(hashMap, j$.time.temporal.a.YEAR, (long) B(z(w(aVar2).a(l11.longValue(), aVar2)), a10));
                return null;
            }
            j$.time.temporal.a aVar3 = j$.time.temporal.a.YEAR;
            if (hashMap.containsKey(aVar3)) {
                pVar = r(w(aVar3).a(((Long) hashMap.get(aVar3)).longValue(), aVar3), 1).M();
            } else if (f10 == F.STRICT) {
                hashMap.put(aVar, l10);
                return null;
            } else {
                List y10 = y();
                if (y10.isEmpty()) {
                    j10 = (long) a10;
                    m(hashMap, aVar3, j10);
                    return null;
                }
                pVar = (p) y10.get(y10.size() - 1);
            }
            j10 = (long) B(pVar, a10);
            m(hashMap, aVar3, j10);
            return null;
        }
        j$.time.temporal.a aVar4 = j$.time.temporal.a.ERA;
        if (!hashMap.containsKey(aVar4)) {
            return null;
        }
        w(aVar4).b(((Long) hashMap.get(aVar4)).longValue(), aVar4);
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0337d) {
            return compareTo((C0337d) obj) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ l().hashCode();
    }

    /* renamed from: n */
    public final int compareTo(o oVar) {
        return l().compareTo(oVar.l());
    }

    public abstract /* synthetic */ ChronoLocalDate o();

    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        return j$.time.chrono.n.V(r0, (j$.time.ZoneOffset) null, j$.time.chrono.C0343j.R(r3, L(r4)));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j$.time.chrono.ChronoZonedDateTime q(j$.time.temporal.j r4) {
        /*
            r3 = this;
            j$.time.ZoneId r0 = j$.time.ZoneId.R(r4)     // Catch:{ e -> 0x001b }
            j$.time.Instant r1 = j$.time.Instant.V(r4)     // Catch:{ e -> 0x000d }
            j$.time.chrono.ChronoZonedDateTime r4 = r3.P(r1, r0)     // Catch:{ e -> 0x000d }
            goto L_0x001a
        L_0x000d:
            j$.time.chrono.h r1 = r3.L(r4)     // Catch:{ e -> 0x001b }
            j$.time.chrono.j r1 = j$.time.chrono.C0343j.R(r3, r1)     // Catch:{ e -> 0x001b }
            r2 = 0
            j$.time.chrono.ChronoZonedDateTime r4 = j$.time.chrono.n.V(r0, r2, r1)     // Catch:{ e -> 0x001b }
        L_0x001a:
            return r4
        L_0x001b:
            r0 = move-exception
            j$.time.e r1 = new j$.time.e
            java.lang.String r2 = "Unable to obtain ChronoZonedDateTime from TemporalAccessor: "
            java.lang.StringBuilder r2 = j$.time.b.b(r2)
            java.lang.Class r4 = r4.getClass()
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.C0337d.q(j$.time.temporal.j):j$.time.chrono.ChronoZonedDateTime");
    }

    public final String toString() {
        return l();
    }
}
