package mb;

import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import ib.b;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.List;
import okhttp3.HttpUrl;
import pb.a;
import tb.h;

/* compiled from: NetworkRequestMetricBuilder */
public final class d extends b implements a {

    /* renamed from: s  reason: collision with root package name */
    public static final lb.a f13249s = lb.a.d();

    /* renamed from: e  reason: collision with root package name */
    public final List<PerfSession> f13250e;

    /* renamed from: f  reason: collision with root package name */
    public final GaugeManager f13251f;

    /* renamed from: n  reason: collision with root package name */
    public final rb.d f13252n;

    /* renamed from: o  reason: collision with root package name */
    public final h.a f13253o = h.m0();

    /* renamed from: p  reason: collision with root package name */
    public final WeakReference<a> f13254p = new WeakReference<>(this);

    /* renamed from: q  reason: collision with root package name */
    public String f13255q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f13256r;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(rb.d r4) {
        /*
            r3 = this;
            ib.a r0 = ib.a.a()
            com.google.firebase.perf.session.gauges.GaugeManager r1 = com.google.firebase.perf.session.gauges.GaugeManager.getInstance()
            r3.<init>(r0)
            tb.h$a r2 = tb.h.m0()
            r3.f13253o = r2
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r3)
            r3.f13254p = r2
            r3.f13252n = r4
            r3.f13251f = r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.List r4 = java.util.Collections.synchronizedList(r4)
            r3.f13250e = r4
            boolean r4 = r3.f11417c
            if (r4 == 0) goto L_0x002c
            goto L_0x003e
        L_0x002c:
            tb.d r4 = r0.f11412v
            r3.f11418d = r4
            java.lang.ref.WeakReference<ib.a$b> r4 = r3.f11416b
            java.util.HashSet r1 = r0.f11403f
            monitor-enter(r1)
            java.util.HashSet r0 = r0.f11403f     // Catch:{ all -> 0x003f }
            r0.add(r4)     // Catch:{ all -> 0x003f }
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            r4 = 1
            r3.f11417c = r4
        L_0x003e:
            return
        L_0x003f:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003f }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.d.<init>(rb.d):void");
    }

    public static d f(rb.d dVar) {
        return new d(dVar);
    }

    public final void d(PerfSession perfSession) {
        if (perfSession == null) {
            f13249s.f();
        } else if (((h) this.f13253o.f7906b).e0() && !((h) this.f13253o.f7906b).k0()) {
            this.f13250e.add(perfSession);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (ob.h.f13816a.matcher(r2).matches() == false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r7 = this;
            com.google.firebase.perf.session.SessionManager r0 = com.google.firebase.perf.session.SessionManager.getInstance()
            java.lang.ref.WeakReference<pb.a> r1 = r7.f13254p
            r0.unregisterForSessionUpdates(r1)
            boolean r0 = r7.f11417c
            r1 = 0
            if (r0 != 0) goto L_0x000f
            goto L_0x001e
        L_0x000f:
            ib.a r0 = r7.f11415a
            java.lang.ref.WeakReference<ib.a$b> r2 = r7.f11416b
            java.util.HashSet r3 = r0.f11403f
            monitor-enter(r3)
            java.util.HashSet r0 = r0.f11403f     // Catch:{ all -> 0x0098 }
            r0.remove(r2)     // Catch:{ all -> 0x0098 }
            monitor-exit(r3)     // Catch:{ all -> 0x0098 }
            r7.f11417c = r1
        L_0x001e:
            java.util.List<com.google.firebase.perf.session.PerfSession> r0 = r7.f13250e
            monitor-enter(r0)
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0095 }
            r2.<init>()     // Catch:{ all -> 0x0095 }
            java.util.List<com.google.firebase.perf.session.PerfSession> r3 = r7.f13250e     // Catch:{ all -> 0x0095 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0095 }
        L_0x002c:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x003e
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0095 }
            com.google.firebase.perf.session.PerfSession r4 = (com.google.firebase.perf.session.PerfSession) r4     // Catch:{ all -> 0x0095 }
            if (r4 == 0) goto L_0x002c
            r2.add(r4)     // Catch:{ all -> 0x0095 }
            goto L_0x002c
        L_0x003e:
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x0095 }
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            tb.k[] r0 = com.google.firebase.perf.session.PerfSession.d(r2)
            if (r0 == 0) goto L_0x0059
            tb.h$a r2 = r7.f13253o
            java.util.List r0 = java.util.Arrays.asList(r0)
            r2.s()
            MessageType r2 = r2.f7906b
            tb.h r2 = (tb.h) r2
            tb.h.P(r2, r0)
        L_0x0059:
            tb.h$a r0 = r7.f13253o
            com.google.protobuf.i r0 = r0.q()
            tb.h r0 = (tb.h) r0
            java.lang.String r2 = r7.f13255q
            r3 = 1
            if (r2 == 0) goto L_0x0073
            java.util.regex.Pattern r4 = ob.h.f13816a
            java.util.regex.Matcher r2 = r4.matcher(r2)
            boolean r2 = r2.matches()
            if (r2 != 0) goto L_0x0076
            goto L_0x0075
        L_0x0073:
            java.util.regex.Pattern r1 = ob.h.f13816a
        L_0x0075:
            r1 = r3
        L_0x0076:
            if (r1 != 0) goto L_0x007e
            lb.a r0 = f13249s
            r0.a()
            return
        L_0x007e:
            boolean r1 = r7.f13256r
            if (r1 != 0) goto L_0x0094
            rb.d r1 = r7.f13252n
            tb.d r2 = r7.f11418d
            java.util.concurrent.ThreadPoolExecutor r4 = r1.f14555p
            w.o r5 = new w.o
            r6 = 8
            r5.<init>(r6, r1, r0, r2)
            r4.execute(r5)
            r7.f13256r = r3
        L_0x0094:
            return
        L_0x0095:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0095 }
            throw r1
        L_0x0098:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0098 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mb.d.e():void");
    }

    public final void g(String str) {
        h.c cVar;
        if (str != null) {
            String upperCase = str.toUpperCase();
            upperCase.getClass();
            char c10 = 65535;
            switch (upperCase.hashCode()) {
                case -531492226:
                    if (upperCase.equals("OPTIONS")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 70454:
                    if (upperCase.equals("GET")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 79599:
                    if (upperCase.equals("PUT")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 2213344:
                    if (upperCase.equals("HEAD")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 2461856:
                    if (upperCase.equals("POST")) {
                        c10 = 4;
                        break;
                    }
                    break;
                case 75900968:
                    if (upperCase.equals("PATCH")) {
                        c10 = 5;
                        break;
                    }
                    break;
                case 80083237:
                    if (upperCase.equals("TRACE")) {
                        c10 = 6;
                        break;
                    }
                    break;
                case 1669334218:
                    if (upperCase.equals("CONNECT")) {
                        c10 = 7;
                        break;
                    }
                    break;
                case 2012838315:
                    if (upperCase.equals("DELETE")) {
                        c10 = 8;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    cVar = h.c.OPTIONS;
                    break;
                case 1:
                    cVar = h.c.GET;
                    break;
                case 2:
                    cVar = h.c.PUT;
                    break;
                case 3:
                    cVar = h.c.HEAD;
                    break;
                case 4:
                    cVar = h.c.POST;
                    break;
                case 5:
                    cVar = h.c.PATCH;
                    break;
                case 6:
                    cVar = h.c.TRACE;
                    break;
                case 7:
                    cVar = h.c.CONNECT;
                    break;
                case 8:
                    cVar = h.c.DELETE;
                    break;
                default:
                    cVar = h.c.HTTP_METHOD_UNKNOWN;
                    break;
            }
            h.a aVar = this.f13253o;
            aVar.s();
            h.Q((h) aVar.f7906b, cVar);
        }
    }

    public final void h(int i10) {
        h.a aVar = this.f13253o;
        aVar.s();
        h.I((h) aVar.f7906b, i10);
    }

    public final void i(long j10) {
        h.a aVar = this.f13253o;
        aVar.s();
        h.R((h) aVar.f7906b, j10);
    }

    public final void j(long j10) {
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.f13254p);
        h.a aVar = this.f13253o;
        aVar.s();
        h.L((h) aVar.f7906b, j10);
        d(perfSession);
        if (perfSession.f7661c) {
            this.f13251f.collectGaugeMetricOnce(perfSession.f7660b);
        }
    }

    public final void k(String str) {
        if (str == null) {
            h.a aVar = this.f13253o;
            aVar.s();
            h.K((h) aVar.f7906b);
            return;
        }
        boolean z10 = false;
        if (str.length() <= 128) {
            int i10 = 0;
            while (true) {
                if (i10 >= str.length()) {
                    z10 = true;
                    break;
                }
                char charAt = str.charAt(i10);
                if (charAt <= 31 || charAt > 127) {
                    break;
                }
                i10++;
            }
        }
        if (z10) {
            h.a aVar2 = this.f13253o;
            aVar2.s();
            h.J((h) aVar2.f7906b, str);
            return;
        }
        f13249s.f();
    }

    public final void l(long j10) {
        h.a aVar = this.f13253o;
        aVar.s();
        h.S((h) aVar.f7906b, j10);
    }

    public final void m(long j10) {
        h.a aVar = this.f13253o;
        aVar.s();
        h.O((h) aVar.f7906b, j10);
        if (SessionManager.getInstance().perfSession().f7661c) {
            this.f13251f.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f7660b);
        }
    }

    public final void n(String str) {
        HttpUrl httpUrl;
        int lastIndexOf;
        if (str != null) {
            HttpUrl.f22005k.getClass();
            HttpUrl httpUrl2 = null;
            try {
                httpUrl = HttpUrl.Companion.c(str);
            } catch (IllegalArgumentException unused) {
                httpUrl = null;
            }
            if (httpUrl != null) {
                HttpUrl.Builder f10 = httpUrl.f();
                HttpUrl.Companion companion = HttpUrl.f22005k;
                f10.f22019b = HttpUrl.Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
                f10.f22020c = HttpUrl.Companion.a(companion, "", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, (Charset) null, 251);
                f10.f22024g = null;
                f10.f22025h = null;
                str = f10.toString();
            }
            h.a aVar = this.f13253o;
            if (str.length() > 2000) {
                if (str.charAt(2000) == '/') {
                    str = str.substring(0, 2000);
                } else {
                    try {
                        httpUrl2 = HttpUrl.Companion.c(str);
                    } catch (IllegalArgumentException unused2) {
                    }
                    if (httpUrl2 == null) {
                        str = str.substring(0, 2000);
                    } else if (httpUrl2.b().lastIndexOf(47) < 0 || (lastIndexOf = str.lastIndexOf(47, 1999)) < 0) {
                        str = str.substring(0, 2000);
                    } else {
                        str = str.substring(0, lastIndexOf);
                    }
                }
            }
            aVar.s();
            h.G((h) aVar.f7906b, str);
        }
    }
}
