package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.1.2 */
abstract class zzz extends zzd {
    public final CharSequence zzb;
    public final zzj zzc;
    public int zzd = 0;
    public int zze;

    public zzz(zzab zzab, CharSequence charSequence) {
        this.zzc = zzab.zza;
        this.zze = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        int i10;
        int i11 = this.zzd;
        while (true) {
            int i12 = this.zzd;
            if (i12 != -1) {
                int zzd2 = zzd(i12);
                if (zzd2 == -1) {
                    zzd2 = this.zzb.length();
                    this.zzd = -1;
                    i10 = -1;
                } else {
                    i10 = zzc(zzd2);
                    this.zzd = i10;
                }
                if (i10 == i11) {
                    int i13 = i10 + 1;
                    this.zzd = i13;
                    if (i13 > this.zzb.length()) {
                        this.zzd = -1;
                    }
                } else {
                    if (i11 < zzd2) {
                        this.zzb.charAt(i11);
                    }
                    if (i11 < zzd2) {
                        this.zzb.charAt(zzd2 - 1);
                    }
                    int i14 = this.zze;
                    if (i14 == 1) {
                        zzd2 = this.zzb.length();
                        this.zzd = -1;
                        if (zzd2 > i11) {
                            this.zzb.charAt(zzd2 - 1);
                        }
                    } else {
                        this.zze = i14 - 1;
                    }
                    return this.zzb.subSequence(i11, zzd2).toString();
                }
            } else {
                zzb();
                return null;
            }
        }
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}