package yb;

import il.d;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kk.c;
import kk.e;
import sk.j;
import yb.b;

/* compiled from: FirebaseSessionsDependencies.kt */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f17628a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final Map<b.a, C0235a> f17629b = DesugarCollections.synchronizedMap(new LinkedHashMap());

    /* renamed from: yb.a$a  reason: collision with other inner class name */
    /* compiled from: FirebaseSessionsDependencies.kt */
    public static final class C0235a {

        /* renamed from: a  reason: collision with root package name */
        public final il.a f17630a;

        /* renamed from: b  reason: collision with root package name */
        public b f17631b = null;

        public C0235a(d dVar) {
            this.f17630a = dVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0235a)) {
                return false;
            }
            C0235a aVar = (C0235a) obj;
            return j.a(this.f17630a, aVar.f17630a) && j.a(this.f17631b, aVar.f17631b);
        }

        public final int hashCode() {
            int hashCode = this.f17630a.hashCode() * 31;
            b bVar = this.f17631b;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public final String toString() {
            StringBuilder q10 = android.support.v4.media.a.q("Dependency(mutex=");
            q10.append(this.f17630a);
            q10.append(", subscriber=");
            q10.append(this.f17631b);
            q10.append(')');
            return q10.toString();
        }
    }

    @e(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", l = {107}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions")
    /* compiled from: FirebaseSessionsDependencies.kt */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public Map f17632a;

        /* renamed from: b  reason: collision with root package name */
        public Iterator f17633b;

        /* renamed from: c  reason: collision with root package name */
        public b.a f17634c;

        /* renamed from: d  reason: collision with root package name */
        public il.a f17635d;

        /* renamed from: e  reason: collision with root package name */
        public Map f17636e;

        /* renamed from: f  reason: collision with root package name */
        public Object f17637f;

        /* renamed from: n  reason: collision with root package name */
        public /* synthetic */ Object f17638n;

        /* renamed from: o  reason: collision with root package name */
        public final /* synthetic */ a f17639o;

        /* renamed from: p  reason: collision with root package name */
        public int f17640p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(a aVar, ik.d<? super b> dVar) {
            super(dVar);
            this.f17639o = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17638n = obj;
            this.f17640p |= Integer.MIN_VALUE;
            return this.f17639o.c(this);
        }
    }

    public static void a(b.a aVar) {
        Map<b.a, C0235a> map = f17629b;
        if (map.containsKey(aVar)) {
            aVar.toString();
        } else {
            map.put(aVar, new C0235a(new d(true)));
        }
    }

    public static C0235a b(b.a aVar) {
        Map<b.a, C0235a> map = f17629b;
        j.e(map, "dependencies");
        C0235a aVar2 = map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        throw new IllegalStateException("Cannot get dependency " + aVar + ". Dependencies should be added at class load time.");
    }

    public static b d(b.a aVar) {
        j.f(aVar, "subscriberName");
        b bVar = b(aVar).f17631b;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException("Subscriber " + aVar + " has not been registered.");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: yb.b$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(ik.d<? super java.util.Map<yb.b.a, ? extends yb.b>> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof yb.a.b
            if (r0 == 0) goto L_0x0013
            r0 = r10
            yb.a$b r0 = (yb.a.b) r0
            int r1 = r0.f17640p
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17640p = r1
            goto L_0x0018
        L_0x0013:
            yb.a$b r0 = new yb.a$b
            r0.<init>(r9, r10)
        L_0x0018:
            java.lang.Object r10 = r0.f17638n
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f17640p
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r2 = r0.f17637f
            java.util.Map r4 = r0.f17636e
            il.a r5 = r0.f17635d
            yb.b$a r6 = r0.f17634c
            java.util.Iterator r7 = r0.f17633b
            java.util.Map r8 = r0.f17632a
            p3.l0.Q0(r10)
            goto L_0x0091
        L_0x0033:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L_0x003b:
            p3.l0.Q0(r10)
            java.util.Map<yb.b$a, yb.a$a> r10 = f17629b
            java.lang.String r2 = "dependencies"
            sk.j.e(r10, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r4 = r10.size()
            int r4 = al.g0.d0(r4)
            r2.<init>(r4)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r7 = r10
            r4 = r2
        L_0x005c:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00a3
            java.lang.Object r10 = r7.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r2 = r10.getKey()
            java.lang.Object r5 = r10.getKey()
            r6 = r5
            yb.b$a r6 = (yb.b.a) r6
            java.lang.Object r10 = r10.getValue()
            yb.a$a r10 = (yb.a.C0235a) r10
            il.a r5 = r10.f17630a
            r0.f17632a = r4
            r0.f17633b = r7
            r0.f17634c = r6
            r0.f17635d = r5
            r0.f17636e = r4
            r0.f17637f = r2
            r0.f17640p = r3
            java.lang.Object r10 = r5.a(r0)
            if (r10 != r1) goto L_0x0090
            return r1
        L_0x0090:
            r8 = r4
        L_0x0091:
            r10 = 0
            yb.b r6 = d(r6)     // Catch:{ all -> 0x009e }
            r5.b(r10)
            r4.put(r2, r6)
            r4 = r8
            goto L_0x005c
        L_0x009e:
            r0 = move-exception
            r5.b(r10)
            throw r0
        L_0x00a3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yb.a.c(ik.d):java.lang.Object");
    }
}
