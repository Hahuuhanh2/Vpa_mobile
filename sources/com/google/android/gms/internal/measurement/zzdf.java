package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.dynamite.DynamiteModule;
import h7.c;
import h7.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import m7.a;
import n7.b;
import y6.j;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
public class zzdf {
    private static volatile zzdf zzb;
    public final c zza;
    /* access modifiers changed from: private */
    public final String zzc;
    private final ExecutorService zzd;
    private final a zze;
    private final List<Pair<b, zzb>> zzf;
    private int zzg;
    /* access modifiers changed from: private */
    public boolean zzh;
    private String zzi;
    /* access modifiers changed from: private */
    public volatile zzcu zzj;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    public abstract class zza implements Runnable {
        public final long zza;
        public final long zzb;
        private final boolean zzc;

        public zza(zzdf zzdf) {
            this(true);
        }

        public void run() {
            if (zzdf.this.zzh) {
                zzb();
                return;
            }
            try {
                zza();
            } catch (Exception e10) {
                zzdf.this.zza(e10, false, this.zzc);
                zzb();
            }
        }

        public abstract void zza();

        public void zzb() {
        }

        public zza(boolean z10) {
            ((d) zzdf.this.zza).getClass();
            this.zza = System.currentTimeMillis();
            ((d) zzdf.this.zza).getClass();
            this.zzb = SystemClock.elapsedRealtime();
            this.zzc = z10;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    public static class zzb extends zzcz {
        private final b zza;

        public zzb(b bVar) {
            this.zza = bVar;
        }

        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        public final void zza(String str, String str2, Bundle bundle, long j10) {
            this.zza.a(str, str2, bundle, j10);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    public static class zzc extends zzcz {
        private final n7.c zza;

        public zzc(n7.c cVar) {
            this.zza = cVar;
        }

        public final int zza() {
            return System.identityHashCode(this.zza);
        }

        public final void zza(String str, String str2, Bundle bundle, long j10) {
            this.zza.a();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.5.1 */
    public class zzd implements Application.ActivityLifecycleCallbacks {
        public zzd() {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            zzdf.this.zza((zza) new zzeo(this, bundle, activity));
        }

        public final void onActivityDestroyed(Activity activity) {
            zzdf.this.zza((zza) new zzet(this, activity));
        }

        public final void onActivityPaused(Activity activity) {
            zzdf.this.zza((zza) new zzes(this, activity));
        }

        public final void onActivityResumed(Activity activity) {
            zzdf.this.zza((zza) new zzep(this, activity));
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            zzcs zzcs = new zzcs();
            zzdf.this.zza((zza) new zzeu(this, activity, zzcs));
            Bundle zza2 = zzcs.zza(50);
            if (zza2 != null) {
                bundle.putAll(zza2);
            }
        }

        public final void onActivityStarted(Activity activity) {
            zzdf.this.zza((zza) new zzeq(this, activity));
        }

        public final void onActivityStopped(Activity activity) {
            zzdf.this.zza((zza) new zzer(this, activity));
        }
    }

    private zzdf(Context context, String str, String str2, String str3, Bundle bundle) {
        boolean z10;
        if (str == null || !zzc(str2, str3)) {
            this.zzc = "FA";
        } else {
            this.zzc = str;
        }
        this.zza = d.f10614e;
        this.zzd = zzch.zza().zza(new zzdr(this), zzcq.zza);
        this.zze = new a(this);
        this.zzf = new ArrayList();
        if (!zzb(context) || zzk()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            this.zzi = null;
            this.zzh = true;
            return;
        }
        if (!zzc(str2, str3)) {
            this.zzi = "fa";
        } else {
            this.zzi = str2;
        }
        zza((zza) new zzdi(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new zzd());
        }
    }

    private final boolean zzk() {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, getClass().getClassLoader());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final int zza(String str) {
        zzcs zzcs = new zzcs();
        zza((zza) new zzed(this, str, zzcs));
        Integer num = (Integer) zzcs.zza(zzcs.zza(10000), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final a zzb() {
        return this.zze;
    }

    public final Long zzc() {
        zzcs zzcs = new zzcs();
        zza((zza) new zzef(this, zzcs));
        return zzcs.zzb(120000);
    }

    public final String zzd() {
        return this.zzi;
    }

    public final String zze() {
        zzcs zzcs = new zzcs();
        zza((zza) new zzeg(this, zzcs));
        return zzcs.zzc(120000);
    }

    public final String zzf() {
        zzcs zzcs = new zzcs();
        zza((zza) new zzdv(this, zzcs));
        return zzcs.zzc(50);
    }

    public final String zzg() {
        zzcs zzcs = new zzcs();
        zza((zza) new zzea(this, zzcs));
        return zzcs.zzc(500);
    }

    public final String zzh() {
        zzcs zzcs = new zzcs();
        zza((zza) new zzdx(this, zzcs));
        return zzcs.zzc(500);
    }

    public final String zzi() {
        zzcs zzcs = new zzcs();
        zza((zza) new zzdw(this, zzcs));
        return zzcs.zzc(500);
    }

    public final void zzj() {
        zza((zza) new zzdp(this));
    }

    public final void zzb(String str) {
        zza((zza) new zzdu(this, str));
    }

    public final void zzd(Bundle bundle) {
        zza((zza) new zzek(this, bundle));
    }

    public final void zzb(String str, String str2, Bundle bundle) {
        zza(str, str2, bundle, true, true, (Long) null);
    }

    public final void zzd(String str) {
        zza((zza) new zzdm(this, str));
    }

    public final void zzb(Bundle bundle) {
        zza((zza) new zzdn(this, bundle));
    }

    public final void zzc(String str) {
        zza((zza) new zzdt(this, str));
    }

    public final long zza() {
        zzcs zzcs = new zzcs();
        zza((zza) new zzdy(this, zzcs));
        Long zzb2 = zzcs.zzb(500);
        if (zzb2 != null) {
            return zzb2.longValue();
        }
        long nanoTime = System.nanoTime();
        ((d) this.zza).getClass();
        long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
        int i10 = this.zzg + 1;
        this.zzg = i10;
        return nextLong + ((long) i10);
    }

    public final void zzb(String str, String str2) {
        zza((String) null, str, (Object) str2, false);
    }

    public final void zzc(Bundle bundle) {
        zza((zza) new zzdq(this, bundle));
    }

    /* access modifiers changed from: private */
    public final boolean zzc(String str, String str2) {
        return (str2 == null || str == null || zzk()) ? false : true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        if (r3.zzj == null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3.zzj.unregisterOnMeasurementEventListener(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0043, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        zza((com.google.android.gms.internal.measurement.zzdf.zza) new com.google.android.gms.internal.measurement.zzem(r3, r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzb(n7.b r4) {
        /*
            r3 = this;
            y6.j.f(r4)
            java.util.List<android.util.Pair<n7.b, com.google.android.gms.internal.measurement.zzdf$zzb>> r0 = r3.zzf
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List<android.util.Pair<n7.b, com.google.android.gms.internal.measurement.zzdf$zzb>> r2 = r3.zzf     // Catch:{ all -> 0x004d }
            int r2 = r2.size()     // Catch:{ all -> 0x004d }
            if (r1 >= r2) goto L_0x002b
            java.util.List<android.util.Pair<n7.b, com.google.android.gms.internal.measurement.zzdf$zzb>> r2 = r3.zzf     // Catch:{ all -> 0x004d }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x004d }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x004d }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x004d }
            boolean r2 = r4.equals(r2)     // Catch:{ all -> 0x004d }
            if (r2 == 0) goto L_0x0028
            java.util.List<android.util.Pair<n7.b, com.google.android.gms.internal.measurement.zzdf$zzb>> r4 = r3.zzf     // Catch:{ all -> 0x004d }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x004d }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x004d }
            goto L_0x002c
        L_0x0028:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x002b:
            r4 = 0
        L_0x002c:
            if (r4 != 0) goto L_0x0030
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x0030:
            java.util.List<android.util.Pair<n7.b, com.google.android.gms.internal.measurement.zzdf$zzb>> r1 = r3.zzf     // Catch:{ all -> 0x004d }
            r1.remove(r4)     // Catch:{ all -> 0x004d }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x004d }
            com.google.android.gms.internal.measurement.zzdf$zzb r4 = (com.google.android.gms.internal.measurement.zzdf.zzb) r4     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            com.google.android.gms.internal.measurement.zzcu r0 = r3.zzj
            if (r0 == 0) goto L_0x0044
            com.google.android.gms.internal.measurement.zzcu r0 = r3.zzj     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0044 }
            r0.unregisterOnMeasurementEventListener(r4)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x0044 }
            return
        L_0x0044:
            com.google.android.gms.internal.measurement.zzem r0 = new com.google.android.gms.internal.measurement.zzem
            r0.<init>(r3, r4)
            r3.zza((com.google.android.gms.internal.measurement.zzdf.zza) r0)
            return
        L_0x004d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdf.zzb(n7.b):void");
    }

    public final Bundle zza(Bundle bundle, boolean z10) {
        zzcs zzcs = new zzcs();
        zza((zza) new zzeb(this, bundle, zzcs));
        if (z10) {
            return zzcs.zza(5000);
        }
        return null;
    }

    public final zzcu zza(Context context, boolean z10) {
        try {
            return zzct.asInterface(DynamiteModule.c(context, DynamiteModule.f5526d, "com.google.android.gms.measurement.dynamite").b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.LoadingException e10) {
            zza((Exception) e10, true, false);
            return null;
        }
    }

    private static boolean zzb(Context context) {
        try {
            String a10 = n7.a.a(context);
            Resources resources = context.getResources();
            if (TextUtils.isEmpty(a10)) {
                a10 = n7.a.a(context);
            }
            int identifier = resources.getIdentifier("google_app_id", "string", a10);
            String str = null;
            if (identifier != 0) {
                try {
                    str = resources.getString(identifier);
                } catch (Resources.NotFoundException unused) {
                }
            }
            if (str != null) {
                return true;
            }
            return false;
        } catch (IllegalStateException unused2) {
        }
    }

    public static zzdf zza(Context context) {
        return zza(context, (String) null, (String) null, (String) null, (Bundle) null);
    }

    public static zzdf zza(Context context, String str, String str2, String str3, Bundle bundle) {
        j.f(context);
        if (zzb == null) {
            synchronized (zzdf.class) {
                if (zzb == null) {
                    zzb = new zzdf(context, str, str2, str3, bundle);
                }
            }
        }
        return zzb;
    }

    public final Object zza(int i10) {
        zzcs zzcs = new zzcs();
        zza((zza) new zzei(this, zzcs, i10));
        return zzcs.zza(zzcs.zza(15000), Object.class);
    }

    public final List<Bundle> zza(String str, String str2) {
        zzcs zzcs = new zzcs();
        zza((zza) new zzdj(this, str, str2, zzcs));
        List<Bundle> list = (List) zzcs.zza(zzcs.zza(5000), List.class);
        return list == null ? Collections.emptyList() : list;
    }

    public final Map<String, Object> zza(String str, String str2, boolean z10) {
        zzcs zzcs = new zzcs();
        zza((zza) new zzdz(this, str, str2, z10, zzcs));
        Bundle zza2 = zzcs.zza(5000);
        if (zza2 == null || zza2.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap(zza2.size());
        for (String next : zza2.keySet()) {
            Object obj = zza2.get(next);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                hashMap.put(next, obj);
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: private */
    public final void zza(Exception exc, boolean z10, boolean z11) {
        this.zzh |= z10;
        if (!z10 && z11) {
            zza(5, "Error with data collection. Data lost.", (Object) exc, (Object) null, (Object) null);
        }
    }

    public final void zza(String str, String str2, Bundle bundle) {
        zza((zza) new zzdk(this, str, str2, bundle));
    }

    public final void zza(String str, Bundle bundle) {
        zza((String) null, str, bundle, false, true, (Long) null);
    }

    public final void zza(String str, String str2, Bundle bundle, long j10) {
        zza(str, str2, bundle, true, false, Long.valueOf(j10));
    }

    private final void zza(String str, String str2, Bundle bundle, boolean z10, boolean z11, Long l10) {
        zza((zza) new zzel(this, l10, str, str2, bundle, z10, z11));
    }

    public final void zza(int i10, String str, Object obj, Object obj2, Object obj3) {
        zza((zza) new zzec(this, false, 5, str, obj, (Object) null, (Object) null));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0036, code lost:
        if (r4.zzj == null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.zzj.registerOnMeasurementEventListener(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        zza((com.google.android.gms.internal.measurement.zzdf.zza) new com.google.android.gms.internal.measurement.zzej(r4, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(n7.b r5) {
        /*
            r4 = this;
            y6.j.f(r5)
            java.util.List<android.util.Pair<n7.b, com.google.android.gms.internal.measurement.zzdf$zzb>> r0 = r4.zzf
            monitor-enter(r0)
            r1 = 0
        L_0x0007:
            java.util.List<android.util.Pair<n7.b, com.google.android.gms.internal.measurement.zzdf$zzb>> r2 = r4.zzf     // Catch:{ all -> 0x0047 }
            int r2 = r2.size()     // Catch:{ all -> 0x0047 }
            if (r1 >= r2) goto L_0x0024
            java.util.List<android.util.Pair<n7.b, com.google.android.gms.internal.measurement.zzdf$zzb>> r2 = r4.zzf     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.get(r1)     // Catch:{ all -> 0x0047 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0047 }
            java.lang.Object r2 = r2.first     // Catch:{ all -> 0x0047 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0047 }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            return
        L_0x0021:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x0024:
            com.google.android.gms.internal.measurement.zzdf$zzb r1 = new com.google.android.gms.internal.measurement.zzdf$zzb     // Catch:{ all -> 0x0047 }
            r1.<init>(r5)     // Catch:{ all -> 0x0047 }
            java.util.List<android.util.Pair<n7.b, com.google.android.gms.internal.measurement.zzdf$zzb>> r2 = r4.zzf     // Catch:{ all -> 0x0047 }
            android.util.Pair r3 = new android.util.Pair     // Catch:{ all -> 0x0047 }
            r3.<init>(r5, r1)     // Catch:{ all -> 0x0047 }
            r2.add(r3)     // Catch:{ all -> 0x0047 }
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            com.google.android.gms.internal.measurement.zzcu r5 = r4.zzj
            if (r5 == 0) goto L_0x003e
            com.google.android.gms.internal.measurement.zzcu r5 = r4.zzj     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x003e }
            r5.registerOnMeasurementEventListener(r1)     // Catch:{ BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException -> 0x003e }
            return
        L_0x003e:
            com.google.android.gms.internal.measurement.zzej r5 = new com.google.android.gms.internal.measurement.zzej
            r5.<init>(r4, r1)
            r4.zza((com.google.android.gms.internal.measurement.zzdf.zza) r5)
            return
        L_0x0047:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0047 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzdf.zza(n7.b):void");
    }

    /* access modifiers changed from: private */
    public final void zza(zza zza2) {
        this.zzd.execute(zza2);
    }

    public final void zza(Bundle bundle) {
        zza((zza) new zzdh(this, bundle));
    }

    public final void zza(Activity activity, String str, String str2) {
        zza((zza) new zzdl(this, activity, str, str2));
    }

    public final void zza(boolean z10) {
        zza((zza) new zzeh(this, z10));
    }

    public final void zza(n7.c cVar) {
        zzc zzc2 = new zzc(cVar);
        if (this.zzj != null) {
            try {
                this.zzj.setEventInterceptor(zzc2);
                return;
            } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
            }
        }
        zza((zza) new zzee(this, zzc2));
    }

    public final void zza(Boolean bool) {
        zza((zza) new zzdo(this, bool));
    }

    public final void zza(long j10) {
        zza((zza) new zzds(this, j10));
    }

    public final void zza(String str, String str2, Object obj, boolean z10) {
        zza((zza) new zzen(this, str, str2, obj, z10));
    }
}
