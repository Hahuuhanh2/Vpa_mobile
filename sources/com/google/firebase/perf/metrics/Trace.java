package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import ib.a;
import ib.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import n0.l;
import nb.e;
import rb.d;
import v.v;

public class Trace extends b implements Parcelable, pb.a {
    @Keep
    public static final Parcelable.Creator<Trace> CREATOR = new a();

    /* renamed from: x  reason: collision with root package name */
    public static final lb.a f7646x = lb.a.d();

    /* renamed from: e  reason: collision with root package name */
    public final WeakReference<pb.a> f7647e;

    /* renamed from: f  reason: collision with root package name */
    public final Trace f7648f;

    /* renamed from: n  reason: collision with root package name */
    public final GaugeManager f7649n;

    /* renamed from: o  reason: collision with root package name */
    public final String f7650o;

    /* renamed from: p  reason: collision with root package name */
    public final ConcurrentHashMap f7651p;

    /* renamed from: q  reason: collision with root package name */
    public final ConcurrentHashMap f7652q;

    /* renamed from: r  reason: collision with root package name */
    public final List<PerfSession> f7653r;

    /* renamed from: s  reason: collision with root package name */
    public final ArrayList f7654s;

    /* renamed from: t  reason: collision with root package name */
    public final d f7655t;

    /* renamed from: u  reason: collision with root package name */
    public final lb.b f7656u;

    /* renamed from: v  reason: collision with root package name */
    public Timer f7657v;

    /* renamed from: w  reason: collision with root package name */
    public Timer f7658w;

    public class a implements Parcelable.Creator<Trace> {
        public final Object createFromParcel(Parcel parcel) {
            return new Trace(parcel, false);
        }

        public final Object[] newArray(int i10) {
            return new Trace[i10];
        }
    }

