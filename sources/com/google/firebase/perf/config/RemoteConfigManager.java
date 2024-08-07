package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import ea.c;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import jb.v;
import lb.a;
import m9.d;
import vb.e;
import vb.f;
import vb.h;
import za.b;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final a logger = a.d();
    private final ConcurrentHashMap<String, f> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final v cache;
    private final Executor executor;
    private e firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private b<h> firebaseRemoteConfigProvider;

    /* JADX WARNING: Illegal instructions before constructor call */
    @android.annotation.SuppressLint({"ThreadPoolCreation"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private RemoteConfigManager() {
        /*
            r11 = this;
            lb.a r0 = jb.v.f11863c
            java.lang.Class<jb.v> r0 = jb.v.class
            monitor-enter(r0)
            jb.v r1 = jb.v.f11864d     // Catch:{ all -> 0x0043 }
            if (r1 != 0) goto L_0x0014
            jb.v r1 = new jb.v     // Catch:{ all -> 0x0043 }
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()     // Catch:{ all -> 0x0043 }
            r1.<init>(r2)     // Catch:{ all -> 0x0043 }
            jb.v.f11864d = r1     // Catch:{ all -> 0x0043 }
        L_0x0014:
            jb.v r3 = jb.v.f11864d     // Catch:{ all -> 0x0043 }
            monitor-exit(r0)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r10 = new java.util.concurrent.LinkedBlockingQueue
            r10.<init>()
            r5 = 0
            r6 = 1
            r7 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r9, r10)
            java.util.Random r1 = new java.util.Random
            r1.<init>()
            r2 = 25000(0x61a8, float:3.5032E-41)
            int r1 = r1.nextInt(r2)
            long r1 = (long) r1
            r4 = 5000(0x1388, double:2.4703E-320)
            long r6 = r1 + r4
            long r8 = getInitialStartupMillis()
            r5 = 0
            r2 = r11
            r4 = r0
            r2.<init>(r3, r4, r5, r6, r8)
            return
        L_0x0043:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.<init>():void");
    }

    @VisibleForTesting
    public static long getInitialStartupMillis() {
        m9.f fVar = (m9.f) d.d().b(m9.f.class);
        if (fVar != null) {
            return fVar.b();
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private f getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        f fVar = this.allRcConfigMap.get(str);
        if (fVar.a() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", fVar.d(), str);
        return fVar;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j10) {
        if (j10 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs) {
            return true;
        }
        return false;
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        if (j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.b());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (!hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) || !hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return false;
        }
        return true;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.a().addOnSuccessListener(this.executor, new ca.a(this, 20)).addOnFailureListener(this.executor, (OnFailureListener) new c(this, 23));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.b());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public sb.e<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a();
            return new sb.e<>();
        }
        f remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new sb.e<>(Boolean.valueOf(remoteConfigValue.e()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return new sb.e<>();
    }

    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public sb.e<Double> getDouble(String str) {
        if (str == null) {
            logger.a();
            return new sb.e<>();
        }
        f remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new sb.e<>(Double.valueOf(remoteConfigValue.c()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return new sb.e<>();
    }

    public sb.e<Long> getLong(String str) {
        if (str == null) {
            logger.a();
            return new sb.e<>();
        }
        f remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new sb.e<>(Long.valueOf(remoteConfigValue.b()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.d(), str);
                }
            }
        }
        return new sb.e<>();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getRemoteConfigValueOrDefault(java.lang.String r8, T r9) {
        /*
            r7 = this;
            vb.f r0 = r7.getRemoteConfigValue(r8)
            if (r0 == 0) goto L_0x006d
            r1 = 1
            r2 = 0
            boolean r3 = r9 instanceof java.lang.Boolean     // Catch:{ IllegalArgumentException -> 0x0051 }
            if (r3 == 0) goto L_0x0016
            boolean r3 = r0.e()     // Catch:{ IllegalArgumentException -> 0x0051 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0051 }
        L_0x0014:
            r9 = r8
            goto L_0x006d
        L_0x0016:
            boolean r3 = r9 instanceof java.lang.Double     // Catch:{ IllegalArgumentException -> 0x0051 }
            if (r3 == 0) goto L_0x0023
            double r3 = r0.c()     // Catch:{ IllegalArgumentException -> 0x0051 }
            java.lang.Double r8 = java.lang.Double.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0051 }
            goto L_0x0014
        L_0x0023:
            boolean r3 = r9 instanceof java.lang.Long     // Catch:{ IllegalArgumentException -> 0x0051 }
            if (r3 != 0) goto L_0x0048
            boolean r3 = r9 instanceof java.lang.Integer     // Catch:{ IllegalArgumentException -> 0x0051 }
            if (r3 == 0) goto L_0x002c
            goto L_0x0048
        L_0x002c:
            boolean r3 = r9 instanceof java.lang.String     // Catch:{ IllegalArgumentException -> 0x0051 }
            if (r3 == 0) goto L_0x0035
            java.lang.String r8 = r0.d()     // Catch:{ IllegalArgumentException -> 0x0051 }
            goto L_0x0014
        L_0x0035:
            java.lang.String r3 = r0.d()     // Catch:{ IllegalArgumentException -> 0x0051 }
            lb.a r4 = logger     // Catch:{ IllegalArgumentException -> 0x0046 }
            java.lang.String r5 = "No matching type found for the defaultValue: '%s', using String."
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IllegalArgumentException -> 0x0046 }
            r6[r2] = r9     // Catch:{ IllegalArgumentException -> 0x0046 }
            r4.b(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0046 }
            r9 = r3
            goto L_0x006d
        L_0x0046:
            r9 = r3
            goto L_0x0051
        L_0x0048:
            long r3 = r0.b()     // Catch:{ IllegalArgumentException -> 0x0051 }
            java.lang.Long r8 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0051 }
            goto L_0x0014
        L_0x0051:
            java.lang.String r3 = r0.d()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x006d
            lb.a r3 = logger
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.d()
            r4[r2] = r0
            r4[r1] = r8
            java.lang.String r8 = "Could not parse value: '%s' for key: '%s'."
            r3.b(r8, r4)
        L_0x006d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.getRemoteConfigValueOrDefault(java.lang.String, java.lang.Object):java.lang.Object");
    }

    public sb.e<String> getString(String str) {
        if (str == null) {
            logger.a();
            return new sb.e<>();
        }
        f remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return new sb.e<>(remoteConfigValue.d());
        }
        return new sb.e<>();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        b<h> bVar;
        h hVar;
        if (!(this.firebaseRemoteConfig != null || (bVar = this.firebaseRemoteConfigProvider) == null || (hVar = bVar.get()) == null)) {
            this.firebaseRemoteConfig = hVar.a(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        e eVar = this.firebaseRemoteConfig;
        if (eVar == null || eVar.d().f20487a == 1 || this.firebaseRemoteConfig.d().f20487a == 2) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(b<h> bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    @VisibleForTesting
    public void syncConfigValues(Map<String, f> map) {
        jb.d dVar;
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
        synchronized (jb.d.class) {
            if (jb.d.f11844b == null) {
                jb.d.f11844b = new jb.d();
            }
            dVar = jb.d.f11844b;
        }
        ConcurrentHashMap<String, f> concurrentHashMap = this.allRcConfigMap;
        dVar.getClass();
        f fVar = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (fVar != null) {
            try {
                this.cache.f("com.google.firebase.perf.ExperimentTTID", fVar.e());
            } catch (Exception unused) {
                logger.a();
            }
        } else {
            logger.a();
        }
    }

    @VisibleForTesting
    public RemoteConfigManager(v vVar, Executor executor2, e eVar, long j10, long j11) {
        ConcurrentHashMap<String, f> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = vVar;
        this.executor = executor2;
        this.firebaseRemoteConfig = eVar;
        if (eVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(eVar.b());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j11;
        this.appStartConfigFetchDelayInMs = j10;
    }
}
