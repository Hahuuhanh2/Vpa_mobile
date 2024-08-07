package rb;

import android.content.Context;
import com.google.firebase.perf.util.Timer;
import com.google.protobuf.k;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import jb.h;
import jb.s;
import jb.t;
import lb.b;
import sb.e;
import sb.g;
import sb.j;
import tb.l;

/* compiled from: RateLimiter */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final jb.a f14527a;

    /* renamed from: b  reason: collision with root package name */
    public final double f14528b;

    /* renamed from: c  reason: collision with root package name */
    public final double f14529c;

    /* renamed from: d  reason: collision with root package name */
    public a f14530d = null;

    /* renamed from: e  reason: collision with root package name */
    public a f14531e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean f14532f;

    /* compiled from: RateLimiter */
    public static class a {

        /* renamed from: k  reason: collision with root package name */
        public static final lb.a f14533k = lb.a.d();

        /* renamed from: l  reason: collision with root package name */
        public static final long f14534l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a  reason: collision with root package name */
        public final b f14535a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14536b;

        /* renamed from: c  reason: collision with root package name */
        public Timer f14537c;

        /* renamed from: d  reason: collision with root package name */
        public g f14538d;

        /* renamed from: e  reason: collision with root package name */
        public long f14539e = 500;

        /* renamed from: f  reason: collision with root package name */
        public double f14540f;

        /* renamed from: g  reason: collision with root package name */
        public g f14541g;

        /* renamed from: h  reason: collision with root package name */
        public g f14542h;

        /* renamed from: i  reason: collision with root package name */
        public long f14543i;

        /* renamed from: j  reason: collision with root package name */
        public long f14544j;

        public a(g gVar, b bVar, jb.a aVar, String str, boolean z10) {
            long j10;
            long j11;
            long j12;
            long j13;
            jb.g gVar2;
            s sVar;
            h hVar;
            t tVar;
            jb.a aVar2 = aVar;
            String str2 = str;
            boolean z11 = z10;
            this.f14535a = bVar;
            this.f14538d = gVar;
            this.f14540f = (double) 500;
            this.f14537c = new Timer();
            if (str2 == "Trace") {
                j10 = aVar.k();
            } else {
                j10 = aVar.k();
            }
            long j14 = j10;
            if (str2 == "Trace") {
                synchronized (t.class) {
                    if (t.f11861b == null) {
                        t.f11861b = new t();
                    }
                    tVar = t.f11861b;
                }
                e<Long> l10 = aVar2.l(tVar);
                if (!l10.b() || !jb.a.m(l10.a().longValue())) {
                    e<Long> c10 = aVar2.c(tVar);
                    if (!c10.b() || !jb.a.m(c10.a().longValue())) {
                        Long l11 = 300L;
                        j11 = l11.longValue();
                    } else {
                        j11 = c10.a().longValue();
                    }
                } else {
                    aVar2.f11841c.c(l10.a().longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                    j11 = l10.a().longValue();
                }
            } else {
                synchronized (h.class) {
                    if (h.f11849b == null) {
                        h.f11849b = new h();
                    }
                    hVar = h.f11849b;
                }
                e<Long> l12 = aVar2.l(hVar);
                if (!l12.b() || !jb.a.m(l12.a().longValue())) {
                    e<Long> c11 = aVar2.c(hVar);
                    if (!c11.b() || !jb.a.m(c11.a().longValue())) {
                        Long l13 = 700L;
                        j11 = l13.longValue();
                    } else {
                        j11 = c11.a().longValue();
                    }
                } else {
                    aVar2.f11841c.c(l12.a().longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    j11 = l12.a().longValue();
                }
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            g gVar3 = new g(j11, j14, timeUnit);
            this.f14541g = gVar3;
            this.f14543i = j11;
            if (z11) {
                f14533k.b("Foreground %s logging rate:%f, burst capacity:%d", str2, gVar3, Long.valueOf(j11));
            }
            if (str2 == "Trace") {
                j12 = aVar.k();
            } else {
                j12 = aVar.k();
            }
            long j15 = j12;
            if (str2 == "Trace") {
                synchronized (s.class) {
                    if (s.f11860b == null) {
                        s.f11860b = new s();
                    }
                    sVar = s.f11860b;
                }
                e<Long> l14 = aVar2.l(sVar);
                if (!l14.b() || !jb.a.m(l14.a().longValue())) {
                    e<Long> c12 = aVar2.c(sVar);
                    if (!c12.b() || !jb.a.m(c12.a().longValue())) {
                        Long l15 = 30L;
                        j13 = l15.longValue();
                    } else {
                        j13 = c12.a().longValue();
                    }
                } else {
                    aVar2.f11841c.c(l14.a().longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                    j13 = l14.a().longValue();
                }
            } else {
                synchronized (jb.g.class) {
                    if (jb.g.f11848b == null) {
                        jb.g.f11848b = new jb.g();
                    }
                    gVar2 = jb.g.f11848b;
                }
                e<Long> l16 = aVar2.l(gVar2);
                if (!l16.b() || !jb.a.m(l16.a().longValue())) {
                    e<Long> c13 = aVar2.c(gVar2);
                    if (!c13.b() || !jb.a.m(c13.a().longValue())) {
                        Long l17 = 70L;
                        j13 = l17.longValue();
                    } else {
                        j13 = c13.a().longValue();
                    }
                } else {
                    aVar2.f11841c.c(l16.a().longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                    j13 = l16.a().longValue();
                }
            }
            g gVar4 = new g(j13, j15, timeUnit);
            this.f14542h = gVar4;
            this.f14544j = j13;
            if (z11) {
                f14533k.b("Background %s logging rate:%f, capacity:%d", str2, gVar4, Long.valueOf(j13));
            }
            this.f14536b = z11;
        }

        public final synchronized boolean a() {
            this.f14535a.getClass();
            Timer timer = new Timer();
            Timer timer2 = this.f14537c;
            timer2.getClass();
            double a10 = (((double) (timer.f7663b - timer2.f7663b)) * this.f14538d.a()) / ((double) f14534l);
            if (a10 > 0.0d) {
                this.f14540f = Math.min(this.f14540f + a10, (double) this.f14539e);
                this.f14537c = timer;
            }
            double d10 = this.f14540f;
            if (d10 >= 1.0d) {
                this.f14540f = d10 - 1.0d;
                return true;
            }
            if (this.f14536b) {
                f14533k.f();
            }
            return false;
        }
    }

    public c(Context context, g gVar) {
        boolean z10;
        b bVar = new b(7);
        double nextDouble = new Random().nextDouble();
        double nextDouble2 = new Random().nextDouble();
        jb.a e10 = jb.a.e();
        boolean z11 = false;
        this.f14532f = false;
        if (0.0d > nextDouble || nextDouble >= 1.0d) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            if (0.0d <= nextDouble2 && nextDouble2 < 1.0d) {
                z11 = true;
            }
            if (z11) {
                this.f14528b = nextDouble;
                this.f14529c = nextDouble2;
                this.f14527a = e10;
                g gVar2 = gVar;
                b bVar2 = bVar;
                jb.a aVar = e10;
                this.f14530d = new a(gVar2, bVar2, aVar, "Trace", this.f14532f);
                this.f14531e = new a(gVar2, bVar2, aVar, "Network", this.f14532f);
                this.f14532f = j.a(context);
                return;
            }
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0, 1.0).");
        }
        throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0, 1.0).");
    }

    public static boolean a(k.c cVar) {
        if (cVar.size() <= 0 || ((tb.k) cVar.get(0)).J() <= 0 || ((tb.k) cVar.get(0)).I() != l.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }
}
