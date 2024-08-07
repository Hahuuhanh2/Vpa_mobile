package com.google.android.gms.internal.mlkit_vision_common;

/* compiled from: com.google.mlkit:vision-common@@17.3.0 */
final class zzo extends zzp {
    public final transient int zza;
    public final transient int zzb;
    public final /* synthetic */ zzp zzc;

    public zzo(zzp zzp, int i10, int i11) {
        this.zzc = zzp;
        this.zza = i10;
        this.zzb = i11;
    }

    public final Object get(int i10) {
        zzf.zza(i10, this.zzb, "index");
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
    public final zzp subList(int i10, int i11) {
        zzf.zzc(i10, i11, this.zzb);
        zzp zzp = this.zzc;
        int i12 = this.zza;
        return zzp.subList(i10 + i12, i11 + i12);
    }
}
