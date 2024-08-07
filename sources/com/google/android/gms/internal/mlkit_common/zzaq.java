package com.google.android.gms.internal.mlkit_common;

/* compiled from: com.google.mlkit:common@@18.7.0 */
final class zzaq extends zzar {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzar zzc;

    public zzaq(zzar zzar, int i10, int i11) {
        this.zzc = zzar;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzaf.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    public final int size() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    public final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    public final Object[] zze() {
        return this.zzc.zze();
    }

    /* renamed from: zzf */
    public final zzar subList(int i10, int i11) {
        zzaf.zzd(i10, i11, this.zzb);
        zzar zzar = this.zzc;
        int i12 = this.zza;
        return zzar.subList(i10 + i12, i11 + i12);
    }
}
