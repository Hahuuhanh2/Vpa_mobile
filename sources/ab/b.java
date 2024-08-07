package ab;

import android.annotation.SuppressLint;
import ca.j;
import ca.o;
import cb.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import da.k;
import db.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import m9.d;
import v.q;

/* compiled from: FirebaseInstallations */
public final class b implements c {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f143m = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final d f144a;

    /* renamed from: b  reason: collision with root package name */
    public final c f145b;

    /* renamed from: c  reason: collision with root package name */
    public final cb.c f146c;

    /* renamed from: d  reason: collision with root package name */
    public final i f147d;

    /* renamed from: e  reason: collision with root package name */
    public final o<cb.b> f148e;

    /* renamed from: f  reason: collision with root package name */
    public final g f149f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f150g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f151h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f152i;

    /* renamed from: j  reason: collision with root package name */
    public String f153j;

    /* renamed from: k  reason: collision with root package name */
    public HashSet f154k;

    /* renamed from: l  reason: collision with root package name */
    public final ArrayList f155l;

    static {
        new AtomicInteger(1);
    }

    @SuppressLint({"ThreadPoolCreation"})
    public b() {
        throw null;
    }

    @SuppressLint({"ThreadPoolCreation"})
    public b(d dVar, za.b bVar, ExecutorService executorService, k kVar) {
        dVar.a();
        c cVar = new c(dVar.f13218a, bVar);
        cb.c cVar2 = new cb.c(dVar);
        i a10 = i.a();
        o<cb.b> oVar = new o<>(new j(dVar, 1));
        g gVar = new g();
        this.f150g = new Object();
        this.f154k = new HashSet();
        this.f155l = new ArrayList();
        this.f144a = dVar;
        this.f145b = cVar;
        this.f146c = cVar2;
        this.f147d = a10;
        this.f148e = oVar;
        this.f149f = gVar;
        this.f151h = executorService;
        this.f152i = kVar;
    }

