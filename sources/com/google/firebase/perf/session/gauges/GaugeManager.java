package com.google.firebase.perf.session.gauges;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import c0.s0;
import ca.i;
import ca.o;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import da.h;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import jb.m;
import jb.n;
import jb.p;
import jb.q;
import lb.a;
import qb.b;
import qb.c;
import sb.e;
import sb.i;
import sb.j;
import tb.d;
import tb.f;
import tb.g;

@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private static final GaugeManager instance = new GaugeManager();
    private static final a logger = a.d();
    private d applicationProcessState;
    private final jb.a configResolver;
    private final o<qb.a> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final o<ScheduledExecutorService> gaugeManagerExecutor;
    private b gaugeMetadataManager;
    private final o<c> memoryGaugeCollector;
    private String sessionId;
    private final rb.d transportManager;

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new o(new i(3)), rb.d.f14546z, jb.a.e(), (b) null, new o(new da.i(1)), new o(new h(2)));
    }

    private static void collectGaugeMetricOnce(qb.a aVar, c cVar, Timer timer) {
        synchronized (aVar) {
            try {
                aVar.f14391b.schedule(new mb.b(1, aVar, timer), 0, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e10) {
                a aVar2 = qb.a.f14388g;
                e10.getMessage();
                aVar2.f();
            }
        }
        synchronized (cVar) {
            try {
                cVar.f14400a.schedule(new oa.c(2, cVar, timer), 0, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e11) {
                a aVar3 = c.f14399f;
                e11.getMessage();
                aVar3.f();
            }
        }
        return;
    }

    private long getCpuGaugeCollectionFrequencyMs(d dVar) {
        long j10;
        n nVar;
        m mVar;
        int ordinal = dVar.ordinal();
        boolean z10 = true;
        if (ordinal == 1) {
            jb.a aVar = this.configResolver;
            aVar.getClass();
            synchronized (n.class) {
                if (n.f11855b == null) {
                    n.f11855b = new n();
                }
                nVar = n.f11855b;
            }
            e<Long> j11 = aVar.j(nVar);
            if (!j11.b() || !jb.a.o(j11.a().longValue())) {
                e<Long> l10 = aVar.l(nVar);
                if (!l10.b() || !jb.a.o(l10.a().longValue())) {
                    e<Long> c10 = aVar.c(nVar);
                    if (c10.b() && jb.a.o(c10.a().longValue())) {
                        j10 = c10.a().longValue();
                    } else if (aVar.f11839a.isLastFetchFailed()) {
                        Long l11 = 100L;
                        j10 = Long.valueOf(l11.longValue() * 3).longValue();
                    } else {
                        Long l12 = 100L;
                        j10 = l12.longValue();
                    }
                } else {
                    aVar.f11841c.c(l10.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    j10 = l10.a().longValue();
                }
            } else {
                j10 = j11.a().longValue();
            }
        } else if (ordinal != 2) {
            j10 = -1;
        } else {
            jb.a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (m.class) {
                if (m.f11854b == null) {
                    m.f11854b = new m();
                }
                mVar = m.f11854b;
            }
            e<Long> j12 = aVar2.j(mVar);
            if (!j12.b() || !jb.a.o(j12.a().longValue())) {
                e<Long> l13 = aVar2.l(mVar);
                if (!l13.b() || !jb.a.o(l13.a().longValue())) {
                    e<Long> c11 = aVar2.c(mVar);
                    if (!c11.b() || !jb.a.o(c11.a().longValue())) {
                        Long l14 = 0L;
                        j10 = l14.longValue();
                    } else {
                        j10 = c11.a().longValue();
                    }
                } else {
                    aVar2.f11841c.c(l13.a().longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    j10 = l13.a().longValue();
                }
            } else {
                j10 = j12.a().longValue();
            }
        }
        a aVar3 = qb.a.f14388g;
        if (j10 > 0) {
            z10 = false;
        }
        if (z10) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return j10;
    }

    private f getGaugeMetadata() {
        f.a L = f.L();
        b bVar = this.gaugeMetadataManager;
        i.e eVar = sb.i.f14722d;
        i.d dVar = sb.i.f14721c;
        int b10 = j.b((bVar.f14398c.totalMem * eVar.f14724a) / dVar.f14724a);
        L.s();
        f.I((f) L.f7906b, b10);
        int b11 = j.b((this.gaugeMetadataManager.f14396a.maxMemory() * eVar.f14724a) / dVar.f14724a);
        L.s();
        f.G((f) L.f7906b, b11);
        int b12 = j.b((((long) this.gaugeMetadataManager.f14397b.getMemoryClass()) * sb.i.f14720b.f14724a) / dVar.f14724a);
        L.s();
        f.H((f) L.f7906b, b12);
        return (f) L.q();
    }

    public static synchronized GaugeManager getInstance() {
        GaugeManager gaugeManager;
        synchronized (GaugeManager.class) {
            gaugeManager = instance;
        }
        return gaugeManager;
    }

    private long getMemoryGaugeCollectionFrequencyMs(d dVar) {
        long j10;
        q qVar;
        p pVar;
        int ordinal = dVar.ordinal();
        boolean z10 = true;
        if (ordinal == 1) {
            jb.a aVar = this.configResolver;
            aVar.getClass();
            synchronized (q.class) {
                if (q.f11858b == null) {
                    q.f11858b = new q();
                }
                qVar = q.f11858b;
            }
            e<Long> j11 = aVar.j(qVar);
            if (!j11.b() || !jb.a.o(j11.a().longValue())) {
                e<Long> l10 = aVar.l(qVar);
                if (!l10.b() || !jb.a.o(l10.a().longValue())) {
                    e<Long> c10 = aVar.c(qVar);
                    if (c10.b() && jb.a.o(c10.a().longValue())) {
                        j10 = c10.a().longValue();
                    } else if (aVar.f11839a.isLastFetchFailed()) {
                        Long l11 = 100L;
                        j10 = Long.valueOf(l11.longValue() * 3).longValue();
                    } else {
                        Long l12 = 100L;
                        j10 = l12.longValue();
                    }
                } else {
                    aVar.f11841c.c(l10.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    j10 = l10.a().longValue();
                }
            } else {
                j10 = j11.a().longValue();
            }
        } else if (ordinal != 2) {
            j10 = -1;
        } else {
            jb.a aVar2 = this.configResolver;
            aVar2.getClass();
            synchronized (p.class) {
                if (p.f11857b == null) {
                    p.f11857b = new p();
                }
                pVar = p.f11857b;
            }
            e<Long> j12 = aVar2.j(pVar);
            if (!j12.b() || !jb.a.o(j12.a().longValue())) {
                e<Long> l13 = aVar2.l(pVar);
                if (!l13.b() || !jb.a.o(l13.a().longValue())) {
                    e<Long> c11 = aVar2.c(pVar);
                    if (!c11.b() || !jb.a.o(c11.a().longValue())) {
                        Long l14 = 0L;
                        j10 = l14.longValue();
                    } else {
                        j10 = c11.a().longValue();
                    }
                } else {
                    aVar2.f11841c.c(l13.a().longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    j10 = l13.a().longValue();
                }
            } else {
                j10 = j12.a().longValue();
            }
        }
        a aVar3 = c.f14399f;
        if (j10 > 0) {
            z10 = false;
        }
        if (z10) {
            return INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        return j10;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ qb.a lambda$new$0() {
        return new qb.a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ c lambda$new$1() {
        return new c();
    }

    private boolean startCollectingCpuMetrics(long j10, Timer timer) {
        boolean z10;
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a();
            return false;
        }
        qb.a aVar = this.cpuGaugeCollector.get();
        long j11 = aVar.f14393d;
        if (!(j11 == INVALID_GAUGE_COLLECTION_FREQUENCY || j11 == 0)) {
            if (j10 <= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                ScheduledFuture scheduledFuture = aVar.f14394e;
                if (scheduledFuture == null) {
                    aVar.a(j10, timer);
                } else if (aVar.f14395f != j10) {
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                        aVar.f14394e = null;
                        aVar.f14395f = INVALID_GAUGE_COLLECTION_FREQUENCY;
                    }
                    aVar.a(j10, timer);
                }
            }
        }
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, Timer timer) {
        boolean z10;
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a();
            return false;
        }
        c cVar = this.memoryGaugeCollector.get();
        a aVar = c.f14399f;
        if (j10 <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            cVar.getClass();
        } else {
            ScheduledFuture scheduledFuture = cVar.f14403d;
            if (scheduledFuture == null) {
                cVar.a(j10, timer);
            } else if (cVar.f14404e != j10) {
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    cVar.f14403d = null;
                    cVar.f14404e = INVALID_GAUGE_COLLECTION_FREQUENCY;
                }
                cVar.a(j10, timer);
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: syncFlush */
    public void lambda$stopCollectingGauges$3(String str, d dVar) {
        g.a Q = g.Q();
        while (!this.cpuGaugeCollector.get().f14390a.isEmpty()) {
            Q.s();
            g.J((g) Q.f7906b, this.cpuGaugeCollector.get().f14390a.poll());
        }
        while (!this.memoryGaugeCollector.get().f14401b.isEmpty()) {
            Q.s();
            g.H((g) Q.f7906b, this.memoryGaugeCollector.get().f14401b.poll());
        }
        Q.s();
        g.G((g) Q.f7906b, str);
        rb.d dVar2 = this.transportManager;
        dVar2.f14555p.execute(new s0(9, dVar2, (g) Q.q(), dVar));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new b(context);
    }

    public boolean logGaugeMetadata(String str, d dVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        g.a Q = g.Q();
        Q.s();
        g.G((g) Q.f7906b, str);
        f gaugeMetadata = getGaugeMetadata();
        Q.s();
        g.I((g) Q.f7906b, gaugeMetadata);
        rb.d dVar2 = this.transportManager;
        dVar2.f14555p.execute(new s0(9, dVar2, (g) Q.q(), dVar));
        return true;
    }

    public void startCollectingGauges(PerfSession perfSession, d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long startCollectingGauges = startCollectingGauges(dVar, perfSession.f7660b);
        if (startCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.f();
            return;
        }
        String str = perfSession.f7659a;
        this.sessionId = str;
        this.applicationProcessState = dVar;
        try {
            long j10 = startCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new w.o(7, this, str, dVar), j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            a aVar = logger;
            e10.getMessage();
            aVar.f();
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str != null) {
            d dVar = this.applicationProcessState;
            qb.a aVar = this.cpuGaugeCollector.get();
            ScheduledFuture scheduledFuture = aVar.f14394e;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                aVar.f14394e = null;
                aVar.f14395f = INVALID_GAUGE_COLLECTION_FREQUENCY;
            }
            c cVar = this.memoryGaugeCollector.get();
            ScheduledFuture scheduledFuture2 = cVar.f14403d;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
                cVar.f14403d = null;
                cVar.f14404e = INVALID_GAUGE_COLLECTION_FREQUENCY;
            }
            ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
            if (scheduledFuture3 != null) {
                scheduledFuture3.cancel(false);
            }
            this.gaugeManagerExecutor.get().schedule(new s0(8, this, str, dVar), 20, TimeUnit.MILLISECONDS);
            this.sessionId = null;
            this.applicationProcessState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        }
    }

    public GaugeManager(o<ScheduledExecutorService> oVar, rb.d dVar, jb.a aVar, b bVar, o<qb.a> oVar2, o<c> oVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = oVar;
        this.transportManager = dVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = bVar;
        this.cpuGaugeCollector = oVar2;
        this.memoryGaugeCollector = oVar3;
    }

    public void collectGaugeMetricOnce(Timer timer) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), timer);
    }

    private long startCollectingGauges(d dVar, Timer timer) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, timer)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, timer)) {
            return cpuGaugeCollectionFrequencyMs;
        }
        if (cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            return memoryGaugeCollectionFrequencyMs;
        }
        return Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
    }
}
