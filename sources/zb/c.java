package zb;

import ik.f;
import il.d;
import java.util.regex.Pattern;
import kk.e;
import kk.i;
import org.json.JSONObject;
import p3.l0;
import rk.p;
import sk.j;
import sk.r;

/* compiled from: RemoteSettings.kt */
public final class c implements j {

    /* renamed from: a  reason: collision with root package name */
    public final f f17903a;

    /* renamed from: b  reason: collision with root package name */
    public final ab.c f17904b;

    /* renamed from: c  reason: collision with root package name */
    public final xb.b f17905c;

    /* renamed from: d  reason: collision with root package name */
    public final a f17906d;

    /* renamed from: e  reason: collision with root package name */
    public final i f17907e;

    /* renamed from: f  reason: collision with root package name */
    public final d f17908f = new d(false);

    @e(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", l = {167, 75, 92}, m = "updateSettings")
    /* compiled from: RemoteSettings.kt */
    public static final class a extends kk.c {

        /* renamed from: a  reason: collision with root package name */
        public Object f17909a;

        /* renamed from: b  reason: collision with root package name */
        public il.a f17910b;

        /* renamed from: c  reason: collision with root package name */
        public /* synthetic */ Object f17911c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ c f17912d;

        /* renamed from: e  reason: collision with root package name */
        public int f17913e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(c cVar, ik.d<? super a> dVar) {
            super(dVar);
            this.f17912d = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17911c = obj;
            this.f17913e |= Integer.MIN_VALUE;
            return this.f17912d.c(this);
        }
    }

    @e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", l = {122, 125, 128, 130, 131, 133}, m = "invokeSuspend")
    /* compiled from: RemoteSettings.kt */
    public static final class b extends i implements p<JSONObject, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public r f17914a;

        /* renamed from: b  reason: collision with root package name */
        public r f17915b;

        /* renamed from: c  reason: collision with root package name */
        public int f17916c;

        /* renamed from: d  reason: collision with root package name */
        public /* synthetic */ Object f17917d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ c f17918e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar, ik.d<? super b> dVar) {
            super(2, dVar);
            this.f17918e = cVar;
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            b bVar = new b(this.f17918e, dVar);
            bVar.f17917d = obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((JSONObject) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d5, code lost:
            r12 = (java.lang.Integer) r7.f22931a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d9, code lost:
            if (r12 == null) goto L_0x00ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x00db, code lost:
            r0 = r11.f17918e;
            r12.intValue();
            r11.f17917d = r1;
            r11.f17914a = r8;
            r11.f17915b = null;
            r11.f17916c = 2;
            r12 = r0.f17907e.c(zb.i.f17947e, (java.lang.Integer) r7.f22931a, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
            if (r12 != jk.a.COROUTINE_SUSPENDED) goto L_0x00fa;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fa, code lost:
            r12 = ek.i.f20112a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00fc, code lost:
            if (r12 != r4) goto L_0x00ff;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fe, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ff, code lost:
            r0 = r8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
            r12 = (java.lang.Double) r1.f22931a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0104, code lost:
            if (r12 == null) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0106, code lost:
            r2 = r11.f17918e;
            r12.doubleValue();
            r11.f17917d = r0;
            r11.f17914a = null;
            r11.f17915b = null;
            r11.f17916c = 3;
            r12 = r2.f17907e.c(zb.i.f17946d, (java.lang.Double) r1.f22931a, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x0122, code lost:
            if (r12 != jk.a.COROUTINE_SUSPENDED) goto L_0x0125;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0125, code lost:
            r12 = ek.i.f20112a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0127, code lost:
            if (r12 != r4) goto L_0x012a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0129, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x012a, code lost:
            r12 = (java.lang.Integer) r0.f22931a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x012e, code lost:
            if (r12 == null) goto L_0x0157;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0130, code lost:
            r1 = r11.f17918e;
            r12.intValue();
            r11.f17917d = null;
            r11.f17914a = null;
            r11.f17915b = null;
            r11.f17916c = 4;
            r12 = r1.f17907e.c(zb.i.f17948f, (java.lang.Integer) r0.f22931a, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x014c, code lost:
            if (r12 != jk.a.COROUTINE_SUSPENDED) goto L_0x014f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x014f, code lost:
            r12 = ek.i.f20112a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0151, code lost:
            if (r12 != r4) goto L_0x0154;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:0x0153, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:0x0154, code lost:
            r12 = ek.i.f20112a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x0157, code lost:
            r12 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x0158, code lost:
            if (r12 != null) goto L_0x017f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x015a, code lost:
            r12 = r11.f17918e.f17907e;
            r1 = new java.lang.Integer(86400);
            r11.f17917d = null;
            r11.f17914a = null;
            r11.f17915b = null;
            r11.f17916c = 5;
            r12 = r12.c(zb.i.f17948f, r1, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:66:0x0177, code lost:
            if (r12 != jk.a.COROUTINE_SUSPENDED) goto L_0x017a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x017a, code lost:
            r12 = ek.i.f20112a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x017c, code lost:
            if (r12 != r4) goto L_0x017f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:69:0x017e, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:70:0x017f, code lost:
            r12 = r11.f17918e.f17907e;
            r2 = new java.lang.Long(java.lang.System.currentTimeMillis());
            r11.f17917d = null;
            r11.f17914a = null;
            r11.f17915b = null;
            r11.f17916c = 6;
            r12 = r12.c(zb.i.f17949g, r2, r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:0x019d, code lost:
            if (r12 != jk.a.COROUTINE_SUSPENDED) goto L_0x01a0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:72:0x01a0, code lost:
            r12 = ek.i.f20112a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:73:0x01a2, code lost:
            if (r12 != r4) goto L_0x01a5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a4, code lost:
            return r4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a7, code lost:
            return ek.i.f20112a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.String r0 = "cache_duration"
                java.lang.String r1 = "session_timeout_seconds"
                java.lang.String r2 = "sampling_rate"
                java.lang.String r3 = "sessions_enabled"
                jk.a r4 = jk.a.COROUTINE_SUSPENDED
                int r5 = r11.f17916c
                r6 = 0
                switch(r5) {
                    case 0: goto L_0x0048;
                    case 1: goto L_0x003b;
                    case 2: goto L_0x0030;
                    case 3: goto L_0x0027;
                    case 4: goto L_0x0022;
                    case 5: goto L_0x001d;
                    case 6: goto L_0x0018;
                    default: goto L_0x0010;
                }
            L_0x0010:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L_0x0018:
                p3.l0.Q0(r12)
                goto L_0x01a5
            L_0x001d:
                p3.l0.Q0(r12)
                goto L_0x017f
            L_0x0022:
                p3.l0.Q0(r12)
                goto L_0x0154
            L_0x0027:
                java.lang.Object r0 = r11.f17917d
                sk.r r0 = (sk.r) r0
                p3.l0.Q0(r12)
                goto L_0x012a
            L_0x0030:
                sk.r r0 = r11.f17914a
                java.lang.Object r1 = r11.f17917d
                sk.r r1 = (sk.r) r1
                p3.l0.Q0(r12)
                goto L_0x0100
            L_0x003b:
                sk.r r0 = r11.f17915b
                sk.r r1 = r11.f17914a
                java.lang.Object r2 = r11.f17917d
                sk.r r2 = (sk.r) r2
                p3.l0.Q0(r12)
                goto L_0x00d0
            L_0x0048:
                p3.l0.Q0(r12)
                java.lang.Object r12 = r11.f17917d
                org.json.JSONObject r12 = (org.json.JSONObject) r12
                sk.r r5 = new sk.r
                r5.<init>()
                sk.r r7 = new sk.r
                r7.<init>()
                sk.r r8 = new sk.r
                r8.<init>()
                java.lang.String r9 = "app_quality"
                boolean r10 = r12.has(r9)
                if (r10 == 0) goto L_0x00aa
                java.lang.Object r12 = r12.get(r9)
                java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                sk.j.d(r12, r9)
                org.json.JSONObject r12 = (org.json.JSONObject) r12
                boolean r9 = r12.has(r3)     // Catch:{ JSONException -> 0x00aa }
                if (r9 == 0) goto L_0x007e
                java.lang.Object r3 = r12.get(r3)     // Catch:{ JSONException -> 0x00aa }
                java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ JSONException -> 0x00aa }
                goto L_0x007f
            L_0x007e:
                r3 = r6
            L_0x007f:
                boolean r9 = r12.has(r2)     // Catch:{ JSONException -> 0x00ab }
                if (r9 == 0) goto L_0x008d
                java.lang.Object r2 = r12.get(r2)     // Catch:{ JSONException -> 0x00ab }
                java.lang.Double r2 = (java.lang.Double) r2     // Catch:{ JSONException -> 0x00ab }
                r5.f22931a = r2     // Catch:{ JSONException -> 0x00ab }
            L_0x008d:
                boolean r2 = r12.has(r1)     // Catch:{ JSONException -> 0x00ab }
                if (r2 == 0) goto L_0x009b
                java.lang.Object r1 = r12.get(r1)     // Catch:{ JSONException -> 0x00ab }
                java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ JSONException -> 0x00ab }
                r7.f22931a = r1     // Catch:{ JSONException -> 0x00ab }
            L_0x009b:
                boolean r1 = r12.has(r0)     // Catch:{ JSONException -> 0x00ab }
                if (r1 == 0) goto L_0x00ab
                java.lang.Object r12 = r12.get(r0)     // Catch:{ JSONException -> 0x00ab }
                java.lang.Integer r12 = (java.lang.Integer) r12     // Catch:{ JSONException -> 0x00ab }
                r8.f22931a = r12     // Catch:{ JSONException -> 0x00ab }
                goto L_0x00ab
            L_0x00aa:
                r3 = r6
            L_0x00ab:
                if (r3 == 0) goto L_0x00d4
                zb.c r12 = r11.f17918e
                r3.booleanValue()
                zb.i r12 = r12.f17907e
                r11.f17917d = r5
                r11.f17914a = r7
                r11.f17915b = r8
                r0 = 1
                r11.f17916c = r0
                i2.e$a<java.lang.Boolean> r0 = zb.i.f17945c
                java.lang.Object r12 = r12.c(r0, r3, r11)
                jk.a r0 = jk.a.COROUTINE_SUSPENDED
                if (r12 != r0) goto L_0x00c8
                goto L_0x00ca
            L_0x00c8:
                ek.i r12 = ek.i.f20112a
            L_0x00ca:
                if (r12 != r4) goto L_0x00cd
                return r4
            L_0x00cd:
                r2 = r5
                r1 = r7
                r0 = r8
            L_0x00d0:
                r8 = r0
                r7 = r1
                r1 = r2
                goto L_0x00d5
            L_0x00d4:
                r1 = r5
            L_0x00d5:
                T r12 = r7.f22931a
                java.lang.Integer r12 = (java.lang.Integer) r12
                if (r12 == 0) goto L_0x00ff
                zb.c r0 = r11.f17918e
                r12.intValue()
                zb.i r12 = r0.f17907e
                T r0 = r7.f22931a
                java.lang.Integer r0 = (java.lang.Integer) r0
                r11.f17917d = r1
                r11.f17914a = r8
                r11.f17915b = r6
                r2 = 2
                r11.f17916c = r2
                i2.e$a<java.lang.Integer> r2 = zb.i.f17947e
                java.lang.Object r12 = r12.c(r2, r0, r11)
                jk.a r0 = jk.a.COROUTINE_SUSPENDED
                if (r12 != r0) goto L_0x00fa
                goto L_0x00fc
            L_0x00fa:
                ek.i r12 = ek.i.f20112a
            L_0x00fc:
                if (r12 != r4) goto L_0x00ff
                return r4
            L_0x00ff:
                r0 = r8
            L_0x0100:
                T r12 = r1.f22931a
                java.lang.Double r12 = (java.lang.Double) r12
                if (r12 == 0) goto L_0x012a
                zb.c r2 = r11.f17918e
                r12.doubleValue()
                zb.i r12 = r2.f17907e
                T r1 = r1.f22931a
                java.lang.Double r1 = (java.lang.Double) r1
                r11.f17917d = r0
                r11.f17914a = r6
                r11.f17915b = r6
                r2 = 3
                r11.f17916c = r2
                i2.e$a<java.lang.Double> r2 = zb.i.f17946d
                java.lang.Object r12 = r12.c(r2, r1, r11)
                jk.a r1 = jk.a.COROUTINE_SUSPENDED
                if (r12 != r1) goto L_0x0125
                goto L_0x0127
            L_0x0125:
                ek.i r12 = ek.i.f20112a
            L_0x0127:
                if (r12 != r4) goto L_0x012a
                return r4
            L_0x012a:
                T r12 = r0.f22931a
                java.lang.Integer r12 = (java.lang.Integer) r12
                if (r12 == 0) goto L_0x0157
                zb.c r1 = r11.f17918e
                r12.intValue()
                zb.i r12 = r1.f17907e
                T r0 = r0.f22931a
                java.lang.Integer r0 = (java.lang.Integer) r0
                r11.f17917d = r6
                r11.f17914a = r6
                r11.f17915b = r6
                r1 = 4
                r11.f17916c = r1
                i2.e$a<java.lang.Integer> r1 = zb.i.f17948f
                java.lang.Object r12 = r12.c(r1, r0, r11)
                jk.a r0 = jk.a.COROUTINE_SUSPENDED
                if (r12 != r0) goto L_0x014f
                goto L_0x0151
            L_0x014f:
                ek.i r12 = ek.i.f20112a
            L_0x0151:
                if (r12 != r4) goto L_0x0154
                return r4
            L_0x0154:
                ek.i r12 = ek.i.f20112a
                goto L_0x0158
            L_0x0157:
                r12 = r6
            L_0x0158:
                if (r12 != 0) goto L_0x017f
                zb.c r12 = r11.f17918e
                zb.i r12 = r12.f17907e
                r0 = 86400(0x15180, float:1.21072E-40)
                java.lang.Integer r1 = new java.lang.Integer
                r1.<init>(r0)
                r11.f17917d = r6
                r11.f17914a = r6
                r11.f17915b = r6
                r0 = 5
                r11.f17916c = r0
                i2.e$a<java.lang.Integer> r0 = zb.i.f17948f
                java.lang.Object r12 = r12.c(r0, r1, r11)
                jk.a r0 = jk.a.COROUTINE_SUSPENDED
                if (r12 != r0) goto L_0x017a
                goto L_0x017c
            L_0x017a:
                ek.i r12 = ek.i.f20112a
            L_0x017c:
                if (r12 != r4) goto L_0x017f
                return r4
            L_0x017f:
                zb.c r12 = r11.f17918e
                zb.i r12 = r12.f17907e
                long r0 = java.lang.System.currentTimeMillis()
                java.lang.Long r2 = new java.lang.Long
                r2.<init>(r0)
                r11.f17917d = r6
                r11.f17914a = r6
                r11.f17915b = r6
                r0 = 6
                r11.f17916c = r0
                i2.e$a<java.lang.Long> r0 = zb.i.f17949g
                java.lang.Object r12 = r12.c(r0, r2, r11)
                jk.a r0 = jk.a.COROUTINE_SUSPENDED
                if (r12 != r0) goto L_0x01a0
                goto L_0x01a2
            L_0x01a0:
                ek.i r12 = ek.i.f20112a
            L_0x01a2:
                if (r12 != r4) goto L_0x01a5
                return r4
            L_0x01a5:
                ek.i r12 = ek.i.f20112a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: zb.c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @e(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", l = {}, m = "invokeSuspend")
    /* renamed from: zb.c$c  reason: collision with other inner class name */
    /* compiled from: RemoteSettings.kt */
    public static final class C0252c extends i implements p<String, ik.d<? super ek.i>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public /* synthetic */ Object f17919a;

        public C0252c(ik.d<? super C0252c> dVar) {
            super(2, dVar);
        }

        public final ik.d<ek.i> create(Object obj, ik.d<?> dVar) {
            C0252c cVar = new C0252c(dVar);
            cVar.f17919a = obj;
            return cVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C0252c) create((String) obj, (ik.d) obj2)).invokeSuspend(ek.i.f20112a);
        }

        public final Object invokeSuspend(Object obj) {
            jk.a aVar = jk.a.COROUTINE_SUSPENDED;
            l0.Q0(obj);
            String str = (String) this.f17919a;
            return ek.i.f20112a;
        }
    }

    public c(f fVar, ab.c cVar, xb.b bVar, e eVar, i2.c cVar2) {
        this.f17903a = fVar;
        this.f17904b = cVar;
        this.f17905c = bVar;
        this.f17906d = eVar;
        this.f17907e = new i(cVar2);
    }

    public static String e(String str) {
        Pattern compile = Pattern.compile("/");
        j.e(compile, "compile(pattern)");
        String replaceAll = compile.matcher(str).replaceAll("");
        j.e(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final Boolean a() {
        f fVar = this.f17907e.f17951b;
        if (fVar != null) {
            return fVar.f17928a;
        }
        j.l("sessionConfigs");
        throw null;
    }

    public final zk.a b() {
        f fVar = this.f17907e.f17951b;
        if (fVar != null) {
            Integer num = fVar.f17930c;
            if (num == null) {
                return null;
            }
            int i10 = zk.a.f23785d;
            return new zk.a(l0.R0(num.intValue(), zk.c.SECONDS));
        }
        j.l("sessionConfigs");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0081 A[Catch:{ all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0087 A[SYNTHETIC, Splitter:B:37:0x0087] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a3 A[Catch:{ all -> 0x013d }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(ik.d<? super ek.i> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof zb.c.a
            if (r0 == 0) goto L_0x0013
            r0 = r14
            zb.c$a r0 = (zb.c.a) r0
            int r1 = r0.f17913e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17913e = r1
            goto L_0x0018
        L_0x0013:
            zb.c$a r0 = new zb.c$a
            r0.<init>(r13, r14)
        L_0x0018:
            java.lang.Object r14 = r0.f17911c
            jk.a r1 = jk.a.COROUTINE_SUSPENDED
            int r2 = r0.f17913e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L_0x0052
            if (r2 == r5) goto L_0x0048
            if (r2 == r4) goto L_0x003e
            if (r2 != r3) goto L_0x0036
            java.lang.Object r0 = r0.f17909a
            il.a r0 = (il.a) r0
            p3.l0.Q0(r14)     // Catch:{ all -> 0x0033 }
            goto L_0x0133
        L_0x0033:
            r14 = move-exception
            goto L_0x013b
        L_0x0036:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x003e:
            il.a r2 = r0.f17910b
            java.lang.Object r7 = r0.f17909a
            zb.c r7 = (zb.c) r7
            p3.l0.Q0(r14)     // Catch:{ all -> 0x013d }
            goto L_0x009f
        L_0x0048:
            il.a r2 = r0.f17910b
            java.lang.Object r7 = r0.f17909a
            zb.c r7 = (zb.c) r7
            p3.l0.Q0(r14)
            goto L_0x0079
        L_0x0052:
            p3.l0.Q0(r14)
            il.d r14 = r13.f17908f
            boolean r14 = r14.e()
            if (r14 != 0) goto L_0x0068
            zb.i r14 = r13.f17907e
            boolean r14 = r14.b()
            if (r14 != 0) goto L_0x0068
            ek.i r14 = ek.i.f20112a
            return r14
        L_0x0068:
            il.d r14 = r13.f17908f
            r0.f17909a = r13
            r0.f17910b = r14
            r0.f17913e = r5
            java.lang.Object r2 = r14.a(r0)
            if (r2 != r1) goto L_0x0077
            return r1
        L_0x0077:
            r7 = r13
            r2 = r14
        L_0x0079:
            zb.i r14 = r7.f17907e     // Catch:{ all -> 0x013d }
            boolean r14 = r14.b()     // Catch:{ all -> 0x013d }
            if (r14 != 0) goto L_0x0087
            ek.i r14 = ek.i.f20112a     // Catch:{ all -> 0x013d }
            r2.b(r6)
            return r14
        L_0x0087:
            ab.c r14 = r7.f17904b     // Catch:{ all -> 0x013d }
            com.google.android.gms.tasks.Task r14 = r14.getId()     // Catch:{ all -> 0x013d }
            java.lang.String r8 = "firebaseInstallationsApi.id"
            sk.j.e(r14, r8)     // Catch:{ all -> 0x013d }
            r0.f17909a = r7     // Catch:{ all -> 0x013d }
            r0.f17910b = r2     // Catch:{ all -> 0x013d }
            r0.f17913e = r4     // Catch:{ all -> 0x013d }
            java.lang.Object r14 = jl.c.a(r14, r0)     // Catch:{ all -> 0x013d }
            if (r14 != r1) goto L_0x009f
            return r1
        L_0x009f:
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x013d }
            if (r14 != 0) goto L_0x00a9
            ek.i r14 = ek.i.f20112a     // Catch:{ all -> 0x013d }
            r2.b(r6)
            return r14
        L_0x00a9:
            r8 = 5
            ek.e[] r8 = new ek.e[r8]     // Catch:{ all -> 0x013d }
            java.lang.String r9 = "X-Crashlytics-Installation-ID"
            ek.e r10 = new ek.e     // Catch:{ all -> 0x013d }
            r10.<init>(r9, r14)     // Catch:{ all -> 0x013d }
            r14 = 0
            r8[r14] = r10     // Catch:{ all -> 0x013d }
            java.lang.String r9 = "X-Crashlytics-Device-Model"
            java.lang.String r10 = "%s/%s"
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ all -> 0x013d }
            java.lang.String r12 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x013d }
            r11[r14] = r12     // Catch:{ all -> 0x013d }
            java.lang.String r14 = android.os.Build.MODEL     // Catch:{ all -> 0x013d }
            r11[r5] = r14     // Catch:{ all -> 0x013d }
            java.lang.Object[] r14 = java.util.Arrays.copyOf(r11, r4)     // Catch:{ all -> 0x013d }
            java.lang.String r14 = java.lang.String.format(r10, r14)     // Catch:{ all -> 0x013d }
            java.lang.String r10 = "format(format, *args)"
            sk.j.e(r14, r10)     // Catch:{ all -> 0x013d }
            r7.getClass()     // Catch:{ all -> 0x013d }
            java.lang.String r14 = e(r14)     // Catch:{ all -> 0x013d }
            ek.e r10 = new ek.e     // Catch:{ all -> 0x013d }
            r10.<init>(r9, r14)     // Catch:{ all -> 0x013d }
            r8[r5] = r10     // Catch:{ all -> 0x013d }
            java.lang.String r14 = "X-Crashlytics-OS-Build-Version"
            java.lang.String r5 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ all -> 0x013d }
            java.lang.String r9 = "INCREMENTAL"
            sk.j.e(r5, r9)     // Catch:{ all -> 0x013d }
            java.lang.String r5 = e(r5)     // Catch:{ all -> 0x013d }
            ek.e r9 = new ek.e     // Catch:{ all -> 0x013d }
            r9.<init>(r14, r5)     // Catch:{ all -> 0x013d }
            r8[r4] = r9     // Catch:{ all -> 0x013d }
            java.lang.String r14 = "X-Crashlytics-OS-Display-Version"
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x013d }
            java.lang.String r5 = "RELEASE"
            sk.j.e(r4, r5)     // Catch:{ all -> 0x013d }
            java.lang.String r4 = e(r4)     // Catch:{ all -> 0x013d }
            ek.e r5 = new ek.e     // Catch:{ all -> 0x013d }
            r5.<init>(r14, r4)     // Catch:{ all -> 0x013d }
            r8[r3] = r5     // Catch:{ all -> 0x013d }
            r14 = 4
            java.lang.String r4 = "X-Crashlytics-API-Client-Version"
            xb.b r5 = r7.f17905c     // Catch:{ all -> 0x013d }
            java.lang.String r5 = r5.f17178c     // Catch:{ all -> 0x013d }
            ek.e r9 = new ek.e     // Catch:{ all -> 0x013d }
            r9.<init>(r4, r5)     // Catch:{ all -> 0x013d }
            r8[r14] = r9     // Catch:{ all -> 0x013d }
            java.util.Map r14 = fk.h.u0(r8)     // Catch:{ all -> 0x013d }
            zb.a r4 = r7.f17906d     // Catch:{ all -> 0x013d }
            zb.c$b r5 = new zb.c$b     // Catch:{ all -> 0x013d }
            r5.<init>(r7, r6)     // Catch:{ all -> 0x013d }
            zb.c$c r7 = new zb.c$c     // Catch:{ all -> 0x013d }
            r7.<init>(r6)     // Catch:{ all -> 0x013d }
            r0.f17909a = r2     // Catch:{ all -> 0x013d }
            r0.f17910b = r6     // Catch:{ all -> 0x013d }
            r0.f17913e = r3     // Catch:{ all -> 0x013d }
            java.lang.Object r14 = r4.a(r14, r5, r7, r0)     // Catch:{ all -> 0x013d }
            if (r14 != r1) goto L_0x0132
            return r1
        L_0x0132:
            r0 = r2
        L_0x0133:
            ek.i r14 = ek.i.f20112a     // Catch:{ all -> 0x0033 }
            r0.b(r6)
            ek.i r14 = ek.i.f20112a
            return r14
        L_0x013b:
            r2 = r0
            goto L_0x013e
        L_0x013d:
            r14 = move-exception
        L_0x013e:
            r2.b(r6)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.c.c(ik.d):java.lang.Object");
    }

    public final Double d() {
        f fVar = this.f17907e.f17951b;
        if (fVar != null) {
            return fVar.f17929b;
        }
        j.l("sessionConfigs");
        throw null;
    }
}
