package x2;

import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import c3.c;
import c3.e;
import ek.i;
import fk.r;
import fk.s;
import fk.t;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import sk.j;

/* compiled from: RoomDatabase.kt */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public volatile c3.b f16944a;

    /* renamed from: b  reason: collision with root package name */
    public Executor f16945b;

    /* renamed from: c  reason: collision with root package name */
    public c3.c f16946c;

    /* renamed from: d  reason: collision with root package name */
    public final h f16947d = d();

    /* renamed from: e  reason: collision with root package name */
    public boolean f16948e;

    /* renamed from: f  reason: collision with root package name */
    public List<? extends b> f16949f;

    /* renamed from: g  reason: collision with root package name */
    public LinkedHashMap f16950g = new LinkedHashMap();

    /* renamed from: h  reason: collision with root package name */
    public final ReentrantReadWriteLock f16951h = new ReentrantReadWriteLock();

    /* renamed from: i  reason: collision with root package name */
    public final ThreadLocal<Integer> f16952i = new ThreadLocal<>();

    /* renamed from: j  reason: collision with root package name */
    public final Map<String, Object> f16953j;

    /* renamed from: k  reason: collision with root package name */
    public final LinkedHashMap f16954k;

    /* compiled from: RoomDatabase.kt */
    public static class a<T extends n> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f16955a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f16956b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16957c;

        /* renamed from: d  reason: collision with root package name */
        public final ArrayList f16958d = new ArrayList();

        /* renamed from: e  reason: collision with root package name */
        public final ArrayList f16959e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        public ArrayList f16960f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        public Executor f16961g;

        /* renamed from: h  reason: collision with root package name */
        public Executor f16962h;

        /* renamed from: i  reason: collision with root package name */
        public c.C0050c f16963i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f16964j;

        /* renamed from: k  reason: collision with root package name */
        public int f16965k = 1;

        /* renamed from: l  reason: collision with root package name */
        public boolean f16966l = true;

        /* renamed from: m  reason: collision with root package name */
        public boolean f16967m;

        /* renamed from: n  reason: collision with root package name */
        public long f16968n = -1;

        /* renamed from: o  reason: collision with root package name */
        public final c f16969o = new c();

        /* renamed from: p  reason: collision with root package name */
        public LinkedHashSet f16970p = new LinkedHashSet();

        /* renamed from: q  reason: collision with root package name */
        public HashSet f16971q;

        public a(Context context, Class<T> cls, String str) {
            this.f16955a = context;
            this.f16956b = cls;
            this.f16957c = str;
        }

        public final void a(y2.b... bVarArr) {
            if (this.f16971q == null) {
                this.f16971q = new HashSet();
            }
            for (y2.b bVar : bVarArr) {
                HashSet hashSet = this.f16971q;
                j.c(hashSet);
                hashSet.add(Integer.valueOf(bVar.f17388a));
                HashSet hashSet2 = this.f16971q;
                j.c(hashSet2);
                hashSet2.add(Integer.valueOf(bVar.f17389b));
            }
            this.f16969o.a((y2.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        }

        /* JADX WARNING: Removed duplicated region for block: B:164:0x040f  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00bb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final T b() {
            /*
                r20 = this;
                r0 = r20
                java.util.concurrent.Executor r1 = r0.f16961g
                if (r1 != 0) goto L_0x0011
                java.util.concurrent.Executor r2 = r0.f16962h
                if (r2 != 0) goto L_0x0011
                n.b r1 = n.c.f13297d
                r0.f16962h = r1
                r0.f16961g = r1
                goto L_0x0020
            L_0x0011:
                if (r1 == 0) goto L_0x001a
                java.util.concurrent.Executor r2 = r0.f16962h
                if (r2 != 0) goto L_0x001a
                r0.f16962h = r1
                goto L_0x0020
            L_0x001a:
                if (r1 != 0) goto L_0x0020
                java.util.concurrent.Executor r1 = r0.f16962h
                r0.f16961g = r1
            L_0x0020:
                java.util.HashSet r1 = r0.f16971q
                r2 = 1
                if (r1 == 0) goto L_0x0057
                java.util.Iterator r1 = r1.iterator()
            L_0x0029:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0057
                java.lang.Object r3 = r1.next()
                java.lang.Number r3 = (java.lang.Number) r3
                int r3 = r3.intValue()
                java.util.LinkedHashSet r4 = r0.f16970p
                java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
                boolean r4 = r4.contains(r5)
                r4 = r4 ^ r2
                if (r4 == 0) goto L_0x0047
                goto L_0x0029
            L_0x0047:
                java.lang.String r1 = "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: "
                java.lang.String r1 = android.support.v4.media.a.m(r1, r3)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x0057:
                c3.c$c r1 = r0.f16963i
                if (r1 != 0) goto L_0x0060
                j7.a r1 = new j7.a
                r1.<init>()
            L_0x0060:
                r6 = r1
                java.lang.String r1 = "Required value was null."
                long r3 = r0.f16968n
                r7 = 0
                int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
                if (r3 <= 0) goto L_0x0085
                java.lang.String r2 = r0.f16957c
                if (r2 == 0) goto L_0x0079
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x0079:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create auto-closing database for an in-memory database."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0085:
                x2.b r15 = new x2.b
                android.content.Context r4 = r0.f16955a
                java.lang.String r5 = r0.f16957c
                x2.n$c r7 = r0.f16969o
                java.util.ArrayList r8 = r0.f16958d
                boolean r9 = r0.f16964j
                int r3 = r0.f16965k
                if (r3 == 0) goto L_0x041b
                java.lang.String r14 = "context"
                sk.j.f(r4, r14)
                r10 = 3
                if (r3 == r2) goto L_0x009e
                goto L_0x00b6
            L_0x009e:
                java.lang.String r2 = "activity"
                java.lang.Object r2 = r4.getSystemService(r2)
                boolean r3 = r2 instanceof android.app.ActivityManager
                if (r3 == 0) goto L_0x00ab
                android.app.ActivityManager r2 = (android.app.ActivityManager) r2
                goto L_0x00ac
            L_0x00ab:
                r2 = 0
            L_0x00ac:
                if (r2 == 0) goto L_0x00b5
                boolean r2 = r2.isLowRamDevice()
                if (r2 != 0) goto L_0x00b5
                goto L_0x00b7
            L_0x00b5:
                r3 = 2
            L_0x00b6:
                r10 = r3
            L_0x00b7:
                java.util.concurrent.Executor r11 = r0.f16961g
                if (r11 == 0) goto L_0x040f
                java.util.concurrent.Executor r12 = r0.f16962h
                if (r12 == 0) goto L_0x0403
                boolean r13 = r0.f16966l
                boolean r2 = r0.f16967m
                java.util.LinkedHashSet r3 = r0.f16970p
                r18 = r1
                java.util.ArrayList r1 = r0.f16959e
                r16 = r1
                java.util.ArrayList r1 = r0.f16960f
                r17 = r3
                r3 = r15
                r19 = r14
                r14 = r2
                r2 = r15
                r15 = r17
                r17 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Class<T> r1 = r0.f16956b
                java.lang.String r3 = ".canonicalName"
                java.lang.String r4 = "klass"
                sk.j.f(r1, r4)
                java.lang.Package r4 = r1.getPackage()
                sk.j.c(r4)
                java.lang.String r4 = r4.getName()
                java.lang.String r5 = r1.getCanonicalName()
                sk.j.c(r5)
                java.lang.String r6 = "fullPackage"
                sk.j.e(r4, r6)
                int r6 = r4.length()
                r7 = 0
                if (r6 != 0) goto L_0x0104
                r6 = 1
                goto L_0x0105
            L_0x0104:
                r6 = r7
            L_0x0105:
                if (r6 == 0) goto L_0x0108
                goto L_0x0117
            L_0x0108:
                int r6 = r4.length()
                int r6 = r6 + 1
                java.lang.String r5 = r5.substring(r6)
                java.lang.String r6 = "this as java.lang.String).substring(startIndex)"
                sk.j.e(r5, r6)
            L_0x0117:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r8 = 95
                r9 = 46
                java.lang.String r5 = r5.replace(r9, r8)
                java.lang.String r8 = "this as java.lang.String…replace(oldChar, newChar)"
                sk.j.e(r5, r8)
                r6.append(r5)
                java.lang.String r5 = "_Impl"
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                int r6 = r4.length()     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
                if (r6 != 0) goto L_0x013d
                r6 = 1
                goto L_0x013e
            L_0x013d:
                r6 = r7
            L_0x013e:
                if (r6 == 0) goto L_0x0142
                r4 = r5
                goto L_0x0154
            L_0x0142:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
                r6.<init>()     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
                r6.append(r4)     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
                r6.append(r9)     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
                r6.append(r5)     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
                java.lang.String r4 = r6.toString()     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
            L_0x0154:
                java.lang.ClassLoader r6 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
                r8 = 1
                java.lang.Class r4 = java.lang.Class.forName(r4, r8, r6)     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
                java.lang.String r6 = "null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>"
                sk.j.d(r4, r6)     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
                java.lang.Object r1 = r4.newInstance()     // Catch:{ ClassNotFoundException -> 0x03df, IllegalAccessException -> 0x03c5, InstantiationException -> 0x03ab }
                x2.n r1 = (x2.n) r1
                r1.getClass()
                c3.c r3 = r1.e(r2)
                r1.f16946c = r3
                java.util.Set r3 = r1.h()
                java.util.BitSet r4 = new java.util.BitSet
                r4.<init>()
                java.util.Iterator r3 = r3.iterator()
            L_0x017e:
                boolean r5 = r3.hasNext()
                r6 = -1
                if (r5 == 0) goto L_0x01e3
                java.lang.Object r5 = r3.next()
                java.lang.Class r5 = (java.lang.Class) r5
                java.util.List<y2.a> r8 = r2.f16898o
                int r8 = r8.size()
                int r8 = r8 + r6
                if (r8 < 0) goto L_0x01b0
            L_0x0194:
                int r9 = r8 + -1
                java.util.List<y2.a> r10 = r2.f16898o
                java.lang.Object r10 = r10.get(r8)
                java.lang.Class r10 = r10.getClass()
                boolean r10 = r5.isAssignableFrom(r10)
                if (r10 == 0) goto L_0x01ab
                r4.set(r8)
                r6 = r8
                goto L_0x01b0
            L_0x01ab:
                if (r9 >= 0) goto L_0x01ae
                goto L_0x01b0
            L_0x01ae:
                r8 = r9
                goto L_0x0194
            L_0x01b0:
                if (r6 < 0) goto L_0x01b4
                r8 = 1
                goto L_0x01b5
            L_0x01b4:
                r8 = r7
            L_0x01b5:
                if (r8 == 0) goto L_0x01c3
                java.util.LinkedHashMap r8 = r1.f16950g
                java.util.List<y2.a> r9 = r2.f16898o
                java.lang.Object r6 = r9.get(r6)
                r8.put(r5, r6)
                goto L_0x017e
            L_0x01c3:
                java.lang.String r1 = "A required auto migration spec ("
                java.lang.StringBuilder r1 = android.support.v4.media.a.q(r1)
                java.lang.String r2 = r5.getCanonicalName()
                r1.append(r2)
                java.lang.String r2 = ") is missing in the database configuration."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x01e3:
                java.util.List<y2.a> r3 = r2.f16898o
                int r3 = r3.size()
                int r3 = r3 + r6
                if (r3 < 0) goto L_0x0205
            L_0x01ec:
                int r5 = r3 + -1
                boolean r3 = r4.get(r3)
                if (r3 == 0) goto L_0x01f9
                if (r5 >= 0) goto L_0x01f7
                goto L_0x0205
            L_0x01f7:
                r3 = r5
                goto L_0x01ec
            L_0x01f9:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder."
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x0205:
                java.util.LinkedHashMap r3 = r1.f16950g
                java.util.List r3 = r1.f(r3)
                java.util.Iterator r3 = r3.iterator()
            L_0x020f:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x0252
                java.lang.Object r4 = r3.next()
                y2.b r4 = (y2.b) r4
                x2.n$c r5 = r2.f16887d
                int r8 = r4.f17388a
                int r9 = r4.f17389b
                java.util.LinkedHashMap r5 = r5.f16972a
                java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
                boolean r10 = r5.containsKey(r10)
                if (r10 == 0) goto L_0x0244
                java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
                java.lang.Object r5 = r5.get(r8)
                java.util.Map r5 = (java.util.Map) r5
                if (r5 != 0) goto L_0x023b
                fk.s r5 = fk.s.f20214a
            L_0x023b:
                java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                boolean r5 = r5.containsKey(r8)
                goto L_0x0245
            L_0x0244:
                r5 = r7
            L_0x0245:
                if (r5 != 0) goto L_0x020f
                x2.n$c r5 = r2.f16887d
                r8 = 1
                y2.b[] r8 = new y2.b[r8]
                r8[r7] = r4
                r5.a(r8)
                goto L_0x020f
            L_0x0252:
                r3 = 1
                java.lang.Class<x2.q> r4 = x2.q.class
                c3.c r5 = r1.g()
                java.lang.Object r4 = x2.n.o(r4, r5)
                x2.q r4 = (x2.q) r4
                if (r4 == 0) goto L_0x0263
                r4.f16989a = r2
            L_0x0263:
                java.lang.Class<x2.a> r4 = x2.a.class
                c3.c r5 = r1.g()
                java.lang.Object r4 = x2.n.o(r4, r5)
                x2.a r4 = (x2.a) r4
                if (r4 == 0) goto L_0x027d
                x2.h r4 = r1.f16947d
                r4.getClass()
                java.lang.String r4 = "autoCloser"
                r5 = 0
                sk.j.f(r5, r4)
                goto L_0x027e
            L_0x027d:
                r5 = 0
            L_0x027e:
                int r4 = r2.f16890g
                r8 = 3
                if (r4 != r8) goto L_0x0285
                r4 = r3
                goto L_0x0286
            L_0x0285:
                r4 = r7
            L_0x0286:
                c3.c r8 = r1.g()
                r8.setWriteAheadLoggingEnabled(r4)
                java.util.List<x2.n$b> r4 = r2.f16888e
                r1.f16949f = r4
                java.util.concurrent.Executor r4 = r2.f16891h
                r1.f16945b = r4
                java.util.concurrent.Executor r4 = r2.f16892i
                java.lang.String r8 = "executor"
                sk.j.f(r4, r8)
                java.util.ArrayDeque r4 = new java.util.ArrayDeque
                r4.<init>()
                boolean r4 = r2.f16889f
                r1.f16948e = r4
                android.content.Intent r11 = r2.f16893j
                if (r11 == 0) goto L_0x02d5
                java.lang.String r10 = r2.f16885b
                if (r10 == 0) goto L_0x02cb
                x2.h r12 = r1.f16947d
                android.content.Context r9 = r2.f16884a
                r12.getClass()
                r4 = r19
                sk.j.f(r9, r4)
                x2.j r8 = new x2.j
                x2.n r4 = r12.f16907a
                java.util.concurrent.Executor r13 = r4.f16945b
                if (r13 == 0) goto L_0x02c5
                r8.<init>(r9, r10, r11, r12, r13)
                goto L_0x02d5
            L_0x02c5:
                java.lang.String r1 = "internalQueryExecutor"
                sk.j.l(r1)
                throw r5
            L_0x02cb:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r18.toString()
                r1.<init>(r2)
                throw r1
            L_0x02d5:
                java.util.Map r4 = r1.i()
                java.util.BitSet r5 = new java.util.BitSet
                r5.<init>()
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L_0x02e6:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto L_0x0372
                java.lang.Object r8 = r4.next()
                java.util.Map$Entry r8 = (java.util.Map.Entry) r8
                java.lang.Object r9 = r8.getKey()
                java.lang.Class r9 = (java.lang.Class) r9
                java.lang.Object r8 = r8.getValue()
                java.util.List r8 = (java.util.List) r8
                java.util.Iterator r8 = r8.iterator()
            L_0x0302:
                boolean r10 = r8.hasNext()
                if (r10 == 0) goto L_0x02e6
                java.lang.Object r10 = r8.next()
                java.lang.Class r10 = (java.lang.Class) r10
                java.util.List<java.lang.Object> r11 = r2.f16897n
                int r11 = r11.size()
                int r11 = r11 + r6
                if (r11 < 0) goto L_0x0332
            L_0x0317:
                int r12 = r11 + -1
                java.util.List<java.lang.Object> r13 = r2.f16897n
                java.lang.Object r13 = r13.get(r11)
                java.lang.Class r13 = r13.getClass()
                boolean r13 = r10.isAssignableFrom(r13)
                if (r13 == 0) goto L_0x032d
                r5.set(r11)
                goto L_0x0333
            L_0x032d:
                if (r12 >= 0) goto L_0x0330
                goto L_0x0332
            L_0x0330:
                r11 = r12
                goto L_0x0317
            L_0x0332:
                r11 = r6
            L_0x0333:
                if (r11 < 0) goto L_0x0337
                r12 = r3
                goto L_0x0338
            L_0x0337:
                r12 = r7
            L_0x0338:
                if (r12 == 0) goto L_0x0346
                java.util.LinkedHashMap r12 = r1.f16954k
                java.util.List<java.lang.Object> r13 = r2.f16897n
                java.lang.Object r11 = r13.get(r11)
                r12.put(r10, r11)
                goto L_0x0302
            L_0x0346:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "A required type converter ("
                r1.append(r2)
                r1.append(r10)
                java.lang.String r2 = ") for "
                r1.append(r2)
                java.lang.String r2 = r9.getCanonicalName()
                r1.append(r2)
                java.lang.String r2 = " is missing in the database configuration."
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r1 = r1.toString()
                r2.<init>(r1)
                throw r2
            L_0x0372:
                java.util.List<java.lang.Object> r3 = r2.f16897n
                int r3 = r3.size()
                int r3 = r3 + r6
                if (r3 < 0) goto L_0x03aa
            L_0x037b:
                int r4 = r3 + -1
                boolean r6 = r5.get(r3)
                if (r6 == 0) goto L_0x0388
                if (r4 >= 0) goto L_0x0386
                goto L_0x03aa
            L_0x0386:
                r3 = r4
                goto L_0x037b
            L_0x0388:
                java.util.List<java.lang.Object> r1 = r2.f16897n
                java.lang.Object r1 = r1.get(r3)
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unexpected type converter "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder."
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L_0x03aa:
                return r1
            L_0x03ab:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Failed to create an instance of "
                r4.append(r5)
                r4.append(r1)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                r2.<init>(r1)
                throw r2
            L_0x03c5:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Cannot access the constructor "
                r4.append(r5)
                r4.append(r1)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                r2.<init>(r1)
                throw r2
            L_0x03df:
                java.lang.RuntimeException r2 = new java.lang.RuntimeException
                java.lang.String r3 = "Cannot find implementation for "
                java.lang.StringBuilder r3 = android.support.v4.media.a.q(r3)
                java.lang.String r1 = r1.getCanonicalName()
                r3.append(r1)
                java.lang.String r1 = ". "
                r3.append(r1)
                r3.append(r5)
                java.lang.String r1 = " does not exist"
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L_0x0403:
                r18 = r1
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r18.toString()
                r1.<init>(r2)
                throw r1
            L_0x040f:
                r18 = r1
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = r18.toString()
                r1.<init>(r2)
                throw r1
            L_0x041b:
                r1 = 0
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: x2.n.a.b():x2.n");
        }
    }

    /* compiled from: RoomDatabase.kt */
    public static abstract class b {
        public void a(d3.c cVar) {
        }
    }

    /* compiled from: RoomDatabase.kt */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final LinkedHashMap f16972a = new LinkedHashMap();

        public final void a(y2.b... bVarArr) {
            j.f(bVarArr, "migrations");
            for (y2.b bVar : bVarArr) {
                int i10 = bVar.f17388a;
                int i11 = bVar.f17389b;
                LinkedHashMap linkedHashMap = this.f16972a;
                Integer valueOf = Integer.valueOf(i10);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new TreeMap();
                    linkedHashMap.put(valueOf, obj);
                }
                TreeMap treeMap = (TreeMap) obj;
                if (treeMap.containsKey(Integer.valueOf(i11))) {
                    Objects.toString(treeMap.get(Integer.valueOf(i11)));
                    bVar.toString();
                }
                treeMap.put(Integer.valueOf(i11), bVar);
            }
        }
    }

    /* compiled from: RoomDatabase.kt */
    public interface d {
        void a();
    }

    public n() {
        Map<String, Object> synchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        j.e(synchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f16953j = synchronizedMap;
        this.f16954k = new LinkedHashMap();
    }

    public static Object o(Class cls, c3.c cVar) {
        if (cls.isInstance(cVar)) {
            return cVar;
        }
        if (cVar instanceof c) {
            return o(cls, ((c) cVar).d());
        }
        return null;
    }

    public final void a() {
        boolean z10;
        if (!this.f16948e) {
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10)) {
                throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
            }
        }
    }

    public final void b() {
        boolean z10;
        if (g().P().q0() || this.f16952i.get() == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final void c() {
        a();
        a();
        c3.b P = g().P();
        this.f16947d.e(P);
        if (P.y0()) {
            P.J();
        } else {
            P.k();
        }
    }

    public abstract h d();

    public abstract c3.c e(b bVar);

    public List f(LinkedHashMap linkedHashMap) {
        j.f(linkedHashMap, "autoMigrationSpecs");
        return r.f20213a;
    }

    public final c3.c g() {
        c3.c cVar = this.f16946c;
        if (cVar != null) {
            return cVar;
        }
        j.l("internalOpenHelper");
        throw null;
    }

    public Set<Class<? extends y2.a>> h() {
        return t.f20215a;
    }

    public Map<Class<?>, List<Class<?>>> i() {
        return s.f20214a;
    }

    public final void j() {
        g().P().X();
        if (!g().P().q0()) {
            h hVar = this.f16947d;
            if (hVar.f16912f.compareAndSet(false, true)) {
                Executor executor = hVar.f16907a.f16945b;
                if (executor != null) {
                    executor.execute(hVar.f16919m);
                } else {
                    j.l("internalQueryExecutor");
                    throw null;
                }
            }
        }
    }

    public final void k(d3.c cVar) {
        h hVar = this.f16947d;
        hVar.getClass();
        synchronized (hVar.f16918l) {
            if (!hVar.f16913g) {
                cVar.o("PRAGMA temp_store = MEMORY;");
                cVar.o("PRAGMA recursive_triggers='ON';");
                cVar.o("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                hVar.e(cVar);
                hVar.f16914h = cVar.u("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
                hVar.f16913g = true;
                i iVar = i.f20112a;
            }
        }
    }

    public final Cursor l(e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        if (cancellationSignal != null) {
            return g().P().H0(eVar, cancellationSignal);
        }
        return g().P().j(eVar);
    }

    public final <V> V m(Callable<V> callable) {
        c();
        try {
            V call = callable.call();
            n();
            return call;
        } finally {
            j();
        }
    }

    public final void n() {
        g().P().I();
    }
}
