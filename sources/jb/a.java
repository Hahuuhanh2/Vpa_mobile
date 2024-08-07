package jb;

import androidx.fragment.app.o;
import com.google.firebase.perf.config.RemoteConfigManager;
import java.util.concurrent.Executors;
import sb.d;
import sb.e;

/* compiled from: ConfigResolver */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static final lb.a f11837d = lb.a.d();

    /* renamed from: e  reason: collision with root package name */
    public static volatile a f11838e;

    /* renamed from: a  reason: collision with root package name */
    public final RemoteConfigManager f11839a = RemoteConfigManager.getInstance();

    /* renamed from: b  reason: collision with root package name */
    public d f11840b = new d();

    /* renamed from: c  reason: collision with root package name */
    public v f11841c;

    public a() {
        v vVar;
        lb.a aVar = v.f11863c;
        synchronized (v.class) {
            if (v.f11864d == null) {
                v.f11864d = new v(Executors.newSingleThreadExecutor());
            }
            vVar = v.f11864d;
        }
        this.f11841c = vVar;
    }

    public static synchronized a e() {
        a aVar;
        synchronized (a.class) {
            if (f11838e == null) {
                f11838e = new a();
            }
            aVar = f11838e;
        }
        return aVar;
    }

    public static boolean m(long j10) {
        return j10 >= 0;
    }

    public static boolean n(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String trim : str.split(";")) {
            String trim2 = trim.trim();
            Boolean bool = hb.a.f10696a;
            if (trim2.equals("20.4.1")) {
                return true;
            }
        }
        return false;
    }

    public static boolean o(long j10) {
        return j10 >= 0;
    }

    public static boolean q(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    public final e<Boolean> a(o oVar) {
        v vVar = this.f11841c;
        String f10 = oVar.f();
        if (f10 == null) {
            vVar.getClass();
            v.f11863c.a();
            return new e<>();
        }
        if (vVar.f11865a == null) {
            vVar.b(v.a());
            if (vVar.f11865a == null) {
                return new e<>();
            }
        }
        if (!vVar.f11865a.contains(f10)) {
            return new e<>();
        }
        try {
            return new e<>(Boolean.valueOf(vVar.f11865a.getBoolean(f10, false)));
        } catch (ClassCastException e10) {
            v.f11863c.b("Key %s from sharedPreferences has type other than long: %s", f10, e10.getMessage());
            return new e<>();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:14|15|16|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        jb.v.f11863c.b("Key %s from sharedPreferences has type other than double: %s", r5, r0.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        return new sb.e<>();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        return new sb.e<>(java.lang.Double.valueOf(java.lang.Float.valueOf(r0.f11865a.getFloat(r5, 0.0f)).doubleValue()));
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0051 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sb.e<java.lang.Double> b(androidx.fragment.app.o r5) {
        /*
            r4 = this;
            jb.v r0 = r4.f11841c
            java.lang.String r5 = r5.f()
            if (r5 != 0) goto L_0x0017
            r0.getClass()
            lb.a r5 = jb.v.f11863c
            r5.a()
            sb.e r5 = new sb.e
            r5.<init>()
            goto L_0x0085
        L_0x0017:
            android.content.SharedPreferences r1 = r0.f11865a
            if (r1 != 0) goto L_0x002c
            android.content.Context r1 = jb.v.a()
            r0.b(r1)
            android.content.SharedPreferences r1 = r0.f11865a
            if (r1 != 0) goto L_0x002c
            sb.e r5 = new sb.e
            r5.<init>()
            goto L_0x0085
        L_0x002c:
            android.content.SharedPreferences r1 = r0.f11865a
            boolean r1 = r1.contains(r5)
            if (r1 != 0) goto L_0x003a
            sb.e r5 = new sb.e
            r5.<init>()
            goto L_0x0085
        L_0x003a:
            android.content.SharedPreferences r1 = r0.f11865a     // Catch:{ ClassCastException -> 0x0051 }
            r2 = 0
            long r1 = r1.getLong(r5, r2)     // Catch:{ ClassCastException -> 0x0051 }
            double r1 = java.lang.Double.longBitsToDouble(r1)     // Catch:{ ClassCastException -> 0x0051 }
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ ClassCastException -> 0x0051 }
            sb.e r2 = new sb.e     // Catch:{ ClassCastException -> 0x0051 }
            r2.<init>(r1)     // Catch:{ ClassCastException -> 0x0051 }
            r5 = r2
            goto L_0x0085
        L_0x0051:
            android.content.SharedPreferences r0 = r0.f11865a     // Catch:{ ClassCastException -> 0x006b }
            r1 = 0
            float r0 = r0.getFloat(r5, r1)     // Catch:{ ClassCastException -> 0x006b }
            java.lang.Float r0 = java.lang.Float.valueOf(r0)     // Catch:{ ClassCastException -> 0x006b }
            double r0 = r0.doubleValue()     // Catch:{ ClassCastException -> 0x006b }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ ClassCastException -> 0x006b }
            sb.e r1 = new sb.e     // Catch:{ ClassCastException -> 0x006b }
            r1.<init>(r0)     // Catch:{ ClassCastException -> 0x006b }
            r5 = r1
            goto L_0x0085
        L_0x006b:
            r0 = move-exception
            lb.a r1 = jb.v.f11863c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            java.lang.String r0 = r0.getMessage()
            r2[r5] = r0
            java.lang.String r5 = "Key %s from sharedPreferences has type other than double: %s"
            r1.b(r5, r2)
            sb.e r5 = new sb.e
            r5.<init>()
        L_0x0085:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.b(androidx.fragment.app.o):sb.e");
    }

    public final e<Long> c(o oVar) {
        v vVar = this.f11841c;
        String f10 = oVar.f();
        if (f10 == null) {
            vVar.getClass();
            v.f11863c.a();
            return new e<>();
        }
        if (vVar.f11865a == null) {
            vVar.b(v.a());
            if (vVar.f11865a == null) {
                return new e<>();
            }
        }
        if (!vVar.f11865a.contains(f10)) {
            return new e<>();
        }
        try {
            return new e<>(Long.valueOf(vVar.f11865a.getLong(f10, 0)));
        } catch (ClassCastException e10) {
            v.f11863c.b("Key %s from sharedPreferences has type other than long: %s", f10, e10.getMessage());
            return new e<>();
        }
    }

    public final e<String> d(o oVar) {
        v vVar = this.f11841c;
        String f10 = oVar.f();
        if (f10 == null) {
            vVar.getClass();
            v.f11863c.a();
            return new e<>();
        }
        if (vVar.f11865a == null) {
            vVar.b(v.a());
            if (vVar.f11865a == null) {
                return new e<>();
            }
        }
        if (!vVar.f11865a.contains(f10)) {
            return new e<>();
        }
        try {
            return new e<>(vVar.f11865a.getString(f10, ""));
        } catch (ClassCastException e10) {
            v.f11863c.b("Key %s from sharedPreferences has type other than String: %s", f10, e10.getMessage());
            return new e<>();
        }
    }

    public final boolean f() {
        d dVar;
        synchronized (d.class) {
            if (d.f11844b == null) {
                d.f11844b = new d();
            }
            dVar = d.f11844b;
        }
        e<Boolean> h10 = h(dVar);
        if (h10.b()) {
            return h10.a().booleanValue();
        }
        e<Boolean> eVar = this.f11839a.getBoolean("fpr_experiment_app_start_ttid");
        if (eVar.b()) {
            this.f11841c.f("com.google.firebase.perf.ExperimentTTID", eVar.a().booleanValue());
            return eVar.a().booleanValue();
        }
        e<Boolean> a10 = a(dVar);
        if (a10.b()) {
            return a10.a().booleanValue();
        }
        return false;
    }

    public final Boolean g() {
        b bVar;
        Boolean bool;
        c cVar;
        synchronized (b.class) {
            if (b.f11842b == null) {
                b.f11842b = new b();
            }
            bVar = b.f11842b;
        }
        e<Boolean> h10 = h(bVar);
        if (h10.b()) {
            bool = h10.a();
        } else {
            bool = Boolean.FALSE;
        }
        if (bool.booleanValue()) {
            return Boolean.FALSE;
        }
        synchronized (c.class) {
            if (c.f11843b == null) {
                c.f11843b = new c();
            }
            cVar = c.f11843b;
        }
        e<Boolean> a10 = a(cVar);
        if (a10.b()) {
            return a10.a();
        }
        e<Boolean> h11 = h(cVar);
        if (h11.b()) {
            return h11.a();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[SYNTHETIC, Splitter:B:9:0x0020] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sb.e<java.lang.Boolean> h(androidx.fragment.app.o r6) {
        /*
            r5 = this;
            sb.d r0 = r5.f11840b
            java.lang.String r6 = r6.o()
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0014
            android.os.Bundle r3 = r0.f14709a
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x0014:
            r0.getClass()
        L_0x0017:
            r3 = r2
        L_0x0018:
            if (r3 != 0) goto L_0x0020
            sb.e r6 = new sb.e
            r6.<init>()
            goto L_0x0050
        L_0x0020:
            android.os.Bundle r0 = r0.f14709a     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ ClassCastException -> 0x0038 }
            if (r0 != 0) goto L_0x0031
            sb.e r0 = new sb.e     // Catch:{ ClassCastException -> 0x0038 }
            r0.<init>()     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r0
            goto L_0x0050
        L_0x0031:
            sb.e r3 = new sb.e     // Catch:{ ClassCastException -> 0x0038 }
            r3.<init>(r0)     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r3
            goto L_0x0050
        L_0x0038:
            r0 = move-exception
            lb.a r3 = sb.d.f14708b
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r6
            java.lang.String r6 = r0.getMessage()
            r4[r1] = r6
            java.lang.String r6 = "Metadata key %s contains type other than boolean: %s"
            r3.b(r6, r4)
            sb.e r6 = new sb.e
            r6.<init>()
        L_0x0050:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.h(androidx.fragment.app.o):sb.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sb.e<java.lang.Double> i(androidx.fragment.app.o r5) {
        /*
            r4 = this;
            sb.d r0 = r4.f11840b
            java.lang.String r5 = r5.o()
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x0014
            android.os.Bundle r3 = r0.f14709a
            boolean r3 = r3.containsKey(r5)
            if (r3 == 0) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x0014:
            r0.getClass()
        L_0x0017:
            r3 = r2
        L_0x0018:
            if (r3 != 0) goto L_0x0020
            sb.e r5 = new sb.e
            r5.<init>()
            goto L_0x005f
        L_0x0020:
            android.os.Bundle r0 = r0.f14709a
            java.lang.Object r0 = r0.get(r5)
            if (r0 != 0) goto L_0x002e
            sb.e r5 = new sb.e
            r5.<init>()
            goto L_0x005f
        L_0x002e:
            boolean r3 = r0 instanceof java.lang.Float
            if (r3 == 0) goto L_0x0043
            java.lang.Float r0 = (java.lang.Float) r0
            double r0 = r0.doubleValue()
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            sb.e r0 = new sb.e
            r0.<init>(r5)
            r5 = r0
            goto L_0x005f
        L_0x0043:
            boolean r3 = r0 instanceof java.lang.Double
            if (r3 == 0) goto L_0x004f
            java.lang.Double r0 = (java.lang.Double) r0
            sb.e r5 = new sb.e
            r5.<init>(r0)
            goto L_0x005f
        L_0x004f:
            lb.a r0 = sb.d.f14708b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r5
            java.lang.String r5 = "Metadata key %s contains type other than double: %s"
            r0.b(r5, r1)
            sb.e r5 = new sb.e
            r5.<init>()
        L_0x005f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.i(androidx.fragment.app.o):sb.e");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0020 A[SYNTHETIC, Splitter:B:9:0x0020] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sb.e<java.lang.Long> j(androidx.fragment.app.o r6) {
        /*
            r5 = this;
            sb.d r0 = r5.f11840b
            java.lang.String r6 = r6.o()
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L_0x0014
            android.os.Bundle r3 = r0.f14709a
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0017
            r3 = r1
            goto L_0x0018
        L_0x0014:
            r0.getClass()
        L_0x0017:
            r3 = r2
        L_0x0018:
            if (r3 != 0) goto L_0x0020
            sb.e r6 = new sb.e
            r6.<init>()
            goto L_0x0050
        L_0x0020:
            android.os.Bundle r0 = r0.f14709a     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ ClassCastException -> 0x0038 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ ClassCastException -> 0x0038 }
            if (r0 != 0) goto L_0x0031
            sb.e r0 = new sb.e     // Catch:{ ClassCastException -> 0x0038 }
            r0.<init>()     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r0
            goto L_0x0050
        L_0x0031:
            sb.e r3 = new sb.e     // Catch:{ ClassCastException -> 0x0038 }
            r3.<init>(r0)     // Catch:{ ClassCastException -> 0x0038 }
            r6 = r3
            goto L_0x0050
        L_0x0038:
            r0 = move-exception
            lb.a r3 = sb.d.f14708b
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r2] = r6
            java.lang.String r6 = r0.getMessage()
            r4[r1] = r6
            java.lang.String r6 = "Metadata key %s contains type other than int: %s"
            r3.b(r6, r4)
            sb.e r6 = new sb.e
            r6.<init>()
        L_0x0050:
            boolean r0 = r6.b()
            if (r0 == 0) goto L_0x006b
            java.lang.Object r6 = r6.a()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            long r0 = (long) r6
            java.lang.Long r6 = java.lang.Long.valueOf(r0)
            sb.e r0 = new sb.e
            r0.<init>(r6)
            goto L_0x0070
        L_0x006b:
            sb.e r0 = new sb.e
            r0.<init>()
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.j(androidx.fragment.app.o):sb.e");
    }

    public final long k() {
        j jVar;
        boolean z10;
        synchronized (j.class) {
            if (j.f11851b == null) {
                j.f11851b = new j();
            }
            jVar = j.f11851b;
        }
        e<Long> l10 = l(jVar);
        boolean z11 = true;
        if (l10.b()) {
            if (l10.a().longValue() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                this.f11841c.c(l10.a().longValue(), "com.google.firebase.perf.TimeLimitSec");
                return l10.a().longValue();
            }
        }
        e<Long> c10 = c(jVar);
        if (c10.b()) {
            if (c10.a().longValue() <= 0) {
                z11 = false;
            }
            if (z11) {
                return c10.a().longValue();
            }
        }
        Long l11 = 600L;
        return l11.longValue();
    }

    public final e<Long> l(o oVar) {
        return this.f11839a.getLong(oVar.s());
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean p() {
        /*
            r6 = this;
            java.lang.Boolean r0 = r6.g()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.booleanValue()
            if (r0 != r2) goto L_0x00ce
        L_0x000e:
            java.lang.Class<jb.l> r0 = jb.l.class
            monitor-enter(r0)
            jb.l r3 = jb.l.f11853b     // Catch:{ all -> 0x00cf }
            if (r3 != 0) goto L_0x001c
            jb.l r3 = new jb.l     // Catch:{ all -> 0x00cf }
            r3.<init>()     // Catch:{ all -> 0x00cf }
            jb.l.f11853b = r3     // Catch:{ all -> 0x00cf }
        L_0x001c:
            jb.l r3 = jb.l.f11853b     // Catch:{ all -> 0x00cf }
            monitor-exit(r0)
            com.google.firebase.perf.config.RemoteConfigManager r0 = r6.f11839a
            r3.getClass()
            java.lang.String r4 = "fpr_enabled"
            sb.e r0 = r0.getBoolean(r4)
            boolean r4 = r0.b()
            if (r4 == 0) goto L_0x0056
            com.google.firebase.perf.config.RemoteConfigManager r3 = r6.f11839a
            boolean r3 = r3.isLastFetchFailed()
            if (r3 == 0) goto L_0x003a
            r0 = r1
            goto L_0x006c
        L_0x003a:
            jb.v r3 = r6.f11841c
            java.lang.Object r4 = r0.a()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = "com.google.firebase.perf.SdkEnabled"
            r3.f(r5, r4)
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x006c
        L_0x0056:
            sb.e r0 = r6.a(r3)
            boolean r3 = r0.b()
            if (r3 == 0) goto L_0x006b
            java.lang.Object r0 = r0.a()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x006c
        L_0x006b:
            r0 = r2
        L_0x006c:
            if (r0 == 0) goto L_0x00ca
            java.lang.Class<jb.k> r0 = jb.k.class
            monitor-enter(r0)
            jb.k r3 = jb.k.f11852b     // Catch:{ all -> 0x00c7 }
            if (r3 != 0) goto L_0x007c
            jb.k r3 = new jb.k     // Catch:{ all -> 0x00c7 }
            r3.<init>()     // Catch:{ all -> 0x00c7 }
            jb.k.f11852b = r3     // Catch:{ all -> 0x00c7 }
        L_0x007c:
            jb.k r3 = jb.k.f11852b     // Catch:{ all -> 0x00c7 }
            monitor-exit(r0)
            com.google.firebase.perf.config.RemoteConfigManager r0 = r6.f11839a
            r3.getClass()
            java.lang.String r4 = "fpr_disabled_android_versions"
            sb.e r0 = r0.getString(r4)
            boolean r4 = r0.b()
            if (r4 == 0) goto L_0x00a8
            jb.v r3 = r6.f11841c
            java.lang.String r4 = "com.google.firebase.perf.SdkDisabledVersions"
            java.lang.Object r5 = r0.a()
            java.lang.String r5 = (java.lang.String) r5
            r3.e(r4, r5)
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = n(r0)
            goto L_0x00c3
        L_0x00a8:
            sb.e r0 = r6.d(r3)
            boolean r3 = r0.b()
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r0 = r0.a()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = n(r0)
            goto L_0x00c3
        L_0x00bd:
            java.lang.String r0 = ""
            boolean r0 = n(r0)
        L_0x00c3:
            if (r0 != 0) goto L_0x00ca
            r0 = r2
            goto L_0x00cb
        L_0x00c7:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x00ca:
            r0 = r1
        L_0x00cb:
            if (r0 == 0) goto L_0x00ce
            r1 = r2
        L_0x00ce:
            return r1
        L_0x00cf:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.a.p():boolean");
    }
}
