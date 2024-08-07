package com.google.android.gms.internal.common;

/* compiled from: com.google.android.gms:play-services-basement@@18.3.0 */
abstract class zzw extends zzj {
    public final CharSequence zzb;
    public final zzo zzc;
    public final boolean zzd;
    public int zze = 0;
    public int zzf;

    public zzw(zzx zzx, CharSequence charSequence) {
        this.zzc = zzx.zza;
        this.zzd = zzx.zzb;
        this.zzf = Integer.MAX_VALUE;
        this.zzb = charSequence;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        int zzd2;
        int i10;
        int i11 = this.zze;
        while (true) {
            int i12 = this.zze;
            if (i12 != -1) {
                zzd2 = zzd(i12);
                if (zzd2 == -1) {
                    zzd2 = this.zzb.length();
                    this.zze = -1;
                    i10 = -1;
                } else {
                    i10 = zzc(zzd2);
                    this.zze = i10;
                }
                if (i10 == i11) {
                    int i13 = i10 + 1;
                    this.zze = i13;
                    if (i13 > this.zzb.length()) {
                        this.zze = -1;
                    }
                } else {
                    if (i11 < zzd2) {
                        this.zzb.charAt(i11);
                    }
                    if (i11 < zzd2) {
                        this.zzb.charAt(zzd2 - 1);
                    }
                    if (!this.zzd || i11 != zzd2) {
                        int i14 = this.zzf;
                    } else {
                        i11 = this.zze;
                    }
                }
            } else {
                zzb();
                return null;
            }
        }
        int i142 = this.zzf;
        if (i142 == 1) {
            zzd2 = this.zzb.length();
            this.zze = -1;
            if (zzd2 > i11) {
                this.zzb.charAt(zzd2 - 1);
            }
        } else {
            this.zzf = i142 - 1;
        }
        return this.zzb.subSequence(i11, zzd2).toString();
    }

    public abstract int zzc(int i10);

    public abstract int zzd(int i10);
}