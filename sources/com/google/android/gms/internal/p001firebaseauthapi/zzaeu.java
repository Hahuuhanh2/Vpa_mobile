package com.google.android.gms.internal.p001firebaseauthapi;

import aa.c;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaeu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzaeu implements zzaex {
    public final /* synthetic */ Status zza;

    public zzaeu(zzaew zzaew, Status status) {
        this.zza = status;
    }

    public final void zza(c cVar, Object... objArr) {
        cVar.onVerificationFailed(zzadz.zza(this.zza));
    }
}