    public final Task a() {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        d dVar = new d(this.f147d, taskCompletionSource);
        synchronized (this.f150g) {
            this.f155l.add(dVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f151h.execute(new q(1, this, false));
        return task;
    }

    public final void b(boolean z10) {
        a c10;
        synchronized (f143m) {
            d dVar = this.f144a;
            dVar.a();
            vl.d a10 = vl.d.a(dVar.f13218a);
            try {
                c10 = this.f146c.c();
                int i10 = c10.f4668c;
                boolean z11 = true;
                if (i10 != 2) {
                    if (i10 != 1) {
                        z11 = false;
                    }
                }
                if (z11) {
                    String e10 = e(c10);
                    cb.c cVar = this.f146c;
                    a.C0053a aVar = new a.C0053a(c10);
                    aVar.f4674a = e10;
                    aVar.b(3);
                    c10 = aVar.a();
                    cVar.b(c10);
                }
            } finally {
                if (a10 != null) {
                    a10.p();
                }
            }
        }
        if (z10) {
            a.C0053a aVar2 = new a.C0053a(c10);
            aVar2.f4676c = null;
            c10 = aVar2.a();
        }
        h(c10);
        this.f152i.execute(new b0.a(2, this, z10));
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0186, code lost:
        r8 = true;
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a2, code lost:
        r12.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009b A[Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }, ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }]), Splitter:B:16:0x005f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cb.a c(cb.a r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            db.c r2 = r1.f145b
            m9.d r3 = r1.f144a
            r3.a()
            m9.e r3 = r3.f13220c
            java.lang.String r3 = r3.f13231a
            java.lang.String r4 = r0.f4667b
            m9.d r5 = r1.f144a
            r5.a()
            m9.e r5 = r5.f13220c
            java.lang.String r5 = r5.f13237g
            java.lang.String r6 = r0.f4670e
            db.e r7 = r2.f8878c
            monitor-enter(r7)
            int r8 = r7.f8883c     // Catch:{ all -> 0x01c4 }
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L_0x0039
            ab.i r8 = r7.f8881a     // Catch:{ all -> 0x01c4 }
            al.g0 r8 = r8.f164a     // Catch:{ all -> 0x01c4 }
            r8.getClass()     // Catch:{ all -> 0x01c4 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01c4 }
            long r13 = r7.f8882b     // Catch:{ all -> 0x01c4 }
            int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r8 <= 0) goto L_0x0037
            goto L_0x0039
        L_0x0037:
            r8 = r9
            goto L_0x003a
        L_0x0039:
            r8 = r10
        L_0x003a:
            monitor-exit(r7)
            java.lang.String r7 = "Firebase Installations Service is unavailable. Please try again later."
            if (r8 == 0) goto L_0x01be
            r8 = 2
            java.lang.Object[] r11 = new java.lang.Object[r8]
            r11[r9] = r5
            r11[r10] = r4
            java.lang.String r4 = "projects/%s/installations/%s/authTokens:generate"
            java.lang.String r4 = java.lang.String.format(r4, r11)
            java.net.URL r4 = db.c.a(r4)
            r11 = r9
        L_0x0051:
            if (r11 > r10) goto L_0x01b8
            r12 = 32771(0x8003, float:4.5922E-41)
            android.net.TrafficStats.setThreadStatsTag(r12)
            java.net.HttpURLConnection r12 = r2.c(r4, r3)
            java.lang.String r13 = "POST"
            r12.setRequestMethod(r13)     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            java.lang.String r13 = "Authorization"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            r14.<init>()     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            java.lang.String r15 = "FIS_v2 "
            r14.append(r15)     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            r14.append(r6)     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            java.lang.String r14 = r14.toString()     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            r12.addRequestProperty(r13, r14)     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            r12.setDoOutput(r10)     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            db.c.h(r12)     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            int r13 = r12.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            db.e r14 = r2.f8878c     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            r14.a(r13)     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            r14 = 200(0xc8, float:2.8E-43)
            if (r13 < r14) goto L_0x0091
            r14 = 300(0x12c, float:4.2E-43)
            if (r13 >= r14) goto L_0x0091
            r14 = r10
            goto L_0x0092
        L_0x0091:
            r14 = r9
        L_0x0092:
            r15 = 0
            if (r14 == 0) goto L_0x009e
            db.b r2 = db.c.f(r12)     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            goto L_0x0115
        L_0x009b:
            r0 = move-exception
            goto L_0x01a2
        L_0x009e:
            db.c.b(r12, r15, r3, r5)     // Catch:{ IOException | AssertionError -> 0x01a9, all -> 0x009b }
            r14 = 401(0x191, float:5.62E-43)
            r16 = 0
            if (r13 == r14) goto L_0x00f9
            r14 = 404(0x194, float:5.66E-43)
            if (r13 != r14) goto L_0x00ac
            goto L_0x00f9
        L_0x00ac:
            r14 = 429(0x1ad, float:6.01E-43)
            if (r13 == r14) goto L_0x00ed
            r14 = 500(0x1f4, float:7.0E-43)
            if (r13 < r14) goto L_0x00ba
            r14 = 600(0x258, float:8.41E-43)
            if (r13 >= r14) goto L_0x00ba
            goto L_0x01a9
        L_0x00ba:
            java.lang.Long r13 = java.lang.Long.valueOf(r16)     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            if (r13 != 0) goto L_0x00c3
            java.lang.String r14 = " tokenExpirationTimestamp"
            goto L_0x00c5
        L_0x00c3:
            java.lang.String r14 = ""
        L_0x00c5:
            boolean r16 = r14.isEmpty()     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            if (r16 == 0) goto L_0x00d6
            db.b r14 = new db.b     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            long r9 = r13.longValue()     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            r14.<init>(r15, r9, r8)     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            r2 = r14
            goto L_0x0115
        L_0x00d6:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            r10.<init>()     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            java.lang.String r13 = "Missing required properties:"
            r10.append(r13)     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            r10.append(r14)     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            java.lang.String r10 = r10.toString()     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            r9.<init>(r10)     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            throw r9     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
        L_0x00ed:
            com.google.firebase.installations.FirebaseInstallationsException r9 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            java.lang.String r10 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r9.<init>(r10)     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            throw r9     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
        L_0x00f5:
            r9 = r8
            r8 = 1
            goto L_0x01ab
        L_0x00f9:
            java.lang.Long r9 = java.lang.Long.valueOf(r16)     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            r10 = 3
            if (r9 != 0) goto L_0x0103
            java.lang.String r13 = " tokenExpirationTimestamp"
            goto L_0x0105
        L_0x0103:
            java.lang.String r13 = ""
        L_0x0105:
            boolean r14 = r13.isEmpty()     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            if (r14 == 0) goto L_0x0189
            db.b r13 = new db.b     // Catch:{ IOException | AssertionError -> 0x00f5, all -> 0x009b }
            long r8 = r9.longValue()     // Catch:{ IOException | AssertionError -> 0x0186, all -> 0x009b }
            r13.<init>(r15, r8, r10)     // Catch:{ IOException | AssertionError -> 0x0186, all -> 0x009b }
            r2 = r13
        L_0x0115:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r3 = r2.f8873c
            int r3 = v.v.g(r3)
            if (r3 == 0) goto L_0x0156
            r8 = 1
            if (r3 == r8) goto L_0x0145
            r2 = 2
            if (r3 != r2) goto L_0x013f
            monitor-enter(r18)
            r1.f153j = r15     // Catch:{ all -> 0x013b }
            monitor-exit(r18)
            cb.a$a r2 = new cb.a$a
            r2.<init>(r0)
            r9 = 2
            r2.b(r9)
            cb.a r0 = r2.a()
            return r0
        L_0x013b:
            r0 = move-exception
            r2 = r0
            monitor-exit(r18)
            throw r2
        L_0x013f:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            r0.<init>(r7)
            throw r0
        L_0x0145:
            cb.a$a r0 = r19.h()
            java.lang.String r2 = "BAD CONFIG"
            r0.f4680g = r2
            r2 = 5
            r0.b(r2)
            cb.a r0 = r0.a()
            return r0
        L_0x0156:
            java.lang.String r3 = r2.f8871a
            long r4 = r2.f8872b
            ab.i r2 = r1.f147d
            r2.getClass()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            al.g0 r2 = r2.f164a
            r2.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r6 = r6.toSeconds(r7)
            cb.a$a r2 = new cb.a$a
            r2.<init>(r0)
            r2.f4676c = r3
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r2.f4678e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            r2.f4679f = r0
            cb.a r0 = r2.a()
            return r0
        L_0x0186:
            r8 = 1
            r9 = 2
            goto L_0x01ab
        L_0x0189:
            r9 = r8
            r8 = 1
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ IOException | AssertionError -> 0x01ab, all -> 0x009b }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ IOException | AssertionError -> 0x01ab, all -> 0x009b }
            r14.<init>()     // Catch:{ IOException | AssertionError -> 0x01ab, all -> 0x009b }
            java.lang.String r15 = "Missing required properties:"
            r14.append(r15)     // Catch:{ IOException | AssertionError -> 0x01ab, all -> 0x009b }
            r14.append(r13)     // Catch:{ IOException | AssertionError -> 0x01ab, all -> 0x009b }
            java.lang.String r13 = r14.toString()     // Catch:{ IOException | AssertionError -> 0x01ab, all -> 0x009b }
            r10.<init>(r13)     // Catch:{ IOException | AssertionError -> 0x01ab, all -> 0x009b }
            throw r10     // Catch:{ IOException | AssertionError -> 0x01ab, all -> 0x009b }
        L_0x01a2:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01a9:
            r9 = r8
            r8 = r10
        L_0x01ab:
            r12.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r11 = r11 + 1
            r10 = r8
            r8 = r9
            r9 = 0
            goto L_0x0051
        L_0x01b8:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            r0.<init>(r7)
            throw r0
        L_0x01be:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            r0.<init>(r7)
            throw r0
        L_0x01c4:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.b.c(cb.a):cb.a");
    }

    public final void d() {
        d dVar = this.f144a;
        dVar.a();
        y6.j.d("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", dVar.f13220c.f13232b);
        d dVar2 = this.f144a;
        dVar2.a();
        y6.j.d("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", dVar2.f13220c.f13237g);
        d dVar3 = this.f144a;
        dVar3.a();
        y6.j.d("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", dVar3.f13220c.f13231a);
        d dVar4 = this.f144a;
        dVar4.a();
        String str = dVar4.f13220c.f13232b;
        Pattern pattern = i.f162c;
        y6.j.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        d dVar5 = this.f144a;
        dVar5.a();
        y6.j.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", i.f162c.matcher(dVar5.f13220c.f13231a).matches());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001c, code lost:
        if ("[DEFAULT]".equals(r0.f13219b) != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e(cb.a r6) {
        /*
            r5 = this;
            m9.d r0 = r5.f144a
            r0.a()
            java.lang.String r0 = r0.f13219b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001e
            m9.d r0 = r5.f144a
            r0.a()
            java.lang.String r0 = r0.f13219b
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0027
        L_0x001e:
            int r6 = r6.f4668c
            r0 = 1
            if (r6 != r0) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r0 != 0) goto L_0x0031
        L_0x0027:
            ab.g r6 = r5.f149f
            r6.getClass()
            java.lang.String r6 = ab.g.a()
            return r6
        L_0x0031:
            ca.o<cb.b> r6 = r5.f148e
            java.lang.Object r6 = r6.get()
            cb.b r6 = (cb.b) r6
            android.content.SharedPreferences r0 = r6.f4682a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f4682a     // Catch:{ all -> 0x0065 }
            monitor-enter(r1)     // Catch:{ all -> 0x0065 }
            android.content.SharedPreferences r2 = r6.f4682a     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            if (r2 == 0) goto L_0x004d
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            goto L_0x0052
        L_0x004d:
            java.lang.String r2 = r6.a()     // Catch:{ all -> 0x0065 }
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
        L_0x0052:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L_0x0061
            ab.g r6 = r5.f149f
            r6.getClass()
            java.lang.String r2 = ab.g.a()
        L_0x0061:
            return r2
        L_0x0062:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0062 }
            throw r6     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0065 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.b.e(cb.a):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        if (r9.startsWith("{") == false) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = new org.json.JSONObject(r9).getString("token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0063, code lost:
        r3 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019c, code lost:
        r14.disconnect();
        android.net.TrafficStats.clearThreadStatsTag();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01a2, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00da A[Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }, ExcHandler: all (r0v4 'th' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }]), Splitter:B:43:0x00cc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final cb.a f(cb.a r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.String r2 = r0.f4667b
            r3 = 0
            r4 = 4
            if (r2 == 0) goto L_0x006d
            int r2 = r2.length()
            r6 = 11
            if (r2 != r6) goto L_0x006d
            ca.o<cb.b> r2 = r1.f148e
            java.lang.Object r2 = r2.get()
            cb.b r2 = (cb.b) r2
            android.content.SharedPreferences r6 = r2.f4682a
            monitor-enter(r6)
            java.lang.String[] r7 = cb.b.f4681c     // Catch:{ all -> 0x0061 }
            r8 = 0
        L_0x0020:
            if (r8 >= r4) goto L_0x0069
            r9 = r7[r8]     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = r2.f4683b     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r11.<init>()     // Catch:{ all -> 0x0061 }
            java.lang.String r12 = "|T|"
            r11.append(r12)     // Catch:{ all -> 0x0061 }
            r11.append(r10)     // Catch:{ all -> 0x0061 }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x0061 }
            r11.append(r9)     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x0061 }
            android.content.SharedPreferences r10 = r2.f4682a     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r10.getString(r9, r3)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x0066
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x0061 }
            if (r10 != 0) goto L_0x0066
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0063
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0064 }
            r2.<init>(r9)     // Catch:{ JSONException -> 0x0064 }
            java.lang.String r7 = "token"
            java.lang.String r3 = r2.getString(r7)     // Catch:{ JSONException -> 0x0064 }
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            goto L_0x006b
        L_0x0063:
            r3 = r9
        L_0x0064:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            goto L_0x006d
        L_0x0066:
            int r8 = r8 + 1
            goto L_0x0020
        L_0x0069:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            goto L_0x006d
        L_0x006b:
            monitor-exit(r6)     // Catch:{ all -> 0x0061 }
            throw r0
        L_0x006d:
            db.c r2 = r1.f145b
            m9.d r6 = r1.f144a
            r6.a()
            m9.e r6 = r6.f13220c
            java.lang.String r6 = r6.f13231a
            java.lang.String r7 = r0.f4667b
            m9.d r8 = r1.f144a
            r8.a()
            m9.e r8 = r8.f13220c
            java.lang.String r8 = r8.f13237g
            m9.d r9 = r1.f144a
            r9.a()
            m9.e r9 = r9.f13220c
            java.lang.String r9 = r9.f13232b
            db.e r10 = r2.f8878c
            monitor-enter(r10)
            int r11 = r10.f8883c     // Catch:{ all -> 0x01ba }
            r12 = 1
            if (r11 == 0) goto L_0x00a8
            ab.i r11 = r10.f8881a     // Catch:{ all -> 0x01ba }
            al.g0 r11 = r11.f164a     // Catch:{ all -> 0x01ba }
            r11.getClass()     // Catch:{ all -> 0x01ba }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01ba }
            long r4 = r10.f8882b     // Catch:{ all -> 0x01ba }
            int r4 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r4 = 0
            goto L_0x00a9
        L_0x00a8:
            r4 = r12
        L_0x00a9:
            monitor-exit(r10)
            java.lang.String r5 = "Firebase Installations Service is unavailable. Please try again later."
            if (r4 == 0) goto L_0x01b4
            java.lang.Object[] r4 = new java.lang.Object[r12]
            r10 = 0
            r4[r10] = r8
            java.lang.String r13 = "projects/%s/installations"
            java.lang.String r4 = java.lang.String.format(r13, r4)
            java.net.URL r4 = db.c.a(r4)
            r13 = r10
        L_0x00be:
            if (r13 > r12) goto L_0x01ae
            r14 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r14)
            java.net.HttpURLConnection r14 = r2.c(r4, r6)
            java.lang.String r15 = "POST"
            r14.setRequestMethod(r15)     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            r14.setDoOutput(r12)     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            if (r3 == 0) goto L_0x00e0
            java.lang.String r15 = "x-goog-fis-android-iid-migration-auth"
            r14.addRequestProperty(r15, r3)     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            goto L_0x00e0
        L_0x00da:
            r0 = move-exception
            goto L_0x019c
        L_0x00dd:
            r10 = 4
            goto L_0x01a3
        L_0x00e0:
            db.c.g(r14, r7, r9)     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            int r15 = r14.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            db.e r10 = r2.f8878c     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            r10.a(r15)     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            r10 = 200(0xc8, float:2.8E-43)
            if (r15 < r10) goto L_0x00f6
            r10 = 300(0x12c, float:4.2E-43)
            if (r15 >= r10) goto L_0x00f6
            r10 = r12
            goto L_0x00f7
        L_0x00f6:
            r10 = 0
        L_0x00f7:
            if (r10 == 0) goto L_0x0104
            db.a r2 = db.c.e(r14)     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x012c
        L_0x0104:
            db.c.b(r14, r9, r6, r8)     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            r10 = 429(0x1ad, float:6.01E-43)
            if (r15 == r10) goto L_0x0193
            r10 = 500(0x1f4, float:7.0E-43)
            if (r15 < r10) goto L_0x0114
            r10 = 600(0x258, float:8.41E-43)
            if (r15 >= r10) goto L_0x0114
            goto L_0x00dd
        L_0x0114:
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            r21 = 2
            db.a r10 = new db.a     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            r16 = r10
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException | AssertionError -> 0x00dd, all -> 0x00da }
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = r10
        L_0x012c:
            int r3 = r2.f8870e
            int r3 = v.v.g(r3)
            if (r3 == 0) goto L_0x014f
            if (r3 != r12) goto L_0x0147
            cb.a$a r0 = r23.h()
            java.lang.String r2 = "BAD CONFIG"
            r0.f4680g = r2
            r2 = 5
            r0.b(r2)
            cb.a r0 = r0.a()
            return r0
        L_0x0147:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            r0.<init>(r2)
            throw r0
        L_0x014f:
            java.lang.String r3 = r2.f8867b
            java.lang.String r4 = r2.f8868c
            ab.i r5 = r1.f147d
            r5.getClass()
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MILLISECONDS
            al.g0 r5 = r5.f164a
            r5.getClass()
            long r7 = java.lang.System.currentTimeMillis()
            long r5 = r6.toSeconds(r7)
            db.f r7 = r2.f8869d
            java.lang.String r7 = r7.b()
            db.f r2 = r2.f8869d
            long r8 = r2.c()
            cb.a$a r2 = new cb.a$a
            r2.<init>(r0)
            r2.f4674a = r3
            r10 = 4
            r2.b(r10)
            r2.f4676c = r7
            r2.f4677d = r4
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r2.f4678e = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r2.f4679f = r0
            cb.a r0 = r2.a()
            return r0
        L_0x0193:
            r10 = 4
            com.google.firebase.installations.FirebaseInstallationsException r11 = new com.google.firebase.installations.FirebaseInstallationsException     // Catch:{ IOException | AssertionError -> 0x01a3, all -> 0x00da }
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            r11.<init>(r15)     // Catch:{ IOException | AssertionError -> 0x01a3, all -> 0x00da }
            throw r11     // Catch:{ IOException | AssertionError -> 0x01a3, all -> 0x00da }
        L_0x019c:
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x01a3:
            r14.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r13 = r13 + 1
            r10 = 0
            goto L_0x00be
        L_0x01ae:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            r0.<init>(r5)
            throw r0
        L_0x01b4:
            com.google.firebase.installations.FirebaseInstallationsException r0 = new com.google.firebase.installations.FirebaseInstallationsException
            r0.<init>(r5)
            throw r0
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ab.b.f(cb.a):cb.a");
    }

    public final void g(Exception exc) {
        synchronized (this.f150g) {
            Iterator it = this.f155l.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).b(exc)) {
                    it.remove();
                }
            }
        }
    }

    public final Task<String> getId() {
        String str;
        d();
        synchronized (this) {
            str = this.f153j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        e eVar = new e(taskCompletionSource);
        synchronized (this.f150g) {
            this.f155l.add(eVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f151h.execute(new d.d(this, 29));
        return task;
    }

    public final void h(a aVar) {
        synchronized (this.f150g) {
            Iterator it = this.f155l.iterator();
            while (it.hasNext()) {
                if (((h) it.next()).a(aVar)) {
                    it.remove();
                }
            }
        }
    }
}
