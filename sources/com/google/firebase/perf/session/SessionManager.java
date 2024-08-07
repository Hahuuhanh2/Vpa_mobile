package com.google.firebase.perf.session;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import c0.s0;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.session.gauges.GaugeManager;
import ib.a;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import tb.d;

@Keep
public class SessionManager {
    @SuppressLint({"StaticFieldLeak"})
    private static final SessionManager instance = new SessionManager();
    private final a appStateMonitor;
    private final Set<WeakReference<pb.a>> clients;
    private final GaugeManager gaugeManager;
    private PerfSession perfSession;
    private Future syncInitFuture;

    private SessionManager() {
        this(GaugeManager.getInstance(), PerfSession.e(""), a.a());
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, PerfSession perfSession2) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (perfSession2.f7661c) {
            this.gaugeManager.logGaugeMetadata(perfSession2.f7659a, d.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(d dVar) {
        PerfSession perfSession2 = this.perfSession;
        if (perfSession2.f7661c) {
            this.gaugeManager.logGaugeMetadata(perfSession2.f7659a, dVar);
        }
    }

    private void startOrStopCollectingGauges(d dVar) {
        PerfSession perfSession2 = this.perfSession;
        if (perfSession2.f7661c) {
            this.gaugeManager.startCollectingGauges(perfSession2, dVar);
        } else {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    @VisibleForTesting
    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        d dVar = d.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(dVar);
        startOrStopCollectingGauges(dVar);
    }

    public final PerfSession perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<pb.a> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new s0(7, this, context, this.perfSession));
    }

    @VisibleForTesting
    public void setPerfSession(PerfSession perfSession2) {
        this.perfSession = perfSession2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void stopGaugeCollectionIfSessionRunningTooLong() {
        /*
            r12 = this;
            com.google.firebase.perf.session.PerfSession r0 = r12.perfSession
            r0.getClass()
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS
            com.google.firebase.perf.util.Timer r0 = r0.f7660b
            long r2 = r0.a()
            long r0 = r1.toMinutes(r2)
            jb.a r2 = jb.a.e()
            r2.getClass()
            java.lang.Class<jb.o> r3 = jb.o.class
            monitor-enter(r3)
            jb.o r4 = jb.o.f11856b     // Catch:{ all -> 0x00cf }
            if (r4 != 0) goto L_0x0026
            jb.o r4 = new jb.o     // Catch:{ all -> 0x00cf }
            r4.<init>()     // Catch:{ all -> 0x00cf }
            jb.o.f11856b = r4     // Catch:{ all -> 0x00cf }
        L_0x0026:
            jb.o r4 = jb.o.f11856b     // Catch:{ all -> 0x00cf }
            monitor-exit(r3)
            sb.e r3 = r2.j(r4)
            boolean r5 = r3.b()
            r6 = 0
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0056
            java.lang.Object r5 = r3.a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r10 = r5.longValue()
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0047
            r5 = r8
            goto L_0x0048
        L_0x0047:
            r5 = r9
        L_0x0048:
            if (r5 == 0) goto L_0x0056
            java.lang.Object r2 = r3.a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L_0x00c1
        L_0x0056:
            sb.e r3 = r2.l(r4)
            boolean r5 = r3.b()
            if (r5 == 0) goto L_0x008f
            java.lang.Object r5 = r3.a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r10 = r5.longValue()
            int r5 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r5 <= 0) goto L_0x0070
            r5 = r8
            goto L_0x0071
        L_0x0070:
            r5 = r9
        L_0x0071:
            if (r5 == 0) goto L_0x008f
            jb.v r2 = r2.f11841c
            java.lang.String r4 = "com.google.firebase.perf.SessionsMaxDurationMinutes"
            java.lang.Object r5 = r3.a()
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            r2.c(r5, r4)
            java.lang.Object r2 = r3.a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L_0x00c1
        L_0x008f:
            sb.e r2 = r2.c(r4)
            boolean r3 = r2.b()
            if (r3 == 0) goto L_0x00b7
            java.lang.Object r3 = r2.a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a9
            r3 = r8
            goto L_0x00aa
        L_0x00a9:
            r3 = r9
        L_0x00aa:
            if (r3 == 0) goto L_0x00b7
            java.lang.Object r2 = r2.a()
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            goto L_0x00c1
        L_0x00b7:
            r2 = 240(0xf0, double:1.186E-321)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            long r2 = r2.longValue()
        L_0x00c1:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r8 = r9
        L_0x00c7:
            if (r8 == 0) goto L_0x00ce
            com.google.firebase.perf.session.gauges.GaugeManager r0 = r12.gaugeManager
            r0.stopCollectingGauges()
        L_0x00ce:
            return
        L_0x00cf:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.session.SessionManager.stopGaugeCollectionIfSessionRunningTooLong():void");
    }

    public void unregisterForSessionUpdates(WeakReference<pb.a> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(PerfSession perfSession2) {
        if (perfSession2.f7659a != this.perfSession.f7659a) {
            this.perfSession = perfSession2;
            synchronized (this.clients) {
                Iterator<WeakReference<pb.a>> it = this.clients.iterator();
                while (it.hasNext()) {
                    pb.a aVar = (pb.a) it.next().get();
                    if (aVar != null) {
                        aVar.d(perfSession2);
                    } else {
                        it.remove();
                    }
                }
            }
            logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.f11412v);
            startOrStopCollectingGauges(this.appStateMonitor.f11412v);
        }
    }

    @VisibleForTesting
    public SessionManager(GaugeManager gaugeManager2, PerfSession perfSession2, a aVar) {
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager2;
        this.perfSession = perfSession2;
        this.appStateMonitor = aVar;
    }
}
