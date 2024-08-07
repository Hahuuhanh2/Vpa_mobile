package zb;

import f2.h;
import i2.e;
import ik.d;
import kk.c;
import p3.l0;
import rk.p;
import sk.j;

/* compiled from: SettingsCache.kt */
public final class i {
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static final e.a<Boolean> f17945c = new e.a<>("firebase_sessions_enabled");
    @Deprecated

    /* renamed from: d  reason: collision with root package name */
    public static final e.a<Double> f17946d = new e.a<>("firebase_sessions_sampling_rate");
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    public static final e.a<Integer> f17947e = new e.a<>("firebase_sessions_restart_timeout");
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    public static final e.a<Integer> f17948f = new e.a<>("firebase_sessions_cache_duration");
    @Deprecated

    /* renamed from: g  reason: collision with root package name */
    public static final e.a<Long> f17949g = new e.a<>("firebase_sessions_cache_updated_time");

    /* renamed from: a  reason: collision with root package name */
    public final h<e> f17950a;

    /* renamed from: b  reason: collision with root package name */
    public f f17951b;

    @kk.e(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {112}, m = "updateConfigValue")
    /* compiled from: SettingsCache.kt */
    public static final class a<T> extends c {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17952a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ i f17953b;

        /* renamed from: c  reason: collision with root package name */
        public int f17954c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, d<? super a> dVar) {
            super(dVar);
            this.f17953b = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17952a = obj;
            this.f17954c |= Integer.MIN_VALUE;
            i iVar = this.f17953b;
            e.a<Boolean> aVar = i.f17945c;
            return iVar.c((e.a) null, null, this);
        }
    }

    @kk.e(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    /* compiled from: SettingsCache.kt */
    public static final class b extends kk.i implements p<i2.a, d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17955a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ T f17956b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ e.a<T> f17957c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ i f17958d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(e.a aVar, i iVar, Object obj, d dVar) {
            super(2, dVar);
            this.f17956b = obj;
            this.f17957c = aVar;
            this.f17958d = iVar;
        }

        public final d<ek.i> create(Object obj, d<?> dVar) {
            b bVar = new b(this.f17957c, this.f17958d, this.f17956b, dVar);
            bVar.f17955a = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((i2.a) obj, (d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            l0.Q0(obj);
            i2.a aVar2 = (i2.a) this.f17955a;
            T t10 = this.f17956b;
            if (t10 != null) {
                e.a<T> aVar3 = this.f17957c;
                aVar2.getClass();
                j.f(aVar3, "key");
                aVar2.d(aVar3, t10);
            } else {
                e.a<T> aVar4 = this.f17957c;
                aVar2.getClass();
                j.f(aVar4, "key");
                aVar2.b();
                aVar2.f11016a.remove(aVar4);
            }
            i.a(this.f17958d, aVar2);
            return ek.i.f20112a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: al.u} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i(i2.c r8) {
        /*
            r7 = this;
            r7.<init>()
            r7.f17950a = r8
            zb.h r8 = new zb.h
            r0 = 0
            r8.<init>(r7, r0)
            ik.g r1 = ik.g.f20653a
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            ik.e$a r3 = ik.e.a.f20651a
            al.x0 r4 = al.a2.a()
            r5 = 1
            ik.f r1 = al.y.a(r1, r4, r5)
            gl.c r6 = al.r0.f19084a
            if (r1 == r6) goto L_0x002a
            ik.f$b r3 = r1.get(r3)
            if (r3 != 0) goto L_0x002a
            ik.f r1 = r1.plus(r6)
        L_0x002a:
            al.f r3 = new al.f
            r3.<init>(r1, r2, r4)
            r3.k0(r5, r3, r8)
            al.x0 r8 = r3.f19015e     // Catch:{ all -> 0x008c }
            r1 = 0
            if (r8 == 0) goto L_0x003c
            int r2 = al.x0.f19102f     // Catch:{ all -> 0x008c }
            r8.d0(r1)     // Catch:{ all -> 0x008c }
        L_0x003c:
            boolean r8 = java.lang.Thread.interrupted()     // Catch:{ all -> 0x0081 }
            if (r8 != 0) goto L_0x0078
            al.x0 r8 = r3.f19015e     // Catch:{ all -> 0x0081 }
            if (r8 == 0) goto L_0x004b
            long r4 = r8.g0()     // Catch:{ all -> 0x0081 }
            goto L_0x0050
        L_0x004b:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0050:
            boolean r8 = r3.isCompleted()     // Catch:{ all -> 0x0081 }
            if (r8 != 0) goto L_0x005a
            java.util.concurrent.locks.LockSupport.parkNanos(r3, r4)     // Catch:{ all -> 0x0081 }
            goto L_0x003c
        L_0x005a:
            al.x0 r8 = r3.f19015e     // Catch:{ all -> 0x008c }
            if (r8 == 0) goto L_0x0063
            int r2 = al.x0.f19102f     // Catch:{ all -> 0x008c }
            r8.a0(r1)     // Catch:{ all -> 0x008c }
        L_0x0063:
            java.lang.Object r8 = r3.M()
            java.lang.Object r8 = m9.b.d0(r8)
            boolean r1 = r8 instanceof al.u
            if (r1 == 0) goto L_0x0072
            r0 = r8
            al.u r0 = (al.u) r0
        L_0x0072:
            if (r0 != 0) goto L_0x0075
            return
        L_0x0075:
            java.lang.Throwable r8 = r0.f19094a
            throw r8
        L_0x0078:
            java.lang.InterruptedException r8 = new java.lang.InterruptedException     // Catch:{ all -> 0x0081 }
            r8.<init>()     // Catch:{ all -> 0x0081 }
            r3.r(r8)     // Catch:{ all -> 0x0081 }
            throw r8     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r8 = move-exception
            al.x0 r0 = r3.f19015e     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x008b
            int r2 = al.x0.f19102f     // Catch:{ all -> 0x008c }
            r0.a0(r1)     // Catch:{ all -> 0x008c }
        L_0x008b:
            throw r8     // Catch:{ all -> 0x008c }
        L_0x008c:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.i.<init>(i2.c):void");
    }

    public static final void a(i iVar, i2.a aVar) {
        iVar.getClass();
        iVar.f17951b = new f((Boolean) aVar.c(f17945c), (Double) aVar.c(f17946d), (Integer) aVar.c(f17947e), (Integer) aVar.c(f17948f), (Long) aVar.c(f17949g));
    }

    public final boolean b() {
        f fVar = this.f17951b;
        if (fVar != null) {
            Long l10 = fVar.f17932e;
            if (fVar != null) {
                Integer num = fVar.f17931d;
                if (l10 == null || num == null || (System.currentTimeMillis() - l10.longValue()) / ((long) 1000) >= ((long) num.intValue())) {
                    return true;
                }
                return false;
            }
            j.l("sessionConfigs");
            throw null;
        }
        j.l("sessionConfigs");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.lang.Object c(i2.e.a<T> r6, T r7, ik.d<? super ek.i> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof zb.i.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            zb.i$a r0 = (zb.i.a) r0
            int r1 = r0.f17954c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17954c = r1
            goto L_0x0018
        L_0x0013:
            zb.i$a r0 = new zb.i$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f17952a
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f17954c
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            p3.l0.Q0(r8)     // Catch:{ IOException -> 0x0048 }
            goto L_0x004c
        L_0x0027:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002f:
            p3.l0.Q0(r8)
            f2.h<i2.e> r8 = r5.f17950a     // Catch:{ IOException -> 0x0048 }
            zb.i$b r2 = new zb.i$b     // Catch:{ IOException -> 0x0048 }
            r4 = 0
            r2.<init>(r6, r5, r7, r4)     // Catch:{ IOException -> 0x0048 }
            r0.f17954c = r3     // Catch:{ IOException -> 0x0048 }
            i2.f r6 = new i2.f     // Catch:{ IOException -> 0x0048 }
            r6.<init>(r2, r4)     // Catch:{ IOException -> 0x0048 }
            java.lang.Object r6 = r8.b(r6, r0)     // Catch:{ IOException -> 0x0048 }
            if (r6 != r1) goto L_0x004c
            return r1
        L_0x0048:
            r6 = move-exception
            r6.toString()
        L_0x004c:
            ek.i r6 = ek.i.f20112a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.i.c(i2.e$a, java.lang.Object, ik.d):java.lang.Object");
    }
}
