package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzx extends zzz {
    public final /* synthetic */ zzl zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzx(zzy zzy, zzab zzab, CharSequence charSequence, zzl zzl) {
        super(zzab, charSequence);
        this.zza = zzl;
    }

    public final int zzc(int i10) {
        return ((zzo) this.zza).zza.end();
    }

    public final int zzd(int i10) {
        if (((zzo) this.zza).zza.find(i10)) {
            return ((zzo) this.zza).zza.start();
        }
        return -1;
    }
}