package com.google.android.gms.internal.p001firebaseauthapi;

import aa.c;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaev  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaev implements Runnable {
    public final /* synthetic */ zzaex zza;
    public final /* synthetic */ zzaew zzb;

    public zzaev(zzaew zzaew, zzaex zzaex) {
        this.zzb = zzaew;
        this.zza = zzaex;
    }

    public final void run() {
        synchronized (this.zzb.zza.zzl) {
            if (!this.zzb.zza.zzl.isEmpty()) {
                this.zza.zza((c) this.zzb.zza.zzl.get(0), new Object[0]);
            }
        }
    }
}
