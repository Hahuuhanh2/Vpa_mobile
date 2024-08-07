package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.text.TextUtils;
import m9.d;
import y6.j;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaen  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
public final class zzaen {
    private final Context zza;
    private zzafi zzb;
    private final String zzc;
    private final d zzd;
    private boolean zze = false;
    private String zzf;

    public zzaen(Context context, d dVar, String str) {
        j.f(context);
        this.zza = context;
        j.f(dVar);
        this.zzd = dVar;
        this.zzc = String.format("Android/%s/%s", new Object[]{"Fallback", str});
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x00aa A[SYNTHETIC, Splitter:B:16:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zza(java.net.URLConnection r5) {
        /*
            r4 = this;
            boolean r0 = r4.zze
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = r4.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "/FirebaseUI-Android"
            java.lang.String r0 = r0.concat(r1)
            goto L_0x001d
        L_0x0011:
            java.lang.String r0 = r4.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = "/FirebaseCore-Android"
            java.lang.String r0 = r0.concat(r1)
        L_0x001d:
            com.google.android.gms.internal.firebase-auth-api.zzafi r1 = r4.zzb
            if (r1 != 0) goto L_0x002e
            android.content.Context r1 = r4.zza
            com.google.android.gms.internal.firebase-auth-api.zzafi r2 = new com.google.android.gms.internal.firebase-auth-api.zzafi
            java.lang.String r3 = r1.getPackageName()
            r2.<init>(r1, r3)
            r4.zzb = r2
        L_0x002e:
            com.google.android.gms.internal.firebase-auth-api.zzafi r1 = r4.zzb
            java.lang.String r1 = r1.zzb()
            java.lang.String r2 = "X-Android-Package"
            r5.setRequestProperty(r2, r1)
            com.google.android.gms.internal.firebase-auth-api.zzafi r1 = r4.zzb
            java.lang.String r1 = r1.zza()
            java.lang.String r2 = "X-Android-Cert"
            r5.setRequestProperty(r2, r1)
            java.lang.String r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaeo.zza()
            java.lang.String r2 = "Accept-Language"
            r5.setRequestProperty(r2, r1)
            java.lang.String r1 = "X-Client-Version"
            r5.setRequestProperty(r1, r0)
            java.lang.String r0 = r4.zzf
            java.lang.String r1 = "X-Firebase-Locale"
            r5.setRequestProperty(r1, r0)
            m9.d r0 = r4.zzd
            r0.a()
            m9.e r0 = r0.f13220c
            java.lang.String r0 = r0.f13232b
            java.lang.String r1 = "X-Firebase-GMPID"
            r5.setRequestProperty(r1, r0)
            m9.d r0 = r4.zzd
            com.google.firebase.auth.FirebaseAuth r0 = com.google.firebase.auth.FirebaseAuth.getInstance(r0)
            za.b r0 = r0.f7486p
            java.lang.Object r0 = r0.get()
            xa.d r0 = (xa.d) r0
            r1 = 0
            if (r0 == 0) goto L_0x0093
            com.google.android.gms.tasks.Task r0 = r0.a()     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x0083 }
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x0083 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ ExecutionException -> 0x0085, InterruptedException -> 0x0083 }
            goto L_0x0094
        L_0x0083:
            r0 = move-exception
            goto L_0x0086
        L_0x0085:
            r0 = move-exception
        L_0x0086:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Unable to get heartbeats: "
            r2.concat(r0)
        L_0x0093:
            r0 = r1
        L_0x0094:
            java.lang.String r2 = "X-Firebase-Client"
            r5.setRequestProperty(r2, r0)
            m9.d r0 = r4.zzd
            com.google.firebase.auth.FirebaseAuth r0 = com.google.firebase.auth.FirebaseAuth.getInstance(r0)
            za.b r0 = r0.f7485o
            java.lang.Object r0 = r0.get()
            x9.a r0 = (x9.a) r0
            if (r0 != 0) goto L_0x00aa
            goto L_0x00d6
        L_0x00aa:
            com.google.android.gms.tasks.Task r0 = r0.a()     // Catch:{ ExecutionException -> 0x00c8, InterruptedException -> 0x00c6 }
            java.lang.Object r0 = com.google.android.gms.tasks.Tasks.await(r0)     // Catch:{ ExecutionException -> 0x00c8, InterruptedException -> 0x00c6 }
            s9.a r0 = (s9.a) r0     // Catch:{ ExecutionException -> 0x00c8, InterruptedException -> 0x00c6 }
            com.google.firebase.FirebaseException r2 = r0.a()     // Catch:{ ExecutionException -> 0x00c8, InterruptedException -> 0x00c6 }
            if (r2 == 0) goto L_0x00c1
            com.google.firebase.FirebaseException r2 = r0.a()     // Catch:{ ExecutionException -> 0x00c8, InterruptedException -> 0x00c6 }
            java.lang.String.valueOf(r2)     // Catch:{ ExecutionException -> 0x00c8, InterruptedException -> 0x00c6 }
        L_0x00c1:
            java.lang.String r0 = r0.b()     // Catch:{ ExecutionException -> 0x00c8, InterruptedException -> 0x00c6 }
            goto L_0x00d7
        L_0x00c6:
            r0 = move-exception
            goto L_0x00c9
        L_0x00c8:
            r0 = move-exception
        L_0x00c9:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Unexpected error getting App Check token: "
            r2.concat(r0)
        L_0x00d6:
            r0 = r1
        L_0x00d7:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x00e2
            java.lang.String r2 = "X-Firebase-AppCheck"
            r5.setRequestProperty(r2, r0)
        L_0x00e2:
            r4.zzf = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzaen.zza(java.net.URLConnection):void");
    }

    public final void zzb(String str) {
        this.zze = !TextUtils.isEmpty(str);
    }

    public final void zzc(String str) {
        this.zzf = str;
    }
}