    static {
        new ConcurrentHashMap();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Trace(String str, d dVar, lb.b bVar, ib.a aVar) {
        super(aVar);
        GaugeManager instance = GaugeManager.getInstance();
        this.f7647e = new WeakReference<>(this);
        this.f7648f = null;
        this.f7650o = str.trim();
        this.f7654s = new ArrayList();
        this.f7651p = new ConcurrentHashMap();
        this.f7652q = new ConcurrentHashMap();
        this.f7656u = bVar;
        this.f7655t = dVar;
        this.f7653r = Collections.synchronizedList(new ArrayList());
        this.f7649n = instance;
    }

    public final void d(PerfSession perfSession) {
        boolean z10;
        if (perfSession == null) {
            f7646x.f();
            return;
        }
        if (this.f7657v != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && !f()) {
            this.f7653r.add(perfSession);
        }
    }

    @Keep
    public int describeContents() {
        return 0;
    }

    public final void e(String str, String str2) {
        if (f()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", new Object[]{this.f7650o}));
        } else if (this.f7652q.containsKey(str) || this.f7652q.size() < 5) {
            e.b(str, str2);
        } else {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", new Object[]{5}));
        }
    }

    @VisibleForTesting
    public final boolean f() {
        if (this.f7658w != null) {
            return true;
        }
        return false;
    }

    public final void finalize() {
        boolean z10;
        boolean z11;
        try {
            if (this.f7657v != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 || f()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11) {
                f7646x.g("Trace '%s' is started but not stopped when it is destructed!", this.f7650o);
                this.f11415a.f11405o.addAndGet(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.f7652q.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.f7652q);
    }

    @Keep
    public long getLongMetric(String str) {
        Counter counter;
        if (str != null) {
            counter = (Counter) this.f7651p.get(str.trim());
        } else {
            counter = null;
        }
        if (counter == null) {
            return 0;
        }
        return counter.f7645b.get();
    }

    @Keep
    public void incrementMetric(String str, long j10) {
        boolean z10;
        String c10 = e.c(str);
        if (c10 != null) {
            f7646x.c("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, c10);
            return;
        }
        if (this.f7657v != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            f7646x.g("Cannot increment metric '%s' for trace '%s' because it's not started", str, this.f7650o);
        } else if (f()) {
            f7646x.g("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, this.f7650o);
        } else {
            String trim = str.trim();
            Counter counter = (Counter) this.f7651p.get(trim);
            if (counter == null) {
                counter = new Counter(trim);
                this.f7651p.put(trim, counter);
            }
            counter.f7645b.addAndGet(j10);
            f7646x.b("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(counter.f7645b.get()), this.f7650o);
        }
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z10 = false;
        try {
            str = str.trim();
            str2 = str2.trim();
            e(str, str2);
            f7646x.b("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.f7650o);
            z10 = true;
        } catch (Exception e10) {
            f7646x.c("Can not set attribute '%s' with value '%s' (%s)", str, str2, e10.getMessage());
        }
        if (z10) {
            this.f7652q.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j10) {
        boolean z10;
        String c10 = e.c(str);
        if (c10 != null) {
            f7646x.c("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, c10);
            return;
        }
        if (this.f7657v != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            f7646x.g("Cannot set value for metric '%s' for trace '%s' because it's not started", str, this.f7650o);
        } else if (f()) {
            f7646x.g("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, this.f7650o);
        } else {
            String trim = str.trim();
            Counter counter = (Counter) this.f7651p.get(trim);
            if (counter == null) {
                counter = new Counter(trim);
                this.f7651p.put(trim, counter);
            }
            counter.f7645b.set(j10);
            f7646x.b("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j10), this.f7650o);
        }
    }

    @Keep
    public void removeAttribute(String str) {
        if (f()) {
            lb.a aVar = f7646x;
            if (aVar.f12901b) {
                aVar.f12900a.getClass();
                return;
            }
            return;
        }
        this.f7652q.remove(str);
    }

    @Keep
    public void start() {
        String str;
        if (!jb.a.e().p()) {
            f7646x.a();
            return;
        }
        String str2 = this.f7650o;
        if (str2 == null) {
            str = "Trace name must not be null";
        } else if (str2.length() > 100) {
            str = String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{100});
        } else {
            if (str2.startsWith("_")) {
                int[] k10 = v.k(6);
                int length = k10.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        if (l.c(k10[i10]).equals(str2)) {
                            break;
                        }
                        i10++;
                    } else if (!str2.startsWith("_st_")) {
                        str = "Trace name must not start with '_'";
                    }
                }
            }
            str = null;
        }
        if (str != null) {
            f7646x.c("Cannot start trace '%s'. Trace name is invalid.(%s)", this.f7650o, str);
        } else if (this.f7657v != null) {
            f7646x.c("Trace '%s' has already started, should not start again!", this.f7650o);
        } else {
            this.f7656u.getClass();
            this.f7657v = new Timer();
            if (!this.f11417c) {
                ib.a aVar = this.f11415a;
                this.f11418d = aVar.f11412v;
                WeakReference<a.b> weakReference = this.f11416b;
                synchronized (aVar.f11403f) {
                    aVar.f11403f.add(weakReference);
                }
                this.f11417c = true;
            }
            PerfSession perfSession = SessionManager.getInstance().perfSession();
            SessionManager.getInstance().registerForSessionUpdates(this.f7647e);
            d(perfSession);
            if (perfSession.f7661c) {
                this.f7649n.collectGaugeMetricOnce(perfSession.f7660b);
            }
        }
    }

    @Keep
    public void stop() {
        boolean z10;
        if (this.f7657v != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            f7646x.c("Trace '%s' has not been started so unable to stop!", this.f7650o);
        } else if (f()) {
            f7646x.c("Trace '%s' has already stopped, should not stop again!", this.f7650o);
        } else {
            SessionManager.getInstance().unregisterForSessionUpdates(this.f7647e);
            if (this.f11417c) {
                ib.a aVar = this.f11415a;
                WeakReference<a.b> weakReference = this.f11416b;
                synchronized (aVar.f11403f) {
                    aVar.f11403f.remove(weakReference);
                }
                this.f11417c = false;
            }
            this.f7656u.getClass();
            Timer timer = new Timer();
            this.f7658w = timer;
            if (this.f7648f == null) {
                if (!this.f7654s.isEmpty()) {
                    Trace trace = (Trace) this.f7654s.get(this.f7654s.size() - 1);
                    if (trace.f7658w == null) {
                        trace.f7658w = timer;
                    }
                }
                if (!this.f7650o.isEmpty()) {
                    this.f7655t.d(new mb.e(this).a(), this.f11418d);
                    if (SessionManager.getInstance().perfSession().f7661c) {
                        this.f7649n.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().f7660b);
                        return;
                    }
                    return;
                }
                lb.a aVar2 = f7646x;
                if (aVar2.f12901b) {
                    aVar2.f12900a.getClass();
                }
            }
        }
    }

    @Keep
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7648f, 0);
        parcel.writeString(this.f7650o);
        parcel.writeList(this.f7654s);
        parcel.writeMap(this.f7651p);
        parcel.writeParcelable(this.f7657v, 0);
        parcel.writeParcelable(this.f7658w, 0);
        synchronized (this.f7653r) {
            parcel.writeList(this.f7653r);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Trace(Parcel parcel, boolean z10) {
        super(z10 ? null : ib.a.a());
        this.f7647e = new WeakReference<>(this);
        this.f7648f = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.f7650o = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f7654s = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f7651p = concurrentHashMap;
        this.f7652q = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f7657v = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.f7658w = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List<PerfSession> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f7653r = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z10) {
            this.f7655t = null;
            this.f7656u = null;
            this.f7649n = null;
            return;
        }
        this.f7655t = d.f14546z;
        this.f7656u = new lb.b(7);
        this.f7649n = GaugeManager.getInstance();
    }
}
