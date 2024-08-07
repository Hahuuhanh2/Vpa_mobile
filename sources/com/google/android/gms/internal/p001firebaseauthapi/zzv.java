package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
final class zzv extends zzz {
    public final /* synthetic */ zzw zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzv(zzw zzw, zzab zzab, CharSequence charSequence) {
        super(zzab, charSequence);
        this.zza = zzw;
    }

    public final int zzc(int i10) {
        return i10 + 1;
    }

    public final int zzd(int i10) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzu.zzb(i10, length, "index");
        while (i10 < length) {
            zzw zzw = this.zza;
            if (zzw.zza.zza(charSequence.charAt(i10))) {
                return i10;
            }
            i10++;
        }
        return -1;
    }
}
